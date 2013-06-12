<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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
   
   <style>
	/*.error {
		color: #ff0000;
	}*/
 
	.errorblock {
		color: #000;
		background-color: #ffEEEE;
		border: 3px solid #ff0000;
		padding: 8px;
		margin: 16px;
	}
	</style>

</head>
<body>
	
    <!-- INÍCIO / UPLOAD -->
	<div class="row-fluid">
		<div class="portlet box green" style="width:100%;float:left;">
	       <div class="portlet-title">
	          <div class="caption"><i class="icon-reorder"></i>Prova de conceito</div>
	       </div>
	    </div>
    	
		<div class="span12" style="margin:50px 0;border-top:10px solid #cfc;">
		
			<form:form method="POST" commandName="fileUploadForm" enctype="multipart/form-data" style="background-color:#fff;">
			
				<!-- Redirect browsers with JavaScript disabled to the origin page -->
							<noscript>&lt;input type="hidden" name="redirect" value="http://blueimp.github.com/jQuery-File-Upload/"&gt;</noscript>
							
							<!-- The fileupload-buttonbar contains buttons to add/delete files and start/cancel the upload -->
							<div class="row-fluid fileupload-buttonbar">
								<div class="span7">
									<!-- The fileinput-button span is used to style the file input field as button -->
									<span class="btn green fileinput-button">
									<i class="icon-plus icon-white"></i>
									<span>Add file...</span>
									<input type="file" name="file" />
<!-- 									<input type="file" name="files[]" multiple=""> -->
									</span>
									<button type="submit" class="btn blue start">
										<i class="icon-upload icon-white"></i>
										<span>Start upload</span>
									</button>
									<button type="reset" class="btn yellow cancel">
									<i class="icon-ban-circle icon-white"></i>
									<span>Cancel upload</span>
									</button>
								</div>
								<!-- The global progress information -->
								<div class="span5 fileupload-progress fade">
									<!-- The global progress bar -->
									<div class="progress progress-success progress-striped active" role="progressbar" aria-valuemin="0" aria-valuemax="100">
										<div class="bar" style="width:0%;"></div>
									</div>
									<!-- The extended global progress information -->
									<div class="progress-extended">&nbsp;</div>
								</div>
								
							</div>
							<!-- The loading indicator is shown during file processing -->
							<div class="fileupload-loading"></div>
							<br>							
							<form:errors path="file" cssClass="error" />
						</form:form>
</div></div>
<!-- //FINAL / UPLOAD -->

   <!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
   <!-- BEGIN CORE PLUGINS -->
   <script type="text/javascript" async="" src="http://stats.g.doubleclick.net/dc.js"></script><script src="http://www.keenthemes.com/preview/metronic/assets/plugins/jquery-1.8.3.min.js" type="text/javascript"></script>   
   <!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->  
   <script src="http://www.keenthemes.com/preview/metronic/assets/plugins/jquery-ui/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>      
   <script src="http://www.keenthemes.com/preview/metronic/assets/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
   <!--[if lt IE 9]>
   <script src="http://www.keenthemes.com/preview/metronic/assets/plugins/excanvas.js"></script>
   <script src="http://www.keenthemes.com/preview/metronic/assets/plugins/respond.js"></script>  
   <![endif]-->   
   <script src="http://www.keenthemes.com/preview/metronic/assets/plugins/breakpoints/breakpoints.js" type="text/javascript"></script>  
   <!-- IMPORTANT! jquery.slimscroll.min.js depends on jquery-ui-1.10.1.custom.min.js --> 
   <script src="http://www.keenthemes.com/preview/metronic/assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
   <script src="http://www.keenthemes.com/preview/metronic/assets/plugins/jquery.blockui.js" type="text/javascript"></script>  
   <script src="http://www.keenthemes.com/preview/metronic/assets/plugins/jquery.cookie.js" type="text/javascript"></script>
   <script src="http://www.keenthemes.com/preview/metronic/assets/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script> 
   <!-- END CORE PLUGINS -->
   <!-- BEGIN PAGE LEVEL PLUGINS -->
   <script type="text/javascript" src="http://www.keenthemes.com/preview/metronic/assets/plugins/select2/select2.min.js"></script>
   <!-- END PAGE LEVEL PLUGINS -->
   <!-- BEGIN PAGE LEVEL SCRIPTS -->
   <script src="http://www.keenthemes.com/preview/metronic/assets/scripts/app.js"></script>
   <script src="http://www.keenthemes.com/preview/metronic/assets/scripts/form-samples.js"></script>   
   <!-- END PAGE LEVEL SCRIPTS -->
   <script>
      jQuery(document).ready(function() {    
         // initiate layout and plugins
         App.init();
         FormSamples.init();
      });
   </script>
   <!-- END JAVASCRIPTS -->   
</body></html>