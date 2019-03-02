package com.ashok.main;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.nit.model.PersonInfo;

/**
 * This class is used to convert JSON String to Java Object
 * 
 * @author Ashok
 *
 */
public class JsonToJavaConverter {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		// Pointing to json file location
		File jsonFile = new File("Person.json");

		// Create Object Mapper
		ObjectMapper mapper = new ObjectMapper();

		// Setting date format
		mapper.setDateFormat(new SimpleDateFormat("dd-MMM-yyyy"));

		// converting json file data to java obj
		PersonInfo pinfo = mapper.readValue(jsonFile, PersonInfo.class);

		// printing java object content on console
		System.out.println(pinfo);

	}

}
