<%@ page import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
        <c:forEach items="${all}" var="a">
            ${a}
        </c:forEach>
<%--        在页面简单输出了查询的结果--%>
</body>
</html>