package com.example.lpx.gitcommand;


import android.app.Activity;
import android.os.Bundle;

import com.example.lpx.listener.BaseListener;
import com.example.lpx.model.BaseModel;
import com.example.lpx.presenter.FirstPresenter;

public class MainActivity extends Activity implements BaseListener, BaseListener.LoginInterface {
private FirstPresenter<BaseListener.LoginInterface, BaseModel> FirstPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstPresenter=new FirstPresenter(this,new BaseModel(this));
        FirstPresenter.login();
    }

    private void init() {


    }

    private void test() {
    //My分支的init内容
    //stash

    }

    private void getMaxValueLength() {
//修改提交日期
    }


    @Override
    public void onSuccess() {

    }

    @Override
    public void onFail() {

    }

    @Override
    public void onLoginSuccess() {

    }

    @Override
    public void onLoginFail() {

    }
}
