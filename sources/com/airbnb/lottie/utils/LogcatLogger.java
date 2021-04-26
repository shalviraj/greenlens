package com.airbnb.lottie.utils;

import android.util.Log;
import com.airbnb.lottie.C5312L;
import com.airbnb.lottie.LottieLogger;
import java.util.HashSet;
import java.util.Set;

public class LogcatLogger implements LottieLogger {
    private static final Set<String> loggedMessages = new HashSet();

    public void debug(String str) {
        debug(str, (Throwable) null);
    }

    public void debug(String str, Throwable th) {
        if (C5312L.DBG) {
            Log.d(C5312L.TAG, str, th);
        }
    }

    public void error(String str, Throwable th) {
        if (C5312L.DBG) {
            Log.d(C5312L.TAG, str, th);
        }
    }

    public void warning(String str) {
        warning(str, (Throwable) null);
    }

    public void warning(String str, Throwable th) {
        Set<String> set = loggedMessages;
        if (!set.contains(str)) {
            Log.w(C5312L.TAG, str, th);
            set.add(str);
        }
    }
}
