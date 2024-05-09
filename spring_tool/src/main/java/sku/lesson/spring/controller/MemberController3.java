package sku.lesson.spring.controller;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sku.lesson.spring.dto.MemberDTO;
import sku.lesson.spring.service.MemberService3;
import sku.lesson.spring.utils.DateService;

@Controller
@RequestMapping(value = "/member3")
public class MemberController3 {
	private MemberService3 ms;
	
	@RequestMapping(value = "/ajax", method = RequestMethod.POST)
	@ResponseBody
	public String checkId(@RequestParam("userId") String id) {
		boolean check = ms.checkId(id);
		return "{\"result\":" + check + "}"; // 데이터
	}
	
	@RequestMapping(value = "/registView", method = RequestMethod.GET)
	public String registView(Model model) {
		model.addAttribute("registDate", DateService.getDateTime(1));
		return "./member3/regist"; // 페이지 이동
	}
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public String regist(@ModelAttribute MemberDTO dto) {
		Timestamp date = new Timestamp(System.currentTimeMillis());
		return "redirect:list"; // POST
	}
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		ArrayList<MemberDTO> list = ms.getMemberData();
		model.addAttribute("list",list);
		System.out.println("list3 >>> " + list.size());
		return "./member3/list"; // GET
	}
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(@RequestParam("userId") String id , Model model) {
		MemberDTO dto = ms.findById(id);
		model.addAttribute("dto",dto);
		System.out.println("search3 >>> " + id);
		return "./member3/list";
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute MemberDTO dto) {
		ms.modifyMember(dto);
		System.out.println("update3 >>> " + dto.getUserId());
		return "redirect:search?userId="+dto.getUserId();
	}
	@RequestMapping(value = "/updateView", method = RequestMethod.GET)
	public String updateView(@RequestParam("userid") String id, Model model) {
		MemberDTO dto = ms.findById(id);
		model.addAttribute("dto", dto);
		System.out.println("updateView3 >>> " + id);
		return "./member3/list";
	}
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(@RequestParam("userId") String id){
		ms.remove(id);
		System.out.println("delete3 >>> " + id);
		return "redirect:list";
	}
}
