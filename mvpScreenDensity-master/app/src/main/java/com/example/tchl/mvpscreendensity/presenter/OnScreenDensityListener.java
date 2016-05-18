package com.example.tchl.mvpscreendensity.presenter;

import com.example.tchl.mvpscreendensity.model.entity.ScreenDensity;

/**
 * Created by tchl on 2016-05-15.
 *  * 在Presenter层实现，给Model层回调，更改View层的状态，确保Model层不直接操作View层
 */
public interface OnScreenDensityListener {
    /**
     * 成功时回调
     *
     * @param screenDensity
     */
    void onSuccess(ScreenDensity screenDensity);
    /**
     * 失败时回调，简单处理，没做什么
     */
    void onError();
}