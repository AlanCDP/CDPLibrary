package com.example.cw.cdplibrary;

import android.os.Bundle;

import cn.com.szw.lib.myframework.base.BaseActivity;

public class MainActivity extends BaseActivity {


    @Override
    public boolean initToolbar() {
        return false;
    }

    @Override
    public int setInflateId() {
        return R.layout.activity_main;
    }
}
