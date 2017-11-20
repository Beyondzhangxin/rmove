package cn.com.aiidc.rmove.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TELEMETRY_INFO")
public class Telemetry implements Serializable{
	/**序列化版本号*/
	private static final long serialVersionUID = -2668150823855205033L;
	@Id
	@Column(name="TEST_NO")
	private String testNo;
	@Column(name="TEST_TYPE")
	private String testType;
	@Column(name="TEST_NAME")
	private String testName;
	@Column(name="TEST_MODEL")
	private String testModel;
	@Column(name="TEST_DATE")
	private Date testDate;
	@Column(name="TEST_LNG")
	private Double testLng;
	@Column(name="TEST_LAT")
	private Double testLat;
	@Column(name="RESULT")
	private Integer result;
	@Column(name="LICENSE")
	private String license;
	@Column(name="LICENSE_TYPE")
	private Integer license_type;
	@Column(name="DIESEL")
	private String diesel;
    @Column(name="CO2")
    private Double co2;
    @Column(name="COCO2")
    private Double coco2;
    @Column(name="HCCO2")
    private Double hcco2;
    @Column(name="NOCO2")
    private Double noco2;
    @Column(name="CO")
    private Double co;
    @Column(name="HC")
    private Double hc;
    @Column(name="NO")
    private Double no;
    @Column(name="YDZ")
    private Double ydz;
    @Column(name="RGB")
    private Double rgb;
    @Column(name="SPEED")
    private Double speed;
    @Column(name="ACC")
    private Double acc;
    @Column(name="VSP")
    private Double vsp;
    @Column(name="slope")
    private Double slope;
    @Column(name="HUM")
    private Double hum;
    @Column(name="TEMP")
    private Double temp;
    @Column(name="WSPEED")
    private Double wspeed;
    @Column(name="PM")
    private Double pm;
    @Column(name="NOX")
    private Double nox;
    @Column(name="WDIRECTION")
    private String wdirection;
    @Column(name="BP")
    private Double bp;
    @Column(name="TEST_POINT_ID")
    private Long testPointId;
	public Long getTestPointId() {
		return testPointId;
	}
	public void setTestPointId(Long testPointId) {
		this.testPointId = testPointId;
	}
	public String getTestNo() {
		return testNo;
	}
	public void setTestNo(String testNo) {
		this.testNo = testNo;
	}
	public String getTestType() {
		return testType;
	}
	public void setTestType(String testType) {
		this.testType = testType;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getTestModel() {
		return testModel;
	}
	public void setTestModel(String testModel) {
		this.testModel = testModel;
	}
	public Date getTestDate() {
		return testDate;
	}
	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}
	public Double getTestLng() {
		return testLng;
	}
	public void setTestLng(Double testLng) {
		this.testLng = testLng;
	}
	public Double getTestLat() {
		return testLat;
	}
	public void setTestLat(Double testLat) {
		this.testLat = testLat;
	}
	public Integer getResult() {
		return result;
	}
	public void setResult(Integer result) {
		this.result = result;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public Integer getLicense_type() {
		return license_type;
	}
	public void setLicense_type(Integer license_type) {
		this.license_type = license_type;
	}
	public String getDiesel() {
		return diesel;
	}
	public void setDiesel(String diesel) {
		this.diesel = diesel;
	}
	public Double getCo2() {
		return co2;
	}
	public void setCo2(Double co2) {
		this.co2 = co2;
	}
	public Double getCoco2() {
		return coco2;
	}
	public void setCoco2(Double coco2) {
		this.coco2 = coco2;
	}
	public Double getHcco2() {
		return hcco2;
	}
	public void setHcco2(Double hcco2) {
		this.hcco2 = hcco2;
	}
	public Double getNoco2() {
		return noco2;
	}
	public void setNoco2(Double noco2) {
		this.noco2 = noco2;
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
	public Double getNo() {
		return no;
	}
	public void setNo(Double no) {
		this.no = no;
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
	public Double getHum() {
		return hum;
	}
	public void setHum(Double hum) {
		this.hum = hum;
	}
	public Double getTemp() {
		return temp;
	}
	public void setTemp(Double temp) {
		this.temp = temp;
	}
	public Double getWspeed() {
		return wspeed;
	}
	public void setWspeed(Double wspeed) {
		this.wspeed = wspeed;
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
	public String getWdirection() {
		return wdirection;
	}
	public void setWdirection(String wdirection) {
		this.wdirection = wdirection;
	}
	public Double getBp() {
		return bp;
	}
	public void setBp(Double bp) {
		this.bp = bp;
	}
}
