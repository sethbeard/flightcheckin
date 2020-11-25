<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="http://localhost:8080/flightreservation/showReg"><button>Click Here To Register</button></a>
<br>
<button onclick="goBack()">Click Here To Go Back</button>

<script>
function goBack() {
  window.history.back();
}
</script> 
</body>
</html>