package team.lala.timebank.web;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import team.lala.timebank.entity.Area;
import team.lala.timebank.entity.Member;
import team.lala.timebank.entity.OrgMember;
import team.lala.timebank.service.AreaService;
import team.lala.timebank.service.MemberService;
import team.lala.timebank.service.OrderService;

@RestController
public class MemberControllerJoinTable {

	String account = "sheila";
	String password = "asdf";

	@Autowired
	private MemberService memberService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private AreaService areaService;

	// findAllMember，並印出 member的結果 (join tables : area & orgMember ) 
	@RequestMapping("/findMember")
	public String findMember() {
		String result = "<html><p>";
		Collection<Member> members = memberService.findAll();
		if (members != null) {
			for (Member m : members) {
				result += m.toString();
				result += "<br>";
			}
		}
		result += "</p></html>";
		return result;
	}

	
	@RequestMapping("/saveMember")
	public String saveMember() {
		String result = "<html>";

//		Area area = new Area();
//		area.setId(10l);
//		area.setCity("苗栗縣");

		Member m = new Member();
		m.setId(2L);
		m.setLoginAccount("JESE");
		m.setPassword("asdf");
		m.setEmail("CATHY@gmail.com");
		m.setType("O");
		m.setName("CATHY");
//		m.setArea(area);

		OrgMember m2 = new OrgMember();
		m2.setCeo("Jim");
		m2.setFounder("黃CATHY");
		m2.setMember(m);
//		m.setOrgMember(m2);
	
		// 測試1: 新增/更新Member物件,orgMember也會一併新增/更新
		Member newM = memberService.save(m);
		if (newM != null) {
			result += "<p>" + newM + "</p>";
		}
		 System.out.println(newM);

		// 測試2: 刪除member物件 (orgMember也會一併刪除)
//		 memberService.deleteById(3l);

		result += "</html>";
		return result;
	}

	
	
	// @RequestMapping("/passwordConfirmation")
	// public String identityConfirm() {
	// String result = "<html>";
	// if (password != null) {
	//
	// }
	//
	// result += "</html>";
	// return result;
	// }

	// @RequestMapping("/changePassword")
	// public String changePassword() {
	// String result = "<html>";
	//
	// result += "</html>";
	// return result;
	// }

}
