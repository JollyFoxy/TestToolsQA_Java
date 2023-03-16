package Tests.ApiTests;

import org.junit.jupiter.api.Test;

public class TestDeleteUser extends BaseApiTest{
    @Test
    public void testDelete(){
        deleteUser.deleteUser("/users/2");
    }
}
