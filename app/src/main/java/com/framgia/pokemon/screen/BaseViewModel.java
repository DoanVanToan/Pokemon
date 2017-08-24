package com.framgia.pokemon.screen;
/**
 * Created by ducpm on 24/08/17.
 */

/**
 *
 * @param <T> Any Interface entend BasePresenter
 */
public interface BaseViewModel<T extends BasePresenter> {
    void onStart();

    void onStop();

    void setPresenter(T presenter);
}
