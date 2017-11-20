package cn.com.aiidc.rmove.entity;

import javax.persistence.*;

/**
 * Created by Zhangx on 2017/11/19 at 18:31.
 */
@Entity
@Table(name = "VEHICLE_INFO", schema = "EPUSER", catalog = "")
public class VehicleInfo
{
    private String license;
    private Byte licenseType;
    private String vehicleSubType;
    private String dischargeType;
    private String genEntId;
    private String vehicleModel;
    private Long usefulLife;
    private Long mileage;
    private Area area;
    private VehicleType vehicleType;
    private FuelType fuelType;

    @Id
    @Column(name = "LICENSE", nullable = false, length = 20)
    public String getLicense()
    {
        return license;
    }

    public void setLicense(String license)
    {
        this.license = license;
    }

    @Basic
    @Column(name = "LICENSE_TYPE", nullable = true, precision = 0)
    public Byte getLicenseType()
    {
        return licenseType;
    }

    public void setLicenseType(Byte licenseType)
    {
        this.licenseType = licenseType;
    }

    @Basic
    @Column(name = "VEHICLE_SUB_TYPE", nullable = true, length = 20)
    public String getVehicleSubType()
    {
        return vehicleSubType;
    }

    public void setVehicleSubType(String vehicleSubType)
    {
        this.vehicleSubType = vehicleSubType;
    }

    @Basic
    @Column(name = "DISCHARGE_TYPE", nullable = true, length = 20)
    public String getDischargeType()
    {
        return dischargeType;
    }

    public void setDischargeType(String dischargeType)
    {
        this.dischargeType = dischargeType;
    }

    @Basic
    @Column(name = "GEN_ENT_ID", nullable = true, length = 50)
    public String getGenEntId()
    {
        return genEntId;
    }

    public void setGenEntId(String genEntId)
    {
        this.genEntId = genEntId;
    }

    @Basic
    @Column(name = "VEHICLE_MODEL", nullable = true, length = 20)
    public String getVehicleModel()
    {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel)
    {
        this.vehicleModel = vehicleModel;
    }

    @Basic
    @Column(name = "USEFUL_LIFE", nullable = true, precision = 0)
    public Long getUsefulLife()
    {
        return usefulLife;
    }

    public void setUsefulLife(Long usefulLife)
    {
        this.usefulLife = usefulLife;
    }

    @Basic
    @Column(name = "MILEAGE", nullable = true, precision = 0)
    public Long getMileage()
    {
        return mileage;
    }

    public void setMileage(Long mileage)
    {
        this.mileage = mileage;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehicleInfo that = (VehicleInfo) o;

        if (license != null ? !license.equals(that.license) : that.license != null) return false;
        if (licenseType != null ? !licenseType.equals(that.licenseType) : that.licenseType != null) return false;
        if (vehicleSubType != null ? !vehicleSubType.equals(that.vehicleSubType) : that.vehicleSubType != null)
            return false;
        if (dischargeType != null ? !dischargeType.equals(that.dischargeType) : that.dischargeType != null)
            return false;
        if (genEntId != null ? !genEntId.equals(that.genEntId) : that.genEntId != null) return false;
        if (vehicleModel != null ? !vehicleModel.equals(that.vehicleModel) : that.vehicleModel != null) return false;
        if (usefulLife != null ? !usefulLife.equals(that.usefulLife) : that.usefulLife != null) return false;
        if (mileage != null ? !mileage.equals(that.mileage) : that.mileage != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = license != null ? license.hashCode() : 0;
        result = 31 * result + (licenseType != null ? licenseType.hashCode() : 0);
        result = 31 * result + (vehicleSubType != null ? vehicleSubType.hashCode() : 0);
        result = 31 * result + (dischargeType != null ? dischargeType.hashCode() : 0);
        result = 31 * result + (genEntId != null ? genEntId.hashCode() : 0);
        result = 31 * result + (vehicleModel != null ? vehicleModel.hashCode() : 0);
        result = 31 * result + (usefulLife != null ? usefulLife.hashCode() : 0);
        result = 31 * result + (mileage != null ? mileage.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "AREA", referencedColumnName = "AREA_ID")
    public Area getArea()
    {
        return area;
    }

    public void setArea(Area area)
    {
        this.area = area;
    }

    @OneToOne
    @JoinColumn(name = "VEHICLE_TYPE", referencedColumnName = "ID")
    public VehicleType getVehicleType()
    {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType)
    {
        this.vehicleType = vehicleType;
    }

    @OneToOne
    @JoinColumn(name = "FUEL_TYPE", referencedColumnName = "ID")
    public FuelType getFuelType()
    {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType)
    {
        this.fuelType = fuelType;
    }
}
