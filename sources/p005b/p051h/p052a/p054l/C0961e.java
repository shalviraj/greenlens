package p005b.p051h.p052a.p054l;

import android.graphics.Bitmap;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import p005b.p051h.p052a.p054l.C0956a;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1023b;
import p005b.p051h.p052a.p055m.p064x.p069g.C1281b;

/* renamed from: b.h.a.l.e */
public class C0961e implements C0956a {

    /* renamed from: u */
    public static final String f976u = "e";
    @ColorInt

    /* renamed from: a */
    public int[] f977a;
    @ColorInt

    /* renamed from: b */
    public final int[] f978b = new int[256];

    /* renamed from: c */
    public final C0956a.C0957a f979c;

    /* renamed from: d */
    public ByteBuffer f980d;

    /* renamed from: e */
    public byte[] f981e;

    /* renamed from: f */
    public short[] f982f;

    /* renamed from: g */
    public byte[] f983g;

    /* renamed from: h */
    public byte[] f984h;

    /* renamed from: i */
    public byte[] f985i;
    @ColorInt

    /* renamed from: j */
    public int[] f986j;

    /* renamed from: k */
    public int f987k;

    /* renamed from: l */
    public C0959c f988l;

    /* renamed from: m */
    public Bitmap f989m;

    /* renamed from: n */
    public boolean f990n;

    /* renamed from: o */
    public int f991o;

    /* renamed from: p */
    public int f992p;

    /* renamed from: q */
    public int f993q;

    /* renamed from: r */
    public int f994r;
    @Nullable

    /* renamed from: s */
    public Boolean f995s;
    @NonNull

    /* renamed from: t */
    public Bitmap.Config f996t = Bitmap.Config.ARGB_8888;

