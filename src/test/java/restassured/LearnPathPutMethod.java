package restassured;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


public class LearnPathPutMethod {
    @Test
    public void testPut(){
        Student data= new Student(1,"Revanth",21);
        String endpoint="http://localhost:3000/api/students/1";
        given()
                .contentType(ContentType.JSON)
                .body(data)
                .when()
                .put(endpoint)
                .then()
                .assertThat()
                .log().body();
    }


}
