package com.example.androidlibraies;

import com.example.androidlibraies.model.RecentNewsModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("api/rashifal")
    Call<List<HoroscopeDatamodel>> showHoroscope(@Query("type") String typeid, @Query("date") String date);

    @GET("api/news/recent")
    Call<RecentNewsModel> showRecentNews();
}
