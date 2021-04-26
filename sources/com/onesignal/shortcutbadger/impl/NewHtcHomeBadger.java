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

public class NewHtcHomeBadger implements C5046a {
    /* renamed from: a */
    public List<String> mo16800a() {
        return Arrays.asList(new String[]{"com.htc.launcher"});
    }

    /* renamed from: b */
    public void mo16801b(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i);
        if (C4805c3.m8803b(context, intent) || C4805c3.m8803b(context, intent2)) {
            context.sendBroadcast(intent);
            context.sendBroadcast(intent2);
            return;
        }
        StringBuilder u = C0843a.m460u("unable to resolve intent: ");
        u.append(intent2.toString());
        throw new C5047b(u.toString());
    }
}
