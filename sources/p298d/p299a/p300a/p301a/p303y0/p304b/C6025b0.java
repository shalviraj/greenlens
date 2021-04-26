package p298d.p299a.p300a.p301a.p303y0.p304b;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6112j;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6121m0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6126o;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7417e;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7435g;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7543m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p333a0.C6757c;
import p298d.p333a0.C6758d;
import p298d.p333a0.C6759e;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p334t.C6800r;
import p298d.p334t.C6804v;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.b.b0 */
public final class C6025b0 {

    /* renamed from: a */
    public final C7441m f11863a;

    /* renamed from: b */
    public final C6021a0 f11864b;

    /* renamed from: c */
    public final C7435g<C6714b, C6032c0> f11865c;

    /* renamed from: d */
    public final C7435g<C6026a, C6046e> f11866d;

    /* renamed from: d.a.a.a.y0.b.b0$a */
    public static final class C6026a {

        /* renamed from: a */
        public final C6713a f11867a;

        /* renamed from: b */
        public final List<Integer> f11868b;

        public C6026a(C6713a aVar, List<Integer> list) {
            C6888i.m12438e(aVar, "classId");
            C6888i.m12438e(list, "typeParametersCount");
            this.f11867a = aVar;
            this.f11868b = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6026a)) {
                return false;
            }
            C6026a aVar = (C6026a) obj;
            return C6888i.m12434a(this.f11867a, aVar.f11867a) && C6888i.m12434a(this.f11868b, aVar.f11868b);
        }

        public int hashCode() {
            return this.f11868b.hashCode() + (this.f11867a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder u = C0843a.m460u("ClassRequest(classId=");
            u.append(this.f11867a);
            u.append(", typeParametersCount=");
            u.append(this.f11868b);
            u.append(')');
            return u.toString();
        }
    }

    /* renamed from: d.a.a.a.y0.b.b0$b */
    public static final class C6027b extends C6112j {

        /* renamed from: j */
        public final boolean f11869j;

        /* renamed from: k */
        public final List<C6248w0> f11870k;

        /* renamed from: l */
        public final C7543m f11871l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6027b(C7441m mVar, C6206k kVar, C6717d dVar, boolean z, int i) {
            super(mVar, kVar, dVar, C6234r0.f12257a, false);
            C6888i.m12438e(mVar, "storageManager");
            C6888i.m12438e(kVar, "container");
            C6888i.m12438e(dVar, "name");
            this.f11869j = z;
            C6758d d = C6759e.m12308d(0, i);
            ArrayList arrayList = new ArrayList(C5266a.m9892V(d, 10));
            Iterator it = d.iterator();
            while (((C6757c) it).f13662h) {
                int nextInt = ((C6804v) it).nextInt();
                Objects.requireNonNull(C6060h.f11920d);
                arrayList.add(C6121m0.m10978W(this, C6060h.C6061a.f11922b, false, C7484h1.INVARIANT, C6717d.m12270l(C6888i.m12444k(ExifInterface.GPS_DIRECTION_TRUE, Integer.valueOf(nextInt))), nextInt, mVar));
            }
            this.f11870k = arrayList;
            this.f11871l = new C7543m(this, C5266a.m9912Z(this), C5266a.m9891U3(C7255a.m13138k(this).getBuiltIns().getAnyType()), mVar);
        }

        public C6060h getAnnotations() {
            Objects.requireNonNull(C6060h.f11920d);
            return C6060h.C6061a.f11922b;
        }

        public C6046e getCompanionObjectDescriptor() {
            return null;
        }

        public Collection<C6034d> getConstructors() {
            return C6800r.f13715g;
        }

        public List<C6248w0> getDeclaredTypeParameters() {
            return this.f11870k;
        }

        public C6051f getKind() {
            return C6051f.CLASS;
        }

        public C6251y getModality() {
            return C6251y.FINAL;
        }

        public Collection<C6046e> getSealedSubclasses() {
            return C6798p.f13713g;
        }

        public C7277h getStaticScope() {
            return C7277h.C7280b.f14521b;
        }

        public C7567t0 getTypeConstructor() {
            return this.f11871l;
        }

        public C7277h getUnsubstitutedMemberScope(C7495e eVar) {
            C6888i.m12438e(eVar, "kotlinTypeRefiner");
            return C7277h.C7280b.f14521b;
        }

        public C6034d getUnsubstitutedPrimaryConstructor() {
            return null;
        }

        public C6233r getVisibility() {
            C6233r rVar = C6219q.f12245e;
            C6888i.m12437d(rVar, "PUBLIC");
            return rVar;
        }

        public boolean isActual() {
            return false;
        }

        public boolean isCompanionObject() {
            return false;
        }

        public boolean isData() {
            return false;
        }

        public boolean isExpect() {
            return false;
        }

        public boolean isExternal() {
            return false;
        }

        public boolean isFun() {
            return false;
        }

        public boolean isInline() {
            return false;
        }

        public boolean isInner() {
            return this.f11869j;
        }

        public boolean isValue() {
            return false;
        }

        public String toString() {
            StringBuilder u = C0843a.m460u("class ");
            u.append(getName());
            u.append(" (not found)");
            return u.toString();
        }
    }

    /* renamed from: d.a.a.a.y0.b.b0$c */
    public static final class C6028c extends C6890k implements C6862l<C6026a, C6046e> {

        /* renamed from: g */
        public final /* synthetic */ C6025b0 f11872g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6028c(C6025b0 b0Var) {
            super(1);
            this.f11872g = b0Var;
        }

        public Object invoke(Object obj) {
            C6026a aVar = (C6026a) obj;
            C6888i.m12438e(aVar, "$dstr$classId$typeParametersCount");
            C6713a aVar2 = aVar.f11867a;
            List<Integer> list = aVar.f11868b;
            if (!aVar2.f13612c) {
                C6713a g = aVar2.mo23855g();
                C6072g a = g == null ? null : this.f11872g.mo23099a(g, C6790h.m12357k(list, 1));
                if (a == null) {
                    C7435g<C6714b, C6032c0> gVar = this.f11872g.f11865c;
                    C6714b h = aVar2.mo23856h();
                    C6888i.m12437d(h, "classId.packageFqName");
                    a = (C6072g) ((C7417e.C7431m) gVar).invoke(h);
                }
                C6072g gVar2 = a;
                boolean k = aVar2.mo23860k();
                C7441m mVar = this.f11872g.f11863a;
                C6717d j = aVar2.mo23859j();
                C6888i.m12437d(j, "classId.shortClassName");
                Integer num = (Integer) C6790h.m12363q(list);
                return new C6027b(mVar, gVar2, j, k, num == null ? 0 : num.intValue());
            }
            throw new UnsupportedOperationException(C6888i.m12444k("Unresolved local class: ", aVar2));
        }
    }

    /* renamed from: d.a.a.a.y0.b.b0$d */
    public static final class C6029d extends C6890k implements C6862l<C6714b, C6032c0> {

        /* renamed from: g */
        public final /* synthetic */ C6025b0 f11873g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6029d(C6025b0 b0Var) {
            super(1);
            this.f11873g = b0Var;
        }

        public Object invoke(Object obj) {
            C6714b bVar = (C6714b) obj;
            C6888i.m12438e(bVar, "fqName");
            return new C6126o(this.f11873g.f11864b, bVar);
        }
    }

    public C6025b0(C7441m mVar, C6021a0 a0Var) {
        C6888i.m12438e(mVar, "storageManager");
        C6888i.m12438e(a0Var, "module");
        this.f11863a = mVar;
        this.f11864b = a0Var;
        this.f11865c = mVar.mo25025h(new C6029d(this));
        this.f11866d = mVar.mo25025h(new C6028c(this));
    }

    /* renamed from: a */
    public final C6046e mo23099a(C6713a aVar, List<Integer> list) {
        C6888i.m12438e(aVar, "classId");
        C6888i.m12438e(list, "typeParametersCount");
        return (C6046e) ((C7417e.C7431m) this.f11866d).invoke(new C6026a(aVar, list));
    }
}
