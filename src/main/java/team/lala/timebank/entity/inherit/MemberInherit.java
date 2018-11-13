package team.lala.timebank.entity.inherit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import team.lala.timebank.entity.Area;

@Entity
@Table(name="MEMBER")
@Inheritance(strategy=InheritanceType.JOINED)  
public class MemberInherit{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "LOGIN_ACCOUNT")
	private String loginAccount;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "NAME")
	private String name;

	@Column(name = "TYPE")
	private String type; // P: Person; O: Organization

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "TEL")
	private String telephone;

	@Column(name = "MOBILE")
	private String mobile;

//	@ManyToOne
//	@JoinColumn(name = "CITY")
	@Column(name="city")
	private String area;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginAccount() {
		return loginAccount;
	}

	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "MemberInherit [id=" + id + ", loginAccount=" + loginAccount + ", password=" + password + ", name="
				+ name + ", type=" + type + ", email=" + email + ", telephone=" + telephone + ", mobile=" + mobile
				+ ", area=" + area + "]";
	}

	

}
