package mvpsample.kylin.com.mvpsample.bean;

/**
 * Created by kylin on 16-1-10.
 */
public class UserBean {

    String mFirstName = null;
    String mLastName =null;

    public UserBean(String mFirstName, String mLastName){
        this.mFirstName = mFirstName;
        this.mLastName = mLastName;
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public String getmLastName() {
        return mLastName;
    }
}
