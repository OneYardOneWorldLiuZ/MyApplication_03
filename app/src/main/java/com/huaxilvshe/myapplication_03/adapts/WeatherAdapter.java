package com.huaxilvshe.myapplication_03.adapts;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.huaxilvshe.myapplication_03.R;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

class ViewHolder{
    ImageView weatherImage;
    TextView weatherName;
}

public class WeatherAdapter extends ArrayAdapter<Weather> {
    private int rescourceId;
    private Context mContext;
    // 将上下文，ListView子项布局的ID，数据，传递进来
    public WeatherAdapter(Context context, int textViewResourceId, List<Weather> obj){
        super(context, textViewResourceId, obj);
        rescourceId = textViewResourceId;
        this.mContext = context;
    }

    @NonNull
    @Override
    public View getView (int position, @Nullable View convertView, @NonNull ViewGroup parent){
        Weather weather = getItem(position);// 获取当前项的Wearther实列
      /*  View view = LayoutInflater.from(getContext()).inflate(rescourceId, parent, false);
        // 获取实列子
        ImageView image = (ImageView) view.findViewById(R.id.weather_image);
        TextView name = (TextView) view.findViewById(R.id.weather_name);
        // 设置图片和文字
        Glide.with(mContext)
                .load(weather.getImageUrl())
                .into(image);
        name.setText(weather.getName());
        return view;

       */

      // 优化后方案处理
      View view;
      ViewHolder viewHolder;
      if (convertView == null){
          view = LayoutInflater.from(getContext()).inflate(rescourceId,parent,false);
          viewHolder = new ViewHolder();
          // 通过ViewHolder获取实列
          //通过ViewHolder获取实例
          viewHolder.weatherImage = (ImageView) view.findViewById(R.id.weather_image);
          viewHolder.weatherName = (TextView) view.findViewById(R.id.weather_name);
          //将ViewHolder存储在view中
          view.setTag(viewHolder);
      }else{
          //否则，重用convertView
          view = convertView;
          //重新获取ViewHolder（利用View的getTag()方法，把ViewHolder重新取出）
          viewHolder = (ViewHolder)view.getTag();
      }

        //设置图片和文字
        Glide.with(mContext)
                .load(weather.getImageUrl())
                .into(viewHolder.weatherImage);

        viewHolder.weatherName.setText(weather.getName());
        return view;
    }
}
