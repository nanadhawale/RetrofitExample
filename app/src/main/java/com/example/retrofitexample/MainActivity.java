package com.example.retrofitexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.retrofitexample.apiresponse.Pojo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.spoonacular.com/food/products/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        rvData = findViewById(R.id.rv_products);
        rvData.setLayoutManager(new LinearLayoutManager(getBaseContext()));

        JsonPlaceholder service = retrofit.create(JsonPlaceholder.class);
        Call<Pojo> call = service.getResponse();
        call.enqueue(new Callback<Pojo>(){
            @Override
            public void onResponse(Call<Pojo> call, Response<Pojo> response) {
                Pojo body = response.body();
                rvData.setAdapter(new ProductsAdapter(getBaseContext(),body.getProducts()));

            }

            @Override
            public void onFailure(Call<Pojo> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}