package com.huaxilvshe.myapplication_03;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.huaxilvshe.myapplication_03.adapts.Weather;
import com.huaxilvshe.myapplication_03.adapts.WeatherAdapter;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

public class TableView_Activity extends Activity {

    private List<Weather> weatherList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tableview);

        initWeather();// 初始化数据
        WeatherAdapter adapter = new WeatherAdapter(TableView_Activity.this,R.layout.weather_item, weatherList);
        ListView listView = (ListView) findViewById(R.id.list_views);
        listView.setAdapter(adapter);

        // 为listView添加点击事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Weather weather = weatherList.get(position);
                Toast.makeText(TableView_Activity.this, weather.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void initWeather(){
        //苦力活动，请忽略
        Weather i_100 = new Weather("Sunny", "http://a1.att.hudong.com/68/58/01200000032867136324584203261.jpg");
        weatherList.add(i_100);
        Weather i_101 = new Weather("Cloudy", "http://a4.att.hudong.com/21/09/01200000026352136359091694357.jpg");
        weatherList.add(i_101);
        Weather i_102 = new Weather("Few Clouds", "http://bbs.jooyoo.net/attachment/Mon_0905/24_65548_2835f8eaa933ff6.jpg");
        weatherList.add(i_102);
        Weather i_103 = new Weather("Partly Cloudy","https://cdn.duitang.com/uploads/item/201409/08/20140908130732_kVXzh.jpeg");
        weatherList.add(i_103);
        Weather i_104 = new Weather("Overcast", "http://dmimg.5054399.com/allimg/pkm/pk/22.jpg");
        weatherList.add(i_104);
        Weather i_200 = new Weather("Windy", "http://a3.att.hudong.com/14/75/01300000164186121366756803686.jpg");
        weatherList.add(i_200);
        Weather i_201 = new Weather("Calm", "http://t8.baidu.com/it/u=3571592872,3353494284&fm=79&app=86&f=JPEG?w=1200&h=1290");
        weatherList.add(i_201);
        Weather i_202 = new Weather("Light Breeze", "http://t7.baidu.com/it/u=378254553,3884800361&fm=79&app=86&f=JPEG?w=1280&h=2030");
        weatherList.add(i_202);
        Weather i_203 = new Weather("Moderate", "http://t8.baidu.com/it/u=1484500186,1503043093&fm=79&app=86&f=JPEG?w=1280&h=853");
        weatherList.add(i_203);
        Weather i_204 = new Weather("Fresh Breeze", "http://t8.baidu.com/it/u=2247852322,986532796&fm=79&app=86&f=JPEG?w=1280&h=853");
        weatherList.add(i_204);
        Weather i_205 = new Weather("Strong Breeze", "http://t7.baidu.com/it/u=3204887199,3790688592&fm=79&app=86&f=JPEG?w=4610&h=2968");
        weatherList.add(i_205);
    }

}
