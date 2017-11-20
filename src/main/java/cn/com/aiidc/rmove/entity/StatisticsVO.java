package cn.com.aiidc.rmove.entity;

import java.io.Serializable;

public class StatisticsVO implements Serializable{
	private static final long serialVersionUID = -7533081026378283923L;
	/**总共捕获的车辆数*/
    private Long total;
    /**有效的车辆数*/
    private Long valid;
    /**超标车辆数*/
    private Long over;
    /**车辆有效率*/
    private Double validrate;
    /**车辆超标率*/
    private Double overrate;
    /**黄标车率*/
    private Double yellowlabel;
    /**各种超标率*/
    private Double co;
    private Double hc;
    private Double nox;
    private Double pm;
    /**各种超标车的辆数*/
    private int col;
    private int hcl;
    private int noxl;
    private int pml;
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public int getHcl() {
		return hcl;
	}
	public void setHcl(int hcl) {
		this.hcl = hcl;
	}
	public int getNoxl() {
		return noxl;
	}
	public void setNoxl(int noxl) {
		this.noxl = noxl;
	}
	public int getPml() {
		return pml;
	}
	public void setPml(int pml) {
		this.pml = pml;
	}
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getValid() {
		return valid;
	}
	public void setValid(Long valid) {
		this.valid = valid;
	}
	public Long getOver() {
		return over;
	}
	public void setOver(Long over) {
		this.over = over;
	}
	public Double getValidrate() {
		return validrate;
	}
	public void setValidrate(Double validrate) {
		this.validrate = validrate;
	}
	public Double getOverrate() {
		return overrate;
	}
	public void setOverrate(Double overrate) {
		this.overrate = overrate;
	}
	public Double getYellowlabel() {
		return yellowlabel;
	}
	public void setYellowlabel(Double yellowlabel) {
		this.yellowlabel = yellowlabel;
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
	public Double getNox() {
		return nox;
	}
	public void setNox(Double nox) {
		this.nox = nox;
	}
	public Double getPm() {
		return pm;
	}
	public void setPm(Double pm) {
		this.pm = pm;
	}
}
