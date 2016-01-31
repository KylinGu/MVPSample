package mvpsample.kylin.com.mvpsample.model;

import android.widget.Toast;
import android.util.Log;

import mvpsample.kylin.com.mvpsample.bean.UserBean;

/**
 * Created by kylin on 16-1-10.
 */
public class UserModel implements IUserModel {

    @Override
    public void setId(int id) {
        Log.d("UserModel", "setId id = "+id);
    }

    @Override
    public void setFirstName(String firstName) {
        Log.d("UserModel", "setFirstName fistName = "+firstName);
    }

    @Override
    public void setLastName(String lastName) {
        Log.d("UserModel", "setLastName lastName = "+lastName);
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public UserBean loadUser(int id) {
        return new UserBean("Kylin", "Mountain");
    }
}
