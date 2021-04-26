package p005b.p096l.p164b.p165a.p171c;

import java.io.Reader;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p164b.p165a.p171c.p172j.C3710c;
import p005b.p096l.p164b.p165a.p173d.C3742t;

/* renamed from: b.l.b.a.c.e */
public class C3702e implements C3742t {

    /* renamed from: a */
    public final C3700c f6829a;

    /* renamed from: b */
    public final Set<String> f6830b;

    public C3702e(C3700c cVar) {
        HashSet hashSet = new HashSet();
        Objects.requireNonNull(cVar);
        this.f6829a = cVar;
        this.f6830b = new HashSet(hashSet);
    }

    /* renamed from: a */
    public final void mo15030a(C3703f fVar) {
        String str;
        if (!this.f6830b.isEmpty()) {
            try {
                Set<String> set = this.f6830b;
                C3707i f0 = fVar.mo15038f0();
                while (true) {
                    if (f0 != C3707i.FIELD_NAME) {
                        str = null;
                        break;
                    }
                    str = fVar.mo15039q();
                    fVar.mo15040z();
                    if (set.contains(str)) {
                        break;
                    }
                    ((C3710c) fVar).f6848i.mo11498n0();
                    f0 = fVar.mo15040z();
                }
                C1960d.m2845s((str == null || fVar.mo15037e() == C3707i.END_OBJECT) ? false : true, "wrapper key(s) not found: %s", this.f6830b);
            } catch (Throwable th) {
                ((C3710c) fVar).f6848i.close();
                throw th;
            }
        }
    }

    /* renamed from: b */
    public <T> T mo15031b(Reader reader, Class<T> cls) {
        C3703f c = this.f6829a.mo15026c(reader);
        mo15030a(c);
        return c.mo15032H(cls, true, (C3698a) null);
    }
}
