package cn.com.aiidc.rmove.entity;
/**
 * @author leehy
 *超标车辆所使用实体类
 */

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="OVER_POLLUTION_DATA")
public class OverPollution implements Serializable{
	private static final long serialVersionUID = 6201152301124539809L;
    @Id
    @Column(name="TEST_NO")
    private String testNo;
    @Column(name="LICENSE")
    private String license;
    @Column(name="LICENSE_TYPE")
    private Integer licenseType;
    @Column(name="PM")
    private  Double pm;
    @Column(name="NOX")
    private Double nox ;
    @Column(name="CO")
    private Double  co;
    @Column(name="YDZ")
    private Double  ydz;
    @Column(name="HC")
    private Double  hc;
    @Column(name="TEST_DATE")
    @Temporal(TemporalType.DATE)
    private Date testDate;
    @Column(name="TEST_POINT_ID")
    private Long testPointId;
	public String getTestNo() {
		return testNo;
	}
	public void setId(String testNo) {
		this.testNo = testNo;
	}
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
	public Double getPm() {
		return pm;
	}
	public void setPm(Double pm) {
		this.pm = pm;
	}
	public Double getNox() {
		return nox;
	}
	public void setNox(Double nox) {
		this.nox = nox;
	}
	public Double getCo() {
		return co;
	}
	public void setCo(Double co) {
		this.co = co;
	}
	public Double getYdz() {
		return ydz;
	}
	public void setYdz(Double ydz) {
		this.ydz = ydz;
	}
	public Double getHc() {
		return hc;
	}
	public void setHc(Double hc) {
		this.hc = hc;
	}
	public Date getTestDate() {
		return testDate;
	}
	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}
	public Long getTestPointId() {
		return testPointId;
	}
	public void setTestPointId(Long testPointId) {
		this.testPointId = testPointId;
	}
}
