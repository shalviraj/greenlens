package p435n;

import java.util.zip.Inflater;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;

/* renamed from: n.n */
public final class C8051n implements C8030a0 {

    /* renamed from: g */
    public int f16158g;

    /* renamed from: h */
    public boolean f16159h;

    /* renamed from: i */
    public final C8043g f16160i;

    /* renamed from: j */
    public final Inflater f16161j;

    public C8051n(C8030a0 a0Var, Inflater inflater) {
        C6888i.m12438e(a0Var, "source");
        C6888i.m12438e(inflater, "inflater");
        C8043g H = C5266a.m9812H(a0Var);
        C6888i.m12438e(H, "source");
        C6888i.m12438e(inflater, "inflater");
        this.f16160i = H;
        this.f16161j = inflater;
    }

    public C8051n(C8043g gVar, Inflater inflater) {
        C6888i.m12438e(gVar, "source");
        C6888i.m12438e(inflater, "inflater");
        this.f16160i = gVar;
        this.f16161j = inflater;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0070 A[SYNTHETIC] */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo17031T(p435n.C8040e r10, long r11) {
        /*
            r9 = this;
            java.lang.String r0 = "sink"
            p298d.p344x.p346c.C6888i.m12438e(r10, r0)
        L_0x0005:
            p298d.p344x.p346c.C6888i.m12438e(r10, r0)
            r1 = 0
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r4 = 1
            if (r3 < 0) goto L_0x0011
            r5 = r4
            goto L_0x0012
        L_0x0011:
            r5 = 0
        L_0x0012:
            if (r5 == 0) goto L_0x00aa
            boolean r5 = r9.f16159h
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x009e
            if (r3 != 0) goto L_0x001c
            goto L_0x006b
        L_0x001c:
            n.v r3 = r10.mo25927r0(r4)     // Catch:{ DataFormatException -> 0x0097 }
            int r4 = r3.f16185c     // Catch:{ DataFormatException -> 0x0097 }
            int r4 = 8192 - r4
            long r4 = (long) r4     // Catch:{ DataFormatException -> 0x0097 }
            long r4 = java.lang.Math.min(r11, r4)     // Catch:{ DataFormatException -> 0x0097 }
            int r4 = (int) r4     // Catch:{ DataFormatException -> 0x0097 }
            r9.mo25977d()     // Catch:{ DataFormatException -> 0x0097 }
            java.util.zip.Inflater r5 = r9.f16161j     // Catch:{ DataFormatException -> 0x0097 }
            byte[] r6 = r3.f16183a     // Catch:{ DataFormatException -> 0x0097 }
            int r7 = r3.f16185c     // Catch:{ DataFormatException -> 0x0097 }
            int r4 = r5.inflate(r6, r7, r4)     // Catch:{ DataFormatException -> 0x0097 }
            int r5 = r9.f16158g     // Catch:{ DataFormatException -> 0x0097 }
            if (r5 != 0) goto L_0x003c
            goto L_0x004e
        L_0x003c:
            java.util.zip.Inflater r6 = r9.f16161j     // Catch:{ DataFormatException -> 0x0097 }
            int r6 = r6.getRemaining()     // Catch:{ DataFormatException -> 0x0097 }
            int r5 = r5 - r6
            int r6 = r9.f16158g     // Catch:{ DataFormatException -> 0x0097 }
            int r6 = r6 - r5
            r9.f16158g = r6     // Catch:{ DataFormatException -> 0x0097 }
            n.g r6 = r9.f16160i     // Catch:{ DataFormatException -> 0x0097 }
            long r7 = (long) r5     // Catch:{ DataFormatException -> 0x0097 }
            r6.skip(r7)     // Catch:{ DataFormatException -> 0x0097 }
        L_0x004e:
            if (r4 <= 0) goto L_0x005c
            int r5 = r3.f16185c     // Catch:{ DataFormatException -> 0x0097 }
            int r5 = r5 + r4
            r3.f16185c = r5     // Catch:{ DataFormatException -> 0x0097 }
            long r5 = r10.f16140h     // Catch:{ DataFormatException -> 0x0097 }
            long r3 = (long) r4     // Catch:{ DataFormatException -> 0x0097 }
            long r5 = r5 + r3
            r10.f16140h = r5     // Catch:{ DataFormatException -> 0x0097 }
            goto L_0x006c
        L_0x005c:
            int r4 = r3.f16184b     // Catch:{ DataFormatException -> 0x0097 }
            int r5 = r3.f16185c     // Catch:{ DataFormatException -> 0x0097 }
            if (r4 != r5) goto L_0x006b
            n.v r4 = r3.mo25996a()     // Catch:{ DataFormatException -> 0x0097 }
            r10.f16139g = r4     // Catch:{ DataFormatException -> 0x0097 }
            p435n.C8062w.m14927a(r3)     // Catch:{ DataFormatException -> 0x0097 }
        L_0x006b:
            r3 = r1
        L_0x006c:
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0071
            return r3
        L_0x0071:
            java.util.zip.Inflater r1 = r9.f16161j
            boolean r1 = r1.finished()
            if (r1 != 0) goto L_0x0094
            java.util.zip.Inflater r1 = r9.f16161j
            boolean r1 = r1.needsDictionary()
            if (r1 == 0) goto L_0x0082
            goto L_0x0094
        L_0x0082:
            n.g r1 = r9.f16160i
            boolean r1 = r1.mo25886D()
            if (r1 != 0) goto L_0x008c
            goto L_0x0005
        L_0x008c:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r11 = "source exhausted prematurely"
            r10.<init>(r11)
            throw r10
        L_0x0094:
            r10 = -1
            return r10
        L_0x0097:
            r10 = move-exception
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r10)
            throw r11
        L_0x009e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "closed"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00aa:
            java.lang.String r10 = "byteCount < 0: "
            java.lang.String r10 = p005b.p035e.p036a.p037a.C0843a.m448i(r10, r11)
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p435n.C8051n.mo17031T(n.e, long):long");
    }

    public void close() {
        if (!this.f16159h) {
            this.f16161j.end();
            this.f16159h = true;
            this.f16160i.close();
        }
    }

    /* renamed from: d */
    public final boolean mo25977d() {
        if (!this.f16161j.needsInput()) {
            return false;
        }
        if (this.f16160i.mo25886D()) {
            return true;
        }
        C8061v vVar = this.f16160i.mo25901c().f16139g;
        C6888i.m12436c(vVar);
        int i = vVar.f16185c;
        int i2 = vVar.f16184b;
        int i3 = i - i2;
        this.f16158g = i3;
        this.f16161j.setInput(vVar.f16183a, i2, i3);
        return false;
    }

    /* renamed from: f */
    public C8034b0 mo17035f() {
        return this.f16160i.mo17035f();
    }
}
