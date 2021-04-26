package com.airbnb.lottie.network;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

public interface LottieNetworkFetcher {
    @WorkerThread
    @NonNull
    LottieFetchResult fetchSync(@NonNull String str);
}
