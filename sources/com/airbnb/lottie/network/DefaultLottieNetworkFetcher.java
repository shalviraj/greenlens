package com.airbnb.lottie.network;

import androidx.annotation.NonNull;
import java.net.HttpURLConnection;
import java.net.URL;

public class DefaultLottieNetworkFetcher implements LottieNetworkFetcher {
    @NonNull
    public LottieFetchResult fetchSync(@NonNull String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new DefaultLottieFetchResult(httpURLConnection);
    }
}
