package com.framgia.pokemon.screen.main;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.view.MenuItem;

import com.framgia.pokemon.BR;
import com.framgia.pokemon.R;
import com.framgia.pokemon.screen.pokemon.PokemonFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ducpm on 24/08/17.
 */
public class MainViewModel extends BaseObservable implements MainContract.ViewModel {
    private static final int TAB_POKEMON = 1;
    private static final int TAB_FAVORITE = 2;
    private static final int TAB_REGION = 0;
    private MainActivity mMainActivity;
    private MainAdapter mMainAdapter;
    private MainContract.Presenter mPresenter;
    private int mPosition;
    private BottomNavigationView.OnNavigationItemSelectedListener mListener =
        new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_region:
                        setPosition(TAB_REGION);
                        break;
                    case R.id.navigation_pokemon:
                        setPosition(TAB_POKEMON);
                        break;
                    case R.id.favorited:
                        setPosition(TAB_FAVORITE);
                        break;
                    default:
                        break;
                }
                return false;
            }
        };

    public MainViewModel(MainActivity mainActivity) {
        mMainActivity = mainActivity;
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(PokemonFragment.newInstance());
        mMainAdapter = new MainAdapter(mainActivity.getSupportFragmentManager(), fragments);
        setMainAdapter(mMainAdapter);
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onStop() {
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Bindable
    public BottomNavigationView.OnNavigationItemSelectedListener getListener() {
        return mListener;
    }

    public void setListener(BottomNavigationView.OnNavigationItemSelectedListener listener) {
        mListener = listener;
        notifyPropertyChanged(BR.listener);
    }

    @Bindable
    public int getPosition() {
        return mPosition;
    }

    public void setPosition(int position) {
        mPosition = position;
        notifyPropertyChanged(BR.position);
    }

    @Bindable
    public MainAdapter getMainAdapter() {
        return mMainAdapter;
    }

    public void setMainAdapter(MainAdapter mainAdapter) {
        mMainAdapter = mainAdapter;
        notifyPropertyChanged(BR.mainAdapter);
    }

    @Bindable
    public MainActivity getMainActivity() {
        return mMainActivity;
    }

    public void setMainActivity(MainActivity mainActivity) {
        mMainActivity = mainActivity;
        notifyPropertyChanged(BR.mainActivity);
    }
}

