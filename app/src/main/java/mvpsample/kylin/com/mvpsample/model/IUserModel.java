package mvpsample.kylin.com.mvpsample.model;

import mvpsample.kylin.com.mvpsample.bean.UserBean;
/**
 * Created by kylin on 16-1-10.
 */
public interface IUserModel {

    void setId(int id);
    void setFirstName(String firstName);
    void setLastName(String lastName);
    int getId();
    UserBean loadUser(int id);
}
