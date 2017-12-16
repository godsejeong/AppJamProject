package com.example.pc.appjamproject.java.controller.utils;

import android.support.annotation.NonNull;

import com.example.pc.appjamproject.java.controller.beans.Token;

import java.io.File;
import java.util.List;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by baehyeonbin on 2017. 12. 17..
 */

public class RetrofitUtill {

    public static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://n0rr.kro.kr:7001")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static final String MULTIPART_FORM_DATA = "multipart/form-data";

    public static Retrofit getLoginRetrofit() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(chain -> {
            Request original = chain.request();
            List<Token> tokenList = Token.listAll(Token.class);
            Token token = tokenList.get(tokenList.size() -1);
            Request request = original.newBuilder()
                    .header("authorization",token.getToken())
                    .method(original.method(), original.body())
                    .build();
            return chain.proceed(request);
        });

        OkHttpClient client = httpClient.build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://n0rr.kro.kr:7001")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        return retrofit;
    }
    public static MultipartBody.Part  createRequestBody(@NonNull File file, String name) {
        RequestBody mFile = RequestBody.create(MediaType.parse("images/*"),file);
        MultipartBody.Part fileToUpload = MultipartBody.Part.createFormData(name,file.getName(),mFile);
        return fileToUpload;
    }
    public static RequestBody createRequestBody(@NonNull String value) {
        return RequestBody.create(MediaType.parse(MULTIPART_FORM_DATA),value);
    }

}
