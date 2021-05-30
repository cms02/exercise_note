<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"
	integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
	crossorigin="anonymous"></script>
<script type="text/javascript">
function reqtest(){
	
data ={
		"id" : $("#id").val(),
		"name" : $("#name").val(),
		"age" : $("#age").val()
};

$.ajax({
	type : "POST",
	url  : "htgpRequestBody",
	data : JSON.stringify(data),
	contentType : "application/json;charset=UTF-8",
	success 	: function(data) {
    },
    error		: function(error) {
    	console.log(error);
    }
});
}
</script>
<body>
<h1>Controller 에서 Parameter 어떻게 받을까?</h1>

<h2>@RequestBody</h2>
	<!-- <form action="" method="POST"> -->
		<div>
		<label>ID: </label>
		<input type="text" name="id" id="id"/> 
		</div>
		<div>
		<label>NAME: </label>
		<input type="text" name="name" id="name" />
		</div>
		<div>
		<label>AGE: </label>
		<input type="text" name="age" id="age"/>
		</div>
		
		<input type="button" value="gogo" onclick="reqtest()">
	<!-- </form> -->
<h2>@RequestBody</h2>













</body>
</html>