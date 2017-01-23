package com.example.qiuguomeng.coolweather.util;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by qiuguomeng on 2017/1/22.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
//        Log.e("HttpUtil",address);
        client.newCall(request).enqueue(callback);
//        Log.e("AfterCall",address);
    }
}
