package com.example.dell.shenghuanewsapp.Activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Administrator on 2016/11/17.
 */

public class BaseActivity extends AppCompatActivity{
    String TAG = getClass().getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.e(TAG, TAG + "create Activity 创建");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, TAG + "destroy Activity ");
    }
}
