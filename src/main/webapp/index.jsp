<%-- 
    Document   : index
    Created on : 25/08/2018, 09:48:49 AM
    Author     : corre_000
--%>

<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:form action="loginst">
<s:textfield name="userDto.name" label="Name"></s:textfield>
<s:password name="userDto.password" label="Password"></s:password>
<s:submit value="login"></s:submit>
</s:form>