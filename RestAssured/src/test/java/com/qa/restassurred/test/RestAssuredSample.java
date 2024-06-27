package com.qa.restassurred.test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class RestAssuredSample {
	
	@Test
	public void sampleTest() {
		given().
		when().
			get("http://ergast.com/api/f1.json").
		then().
		assertThat().
		body("MRData.RaceTable.Races.Circuit.circuitId[1]",hasValue("monaco"));
	}
	 

}
