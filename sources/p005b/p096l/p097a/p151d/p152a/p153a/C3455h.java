package p005b.p096l.p097a.p151d.p152a.p153a;

import android.content.Context;
import java.util.Objects;
import p005b.p096l.p097a.p151d.p152a.p159e.C3585f0;
import p005b.p096l.p097a.p151d.p152a.p162h.C3633a;

/* renamed from: b.l.a.d.a.a.h */
public final class C3455h implements C3585f0<C3449b> {

    /* renamed from: a */
    public final C3585f0 f6249a;

    /* renamed from: b */
    public final /* synthetic */ int f6250b = 0;

    public C3455h(C3585f0<C3452e> f0Var) {
        this.f6249a = f0Var;
    }

    public C3455h(C3585f0<Context> f0Var, byte[] bArr) {
        this.f6249a = f0Var;
    }

    public C3455h(C3585f0<Context> f0Var, char[] cArr) {
        this.f6249a = f0Var;
    }

    public C3455h(C3585f0<Context> f0Var, short[] sArr) {
        this.f6249a = f0Var;
    }

    /* renamed from: a */
    public final Object mo14735a() {
        int i = this.f6250b;
        if (i == 0) {
            C3452e eVar = (C3452e) this.f6249a.mo14735a();
            Objects.requireNonNull(eVar, "Cannot return null from a non-@Nullable @Provides method");
            return eVar;
        } else if (i != 1) {
            return i != 2 ? new C3633a((Context) this.f6249a.mo14735a()) : new C3465r(((C3456i) this.f6249a).mo14735a());
        } else {
            return new C3451d(((C3456i) this.f6249a).mo14735a());
        }
    }
}
