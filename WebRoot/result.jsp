<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>result.jsp</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<div align="center">
	<form action="search" target="_self"> 
<input name="query" size="44" baiduSug=1 style="font-size: 18pt"  baiduSug="1" value="<s:property value="#parameters.query"/>">
&nbsp;<input type="submit" value="好" style="font-size: 14pt">
</form><hr>
</div>
	<s:iterator value="set" id="set">
		<div>
			<a href="<s:property value="#set.url"/>" target=_blank><s:property value="#set.title" /></a><br>
			<s:property value="#set.content" escape="false"/><br>			
		</div>
		<hr><br>
	</s:iterator>
</body>
</html>
