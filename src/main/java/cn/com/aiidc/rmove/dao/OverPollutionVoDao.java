package cn.com.aiidc.rmove.dao;

import cn.com.aiidc.rmove.entity.OverPollutionVO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Zhangx on 2017/11/17 at 14:33.
 */
public interface OverPollutionVoDao extends BaseDao<OverPollutionVO, String>
{
    String sql = "select f.FUEL_TYPE_NAME fuelTypeName, count(*) num from OVER_POLLUTION_DATA o,VEHICLE_INFO v,FUEL_TYPE f " +
            " where o.LICENSE=v.LICENSE and o.CO>0 and AREA=:areaId and v.FUEL_TYPE = f.FUEL_TYPE_CODE GROUP BY f.FUEL_TYPE_NAME";

    @Query(value = sql, nativeQuery = true)
    List<OverPollutionVO> countCoOverPolluted(@Param("areaId") String areaId);

    @Query("select f.fuelTypeName as fuelTypeName,count(*) as aa  from OverPollution p ,Area a,Vehicle v, FuelType f  where v.fuelType=f.fuelTypeCode and p.license= v.license  and" +
            " v.area = ?1 and p.testDate < ?2 and v.vehicleType = ?3 and p.hc>0 group by f.fuelTypeName")
    List<Map<?, ?>> countHcOverPolluted(String areaId, Date testDate, String vehicleType);

    @Query("select f.fuelTypeName as fuelTypeName,count(*) as aa  from OverPollution p ,Area a,Vehicle v, FuelType f  where v.fuelType=f.fuelTypeCode and p.license= v.license  and" +
            " v.area = ?1 and p.testDate < ?2 and v.vehicleType = ?3 and p.nox>0 group by f.fuelTypeName")
    List<Map<?, ?>> countNoxOverPolluted(String areaId, Date testDate, String vehicleType);

    @Query("select f.fuelTypeName as fuelTypeName,count(*) as aa  from OverPollution p ,Area a,Vehicle v, FuelType f where v.fuelType=f.fuelTypeCode and p.license= v.license  and" +
            " v.area = ?1 and p.testDate < ?2 and v.vehicleType = ?3 and p.pm>0 group by f.fuelTypeName")
    List<Map<?, ?>> countPmOverPolluted(String areaId, Date testDate, String vehicleType);

}
