package com.example.retrofitexample;

import com.example.retrofitexample.apiresponse.Pojo;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceholder {
    public static String KEY = "b04381ae4136411ba3e0c71987ccd59d";
    @GET("search?query=yogurt&apiKey="+KEY)
    public Call<Pojo> getResponse();
}
