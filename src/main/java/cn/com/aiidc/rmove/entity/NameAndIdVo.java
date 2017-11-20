package cn.com.aiidc.rmove.entity;

import java.io.Serializable;

public class NameAndIdVo implements Serializable{
	private static final long serialVersionUID = 8393103509002453441L;
    private String pointName;
    private Long id;
	public String getPointName() {
		return pointName;
	}
	public void setPointName(String pointName) {
		this.pointName = pointName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
