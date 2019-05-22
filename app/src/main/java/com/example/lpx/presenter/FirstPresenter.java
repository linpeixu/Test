package com.example.lpx.presenter;

import android.databinding.ViewDataBinding;

import com.example.lpx.listener.BaseListener;
import com.example.lpx.model.BaseModel;

/**
 * 作者：htc-Android on 2019/5/21 11:26
 * Email : linpx@huitouche.com
 */
public class FirstPresenter<T extends BaseListener.LoginInterface, E extends BaseModel> {
    private T mListener;
    private E mModel;


    public FirstPresenter(T listener, E model) {
        mListener = listener;
        mModel = model;
    }
    public void login(){
        mListener.onSuccess();
    }
}
