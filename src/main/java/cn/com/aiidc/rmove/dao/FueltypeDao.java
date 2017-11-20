package cn.com.aiidc.rmove.dao;

import cn.com.aiidc.rmove.entity.FuelType;
import org.springframework.data.jpa.domain.Specification;

/**
 * Created by Zhangx on 2017/11/16 at 14:14.
 */
public interface FueltypeDao extends BaseDao<FuelType,String>
{
    @Override
    FuelType findOne(Specification<FuelType> specification);
}
