package com.ms.sdk.ad.framework;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;

import com.ms.sdk.ad.framework.params.BaseParams;

public interface IAdFramework<
        INIT extends BaseParams,
        ADPARAMS extends BaseParams
        > {

    // sdk 名称
    String name();

    // sdk 版本
    String version();

    // 初始化
    void initAd(INIT init);

    // 开屏广告
    void splashAd(ADPARAMS adparams);

    // banner广告
    void bannerAd(ADPARAMS adparams);

    void unifiedInterstitialAD(ADPARAMS adparams);

    // h5
    void hybridAd(ADPARAMS adparams);

    // 全屏视频
    void fullScreenVideoAd(ADPARAMS adparams);

    // 激励视频
    void rewardVideoAd(ADPARAMS adparams);

    // 原生渲染
    void nativeExpressAd(ADPARAMS adparams);

    // 自渲染
    void nativeUnifiedAD(ADPARAMS adparams);

}
