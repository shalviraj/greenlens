package p005b.p096l.p097a.p113c.p131e.p140i;

import java.io.IOException;
import java.util.logging.Logger;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p131e.p140i.C2794g4;
import p005b.p096l.p097a.p113c.p131e.p140i.C2807h4;

/* renamed from: b.l.a.c.e.i.h4 */
public abstract class C2807h4<MessageType extends C2807h4<MessageType, BuilderType>, BuilderType extends C2794g4<MessageType, BuilderType>> implements C2913p6 {
    public int zzb = 0;

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable<T>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> void m4807i(java.lang.Iterable<T> r6, java.util.List<? super T> r7) {
        /*
            java.nio.charset.Charset r0 = p005b.p096l.p097a.p113c.p131e.p140i.C2990v5.f5088a
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r6 instanceof p005b.p096l.p097a.p113c.p131e.p140i.C2727b6
            java.lang.String r1 = " is null."
            java.lang.String r2 = "Element at index "
            r3 = 37
            if (r0 == 0) goto L_0x0065
            b.l.a.c.e.i.b6 r6 = (p005b.p096l.p097a.p113c.p131e.p140i.C2727b6) r6
            java.util.List r6 = r6.mo13228g()
            r0 = r7
            b.l.a.c.e.i.b6 r0 = (p005b.p096l.p097a.p113c.p131e.p140i.C2727b6) r0
            int r7 = r7.size()
            java.util.Iterator r6 = r6.iterator()
        L_0x0020:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x00c1
            java.lang.Object r4 = r6.next()
            if (r4 != 0) goto L_0x0055
            int r6 = r0.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r2)
            int r6 = r6 - r7
            r4.append(r6)
            r4.append(r1)
            java.lang.String r6 = r4.toString()
            int r1 = r0.size()
        L_0x0047:
            int r1 = r1 + -1
            if (r1 < r7) goto L_0x004f
            r0.remove(r1)
            goto L_0x0047
        L_0x004f:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r6)
            throw r7
        L_0x0055:
            boolean r5 = r4 instanceof p005b.p096l.p097a.p113c.p131e.p140i.C2937r4
            if (r5 == 0) goto L_0x005f
            b.l.a.c.e.i.r4 r4 = (p005b.p096l.p097a.p113c.p131e.p140i.C2937r4) r4
            r0.mo13221G(r4)
            goto L_0x0020
        L_0x005f:
            java.lang.String r4 = (java.lang.String) r4
            r0.add(r4)
            goto L_0x0020
        L_0x0065:
            boolean r0 = r6 instanceof p005b.p096l.p097a.p113c.p131e.p140i.C2991v6
            if (r0 != 0) goto L_0x00c2
            boolean r0 = r7 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x0080
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0080
            r0 = r7
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r4 = r7.size()
            int r5 = r6.size()
            int r5 = r5 + r4
            r0.ensureCapacity(r5)
        L_0x0080:
            int r0 = r7.size()
            java.util.Iterator r6 = r6.iterator()
        L_0x0088:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x00c1
            java.lang.Object r4 = r6.next()
            if (r4 != 0) goto L_0x00bd
            int r6 = r7.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r2)
            int r6 = r6 - r0
            r4.append(r6)
            r4.append(r1)
            java.lang.String r6 = r4.toString()
            int r1 = r7.size()
        L_0x00af:
            int r1 = r1 + -1
            if (r1 < r0) goto L_0x00b7
            r7.remove(r1)
            goto L_0x00af
        L_0x00b7:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r6)
            throw r7
        L_0x00bd:
            r7.add(r4)
            goto L_0x0088
        L_0x00c1:
            return
        L_0x00c2:
            r7.addAll(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p131e.p140i.C2807h4.m4807i(java.lang.Iterable, java.util.List):void");
    }

    /* renamed from: a */
    public final C2937r4 mo13370a() {
        try {
            C2899o5 o5Var = (C2899o5) this;
            int b = o5Var.mo13540b();
            C2937r4 r4Var = C2937r4.f4977h;
            byte[] bArr = new byte[b];
            Logger logger = C3002w4.f5103b;
            C2976u4 u4Var = new C2976u4(bArr, 0, b);
            o5Var.mo13547o(u4Var);
            if (u4Var.mo13787z() == 0) {
                return new C2924q4(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(C0843a.m456q(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    /* renamed from: e */
    public final byte[] mo13371e() {
        try {
            C2899o5 o5Var = (C2899o5) this;
            int b = o5Var.mo13540b();
            byte[] bArr = new byte[b];
            Logger logger = C3002w4.f5103b;
            C2976u4 u4Var = new C2976u4(bArr, 0, b);
            o5Var.mo13547o(u4Var);
            if (u4Var.mo13787z() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(C0843a.m456q(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    /* renamed from: g */
    public int mo13372g() {
        throw null;
    }

    /* renamed from: h */
    public void mo13373h(int i) {
        throw null;
    }
}
