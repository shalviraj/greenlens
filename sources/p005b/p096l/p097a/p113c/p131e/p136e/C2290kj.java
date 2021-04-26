package p005b.p096l.p097a.p113c.p131e.p136e;

import com.google.android.gms.common.api.Status;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p124n.C1955a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.kj */
public final class C2290kj extends C2648zh {

    /* renamed from: c */
    public final String f4020c;

    /* renamed from: d */
    public final /* synthetic */ C2362nj f4021d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2290kj(C2362nj njVar, C2648zh zhVar, String str) {
        super(zhVar.f4530a, zhVar.f4531b);
        this.f4021d = njVar;
        this.f4020c = str;
    }

    /* renamed from: c */
    public final void mo12770c(String str) {
        C2362nj.f4098d.mo12282a("onCodeSent", new Object[0]);
        C2338mj mjVar = this.f4021d.f4101c.get(this.f4020c);
        if (mjVar != null) {
            for (C2648zh c : mjVar.f4077b) {
                c.mo12770c(str);
            }
            mjVar.f4082g = true;
            mjVar.f4079d = str;
            if (mjVar.f4076a <= 0) {
                this.f4021d.mo12841h(this.f4020c);
            } else if (!mjVar.f4078c) {
                this.f4021d.mo12842i(this.f4020c);
            } else if (!C1960d.m2757U1(mjVar.f4080e)) {
                C2362nj.m3825f(this.f4021d, this.f4020c);
            }
        }
    }

    /* renamed from: f */
    public final void mo12771f(Status status) {
        C1955a aVar = C2362nj.f4098d;
        String M = C0823f.m344M(status.f11283h);
        String str = status.f11284i;
        StringBuilder sb = new StringBuilder(String.valueOf(M).length() + 39 + String.valueOf(str).length());
        sb.append("SMS verification code request failed: ");
        sb.append(M);
        sb.append(" ");
        sb.append(str);
        aVar.mo12283b(sb.toString(), new Object[0]);
        C2338mj mjVar = this.f4021d.f4101c.get(this.f4020c);
        if (mjVar != null) {
            for (C2648zh f : mjVar.f4077b) {
                f.mo12771f(status);
            }
            this.f4021d.mo12840e(this.f4020c);
        }
    }
}
