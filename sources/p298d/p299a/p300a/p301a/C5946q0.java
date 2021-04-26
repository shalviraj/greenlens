package p298d.p299a.p300a.p301a;

import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import p298d.p299a.C6726e;
import p298d.p299a.C6728g;
import p298d.p299a.C6729h;
import p298d.p299a.C6732j;
import p298d.p299a.C6739m;
import p298d.p299a.p300a.C6722b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6643i;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6681t;
import p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.C6582a;
import p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6600a;
import p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6607f;
import p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6608g;
import p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6610h;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6707e;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7084b;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7091f;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7117p;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p413z0.C7651a;
import p298d.p299a.p300a.p301a.p413z0.C7653b;
import p298d.p299a.p300a.p301a.p413z0.C7656e;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6879b;
import p298d.p344x.p346c.C6885f;
import p298d.p344x.p346c.C6886g;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p344x.p346c.C6891l;
import p298d.p344x.p346c.C6895p;
import p298d.p344x.p346c.C6903x;

/* renamed from: d.a.a.a.q0 */
public class C5946q0 extends C6903x {
    /* renamed from: h */
    public static C5934n m10766h(C6879b bVar) {
        C6728g w = bVar.mo22957w();
        return w instanceof C5934n ? (C5934n) w : C5895d.f11685i;
    }

    /* renamed from: a */
    public C6729h mo23041a(C6886g gVar) {
        C5934n h = m10766h(gVar);
        String name = gVar.getName();
        String y = gVar.mo22958y();
        Object obj = gVar.f13782h;
        C6888i.m12438e(h, "container");
        C6888i.m12438e(name, "name");
        C6888i.m12438e(y, "signature");
        return new C5877b(h, name, y, (C6244v) null, obj);
    }

    /* renamed from: b */
    public C6726e mo23042b(Class cls) {
        Class<T> cls2;
        V v;
        C7653b<String, Object> bVar;
        C5858a aVar;
        String str;
        C7653b<String, Object> bVar2 = C5928k.f11740a;
        C6888i.m12438e(cls, "jClass");
        String name = cls.getName();
        C7653b<String, Object> bVar3 = C5928k.f11740a;
        Objects.requireNonNull(bVar3);
        C7651a aVar2 = (C7651a) bVar3.f15156a.f15165a.mo25241a((long) name.hashCode());
        if (aVar2 == null) {
            aVar2 = C7651a.f15150j;
        }
        while (true) {
            cls2 = null;
            if (aVar2 == null || aVar2.f15153i <= 0) {
                v = null;
            } else {
                C7656e eVar = (C7656e) aVar2.f15151g;
                if (eVar.f15166g.equals(name)) {
                    v = eVar.f15167h;
                    break;
                }
                aVar2 = aVar2.f15152h;
            }
        }
        v = null;
        if (v instanceof WeakReference) {
            C5858a aVar3 = (C5858a) ((WeakReference) v).get();
            if (aVar3 != null) {
                cls2 = aVar3.f11614j;
            }
            if (C6888i.m12434a(cls2, cls)) {
                return aVar3;
            }
        } else if (v != null) {
            for (WeakReference weakReference : (WeakReference[]) v) {
                C5858a aVar4 = (C5858a) weakReference.get();
                if (C6888i.m12434a(aVar4 != null ? aVar4.f11614j : null, cls)) {
                    return aVar4;
                }
            }
            int length = ((Object[]) v).length;
            WeakReference[] weakReferenceArr = new WeakReference[(length + 1)];
            System.arraycopy(v, 0, weakReferenceArr, 0, length);
            aVar = new C5858a(cls);
            weakReferenceArr[length] = new WeakReference(aVar);
            bVar = C5928k.f11740a.mo25240a(name, weakReferenceArr);
            str = "K_CLASS_CACHE.plus(name, newArray)";
            C6888i.m12437d(bVar, str);
            C5928k.f11740a = bVar;
            return aVar;
        }
        aVar = new C5858a(cls);
        bVar = C5928k.f11740a.mo25240a(name, new WeakReference(aVar));
        str = "K_CLASS_CACHE.plus(name, WeakReference(newKClass))";
        C6888i.m12437d(bVar, str);
        C5928k.f11740a = bVar;
        return aVar;
    }

