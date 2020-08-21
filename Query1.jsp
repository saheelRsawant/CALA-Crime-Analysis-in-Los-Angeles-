<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%><%@ page
	import="java.util.ArrayList,com.bean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Crime Analysis in Los Angeles</h1><!-- 
	<form>
 <p>	
    <fieldset>
      <legend>Gender<abbr title="This field is mandatory" aria-label="required">*</abbr></legend>
        <input type="radio" required name="gender" id="r1" value="yes"><label for="r1">Male</label>
        <input type="radio" required name="gender" id="r2" value="no"><label for="r2">Female</label>
    </fieldset>
  </p>
  <p> 
      <h5>Select age</h5>	
      <select name="Age" size="3">
                <option value="1-14">1-14</option>
                <option value="15-30">15-30</option>
                <option value="31-80">31-80</option>
      </select>
            <br><br>
 </p>
  <p>
     <h5>Select Area</h5>	
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
    <h5>Select WeaponType</h5>	
     <select name="weaponName" size="5" multiple>
    <option value="knife">Knife</option>
    <option value="sword">Sword</option>
    <option value="handGun">HandGun</option>
    <option value="StrongArm">StrongArm</option>
  </select>
  <br><br>  </p>
    <button>Submit</button>
    <a href="GetDataServlet">Click me!</a>
</form> -->
	<%
		ArrayList<Query_Output> queries = (ArrayList<Query_Output>) request.getAttribute("Query1");
	%>
	<%
		if (queries != null && queries.size() != 0) {
	%>
	<table border = "1">
	<tr>
      <th>Victim Age</th>
      <th>Case Count</th>
    </tr>
	<%
		for (Query_Output q : queries) {
	%>
	<%
		if(q != null){
	%>
    <tr>
      <td align="center"><%=q.getNum1()%></td>
      <td align="center"><%=q.getNum2()%></td>
    </tr>
    <%}}}else { %><h2>No records Found!</h2><% } %>
  </table>
</body>
</html>