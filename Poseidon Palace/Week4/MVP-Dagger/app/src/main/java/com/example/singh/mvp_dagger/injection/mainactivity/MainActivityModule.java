package com.example.singh.mvp_dagger.injection.mainactivity;

import com.example.singh.mvp_dagger.view.activites.mainactivity.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by singh on 7/12/17.
 */


@Module
public class MainActivityModule {


    @Provides
    public MainActivityPresenter provideMainActivityPresenter(){
        return new MainActivityPresenter();
    }


}
