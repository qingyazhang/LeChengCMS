<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'PublishNewsFisrtView.jsp' starting page</title>
<c:if test="${sessionScope.name == null}" >
		<c:redirect url="LoginJsp.jsp"/>
</c:if>
  </head>
  
  <body>
   <form id = "f1" action="servlet/LmSelectServlet" method="post">
   </form>
   <script type="text/javascript" language="javascript">
   		var f = document.getElementById("f1");
   		f.submit();
   </script>
  </body>
</html>
