package com.lvxiao.shopping.util;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class FileUtil {
	
	//�ϴ��ļ�
	public static String saveFile(MultipartFile file,HttpServletRequest request,String dir) {  
        // �ж��ļ��Ƿ�Ϊ��  
        if (!file.isEmpty()) {  
            try {  
                // �ļ�����·��  
                String filePath = request.getSession().getServletContext().getRealPath("/") + dir+"/" 
                        + file.getOriginalFilename();  
                // ת���ļ�  
                file.transferTo(new File(filePath));  
                return filePath;  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  
        return "";  
    }  
}
