package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6210m;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6211m0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;

/* renamed from: d.a.a.a.y0.b.h1.g0 */
public class C6107g0 extends C6095d0 implements C6211m0 {

    /* renamed from: o */
    public C6030b1 f12068o;

    /* renamed from: p */
    public final C6211m0 f12069p;

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* JADX WARNING: type inference failed for: r21v0, types: [d.a.a.a.y0.b.m0] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6107g0(p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0 r13, p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h r14, p298d.p299a.p300a.p301a.p303y0.p304b.C6251y r15, p298d.p299a.p300a.p301a.p303y0.p304b.C6233r r16, boolean r17, boolean r18, boolean r19, p298d.p299a.p300a.p301a.p303y0.p304b.C6023b.C6024a r20, p298d.p299a.p300a.p301a.p303y0.p304b.C6211m0 r21, p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0 r22) {
        /*
            r12 = this;
            r0 = 0
            if (r14 == 0) goto L_0x005b
            if (r15 == 0) goto L_0x0055
            if (r16 == 0) goto L_0x004f
            if (r20 == 0) goto L_0x0049
            if (r22 == 0) goto L_0x0043
            java.lang.String r0 = "<set-"
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m460u(r0)
            d.a.a.a.y0.f.d r1 = r13.getName()
            r0.append(r1)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            d.a.a.a.y0.f.d r6 = p298d.p299a.p300a.p301a.p303y0.p331f.C6717d.m12272p(r0)
            r1 = r12
            r2 = r15
            r3 = r16
            r4 = r13
            r5 = r14
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r21 == 0) goto L_0x003e
            r1 = r12
            r0 = r21
            goto L_0x0040
        L_0x003e:
            r0 = r12
            r1 = r0
        L_0x0040:
            r1.f12069p = r0
            return
        L_0x0043:
            r1 = r12
            r2 = 5
            $$$reportNull$$$0(r2)
            throw r0
        L_0x0049:
            r1 = r12
            r2 = 4
            $$$reportNull$$$0(r2)
            throw r0
        L_0x004f:
            r1 = r12
            r2 = 3
            $$$reportNull$$$0(r2)
            throw r0
        L_0x0055:
            r1 = r12
            r2 = 2
            $$$reportNull$$$0(r2)
            throw r0
        L_0x005b:
            r1 = r12
            r2 = 1
            $$$reportNull$$$0(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6107g0.<init>(d.a.a.a.y0.b.k0, d.a.a.a.y0.b.f1.h, d.a.a.a.y0.b.y, d.a.a.a.y0.b.r, boolean, boolean, boolean, d.a.a.a.y0.b.b$a, d.a.a.a.y0.b.m0, d.a.a.a.y0.b.r0):void");
    }

    /* renamed from: D */
    public static C6123n0 m10959D(C6211m0 m0Var, C7452c0 c0Var, C6060h hVar) {
        if (m0Var == null) {
            $$$reportNull$$$0(7);
            throw null;
        } else if (c0Var == null) {
            $$$reportNull$$$0(8);
            throw null;
        } else if (hVar != null) {
            return new C6123n0(m0Var, (C6030b1) null, 0, hVar, C6717d.m12272p("<set-?>"), c0Var, false, false, false, (C7452c0) null, C6234r0.f12257a);
        } else {
            $$$reportNull$$$0(9);
            throw null;
        }
    }

    /* renamed from: O */
    public C6211m0 mo23210x() {
        C6211m0 m0Var = this.f12069p;
        if (m0Var != null) {
            return m0Var;
        }
        $$$reportNull$$$0(13);
        throw null;
    }

    /* renamed from: U */
    public void mo23243U(C6030b1 b1Var) {
        if (b1Var != null) {
            this.f12068o = b1Var;
        } else {
            $$$reportNull$$$0(6);
            throw null;
        }
    }

    public <R, D> R accept(C6210m<R, D> mVar, D d) {
        return mVar.mo22985f(this, d);
    }

    public Collection<? extends C6211m0> getOverriddenDescriptors() {
        return mo23211z(false);
    }

    public C7452c0 getReturnType() {
        C7489j0 unitType = C7255a.m13133f(this).getUnitType();
        if (unitType != null) {
            return unitType;
        }
        $$$reportNull$$$0(12);
        throw null;
    }

    public List<C6030b1> getValueParameters() {
        C6030b1 b1Var = this.f12068o;
        if (b1Var != null) {
            List<C6030b1> singletonList = Collections.singletonList(b1Var);
            if (singletonList != null) {
                return singletonList;
            }
            $$$reportNull$$$0(11);
            throw null;
        }
        throw new IllegalStateException();
    }
}
