package team.lala.timebank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import team.lala.timebank.dao.MemberDao;
import team.lala.timebank.entity.Member;

@Service
public class MemberService2 {

	@Autowired
	private MemberDao memberDao;

	public Member login(String account, String password) {
		Member member = memberDao.findByLoginAccount(account);
		if (member != null) {
			if (member.getPassword().equals(password)) {
				return member;
			}
		}
		return null;

	}

	

	// 需再一次輸入密碼才可更換密碼
	public boolean changePassword(String account, String oldPassword, String newPassword) {
		Member member = login(account, oldPassword);
		if (member != null) {
			member.setPassword(newPassword);
			Member mb = memberDao.save(member);
		}
		if (member.getPassword().equals(newPassword)) {
			return true;
		} else {
			return false;
		}

	}

}
