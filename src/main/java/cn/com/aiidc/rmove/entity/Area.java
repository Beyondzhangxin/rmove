package cn.com.aiidc.rmove.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Zhangx on 2017/11/16 at 10:20.
 */
@Entity
@Table(name = "area")
public class Area  implements Serializable
{
    private String areaId;
    private String areaNm;
    private String provId;
    private String cityId;
    private String countyId;
    private String fullNm;

    @Id
    @Column(name = "AREA_ID", nullable = false, length = 6)
    public String getAreaId()
    {
        return areaId;
    }

    public void setAreaId(String areaId)
    {
        this.areaId = areaId;
    }

    @Basic
    @Column(name = "AREA_NM", nullable = true, length = 60)
    public String getAreaNm()
    {
        return areaNm;
    }

    public void setAreaNm(String areaNm)
    {
        this.areaNm = areaNm;
    }

    @Basic
    @Column(name = "PROV_ID", nullable = true, length = 2)
    public String getProvId()
    {
        return provId;
    }

    public void setProvId(String provId)
    {
        this.provId = provId;
    }

    @Basic
    @Column(name = "CITY_ID", nullable = true, length = 2)
    public String getCityId()
    {
        return cityId;
    }

    public void setCityId(String cityId)
    {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "COUNTY_ID", nullable = true, length = 2)
    public String getCountyId()
    {
        return countyId;
    }

    public void setCountyId(String countyId)
    {
        this.countyId = countyId;
    }

    @Basic
    @Column(name = "FULL_NM", nullable = true, length = 120)
    public String getFullNm()
    {
        return fullNm;
    }

    public void setFullNm(String fullNm)
    {
        this.fullNm = fullNm;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Area area = (Area) o;

        if (areaId != null ? !areaId.equals(area.areaId) : area.areaId != null) return false;
        if (areaNm != null ? !areaNm.equals(area.areaNm) : area.areaNm != null) return false;
        if (provId != null ? !provId.equals(area.provId) : area.provId != null) return false;
        if (cityId != null ? !cityId.equals(area.cityId) : area.cityId != null) return false;
        if (countyId != null ? !countyId.equals(area.countyId) : area.countyId != null) return false;
        if (fullNm != null ? !fullNm.equals(area.fullNm) : area.fullNm != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = areaId != null ? areaId.hashCode() : 0;
        result = 31 * result + (areaNm != null ? areaNm.hashCode() : 0);
        result = 31 * result + (provId != null ? provId.hashCode() : 0);
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        result = 31 * result + (countyId != null ? countyId.hashCode() : 0);
        result = 31 * result + (fullNm != null ? fullNm.hashCode() : 0);
        return result;
    }
}
