package p376j.p378b.p383c;

import java.util.logging.Logger;

/* renamed from: j.b.c.x */
public final class C7056x {

    /* renamed from: a */
    public static final Logger f14155a = Logger.getLogger(C7056x.class.getName());

    /* renamed from: b */
    public static final C7045s f14156b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: j.b.c.s} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<j.b.c.s> r0 = p376j.p378b.p383c.C7045s.class
            java.lang.Class<j.b.c.x> r1 = p376j.p378b.p383c.C7056x.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f14155a = r1
            java.lang.ClassLoader r1 = r0.getClassLoader()
            r2 = 1
            java.lang.String r3 = "io.opencensus.impl.trace.TraceComponentImpl"
            java.lang.Class r3 = java.lang.Class.forName(r3, r2, r1)     // Catch:{ ClassNotFoundException -> 0x0020 }
            java.lang.Object r3 = p005b.p291q.p292a.C5266a.m10062y0(r3, r0)     // Catch:{ ClassNotFoundException -> 0x0020 }
            j.b.c.s r3 = (p376j.p378b.p383c.C7045s) r3     // Catch:{ ClassNotFoundException -> 0x0020 }
            goto L_0x0048
        L_0x0020:
            r3 = move-exception
            java.util.logging.Logger r4 = f14155a
            java.util.logging.Level r5 = java.util.logging.Level.FINE
            java.lang.String r6 = "Couldn't load full implementation for TraceComponent, now trying to load lite implementation."
            r4.log(r5, r6, r3)
            java.lang.String r3 = "io.opencensus.impllite.trace.TraceComponentImplLite"
            java.lang.Class r1 = java.lang.Class.forName(r3, r2, r1)     // Catch:{ ClassNotFoundException -> 0x0038 }
            java.lang.Object r0 = p005b.p291q.p292a.C5266a.m10062y0(r1, r0)     // Catch:{ ClassNotFoundException -> 0x0038 }
            r3 = r0
            j.b.c.s r3 = (p376j.p378b.p383c.C7045s) r3     // Catch:{ ClassNotFoundException -> 0x0038 }
            goto L_0x0048
        L_0x0038:
            r0 = move-exception
            java.util.logging.Logger r1 = f14155a
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            java.lang.String r3 = "Couldn't load lite implementation for TraceComponent, now using default implementation for TraceComponent."
            r1.log(r2, r3, r0)
            j.b.c.s$b r3 = new j.b.c.s$b
            r0 = 0
            r3.<init>(r0)
        L_0x0048:
            f14156b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p376j.p378b.p383c.C7056x.<clinit>():void");
    }
}
