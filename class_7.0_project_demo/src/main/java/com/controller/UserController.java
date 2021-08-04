package com.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.model.SignUp;
import com.repo.UserDao;
import java.util.List;

@Controller
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	@PostMapping("/add")
	@ResponseBody
	public String add(SignUp signup) {
		System.out.println(signup.getEmail());
	int i=userDao.insert(signup);
	System.out.println(i);
		return "hehehe";
	}
	
	
	@PostMapping("/login")
	@ResponseBody
	public String login(String email, String pwd,HttpSession httpSession) {
		System.out.println(email+"\t"+pwd);
	 SignUp signUp=userDao.login(email,pwd);

	 if(signUp!=null) {
		 httpSession.setAttribute("signUp", signUp);
		 return "valid";
	 }else {
		return "not valid";
	 }
	}
	
	@PostMapping("/fileupload")
	public String fileUpload(@RequestParam("myfile")MultipartFile file,HttpServletRequest request) throws IOException {
		String root=request.getServletContext().getRealPath("/");
		System.out.println("root :"+ root);
		File folder=new File(root,"images");
		folder.mkdir();
		File filename=File.createTempFile("pro", ".jpg", folder);
		file.transferTo(filename);
		System.out.println(filename.getAbsolutePath());
		
		return "redirect:/";
		
	}
	
	@GetMapping("/logout")
	public String loginOut(HttpSession httpSession) {
	httpSession.removeAttribute("signUp");
	httpSession.invalidate();
	return "redirect:/";
	}
	
	@GetMapping("/listuser")
	public ModelAndView getAllUser() {
		
		List<SignUp>user=userDao.getAllUser();
		user.stream().forEach(x-> System.out.println(x.getEmail()));
		ModelAndView view =new ModelAndView("listuser");
		
		view.addObject("user", user);
		return view;
	}
	
}
