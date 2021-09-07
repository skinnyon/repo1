<%--
  Created by IntelliJ IDEA.
  User: zhangxin
  Date: 8/12/21
  Time: 9:55 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>基本数据类型</h1>
<a href="${pageContext.request.contextPath}/user/quick?id=1&username=zhangsan">基本数据类型</a>

<h1>pojo</h1>
<form action="${pageContext.request.contextPath}/user/pojoParam" method="post" >
    编号：<input type="text" name="id">
    姓名：<input type="text" name="username">
    <input type="submit" value="对象类型">
</form>
<h1>数组</h1>
<form action="${pageContext.request.contextPath}/user/arrayParam" method="post" >
    编号：<input type="checkbox" name="ids" value="1">
    编号：<input type="checkbox" name="ids" value="2">
    编号：<input type="checkbox" name="ids" value="3">
    编号：<input type="checkbox" name="ids" value="4">
    <input type="submit" value="数组">
</form>
<h1>复杂类型</h1>
<form action="${pageContext.request.contextPath}/user/queryVo" method="post" >
    关键字：<input type="text" name="keyword"><br>
    user对象：
    <input type="text" name="user.id">
    <input type="text" name="user.username"><br>
    list集合
    <input type="text" name="userList[0].id">
    <input type="text" name="userList[0].username"><br>
    map集合
    <input type="text" name="userMap['key1'].id">
    <input type="text" name="userMap['key1'].username">

    <input type="submit" value="复杂类型">
</form>
<h1>自定义类型转换</h1>
<form action="${pageContext.request.contextPath}/user/queryVo" method="post" >
    日期：<input type="text" name=birthday>
    <input type="submit" value="日期">
</form>

<a href="${pageContext.request.contextPath}/user/findByPage?pageNo=2">
    分页查询
</a>

<% System.out.println("视图执行成功...");%>


</body>
</html>
