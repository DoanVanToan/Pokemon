package com.framgia.pokemon.data.model.response;

import com.framgia.pokemon.data.model.Pokemon;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by ducpm on 25/08/17.
 */
public class PokemonResponse {
    @SerializedName("results")
    private ArrayList<Pokemon> mPokemons;

    public PokemonResponse(ArrayList<Pokemon> pokemons) {
        mPokemons = pokemons;
    }

    public ArrayList<Pokemon> getPokemons() {
        return mPokemons;
    }

    public void setPokemons(ArrayList<Pokemon> pokemons) {
        mPokemons = pokemons;
    }
}
