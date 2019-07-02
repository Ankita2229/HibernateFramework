<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Place Order</title>

	
    <link rel="stylesheet" href="css/reset.css">

    <link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900|RobotoDraft:400,100,300,500,700,900'>
<link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>

        <link rel="stylesheet" href="css/style.css">   
</head>

<body>
<div class="pen-title">
  <h1>Your Cart</h1>
</div>
<div class="container">
  <div class="card"></div>
  <div class="card">
    <h1 class="title">Details</h1>
    <form action="<%=request.getContextPath()%>/CLASS_Controller" method="post">
      <div class="input-container">
        <input type="text" name="person_name" required="required"/>
        <label for="person_name"> Name</label>
        <div class="bar"></div>
      </div>
      <div class="input-container">
        <input type="text" name="mob_num" required="required"/>
        <label for="mob_num"> Number</label>
        <div class="bar"></div>
      </div>
      <div class="input-container">
        <input type="text" name="home_add" required="required"/>
        <label for="home_add"> Address</label>
        <div class="bar"></div>
      </div>
      <div class="input-container">
        <input type="text" name="e-id" required="required"/>
        <label for="e-id"> E-mail</label>
        <div class="bar"></div>
      </div>
      <div class="input-container">
        <input type="text" name="p_name" required="required"/>
        <label for="p_name"> Product name</label>
        <div class="bar"></div>
      </div>
      <div class="input-container">
        <input type="text" name="quant" required="required"/>
        <label for="quant"> Quantity</label>
        <div class="bar"></div>
      </div>
      <div class="input-container">
        <input type="text" name="p_mode" required="required"/>
        <label for="p_mode"> Payment Method</label>
        <div class="bar"></div>
      </div>
      
      <div class="button-container">
      
      <a href="<%=request.getContextPath()%>/CLASS_Controller?flag=searchData">Click Here to View data list</a>
        <input type="hidden" value="insert" name="flag">
        <input type="Submit" name="submit" value="Insert"><br>
        <button><span>Go</span></button>
      </div>
      
    </form>
  </div>
  
    
  </div>


</body>
</html>