package Api;

import Api.ApiSteps.StepsDeleteUser;
import Api.ApiSteps.StepsGetSingleUser;
import Api.ApiSteps.StepsPostCreatedUser;

public interface ApiAll {
    StepsDeleteUser deleteUser = new StepsDeleteUser();
    StepsPostCreatedUser createdUser =new StepsPostCreatedUser();
    StepsGetSingleUser getSingleUser = new StepsGetSingleUser();
}
