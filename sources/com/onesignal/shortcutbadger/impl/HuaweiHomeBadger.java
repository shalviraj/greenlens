package com.onesignal.shortcutbadger.impl;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import p005b.p273o.p278y4.C5046a;

public class HuaweiHomeBadger implements C5046a {
    /* renamed from: a */
    public List<String> mo16800a() {
        return Arrays.asList(new String[]{"com.huawei.android.launcher"});
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public void mo16801b(Context context, ComponentName componentName, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package", context.getPackageName());
        bundle.putString("class", componentName.getClassName());
        bundle.putInt("badgenumber", i);
        context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
    }
}
