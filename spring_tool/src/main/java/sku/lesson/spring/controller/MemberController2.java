package sku.lesson.spring.controller;

import java.sql.Timestamp;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sku.lesson.spring.dto.MemberDTO;
import sku.lesson.spring.service.MemberService;
import sku.lesson.spring.service.MemberService2;
import sku.lesson.spring.utils.DateService;


@Controller
@RequestMapping(value = "/member2")
public class MemberController2 {
	
	@Autowired // 생성해서 밑에다가 넣어라 라는 뜻.
	private MemberService2 ms;

	@RequestMapping(value = "/ajax", method = RequestMethod.POST)
	@ResponseBody // 데이터와 페이지의 이동을 구분한다. 데이터.
	public String checkId(@RequestParam("userId") String id) { // string id로 줄수없음 request로 //매개변수 HttpServletRequest request
		// id를 서비스한테 요청해서 그 아이디가 있는지 확인 . 
		boolean check = ms.checkId(id);
		return "{\"result\":" + check + "}"; // 데이터
	}
	
	// 페이지 이동.
	@RequestMapping(value = "/registView", method = RequestMethod.GET)
	public String registView(Model model) {
		model.addAttribute("registDate", DateService.getDateTime(1));
		return "./member2/regist"; // 페이지의 이동
	}
	
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public String regist(@ModelAttribute MemberDTO dto, BindingResult br) {
		if(br.hasErrors()) {
			Timestamp date = new Timestamp(System.currentTimeMillis());
			dto.setRegistDate(date);
			System.out.println("error handling >>> " + dto);
		//service 에게 전달
		}
		boolean flag = ms.registMember(dto);
		return "redirect:list";
	}
	
	@RequestMapping(value = "/list", method = {RequestMethod.GET,RequestMethod.POST})
	public String list(Model model) {
		ArrayList<MemberDTO> list = ms.getMemberData();
		model.addAttribute("list", list);
		System.out.println("list2 >>> " + list.size());
		return "./member2/list";
	}
	
	/* public String list(Model model) {
		ArrayList<MemberDTO> list = ms.getMemberData();
		// session.setAttribute("list", list);
		model.addAttribute("list" , list);
		System.out.println("list2 >>> " + list.size());
		return "./member2/list";
	}*/
	
	//search
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(@RequestParam("userId") String id , Model model) {
		MemberDTO dto = ms.findById(id);
		model.addAttribute("dto",dto);
		System.out.println("search2 >>> "+id);
		return "./member2/detail"; // 페이지의 이동
	}
	//updateview
	@RequestMapping(value = "/updateView", method = RequestMethod.GET)
	public String updateView(@RequestParam("userId") String id , Model model) {
		MemberDTO dto = ms.findById(id);
		model.addAttribute("dto", dto);
		System.out.println("update view2 >>> "+id);
		return "./member2/update";
	}
	//update
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute MemberDTO dto) {
		
		//서비츠 요청
		ms.modifyMember(dto);

		System.out.println("update2 >>> "+ dto.getUserId());
		//request.setAttribute("userId", id);
		return "redirect:search?userId="+dto.getUserId();
	}
	//delete
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam("userId") String id) {
		ms.remove(id);
		System.out.println("delete2 >>> "+id);
		return "redirect:list";
	}
}
