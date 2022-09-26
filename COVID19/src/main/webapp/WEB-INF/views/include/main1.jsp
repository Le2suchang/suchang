<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix= "fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false"%>

<style>
.main{
	margin: 10px 0px 0px 230px;
}

</style>

<section class="main">
	<article>
		<table class="table table-border">
			<tr>
				<th>TODAY</th>
				<th>TOTAL</th>
				<th>INFECT_TOTAL</th>
				<th>INFECTED</th>
				<th>RELEASED</th>
				<th>DEAD</th>
				<th>CHECKED</th>
				<th>NEGATIVE</th>
			</tr>
			
			<c:forEach items="${list}" var="DomesticVO">
			
			<tr>
				<td><fmt:formatDate pattern="yyyy-MM-dd" value="${DomesticVO.today }"/></td>
				<td>${DomesticVO.total }</td>
				<td>${DomesticVO.infect_total }</td>
				<td>${DomesticVO.infected }</td>
				<td>${DomesticVO.released }</td>
				<td>${DomesticVO.dead }</td>
				<td>${DomesticVO.checked }</td>
				<td>${DomesticVO.negative }</td>
			</tr>	
			
			</c:forEach>
			
		</table>
	</article>
</section>
