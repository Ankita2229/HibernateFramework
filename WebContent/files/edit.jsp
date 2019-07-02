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
<form method="post" action="<%=request.getContextPath()%>/Controller">



UserName: :

<input type="text" name="Username" value="${i.u_name }"><br>

Password: :

<input type="text" name="Password" value="${i.pass }"><br>

<input type="hidden" name="id" value="${i.data_Id}">
                                            
<input type="hidden" name="flag" value="update">

<input type="Submit" name="submit" value="Update">

<br><br><br>


<a href="<%=request.getContextPath()%>/Controller?flag=searchData">Click Here to View data list</a>

</form>
</c:forEach>

</body>
</html>