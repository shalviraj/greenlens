package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import p005b.p273o.C4805c3;
import p005b.p273o.p278y4.C5046a;

public class SamsungHomeBadger implements C5046a {

    /* renamed from: b */
    public static final String[] f11512b = {"_id", "class"};

    /* renamed from: a */
    public DefaultBadger f11513a = new DefaultBadger();

    /* renamed from: a */
    public List<String> mo16800a() {
        return Arrays.asList(new String[]{"com.sec.android.app.launcher", "com.sec.android.app.twlauncher"});
    }

    /* renamed from: b */
    public void mo16801b(Context context, ComponentName componentName, int i) {
        if (this.f11513a == null || !C4805c3.m8803b(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE"))) {
            Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
            ContentResolver contentResolver = context.getContentResolver();
            Cursor cursor = null;
            try {
                cursor = contentResolver.query(parse, f11512b, "package=?", new String[]{componentName.getPackageName()}, (String) null);
                if (cursor != null) {
                    String className = componentName.getClassName();
                    boolean z = false;
                    while (cursor.moveToNext()) {
                        contentResolver.update(parse, mo22384c(componentName, i, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                        if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                            z = true;
                        }
                    }
                    if (!z) {
                        contentResolver.insert(parse, mo22384c(componentName, i, true));
                    }
                }
            } finally {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            }
        } else {
            this.f11513a.mo16801b(context, componentName, i);
        }
    }

    /* renamed from: c */
    public final ContentValues mo22384c(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }
}
