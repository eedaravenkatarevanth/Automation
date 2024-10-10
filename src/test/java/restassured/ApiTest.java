package restassured;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ApiTest {
    @Test
    public void testGetMethod(){
        String endPoint= "https://petstore.swagger.io/v2/store/inventory";

        String response= given()
                .when()
                .get(endPoint)
                .then()
//                .statusLine("HTTP/1.1 200 OK").statusCode(200)
                .assertThat()
                .extract().asPrettyString();
        System.out.println(response);
    }
    @Test
    public void testPostMethod(){
        String endpoint= "https://petstore.swagger.io/v2/store/order";
        String data="{\n" +
                "  \"id\": 6,\n" +
                "  \"petId\": 1,\n" +
                "  \"quantity\": 1,\n" +
                "  \"shipDate\": \"2024-09-25T05:43:20.935Z\",\n" +
                "  \"status\": \"placed\",\n" +
                "  \"complete\": true\n" +
                "}";
        String response=given()
                .contentType(ContentType.JSON)
                .when()
                .post(endpoint)
                .then()
                .statusLine("HTTP/1.1 200 OK").statusCode(200)
                .extract().asPrettyString();
        System.out.println(response);


    }
@Test
    public void testDeleteMethod(){
        String endPoint= "https://petstore.swagger.io/v2/store/order/6";

        String response= given()
                .when()
                .delete(endPoint)
                .then()
                .assertThat()
                .extract().asPrettyString();
        System.out.println(response);
    }
@Test
    public void testPutMethod(){
        String data= "{\n" +
                "  \"id\": 0,\n" +
                "  \"username\": \"revanth2\",\n" +
                "  \"firstName\": \"string\",\n" +
                "  \"lastName\": \"string\",\n" +
                "  \"email\": \"string\",\n" +
                "  \"password\": \"string\",\n" +
                "  \"phone\": \"string\",\n" +
                "  \"userStatus\": 0\n" +
                "}";
        String url="https://petstore.swagger.io/v2/user/revanth";
        String response= given()
                .body(data)
                .when().put(url).then()
                .statusCode(200).statusLine("HTTP/1.1 200 OK")
                .extract().asPrettyString();
    System.out.println(response);
    }

}

