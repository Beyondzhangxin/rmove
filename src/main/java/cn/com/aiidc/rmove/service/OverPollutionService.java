package cn.com.aiidc.rmove.service;

import cn.com.aiidc.rmove.dao.AreaDao;
import cn.com.aiidc.rmove.dao.JOverPollutionDao;
import cn.com.aiidc.rmove.dao.VehicleTypeDao;
import cn.com.aiidc.rmove.entity.Area;
import cn.com.aiidc.rmove.entity.OverPollutionData;
import cn.com.aiidc.rmove.entity.VehicleInfo;
import cn.com.aiidc.rmove.entity.VehicleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Zhangx on 2017/11/16 at 11:28.
 */
@Service
public class OverPollutionService
{
    @Autowired
    private JOverPollutionDao jOverPollutionDao;

    @Autowired
    private AreaDao areaDao;

    @Autowired
    private VehicleTypeDao vehicleTypeDao;

    public List<OverPollutionData> findByFuelType(String areaId, Date startDate, Date endDate, String vehicleType, String pollutionType)
    {
        List<OverPollutionData> dataList = jOverPollutionDao.findAll(new Specification<OverPollutionData>()
        {
            @Override
            public Predicate toPredicate(Root<OverPollutionData> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder)
            {
                Join<OverPollutionData, VehicleInfo> join = root.join("vehicle", JoinType.LEFT);
                Path<Area> path = join.get("area");
//                Path<Date> testDate = root.get("testDate");
                Path<Object> type = join.get("vehicleType");
                VehicleType vehicleType1 = vehicleTypeDao.findByVehicleTypeCode(vehicleType);
                Path<Object> objectPath = root.get(pollutionType);
                Area area = areaDao.findByAreaId(areaId);
                Predicate and = criteriaBuilder.and(criteriaBuilder.equal(path, area), criteriaBuilder.equal(type, vehicleType1), criteriaBuilder.isNotNull(objectPath));
                criteriaQuery.where(and);
                return criteriaQuery.getRestriction();
            }
        });
        return dataList;
    }

}
