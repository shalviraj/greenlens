package p298d.p299a.p300a.p301a.p303y0.p314d.p315a;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p298d.p299a.C6728g;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6051f;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6055c;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7221b;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7227g;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7232k;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7436h;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7636i;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7638k;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6886g;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6902w;

/* renamed from: d.a.a.a.y0.d.a.c */
public final class C6268c {

    /* renamed from: a */
    public final C7636i f12334a;

    /* renamed from: b */
    public final C7436h<C6046e, C6055c> f12335b;

    /* renamed from: d.a.a.a.y0.d.a.c$a */
    public static final class C6269a {

        /* renamed from: a */
        public final C6055c f12336a;

        /* renamed from: b */
        public final int f12337b;

        public C6269a(C6055c cVar, int i) {
            C6888i.m12438e(cVar, "typeQualifier");
            this.f12336a = cVar;
            this.f12337b = i;
        }

        /* renamed from: a */
        public final List<C6264a> mo23450a() {
            C6264a[] values = C6264a.values();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 6; i++) {
                C6264a aVar = values[i];
                boolean z = true;
                if (!((this.f12337b & (1 << aVar.ordinal())) != 0)) {
                    if (!((this.f12337b & 8) != 0) || aVar == C6264a.TYPE_PARAMETER_BOUNDS) {
                        z = false;
                    }
                }
                if (z) {
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: d.a.a.a.y0.d.a.c$b */
    public /* synthetic */ class C6270b extends C6886g implements C6862l<C6046e, C6055c> {
        public C6270b(C6268c cVar) {
            super(1, cVar);
        }

        public final String getName() {
            return "computeTypeQualifierNickname";
        }

        public Object invoke(Object obj) {
            C6046e eVar = (C6046e) obj;
            C6888i.m12438e(eVar, "p0");
            C6268c cVar = (C6268c) this.f13782h;
            Objects.requireNonNull(cVar);
            if (!eVar.getAnnotations().mo23169v(C6266b.f12325a)) {
                return null;
            }
            for (C6055c d : eVar.getAnnotations()) {
                C6055c d2 = cVar.mo23449d(d);
                if (d2 != null) {
                    return d2;
                }
            }
            return null;
        }

        /* renamed from: w */
        public final C6728g mo22957w() {
            return C6902w.m12460a(C6268c.class);
        }

        /* renamed from: y */
        public final String mo22958y() {
            return "computeTypeQualifierNickname(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)Lorg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor;";
        }
    }

    public C6268c(C7441m mVar, C7636i iVar) {
        C6888i.m12438e(mVar, "storageManager");
        C6888i.m12438e(iVar, "javaTypeEnhancementState");
        this.f12334a = iVar;
        this.f12335b = mVar.mo25026i(new C6270b(this));
    }

    /* renamed from: a */
    public final List<C6264a> mo23446a(C7227g<?> gVar, C6866p<? super C7232k, ? super C6264a, Boolean> pVar) {
        C6264a aVar;
        if (gVar instanceof C7221b) {
            ArrayList arrayList = new ArrayList();
            for (C7227g a : (Iterable) ((C7221b) gVar).f14459a) {
                C6790h.m12342b(arrayList, mo23446a(a, pVar));
            }
            return arrayList;
        } else if (!(gVar instanceof C7232k)) {
            return C6798p.f13713g;
        } else {
            C6264a[] values = C6264a.values();
            int i = 0;
            while (true) {
                if (i >= 6) {
                    aVar = null;
                    break;
                }
                aVar = values[i];
                if (pVar.invoke(gVar, aVar).booleanValue()) {
                    break;
                }
                i++;
            }
            return C6790h.m12315B(aVar);
        }
    }

    /* renamed from: b */
    public final C7638k mo23447b(C6055c cVar) {
        C6888i.m12438e(cVar, "annotationDescriptor");
        C7638k c = mo23448c(cVar);
        return c == null ? this.f12334a.f15122a : c;
    }

    /* renamed from: c */
    public final C7638k mo23448c(C6055c cVar) {
        C6888i.m12438e(cVar, "annotationDescriptor");
        Map<String, C7638k> map = this.f12334a.f15124c;
        C6714b fqName = cVar.getFqName();
        C7638k kVar = map.get(fqName == null ? null : fqName.mo23862b());
        if (kVar != null) {
            return kVar;
        }
        C6046e e = C7255a.m13132e(cVar);
        if (e == null) {
            return null;
        }
        C6055c j = e.getAnnotations().mo23168j(C6266b.f12328d);
        C7227g<?> b = j == null ? null : C7255a.m13129b(j);
        C7232k kVar2 = b instanceof C7232k ? (C7232k) b : null;
        if (kVar2 == null) {
            return null;
        }
        C7638k kVar3 = this.f12334a.f15123b;
        if (kVar3 != null) {
            return kVar3;
        }
        String e2 = kVar2.f14463c.mo23886e();
        int hashCode = e2.hashCode();
        if (hashCode != -2137067054) {
            if (hashCode != -1838656823) {
                if (hashCode == 2656902 && e2.equals("WARN")) {
                    return C7638k.WARN;
                }
                return null;
            } else if (!e2.equals("STRICT")) {
                return null;
            } else {
                return C7638k.STRICT;
            }
        } else if (!e2.equals("IGNORE")) {
            return null;
        } else {
            return C7638k.IGNORE;
        }
    }

    /* renamed from: d */
    public final C6055c mo23449d(C6055c cVar) {
        C6046e e;
        C6888i.m12438e(cVar, "annotationDescriptor");
        if (this.f12334a.f15128g || (e = C7255a.m13132e(cVar)) == null) {
            return null;
        }
        if (C6266b.f12332h.contains(C7255a.m13135h(e)) || e.getAnnotations().mo23169v(C6266b.f12326b)) {
            return cVar;
        }
        if (e.getKind() != C6051f.ANNOTATION_CLASS) {
            return null;
        }
        return this.f12335b.invoke(e);
    }
}
