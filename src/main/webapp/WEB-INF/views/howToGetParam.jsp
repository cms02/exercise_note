<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">

</script>
<body>
<h1>Controller 에서 Parameter 어떻게 받을까?</h1>

<h2>@RequestBody</h2>
	<form action="htgpRequestBody" method="POST">
		<div>
		<label>ID: </label>
		<input type="text" name="id" /> 
		</div>
		<div>
		<label>NAME: </label>
		<input type="text" name="name" />
		</div>
		<div>
		<label>AGE: </label>
		<input type="text" name="age" />
		</div>
		
		<input type="submit" value="gogo">
	</form>
<h2>@RequestBody</h2>













</body>
</html>