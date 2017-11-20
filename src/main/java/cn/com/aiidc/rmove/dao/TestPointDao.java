package cn.com.aiidc.rmove.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import cn.com.aiidc.rmove.entity.TestPoint;

public interface TestPointDao extends BaseDao<TestPoint,Long>{
    @Query("select t from TestPoint t where t.province=?1 and t.city=?2")
	List<TestPoint> getAllTestPoint(String province, String city);

	List<TestPoint> findByProvince(String province);

	List<TestPoint> findByCity(String city);

	List<TestPoint> findByProvinceAndCity(String province, String city);


}
