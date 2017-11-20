/*** 
*<p>Title: ProcedureTable</p>
* <p>Description: </p>
* <p>Company: </p> 
* @author  joyu
* @date  2017年11月14日
*/
package cn.com.aiidc.rmove.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author joyu
 * @date 2017年11月14日
 */
@Entity
@Table(name = "TEST_POINT")
@NamedStoredProcedureQuery(name = "generatePointRate", procedureName = "GENERATE_POINT_RATE")
public class  TestPoint implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3176552329913689308L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TP")
	@SequenceGenerator(name = "SEQ_TP", sequenceName = "SEQ_TP", allocationSize = 1)
	private Long id;
	@Column(name = "point_name")
	private String pointName;
	private String province;
	private String city;
	private String addr;
	@Column(name = "point_lng")
	private BigDecimal pointLng;
	@Column(name = "point_lat")
	private BigDecimal pointLat;
	private String operator;
	@Column(name = "success_count")
	private Integer successCount;
	private Integer total;
	@Temporal(TemporalType.DATE)
	@Column(name = "add_time")
	private Date addTime;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the pointName
	 */
	public String getPointName() {
		return this.pointName;
	}

	/**
	 * @param pointName the pointName to set
	 */
	public void setPointName(String pointName) {
		this.pointName = pointName;
	}

	/**
	 * @return the province
	 */
	public String getProvince() {
		return this.province;
	}

	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return this.city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the addr
	 */
	public String getAddr() {
		return this.addr;
	}

	/**
	 * @param addr the addr to set
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}

	/**
	 * @return the pointLng
	 */
	public BigDecimal getPointLng() {
		return this.pointLng;
	}

	/**
	 * @param pointLng the pointLng to set
	 */
	public void setPointLng(BigDecimal pointLng) {
		this.pointLng = pointLng;
	}

	/**
	 * @return the pointLat
	 */
	public BigDecimal getPointLat() {
		return this.pointLat;
	}

	/**
	 * @param pointLat the pointLat to set
	 */
	public void setPointLat(BigDecimal pointLat) {
		this.pointLat = pointLat;
	}

	/**
	 * @return the operator
	 */
	public String getOperator() {
		return this.operator;
	}

	/**
	 * @param operator the operator to set
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

	/**
	 * @return the successCount
	 */
	public Integer getSuccessCount() {
		return this.successCount;
	}

	/**
	 * @param successCount the successCount to set
	 */
	public void setSuccessCount(Integer successCount) {
		this.successCount = successCount;
	}

	/**
	 * @return the total
	 */
	public Integer getTotal() {
		return this.total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}

	/**
	 * @return the addTime
	 */
	public Date getAddTime() {
		return this.addTime;
	}

	/**
	 * @param addTime the addTime to set
	 */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
}
