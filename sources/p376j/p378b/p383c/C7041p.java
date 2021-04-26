package p376j.p378b.p383c;

import java.util.Arrays;
import p005b.p035e.p036a.p037a.C0843a;
import p376j.p378b.p383c.C7053w;

/* renamed from: j.b.c.p */
public final class C7041p {

    /* renamed from: d */
    public static final C7053w f14109d;

    /* renamed from: e */
    public static final C7041p f14110e;

    /* renamed from: a */
    public final C7048t f14111a;

    /* renamed from: b */
    public final C7042q f14112b;

    /* renamed from: c */
    public final C7049u f14113c;

    static {
        C7053w wVar = new C7053w.C7055b(C7053w.C7055b.f14153b, (C7053w.C7054a) null).f14154a;
        f14109d = wVar;
        f14110e = new C7041p(C7048t.f14147i, C7042q.f14114h, C7049u.f14150b, wVar);
    }

    public C7041p(C7048t tVar, C7042q qVar, C7049u uVar, C7053w wVar) {
        this.f14111a = tVar;
        this.f14112b = qVar;
        this.f14113c = uVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7041p)) {
            return false;
        }
        C7041p pVar = (C7041p) obj;
        return this.f14111a.equals(pVar.f14111a) && this.f14112b.equals(pVar.f14112b) && this.f14113c.equals(pVar.f14113c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14111a, this.f14112b, this.f14113c});
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("SpanContext{traceId=");
        u.append(this.f14111a);
        u.append(", spanId=");
        u.append(this.f14112b);
        u.append(", traceOptions=");
        u.append(this.f14113c);
        u.append("}");
        return u.toString();
    }
}
