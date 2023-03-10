package Tests.ApiTests;

import Api.ApiSteps.FirstTestStep;
import Api.CreatedUser;
import Api.NewUser;
import Api.User;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;


public class FirstTest {

    @Test
    public void testGet(){
        List<User> users  = FirstTestStep.getUsers("/users?page=2");
        assertThat(users)
                .extracting(User::getEmail)
                .contains("tobias.funke@reqres.in");
    }

    @Test
    public void testPost(){
        NewUser newUser =NewUser.builder()
                .name("morpheus")
                .job("leader")
                .build();

        CreatedUser createdUser = given()
                .spec(FirstTestStep.getReqSpec())
                .body(newUser)
                .when().post("/users")
                .then()
                .extract().as(CreatedUser.class);

        assertThat(createdUser)
                .isNotNull()
                .extracting(CreatedUser::getName)
                .isEqualTo(newUser.getName());
    }
}
