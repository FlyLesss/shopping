package com.lvxiao.shopping.util;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class FileUtil {
	
	//上传文件
	public static String saveFile(MultipartFile file,HttpServletRequest request,String dir) {  
        // 判断文件是否为空  
        if (!file.isEmpty()) {  
            try {  
                // 文件保存路径  
                String filePath = request.getSession().getServletContext().getRealPath("/") + dir+"/" 
                        + file.getOriginalFilename();  
                // 转存文件  
                file.transferTo(new File(filePath));  
                return filePath;  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  
        return "";  
    }  
}
