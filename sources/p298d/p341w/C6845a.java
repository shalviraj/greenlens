package p298d.p341w;

import java.lang.reflect.Method;
import p298d.p344x.p346c.C6888i;
import p298d.p349z.C6909b;
import p298d.p349z.C6911c;

/* renamed from: d.w.a */
public class C6845a {

    /* renamed from: d.w.a$a */
    public static final class C6846a {

        /* renamed from: a */
        public static final Method f13776a;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Class[]} */
        /* JADX WARNING: type inference failed for: r6v5 */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
            if (p298d.p344x.p346c.C6888i.m12434a(r6, r0) != false) goto L_0x0040;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                p298d.p344x.p346c.C6888i.m12437d(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L_0x000e:
                java.lang.String r5 = "it"
                r6 = 0
                if (r4 >= r2) goto L_0x0047
                r7 = r1[r4]
                p298d.p344x.p346c.C6888i.m12437d(r7, r5)
                java.lang.String r8 = r7.getName()
                java.lang.String r9 = "addSuppressed"
                boolean r8 = p298d.p344x.p346c.C6888i.m12434a(r8, r9)
                r9 = 1
                if (r8 == 0) goto L_0x003f
                java.lang.Class[] r8 = r7.getParameterTypes()
                java.lang.String r10 = "it.parameterTypes"
                p298d.p344x.p346c.C6888i.m12437d(r8, r10)
                java.lang.String r10 = "$this$singleOrNull"
                p298d.p344x.p346c.C6888i.m12438e(r8, r10)
                int r10 = r8.length
                if (r10 != r9) goto L_0x0038
                r6 = r8[r3]
            L_0x0038:
                boolean r6 = p298d.p344x.p346c.C6888i.m12434a(r6, r0)
                if (r6 == 0) goto L_0x003f
                goto L_0x0040
            L_0x003f:
                r9 = r3
            L_0x0040:
                if (r9 == 0) goto L_0x0044
                r6 = r7
                goto L_0x0047
            L_0x0044:
                int r4 = r4 + 1
                goto L_0x000e
            L_0x0047:
                f13776a = r6
                int r0 = r1.length
            L_0x004a:
                if (r3 >= r0) goto L_0x0061
                r2 = r1[r3]
                p298d.p344x.p346c.C6888i.m12437d(r2, r5)
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r2, r4)
                if (r2 == 0) goto L_0x005e
                goto L_0x0061
            L_0x005e:
                int r3 = r3 + 1
                goto L_0x004a
            L_0x0061:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p341w.C6845a.C6846a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo24182a(Throwable th, Throwable th2) {
        C6888i.m12438e(th, "cause");
        C6888i.m12438e(th2, "exception");
        Method method = C6846a.f13776a;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    /* renamed from: b */
    public C6911c mo24183b() {
        return new C6909b();
    }
}
