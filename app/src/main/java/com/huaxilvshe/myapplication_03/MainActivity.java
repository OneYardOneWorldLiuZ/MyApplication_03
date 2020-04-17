package com.huaxilvshe.myapplication_03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Observable;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

//    @BindView(R.id.btn1)
//    Button btn1;

    @BindView(R.id.btn2)
    Button btn2;

    @BindView(R.id.view1)
    View view1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getUserName("张三");

       Button btn1 = (Button)findViewById(R.id.btn1);

       btn1.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               btnOneOnClick(v);
           }
       });
    }


    protected void getUserName(String name){
        Log.d(TAG, "getUserName: " + name);
    }
    
    protected void btnOneOnClick(View v){
        Log.d(TAG, "btnOneOnClick: 匿名内部类实现");
    }
    
    public void btnTwosOnClick(View view){
        Log.d(TAG, "btnOneOnClick: 按钮事件一：onclick");
    }

    public void push_TableViewClick(View view){
        Intent table_view = new Intent(MainActivity.this , Table_Activity.class);
        startActivity(table_view);
    }

    public void push_FirstViewClick(View view){
        Log.d(TAG, "button4Onclick: 跳转登录视图");
        Intent fisrt_view = new Intent(MainActivity.this, First_Activity.class);
        startActivity(fisrt_view);
    }

    public void push_TableViewClickAuto(View view){
        Log.d(TAG, "push_TableViewClickAuto: 跳转至自定义listView");
        Intent table_view = new Intent(MainActivity.this, TableView_Activity.class);
        startActivity(table_view);
    }

    @OnClick(R.id.btn5)
    public void tap_NslClick(Button btn){
        Log.d(TAG, "tap_NslClick: 点击绑定输出");
        if (btn.getText().toString().equals("按钮不可用")){
            btn.setEnabled(false);
            btn.setText("按钮可用");
        } else {
            btn.setEnabled(true);
            btn.setText("按钮不可用");
        }
    }
}
