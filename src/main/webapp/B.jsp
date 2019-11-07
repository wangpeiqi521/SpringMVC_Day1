<%@page pageEncoding="UTF-8" isELIgnored="false" contentType="text/html;utf-8" %>
<html>
<head>

</head>
<body>
    <form action="${pageContext.request.contextPath}/first/B.do" method="post">
        用户名:<input type="text" name="name"><br/>
        年龄:<input type="text" name="age">
        <input type="submit" value="提交">
    </form>

</body>
</html>