    public C0961e(@NonNull C0956a.C0957a aVar, C0959c cVar, ByteBuffer byteBuffer, int i) {
        this.f979c = aVar;
        this.f988l = new C0959c();
        synchronized (this) {
            if (i > 0) {
                int highestOneBit = Integer.highestOneBit(i);
                this.f991o = 0;
                this.f988l = cVar;
                this.f987k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f980d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f980d.order(ByteOrder.LITTLE_ENDIAN);
                this.f990n = false;
                Iterator<C0958b> it = cVar.f965e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().f956g == 3) {
                            this.f990n = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.f992p = highestOneBit;
                int i2 = cVar.f966f;
                this.f994r = i2 / highestOneBit;
                int i3 = cVar.f967g;
                this.f993q = i3 / highestOneBit;
                this.f985i = ((C1281b) this.f979c).mo11113a(i2 * i3);
                C0956a.C0957a aVar2 = this.f979c;
                int i4 = this.f994r * this.f993q;
                C1023b bVar = ((C1281b) aVar2).f1592b;
                this.f986j = bVar == null ? new int[i4] : (int[]) bVar.mo10888e(i4, int[].class);
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
        }
    }

    /* renamed from: a */
    public int mo10807a() {
        return this.f987k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e5, code lost:
        return null;
     */
    @androidx.annotation.Nullable
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap mo10808b() {
        /*
            r8 = this;
            monitor-enter(r8)
            b.h.a.l.c r0 = r8.f988l     // Catch:{ all -> 0x00e6 }
            int r0 = r0.f963c     // Catch:{ all -> 0x00e6 }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r8.f987k     // Catch:{ all -> 0x00e6 }
            if (r0 >= 0) goto L_0x0039
        L_0x000d:
            java.lang.String r0 = f976u     // Catch:{ all -> 0x00e6 }
            boolean r3 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e6 }
            if (r3 == 0) goto L_0x0037
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e6 }
            r3.<init>()     // Catch:{ all -> 0x00e6 }
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch:{ all -> 0x00e6 }
            b.h.a.l.c r4 = r8.f988l     // Catch:{ all -> 0x00e6 }
            int r4 = r4.f963c     // Catch:{ all -> 0x00e6 }
            r3.append(r4)     // Catch:{ all -> 0x00e6 }
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch:{ all -> 0x00e6 }
            int r4 = r8.f987k     // Catch:{ all -> 0x00e6 }
            r3.append(r4)     // Catch:{ all -> 0x00e6 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00e6 }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00e6 }
        L_0x0037:
            r8.f991o = r2     // Catch:{ all -> 0x00e6 }
        L_0x0039:
            int r0 = r8.f991o     // Catch:{ all -> 0x00e6 }
            r3 = 0
            if (r0 == r2) goto L_0x00c6
            r4 = 2
            if (r0 != r4) goto L_0x0043
            goto L_0x00c6
        L_0x0043:
            r0 = 0
            r8.f991o = r0     // Catch:{ all -> 0x00e6 }
            byte[] r5 = r8.f981e     // Catch:{ all -> 0x00e6 }
            if (r5 != 0) goto L_0x0056
            b.h.a.l.a$a r5 = r8.f979c     // Catch:{ all -> 0x00e6 }
            r6 = 255(0xff, float:3.57E-43)
            b.h.a.m.x.g.b r5 = (p005b.p051h.p052a.p055m.p064x.p069g.C1281b) r5     // Catch:{ all -> 0x00e6 }
            byte[] r5 = r5.mo11113a(r6)     // Catch:{ all -> 0x00e6 }
            r8.f981e = r5     // Catch:{ all -> 0x00e6 }
        L_0x0056:
            b.h.a.l.c r5 = r8.f988l     // Catch:{ all -> 0x00e6 }
            java.util.List<b.h.a.l.b> r5 = r5.f965e     // Catch:{ all -> 0x00e6 }
            int r6 = r8.f987k     // Catch:{ all -> 0x00e6 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00e6 }
            b.h.a.l.b r5 = (p005b.p051h.p052a.p054l.C0958b) r5     // Catch:{ all -> 0x00e6 }
            int r6 = r8.f987k     // Catch:{ all -> 0x00e6 }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x0072
            b.h.a.l.c r7 = r8.f988l     // Catch:{ all -> 0x00e6 }
            java.util.List<b.h.a.l.b> r7 = r7.f965e     // Catch:{ all -> 0x00e6 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x00e6 }
            b.h.a.l.b r6 = (p005b.p051h.p052a.p054l.C0958b) r6     // Catch:{ all -> 0x00e6 }
            goto L_0x0073
        L_0x0072:
            r6 = r3
        L_0x0073:
            int[] r7 = r5.f960k     // Catch:{ all -> 0x00e6 }
            if (r7 == 0) goto L_0x0078
            goto L_0x007c
        L_0x0078:
            b.h.a.l.c r7 = r8.f988l     // Catch:{ all -> 0x00e6 }
            int[] r7 = r7.f961a     // Catch:{ all -> 0x00e6 }
        L_0x007c:
            r8.f977a = r7     // Catch:{ all -> 0x00e6 }
            if (r7 != 0) goto L_0x00a2
            java.lang.String r0 = f976u     // Catch:{ all -> 0x00e6 }
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e6 }
            if (r1 == 0) goto L_0x009e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e6 }
            r1.<init>()     // Catch:{ all -> 0x00e6 }
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch:{ all -> 0x00e6 }
            int r4 = r8.f987k     // Catch:{ all -> 0x00e6 }
            r1.append(r4)     // Catch:{ all -> 0x00e6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e6 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00e6 }
        L_0x009e:
            r8.f991o = r2     // Catch:{ all -> 0x00e6 }
            monitor-exit(r8)
            return r3
        L_0x00a2:
            boolean r1 = r5.f955f     // Catch:{ all -> 0x00e6 }
            if (r1 == 0) goto L_0x00c0
            int[] r1 = r8.f978b     // Catch:{ all -> 0x00e6 }
            int r2 = r7.length     // Catch:{ all -> 0x00e6 }
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch:{ all -> 0x00e6 }
            int[] r1 = r8.f978b     // Catch:{ all -> 0x00e6 }
            r8.f977a = r1     // Catch:{ all -> 0x00e6 }
            int r2 = r5.f957h     // Catch:{ all -> 0x00e6 }
            r1[r2] = r0     // Catch:{ all -> 0x00e6 }
            int r0 = r5.f956g     // Catch:{ all -> 0x00e6 }
            if (r0 != r4) goto L_0x00c0
            int r0 = r8.f987k     // Catch:{ all -> 0x00e6 }
            if (r0 != 0) goto L_0x00c0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00e6 }
            r8.f995s = r0     // Catch:{ all -> 0x00e6 }
        L_0x00c0:
            android.graphics.Bitmap r0 = r8.mo10824j(r5, r6)     // Catch:{ all -> 0x00e6 }
            monitor-exit(r8)
            return r0
        L_0x00c6:
            java.lang.String r0 = f976u     // Catch:{ all -> 0x00e6 }
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e6 }
            if (r1 == 0) goto L_0x00e4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e6 }
            r1.<init>()     // Catch:{ all -> 0x00e6 }
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch:{ all -> 0x00e6 }
            int r2 = r8.f991o     // Catch:{ all -> 0x00e6 }
            r1.append(r2)     // Catch:{ all -> 0x00e6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e6 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00e6 }
        L_0x00e4:
            monitor-exit(r8)
            return r3
        L_0x00e6:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p054l.C0961e.mo10808b():android.graphics.Bitmap");
    }

    /* renamed from: c */
    public void mo10809c() {
        this.f987k = (this.f987k + 1) % this.f988l.f963c;
    }

    public void clear() {
        C1023b bVar;
        C1023b bVar2;
        C1023b bVar3;
        this.f988l = null;
        byte[] bArr = this.f985i;
        if (!(bArr == null || (bVar3 = ((C1281b) this.f979c).f1592b) == null)) {
            bVar3.mo10887d(bArr);
        }
        int[] iArr = this.f986j;
        if (!(iArr == null || (bVar2 = ((C1281b) this.f979c).f1592b) == null)) {
            bVar2.mo10887d(iArr);
        }
        Bitmap bitmap = this.f989m;
        if (bitmap != null) {
            ((C1281b) this.f979c).f1591a.mo10896e(bitmap);
        }
        this.f989m = null;
        this.f980d = null;
        this.f995s = null;
        byte[] bArr2 = this.f981e;
        if (bArr2 != null && (bVar = ((C1281b) this.f979c).f1592b) != null) {
            bVar.mo10887d(bArr2);
        }
    }

    /* renamed from: d */
    public int mo10811d() {
        return this.f988l.f963c;
    }

    /* renamed from: e */
    public int mo10812e() {
        int i;
        C0959c cVar = this.f988l;
        int i2 = cVar.f963c;
        if (i2 <= 0 || (i = this.f987k) < 0) {
            return 0;
        }
        if (i < 0 || i >= i2) {
            return -1;
        }
        return cVar.f965e.get(i).f958i;
    }

    /* renamed from: f */
    public int mo10813f() {
        return (this.f986j.length * 4) + this.f980d.limit() + this.f985i.length;
    }

    @NonNull
    /* renamed from: g */
    public ByteBuffer mo10814g() {
        return this.f980d;
    }

    /* renamed from: h */
    public final Bitmap mo10822h() {
        Boolean bool = this.f995s;
        Bitmap.Config config = (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f996t;
        Bitmap c = ((C1281b) this.f979c).f1591a.mo10894c(this.f994r, this.f993q, config);
        c.setHasAlpha(true);
        return c;
    }

    /* renamed from: i */
    public void mo10823i(@NonNull Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f996t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v40, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r3.f970j == r1.f957h) goto L_0x0047;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r0v24, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo10824j(p005b.p051h.p052a.p054l.C0958b r34, p005b.p051h.p052a.p054l.C0958b r35) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            r2 = r35
            int[] r10 = r0.f986j
            r11 = 0
            if (r2 != 0) goto L_0x001e
            android.graphics.Bitmap r3 = r0.f989m
            if (r3 == 0) goto L_0x0018
            b.h.a.l.a$a r4 = r0.f979c
            b.h.a.m.x.g.b r4 = (p005b.p051h.p052a.p055m.p064x.p069g.C1281b) r4
            b.h.a.m.v.c0.d r4 = r4.f1591a
            r4.mo10896e(r3)
        L_0x0018:
            r3 = 0
            r0.f989m = r3
            java.util.Arrays.fill(r10, r11)
        L_0x001e:
            r3 = 3
            if (r2 == 0) goto L_0x002c
            int r4 = r2.f956g
            if (r4 != r3) goto L_0x002c
            android.graphics.Bitmap r4 = r0.f989m
            if (r4 != 0) goto L_0x002c
            java.util.Arrays.fill(r10, r11)
        L_0x002c:
            r4 = 2
            if (r2 == 0) goto L_0x007e
            int r5 = r2.f956g
            if (r5 <= 0) goto L_0x007e
            if (r5 != r4) goto L_0x006c
            boolean r3 = r1.f955f
            if (r3 != 0) goto L_0x0047
            b.h.a.l.c r3 = r0.f988l
            int r4 = r3.f971k
            int[] r5 = r1.f960k
            if (r5 == 0) goto L_0x0048
            int r3 = r3.f970j
            int r5 = r1.f957h
            if (r3 != r5) goto L_0x0048
        L_0x0047:
            r4 = r11
        L_0x0048:
            int r3 = r2.f953d
            int r5 = r0.f992p
            int r3 = r3 / r5
            int r6 = r2.f951b
            int r6 = r6 / r5
            int r7 = r2.f952c
            int r7 = r7 / r5
            int r2 = r2.f950a
            int r2 = r2 / r5
            int r5 = r0.f994r
            int r6 = r6 * r5
            int r6 = r6 + r2
            int r3 = r3 * r5
            int r3 = r3 + r6
        L_0x005c:
            if (r6 >= r3) goto L_0x007e
            int r2 = r6 + r7
            r5 = r6
        L_0x0061:
            if (r5 >= r2) goto L_0x0068
            r10[r5] = r4
            int r5 = r5 + 1
            goto L_0x0061
        L_0x0068:
            int r2 = r0.f994r
            int r6 = r6 + r2
            goto L_0x005c
        L_0x006c:
            if (r5 != r3) goto L_0x007e
            android.graphics.Bitmap r2 = r0.f989m
            if (r2 == 0) goto L_0x007e
            r4 = 0
            int r8 = r0.f994r
            r6 = 0
            r7 = 0
            int r9 = r0.f993q
            r3 = r10
            r5 = r8
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)
        L_0x007e:
            java.nio.ByteBuffer r2 = r0.f980d
            int r3 = r1.f959j
            r2.position(r3)
            int r2 = r1.f952c
            int r3 = r1.f953d
            int r2 = r2 * r3
            byte[] r3 = r0.f985i
            if (r3 == 0) goto L_0x0091
            int r3 = r3.length
            if (r3 >= r2) goto L_0x009b
        L_0x0091:
            b.h.a.l.a$a r3 = r0.f979c
            b.h.a.m.x.g.b r3 = (p005b.p051h.p052a.p055m.p064x.p069g.C1281b) r3
            byte[] r3 = r3.mo11113a(r2)
            r0.f985i = r3
        L_0x009b:
            byte[] r3 = r0.f985i
            short[] r4 = r0.f982f
            r5 = 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x00a7
            short[] r4 = new short[r5]
            r0.f982f = r4
        L_0x00a7:
            short[] r4 = r0.f982f
            byte[] r6 = r0.f983g
            if (r6 != 0) goto L_0x00b1
            byte[] r5 = new byte[r5]
            r0.f983g = r5
        L_0x00b1:
            byte[] r5 = r0.f983g
            byte[] r6 = r0.f984h
            if (r6 != 0) goto L_0x00bd
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f984h = r6
        L_0x00bd:
            byte[] r6 = r0.f984h
            java.nio.ByteBuffer r7 = r0.f980d
            byte r7 = r7.get()
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 1
            int r9 = r8 << r7
            int r12 = r9 + 1
            int r13 = r9 + 2
            int r7 = r7 + r8
            int r8 = r8 << r7
            int r8 = r8 + -1
            r14 = r11
        L_0x00d3:
            if (r14 >= r9) goto L_0x00dd
            r4[r14] = r11
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x00d3
        L_0x00dd:
            byte[] r14 = r0.f981e
            r15 = -1
            r35 = r7
            r25 = r35
            r23 = r8
            r26 = r23
            r7 = r11
            r16 = r7
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r24 = r13
            r22 = r15
            r8 = r0
            r15 = r21
        L_0x00fc:
            r27 = 8
            if (r11 >= r2) goto L_0x0200
            if (r16 != 0) goto L_0x0136
            java.nio.ByteBuffer r15 = r8.f980d
            byte r15 = r15.get()
            r15 = r15 & 255(0xff, float:3.57E-43)
            if (r15 > 0) goto L_0x0113
            r30 = r10
            r28 = r11
            r29 = r13
            goto L_0x0129
        L_0x0113:
            r28 = r11
            java.nio.ByteBuffer r11 = r8.f980d
            r29 = r13
            byte[] r13 = r8.f981e
            r30 = r10
            int r10 = r11.remaining()
            int r10 = java.lang.Math.min(r15, r10)
            r0 = 0
            r11.get(r13, r0, r10)
        L_0x0129:
            if (r15 > 0) goto L_0x0131
            r0 = 3
            r8.f991o = r0
            r15 = 0
            goto L_0x0202
        L_0x0131:
            r17 = 0
            r16 = r15
            goto L_0x013c
        L_0x0136:
            r30 = r10
            r28 = r11
            r29 = r13
        L_0x013c:
            byte r0 = r14[r17]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r18
            int r19 = r19 + r0
            int r18 = r18 + 8
            int r17 = r17 + 1
            int r16 = r16 + -1
            r0 = r18
            r10 = r20
            r13 = r22
            r15 = r24
            r11 = r28
            r18 = r8
            r8 = r25
        L_0x0158:
            if (r0 < r8) goto L_0x01e0
            r20 = r14
            r14 = r19 & r26
            int r19 = r19 >> r8
            int r0 = r0 - r8
            if (r14 != r9) goto L_0x0175
            r8 = -1
            r22 = r6
            r13 = r8
            r26 = r23
            r15 = r29
            r8 = r35
            r32 = r18
            r18 = r0
            r0 = r32
            goto L_0x01d4
        L_0x0175:
            if (r14 != r12) goto L_0x017b
            r22 = r6
            goto L_0x01e6
        L_0x017b:
            r18 = r0
            r0 = -1
            if (r13 != r0) goto L_0x0191
            byte r0 = r5[r14]
            r3[r7] = r0
            int r7 = r7 + 1
            int r11 = r11 + 1
            r10 = r14
            r13 = r10
            r0 = r18
            r14 = r20
            r18 = r33
            goto L_0x0158
        L_0x0191:
            if (r14 < r15) goto L_0x019a
            byte r0 = (byte) r10
            r6[r21] = r0
            int r21 = r21 + 1
            r0 = r13
            goto L_0x019b
        L_0x019a:
            r0 = r14
        L_0x019b:
            if (r0 < r9) goto L_0x01a6
            byte r10 = r5[r0]
            r6[r21] = r10
            int r21 = r21 + 1
            short r0 = r4[r0]
            goto L_0x019b
        L_0x01a6:
            byte r0 = r5[r0]
            r10 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r10
            r3[r7] = r0
        L_0x01ad:
            int r7 = r7 + 1
            int r11 = r11 + 1
            if (r21 <= 0) goto L_0x01ba
            int r21 = r21 + -1
            byte r22 = r6[r21]
            r3[r7] = r22
            goto L_0x01ad
        L_0x01ba:
            r22 = r6
            r6 = 4096(0x1000, float:5.74E-42)
            if (r15 >= r6) goto L_0x01d1
            short r13 = (short) r13
            r4[r15] = r13
            r5[r15] = r0
            int r15 = r15 + 1
            r0 = r15 & r26
            if (r0 != 0) goto L_0x01d1
            if (r15 >= r6) goto L_0x01d1
            int r8 = r8 + 1
            int r26 = r26 + r15
        L_0x01d1:
            r0 = r33
            r13 = r14
        L_0x01d4:
            r14 = r20
            r6 = r22
            r32 = r18
            r18 = r0
            r0 = r32
            goto L_0x0158
        L_0x01e0:
            r22 = r6
            r20 = r14
            r18 = r33
        L_0x01e6:
            r6 = 0
            r25 = r8
            r24 = r15
            r8 = r18
            r14 = r20
            r18 = r0
            r15 = r6
            r20 = r10
            r6 = r22
            r10 = r30
            r0 = r33
            r22 = r13
            r13 = r29
            goto L_0x00fc
        L_0x0200:
            r30 = r10
        L_0x0202:
            java.util.Arrays.fill(r3, r7, r2, r15)
            boolean r0 = r1.f954e
            if (r0 != 0) goto L_0x027a
            r0 = r33
            int r2 = r0.f992p
            r3 = 1
            if (r2 == r3) goto L_0x0212
            goto L_0x027c
        L_0x0212:
            int[] r2 = r0.f986j
            int r3 = r1.f953d
            int r4 = r1.f951b
            int r5 = r1.f952c
            int r6 = r1.f950a
            int r7 = r0.f987k
            if (r7 != 0) goto L_0x0222
            r7 = 1
            goto L_0x0223
        L_0x0222:
            r7 = r15
        L_0x0223:
            int r8 = r0.f994r
            byte[] r9 = r0.f985i
            int[] r10 = r0.f977a
            r11 = -1
        L_0x022a:
            if (r15 >= r3) goto L_0x025c
            int r12 = r15 + r4
            int r12 = r12 * r8
            int r13 = r12 + r6
            int r14 = r13 + r5
            int r12 = r12 + r8
            if (r12 >= r14) goto L_0x0237
            r14 = r12
        L_0x0237:
            int r12 = r1.f952c
            int r12 = r12 * r15
        L_0x023a:
            r16 = r3
            if (r13 >= r14) goto L_0x0257
            byte r3 = r9[r12]
            r17 = r4
            r4 = r3 & 255(0xff, float:3.57E-43)
            if (r4 == r11) goto L_0x024e
            r4 = r10[r4]
            if (r4 == 0) goto L_0x024d
            r2[r13] = r4
            goto L_0x024e
        L_0x024d:
            r11 = r3
        L_0x024e:
            int r12 = r12 + 1
            int r13 = r13 + 1
            r3 = r16
            r4 = r17
            goto L_0x023a
        L_0x0257:
            r17 = r4
            int r15 = r15 + 1
            goto L_0x022a
        L_0x025c:
            java.lang.Boolean r2 = r0.f995s
            if (r2 == 0) goto L_0x0266
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x026f
        L_0x0266:
            java.lang.Boolean r2 = r0.f995s
            if (r2 != 0) goto L_0x0271
            if (r7 == 0) goto L_0x0271
            r2 = -1
            if (r11 == r2) goto L_0x0271
        L_0x026f:
            r2 = 1
            goto L_0x0272
        L_0x0271:
            r2 = 0
        L_0x0272:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.f995s = r2
            goto L_0x03f4
        L_0x027a:
            r0 = r33
        L_0x027c:
            int[] r2 = r0.f986j
            int r3 = r1.f953d
            int r4 = r0.f992p
            int r3 = r3 / r4
            int r5 = r1.f951b
            int r5 = r5 / r4
            int r6 = r1.f952c
            int r6 = r6 / r4
            int r7 = r1.f950a
            int r7 = r7 / r4
            int r8 = r0.f987k
            if (r8 != 0) goto L_0x0292
            r8 = 1
            goto L_0x0293
        L_0x0292:
            r8 = 0
        L_0x0293:
            int r9 = r0.f994r
            int r10 = r0.f993q
            byte[] r11 = r0.f985i
            int[] r12 = r0.f977a
            java.lang.Boolean r13 = r0.f995s
            r14 = 0
            r15 = 0
            r16 = 1
        L_0x02a1:
            r35 = r13
            if (r14 >= r3) goto L_0x03e2
            boolean r13 = r1.f954e
            if (r13 == 0) goto L_0x02ca
            if (r15 < r3) goto L_0x02c5
            int r13 = r16 + 1
            r17 = r3
            r3 = 2
            if (r13 == r3) goto L_0x02c1
            r3 = 3
            if (r13 == r3) goto L_0x02bd
            r3 = 4
            if (r13 == r3) goto L_0x02b9
            goto L_0x02c2
        L_0x02b9:
            r15 = 1
            r27 = 2
            goto L_0x02c2
        L_0x02bd:
            r27 = 4
            r15 = 2
            goto L_0x02c2
        L_0x02c1:
            r15 = 4
        L_0x02c2:
            r16 = r13
            goto L_0x02c7
        L_0x02c5:
            r17 = r3
        L_0x02c7:
            int r3 = r15 + r27
            goto L_0x02ce
        L_0x02ca:
            r17 = r3
            r3 = r15
            r15 = r14
        L_0x02ce:
            int r15 = r15 + r5
            r13 = 1
            if (r4 != r13) goto L_0x02d4
            r13 = 1
            goto L_0x02d5
        L_0x02d4:
            r13 = 0
        L_0x02d5:
            if (r15 >= r10) goto L_0x03c2
            int r15 = r15 * r9
            r18 = r3
            int r3 = r15 + r7
            r19 = r5
            int r5 = r3 + r6
            int r15 = r15 + r9
            if (r15 >= r5) goto L_0x02e4
            r5 = r15
        L_0x02e4:
            int r15 = r14 * r4
            r20 = r6
            int r6 = r1.f952c
            int r15 = r15 * r6
            if (r13 == 0) goto L_0x0307
            r13 = r35
        L_0x02ef:
            if (r3 >= r5) goto L_0x03bb
            byte r6 = r11[r15]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r12[r6]
            if (r6 == 0) goto L_0x02fc
            r2[r3] = r6
            goto L_0x0303
        L_0x02fc:
            if (r8 == 0) goto L_0x0303
            if (r13 != 0) goto L_0x0303
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r13 = r6
        L_0x0303:
            int r15 = r15 + r4
            int r3 = r3 + 1
            goto L_0x02ef
        L_0x0307:
            int r6 = p005b.p035e.p036a.p037a.C0843a.m462w(r5, r3, r4, r15)
            r13 = r35
        L_0x030d:
            if (r3 >= r5) goto L_0x03bb
            r21 = r5
            int r5 = r1.f952c
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = r7
            r29 = r9
            r7 = r15
        L_0x0322:
            int r9 = r0.f992p
            int r9 = r9 + r15
            if (r7 >= r9) goto L_0x0357
            byte[] r9 = r0.f985i
            r31 = r10
            int r10 = r9.length
            if (r7 >= r10) goto L_0x0359
            if (r7 >= r6) goto L_0x0359
            byte r9 = r9[r7]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int[] r10 = r0.f977a
            r9 = r10[r9]
            if (r9 == 0) goto L_0x0352
            int r10 = r9 >> 24
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r22 = r22 + r10
            int r10 = r9 >> 16
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r23 = r23 + r10
            int r10 = r9 >> 8
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r10
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r26 = r26 + 1
        L_0x0352:
            int r7 = r7 + 1
            r10 = r31
            goto L_0x0322
        L_0x0357:
            r31 = r10
        L_0x0359:
            int r5 = r5 + r15
            r7 = r5
        L_0x035b:
            int r9 = r0.f992p
            int r9 = r9 + r5
            if (r7 >= r9) goto L_0x038c
            byte[] r9 = r0.f985i
            int r10 = r9.length
            if (r7 >= r10) goto L_0x038c
            if (r7 >= r6) goto L_0x038c
            byte r9 = r9[r7]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int[] r10 = r0.f977a
            r9 = r10[r9]
            if (r9 == 0) goto L_0x0389
            int r10 = r9 >> 24
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r22 = r22 + r10
            int r10 = r9 >> 16
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r23 = r23 + r10
            int r10 = r9 >> 8
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r10
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r26 = r26 + 1
        L_0x0389:
            int r7 = r7 + 1
            goto L_0x035b
        L_0x038c:
            if (r26 != 0) goto L_0x0390
            r5 = 0
            goto L_0x03a2
        L_0x0390:
            int r22 = r22 / r26
            int r5 = r22 << 24
            int r23 = r23 / r26
            int r7 = r23 << 16
            r5 = r5 | r7
            int r24 = r24 / r26
            int r7 = r24 << 8
            r5 = r5 | r7
            int r25 = r25 / r26
            r5 = r5 | r25
        L_0x03a2:
            if (r5 == 0) goto L_0x03a7
            r2[r3] = r5
            goto L_0x03ae
        L_0x03a7:
            if (r8 == 0) goto L_0x03ae
            if (r13 != 0) goto L_0x03ae
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r13 = r5
        L_0x03ae:
            int r15 = r15 + r4
            int r3 = r3 + 1
            r5 = r21
            r7 = r28
            r9 = r29
            r10 = r31
            goto L_0x030d
        L_0x03bb:
            r28 = r7
            r29 = r9
            r31 = r10
            goto L_0x03d0
        L_0x03c2:
            r18 = r3
            r19 = r5
            r20 = r6
            r28 = r7
            r29 = r9
            r31 = r10
            r13 = r35
        L_0x03d0:
            int r14 = r14 + 1
            r3 = r17
            r15 = r18
            r5 = r19
            r6 = r20
            r7 = r28
            r9 = r29
            r10 = r31
            goto L_0x02a1
        L_0x03e2:
            java.lang.Boolean r2 = r0.f995s
            if (r2 != 0) goto L_0x03f4
            if (r35 != 0) goto L_0x03ea
            r2 = 0
            goto L_0x03ee
        L_0x03ea:
            boolean r2 = r35.booleanValue()
        L_0x03ee:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.f995s = r2
        L_0x03f4:
            boolean r2 = r0.f990n
            if (r2 == 0) goto L_0x0418
            int r1 = r1.f956g
            if (r1 == 0) goto L_0x03ff
            r2 = 1
            if (r1 != r2) goto L_0x0418
        L_0x03ff:
            android.graphics.Bitmap r1 = r0.f989m
            if (r1 != 0) goto L_0x0409
            android.graphics.Bitmap r1 = r33.mo10822h()
            r0.f989m = r1
        L_0x0409:
            android.graphics.Bitmap r1 = r0.f989m
            r3 = 0
            int r7 = r0.f994r
            r5 = 0
            r6 = 0
            int r8 = r0.f993q
            r2 = r30
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
        L_0x0418:
            android.graphics.Bitmap r9 = r33.mo10822h()
            r3 = 0
            int r7 = r0.f994r
            r5 = 0
            r6 = 0
            int r8 = r0.f993q
            r1 = r9
            r2 = r30
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p054l.C0961e.mo10824j(b.h.a.l.b, b.h.a.l.b):android.graphics.Bitmap");
    }
}
