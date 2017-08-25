package com.framgia.pokemon.data.source.local;

import com.framgia.pokemon.data.model.Pokemon;
import com.framgia.pokemon.data.model.response.PokemonResponse;
import com.framgia.pokemon.data.source.PokemonDataSource;

import io.reactivex.Observable;
import retrofit2.Call;

/**
 * Created by ducpm on 25/08/17.
 */

public class PokemonLocalDataSource implements PokemonDataSource {

    @Override
    public Observable<Call<PokemonResponse>> obtainListPokemon() {
        return null;
    }

    @Override
    public void notePokemon(Pokemon pokemon) {

    }
}
