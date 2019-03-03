package com.ashok.main;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

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

		// converting json file data to java objects (array)
		PersonInfo[] personsArr = mapper.readValue(jsonFile, PersonInfo[].class);
		for (PersonInfo pinfo : personsArr) {
			System.out.println(pinfo);
		}

		System.out.println("=====================================================");

		// Reading json file data into java collection objects
		List<PersonInfo> personInfoObjs = mapper.readValue(jsonFile,
				mapper.getTypeFactory().constructCollectionType(List.class, PersonInfo.class));
		for (PersonInfo pinfo : personInfoObjs) {
			System.out.println(pinfo);
		}

	}

}
