package com.example.tchl.mvpscreendensity.presenter.impl;

import android.util.Log;

import com.example.tchl.mvpscreendensity.model.ScreenDensityModel;
import com.example.tchl.mvpscreendensity.model.entity.ScreenDensity;
import com.example.tchl.mvpscreendensity.model.impl.ScreenDensityModelImpl;
import com.example.tchl.mvpscreendensity.presenter.OnScreenDensityListener;
import com.example.tchl.mvpscreendensity.presenter.ScreenDensityPresenter;
import com.example.tchl.mvpscreendensity.ui.view.ScreenDensityView;

/**
 * Created by tchl on 2016-05-15.
 */
public class ScreenDensityPresenterImpl implements ScreenDensityPresenter,OnScreenDensityListener {

    /*Presenter作为中间层，持有View和Model的引用*/
    private ScreenDensityView screenDensityView;
    private ScreenDensityModel screenDensityModel;

    public ScreenDensityPresenterImpl( ScreenDensityView screenDensityView) {
        this.screenDensityView = screenDensityView;
        screenDensityModel = new ScreenDensityModelImpl();
    }

    @Override
    public void getScreenDensity(){
        Log.d("ScreenDensityPresenterImpl","tchl getScreenDensity");
        screenDensityModel.loadScreenDensity(this);

    }

    @Override
    public void onSuccess(ScreenDensity screenDensity) {
         screenDensityView.showLoading();
/*        weatherView.hideLoading();
        weatherView.setWeatherInfo(weather);*/
    }

    @Override
    public void onError() {
        screenDensityView.showError();
/*        weatherView.hideLoading();
        weatherView.showError();*/
    }

}
