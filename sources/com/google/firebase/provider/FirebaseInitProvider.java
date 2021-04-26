package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.C3838l;

public class FirebaseInitProvider extends ContentProvider {
    public void attachInfo(@NonNull Context context, @NonNull ProviderInfo providerInfo) {
        C0823f.m380l(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if (!"com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            super.attachInfo(context, providerInfo);
            return;
        }
        throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
    }

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
        C3825d dVar;
        String str;
        String str2;
        Context context = getContext();
        synchronized (C3825d.f7039i) {
            if (C3825d.f7041k.containsKey("[DEFAULT]")) {
                dVar = C3825d.m7208c();
            } else {
                C3838l a = C3838l.m7223a(context);
                if (a == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    dVar = null;
                } else {
                    dVar = C3825d.m7210g(context, a, "[DEFAULT]");
                }
            }
        }
        if (dVar == null) {
            str2 = "FirebaseInitProvider";
            str = "FirebaseApp initialization unsuccessful";
        } else {
            str2 = "FirebaseInitProvider";
            str = "FirebaseApp initialization successful";
        }
        Log.i(str2, str);
        return false;
    }

    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
