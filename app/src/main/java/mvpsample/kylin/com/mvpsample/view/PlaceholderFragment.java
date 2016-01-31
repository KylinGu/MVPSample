package mvpsample.kylin.com.mvpsample.view;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import mvpsample.kylin.com.mvpsample.R;
import mvpsample.kylin.com.mvpsample.presenter.UserPresenter;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment implements IUserView, View.OnClickListener{
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    private UserPresenter userPresenter;
    private EditText edtId, edtFirstName, edtLastName;
    private View rootView;
    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static PlaceholderFragment newInstance(int sectionNumber) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public PlaceholderFragment() {
    }

    //life cycle
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if(activity instanceof MainActivity)((MainActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_main, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        rootView.findViewById(R.id.btn_load).setOnClickListener(this);
        rootView.findViewById(R.id.btn_save).setOnClickListener(this);
        edtFirstName = (EditText)rootView.findViewById(R.id.first_name);
        edtId = (EditText)rootView.findViewById(R.id.id_user);
        edtLastName = (EditText)rootView.findViewById(R.id.last_name);
        userPresenter = new UserPresenter(this);
    }

    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
    //life cycle

    @Override
    public int getUserId(){
        return TextUtils.isEmpty(edtId.getText().toString())?1:Integer.parseInt(edtId.getText().toString());
    }

    @Override
    public String getFirstName() {
        return edtFirstName.getText().toString();
    }

    @Override
    public String getLastName() {
        return edtLastName.getText().toString();
    }

    @Override
    public void setFirstName(String mFristName) {
        edtFirstName.setText(mFristName);
    }

    @Override
    public void setLastName(String mLastName) {
        edtLastName.setText(mLastName);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_load:
                userPresenter.loadUser(getUserId());
                break;
            case R.id.btn_save:
                userPresenter.saveUser(getUserId(), getFirstName(), getLastName());
                break;
            default:
                break;
        }
    }
}

