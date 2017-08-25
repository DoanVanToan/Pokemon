package com.framgia.pokemon.data.source.remote;

import com.framgia.pokemon.data.model.Pokemon;
import com.framgia.pokemon.data.model.response.PokemonResponse;
import com.framgia.pokemon.data.source.PokemonDataSource;
import com.framgia.pokemon.data.source.PokemonService;
import com.framgia.pokemon.data.source.ServiceGenerator;

import java.util.ArrayList;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.annotations.NonNull;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by ducpm on 25/08/17.
 */
public class PokemonRemoteDataSource implements PokemonDataSource {
    private static final String TAG = "PokemonRemoteDataSource";
    private ServiceGenerator mServiceGenerator;

    @Override
    public Observable<Call<PokemonResponse>> obtainListPokemon() {
        return Observable.create(new ObservableOnSubscribe<Call<PokemonResponse>>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<Call<PokemonResponse>> e)
                throws Exception {
                PokemonService service = mServiceGenerator.getRetrofit()
                    .create(PokemonService.class);
                Call<PokemonResponse> listCall = service.obtainListPokemon();
                listCall.enqueue(new Callback<PokemonResponse>() {
                    @Override
                    public void onResponse(Call<PokemonResponse> call,
                                           Response<PokemonResponse> response) {
                        if (response.isSuccessful()) {
                            PokemonResponse pokemonResponse = response.body();
                            ArrayList<Pokemon> pokemons = pokemonResponse.getPokemons();
                            for (int i = 0; i < pokemons.size(); i++) {
                                Pokemon p = pokemons.get(i);
                                // TODO: 25/08/17  
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<PokemonResponse> call, Throwable t) {
                    }
                });
            }
        });
    }

    @Override
    public void notePokemon(Pokemon pokemon) {
    }
}
