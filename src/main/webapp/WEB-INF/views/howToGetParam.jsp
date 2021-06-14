<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="./resources/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	function requestBodyTest() {
		var info = {
			"id" : $("#id").val(),
			"name" : $("#name").val(),
			"age" : $("#age").val()
		};

		$.ajax({
			type : "POST",
			url : "testRequestBody",
			async : true,
			data : JSON.stringify(info),
			dataType : "json",
			contentType : "application/json;charset=UTF-8",
			success : function(data) {
				alert(data.home);
			},
			error : function(error) {
				console.log(error);
			}
		});
	}

	function reqestParamTest() {
		var info2 = {
			"id" : $("#id2").val(),
			"name" : $("#name2").val(),
			"age" : $("#age2").val()
		};

		$.ajax({
			type : "POST",
			url : "testRequestParam?id=gg&name=ggggg&age=14",
			async : true,
			data : JSON.stringify(info2),
			dataType : "json",
			contentType : "application/json;charset=UTF-8",
			success : function(data) {
				alert("성공");
			},
			error : function(error) {
				console.log(error);
			}
		});
	}
</script>
<body>
	<h1>Controller 에서 Parameter 어떻게 받을까?</h1>

	<h2>@RequestBody</h2>
<!-- 	<div>
		<label>ID: </label> <input type="text" name="id" id="id" />
	</div>
	<div>
		<label>NAME: </label> <input type="text" name="name" id="name" />
	</div>
	<div>
		<label>AGE: </label> <input type="text" name="age" id="age" />
	</div>

	<input type="button" value="goRequestBody" onclick="requestBodyTest()" /> -->
	
	<form action="testRequestBody">
	<label>ID: </label> <input type="text" name="id" id="id" />
	<label>NAME: </label> <input type="text" name="name" id="name" />
	<label>AGE: </label> <input type="text" name="age" id="age" />
	<input type="submit" value="formSubmit"/>
	</form>






	<h2>@RequestParam</h2>

<!-- 	 <form action="testRequestParam">
<label>ID2: </label>
		<input type="text" name="id" id="id2"/> 
		<div>
		<label>NAME2: </label>
		<input type="text" name="name" id="name2" />
		</div>
		<div>
		<label>AGE2: </label>
		<input type="text" name="age" id="age2"/>
		</div>
		
		<input type="submit" value="gogoparam" />

</form>  -->

	<label>ID2: </label>
	<input type="text" name="id" id="id2" />
	<div>
		<label>NAME2: </label> <input type="text" name="name" id="name2" />
	</div>
	<div>
		<label>AGE2: </label> <input type="text" name="age" id="age2" />
	</div>

	<input type="button" value="goRequestParam" onclick="reqestParamTest()" />












</body>
</html>