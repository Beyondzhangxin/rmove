package cn.com.aiidc.rmove.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cn.com.aiidc.rmove.entity.Telemetry;

public interface TelemetryDao extends BaseDao<Telemetry,String> {

	Telemetry findByTestNo(String testNo);
	/**通过时间范围和点位id来搜索所有符合条件的记录*/
    @Query("select t from Telemetry t where t.testDate>:start and t.testDate<:end and testPointId in :pointIds")
	List<Telemetry> findByTestDateBetweenIn(@Param("start")Date start, @Param("end")Date end,@Param("pointIds")List<Long> pointIds);
    /**通过时间范围和点位id来搜索所有符合条件有效的记录*/
    @Query("select t from Telemetry t where t.testDate>:start and t.testDate<:end and testPointId in :pointIds and result=1")
    List<Telemetry> findByTestDateBetweenInyx(@Param("start")Date start, @Param("end")Date end,@Param("pointIds")List<Long> pointIds);
    /**查询黄标车*/
    @Query("select t from Telemetry t where t.testDate>:start and t.testDate<:end and testPointId in :pointIds and result=1 and license_type=2")
    List<Telemetry> findByTestDateBetweenInhb(@Param("start")Date start, @Param("end")Date end,@Param("pointIds")List<Long> pointIds);
     
	List<Telemetry> findByTestPointIdIn(List<Long> name);

}
