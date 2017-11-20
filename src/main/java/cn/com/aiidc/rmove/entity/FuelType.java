package cn.com.aiidc.rmove.entity;

import javax.persistence.*;

/**
 * Created by Zhangx on 2017/11/16 at 14:10.
 */
@Entity
@Table(name = "FUEL_TYPE", schema = "EPUSER", catalog = "")
public class FuelType
{
    private long id;
    private String fuelTypeName;
    private String fuelTypeCode;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    @Basic
    @Column(name = "FUEL_TYPE_NAME", nullable = true, length = 20)
    public String getFuelTypeName()
    {
        return fuelTypeName;
    }

    public void setFuelTypeName(String fuelTypeName)
    {
        this.fuelTypeName = fuelTypeName;
    }

    @Basic
    @Column(name = "FUEL_TYPE_CODE", nullable = true, length = 20)
    public String getFuelTypeCode()
    {
        return fuelTypeCode;
    }

    public void setFuelTypeCode(String fuelTypeCode)
    {
        this.fuelTypeCode = fuelTypeCode;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FuelType fuelType = (FuelType) o;

        if (id != fuelType.id) return false;
        if (fuelTypeName != null ? !fuelTypeName.equals(fuelType.fuelTypeName) : fuelType.fuelTypeName != null)
            return false;
        if (fuelTypeCode != null ? !fuelTypeCode.equals(fuelType.fuelTypeCode) : fuelType.fuelTypeCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (fuelTypeName != null ? fuelTypeName.hashCode() : 0);
        result = 31 * result + (fuelTypeCode != null ? fuelTypeCode.hashCode() : 0);
        return result;
    }
}
