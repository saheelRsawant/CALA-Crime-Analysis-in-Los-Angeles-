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
	<h5>Area Name</h5>	
	<select name="areaName" size="10" multiple>
  <option value="hollywood">Hollywood</option>
  <option value="WestLA">West LA</option>
  <option value="Central">Central</option>
  <option value="N-east">North East</option>
  <option value="S-east">South East</option>
  <option value="Newton">Newton</option>
  <option value="Pacific">Pacific</option>
  <option value="Rampart">Rampart</option>
  <option value="77thST">77th Street</option>
  <option value="Hollenbeck">HollenBeck</option>
</select>
		  <br><br>
</p>
<p>
   <h5>Premise Description</h5>	
   <select name="premiseDesciption" size="10" multiple>
  <option value="Street">Street</option>
  <option value="parkingLot">Parking Lot</option>
  <option value="sidewalk">Side Walk</option>
  <option value="departmentStore">Department Store</option>
  <option value="hospital">Hostpital</option>
  <option value="postOffice">PostOffice</option>
  <option value="jewelleryStore">Jewellery Store</option>
  <option value="otherBusiness">Other Business</option>
  <option value="market">Market</option>
</select>
<br><br>
</p>
<p>
  <h5>Crime Name</h5>	
   <select name="crimeCodeDesc" size="5" multiple>
  <option value="bulgaryFromVehicle">Bulglary From Vehicle</option>
  <option value="vehicle-Stolen">Stolen-Vehicle</option>
  <option value="robbery">Robbery</option>
  <option value="tresspassing">Tress passing</option>
</select>
<br><br>  </p>
<p>
  <h5>Time Occured</h5>	
   <select name="crimeCodeDesc" size="3" multiple>
  <option value="00to07">12 AM to 7AM</option>
  <option value="07to12">7AM to 12PM</option>
  <option value="12to19">12PM to 7PM</option>
  <option value="19to24">7PM to 2359PM</option>
</select>
<br><br> 
 </p>


  <button>Submit</button>
  <a href="Query3">Click me!</a>
</form>
 -->
	<%
		ArrayList<Query_Output> queries = (ArrayList<Query_Output>) request.getAttribute("Query3");
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
			<td>Crime Type:</td>
			<td><%=q.getStr2()%></td>
		</tr>
		<tr>
			<td>Premise :</td>
			<td><%=q.getStr3()%></td>
		</tr>
		<%}}}else { %><h2>No records Found!</h2><% } %>
	</table>
</body>
</html>