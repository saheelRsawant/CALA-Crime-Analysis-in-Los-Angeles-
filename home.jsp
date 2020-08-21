<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Crime Analysis in Los Angeles</h1>
<br><br><br>
<!-- <h3 align="center"><a href="Query1.jsp">Query 1</a></h3> -->
<h3 align="center"><a href="<%=request.getContextPath()%>/Controller?action=Query1">Victim Count</a></h3>
<br>
<h3 align="center"><a href="<%=request.getContextPath()%>/Controller?action=Query2">Top 10 Areas</a></h3>
<br>
<h3 align="center"><a href="<%=request.getContextPath()%>/Controller?action=Query3">Execute Query 3</a></h3>
<br>
<h3 align="center"><a href="<%=request.getContextPath()%>/Controller?action=Query4">Execute Query 4</a></h3>
<br>
<h3 align="center"><a href="<%=request.getContextPath()%>/Controller?action=Query5">Execute Query 5</a></h3>
<br><br>
</body>
</html>