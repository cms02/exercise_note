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
function reqbodytest(){
var info ={
		"id" : $("#id").val(),
		"name" : $("#name").val(),
		"age" : $("#age").val()
};

$.ajax({
	type : "POST",
	url  : "testRequestBody",
	async : true,
	data : JSON.stringify(info),
	dataType:"json",
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
		
		<input type="button" value="gogobody" onclick="reqbodytest()"/>
		
<h2>@RequestParam</h2>

<label>ID2: </label>
		<input type="text" name="id2" id="id2"/> 
		</div>
		<div>
		<label>NAME2: </label>
		<input type="text" name="name2" id="name2" />
		</div>
		<div>
		<label>AGE2: </label>
		<input type="text" name="age2" id="age2"/>
		</div>
		
		<input type="button" value="gogoparam" onclick="reqparamtest()"/>














</body>
</html>