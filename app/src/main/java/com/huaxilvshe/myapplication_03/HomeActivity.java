package com.huaxilvshe.myapplication_03;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

/**
 * Description
 * Author:华西绿舍建材有限公司 - 科技信息部
 * Date:2020/4/16 3:43 PM
 */
public class HomeActivity extends Activity {


    private static final String TAG = "爱吃";
    private static String name;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tableview);

        Log.d(TAG, "onCreate: asas");
    }

    public  void getuserNameFoundct(String name, Number num){


    }


}

