<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<link rel="stylesheet" type="text/css" href="loan.css">

<body>

<h3>Property And Loan Details</h3>

<div>
  <form action="userupdated" method="post" modelAttribute="loan">
    <label >Loan Amount</label>
    <input type="number" name="l_amount" placeholder="Enter loan amount..">

    <label >Rate Of Interest</label>
    <input type="number" name="l_roi" value="8.5">
    
    <label >Tenure</label>
    <input type="number" name="l_tenure" placeholder="Enter number of years..">

    <label>Purpose Of Loan</label>
   <!--  <select name="l_purpose" type="text">
      <option value="Purchase of an identified property">Ready possession flat</option>
      <option value="Purchase of a plot for construction">Plot</option>
    </select> -->
    <input type="text" name="l_purpose" placeholder="Purpose">
    
   <label >Property Name</label>
    <input type="text" name="l_property_name" placeholder="Enter the property name..">
    
    <label >Property Location</label>
    <input type="text" name="l_property_loc" placeholder="Enter the property location..">
    
    <label >Property Cost</label>
    <input type="number" name="l_property_cost" placeholder="Enter the property cost..">
    
    <label >EMI</label>
    <input type="number" name="l_emi" placeholder="Enter the property cost..">
    
    <input type="submit" name="next" value="Next">
  </form>
</div>

</body>
</html>
