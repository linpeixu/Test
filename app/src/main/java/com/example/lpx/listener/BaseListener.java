package com.example.lpx.listener;

/**
 * 作者：htc-Android on 2019/5/21 11:27
 * Email : linpx@huitouche.com
 */
public interface BaseListener {
    void onSuccess();
    void onFail();
    public interface LoginInterface extends BaseListener {
        void onLoginSuccess();
        void onLoginFail();
    }
}
