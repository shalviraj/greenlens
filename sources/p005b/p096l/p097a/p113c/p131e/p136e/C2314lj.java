package p005b.p096l.p097a.p113c.p131e.p136e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p005b.p096l.p097a.p113c.p119b.p124n.C1955a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.lj */
public final class C2314lj extends BroadcastReceiver {

    /* renamed from: a */
    public final String f4047a;

    /* renamed from: b */
    public final /* synthetic */ C2362nj f4048b;

    public C2314lj(C2362nj njVar, String str) {
        this.f4048b = njVar;
        this.f4047a = str;
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        String c;
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).f11283h == 0) {
                String str2 = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                C2338mj mjVar = this.f4048b.f4101c.get(this.f4047a);
                if (mjVar == null) {
                    C1955a aVar = C2362nj.f4098d;
                    str = aVar.f3501a;
                    c = aVar.mo12284c("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str2);
                    String group = matcher.find() ? matcher.group() : null;
                    mjVar.f4080e = group;
                    if (group == null) {
                        C1955a aVar2 = C2362nj.f4098d;
                        str = aVar2.f3501a;
                        c = aVar2.mo12284c("Unable to extract verification code.", new Object[0]);
                    } else if (!C1960d.m2757U1(mjVar.f4079d)) {
                        C2362nj.m3825f(this.f4048b, this.f4047a);
                    }
                }
                Log.e(str, c);
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
