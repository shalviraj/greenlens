package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p131e.p140i.C2775ec;

/* renamed from: b.l.a.c.h.b.q5 */
public final class C3293q5 {

    /* renamed from: a */
    public final Context f5883a;
    @Nullable

    /* renamed from: b */
    public String f5884b;
    @Nullable

    /* renamed from: c */
    public String f5885c;
    @Nullable

    /* renamed from: d */
    public String f5886d;
    @Nullable

    /* renamed from: e */
    public Boolean f5887e;

    /* renamed from: f */
    public long f5888f;
    @Nullable

    /* renamed from: g */
    public C2775ec f5889g;

    /* renamed from: h */
    public boolean f5890h = true;
    @Nullable

    /* renamed from: i */
    public final Long f5891i;
    @Nullable

    /* renamed from: j */
    public String f5892j;

    public C3293q5(Context context, @Nullable C2775ec ecVar, @Nullable Long l) {
        Context applicationContext = context.getApplicationContext();
        Objects.requireNonNull(applicationContext, "null reference");
        this.f5883a = applicationContext;
        this.f5891i = l;
        if (ecVar != null) {
            this.f5889g = ecVar;
            this.f5884b = ecVar.f4711l;
            this.f5885c = ecVar.f4710k;
            this.f5886d = ecVar.f4709j;
            this.f5890h = ecVar.f4708i;
            this.f5888f = ecVar.f4707h;
            this.f5892j = ecVar.f4713n;
            Bundle bundle = ecVar.f4712m;
            if (bundle != null) {
                this.f5887e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
