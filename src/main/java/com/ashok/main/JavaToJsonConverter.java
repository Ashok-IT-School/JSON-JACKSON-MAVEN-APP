package com.ashok.main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import com.nit.model.PersonInfo;

/**
 * This class is used to convert Java Object to Json String
 * 
 * @author Ashok
 *
 */
public class JavaToJsonConverter {

	public void convertPersonObjectToJson() throws Exception {
		// Creating model class object
		PersonInfo pinfo = new PersonInfo();

		// Setting data to model class object
		pinfo.setPid(101);
		pinfo.setName("Smith");
		pinfo.setAge((byte) 28);
		pinfo.setEmail("smith@gmail.com");
		pinfo.setDob(new Date());

		// create object mapper
		ObjectMapper mapper = new ObjectMapper();

		// Setting date formatter for date type fields
		mapper.setDateFormat(new SimpleDateFormat("dd-MMM-yyyy"));

		// convert java obj to json
		String jsonStr = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pinfo);

		// Printing json string on console
		System.out.println(jsonStr);

	}

	public void convertPersonCollectionToJson() throws Exception {

		// Creating model class object-1
		PersonInfo pinfo1 = new PersonInfo();

		// Setting data to model class object
		pinfo1.setPid(101);
		pinfo1.setName("Smith");
		pinfo1.setAge((byte) 28);
		pinfo1.setEmail("smith@gmail.com");
		pinfo1.setDob(new Date());

		// Creating model class object
		PersonInfo pinfo2 = new PersonInfo();

		// Setting data to model class object-2
		pinfo2.setPid(101);
		pinfo2.setName("John");
		pinfo2.setAge((byte) 30);
		pinfo2.setEmail("john@gmail.com");
		pinfo2.setDob(new Date());

		// Adding model objects to collection
		List<PersonInfo> personsList = new ArrayList<PersonInfo>();
		personsList.add(pinfo1);
		personsList.add(pinfo2);

		// create object mapper
		ObjectMapper mapper = new ObjectMapper();

		// Setting date formatter for date type fields
		mapper.setDateFormat(new SimpleDateFormat("dd-MMM-yyyy"));

		// convert java obj to json
		String jsonStr = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(personsList);

		// Printing json string on console
		System.out.println(jsonStr);

	}

	public static void main(String[] args) throws Exception {
		JavaToJsonConverter converter = new JavaToJsonConverter();
		converter.convertPersonObjectToJson();
		System.out.println("==============================================");
		converter.convertPersonCollectionToJson();

	}

}
