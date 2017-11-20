package cn.com.aiidc.rmove.dao;

import cn.com.aiidc.rmove.entity.Area;

/**
 * Created by Zhangx on 2017/11/18 at 17:41.
 */
public interface AreaDao extends BaseDao<Area,String>
{

    Area findByAreaId(String id);
}
