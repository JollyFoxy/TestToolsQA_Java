package Tests.ApiTests;

import Api.ApiSteps.FirstTestStep;
import Api.ApiSteps.Users.CreatedUser;
import Api.ApiSteps.Users.User;
import UserGenerator.UG;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public class TestPutUpdateUser {
    @Test
    public void testPut(){
        User newUser= User.builder()
                .name(UG.genName())
                .job(UG.genJob())
                .build();
        CreatedUser updateUser =given()
                .spec(FirstTestStep.getReqSpec())
                .body(newUser)
                .when().put("/users/2")
                .then().statusCode(200)
                .extract().as(CreatedUser.class);
        assertThat(updateUser)
                .isNotNull()
                .extracting(CreatedUser :: getUpdatedAt)
                .isEqualTo(newUser.getJob());
    }
}
