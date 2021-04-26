package com.airbnb.lottie.network;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.InputStream;

public interface LottieFetchResult extends Closeable {
    @NonNull
    InputStream bodyByteStream();

    @Nullable
    String contentType();

    @Nullable
    String error();

    boolean isSuccessful();
}
