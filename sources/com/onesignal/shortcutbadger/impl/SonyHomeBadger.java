package com.onesignal.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;
import p005b.p273o.p278y4.C5046a;
import p005b.p273o.p278y4.p279d.C5049a;

public class SonyHomeBadger implements C5046a {

    /* renamed from: a */
    public final Uri f11514a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* renamed from: b */
    public AsyncQueryHandler f11515b;

    /* renamed from: a */
    public List<String> mo16800a() {
        return Arrays.asList(new String[]{"com.sonyericsson.home", "com.sonymobile.home"});
    }

    /* renamed from: b */
    public void mo16801b(Context context, ComponentName componentName, int i) {
        boolean z = false;
        if (!(context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null)) {
            Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
            if (i > 0) {
                z = true;
            }
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", z);
            context.sendBroadcast(intent);
        } else if (i >= 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("badge_count", Integer.valueOf(i));
            contentValues.put("package_name", componentName.getPackageName());
            contentValues.put("activity_name", componentName.getClassName());
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f11515b == null) {
                    this.f11515b = new C5049a(this, context.getApplicationContext().getContentResolver());
                }
                this.f11515b.startInsert(0, (Object) null, this.f11514a, contentValues);
                return;
            }
            context.getApplicationContext().getContentResolver().insert(this.f11514a, contentValues);
        }
    }
}
