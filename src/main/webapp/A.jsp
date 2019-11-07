<%@page pageEncoding="UTF-8" isELIgnored="false" contentType="text/html;utf-8" %>
<html>
<head>

</head>
<body>
    <form action="${pageContext.request.contextPath}/first/A.do" method="post">
        用户名:<input type="text" name="username">
        <input type="submit" value="提交">
    </form>

</body>
</html>