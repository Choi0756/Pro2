package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	MemberInfo memberinfo = new MemberInfo();
	sale Sale = new sale();
	wallet Wallet = new wallet();
	
	@Autowired
    private MemberDao memberDao;
	
	@Autowired
    private ProductDao productDao;
	
    @Autowired
    @Qualifier("scheduleDao")
    private ScheduleDao ScheduleDao;
	
	private JdbcTemplate jdbcTemplate;
	
	String pass = "1234";
    
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String start() {
		Sale.setSale(0);
		Wallet.setWallet(300000);
        return "Login";
    }
	
	public MainController(JdbcTemplate jdbcTemplate) {
		      this.jdbcTemplate = jdbcTemplate;
		 }


	@PostMapping(value = "Login")
	public String login(@RequestParam("id") String id, @RequestParam("password") String password, Model model) {
	    List<Member> members = memberDao.selectAll();	//데베 저장되어 있는 member 데이터베이스 가져와서 리스트로 저장
	    for (Member member : members) {
	        if (member.getId().equals(id) && member.getPassword().equals(password)) {
	            model.addAttribute("name", member.getName());
	            memberinfo.setName(member.getName());
	            return "redirect:/Home";
	        }
	    }
	    model.addAttribute("error", "Please check your ID and password.");
	    return "Login";
	}

	
    List<Product> productList = new ArrayList<>();
    @PostMapping(value = "/Home")
    public String homePage(@RequestParam("productcode") String productcode, Model model) {//
        List<Product> products = productDao.selectAll();

        for (Product product : products) {
            if (product.getCode().equals(productcode)) {
                System.out.println(product.getProductname());
                productList.add(product);
            }
        }
        model.addAttribute("wallet", Wallet.getWallet());
        model.addAttribute("products", productList);
    	model.addAttribute("sale", String.valueOf(Sale.getSale()));
    	model.addAttribute("name", String.valueOf(memberinfo.getName()));
    	System.out.println(productList);
    	return "Home";
    }
	
    
    @GetMapping(value = "/Home")
    public String homePage2(Model model) {//
    	model.addAttribute("products", productList);
        model.addAttribute("wallet", Wallet.getWallet());
    	model.addAttribute("sale", String.valueOf(Sale.getSale()));
    	model.addAttribute("name", String.valueOf(memberinfo.getName()));
    	return "Home";
    }

    
    
    @GetMapping(value = "/Map")
    public String Map() {
    	
    	return "Map";

    }
    
	
	
	@PostMapping(value = "/cancel")
	public String productcancel(@RequestParam("cancelcode") String cancelcode, Model model) {

	    List<Product> products = productDao.selectAll();
	    Iterator<Product> iterator = productList.iterator();

	    while (iterator.hasNext()) {
	        Product product = iterator.next();
	        if (product.getProductname().equals(cancelcode)) {
	            System.out.println(product.getProductname());
	            iterator.remove();
	        }
	    }
            
            
	    return "redirect:/Home";
	}
    
    @PostMapping(value = "/register")
    public String register2(@RequestParam("id") String id, @RequestParam("password") String password, 
    		@RequestParam("name") String name, @RequestParam("exampleFormControlSelect1") String exampleFormControlSelect1, @RequestParam("exampleFormControlSelect2") String exampleFormControlSelect2, @RequestParam("exampleFormControlSelect3") String exampleFormControlSelect3, 
    		@RequestParam("phone") String phone,  @RequestParam("Buisnessman") String Buisnessman, @RequestParam("car") String car, Model model) {
   	    String Birth = exampleFormControlSelect1 +"-"+ exampleFormControlSelect2 + "-"+exampleFormControlSelect3;
    	Object[] params = {id,password,name,Birth,phone,Buisnessman,car};
   	    memberDao.InsertMember(params);       
    	return "Login";
    }
    
    @GetMapping(value = "/register")
    public String register(Model model) {
    	return "register";
    }
    
    

}