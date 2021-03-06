package team.lala.timebank.entity.inherit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity 
@Table(name="ORG_MEMBER")
@PrimaryKeyJoinColumn(name="ID")  
public class OrgMemberInherit extends MemberInherit{
	
//	@Id
//	@GeneratedValue(strategy =GenerationType.AUTO)
//	private Long id;
	
	@Column(name="FOUNDER")
	private String founder;

	@Column(name="CEO")
	private String ceo;
	
	
	
	
	@Override
	public String toString() {
		return "OrgMemberInherit [founder=" + founder + ", ceo=" + ceo + "]";
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	

}
