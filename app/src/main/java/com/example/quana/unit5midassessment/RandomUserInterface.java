package com.example.quana.unit5midassessment;


import android.telecom.Call;

import retrofit2.http.GET;

/**
 * Created by Quana on 1/24/18.
 */

public interface RandomUserInterface {
    @GET(/api/?nat=us&inc=name,location,cell,email,dob,picture&results=20);
    Call<UserModel> getInterface();

}
