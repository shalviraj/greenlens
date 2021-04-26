package com.airbnb.lottie;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.p003os.TraceCompat;
import com.airbnb.lottie.network.DefaultLottieNetworkFetcher;
import com.airbnb.lottie.network.LottieNetworkCacheProvider;
import com.airbnb.lottie.network.LottieNetworkFetcher;
import com.airbnb.lottie.network.NetworkCache;
import com.airbnb.lottie.network.NetworkFetcher;
import java.io.File;
import p005b.p035e.p036a.p037a.C0843a;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.airbnb.lottie.L */
public class C5312L {
    public static boolean DBG = false;
    private static final int MAX_DEPTH = 20;
    public static final String TAG = "LOTTIE";
    private static LottieNetworkCacheProvider cacheProvider = null;
    private static int depthPastMaxDepth = 0;
    private static LottieNetworkFetcher fetcher = null;
    private static volatile NetworkCache networkCache = null;
    private static volatile NetworkFetcher networkFetcher = null;
    private static String[] sections = null;
    private static long[] startTimeNs = null;
    private static int traceDepth = 0;
    private static boolean traceEnabled = false;

    private C5312L() {
    }

    public static void beginSection(String str) {
        if (traceEnabled) {
            int i = traceDepth;
            if (i == 20) {
                depthPastMaxDepth++;
                return;
            }
            sections[i] = str;
            startTimeNs[i] = System.nanoTime();
            TraceCompat.beginSection(str);
            traceDepth++;
        }
    }

    public static float endSection(String str) {
        int i = depthPastMaxDepth;
        if (i > 0) {
            depthPastMaxDepth = i - 1;
            return 0.0f;
        } else if (!traceEnabled) {
            return 0.0f;
        } else {
            int i2 = traceDepth - 1;
            traceDepth = i2;
            if (i2 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(sections[i2])) {
                TraceCompat.endSection();
                return ((float) (System.nanoTime() - startTimeNs[traceDepth])) / 1000000.0f;
            } else {
                throw new IllegalStateException(C0843a.m455p(C0843a.m465z("Unbalanced trace call ", str, ". Expected "), sections[traceDepth], "."));
            }
        }
    }

    @NonNull
    public static NetworkCache networkCache(@NonNull final Context context) {
        NetworkCache networkCache2 = networkCache;
        if (networkCache2 == null) {
            synchronized (NetworkCache.class) {
                networkCache2 = networkCache;
                if (networkCache2 == null) {
                    LottieNetworkCacheProvider lottieNetworkCacheProvider = cacheProvider;
                    if (lottieNetworkCacheProvider == null) {
                        lottieNetworkCacheProvider = new LottieNetworkCacheProvider() {
                            @NonNull
                            public File getCacheDir() {
                                return new File(context.getCacheDir(), "lottie_network_cache");
                            }
                        };
                    }
                    networkCache2 = new NetworkCache(lottieNetworkCacheProvider);
                    networkCache = networkCache2;
                }
            }
        }
        return networkCache2;
    }

    @NonNull
    public static NetworkFetcher networkFetcher(@NonNull Context context) {
        NetworkFetcher networkFetcher2 = networkFetcher;
        if (networkFetcher2 == null) {
            synchronized (NetworkFetcher.class) {
                networkFetcher2 = networkFetcher;
                if (networkFetcher2 == null) {
                    NetworkCache networkCache2 = networkCache(context);
                    LottieNetworkFetcher lottieNetworkFetcher = fetcher;
                    if (lottieNetworkFetcher == null) {
                        lottieNetworkFetcher = new DefaultLottieNetworkFetcher();
                    }
                    networkFetcher2 = new NetworkFetcher(networkCache2, lottieNetworkFetcher);
                    networkFetcher = networkFetcher2;
                }
            }
        }
        return networkFetcher2;
    }

    public static void setCacheProvider(LottieNetworkCacheProvider lottieNetworkCacheProvider) {
        cacheProvider = lottieNetworkCacheProvider;
    }

    public static void setFetcher(LottieNetworkFetcher lottieNetworkFetcher) {
        fetcher = lottieNetworkFetcher;
    }

    public static void setTraceEnabled(boolean z) {
        if (traceEnabled != z) {
            traceEnabled = z;
            if (z) {
                sections = new String[20];
                startTimeNs = new long[20];
            }
        }
    }
}
