<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table id="example" cellspacing="0" width="100%">
     <thead>
									<tr>
									<th>User Name</th>
								    <th>Password</th>
												
									</tr>
    </thead>
    
    			<tbody>
									<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
									<c:forEach items="${sessionScope.dataList }" var="x">
									<tr>
												
                                            	
                                            	
                                            	<td>${x.u_name }</td>
                                            	<td>${x.pass }</td>

										<td><a href="<%=request.getContextPath()%>/Controller?flag=edit&dataId=${x.data_Id}">Edit</a> / <a href="<%=request.getContextPath()%>/Controller?flag=delete&dataId=${x.data_Id}">Delete</a></td>
                                            	
									</tr>
									</c:forEach>
								</tbody>


</table>

</body>
</html>