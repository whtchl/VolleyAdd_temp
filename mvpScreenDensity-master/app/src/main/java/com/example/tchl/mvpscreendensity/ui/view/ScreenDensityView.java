package com.example.tchl.mvpscreendensity.ui.view;

import com.example.tchl.mvpscreendensity.model.entity.ScreenDensity;

/**
 * Created by Administrator on 2015/2/7.
 */
public interface ScreenDensityView {
    void showError();
    void showLoading();

    void setScreenDensityInfo(ScreenDensity screenDensity);
}
