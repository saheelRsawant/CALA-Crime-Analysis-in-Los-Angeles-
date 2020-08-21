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
   <h5>Time Occurred</h5>	
    <select name="crimeCodeDesc" size="3" multiple>
   <option value="00to07">12 AM to 7AM</option>
   <option value="07to12">7AM to 12PM</option>
   <option value="12to19">12PM to 7PM</option>
   <option value="19to24">7PM to 2359PM</option>
 </select>
 <br><br> 
  </p>
 <p>
    <h5>Status Description</h5>	
    <select name="statusDescription" size="10" multiple>
   <option value="invest-cont">Investigation-Continued</option>
   <option value="adultArrest">Adult Arest</option>
   <option value="juvArrest">Juv Arrest</option>
 
 </select>
 <br><br>
 </p>
 <p>
   <h5>Descent</h5>	
    <select name="descent" size="5" multiple>
   <option value="white">White</option>
   <option value="black">Black</option>
   <option value="hispanic">Hispanic</option>
   <option value="asian">Asian</option>
 </select>
 <br><br>  </p>
   <button>Submit</button>
   <a href="Query4">Click me!</a>
</form>

 -->	
	<%
		ArrayList<Query_Output> queries = (ArrayList<Query_Output>) request.getAttribute("Query5");
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
			<td>Area:</td>
			<td><%=q.getStr1()%></td>
		</tr>
		<%}}}else { %><h2>No records Found!</h2><% } %>
	</table>
</body>
</html>