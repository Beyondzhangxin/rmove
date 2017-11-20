package cn.com.aiidc.rmove.dao;

import cn.com.aiidc.rmove.entity.OverPollution;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface OverPollutionDao extends BaseDao<OverPollution, String>
{
    @Query("select p from OverPollution p where p.testPointId=?1 order by p.testDate desc")

    List<OverPollution> findByTestPointId(Long id);
    //select p from OverPollution p where to_char(p.testDate,'dd')=to_char(sysdate,'dd') order by p.testDate desc
    @Query("select p from OverPollution p order by p.testDate desc")
    List<OverPollution> findIntoday();
    //根据时间，ids查询所有的污染记录
    @Query("select t from OverPollution t where t.testDate>:start and t.testDate<:end and testPointId in :pointIds")
   	List<OverPollution> findByTestDateBetweenId(@Param("start")Date start, @Param("end")Date end,@Param("pointIds")List<Long> pointIds);
    
    //查询各项超标的表
    @Query("select t from OverPollution t where t.testDate>:start and t.testDate<:end and testPointId in :pointIds and co is not null")
   	List<OverPollution> co(@Param("start")Date start, @Param("end")Date end,@Param("pointIds")List<Long> pointIds);
    @Query("select t from OverPollution t where t.testDate>:start and t.testDate<:end and testPointId in :pointIds and hc is not null")
    List<OverPollution> hc(@Param("start")Date start, @Param("end")Date end,@Param("pointIds")List<Long> pointIds);
    @Query("select t from OverPollution t where t.testDate>:start and t.testDate<:end and testPointId in :pointIds and nox is not null")
    List<OverPollution> nox(@Param("start")Date start, @Param("end")Date end, @Param("pointIds")List<Long> pointIds);
    @Query("select t from OverPollution t where t.testDate>:start and t.testDate<:end and testPointId in :pointIds and pm is not null")
    List<OverPollution> pm(@Param("start")Date start, @Param("end")Date end,@Param("pointIds")List<Long> pointIds);

}
