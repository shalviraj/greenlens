package p005b.p096l.p180d.p185o.p189e0;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.segment.analytics.integrations.BasePayload;
import java.util.Objects;

/* renamed from: b.l.d.o.e0.x */
public final class C3899x {

    /* renamed from: b */
    public static final C3899x f7183b = new C3899x();

    /* renamed from: a */
    public final C3893r f7184a;

    public C3899x() {
        C3893r rVar = C3893r.f7172b;
        if (C3888m.f7167a == null) {
            C3888m.f7167a = new C3888m();
        }
        this.f7184a = rVar;
    }

    /* renamed from: a */
    public final void mo15420a(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.f11283h);
        edit.putString("statusMessage", status.f11284i);
        edit.putLong(BasePayload.TIMESTAMP_KEY, System.currentTimeMillis());
        edit.commit();
    }

    /* renamed from: b */
    public final void mo15421b(Context context) {
        Objects.requireNonNull(this.f7184a);
        C3893r.m7283a(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
    }
}
