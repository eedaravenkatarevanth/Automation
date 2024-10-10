package restassured;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LearnPathGet {
    @Test
    public void GetMethodQuery(){
        given().
                contentType(ContentType.JSON).queryParam("id",1).
                when()
                .get("http://localhost:3000")
                .then()
                .assertThat().statusCode(200)
                .body("name",equalTo("Venkata Revanth"))
                .log().body();

        given()
                .when()
                .get("http://localhost:3000?id=3")
                .then()
                .assertThat()
                .log()
                .body();
    }
}




