<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach items="${sessionScope.editData}" var="i">
<form method="post" action="<%=request.getContextPath()%>/CLASS_Controller">

Name: :

<input type="text" name="name" value="${i.ur_name }"><br>

Number: :

<input type="text" name="number" value="${i.ph_no }"><br>

Address: :

<input type="text" name="address" value="${i.h_ad }"><br>

Email_id: :

<input type="text" name="email-id" value="${i.elec_id }"><br>

Product_name: :

<input type="text" name="p_name" value="${i.item }"><br>

Quantity: :

<input type="text" name="quant" value="${i.quos }"><br>

Payment-mode: :

<input type="text" name="payment_mode" value="${i.money }"><br>


<input type="hidden" name="id" value="${i.data_Id}">
                                            
<input type="hidden" name="flag" value="update">

<input type="Submit" name="submit" value="Update">

<br><br><br>


<a href="<%=request.getContextPath()%>/CLASS_Controller?flag=searchData">Click Here to View data list</a>

</form>
</c:forEach>

</body>
</html>