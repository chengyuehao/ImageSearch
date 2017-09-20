package com.cheng.servlet;

import com.sun.deploy.net.HttpRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ImageAction extends HttpServlet{
    private static final long serialVersionUID = -1l;

    public void doGet (HttpRequest request , HttpServletResponse response) throws ServletException , IOException{
        this.doPost(request , response);


    }

    public void doPost (HttpRequest request , HttpServletResponse response) throws  ServletException , IOException{
        //读取本地图片
        FileInputStream inputStream = new FileInputStream("");
        int i = inputStream.available();
        //byte 用于存放图片字节数据
        byte[] buff = new byte[i];
        inputStream.read(buff);
        inputStream.close();
        response.setContentType("image/*");
        OutputStream out = response.getOutputStream();
        out.write(buff);
        out.close();
    }

}
