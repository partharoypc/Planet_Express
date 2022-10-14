package com.partharoypc.planetexpress.Network;

import com.partharoypc.planetexpress.Model.SignupResponseModelClass;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RetrofitInstance {

    @FormUrlEncoded
    @POST("signup.php")
    Call<SignupResponseModelClass> getSignup(
            @Field("name") String name,
            @Field("email") String email,
            @Field("password") String password,
            @Field("mobile") String mobile,
            @Field("address") String address
    );


}
