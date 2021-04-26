package androidx.core.p003os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;

/* renamed from: androidx.core.os.TraceCompat */
public final class TraceCompat {
    private static final String TAG = "TraceCompat";
    private static Method sAsyncTraceBeginMethod;
    private static Method sAsyncTraceEndMethod;
    private static Method sIsTagEnabledMethod;
    private static Method sTraceCounterMethod;
    private static long sTraceTagApp;

    static {
        Class<String> cls = String.class;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                sTraceTagApp = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls2 = Long.TYPE;
                sIsTagEnabledMethod = Trace.class.getMethod("isTagEnabled", new Class[]{cls2});
                Class cls3 = Integer.TYPE;
                sAsyncTraceBeginMethod = Trace.class.getMethod("asyncTraceBegin", new Class[]{cls2, cls, cls3});
                sAsyncTraceEndMethod = Trace.class.getMethod("asyncTraceEnd", new Class[]{cls2, cls, cls3});
                sTraceCounterMethod = Trace.class.getMethod("traceCounter", new Class[]{cls2, cls, cls3});
            } catch (Exception e) {
                Log.i(TAG, "Unable to initialize via reflection.", e);
            }
        }
    }

    private TraceCompat() {
    }

    public static void beginAsyncSection(@NonNull String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.beginAsyncSection(str, i);
            return;
        }
        try {
            sAsyncTraceBeginMethod.invoke((Object) null, new Object[]{Long.valueOf(sTraceTagApp), str, Integer.valueOf(i)});
        } catch (Exception unused) {
            Log.v(TAG, "Unable to invoke asyncTraceBegin() via reflection.");
        }
    }

    public static void beginSection(@NonNull String str) {
        Trace.beginSection(str);
    }

    public static void endAsyncSection(@NonNull String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.endAsyncSection(str, i);
            return;
        }
        try {
            sAsyncTraceEndMethod.invoke((Object) null, new Object[]{Long.valueOf(sTraceTagApp), str, Integer.valueOf(i)});
        } catch (Exception unused) {
            Log.v(TAG, "Unable to invoke endAsyncSection() via reflection.");
        }
    }

    public static void endSection() {
        Trace.endSection();
    }

    public static boolean isEnabled() {
        if (Build.VERSION.SDK_INT >= 29) {
            return Trace.isEnabled();
        }
        try {
            return ((Boolean) sIsTagEnabledMethod.invoke((Object) null, new Object[]{Long.valueOf(sTraceTagApp)})).booleanValue();
        } catch (Exception unused) {
            Log.v(TAG, "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }

    public static void setCounter(@NonNull String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, (long) i);
            return;
        }
        try {
            sTraceCounterMethod.invoke((Object) null, new Object[]{Long.valueOf(sTraceTagApp), str, Integer.valueOf(i)});
        } catch (Exception unused) {
            Log.v(TAG, "Unable to invoke traceCounter() via reflection.");
        }
    }
}
