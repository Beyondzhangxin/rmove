package cn.com.aiidc.rmove.entity;

import java.io.Serializable;

/**具体点所使用的视图对象*/
public class SpecificPointVO implements Serializable{
	private static final long serialVersionUID = -2401078787358071353L;
	//测试点的Id
    private Long id;
    //监测点名称
    private String pointName;
    public String getPointName() {
		return pointName;
	}
	public void setPointName(String pointName) {
		this.pointName = pointName;
	}
	//测试点的地址
    private String addr;
    //车流量
    private Integer total;
    //最近的一辆超标车的车牌号
    private String license;
    //污染物信息
    private Double pm;
    private Double nox;
    private Double co;
    private Double ydz;
    private Double hc;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
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
    
}
