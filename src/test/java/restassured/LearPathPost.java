package restassured;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LearPathPost {
    @Test
    public void testPostMethod(){
        String endpoint="http://localhost:3000/api/students";

        Student  data=new Student(10,"kousik",26) ;

        given()
                .header("Content-Type","application/json")
                .body(data)
                .when()
                .post(endpoint)
                .then()
                .assertThat().statusCode(201);
//                .body("name",equalTo("Sathwik"));

    }

}
