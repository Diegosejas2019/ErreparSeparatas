package com.example.erreparseparatas.interfaces;

import com.example.erreparseparatas.model.Detalle;
import com.example.erreparseparatas.model.Publicaciones;
import com.example.erreparseparatas.model.ResponseUSER;
import com.example.erreparseparatas.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface APIService {

    @POST("/api/User/Login")
    @FormUrlEncoded
    Call<ResponseUSER> authenticateUser(@Field("email") String email,
                                        @Field("password") String password
    );

    @POST("/api/User/ForgotPassword")
    @FormUrlEncoded
    Call<ResponseUSER> recoveryUser(@Field("email") String email
    );

    @POST("/api/User/Register")
    @FormUrlEncoded
    Call<ResponseUSER> registeruser(@Field("nombre") String nombre,
                            @Field("apellido") String apellido,
                            @Field("email") String email,
                            @Field("telefono") String telefono,
                            @Field("password") String password,
                            @Field("repassword") String repassword
    );

    @Headers({ "Content-Type: application/json;charset=UTF-8"})
    @POST("/api/Book/ActiveBook")
    Call<ResponseUSER> activarcodigo(@Header("Authorization") String auth ,
                                     @Query("codeBook") String codigo,
                                     @Query("userid") int iduser
    );

    @Headers({ "Content-Type: application/json;charset=UTF-8"})
    @GET("/api/Book/getBooks")
    Call<List<Publicaciones>> obtenercodigos(@Header("Authorization") String auth ,
                                             @Query("userid") int iduser
    );
    @Headers({ "Content-Type: application/json;charset=UTF-8"})
    @GET("/api/Book/getBookDetails")
    Call<List<Detalle>> obtenerdetalle(@Header("Authorization") String auth ,
                                       @Query("publicationId") int iduser
    );

}

