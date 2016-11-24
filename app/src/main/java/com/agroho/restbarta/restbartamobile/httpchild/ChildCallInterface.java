package com.agroho.restbarta.restbartamobile.httpchild;

import com.agroho.restbarta.restbartamobile.model.Child;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by rezaul on 11/24/16.
 */

public interface ChildCallInterface {

    @GET("parent/1")
    Call<List<Child>> getChildList();

    @POST("child/submit")
    Call<Void> submitChildResult(@Body Child child);

}
