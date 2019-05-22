package com.example.lpx.model;

import com.example.lpx.listener.BaseListener;

/**
 * 作者：htc-Android on 2019/5/21 11:29
 * Email : linpx@huitouche.com
 */
public class BaseModel<T extends BaseListener> {
    private T mListener;

    public BaseModel(T listener) {
        mListener = listener;
    }
    public void test(Object o){
        //逻辑处理
        mListener.onSuccess();
    }
}
