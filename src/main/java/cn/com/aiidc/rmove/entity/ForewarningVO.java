package cn.com.aiidc.rmove.entity;

import java.io.Serializable;
/**
 * 预警信息所用的VO
 * @author leehy
 */
public class ForewarningVO implements Serializable{
	private static final long serialVersionUID = 2583988484265782168L;
	//监测点的Id
    private Long pointId;
    //超标记录的Id
    private String overId;
    public String getOverId() {
		return overId;
	}
	public void setOverId(String overId) {
		this.overId = overId;
	}
	//所在城市
    private String city;
    //点位名称
    private String pointName;
    //点位的路段
    private String street;
    //车牌
    private String license;
	public Long getPointId() {
		return pointId;
	}
	public void setPointId(Long pointId) {
		this.pointId = pointId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPointName() {
		return pointName;
	}
	public void setPointName(String pointName) {
		this.pointName = pointName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
}
