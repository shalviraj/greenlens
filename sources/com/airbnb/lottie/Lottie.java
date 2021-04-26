package com.airbnb.lottie;

import androidx.annotation.NonNull;

public class Lottie {
    private Lottie() {
    }

    public static void initialize(@NonNull LottieConfig lottieConfig) {
        C5312L.setFetcher(lottieConfig.networkFetcher);
        C5312L.setCacheProvider(lottieConfig.cacheProvider);
        C5312L.setTraceEnabled(lottieConfig.enableSystraceMarkers);
    }
}
