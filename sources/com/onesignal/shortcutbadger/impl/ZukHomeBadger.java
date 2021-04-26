package com.onesignal.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import p005b.p273o.p278y4.C5046a;

public class ZukHomeBadger implements C5046a {

    /* renamed from: a */
    public final Uri f11517a = Uri.parse("content://com.android.badge/badge");

    /* renamed from: a */
    public List<String> mo16800a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @TargetApi(11)
    /* renamed from: b */
    public void mo16801b(Context context, ComponentName componentName, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(this.f11517a, "setAppBadgeCount", (String) null, bundle);
    }
}
