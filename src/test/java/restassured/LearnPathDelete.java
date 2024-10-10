package restassured;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class LearnPathDelete {
    @Test
    public void testDelete(){
        given()
                .pathParam("id",1)
                .when()
                .delete("http://localhost:3000/api/students/{id}")
                .then()
                .assertThat()
                .statusCode(204)
                .log().body();
    }
}
