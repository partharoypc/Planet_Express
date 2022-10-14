package com.partharoypc.planetexpress.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClass {
    final static String URL="http://192.168.0.104/eCommerce_App/";
    private static RetrofitClass retrofitClass;
    private static Retrofit retrofit;

        RetrofitClass(){
            retrofit = new Retrofit.Builder()
                    .baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        public static synchronized RetrofitClass getInstance(){
            if (retrofitClass == null){
                retrofitClass = new RetrofitClass();
            }
            return retrofitClass;
        }

        RetrofitInstance retrofitInstance(){
            return retrofit.create(RetrofitInstance.class);
        }
}
