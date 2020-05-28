<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/5/2020
  Time: 4:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<form method="get" action="${pageContext.request.contextPath}/dictionary">
    EnglishWord :
    <input name="englishWord" type="text" placeholder="EnglishWord" >
    <input type="submit" value="dictionary" name="dictionary">

</form>
</body>
</html>
