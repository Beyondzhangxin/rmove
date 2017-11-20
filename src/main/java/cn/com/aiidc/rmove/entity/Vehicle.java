package cn.com.aiidc.rmove.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="VEHICLE_INFO")
public class Vehicle implements Serializable{
	/**序列化版本号*/
	private static final long serialVersionUID = 5239398515792047425L;
	@Column(name="LICENSE")
	@Id
    private String license;
	@Column(name="LICENSE_TYPE")
	private Integer licenseType;
	@Column(name="AREA")
	private String area;
	@Column(name="VEHICLE_TYPE")
	private String vehicleType;
	@Column(name="VEHICLE_SUB_TYPE")
	private String vehicleSubType;
	@Column(name="FUEL_TYPE")
	private String fuelType;
	@Column(name="DISCHARGE_TYPE")
	private String dischargeType;
	@Column(name="GEN_ENT_ID")
	private String genentId;
	@Column(name="VEHICLE_MODEL")
	private String vehicleModel;
	@Column(name="USEFUL_LIFE")
	private Integer usefulLife;
	@Column(name="MILEAGE")
	private Integer mileage;
	@Column(name="INS_ORG_ID")
	private String insorgId;
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public Integer getLicenseType() {
		return licenseType;
	}
	public void setLicenseType(Integer licenseType) {
		this.licenseType = licenseType;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleSubType() {
		return vehicleSubType;
	}
	public void setVehicleSubType(String vehicleSubType) {
		this.vehicleSubType = vehicleSubType;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getDischargeType() {
		return dischargeType;
	}
	public void setDischargeType(String dischargeType) {
		this.dischargeType = dischargeType;
	}
	public String getGenentId() {
		return genentId;
	}
	public void setGenentId(String genent) {
		this.genentId = genent;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public Integer getUsefulLife() {
		return usefulLife;
	}
	public void setUsefulLife(Integer usefulLife) {
		this.usefulLife = usefulLife;
	}
	public Integer getMileage() {
		return mileage;
	}
	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}
	public String getInsorgId() {
		return insorgId;
	}
	public void setInsorgId(String insorg) {
		this.insorgId = insorg;
	}
}
