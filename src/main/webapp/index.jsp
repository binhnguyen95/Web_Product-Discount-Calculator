<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<form method = "post" action = "/display-discount">
    <label>Product Description: </label><br/>
    <input type="text" name = "description" placeholder="Product Description"/><br/>

    <label>List Price: </label><br/>
    <input type="text" name = "price" placeholder="List Price"/><br/>

    <label>Discount Percent: </label><br/>
    <input type="text" name = "discount" placeholder="Discount Percent"/><br/> <br/>

    <input type = "submit" id = "submit" value = "Calculate Discount"/>
</form>
</body>
</html>