<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/1 0001
  Time: 下午 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>成功了</h1>
 ${list}
<c:forEach items="${list}" var="account">
    ${account.name}
    ${account.money}
</c:forEach>
</body>
</html>
