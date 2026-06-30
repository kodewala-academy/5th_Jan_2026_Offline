<html>
<body>
	<h2>Zepto Product</h2>

	<!DOCTYPE html>
<html>
<head>
<title>Product Form</title>
</head>
<body>

	<h2>Add Product</h2>

	<form action="product/saveProduct" method="post">



		Product Name: <input type="text" name="productName"><br>
		<br> Description:
		<textarea name="description"></textarea>
		<br>
		<br> Price: <input type="number" step="0.01" name="price"><br>
		<br> Quantity: <input type="number" name="quantity"><br>
		<br> Category: <select name="category">
			<option value="Electronics">Electronics</option>
			<option value="Books">Books</option>
			<option value="Clothing">Clothing</option>
			<option value="Sports">Sports</option>
		</select><br>
		<br> <input type="submit" value="Save Product">

	</form>

	<a href="product/showSearchPage"> Search Product </a>

</body>
</html>
</body>
</html>

