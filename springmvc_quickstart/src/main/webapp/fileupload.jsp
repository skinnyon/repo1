<%--
  Created by IntelliJ IDEA.
  User: zhangxin
  Date: 8/15/21
  Time: 4:32 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="${pageContext.request.contextPath}/file/fileUpload" method="post" enctype="multipart/form-data">
        名称： <label>
        <input type="text" name="username">
    </label><br>
        文件： <input type="file" name="filePic"><br>
            <input type="submit" value="提交"/>
    </form>

    <h1>多文件上传</h1>
    <form action="${pageContext.request.contextPath}/file/filesUpload" method="post" enctype="multipart/form-data">
        名称： <label><input type="text" name="username"></label><br>
        文件1： <input type="file" name="filePic"><br>
        文件2： <input type="file" name="filePic"><br>
        文件3： <input type="file" name="filePic"><br>

        <input type="submit" value="提交"/>
    </form>

</body>
</html>
