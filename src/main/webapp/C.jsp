<%@page pageEncoding="UTF-8" isELIgnored="false" contentType="text/html;utf-8" %>
<html>
<head>

</head>
<body>
    <form action="${pageContext.request.contextPath}/first/C.do" method="post">
        用户名:<input type="text" name="name"><br/>
        年龄:<input type="text" name="age"><br/>
        生日:<input type="date" name="birthday"><br/>
        城市:<input type="text" name="address.city"><br/>
        街道:<input type="text" name="address.jiedao"><br/>
        <input type="submit" value="提交">
    </form>

</body>
</html>