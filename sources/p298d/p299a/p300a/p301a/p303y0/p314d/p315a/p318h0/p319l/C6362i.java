package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import p005b.p291q.p292a.C5266a;
import p298d.C6768j;
import p298d.p299a.C6736l;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6093c0;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6328g;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6433t;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6438y;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6552l;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6558m;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6562q;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.p325w.C6569a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7437i;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p344x.p346c.C6896q;
import p298d.p344x.p346c.C6902w;

/* renamed from: d.a.a.a.y0.d.a.h0.l.i */
public final class C6362i extends C6093c0 {

    /* renamed from: m */
    public static final /* synthetic */ C6736l<Object>[] f12538m;

    /* renamed from: g */
    public final C6433t f12539g;

    /* renamed from: h */
    public final C6328g f12540h;

    /* renamed from: i */
    public final C7437i f12541i;

    /* renamed from: j */
    public final C6339c f12542j;

    /* renamed from: k */
    public final C7437i<List<C6714b>> f12543k;

    /* renamed from: l */
    public final C6060h f12544l;

    /* renamed from: d.a.a.a.y0.d.a.h0.l.i$a */
    public static final class C6363a extends C6890k implements C6851a<Map<String, ? extends C6552l>> {

        /* renamed from: g */
        public final /* synthetic */ C6362i f12545g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6363a(C6362i iVar) {
            super(0);
            this.f12545g = iVar;
        }

        public Object invoke() {
            C6768j jVar;
            C6362i iVar = this.f12545g;
            C6562q qVar = iVar.f12540h.f12460a.f12439l;
            String b = iVar.getFqName().mo23862b();
            C6888i.m12437d(b, "fqName.asString()");
            List<String> a = qVar.mo23662a(b);
            C6362i iVar2 = this.f12545g;
            ArrayList arrayList = new ArrayList();
            for (String str : a) {
                C6713a l = C6713a.m12239l(JvmClassName.byInternalName(str).getFqNameForTopLevelClassMaybeWithDollars());
                C6888i.m12437d(l, "topLevel(JvmClassName.byInternalName(partName).fqNameForTopLevelClassMaybeWithDollars)");
                C6552l P0 = C5266a.m9861P0(iVar2.f12540h.f12460a.f12430c, l);
                if (P0 == null) {
                    jVar = null;
                } else {
                    jVar = new C6768j(str, P0);
                }
                if (jVar != null) {
                    arrayList.add(jVar);
                }
            }
            return C6790h.m12338Y(arrayList);
        }
    }

    /* renamed from: d.a.a.a.y0.d.a.h0.l.i$b */
    public static final class C6364b extends C6890k implements C6851a<HashMap<JvmClassName, JvmClassName>> {

        /* renamed from: g */
        public final /* synthetic */ C6362i f12546g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6364b(C6362i iVar) {
            super(0);
            this.f12546g = iVar;
        }

        public Object invoke() {
            String a;
            HashMap hashMap = new HashMap();
            for (Map.Entry next : this.f12546g.mo23517x().entrySet()) {
                JvmClassName byInternalName = JvmClassName.byInternalName((String) next.getKey());
                C6888i.m12437d(byInternalName, "byInternalName(partInternalName)");
                C6569a a2 = ((C6552l) next.getValue()).mo23322a();
                int ordinal = a2.f12871a.ordinal();
                if (ordinal == 2) {
                    hashMap.put(byInternalName, byInternalName);
                } else if (ordinal == 5 && (a = a2.mo23679a()) != null) {
                    JvmClassName byInternalName2 = JvmClassName.byInternalName(a);
                    C6888i.m12437d(byInternalName2, "byInternalName(header.multifileClassName ?: continue@kotlinClasses)");
                    hashMap.put(byInternalName, byInternalName2);
                }
            }
            return hashMap;
        }
    }

    /* renamed from: d.a.a.a.y0.d.a.h0.l.i$c */
    public static final class C6365c extends C6890k implements C6851a<List<? extends C6714b>> {

        /* renamed from: g */
        public final /* synthetic */ C6362i f12547g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6365c(C6362i iVar) {
            super(0);
            this.f12547g = iVar;
        }

        public Object invoke() {
            Collection<C6433t> m = this.f12547g.f12539g.mo23345m();
            ArrayList arrayList = new ArrayList(C5266a.m9892V(m, 10));
            for (C6433t fqName : m) {
                arrayList.add(fqName.getFqName());
            }
            return arrayList;
        }
    }

    static {
        Class<C6362i> cls = C6362i.class;
        f12538m = new C6736l[]{C6902w.m12462c(new C6896q(C6902w.m12460a(cls), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), C6902w.m12462c(new C6896q(C6902w.m12460a(cls), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6362i(C6328g gVar, C6433t tVar) {
        super(gVar.f12460a.f12442o, tVar.getFqName());
        C6060h hVar;
        C6888i.m12438e(gVar, "outerContext");
        C6888i.m12438e(tVar, "jPackage");
        this.f12539g = tVar;
        C6328g Q = C5266a.m9866Q(gVar, this, (C6438y) null, 0, 6);
        this.f12540h = Q;
        this.f12541i = Q.f12460a.f12428a.mo25018a(new C6363a(this));
        this.f12542j = new C6339c(Q, tVar, this);
        this.f12543k = Q.f12460a.f12428a.mo25024g(new C6365c(this), C6798p.f13713g);
        if (Q.f12460a.f12449v.f15129h) {
            Objects.requireNonNull(C6060h.f11920d);
            hVar = C6060h.C6061a.f11922b;
        } else {
            hVar = C5266a.m9810G3(Q, tVar);
        }
        this.f12544l = hVar;
        Q.f12460a.f12428a.mo25018a(new C6364b(this));
    }

    public C6060h getAnnotations() {
        return this.f12544l;
    }

    public C7277h getMemberScope() {
        return this.f12542j;
    }

    public C6234r0 getSource() {
        return new C6558m(this);
    }

    public String toString() {
        return C6888i.m12444k("Lazy Java package fragment: ", getFqName());
    }

    /* renamed from: x */
    public final Map<String, C6552l> mo23517x() {
        return (Map) C5266a.m9884T1(this.f12541i, f12538m[0]);
    }
}
