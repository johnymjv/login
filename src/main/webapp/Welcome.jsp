<%-- 
    Document   : Welcome
    Created on : 21/08/2018, 06:42:15 PM
    Author     : corre_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:out value="${sessionScope.usuario.nombre}"></c:out>
        
        
        
        
    </body>
</html>
