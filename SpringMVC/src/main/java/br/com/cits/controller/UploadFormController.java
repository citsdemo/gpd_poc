package br.com.cits.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import br.com.cits.support.ReadXMLFile;
import br.com.cits.web.EmployedForm;
import br.com.cits.web.UploadForm;
import foo.model.FuncionarioRequest;
import foo.model.FuncionarioResponse;

@Controller
@RequestMapping(value="/FileUploadForm")
public class UploadFormController implements HandlerExceptionResolver{
	
	private UploadForm myCurrentForm = new UploadForm();
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(method=RequestMethod.GET)
	public String showForm(ModelMap model){
		UploadForm form = new UploadForm();
		model.addAttribute("fileUploadForm", form);
		return "FileUploadForm";
	}

	@RequestMapping(method=RequestMethod.POST)
	public String processForm(@ModelAttribute(value="fileUploadForm") UploadForm form,BindingResult result){
		if(!result.hasErrors()){
			FileOutputStream outputStream = null;
			String filePath = System.getProperty("java.io.tmpdir") + "/" + form.getFile().getOriginalFilename();
			try {
				outputStream = new FileOutputStream(new File(filePath));
				outputStream.write(form.getFile().getFileItem().get());	
				outputStream.close();
			} catch (Exception e) {
				System.out.println("Error while saving file");
				return "FileUploadForm";
			}
			
			if (form!=null 
				 && form.getFile()!=null 
				 && !form.getFile().getContentType().isEmpty()
				 && form.getFile().getContentType().equalsIgnoreCase("text/xml")
				){
				
				form.setEmployedFormList(ReadXMLFile.getAllNodes(form.getFile()));				
				
				myCurrentForm = form;
			}
			return "EmployedListForm";
		}else{
			return "FileUploadForm";
		}
	}
	
	@RequestMapping(value = "/importar",method=RequestMethod.POST)
	public String sendImportToRest(){
		FuncionarioResponse response;	
		FuncionarioResponse [] funcionarios;
		try {
			
			for (EmployedForm emp : myCurrentForm.getEmployedFormList()) {
				FuncionarioRequest funcionario2 = new FuncionarioRequest();
				
				funcionario2.setFirstName(emp.getFirstName());
				funcionario2.setSalary(emp.getSalary().toString());			
				funcionario2.setLastName(emp.getLastName());
				funcionario2.setNickName(emp.getNickname());
				
				response = restTemplate.postForObject("http://localhost:8080/gpdwsa/service/rest/funcionario", funcionario2, FuncionarioResponse.class);
				
			}			

			funcionarios = restTemplate.getForObject("http://localhost:8080/gpdwsa/service/rest/funcionario/list", FuncionarioResponse[].class);
			return "Success";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "Error";
		}		
	}	
	
	public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception exception) {
		Map<Object, Object> model = new HashMap<Object, Object>();
        if (exception instanceof MaxUploadSizeExceededException) {
            model.put("errors", "File size should be less then "+((MaxUploadSizeExceededException)exception).getMaxUploadSize()+" byte.");
        } 
        else {
            model.put("errors", "Unexpected error: " + exception.getMessage());
        }
        model.put("fileUploadForm", new UploadForm());
        return new ModelAndView("/FileUploadForm", (Map) model);
	}

	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
}
