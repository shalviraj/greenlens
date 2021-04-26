package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p119b.C1760e;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1817g;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: h */
    public static final /* synthetic */ int f11260h = 0;

    /* renamed from: g */
    public int f11261g = 0;

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f11261g = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C1817g a = C1817g.m2414a(this);
                if (i2 == -1) {
                    Handler handler = a.f3191j;
                    handler.sendMessage(handler.obtainMessage(3));
                } else if (i2 == 0) {
                    C1754b bVar = new C1754b(13, (PendingIntent) null);
                    int intExtra = getIntent().getIntExtra("failing_client_id", -1);
                    if (!a.mo12092c(bVar, intExtra)) {
                        Handler handler2 = a.f3191j;
                        handler2.sendMessage(handler2.obtainMessage(5, intExtra, 0, bVar));
                    }
                }
            }
        } else if (i == 2) {
            this.f11261g = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f11261g = 0;
        setResult(0);
        finish();
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f11261g = bundle.getInt("resolution");
        }
        if (this.f11261g != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                str = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
                Integer num = (Integer) extras.get("error_code");
                if (pendingIntent == null && num == null) {
                    str = "Activity started without resolution";
                } else if (pendingIntent != null) {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                        this.f11261g = 1;
                        return;
                    } catch (IntentSender.SendIntentException e) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                    }
                } else {
                    Object obj = C1760e.f3107c;
                    C1760e.f3108d.mo12007e(this, num.intValue(), 2, this);
                    this.f11261g = 1;
                    return;
                }
            }
            Log.e("GoogleApiActivity", str);
            finish();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f11261g);
        super.onSaveInstanceState(bundle);
    }
}
