package com.framgia.pokemon.data.source;

import com.framgia.pokemon.data.model.Pokemon;
import com.framgia.pokemon.data.model.response.PokemonResponse;

import io.reactivex.Observable;
import retrofit2.Call;

/**
 * Created by ducpm on 25/08/17.
 */
public class PokemonRepository implements PokemonDataSource {
    private PokemonDataSource mLocalDataSource;
    private PokemonDataSource mRemoteDataSource;

    public PokemonRepository() {
    }

    @Override
    public Observable<Call<PokemonResponse>> obtainListPokemon() {
        return mRemoteDataSource.obtainListPokemon();
    }

    @Override
    public void notePokemon(Pokemon pokemon) {
        mLocalDataSource.notePokemon(pokemon);
    }

    public PokemonDataSource getLocalDataSource() {
        return mLocalDataSource;
    }

    public void setLocalDataSource(PokemonDataSource localDataSource) {
        mLocalDataSource = localDataSource;
    }
}
