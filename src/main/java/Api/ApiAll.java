package Api;

import Api.ApiSteps.*;

public interface ApiAll {
    StepsDeleteUser deleteUser = new StepsDeleteUser();
    StepsPostCreatedUser createdUser = new StepsPostCreatedUser();
    StepsGetSingleUser getSingleUser = new StepsGetSingleUser();
    StepsPutUpdateUser putUpdateUser = new StepsPutUpdateUser();
    StepsNotFoundUser getUserNotFound = new StepsNotFoundUser();
    StepsPatchUpdateUser patchUpdateUser = new StepsPatchUpdateUser();
}
