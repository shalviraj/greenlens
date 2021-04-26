package p005b.p265m.p266a;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p265m.p266a.p267t.C4736c;
import p005b.p265m.p266a.p267t.C4738d;
import p005b.p265m.p266a.p267t.C4752m;

/* renamed from: b.m.a.j */
public class C4719j {

    /* renamed from: k */
    public static final String f9003k = "j";

    /* renamed from: a */
    public C4738d f9004a;

    /* renamed from: b */
    public HandlerThread f9005b;

    /* renamed from: c */
    public Handler f9006c;

    /* renamed from: d */
    public C4716g f9007d;

    /* renamed from: e */
    public Handler f9008e;

    /* renamed from: f */
    public Rect f9009f;

    /* renamed from: g */
    public boolean f9010g = false;

    /* renamed from: h */
    public final Object f9011h = new Object();

    /* renamed from: i */
    public final Handler.Callback f9012i = new C4720a();

    /* renamed from: j */
    public final C4752m f9013j = new C4721b();

    /* renamed from: b.m.a.j$a */
    public class C4720a implements Handler.Callback {
        public C4720a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00ce A[LOOP:5: B:31:0x00cc->B:32:0x00ce, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x016a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean handleMessage(android.os.Message r21) {
            /*
                r20 = this;
                r1 = r20
                r0 = r21
                int r2 = r0.what
                r3 = 1
                r4 = 2131231310(0x7f08024e, float:1.8078697E38)
                if (r2 != r4) goto L_0x01c4
                b.m.a.j r2 = p005b.p265m.p266a.C4719j.this
                java.lang.Object r0 = r0.obj
                b.m.a.s r0 = (p005b.p265m.p266a.C4730s) r0
                java.util.Objects.requireNonNull(r2)
                long r4 = java.lang.System.currentTimeMillis()
                android.graphics.Rect r6 = r2.f9009f
                r0.f9034d = r6
                r7 = 0
                if (r6 != 0) goto L_0x0023
                r6 = r7
                goto L_0x00ee
            L_0x0023:
                b.m.a.n r6 = r0.f9031a
                int r8 = r0.f9033c
                java.util.Objects.requireNonNull(r6)
                r9 = 90
                r10 = 0
                if (r8 == r9) goto L_0x0087
                r9 = 180(0xb4, float:2.52E-43)
                if (r8 == r9) goto L_0x0066
                r9 = 270(0x10e, float:3.78E-43)
                if (r8 == r9) goto L_0x0039
                goto L_0x00b3
            L_0x0039:
                b.m.a.n r8 = new b.m.a.n
                byte[] r9 = r6.f9021a
                int r11 = r6.f9022b
                int r12 = r6.f9023c
                int r13 = r11 * r12
                byte[] r14 = new byte[r13]
                int r13 = r13 + -1
                r15 = r10
            L_0x0048:
                if (r15 >= r11) goto L_0x005e
                int r16 = r12 + -1
            L_0x004c:
                if (r16 < 0) goto L_0x005b
                int r17 = r16 * r11
                int r17 = r17 + r15
                byte r17 = r9[r17]
                r14[r13] = r17
                int r13 = r13 + -1
                int r16 = r16 + -1
                goto L_0x004c
            L_0x005b:
                int r15 = r15 + 1
                goto L_0x0048
            L_0x005e:
                int r9 = r6.f9023c
                int r6 = r6.f9022b
                r8.<init>(r14, r9, r6)
                goto L_0x00b2
            L_0x0066:
                b.m.a.n r8 = new b.m.a.n
                byte[] r9 = r6.f9021a
                int r11 = r6.f9022b
                int r12 = r6.f9023c
                int r11 = r11 * r12
                byte[] r12 = new byte[r11]
                int r13 = r11 + -1
                r14 = r10
            L_0x0074:
                if (r14 >= r11) goto L_0x007f
                byte r15 = r9[r14]
                r12[r13] = r15
                int r13 = r13 + -1
                int r14 = r14 + 1
                goto L_0x0074
            L_0x007f:
                int r9 = r6.f9022b
                int r6 = r6.f9023c
                r8.<init>(r12, r9, r6)
                goto L_0x00b2
            L_0x0087:
                b.m.a.n r8 = new b.m.a.n
                byte[] r9 = r6.f9021a
                int r11 = r6.f9022b
                int r12 = r6.f9023c
                int r13 = r11 * r12
                byte[] r13 = new byte[r13]
                r14 = r10
                r15 = r14
            L_0x0095:
                if (r14 >= r11) goto L_0x00ab
                int r16 = r12 + -1
            L_0x0099:
                if (r16 < 0) goto L_0x00a8
                int r17 = r16 * r11
                int r17 = r17 + r14
                byte r17 = r9[r17]
                r13[r15] = r17
                int r15 = r15 + 1
                int r16 = r16 + -1
                goto L_0x0099
            L_0x00a8:
                int r14 = r14 + 1
                goto L_0x0095
            L_0x00ab:
                int r9 = r6.f9023c
                int r6 = r6.f9022b
                r8.<init>(r13, r9, r6)
            L_0x00b2:
                r6 = r8
            L_0x00b3:
                android.graphics.Rect r8 = r0.f9034d
                int r9 = r8.width()
                int r9 = r9 / r3
                int r11 = r8.height()
                int r15 = r11 / 1
                int r11 = r8.top
                int r12 = r9 * r15
                byte[] r12 = new byte[r12]
                int r13 = r6.f9022b
                int r11 = r11 * r13
                int r8 = r8.left
                int r11 = r11 + r8
            L_0x00cc:
                if (r10 >= r15) goto L_0x00db
                int r8 = r10 * r9
                byte[] r13 = r6.f9021a
                java.lang.System.arraycopy(r13, r11, r12, r8, r9)
                int r8 = r6.f9022b
                int r11 = r11 + r8
                int r10 = r10 + 1
                goto L_0x00cc
            L_0x00db:
                b.l.f.n r6 = new b.l.f.n
                r8 = 0
                r16 = 0
                r19 = 0
                r11 = r6
                r13 = r9
                r14 = r15
                r10 = r15
                r15 = r8
                r17 = r9
                r18 = r10
                r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            L_0x00ee:
                if (r6 == 0) goto L_0x0121
                b.m.a.g r8 = r2.f9007d
                b.l.f.c r6 = r8.mo16447b(r6)
                java.util.List<b.l.f.s> r9 = r8.f9001b
                r9.clear()
                b.l.f.o r9 = r8.f9000a     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
                boolean r10 = r9 instanceof p005b.p096l.p232f.C4617k     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
                if (r10 == 0) goto L_0x010f
                b.l.f.k r9 = (p005b.p096l.p232f.C4617k) r9     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
                b.l.f.o[] r10 = r9.f8684b     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
                if (r10 != 0) goto L_0x010a
                r9.mo16280e(r7)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            L_0x010a:
                b.l.f.q r6 = r9.mo16279d(r6)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
                goto L_0x0113
            L_0x010f:
                b.l.f.q r6 = r9.mo16153b(r6)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            L_0x0113:
                r7 = r6
                goto L_0x011c
            L_0x0115:
                r0 = move-exception
                b.l.f.o r2 = r8.f9000a
                r2.mo16154c()
                throw r0
            L_0x011c:
                b.l.f.o r6 = r8.f9000a
                r6.mo16154c()
            L_0x0121:
                if (r7 == 0) goto L_0x0158
                long r8 = java.lang.System.currentTimeMillis()
                java.lang.String r6 = p005b.p265m.p266a.C4719j.f9003k
                java.lang.String r10 = "Found barcode in "
                java.lang.StringBuilder r10 = p005b.p035e.p036a.p037a.C0843a.m460u(r10)
                long r8 = r8 - r4
                r10.append(r8)
                java.lang.String r4 = " ms"
                r10.append(r4)
                java.lang.String r4 = r10.toString()
                android.util.Log.d(r6, r4)
                android.os.Handler r4 = r2.f9008e
                if (r4 == 0) goto L_0x0166
                b.m.a.b r5 = new b.m.a.b
                r5.<init>(r7, r0)
                r6 = 2131231312(0x7f080250, float:1.8078701E38)
                android.os.Message r4 = android.os.Message.obtain(r4, r6, r5)
                android.os.Bundle r5 = new android.os.Bundle
                r5.<init>()
                r4.setData(r5)
                goto L_0x0163
            L_0x0158:
                android.os.Handler r4 = r2.f9008e
                if (r4 == 0) goto L_0x0166
                r5 = 2131231311(0x7f08024f, float:1.80787E38)
                android.os.Message r4 = android.os.Message.obtain(r4, r5)
            L_0x0163:
                r4.sendToTarget()
            L_0x0166:
                android.os.Handler r4 = r2.f9008e
                if (r4 == 0) goto L_0x01c0
                b.m.a.g r4 = r2.f9007d
                java.util.Objects.requireNonNull(r4)
                java.util.ArrayList r5 = new java.util.ArrayList
                java.util.List<b.l.f.s> r4 = r4.f9001b
                r5.<init>(r4)
                java.util.ArrayList r4 = new java.util.ArrayList
                int r6 = r5.size()
                r4.<init>(r6)
                java.util.Iterator r5 = r5.iterator()
            L_0x0183:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x01b4
                java.lang.Object r6 = r5.next()
                b.l.f.s r6 = (p005b.p096l.p232f.C4625s) r6
                float r7 = r6.f8708a
                float r8 = (float) r3
                float r7 = r7 * r8
                android.graphics.Rect r9 = r0.f9034d
                int r10 = r9.left
                float r10 = (float) r10
                float r7 = r7 + r10
                float r6 = r6.f8709b
                float r6 = r6 * r8
                int r8 = r9.top
                float r8 = (float) r8
                float r6 = r6 + r8
                boolean r8 = r0.f9035e
                if (r8 == 0) goto L_0x01ab
                b.m.a.n r8 = r0.f9031a
                int r8 = r8.f9022b
                float r8 = (float) r8
                float r7 = r8 - r7
            L_0x01ab:
                b.l.f.s r8 = new b.l.f.s
                r8.<init>(r7, r6)
                r4.add(r8)
                goto L_0x0183
            L_0x01b4:
                android.os.Handler r0 = r2.f9008e
                r5 = 2131231313(0x7f080251, float:1.8078703E38)
                android.os.Message r0 = android.os.Message.obtain(r0, r5, r4)
                r0.sendToTarget()
            L_0x01c0:
                r2.mo16448a()
                goto L_0x01ce
            L_0x01c4:
                r0 = 2131231314(0x7f080252, float:1.8078706E38)
                if (r2 != r0) goto L_0x01ce
                b.m.a.j r0 = p005b.p265m.p266a.C4719j.this
                r0.mo16448a()
            L_0x01ce:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p265m.p266a.C4719j.C4720a.handleMessage(android.os.Message):boolean");
        }
    }

    /* renamed from: b.m.a.j$b */
    public class C4721b implements C4752m {
        public C4721b() {
        }

        /* renamed from: a */
        public void mo16450a(Exception exc) {
            synchronized (C4719j.this.f9011h) {
                C4719j jVar = C4719j.this;
                if (jVar.f9010g) {
                    jVar.f9006c.obtainMessage(R.id.zxing_preview_failed).sendToTarget();
                }
            }
        }
    }

    public C4719j(C4738d dVar, C4716g gVar, Handler handler) {
        C1960d.m2750S0();
        this.f9004a = dVar;
        this.f9007d = gVar;
        this.f9008e = handler;
    }

    /* renamed from: a */
    public final void mo16448a() {
        C4738d dVar = this.f9004a;
        dVar.f9061h.post(new C4736c(dVar, this.f9013j));
    }
}
