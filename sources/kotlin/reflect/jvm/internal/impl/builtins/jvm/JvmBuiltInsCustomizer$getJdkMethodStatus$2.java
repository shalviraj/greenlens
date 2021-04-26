package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7623b;
import p298d.p344x.p346c.C6901v;

public final class JvmBuiltInsCustomizer$getJdkMethodStatus$2 extends C7623b<C6046e, JvmBuiltInsCustomizer.JDKMemberStatus> {
    public final /* synthetic */ String $jvmDescriptor;
    public final /* synthetic */ C6901v<JvmBuiltInsCustomizer.JDKMemberStatus> $result;

    public JvmBuiltInsCustomizer$getJdkMethodStatus$2(String str, C6901v<JvmBuiltInsCustomizer.JDKMemberStatus> vVar) {
        this.$jvmDescriptor = str;
        this.$result = vVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean beforeChildren(p298d.p299a.p300a.p301a.p303y0.p304b.C6046e r3) {
        /*
            r2 = this;
            java.lang.String r0 = "javaClassDescriptor"
            p298d.p344x.p346c.C6888i.m12438e(r3, r0)
            d.a.a.a.y0.d.b.s r0 = p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6565s.f12856a
            java.lang.String r1 = r2.$jvmDescriptor
            java.lang.String r3 = p005b.p291q.p292a.C5266a.m9901W3(r0, r3, r1)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSignatures r0 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSignatures.INSTANCE
            java.util.Set r1 = r0.getHIDDEN_METHOD_SIGNATURES()
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L_0x0020
            d.x.c.v<kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus> r3 = r2.$result
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus r0 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus.HIDDEN
        L_0x001d:
            r3.f13801g = r0
            goto L_0x003e
        L_0x0020:
            java.util.Set r1 = r0.getVISIBLE_METHOD_SIGNATURES()
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L_0x002f
            d.x.c.v<kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus> r3 = r2.$result
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus r0 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus.VISIBLE
            goto L_0x001d
        L_0x002f:
            java.util.Set r0 = r0.getDROP_LIST_METHOD_SIGNATURES()
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L_0x003e
            d.x.c.v<kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus> r3 = r2.$result
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus r0 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus.DROP
            goto L_0x001d
        L_0x003e:
            d.x.c.v<kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus> r3 = r2.$result
            T r3 = r3.f13801g
            if (r3 != 0) goto L_0x0046
            r3 = 1
            goto L_0x0047
        L_0x0046:
            r3 = 0
        L_0x0047:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getJdkMethodStatus$2.beforeChildren(d.a.a.a.y0.b.e):boolean");
    }

    public JvmBuiltInsCustomizer.JDKMemberStatus result() {
        JvmBuiltInsCustomizer.JDKMemberStatus jDKMemberStatus = (JvmBuiltInsCustomizer.JDKMemberStatus) this.$result.f13801g;
        return jDKMemberStatus == null ? JvmBuiltInsCustomizer.JDKMemberStatus.NOT_CONSIDERED : jDKMemberStatus;
    }
}
