package com.framgia.pokemon.screen.main;

import com.framgia.pokemon.screen.BasePresenter;
import com.framgia.pokemon.screen.BaseViewModel;

/**
 * Created by ducpm on 24/08/17.
 */
interface MainContract {
    /**
     * View.
     */
    interface ViewModel extends BaseViewModel<Presenter> {
    }

    /**
     * Presenter.
     */
    interface Presenter extends BasePresenter {
    }
}
