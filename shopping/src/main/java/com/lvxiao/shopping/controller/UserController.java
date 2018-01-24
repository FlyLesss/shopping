package com.lvxiao.shopping.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.lvxiao.shopping.pojo.User;
import com.lvxiao.shopping.service.IUserService;
import com.lvxiao.shopping.util.FileUtil;
import com.lvxiao.shopping.util.MailUtil;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	IUserService userservice;

	// 登录
	@RequestMapping(value = "/userlogin.htm", method = RequestMethod.POST)
	public String userlogin(String uname, String upassword, HttpSession session) {
		User user;
		if (userservice.userlogin(uname, upassword) != null) {
			user = userservice.userlogin(uname, upassword);
			session.setAttribute("user", user);
			return "forward:/index.jsp";
		} else {
			return "forward:/login.jsp";
		}

	}

	// 注册
	@RequestMapping(value = "/register.htm", method = RequestMethod.POST)
	public String register(String uname, String upassword, String phone, String email, MultipartFile file,
			HttpServletRequest request) {
		String registertime;
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		registertime = sf.format(date);
         String photoPath = FileUtil.saveFile(file, request, "photo");
         //注册成功
		if (!photoPath.isEmpty()) {
			if (userservice.register(uname, upassword, registertime, photoPath, phone, email)) {
				// MailUtil.sendEmail(email,
				// "用户"+uname+"注册成功，您的密码是"+upassword+",！！！", "注册成功");
				return "forward:/login.jsp";
			} 
		}
		//注册失败
		return "forward:/register.jsp";
	}

	// 邮箱验证码生成发送
	@ResponseBody
	@RequestMapping(value = "/random.htm", method = RequestMethod.POST)
	public int random(String email) {
		int random = (int) (100000 + Math.random() * 100000);
		MailUtil.sendEmail(email, "当前验证码为:" + random + ";30分钟有效，请及时注册！", "验证码");
		System.out.println(random);
		return random;
	}

	// 获取一个用户信息
	@RequestMapping(value = "oneuser", method = RequestMethod.GET)
	public String oneuser(String uid, HttpServletRequest req) {

		return "";
	}

	// 修改用户信息
	@RequestMapping(value = "updateuser", method = RequestMethod.POST)
	public String updateuser(String uid, String photo, String phone, String email, HttpServletRequest req) {

		return "";
	}

	// 查询所有用户
	@RequestMapping(value = "alluser", method = RequestMethod.GET)
	public String alluser(HttpServletRequest req) {

		return "";
	}

	// 删除一个用户
	@RequestMapping(value = "deleteuser", method = RequestMethod.GET)
	public String deleteuser(String uid, HttpServletRequest req) {

		return "";
	}

	@RequestMapping(value = "/exit.htm", method = RequestMethod.GET)
	public String exit(HttpSession session) {
		session.invalidate();
		return "forward:/index.jsp";
	}
}
