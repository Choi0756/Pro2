package sku.lesson2.service;

import sku.lesson2.dao.MemberDAO;
import sku.lesson2.dto.MemberDTO;

public class MemberService {
	public boolean registMember(MemberDTO member) {
		boolean flag = false;
		MemberDAO dao = new MemberDAO();
		flag = dao.insert(member);
		return flag;
	}
}
