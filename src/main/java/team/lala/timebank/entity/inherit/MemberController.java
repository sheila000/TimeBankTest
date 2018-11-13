package team.lala.timebank.entity.inherit;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
	
	@Autowired 
	private MemberInheritDao mInhDao ;
	
	@Autowired 
	private OrgMemberDao orgDao ;
	
	
	@RequestMapping("/inheritSample")
	public String inheritedTables() {
		String result = "<html><p>";
		Collection<MemberInherit> members = mInhDao.findAll();
		if (members != null) {
			for (MemberInherit m : members) {
				if (m instanceof OrgMemberInherit) {
					OrgMemberInherit orgMember = (OrgMemberInherit) m;
				result += orgMember.getId()+" ";
				result += orgMember.getLoginAccount()+" ";
				result += orgMember.getName()+" ";
				result+= orgMember.getFounder()+" ";
				result+= orgMember.getCeo()+" ";
				result += "<br>";
				} else {
					result += m.getId()+" ";
					result += m.getLoginAccount()+" ";
					result += m.getName()+" ";
					
				}
				
			}
		}
		result += "</p></html>";
		return result;
	}
	
	
	
}
