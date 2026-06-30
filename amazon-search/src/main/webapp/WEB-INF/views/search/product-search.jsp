<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Products</title>

<style>
body{
    margin:0;
    font-family: Arial, sans-serif;
    background-color:#f3f3f3;
}

.container{
    width:500px;
    margin:100px auto;
    background:#fff;
    padding:30px;
    border-radius:8px;
    box-shadow:0 2px 8px rgba(0,0,0,0.15);
    text-align:center;
}

h2{
    color:#131921;
    margin-bottom:20px;
}

input[type="text"]{
    width:250px;
    padding:10px;
    border:1px solid #ccc;
    border-radius:4px;
}

input[type="submit"]{
    background:#FFD814;
    color:#111;
    border:none;
    padding:10px 20px;
    border-radius:20px;
    cursor:pointer;
    font-weight:bold;
}

input[type="submit"]:hover{
    background:#F7CA00;
}
</style>

</head>
<body>

<div class="container">
    <h2>Search Products</h2>

    <form action="searchProduct" method="get">
        Search Product :
        <input type="text" name="searchText">
        <input type="submit" value="Search">
    </form>
</div>

</body>
</html>