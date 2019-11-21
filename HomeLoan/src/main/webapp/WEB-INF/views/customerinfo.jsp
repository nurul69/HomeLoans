<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	 <form action="loan" method="post" modelAttribute="customer">
		
		<input type="text" name="c_firstname" placeholder="First Name"/>
		<input type="text" name="c_lastname" placeholder="Last Name" />
		<input type="text" name="c_dob" />
		<input type="text" name="c_gender" placeholder="Gender">
	    <input type="text" name="c_email" placeholder="Email" />
		<input type="text" name="c_phone" placeholder="Mobile No."/>
		<input type="text" name="c_address" placeholder="Address" />
		<input type="text" name="c_city" placeholder="City" />
		<input type="text" name="c_state" placeholder="State" />
		<input type="number" name="c_zipcode" placeholder="ZipCode"/> 
		
		
		<input type="submit" value="Next" />
	
	</form>

</body>
</html>