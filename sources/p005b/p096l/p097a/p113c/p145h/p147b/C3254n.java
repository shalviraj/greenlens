package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.h.b.n */
public final class C3254n {

    /* renamed from: a */
    public final String f5757a;

    /* renamed from: b */
    public final String f5758b;

    /* renamed from: c */
    public final String f5759c;

    /* renamed from: d */
    public final long f5760d;

    /* renamed from: e */
    public final long f5761e;

    /* renamed from: f */
    public final C3287q f5762f;

    public C3254n(C3281p4 p4Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        C3287q qVar;
        C0823f.m376j(str2);
        C0823f.m376j(str3);
        this.f5757a = str2;
        this.f5758b = str3;
        this.f5759c = true == TextUtils.isEmpty(str) ? null : str;
        this.f5760d = j;
        this.f5761e = j2;
        if (j2 != 0 && j2 > j) {
            p4Var.mo14329d().f5802i.mo14415b("Event created with reverse previous/current timestamps. appId", C3269o3.m6253t(str2));
        }
        if (!bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    p4Var.mo14329d().f5799f.mo14414a("Param name can't be null");
                } else {
                    Object s = p4Var.mo14467t().mo14552s(str4, bundle2.get(str4));
                    if (s == null) {
                        p4Var.mo14329d().f5802i.mo14415b("Param value can't be null", p4Var.mo14468u().mo14322q(str4));
                    } else {
                        p4Var.mo14467t().mo14559z(bundle2, str4, s);
                    }
                }
                it.remove();
            }
            qVar = new C3287q(bundle2);
        } else {
            qVar = new C3287q(new Bundle());
        }
        this.f5762f = qVar;
    }

    /* renamed from: a */
    public final C3254n mo14430a(C3281p4 p4Var, long j) {
        return new C3254n(p4Var, this.f5759c, this.f5757a, this.f5758b, this.f5760d, j, this.f5762f);
    }

    public final String toString() {
        String str = this.f5757a;
        String str2 = this.f5758b;
        String valueOf = String.valueOf(this.f5762f);
        StringBuilder sb = new StringBuilder(C0843a.m441b(String.valueOf(str).length(), 33, String.valueOf(str2).length(), valueOf.length()));
        C0843a.m431G(sb, "Event{appId='", str, "', name='", str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    public C3254n(C3281p4 p4Var, String str, String str2, String str3, long j, long j2, C3287q qVar) {
        C0823f.m376j(str2);
        C0823f.m376j(str3);
        Objects.requireNonNull(qVar, "null reference");
        this.f5757a = str2;
        this.f5758b = str3;
        this.f5759c = true == TextUtils.isEmpty(str) ? null : str;
        this.f5760d = j;
        this.f5761e = j2;
        if (j2 != 0 && j2 > j) {
            p4Var.mo14329d().f5802i.mo14416c("Event created with reverse previous/current timestamps. appId, name", C3269o3.m6253t(str2), C3269o3.m6253t(str3));
        }
        this.f5762f = qVar;
    }
}
