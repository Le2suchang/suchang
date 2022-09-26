<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="header.jsp"/>
<style>
.blind {overflow: hidden; visibility: hidden;}
</style>
</head>
<body>
<jsp:include page="nav.jsp"/>
<div class="container">
    ${weather_info }
</div>
<script>
$(document).ready(function() {
    drawTable();
});
 
function drawTable() {
    $(".tbl_weather").attr("clss", "table");
}
</script>
</body>
</html>
