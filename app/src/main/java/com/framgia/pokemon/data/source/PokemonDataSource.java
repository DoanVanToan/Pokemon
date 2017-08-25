package com.framgia.pokemon.data.source;

import com.framgia.pokemon.data.model.Pokemon;
import com.framgia.pokemon.data.model.response.PokemonResponse;

import io.reactivex.Observable;
import retrofit2.Call;

/**
 * Created by ducpm on 25/08/17.
 */
public interface PokemonDataSource {
    Observable<Call<PokemonResponse>> obtainListPokemon();

    void notePokemon(Pokemon pokemon);
}
