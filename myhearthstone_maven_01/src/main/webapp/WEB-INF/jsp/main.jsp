<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@include file="../jsp/taglib.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<%@include file="../jsp/script_css.jsp"%>

<script type="text/javascript">
 		
        $(document).ready(function () {
        	
        	$('#cards').hide(); 
        	
            $("#cards").dataTable({
                "sPaginationType": "full_numbers",
                "bJQueryUI": true               
            });
            
            $('#cards').show();	
            
            
        });
        
 </script>
<title>My Hearthstone</title>
</head>
<body>
	<%@include file="../jsp/login.jsp"%>
	<%@include file="../jsp/menu.jsp"%>
	<%@include file="../jsp/cardlist.jsp"%>
</body>
</html>