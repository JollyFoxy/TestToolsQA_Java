package Api;

import Api.ApiSteps.Delete.StepsDeleteUser;
import Api.ApiSteps.Get.StepsGetSingleUser;
import Api.ApiSteps.Get.StepsNotFoundUser;
import Api.ApiSteps.Post.Authorization.StepsPostLogin;
import Api.ApiSteps.Post.Authorization.StepsPostRegister;
import Api.ApiSteps.Post.StepsPostCreatedUser;
import Api.ApiSteps.Put.StepsPutUpdateUser;
import Api.ApiSteps.Putch.StepsPatchUpdateUser;

public interface ApiAll {
    StepsDeleteUser deleteUser = new StepsDeleteUser();
    StepsPostCreatedUser createdUser = new StepsPostCreatedUser();
    StepsGetSingleUser getSingleUser = new StepsGetSingleUser();
    StepsPutUpdateUser putUpdateUser = new StepsPutUpdateUser();
    StepsNotFoundUser getUserNotFound = new StepsNotFoundUser();
    StepsPatchUpdateUser patchUpdateUser = new StepsPatchUpdateUser();
    StepsPostRegister postRegister = new StepsPostRegister();
    StepsPostLogin postLogin = new StepsPostLogin();
}
