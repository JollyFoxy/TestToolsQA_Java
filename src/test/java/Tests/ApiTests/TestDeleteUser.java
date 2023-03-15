package Tests.ApiTests;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestDeleteUser extends BaseApiTest{
    @Test
    public void testDelete(){
        deleteUser.deleteUser("/users/2");
    }
}
