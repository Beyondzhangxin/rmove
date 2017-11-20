/**
 * @航天科工智慧产业发展有限公司
 * @版权所有
 */
package cn.com.aiidc.rmove.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

/**
 * @author wuwenjun
 *
 */
@Entity
@Table(name = "SYS_USER")
public class User implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
	@SequenceGenerator(name = "user_id_seq", sequenceName = "user_id_seq", allocationSize = 1)
	private Long userid;

	private String manufid;

	private String username;

	private String name;

	private String password;

	private String uaddress;

	private String tel;

	private String mobile;

	private String email;

	@Temporal(TemporalType.DATE)
	private Date createdate;

	@Temporal(TemporalType.DATE)
	private Date modifydate;

	private String depart;

	private String duty;

	private String fax;

	private Character flag;

	private String sfzbh;

	@Column(name = "super_admin", columnDefinition = "NUMBER(1,0) DEFAULT '0' NOT NULL ")
	private boolean superAdmin = false;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_login_time")
	private Date lastLoginTime;

	@ElementCollection(targetClass = Long.class, fetch = FetchType.EAGER)
	@CollectionTable(name = "USERPERM", joinColumns = { @JoinColumn(name = "USERID") })
	@Column(name = "permid")
	private List<Long> permids = new ArrayList<Long>();

	public List<Long> getPermids() {
		return permids;
	}

	public void setPermids(List<Long> permids) {
		this.permids = permids;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Date getModifydate() {
		return modifydate;
	}

	public void setModifydate(Date modifydate) {
		this.modifydate = modifydate;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public Character getFlag() {
		return flag;
	}

	public void setFlag(Character flag) {
		this.flag = flag;
	}

	public String getSfzbh() {
		return sfzbh;
	}

	public void setSfzbh(String sfzbh) {
		this.sfzbh = sfzbh;
	}

	public Collection<SimpleGrantedAuthority> authorities() {
		Collection<SimpleGrantedAuthority> authorities = new HashSet<SimpleGrantedAuthority>();
		for (Long permid : getPermids()) {
			authorities.add(new SimpleGrantedAuthority("ROLE_" + String.valueOf(permid)));
		}
		return authorities;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getManufid() {
		return manufid;
	}

	public void setManufid(String manufid) {
		this.manufid = manufid;
	}

	public boolean isSuperAdmin() {
		return superAdmin;
	}

	public void setSuperAdmin(boolean superAdmin) {
		this.superAdmin = superAdmin;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

}
