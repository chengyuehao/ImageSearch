<%--
  Created by IntelliJ IDEA.
  User: xc
  Date: 2017/9/6
  Time: 9:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Image　upload</title>
    <script src="/js/previewImage.js"></script>
 <%--   <script src="show.jsp"></script>--%>

</head>
<body>
    <div class="yanzRight">
        <input style="margin-top:5px;float: left;" id="st18" name="evidence" onchange="singleImagePreview(this,5)" type="file" />
        <span class="dui" id="imgOrder_dui" style="display: none;"></span>
    </div>
    
    <div id="preview5" style="margin-left:150px;clear:both; padding-top:15px;">
        <img src="" alt="" id="imghead5" height="200" width="200" style="display:none;" />
    </div>

    <div  style="margin :0px auto; width:990px;">
        <form method="post" action="/UploadServlet" enctype="multipart/form-data">
            <input type="file"   name="uploadFile" id="doc" multiple="multiple"  style="width:150px;" onchange="javascript:multiImagePreviews();" accept="image/*" />
            <input type="submit" value="上传文件">
            <div id="dd" style=" width:990px;"></div>
            <dialog style="margin-bottom: auto">仅仅测试使用</dialog>
            <dialog style> </dialog>


        </form>

        <%--<form method="get" action=""--%>



    </div>
    <script >
        function  loadMessage() {
            var message;
            message = new XMLHttpRequest();
            message.onreadystatechange = function () {
                if (message.readyState == 4 && message.status==200)
                {
                    document.getElementById("mydiv").innerHTML=message.responseText;
                }

            }
            message.open("GET","/fail.jsp" , true);
            message.send();
        }
    </script>
    <div id = "mydiv" >
        <h2>change</h2>
    </div>
    <button type="button" onclick="loadMessage()" >修改一下</button>

    <img src="tools/show.jsp">
    <img src="tools/show.jsp">
    <img src="tools/show.jsp">



</body>
</html>
