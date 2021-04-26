package p298d.p299a.p300a.p301a.p303y0.p411m;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7493d;
import p298d.p299a.p300a.p301a.p303y0.p411m.C7599i;
import p298d.p299a.p300a.p301a.p303y0.p411m.C7610n;
import p298d.p299a.p300a.p301a.p303y0.p411m.C7617o;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p415c0.C7690d;

/* renamed from: d.a.a.a.y0.m.l */
public final class C7605l extends C7588a {

    /* renamed from: a */
    public static final C7605l f15056a = new C7605l();

    /* renamed from: b */
    public static final List<C7597g> f15057b;

    /* renamed from: d.a.a.a.y0.m.l$a */
    public static final class C7606a extends C6890k implements C6862l<C6244v, String> {

        /* renamed from: g */
        public static final C7606a f15058g = new C7606a();

        public C7606a() {
            super(1);
        }

        public Object invoke(Object obj) {
            Boolean bool;
            C6244v vVar = (C6244v) obj;
            C6888i.m12438e(vVar, "<this>");
            List<C6030b1> valueParameters = vVar.getValueParameters();
            C6888i.m12437d(valueParameters, "valueParameters");
            C6030b1 b1Var = (C6030b1) C6790h.m12372z(valueParameters);
            if (b1Var == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(!C7255a.m13128a(b1Var) && b1Var.mo23130p() == null);
            }
            boolean a = C6888i.m12434a(bool, Boolean.TRUE);
            C7605l lVar = C7605l.f15056a;
            if (!a) {
                return "last parameter should not have a default value or be a vararg";
            }
            return null;
        }
    }

    /* renamed from: d.a.a.a.y0.m.l$b */
    public static final class C7607b extends C6890k implements C6862l<C6244v, String> {

        /* renamed from: g */
        public static final C7607b f15059g = new C7607b();

        public C7607b() {
            super(1);
        }

        public Object invoke(Object obj) {
            boolean z;
            boolean z2;
            C6244v vVar = (C6244v) obj;
            C6888i.m12438e(vVar, "<this>");
            C7605l lVar = C7605l.f15056a;
            C6206k containingDeclaration = vVar.getContainingDeclaration();
            C6888i.m12437d(containingDeclaration, "containingDeclaration");
            boolean z3 = true;
            if (!((containingDeclaration instanceof C6046e) && KotlinBuiltIns.isAny((C6046e) containingDeclaration))) {
                Collection<? extends C6244v> overriddenDescriptors = vVar.getOverriddenDescriptors();
                C6888i.m12437d(overriddenDescriptors, "overriddenDescriptors");
                if (!overriddenDescriptors.isEmpty()) {
                    Iterator<T> it = overriddenDescriptors.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C6206k containingDeclaration2 = ((C6244v) it.next()).getContainingDeclaration();
                        C6888i.m12437d(containingDeclaration2, "it.containingDeclaration");
                        if (!(containingDeclaration2 instanceof C6046e) || !KotlinBuiltIns.isAny((C6046e) containingDeclaration2)) {
                            z2 = false;
                            continue;
                        } else {
                            z2 = true;
                            continue;
                        }
                        if (z2) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z) {
                    z3 = false;
                }
            }
            if (!z3) {
                return "must override ''equals()'' in Any";
            }
            return null;
        }
    }

    /* renamed from: d.a.a.a.y0.m.l$c */
    public static final class C7608c extends C6890k implements C6862l<C6244v, String> {

        /* renamed from: g */
        public static final C7608c f15060g = new C7608c();

        public C7608c() {
            super(1);
        }

        public Object invoke(Object obj) {
            boolean z;
            C6244v vVar = (C6244v) obj;
            C6888i.m12438e(vVar, "<this>");
            C6213n0 dispatchReceiverParameter = vVar.getDispatchReceiverParameter();
            if (dispatchReceiverParameter == null) {
                dispatchReceiverParameter = vVar.getExtensionReceiverParameter();
            }
            C7605l lVar = C7605l.f15056a;
            boolean z2 = false;
            if (dispatchReceiverParameter != null) {
                C7452c0 returnType = vVar.getReturnType();
                if (returnType == null) {
                    z = false;
                } else {
                    C7452c0 a = dispatchReceiverParameter.mo23093a();
                    C6888i.m12437d(a, "receiver.type");
                    C6888i.m12438e(returnType, "<this>");
                    C6888i.m12438e(a, "superType");
                    z = C7493d.f14926a.mo25128d(returnType, a);
                }
                if (z) {
                    z2 = true;
                }
            }
            if (!z2) {
                return "receiver must be a supertype of the return type";
            }
            return null;
        }
    }

