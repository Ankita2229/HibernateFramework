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
												<th>Name</th>
												<th>Number</th>
												<th>Address</th>
												<th>Email-id</th>
												<th>Product</th>
												<th>Quantity</th>
                                                <th>Payment mode</th>
                                                <th>Action</th>
												
									</tr>
    </thead>
    
    <tbody>
									<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
									<c:forEach items="${sessionScope.dataList }" var="x">
									<tr>
												<td>${x.ur_name }</td>
                                            	<td>${x.ph_no }</td>
                                            	<td>${x.h_ad }</td>
                                            	<td>${x.elec_id }</td>
                                            	<td>${x.item }</td>
                                            	<td>${x.quos }</td>
                                            	<td>${x.money }</td>	
                                            	
                                            	

										<td><a href="<%=request.getContextPath()%>/CLASS_Controller?flag=edit&dataId=${x.data_Id}">Edit</a> / <a href="<%=request.getContextPath()%>/CLASS_Controller?flag=delete&dataId=${x.data_Id}">Delete</a></td>
                                            	
									</tr>
									</c:forEach>
								</tbody>


</table>

</body>
</html>


