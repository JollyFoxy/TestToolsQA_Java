package Tests.ApiTests;

import Api.ApiSteps.FirstTestStep;
import Api.ApiSteps.Users.CreatedUser;
import Api.ApiSteps.Users.User;
import UserGenerator.UG;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public class TestPostCreateUser {

    @Test
    public void testPost(){
        User newUser = User.builder()
                .name(UG.genName())
                .job(UG.genJob())
                .build();

        CreatedUser createdUser = given()
                .spec(FirstTestStep.getReqSpec())
                .body(newUser)
                .when().post("/users")
                .then().statusCode(201)
                .extract().as(CreatedUser.class);

        assertThat(createdUser)
                .isNotNull()
                .extracting(CreatedUser::getName)
                .isEqualTo(newUser.getName());
    }
}
