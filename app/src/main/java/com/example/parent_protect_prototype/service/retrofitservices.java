package com.example.parent_protect_prototype.service;

import com.example.parent_protect_prototype.data.SignUpclass;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface retrofitservices {
    @POST("data")
    Call<List<SignUpclass>> loadChanges(@Body SignUpclass body);
}
