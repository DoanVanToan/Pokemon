package com.framgia.pokemon.data.source;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ducpm on 25/08/17.
 */

public class ServiceGenerator {
    private static final String BASE_URL = "http://pokeapi.co/api/v2/";
    private Retrofit mRetrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public Retrofit getRetrofit() {
        return mRetrofit;
    }

    public void setRetrofit(Retrofit retrofit) {
        mRetrofit = retrofit;
    }
}

