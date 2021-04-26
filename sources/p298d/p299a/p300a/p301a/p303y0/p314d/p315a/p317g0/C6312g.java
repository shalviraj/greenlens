package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0;

import java.util.List;
import java.util.Objects;
import p005b.p291q.p292a.C5266a;
import p298d.C6768j;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6019a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6211m0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6233r;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6251y;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6097e0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6102f0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6107g0;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7227g;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7438j;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;

/* renamed from: d.a.a.a.y0.d.a.g0.g */
public class C6312g extends C6097e0 implements C6305b {

    /* renamed from: C */
    public final boolean f12417C;

    /* renamed from: D */
    public final C6768j<C6019a.C6020a<?>, ?> f12418D;

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 21 ? 3 : 2)];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw (i != 21 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6312g(C6206k kVar, C6060h hVar, C6251y yVar, C6233r rVar, boolean z, C6717d dVar, C6234r0 r0Var, C6207k0 k0Var, C6023b.C6024a aVar, boolean z2, C6768j<C6019a.C6020a<?>, ?> jVar) {
        super(kVar, k0Var, hVar, yVar, rVar, z, dVar, aVar, r0Var, false, false, false, false, false, false);
        if (kVar == null) {
            $$$reportNull$$$0(0);
            throw null;
        } else if (hVar == null) {
            $$$reportNull$$$0(1);
            throw null;
        } else if (yVar == null) {
            $$$reportNull$$$0(2);
            throw null;
        } else if (rVar == null) {
            $$$reportNull$$$0(3);
            throw null;
        } else if (dVar == null) {
            $$$reportNull$$$0(4);
            throw null;
        } else if (r0Var == null) {
            $$$reportNull$$$0(5);
            throw null;
        } else if (aVar != null) {
            this.f12417C = z2;
            this.f12418D = jVar;
        } else {
            $$$reportNull$$$0(6);
            throw null;
        }
    }

    /* renamed from: W */
    public static C6312g m11299W(C6206k kVar, C6060h hVar, C6251y yVar, C6233r rVar, boolean z, C6717d dVar, C6234r0 r0Var, boolean z2) {
        if (kVar == null) {
            $$$reportNull$$$0(7);
            throw null;
        } else if (yVar == null) {
            $$$reportNull$$$0(9);
            throw null;
        } else if (dVar == null) {
            $$$reportNull$$$0(11);
            throw null;
        } else if (r0Var != null) {
            return new C6312g(kVar, hVar, yVar, rVar, z, dVar, r0Var, (C6207k0) null, C6023b.C6024a.DECLARATION, z2, (C6768j<C6019a.C6020a<?>, ?>) null);
        } else {
            $$$reportNull$$$0(12);
            throw null;
        }
    }

    /* renamed from: D */
    public C6097e0 mo23212D(C6206k kVar, C6251y yVar, C6233r rVar, C6207k0 k0Var, C6023b.C6024a aVar, C6717d dVar, C6234r0 r0Var) {
        if (kVar == null) {
            $$$reportNull$$$0(13);
            throw null;
        } else if (yVar == null) {
            $$$reportNull$$$0(14);
            throw null;
        } else if (rVar == null) {
            $$$reportNull$$$0(15);
            throw null;
        } else if (aVar == null) {
            $$$reportNull$$$0(16);
            throw null;
        } else if (dVar != null) {
            return new C6312g(kVar, getAnnotations(), yVar, rVar, this.f12118h, dVar, r0Var, k0Var, aVar, this.f12417C, this.f12418D);
        } else {
            $$$reportNull$$$0(17);
            throw null;
        }
    }

    public boolean hasSynthesizedParameterNames() {
        return false;
    }

    /* renamed from: i */
    public C6305b mo23461i(C7452c0 c0Var, List<C6316k> list, C7452c0 c0Var2, C6768j<C6019a.C6020a<?>, ?> jVar) {
        C6102f0 f0Var;
        C6107g0 g0Var;
        C6213n0 n0Var;
        C7452c0 c0Var3 = c0Var;
        C7452c0 c0Var4 = c0Var2;
        if (c0Var4 != null) {
            C6207k0 original = mo23220x() == this ? null : mo23220x();
            C6312g gVar = r5;
            C6312g gVar2 = new C6312g(getContainingDeclaration(), getAnnotations(), getModality(), getVisibility(), this.f12118h, getName(), getSource(), original, getKind(), this.f12417C, jVar);
            C6102f0 f0Var2 = this.f12034x;
            if (f0Var2 != null) {
                f0Var = r5;
                C6102f0 f0Var3 = new C6102f0(gVar, f0Var2.getAnnotations(), f0Var2.getModality(), f0Var2.getVisibility(), f0Var2.f12009g, f0Var2.f12010h, f0Var2.f12013k, getKind(), original == null ? null : original.mo23216b(), f0Var2.getSource());
                f0Var.f12016n = f0Var2.f12016n;
                f0Var.f12053o = c0Var4;
            } else {
                f0Var = null;
            }
            C6211m0 m0Var = this.f12035y;
            if (m0Var != null) {
                C6107g0 g0Var2 = r5;
                C6107g0 g0Var3 = new C6107g0(gVar, m0Var.getAnnotations(), m0Var.getModality(), m0Var.getVisibility(), m0Var.mo23201K(), m0Var.isExternal(), m0Var.isInline(), getKind(), original == null ? null : original.mo23217c(), m0Var.getSource());
                g0Var2.f12016n = g0Var2.f12016n;
                g0Var2.mo23243U(m0Var.getValueParameters().get(0));
                g0Var = g0Var2;
            } else {
                g0Var = null;
            }
            C6312g gVar3 = gVar;
            gVar3.mo23214U(f0Var, g0Var, this.f12018A, this.f12019B);
            gVar3.f12036z = this.f12036z;
            C7438j<C7227g<?>> jVar2 = this.f12119i;
            if (jVar2 != null) {
                gVar3.mo23275z(jVar2);
            }
            gVar3.setOverriddenDescriptors(getOverriddenDescriptors());
            C7452c0 c0Var5 = c0Var;
            if (c0Var5 == null) {
                n0Var = null;
            } else {
                Objects.requireNonNull(C6060h.f11920d);
                n0Var = C5266a.m10032t0(this, c0Var5, C6060h.C6061a.f11922b);
            }
            gVar3.mo23215V(c0Var2, getTypeParameters(), this.f12031u, n0Var);
            return gVar3;
        }
        $$$reportNull$$$0(20);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r5 == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        r5 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6500v.f12744a;
        p298d.p344x.p346c.C6888i.m12438e(r0, "<this>");
        r5 = p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7508n.f14951a;
        p298d.p344x.p346c.C6888i.m12438e(r5, "<this>");
        p298d.p344x.p346c.C6888i.m12438e(r0, "type");
        r1 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6523z.f12783o;
        p298d.p344x.p346c.C6888i.m12437d(r1, "ENHANCED_NULLABILITY_ANNOTATION");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        if (r5.mo25149z(r0, r1) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isString(r0) == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.isUnsignedType(r0) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (p298d.p299a.p300a.p301a.p303y0.p405l.C7460d1.m13441g(r0) != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isString(r0) == false) goto L_0x002f;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo23146n() {
        /*
            r6 = this;
            d.a.a.a.y0.l.c0 r0 = r6.mo23093a()
            boolean r1 = r6.f12417C
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0055
            java.lang.String r1 = "type"
            p298d.p344x.p346c.C6888i.m12438e(r0, r1)
            java.lang.String r4 = "<this>"
            p298d.p344x.p346c.C6888i.m12438e(r0, r4)
            boolean r5 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isPrimitiveType(r0)
            if (r5 != 0) goto L_0x0022
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes r5 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.INSTANCE
            boolean r5 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.isUnsignedType(r0)
            if (r5 == 0) goto L_0x0028
        L_0x0022:
            boolean r5 = p298d.p299a.p300a.p301a.p303y0.p405l.C7460d1.m13441g(r0)
            if (r5 == 0) goto L_0x0031
        L_0x0028:
            boolean r5 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isString(r0)
            if (r5 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r5 = r3
            goto L_0x0032
        L_0x0031:
            r5 = r2
        L_0x0032:
            if (r5 == 0) goto L_0x0055
            d.a.a.a.y0.d.a.k0.b r5 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6500v.f12744a
            p298d.p344x.p346c.C6888i.m12438e(r0, r4)
            d.a.a.a.y0.l.j1.n r5 = p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7508n.f14951a
            p298d.p344x.p346c.C6888i.m12438e(r5, r4)
            p298d.p344x.p346c.C6888i.m12438e(r0, r1)
            d.a.a.a.y0.f.b r1 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6523z.f12783o
            java.lang.String r4 = "ENHANCED_NULLABILITY_ANNOTATION"
            p298d.p344x.p346c.C6888i.m12437d(r1, r4)
            boolean r1 = r5.mo25149z(r0, r1)
            if (r1 == 0) goto L_0x0056
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isString(r0)
            if (r0 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r2 = r3
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6312g.mo23146n():boolean");
    }
}
