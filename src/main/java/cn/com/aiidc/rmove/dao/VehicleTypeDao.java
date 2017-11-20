package cn.com.aiidc.rmove.dao;

import cn.com.aiidc.rmove.entity.VehicleType;

/**
 * Created by Zhangx on 2017/11/19 at 13:33.
 */
public interface VehicleTypeDao extends BaseDao<VehicleType,String>
{
    VehicleType findByVehicleTypeCode(String vehicleTypeCode);
}
