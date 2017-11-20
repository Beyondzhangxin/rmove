package cn.com.aiidc.rmove.entity;

import java.io.Serializable;

/**
 * 污染物信息所使用的VO
 * @author leehy
 */
public class PollutionInfoVO implements Serializable{
	private static final long serialVersionUID = -7321112914875139426L;
	/**超标车辆的遥感记录id 即telemetry_info里的test_no*/
      private String id;
      private Double pm;
      private Double nox;
      private Double co;
      private Double hc;
      private Double ydz;
      private Double rgb;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public Double getHc() {
		return hc;
	}
	public void setHc(Double hc) {
		this.hc = hc;
	}
	public Double getYdz() {
		return ydz;
	}
	public void setYdz(Double ydz) {
		this.ydz = ydz;
	}
	public Double getRgb() {
		return rgb;
	}
	public void setRgb(Double rgb) {
		this.rgb = rgb;
	}
}
