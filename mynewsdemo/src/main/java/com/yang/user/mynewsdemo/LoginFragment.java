package com.yang.user.mynewsdemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;

import com.tamic.novate.Novate;
import com.tamic.novate.Throwable;
import com.tamic.novate.callback.ResponseCallback;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.ResponseBody;

/**
 * Created by JieYang on 2017/7/3.
 */

public class LoginFragment extends Fragment {
    private View view;
    @BindView(R.id.email)
    public EditText email;
    @BindView(R.id.password)
    public EditText password;

    private Novate novate;

    @OnClick(R.id.register)
    public void reGister(){
        getFragmentManager().beginTransaction().replace(R.id.usermainfragment, new RegisterFragment()).commit();
    }

    @OnClick(R.id.fanhui)
    public void fanHui(){
        getActivity().finish();
    }
    @OnClick( R.id.login)
    public void loGin(){
        login(email.getText().toString(), password.getText().toString());
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_login,container,false);
        ButterKnife.bind(this,view);
        //初始化novate
        novate = new Novate.Builder(getContext())
                .baseUrl("http://cxboss.cn/laravelandroid/public/api/")
                .addLog(true)
                .build();
        return view;
    }

    private void login(String emailstr, String passwordstr) {
        Boolean is_validate = validate(emailstr, passwordstr);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("email", emailstr);
        map.put("password", passwordstr);

        if (is_validate) {
            novate.rxPost("user_login", map, new ResponseCallback<Object, ResponseBody>() {
                @Override
                public Object onHandleResponse(ResponseBody response) throws Exception {
                    String string = new String(response.bytes());
                    JSONObject user = new JSONObject(string);
                    Log.e("yangjie","login : " + string);
                    JSONObject userinfo = new JSONObject(user.getString("user"));
                    if (user.optBoolean("message") && userinfo != null) {
                        SharedPreferences sp = getActivity().getSharedPreferences("user_auth", getActivity().MODE_PRIVATE);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putInt("id", userinfo.optInt("id"));
                        editor.putString("name", userinfo.optString("name"));
                        editor.putInt("followers", userinfo.optInt("followers"));
                        editor.putInt("following", userinfo.optInt("following"));
                        editor.putString("api_token", userinfo.optString("api_token"));
                        editor.putString("created_at", userinfo.optString("created_at"));
                        editor.putString("introduction", userinfo.optString("introduction"));
                        editor.putString("avatar", userinfo.optString("avatar"));
                        editor.putString("sex", userinfo.optString("sex"));
                        editor.putString("birthday", userinfo.optString("birthday"));
                        editor.putBoolean("message", user.optBoolean("message"));
                        editor.commit();
                        startActivity(new Intent(getContext(), MainActivity.class));
                    }
                    return null;
                }

                @Override
                public void onError(Object tag, Throwable e) {

                }

                @Override
                public void onCancel(Object tag, Throwable e) {

                }

                @Override
                public void onNext(Object tag, Call call, Object response) {

                }
            });
        }

    }

    private Boolean validate(String emailstr, String passwordstr) {
        String rex = "[\\w-]+[\\.\\w]*@[\\w]+(\\.[\\w]{2,3})";
        Pattern p = Pattern.compile(rex);
        Matcher m = p.matcher(emailstr);
        if (m.find() == false) {
            email.setError("邮箱地址不正确");
            return false;
        }
        if (passwordstr.length() < 6 || passwordstr.length() > 15) {
            password.setError("密码长度为6~15");
            return false;
        }
        return true;
    }
}
