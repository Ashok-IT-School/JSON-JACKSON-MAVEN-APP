package com.ashok.main;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.nit.model.PersonInfo;

/**
 * This class is used to convert Java Object to Json String
 * 
 * @author Ashok
 *
 */
public class JavaToJsonConverter {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

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
		String jsonStr = mapper.writeValueAsString(pinfo);

		// Printing json string on console
		System.out.println(jsonStr);
	}

}
