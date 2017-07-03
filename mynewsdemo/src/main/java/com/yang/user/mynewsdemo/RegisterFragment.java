package com.yang.user.mynewsdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

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
import okhttp3.ResponseBody;

/**
 * Created by JieYang on 2017/7/3.
 */

public class RegisterFragment extends Fragment{
    private View view;
    @BindView(R.id.name)
    public EditText name;
    @BindView(R.id.password)
    public EditText password;
    @BindView(R.id.email)
    public EditText email;
    private Novate novate;
    @OnClick(R.id.signin)
    public void siGnin(){
        getFragmentManager().beginTransaction().replace(R.id.usermainfragment, new LoginFragment()).commit();
    }
    @OnClick(R.id.register)
    public void reGister(){
        register(name.getText().toString(), email.getText().toString(), password.getText().toString());
    }
    @OnClick(R.id.fanhui)
    public void fanHui(){
        getActivity().finish();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_register,container,false);
        ButterKnife.bind(this,view);

        //初始化novate
        novate = new Novate.Builder(getContext())
                .baseUrl("http://cxboss.cn/laravelandroid/public/api/")
                .addLog(true)
                .build();
        return view;
    }

    private void register(String namestr, final String emailstr, String paswordstr) {
        Boolean is_validate = validate(namestr, emailstr, paswordstr);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", namestr);
        map.put("email", emailstr);
        map.put("password", paswordstr);
        if (is_validate) {
            novate.rxPost("user_register", map, new ResponseCallback<Object, ResponseBody>() {
                @Override
                public Object onHandleResponse(ResponseBody response) throws Exception {


                    String string = new String(response.string());
                    JSONObject user = new JSONObject(string);

                    if (user.optBoolean("message")) {
                        Log.e("yangjie","" + user.optBoolean("message"));
                        getFragmentManager().beginTransaction().replace(R.id.usermainfragment, new LoginFragment()).commit();
                        Toast.makeText(getContext(), "注册成功0!", Toast.LENGTH_SHORT).show();
                    } else {
                        System.out.println(user.optString("type"));
                        if (user.optString("type").equals("name")) {
                            System.out.println("hello");
                            name.setError(user.optString("info"));
                            Toast.makeText(getContext(),"用户名已存在，请重新输入",Toast.LENGTH_SHORT).show();
                        }
                        if (user.optString("type").equals("email")) {
                            email.setError(user.optString("info"));
                            Toast.makeText(getContext(),"邮箱已存在，请检查您的账号",Toast.LENGTH_SHORT).show();
                        }
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
                public void onNext(Object tag, okhttp3.Call call, Object response) {
                }
            });
        }


    }

    //验证字符格式
    public boolean validate(String namestr, String emailstr, String paswordstr) {
        String rex = "[\\w-]+[\\.\\w]*@[\\w]+(\\.[\\w]{2,3})";
        Pattern p = Pattern.compile(rex);
        Matcher m = p.matcher(emailstr);
        if (namestr.length() < 3 || namestr.length() > 20) {
            name.setError("用户名长度为3~20");
            return false;
        }
        if (m.find() == false) {
            email.setError("邮箱地址不正确");
            return false;
        }
        if (paswordstr.length() < 6 || paswordstr.length() > 15) {
            password.setError("密码长度为6~15");
            return false;
        }
        return true;
    }
}
