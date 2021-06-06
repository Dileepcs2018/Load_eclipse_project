import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//given->All the input details
		//when -> Submit the API-resource , Http method
		//Then-> validate the response
		
		
		RestAssured.baseURI ="https://rahulshettyacademy.com";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").body("{\r\n" + 
				"  \"location\": {\r\n" + 
				"    \"lat\": -38.383494,\r\n" + 
				"    \"lng\": 33.427362\r\n" + 
				"  },\r\n" + 
				"  \"accuracy\": 50,\r\n" + 
				"  \"name\": \"Frontline house\",\r\n" + 
				"  \"phone_number\": \"(+91) 983 893 3937\",\r\n" + 
				"  \"address\": \"CM RESIDANCY-5,3RD MAIN,2ND CROSS,MALLESHPALAYA\",\r\n" + 
				"  \"types\": [\r\n" + 
				"    \"shoe park\",\r\n" + 
				"    \"shop\"\r\n" + 
				"  ],\r\n" + 
				"  \"website\": \"http://google.com\",\r\n" + 
				"  \"language\": \"French-IN\"\r\n" + 
				"}\r\n" + 
				" \r\n" + 
				"").when().post("/maps/api/place/add/json/").then().log().all().assertThat().statusCode(200);
	}

}