    static {
        C6717d dVar = C7609m.f15077i;
        C7599i.C7601b bVar = C7599i.C7601b.f15053b;
        C7589b[] bVarArr = {bVar, new C7617o.C7618a(1)};
        C6717d dVar2 = C7609m.f15078j;
        C7589b[] bVarArr2 = {bVar, new C7617o.C7618a(2)};
        C6717d dVar3 = C7609m.f15069a;
        C7604k kVar = C7604k.f15055a;
        C7598h hVar = C7598h.f15050a;
        C7589b[] bVarArr3 = {bVar, kVar, new C7617o.C7618a(2), hVar};
        C6717d dVar4 = C7609m.f15070b;
        C7589b[] bVarArr4 = {bVar, kVar, new C7617o.C7618a(3), hVar};
        C6717d dVar5 = C7609m.f15071c;
        C7589b[] bVarArr5 = {bVar, kVar, new C7617o.C7619b(2), hVar};
        C6717d dVar6 = C7609m.f15075g;
        C7589b[] bVarArr6 = {bVar};
        C6717d dVar7 = C7609m.f15074f;
        C7617o.C7621d dVar8 = C7617o.C7621d.f15108b;
        C7610n.C7611a aVar = C7610n.C7611a.f15098d;
        C7589b[] bVarArr7 = {bVar, dVar8, kVar, aVar};
        C6717d dVar9 = C7609m.f15076h;
        C7617o.C7620c cVar = C7617o.C7620c.f15107b;
        C7589b[] bVarArr8 = {bVar, cVar};
        C6717d dVar10 = C7609m.f15079k;
        C7589b[] bVarArr9 = {bVar, cVar};
        C6717d dVar11 = C7609m.f15080l;
        C7589b[] bVarArr10 = {bVar, cVar, aVar};
        C6717d dVar12 = C7609m.f15093y;
        C7589b[] bVarArr11 = {bVar, dVar8, kVar};
        C6717d dVar13 = C7609m.f15072d;
        C7589b[] bVarArr12 = {C7599i.C7600a.f15052b};
        C6717d dVar14 = C7609m.f15073e;
        C7589b[] bVarArr13 = {bVar, C7610n.C7613b.f15100d, dVar8, kVar};
        Set<C6717d> set = C7609m.f15067G;
        C7589b[] bVarArr14 = {bVar, dVar8, kVar};
        Set<C6717d> set2 = C7609m.f15066F;
        C7589b[] bVarArr15 = {bVar, cVar};
        List A = C6790h.m12314A(C7609m.f15082n, C7609m.f15083o);
        C7589b[] bVarArr16 = {bVar};
        Set<C6717d> set3 = C7609m.f15068H;
        C7589b[] bVarArr17 = {bVar, C7610n.C7615c.f15102d, dVar8, kVar};
        C7690d dVar15 = C7609m.f15081m;
        C7589b[] bVarArr18 = {bVar, cVar};
        C7595e eVar = C7595e.f15043g;
        C6888i.m12438e(dVar15, "regex");
        C6888i.m12438e(bVarArr18, "checks");
        C6888i.m12438e(eVar, "additionalChecks");
        C7589b[] bVarArr19 = new C7589b[2];
        System.arraycopy(bVarArr18, 0, bVarArr19, 0, 2);
        f15057b = C6790h.m12314A(new C7597g(dVar, bVarArr, (C6862l) null, 4), new C7597g(dVar2, bVarArr2, (C6862l<? super C6244v, String>) C7606a.f15058g), new C7597g(dVar3, bVarArr3, (C6862l) null, 4), new C7597g(dVar4, bVarArr4, (C6862l) null, 4), new C7597g(dVar5, bVarArr5, (C6862l) null, 4), new C7597g(dVar6, bVarArr6, (C6862l) null, 4), new C7597g(dVar7, bVarArr7, (C6862l) null, 4), new C7597g(dVar9, bVarArr8, (C6862l) null, 4), new C7597g(dVar10, bVarArr9, (C6862l) null, 4), new C7597g(dVar11, bVarArr10, (C6862l) null, 4), new C7597g(dVar12, bVarArr11, (C6862l) null, 4), new C7597g(dVar13, bVarArr12, (C6862l<? super C6244v, String>) C7607b.f15059g), new C7597g(dVar14, bVarArr13, (C6862l) null, 4), new C7597g((Collection) set, bVarArr14, (C6862l) null, 4), new C7597g((Collection) set2, bVarArr15, (C6862l) null, 4), new C7597g((Collection<C6717d>) A, bVarArr16, (C6862l<? super C6244v, String>) C7608c.f15060g), new C7597g((Collection) set3, bVarArr17, (C6862l) null, 4), new C7597g((C6717d) null, dVar15, (Collection<C6717d>) null, eVar, bVarArr19));
    }

    /* renamed from: a */
    public List<C7597g> mo25200a() {
        return f15057b;
    }
}
