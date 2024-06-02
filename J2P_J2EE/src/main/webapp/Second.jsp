
<%@ include file="./Fragments/header.html" %>
	<main>
		<h1>This is Second JSP Page.</h1>
		<!--  <a href="Third.jsp">Go...</a>-->
		<%-- <jsp:include page="Third.jsp"></jsp:include>--%>
		
		<jsp:forward page="Third.jsp"></jsp:forward>
	</main>

	

<%@ include file="./Fragments/footer.html" %>
	

