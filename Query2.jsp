<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%><%@ page
	import="java.util.ArrayList,com.bean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Top 10 Areas</title>
</head>
<body>


<h1>Crime Analysis in Los Angeles</h1>
<!-- 
       <form>
  <p> 	
     <h5>Select WeaponType</h5>	
     <select name="weaponName" size="5" multiple>
    <option value="knife">Knife</option>
    <option value="sword">Sword</option>
    <option value="handGun">HandGun</option>
    <option value="StrongArm">StrongArm</option>
  </select>
      <h5>Top 10 area with selected weapon is outputed after clicking!</h5>
            <br><br>
     <a href="Query2">Click me!</a>
</form>
 -->	<%
		ArrayList<Query_Output> queries = (ArrayList<Query_Output>) request.getAttribute("Query2");
	%>
	<%
		if (queries != null && queries.size() != 0) {
	%>
	<%
		for (Query_Output q : queries) {
	%>
	<%
		if(q != null){
	%>
	<table>
		<tr>
			<td>Area Name:</td>
			<td><%=q.getStr1()%></td>
		</tr>
		<tr>
			<td>CaseNumber Count:</td>
			<td><%=q.getNum1()%></td>
		</tr>
		<%}}}else { %><h2>No records Found!</h2><% } %>
	</table>
</body>
</html>