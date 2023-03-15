package Tests.ApiTests;

import Api.ApiSteps.StepsGetUserList;
import Api.Users.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class TestGetUsersList {

    @Test
    public void testGet(){
        List<User> users  = StepsGetUserList.getUsers("/users?page=2");
        assertThat(users)
                .isNotNull().extracting(User::getEmail)
                .contains("tobias.funke@reqres.in");
    }
}
