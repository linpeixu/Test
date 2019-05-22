package com.example.lpx.presenter;

import com.example.lpx.model.BaseModel;

/**
 * 作者：htc-Android on 2019/5/21 11:25
 * Email : linpx@huitouche.com
 */
public class BasePresenter<T extends BaseModel> {
    private T mModel;

    public BasePresenter(T mModel) {
        this.mModel = mModel;
    }
    public void login(){

    }
}
