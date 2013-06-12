<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
   <title>${mensagem}</title>
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
	<form:form method="POST" action="${pageContext.request.contextPath}/">
		<button type="submit" class="btn blue start">
			<i class="icon-upload icon-white"></i>
			<span>Pagina inicial</span>
		</button>
	</form:form>
	<br />
	
	<c:if test="${not empty fileUploadForm.employedFormList}">
		<form:form method="POST" commandName="fileUploadForm" action="${pageContext.request.contextPath}/FileUploadForm/importar" style="background-color:#fff;">
		<!-- The table listing the files available for upload/download -->	
		<table role="presentation" class="table table-striped">
			<thead>
				<tr class="template-download fade in">
					<td class="preview"><strong>Id</strong></td>
					<td class="preview"><strong>Nome</strong></td>
					<td class="preview"><strong>Salario</strong></td>
				</tr>
			</thead>
		
			<tbody class="files" data-toggle="modal-gallery" data-target="#modal-gallery">
				<c:forEach var="item" items="${fileUploadForm.employedFormList}">
					<tr class="template-download fade in">
			            <td class="preview">
			            	${item.id}
			            </td>
			            <td class="name">
			                ${item.firstName} ${item.lastName}
			            </td>
			            <td class="size">
			            	<span>${item.salary}</span>
			            </td>
				    </tr>
				</c:forEach>
			
		    </tbody>
		</table>
		<br />
		<button type="submit" class="btn blue start">
			<i class="icon-upload icon-white"></i>
			<span>Importar dados</span>
		</button>
		
	</form:form>
	</c:if>
	
	<c:if test="${empty fileUploadForm.employedFormList}">
		<span class="erros">Nenhum funcionário</span>
	</c:if>

</body></html>