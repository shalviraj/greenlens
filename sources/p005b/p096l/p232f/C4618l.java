package p005b.p096l.p232f;

import java.util.Map;
import p005b.p096l.p232f.p237c0.C4495b;
import p005b.p096l.p232f.p237c0.C4496b0;
import p005b.p096l.p232f.p237c0.C4526d;
import p005b.p096l.p232f.p237c0.C4529f;
import p005b.p096l.p232f.p237c0.C4531h;
import p005b.p096l.p232f.p237c0.C4533j;
import p005b.p096l.p232f.p237c0.C4535l;
import p005b.p096l.p232f.p237c0.C4538o;
import p005b.p096l.p232f.p237c0.C4544u;
import p005b.p096l.p232f.p241d0.C4554d;
import p005b.p096l.p232f.p246e0.C4579b;
import p005b.p096l.p232f.p250w.C4631c;
import p005b.p096l.p232f.p258y.C4658b;
import p005b.p096l.p232f.p261z.C4674b;

/* renamed from: b.l.f.l */
public final class C4618l implements C4627u {
    /* renamed from: a */
    public C4658b mo16167a(String str, C4484a aVar, int i, int i2, Map<C4613g, ?> map) {
        C4627u uVar;
        switch (aVar.ordinal()) {
            case 0:
                uVar = new C4631c();
                break;
            case 1:
                uVar = new C4495b();
                break;
            case 2:
                uVar = new C4529f();
                break;
            case 3:
                uVar = new C4531h();
                break;
            case 4:
                uVar = new C4526d();
                break;
            case 5:
                uVar = new C4674b();
                break;
            case 6:
                uVar = new C4535l();
                break;
            case 7:
                uVar = new C4533j();
                break;
            case 8:
                uVar = new C4538o();
                break;
            case 10:
                uVar = new C4554d();
                break;
            case 11:
                uVar = new C4579b();
                break;
            case 14:
                uVar = new C4544u();
                break;
            case 15:
                uVar = new C4496b0();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(aVar)));
        }
        return uVar.mo16167a(str, aVar, i, i2, map);
    }
}
