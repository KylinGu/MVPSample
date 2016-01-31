package mvpsample.kylin.com.mvpsample.presenter;

import mvpsample.kylin.com.mvpsample.model.IUserModel;
import mvpsample.kylin.com.mvpsample.model.UserModel;
import mvpsample.kylin.com.mvpsample.view.IUserView;
import mvpsample.kylin.com.mvpsample.bean.UserBean;

/**
 * Created by kylin on 16-1-10.
 */
public class UserPresenter {
    private IUserView mUserView;
    private IUserModel mUserModel;

    public UserPresenter(IUserView userView){
        mUserView = userView;
        mUserModel = new UserModel();
    }

    public void saveUser(int id, String firstName, String lastName){
        mUserModel.setId(id);
        mUserModel.setFirstName(firstName);
        mUserModel.setLastName(lastName);
    }

    public void loadUser(int id){
        UserBean mUserBean = mUserModel.loadUser(id);
        mUserView.setFirstName(mUserBean.getmFirstName());
        mUserView.setLastName(mUserBean.getmLastName());
    }
}
