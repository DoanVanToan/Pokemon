package com.framgia.pokemon.data.source;

import com.framgia.pokemon.data.model.response.PokemonResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ducpm on 25/08/17.
 */

public interface PokemonService {

    @GET("pokemon")
    Call<PokemonResponse> obtainListPokemon();
}
