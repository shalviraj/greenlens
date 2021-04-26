package p005b.p096l.p224e.p226e0.p228z;

import java.lang.reflect.Field;
import p005b.p096l.p224e.C4332b0;
import p005b.p096l.p224e.C4465k;
import p005b.p096l.p224e.p226e0.p228z.C4402j;
import p005b.p096l.p224e.p230f0.C4455a;
import p005b.p096l.p224e.p231g0.C4457a;
import p005b.p096l.p224e.p231g0.C4460c;

/* renamed from: b.l.e.e0.z.i */
public class C4401i extends C4402j.C4404b {

    /* renamed from: d */
    public final /* synthetic */ Field f8143d;

    /* renamed from: e */
    public final /* synthetic */ boolean f8144e;

    /* renamed from: f */
    public final /* synthetic */ C4332b0 f8145f;

    /* renamed from: g */
    public final /* synthetic */ C4465k f8146g;

    /* renamed from: h */
    public final /* synthetic */ C4455a f8147h;

    /* renamed from: i */
    public final /* synthetic */ boolean f8148i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4401i(C4402j jVar, String str, boolean z, boolean z2, Field field, boolean z3, C4332b0 b0Var, C4465k kVar, C4455a aVar, boolean z4) {
        super(str, z, z2);
        this.f8143d = field;
        this.f8144e = z3;
        this.f8145f = b0Var;
        this.f8146g = kVar;
        this.f8147h = aVar;
        this.f8148i = z4;
    }

    /* renamed from: a */
    public void mo16081a(C4457a aVar, Object obj) {
        Object a = this.f8145f.mo10755a(aVar);
        if (a != null || !this.f8148i) {
            this.f8143d.set(obj, a);
        }
    }

    /* renamed from: b */
    public void mo16082b(C4460c cVar, Object obj) {
        C4332b0 b0Var;
        Object obj2 = this.f8143d.get(obj);
        if (this.f8144e) {
            b0Var = this.f8145f;
        } else {
            b0Var = new C4413n(this.f8146g, this.f8145f, this.f8147h.f8250b);
        }
        b0Var.mo10756b(cVar, obj2);
    }

    /* renamed from: c */
    public boolean mo16083c(Object obj) {
        return this.f8157b && this.f8143d.get(obj) != obj;
    }
}
