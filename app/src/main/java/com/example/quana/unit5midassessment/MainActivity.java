package com.example.quana.unit5midassessment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retroFitCall();
    }


    public void retroFitCall() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://randomuser.me/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RandomUserInterface userInterface = retrofit.create(RandomUserInterface.class);
        Call<UserModel> callusers = RandomUserInterface.getInterface();
        callusers.enqueue(new Callback<UserModel>() {
            @Override
            public void onResponse(Call<UserModel> call, Response<UserModel> response) {
                UserModel userModel = response.body();
                Log.e("response","We got into the response");
            }

            @Override
            public void onFailure(Call<UserModel> call, Throwable t) {
                Log.e("response","We did not get into the response");


            }

    }
}
}