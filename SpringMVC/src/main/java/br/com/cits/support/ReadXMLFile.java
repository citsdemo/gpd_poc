package br.com.cits.support;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.cits.web.EmployedForm;

public class ReadXMLFile {

	private static List<EmployedForm> staffList;

	public static List<EmployedForm> getAllNodes(CommonsMultipartFile commonsMultipartFile) {

		staffList = new ArrayList<EmployedForm>();
		
		//boolean isOperationCompleteSuccefull = false;
		
		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(commonsMultipartFile.getInputStream());

			// optional, but recommended
			// read this -
			// http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
			doc.getDocumentElement().normalize();

			//System.out.println("Root element :"+ doc.getDocumentElement().getNodeName());

			NodeList nList = doc.getElementsByTagName("staff");

			//System.out.println("----------------------------");

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);

				//System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					//System.out.println("Staff id : "+ eElement.getAttribute("id"));
					//System.out.println("First Name : "+ eElement.getElementsByTagName("firstname").item(0).getTextContent());
					//System.out.println("Last Name : "+ eElement.getElementsByTagName("lastname").item(0).getTextContent());
					//System.out.println("Nick Name : "+ eElement.getElementsByTagName("nickname").item(0).getTextContent());
					//System.out.println("Salary : "+ eElement.getElementsByTagName("salary").item(0).getTextContent());
					EmployedForm pojo = new EmployedForm();
					
					pojo.setId(Long.parseLong(eElement.getAttribute("id")));
					pojo.setFirstName(eElement.getElementsByTagName("firstname").item(0).getTextContent());
					pojo.setLastName(eElement.getElementsByTagName("lastname").item(0).getTextContent());
					pojo.setNickname(eElement.getElementsByTagName("nickname").item(0).getTextContent());
					pojo.setSalary(new BigDecimal(eElement.getElementsByTagName("salary").item(0).getTextContent()));
					
					staffList.add(pojo);
				}
			}
			
			//isOperationCompleteSuccefull = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return staffList;
	}

}