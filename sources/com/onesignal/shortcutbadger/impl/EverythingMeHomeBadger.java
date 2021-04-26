package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import p005b.p273o.p278y4.C5046a;

public class EverythingMeHomeBadger implements C5046a {
    /* renamed from: a */
    public List<String> mo16800a() {
        return Arrays.asList(new String[]{"me.everything.launcher"});
    }

    /* renamed from: b */
    public void mo16801b(Context context, ComponentName componentName, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        contentValues.put("count", Integer.valueOf(i));
        context.getContentResolver().insert(Uri.parse("content://me.everything.badger/apps"), contentValues);
    }
}
