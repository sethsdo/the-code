<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<p>${error}</p>
		<form action='/check' method='post'>
	        <div class="form-group">
	            What is the Code?
	            <input type='text' class="form-control" id="code" name='code'>
	        </div>
	        <button type="submit" class="btn btn-default">Try Code</button>
	    </form>
    </div>
</body>
</html>