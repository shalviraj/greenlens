package cat.ereza.customactivityoncrash.provider;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.Thread;
import p360g.p361a.p362a.C6962a;
import p360g.p361a.p362a.C6963b;
import p360g.p361a.p362a.C6964c;

public class CaocInitProvider extends ContentProvider {
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        Context context = getContext();
        Application application = C6964c.f13963a;
        if (context == null) {
            try {
                Log.e("CustomActivityOnCrash", "Install failed: context is null!");
                return false;
            } catch (Throwable th) {
                Log.e("CustomActivityOnCrash", "An unknown error occurred while installing CustomActivityOnCrash, it may not have been properly initialized. Please report this as a bug if needed.", th);
                return false;
            }
        } else {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler == null || !defaultUncaughtExceptionHandler.getClass().getName().startsWith("cat.ereza.customactivityoncrash")) {
                if (defaultUncaughtExceptionHandler != null && !defaultUncaughtExceptionHandler.getClass().getName().startsWith("com.android.internal.os")) {
                    Log.e("CustomActivityOnCrash", "IMPORTANT WARNING! You already have an UncaughtExceptionHandler, are you sure this is correct? If you use a custom UncaughtExceptionHandler, you must initialize it AFTER CustomActivityOnCrash! Installing anyway, but your original handler will not be called.");
                }
                C6964c.f13963a = (Application) context.getApplicationContext();
                Thread.setDefaultUncaughtExceptionHandler(new C6962a(defaultUncaughtExceptionHandler));
                C6964c.f13963a.registerActivityLifecycleCallbacks(new C6963b());
            } else {
                Log.e("CustomActivityOnCrash", "CustomActivityOnCrash was already installed, doing nothing!");
            }
            Log.i("CustomActivityOnCrash", "CustomActivityOnCrash has been installed.");
            return false;
        }
    }

    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
