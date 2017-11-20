package cn.com.aiidc.rmove.entity;

import java.io.Serializable;
/**
 * 运行工况信息说用的VO
 * @author leehy
 */
public class PointConditionVO implements Serializable{
	private static final long serialVersionUID = -1045337976221737552L;
    private Long pointId;
    private Double temp;
    private Double hum;
    private Double wspeed;
    private Double bp;
    private Double speed;
    private Double acc;
    private Double vsp;
    private Double slope;
	public Long getPointId() {
		return pointId;
	}
	public void setPointId(Long pointId) {
		this.pointId = pointId;
	}
	public Double getTemp() {
		return temp;
	}
	public void setTemp(Double temp) {
		this.temp = temp;
	}
	public Double getHum() {
		return hum;
	}
	public void setHum(Double hum) {
		this.hum = hum;
	}
	public Double getWspeed() {
		return wspeed;
	}
	public void setWspeed(Double wspeed) {
		this.wspeed = wspeed;
	}
	public Double getBp() {
		return bp;
	}
	public void setBp(Double bp) {
		this.bp = bp;
	}
	public Double getSpeed() {
		return speed;
	}
	public void setSpeed(Double speed) {
		this.speed = speed;
	}
	public Double getAcc() {
		return acc;
	}
	public void setAcc(Double acc) {
		this.acc = acc;
	}
	public Double getVsp() {
		return vsp;
	}
	public void setVsp(Double vsp) {
		this.vsp = vsp;
	}
	public Double getSlope() {
		return slope;
	}
	public void setSlope(Double slope) {
		this.slope = slope;
	}
}