    /* renamed from: c */
    public C6728g mo23043c(Class cls, String str) {
        return new C5961v(cls, str);
    }

    /* renamed from: d */
    public C6732j mo23044d(C6891l lVar) {
        return new C5953t(m10766h(lVar), lVar.f13784j, lVar.f13785k, lVar.f13782h);
    }

    /* renamed from: e */
    public C6739m mo23045e(C6895p pVar) {
        return new C5873a0(m10766h(pVar), pVar.getName(), pVar.mo22958y(), pVar.f13782h);
    }

    /* renamed from: f */
    public String mo23046f(C6885f fVar) {
        C5877b b;
        C6888i.m12438e(fVar, "$this$reflect");
        Metadata metadata = (Metadata) fVar.getClass().getAnnotation(Metadata.class);
        C5877b bVar = null;
        if (metadata != null) {
            String[] d1 = metadata.mo24461d1();
            boolean z = true;
            if (d1.length == 0) {
                d1 = null;
            }
            if (d1 != null) {
                String[] d2 = metadata.mo24462d2();
                C6610h hVar = C6610h.f13014a;
                C6888i.m12438e(d1, "data");
                C6888i.m12438e(d2, "strings");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C6600a.m11787b(d1));
                C7091f fVar2 = C6610h.f13015b;
                C6582a.C6593e eVar = (C6582a.C6593e) ((C7084b) C6582a.C6593e.f12958n).mo24598c(byteArrayInputStream, fVar2);
                C6888i.m12437d(eVar, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
                C6608g gVar = new C6608g(eVar, d2);
                C7084b bVar2 = (C7084b) C6643i.f13215y;
                C7117p d = bVar2.mo24599d(byteArrayInputStream, fVar2);
                bVar2.mo24597b(d);
                C6643i iVar = (C6643i) d;
                int[] mv = metadata.mo24464mv();
                if ((metadata.mo24466xi() & 8) == 0) {
                    z = false;
                }
                C6607f fVar3 = new C6607f(mv, z);
                Class<?> cls = fVar.getClass();
                C6681t tVar = iVar.f13227s;
                C6888i.m12437d(tVar, "proto.typeTable");
                C6232q0 q0Var = (C6232q0) C5970v0.m10811f(cls, iVar, gVar, new C6707e(tVar), fVar3, C6722b.f13634p);
                if (q0Var != null) {
                    bVar = new C5877b(C5895d.f11685i, q0Var);
                }
            }
        }
        if (bVar == null || (b = C5970v0.m10807b(bVar)) == null) {
            return super.mo23046f(fVar);
        }
        C5949r0 r0Var = C5949r0.f11765b;
        C6244v D = b.mo22976x();
        C6888i.m12438e(D, "invoke");
        StringBuilder sb = new StringBuilder();
        C5949r0.m10778b(sb, D);
        List<C6030b1> valueParameters = D.getValueParameters();
        C6888i.m12437d(valueParameters, "invoke.valueParameters");
        C6790h.m12367u(valueParameters, sb, ", ", "(", ")", 0, (CharSequence) null, C5952s0.f11768g, 48);
        sb.append(" -> ");
        C7452c0 returnType = D.getReturnType();
        C6888i.m12436c(returnType);
        C6888i.m12437d(returnType, "invoke.returnType!!");
        sb.append(C5949r0.m10781e(returnType));
        String sb2 = sb.toString();
        C6888i.m12437d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: g */
    public String mo23047g(C6890k kVar) {
        return mo23046f(kVar);
    }
}
