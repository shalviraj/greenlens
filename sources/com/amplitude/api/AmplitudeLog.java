package com.amplitude.api;

import android.util.Log;

public class AmplitudeLog {
    public static AmplitudeLog instance = new AmplitudeLog();
    private volatile boolean enableLogging = true;
    private volatile int logLevel = 4;

    private AmplitudeLog() {
    }

    public static AmplitudeLog getLogger() {
        return instance;
    }

    /* renamed from: d */
    public int mo18148d(String str, String str2) {
        if (!this.enableLogging || this.logLevel > 3) {
            return 0;
        }
        return Log.d(str, str2);
    }

    /* renamed from: d */
    public int mo18149d(String str, String str2, Throwable th) {
        if (!this.enableLogging || this.logLevel > 3) {
            return 0;
        }
        return Log.d(str, str2, th);
    }

    /* renamed from: e */
    public int mo18150e(String str, String str2) {
        if (!this.enableLogging || this.logLevel > 6) {
            return 0;
        }
        return Log.e(str, str2);
    }

    /* renamed from: e */
    public int mo18151e(String str, String str2, Throwable th) {
        if (!this.enableLogging || this.logLevel > 6) {
            return 0;
        }
        return Log.e(str, str2, th);
    }

    public String getStackTraceString(Throwable th) {
        return Log.getStackTraceString(th);
    }

    /* renamed from: i */
    public int mo18153i(String str, String str2) {
        if (!this.enableLogging || this.logLevel > 4) {
            return 0;
        }
        return Log.i(str, str2);
    }

    /* renamed from: i */
    public int mo18154i(String str, String str2, Throwable th) {
        if (!this.enableLogging || this.logLevel > 4) {
            return 0;
        }
        return Log.i(str, str2, th);
    }

    public boolean isLoggable(String str, int i) {
        return Log.isLoggable(str, i);
    }

    public int println(int i, String str, String str2) {
        return Log.println(i, str, str2);
    }

    public AmplitudeLog setEnableLogging(boolean z) {
        this.enableLogging = z;
        return instance;
    }

    public AmplitudeLog setLogLevel(int i) {
        this.logLevel = i;
        return instance;
    }

    /* renamed from: v */
    public int mo18159v(String str, String str2) {
        if (!this.enableLogging || this.logLevel > 2) {
            return 0;
        }
        return Log.v(str, str2);
    }

    /* renamed from: v */
    public int mo18160v(String str, String str2, Throwable th) {
        if (!this.enableLogging || this.logLevel > 2) {
            return 0;
        }
        return Log.v(str, str2, th);
    }

    /* renamed from: w */
    public int mo18161w(String str, String str2) {
        if (!this.enableLogging || this.logLevel > 5) {
            return 0;
        }
        return Log.w(str, str2);
    }

    /* renamed from: w */
    public int mo18162w(String str, String str2, Throwable th) {
        if (!this.enableLogging || this.logLevel > 5) {
            return 0;
        }
        return Log.w(str, str2, th);
    }

    /* renamed from: w */
    public int mo18163w(String str, Throwable th) {
        if (!this.enableLogging || this.logLevel > 5) {
            return 0;
        }
        return Log.w(str, th);
    }

    public int wtf(String str, String str2) {
        if (!this.enableLogging || this.logLevel > 7) {
            return 0;
        }
        return Log.wtf(str, str2);
    }

    public int wtf(String str, String str2, Throwable th) {
        if (!this.enableLogging || this.logLevel > 7) {
            return 0;
        }
        return Log.wtf(str, str2, th);
    }

    public int wtf(String str, Throwable th) {
        if (!this.enableLogging || this.logLevel > 7) {
            return 0;
        }
        return Log.wtf(str, th);
    }
}
