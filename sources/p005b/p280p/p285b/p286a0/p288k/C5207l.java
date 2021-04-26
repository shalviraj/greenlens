package p005b.p280p.p285b.p286a0.p288k;

import java.net.ProtocolException;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p285b.p286a0.C5134i;
import p435n.C8034b0;
import p435n.C8040e;
import p435n.C8064y;

/* renamed from: b.p.b.a0.k.l */
public final class C5207l implements C8064y {

    /* renamed from: g */
    public boolean f10211g;

    /* renamed from: h */
    public final int f10212h;

    /* renamed from: i */
    public final C8040e f10213i;

    public C5207l() {
        this.f10213i = new C8040e();
        this.f10212h = -1;
    }

    public C5207l(int i) {
        this.f10213i = new C8040e();
        this.f10212h = i;
    }

    public void close() {
        if (!this.f10211g) {
            this.f10211g = true;
            if (this.f10213i.f16140h < ((long) this.f10212h)) {
                StringBuilder u = C0843a.m460u("content-length promised ");
                u.append(this.f10212h);
                u.append(" bytes, but received ");
                u.append(this.f10213i.f16140h);
                throw new ProtocolException(u.toString());
            }
        }
    }

    /* renamed from: f */
    public C8034b0 mo17028f() {
        return C8034b0.f16129d;
    }

    public void flush() {
    }

    /* renamed from: j */
    public void mo17030j(C8040e eVar, long j) {
        if (!this.f10211g) {
            C5134i.m9456a(eVar.f16140h, 0, j);
            int i = this.f10212h;
            if (i == -1 || this.f10213i.f16140h <= ((long) i) - j) {
                this.f10213i.mo17030j(eVar, j);
                return;
            }
            throw new ProtocolException(C0843a.m453n(C0843a.m460u("exceeded content-length limit of "), this.f10212h, " bytes"));
        }
        throw new IllegalStateException("closed");
    }
}
