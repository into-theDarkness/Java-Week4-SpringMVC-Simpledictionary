<%--
  Created by IntelliJ IDEA.
  User: duc
  Date: 19/11/2019
  Time: 00:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SimpleDictionary</title>
</head>
<body>
<form action="convert">
    Words:<br>
    <input type="text" name = "words" placeholder="Enter your word:"><br>
    <input type="submit" value="Convert"><br>
    <h1>${result}</h1>

</form>
</body>
</html>
