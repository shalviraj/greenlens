package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4805c3;
import p005b.p273o.p278y4.C5046a;
import p005b.p273o.p278y4.C5047b;

@Deprecated
public class LGHomeBadger implements C5046a {
    /* renamed from: a */
    public List<String> mo16800a() {
        return Arrays.asList(new String[]{"com.lge.launcher", "com.lge.launcher2"});
    }

    /* renamed from: b */
    public void mo16801b(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        if (C4805c3.m8803b(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        StringBuilder u = C0843a.m460u("unable to resolve intent: ");
        u.append(intent.toString());
        throw new C5047b(u.toString());
    }
}
