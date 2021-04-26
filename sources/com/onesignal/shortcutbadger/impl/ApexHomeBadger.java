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

public class ApexHomeBadger implements C5046a {
    /* renamed from: a */
    public List<String> mo16800a() {
        return Arrays.asList(new String[]{"com.anddoes.launcher"});
    }

    /* renamed from: b */
    public void mo16801b(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", componentName.getPackageName());
        intent.putExtra("count", i);
        intent.putExtra("class", componentName.getClassName());
        if (C4805c3.m8803b(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        StringBuilder u = C0843a.m460u("unable to resolve intent: ");
        u.append(intent.toString());
        throw new C5047b(u.toString());
    }
}
