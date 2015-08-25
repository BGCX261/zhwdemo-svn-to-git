<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/views/common/tags.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title></title>
    <%@ include file="/WEB-INF/views/common/header.jsp" %> 
    
    <script type="text/javascript">
    
    
    </script>   
  </head>
  
  <body>
     <form action="<c:url value="/action/bankuser?act=changePwd"/>" method="post" onsubmit="return validateForm();">
     </form>   
  </body>
</html>
