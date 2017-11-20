package cn.com.aiidc.rmove.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author leehy
 *用于TestPoint展示的VO
 */
public class TestPointVO implements Serializable{
	/**序列化版本号*/
	private static final long serialVersionUID = -724156755576986679L;
    /**测试点的ID*/
	private Long id;
	/**测试点的名字*/
	private String pointName;
	/**测试点的经度*/
	private BigDecimal pointLng;
	/**测试点的纬度*/
	private BigDecimal pointLat;
	/**合格率*/
	private Double percentage;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPointName() {
		return pointName;
	}
	public void setPointName(String pointName) {
		this.pointName = pointName;
	}
	public BigDecimal getPointLng() {
		return pointLng;
	}
	public void setPointLng(BigDecimal pointLng) {
		this.pointLng = pointLng;
	}
	public BigDecimal getPointLat() {
		return pointLat;
	}
	public void setPointLat(BigDecimal pointLat) {
		this.pointLat = pointLat;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	
}
