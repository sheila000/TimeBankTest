package team.lala.timebank.service;

import static org.junit.Assert.fail;

import java.util.Collection;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import team.lala.timebank.entity.Area;
import team.lala.timebank.entity.Member;
import team.lala.timebank.entity.OrgMember;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberServiceTest2 {

	@Autowired
	MemberService memberService;
	@Autowired
	AreaService areaService;

	Member member = new Member("sheila", "asdf", "shiela", "O", null, null, null);

	OrgMember orgMember = new OrgMember("Mr. kuo", "ms. Lin");

	@Test
	public void testSave() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteById() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindMemberById() {
		if (memberService != null) {
			Member m = memberService.findMemberById(1l);
			System.out.println(m.getId());
			System.out.println(m.getLoginAccount());
			System.out.println(m.getType());
//			System.out.println(m.getArea());
		}

	}

	@Test
	public void testFindAll() {
		Long id = 1l;
		if (memberService != null) {
			Collection<Member> members = memberService.findAll();
			for (Member m : members) {
				System.out.println(m.getId());
				System.out.println(m.getLoginAccount());
			}

		}
	}

	@Test
	public void testLogin() {
		fail("Not yet implemented");
	}

	@Test
	public void testRegistered() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNameByMemberId() {
		fail("Not yet implemented");
	}
}
