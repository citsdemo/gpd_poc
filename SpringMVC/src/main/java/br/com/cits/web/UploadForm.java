package br.com.cits.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class UploadForm {
	
	private String name = null;
	private long size = 0;
	private CommonsMultipartFile file = null;
	
	private List<EmployedForm> employedFormList = new ArrayList<EmployedForm>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CommonsMultipartFile getFile() {
		return file;
	}
	
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public void setFile(CommonsMultipartFile file) {
		this.file = file;
		this.name = file.getOriginalFilename();
		this.size = file.getSize();
	}
	public List<EmployedForm> getEmployedFormList() {
		return employedFormList;
	}
	public void setEmployedFormList(List<EmployedForm> employedFormList) {
		this.employedFormList = employedFormList;
	}
	//teste brach-merge-auto
}