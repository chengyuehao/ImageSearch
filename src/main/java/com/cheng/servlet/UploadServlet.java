package com.cheng.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class UploadServlet extends HttpServlet {
    private static final  long serivlVersionUID = 1L;
    //设置上传文件存储目录
    private static final String UPLOAD_DIRECTORY = "upload";

    //上传配置
    private static final int MEMORY_THRESHOLD = 1024 *1024 * 3 ; //3MB
    private static final int MAX_FILE_SIZE = 1024 * 1024 * 40 ; //40MB
    private static final int MAX_REQUEST_SIZE = 1024 * 1024 * 50 ; //50MB

    /**
     * 上传数据及保存文件
     */
    protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
        //判断是否为多媒体文件
        if ( !ServletFileUpload.isMultipartContent (request)){
            //如果不是就停止
            PrintWriter writer = response.getWriter();
            //PrintWriter
            writer.println();
            writer.println("Error: 表单必须包含 enctype=multipart/form-data");
            writer.flush();
            return;
        }
        //配置上传参数
        DiskFileItemFactory factory = new DiskFileItemFactory();
        factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

        ServletFileUpload upload = new ServletFileUpload(factory);

        //设置文件上传最大值
        upload.setFileSizeMax(MAX_FILE_SIZE);

        //设置最大请求值
        upload.setSizeMax(MAX_REQUEST_SIZE);

        //中文处理
        upload.setHeaderEncoding("utf-8");

        //构造临时路径来存储上传文件
        //这个路径相对前应用的目录
        String uploadPath = getServletContext().getRealPath("./") + File.separator + UPLOAD_DIRECTORY;

        //目录不存在就重建一个
        File uploadDir = new File(uploadPath);
        if ( !uploadDir.exists()) {
            uploadDir.mkdir();
        }
        try {
            //解析请求的内容，提取文件数据
            @SuppressWarnings("unchecked")
            List<FileItem> formItems = upload.parseRequest(request);

            if (formItems != null && formItems.size() > 0 ){
                //迭代表单中的数据
                for (FileItem item : formItems){
                    String fileName = new File(item.getName()).getName();
                    String filePath = uploadPath + File.separator + fileName ;
                    File storeFile = new File( filePath );
                    //在控制台中输出文件的上传路径
                    System.out.println(filePath);
                    item.write(storeFile);
                    request.setAttribute("message,,," , "文件上传成功");

                }
            }
        } catch (Exception e) {
            request.setAttribute("message" , "错误信息" +  e.getMessage());
        }
        getServletContext().getRequestDispatcher("/message.jsp").forward(request , response);
    }


}
