package com.agroho.restbarta.restbartamobile.httpchild;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by rezaul on 11/24/16.
 */

public class ChildCall {

    public static final String BASE_URL = "http://192.168.0.102:9090/api/";

    private static Retrofit retrofit = null;

    static Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd hh:mm:ss")
            .create();

    public static Retrofit getClient(){


        if (retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }

        return retrofit;
    }

}
