<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
	   <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	   <title>Information</title>
	   <!-- BEGIN GLOBAL MANDATORY STYLES -->
	   <link href="http://www.keenthemes.com/preview/metronic/assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
	   <link href="http://www.keenthemes.com/preview/metronic/assets/plugins/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css">
	   <link href="http://www.keenthemes.com/preview/metronic/assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	   <link href="http://www.keenthemes.com/preview/metronic/assets/css/style-metro.css" rel="stylesheet" type="text/css">
	   <link href="http://www.keenthemes.com/preview/metronic/assets/css/style.css" rel="stylesheet" type="text/css">
	   <link href="http://www.keenthemes.com/preview/metronic/assets/css/style-responsive.css" rel="stylesheet" type="text/css">
	   <link href="http://www.keenthemes.com/preview/metronic/assets/css/themes/blue.css" rel="stylesheet" type="text/css" id="style_color">
	   <link href="http://www.keenthemes.com/preview/metronic/assets/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css">
	   <!-- END GLOBAL MANDATORY STYLES -->
	   <!-- BEGIN PAGE LEVEL STYLES --> 
	   <link rel="stylesheet" type="text/css" href="http://www.keenthemes.com/preview/metronic/assets/plugins/select2/select2_metro.css">
	   <!-- END PAGE LEVEL SCRIPTS -->	   
	</head>
	<body>	
		<div class="row-fluid">
			<div class="portlet box green" style="width:100%;float:left;">
		       <div class="portlet-title">
		          <div class="caption">
		          	<i class="icon-reorder"></i>Operação efetuada!!!
		          </div>
		       </div>
		    </div>
			<br />
			<form:form method="POST" action="${pageContext.request.contextPath}/" align="center">
				<button type="submit" class="btn blue" >
					<i class="icon-white"></i>
					<span>Pagina inicial</span>
				</button>
			</form:form>	
		</div>
	</body>
</html>