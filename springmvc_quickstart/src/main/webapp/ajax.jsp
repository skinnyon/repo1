<%--
  Created by IntelliJ IDEA.
  User: zhangxin
  Date: 8/15/21
  Time: 1:31 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <script src="${pageContext.request.contextPath}/js/jquery-3.5.1.js"></script>
    <!--ajax-->
    <button id="btn1">ajax异步交互</button>

    <script>
        $("#btn1").click(function () {
            let url = '${pageContext.request.contextPath}/user/ajaxRequest';
            let data = '[{"id":1, "username":"zs"},{"id":2, "username":"ls"}]';

            $.ajax({
                type: 'POST',
                url: url,
                data: data,
                contentType: 'application/json;charset=utf-8',
                success: function (res) {
                    alert(url);
                    console.log(JSON.stringify(res))
                }
            })

        })
    </script>
</body>
</html>
