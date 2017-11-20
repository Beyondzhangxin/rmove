package cn.com.aiidc.rmove.entity;

import javax.persistence.*;

/**
 * Created by Zhangx on 2017/11/18 at 15:46.
 */
@Entity
@Table(name = "VEHICLE_TYPE", schema = "EPUSER", catalog = "")
public class VehicleType
{
    private long id;
    private String vehicleTypeName;
    private String vehicleTypeCode;

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
    @Column(name = "VEHICLE_TYPE_NAME", nullable = true, length = 20)
    public String getVehicleTypeName()
    {
        return vehicleTypeName;
    }

    public void setVehicleTypeName(String vehicleTypeName)
    {
        this.vehicleTypeName = vehicleTypeName;
    }

    @Basic
    @Column(name = "VEHICLE_TYPE_CODE", nullable = true, length = 20)
    public String getVehicleTypeCode()
    {
        return vehicleTypeCode;
    }

    public void setVehicleTypeCode(String vehicleTypeCode)
    {
        this.vehicleTypeCode = vehicleTypeCode;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehicleType that = (VehicleType) o;

        if (id != that.id) return false;
        if (vehicleTypeName != null ? !vehicleTypeName.equals(that.vehicleTypeName) : that.vehicleTypeName != null)
            return false;
        if (vehicleTypeCode != null ? !vehicleTypeCode.equals(that.vehicleTypeCode) : that.vehicleTypeCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (vehicleTypeName != null ? vehicleTypeName.hashCode() : 0);
        result = 31 * result + (vehicleTypeCode != null ? vehicleTypeCode.hashCode() : 0);
        return result;
    }
}
