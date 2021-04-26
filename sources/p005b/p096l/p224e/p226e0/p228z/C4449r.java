package p005b.p096l.p224e.p226e0.p228z;

import com.google.android.material.badge.BadgeDrawable;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p224e.C4332b0;
import p005b.p096l.p224e.C4334c0;
import p005b.p096l.p224e.C4465k;
import p005b.p096l.p224e.p230f0.C4455a;

/* renamed from: b.l.e.e0.z.r */
public class C4449r implements C4334c0 {

    /* renamed from: g */
    public final /* synthetic */ Class f8238g;

    /* renamed from: h */
    public final /* synthetic */ Class f8239h;

    /* renamed from: i */
    public final /* synthetic */ C4332b0 f8240i;

    public C4449r(Class cls, Class cls2, C4332b0 b0Var) {
        this.f8238g = cls;
        this.f8239h = cls2;
        this.f8240i = b0Var;
    }

    /* renamed from: a */
    public <T> C4332b0<T> mo10754a(C4465k kVar, C4455a<T> aVar) {
        Class<? super T> cls = aVar.f8249a;
        if (cls == this.f8238g || cls == this.f8239h) {
            return this.f8240i;
        }
        return null;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Factory[type=");
        u.append(this.f8239h.getName());
        u.append(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        u.append(this.f8238g.getName());
        u.append(",adapter=");
        u.append(this.f8240i);
        u.append("]");
        return u.toString();
    }
}
