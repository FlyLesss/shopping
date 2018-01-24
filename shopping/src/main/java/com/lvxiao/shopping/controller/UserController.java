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

	// ��¼
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

	// ע��
	@RequestMapping(value = "/register.htm", method = RequestMethod.POST)
	public String register(String uname, String upassword, String phone, String email, MultipartFile file,
			HttpServletRequest request) {
		String registertime;
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		registertime = sf.format(date);
         String photoPath = FileUtil.saveFile(file, request, "photo");
         //ע��ɹ�
		if (!photoPath.isEmpty()) {
			if (userservice.register(uname, upassword, registertime, photoPath, phone, email)) {
				// MailUtil.sendEmail(email,
				// "�û�"+uname+"ע��ɹ�������������"+upassword+",������", "ע��ɹ�");
				return "forward:/login.jsp";
			} 
		}
		//ע��ʧ��
		return "forward:/register.jsp";
	}

	// ������֤�����ɷ���
	@ResponseBody
	@RequestMapping(value = "/random.htm", method = RequestMethod.POST)
	public int random(String email) {
		int random = (int) (100000 + Math.random() * 100000);
		MailUtil.sendEmail(email, "��ǰ��֤��Ϊ:" + random + ";30������Ч���뼰ʱע�ᣡ", "��֤��");
		System.out.println(random);
		return random;
	}

	// ��ȡһ���û���Ϣ
	@RequestMapping(value = "oneuser", method = RequestMethod.GET)
	public String oneuser(String uid, HttpServletRequest req) {

		return "";
	}

	// �޸��û���Ϣ
	@RequestMapping(value = "updateuser", method = RequestMethod.POST)
	public String updateuser(String uid, String photo, String phone, String email, HttpServletRequest req) {

		return "";
	}

	// ��ѯ�����û�
	@RequestMapping(value = "alluser", method = RequestMethod.GET)
	public String alluser(HttpServletRequest req) {

		return "";
	}

	// ɾ��һ���û�
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
