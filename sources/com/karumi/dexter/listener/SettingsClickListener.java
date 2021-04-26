package com.karumi.dexter.listener;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import p005b.p035e.p036a.p037a.C0843a;

public class SettingsClickListener implements View.OnClickListener {
    public void onClick(View view) {
        Context context = view.getContext();
        StringBuilder u = C0843a.m460u("package:");
        u.append(context.getPackageName());
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(u.toString()));
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
