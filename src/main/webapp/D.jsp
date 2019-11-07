<%@page pageEncoding="UTF-8" isELIgnored="false" contentType="text/html;utf-8" %>
<html>
<head>

</head>
<body>
    <form action="${pageContext.request.contextPath}/first/D.do" method="post">
        爱好:   抽烟<input type="checkbox" name="hobby" value="1">
                喝酒<input type="checkbox" name="hobby" value="2">
                烫头<input type="checkbox" name="hobby" value="3">
        <input type="submit" value="提交">
    </form>

</body>
</html>