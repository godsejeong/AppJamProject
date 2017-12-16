package com.example.pc.appjamproject.java.controller.services;

import com.example.pc.appjamproject.java.controller.beans.ResultData;
import com.example.pc.appjamproject.java.controller.beans.User;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;

/**
 * Created by baehyeonbin on 2017. 12. 17..
 */

public interface UserService {
    @POST("/users")
    @Multipart
    public Call<ResultData> regiter(@Part("data") User user, MultipartBody.Part profile);

    @PUT("/users/${username}")
    public Call<ResultData> editUserInfo(@Part("data") User user, MultipartBody.Part profile);


}
