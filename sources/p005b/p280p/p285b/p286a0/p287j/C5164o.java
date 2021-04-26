package p005b.p280p.p285b.p286a0.p287j;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p285b.p286a0.p287j.C5161n;
import p435n.C8030a0;
import p435n.C8034b0;
import p435n.C8040e;
import p435n.C8042f;
import p435n.C8043g;
import p435n.C8044h;

/* renamed from: b.p.b.a0.j.o */
public final class C5164o implements C5181v {

    /* renamed from: a */
    public static final Logger f10086a = Logger.getLogger(C5166b.class.getName());

    /* renamed from: b */
    public static final C8044h f10087b = C8044h.m14839k("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b.p.b.a0.j.o$a */
    public static final class C5165a implements C8030a0 {

        /* renamed from: g */
        public final C8043g f10088g;

        /* renamed from: h */
        public int f10089h;

        /* renamed from: i */
        public byte f10090i;

        /* renamed from: j */
        public int f10091j;

        /* renamed from: k */
        public int f10092k;

        /* renamed from: l */
        public short f10093l;

        public C5165a(C8043g gVar) {
            this.f10088g = gVar;
        }

        /* renamed from: T */
        public long mo17031T(C8040e eVar, long j) {
            int i;
            int readInt;
            do {
                int i2 = this.f10092k;
                if (i2 == 0) {
                    this.f10088g.skip((long) this.f10093l);
                    this.f10093l = 0;
                    if ((this.f10090i & 4) != 0) {
                        return -1;
                    }
                    i = this.f10091j;
                    int d = C5164o.m9540d(this.f10088g);
                    this.f10092k = d;
                    this.f10089h = d;
                    byte readByte = (byte) (this.f10088g.readByte() & ExifInterface.MARKER);
                    this.f10090i = (byte) (this.f10088g.readByte() & ExifInterface.MARKER);
                    Logger logger = C5164o.f10086a;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(C5166b.m9547a(true, this.f10091j, this.f10089h, readByte, this.f10090i));
                    }
                    readInt = this.f10088g.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                    this.f10091j = readInt;
                    if (readByte != 9) {
                        C5164o.m9539c("%s != TYPE_CONTINUATION", new Object[]{Byte.valueOf(readByte)});
                        throw null;
                    }
                } else {
                    long T = this.f10088g.mo17031T(eVar, Math.min(j, (long) i2));
                    if (T == -1) {
                        return -1;
                    }
                    this.f10092k = (int) (((long) this.f10092k) - T);
                    return T;
                }
            } while (readInt == i);
            C5164o.m9539c("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        public void close() {
        }

        /* renamed from: f */
        public C8034b0 mo17035f() {
            return this.f10088g.mo17035f();
        }
    }

    /* renamed from: b.p.b.a0.j.o$b */
    public static final class C5166b {

        /* renamed from: a */
        public static final String[] f10094a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b */
        public static final String[] f10095b = new String[64];

        /* renamed from: c */
        public static final String[] f10096c = new String[256];

        static {
            int i = 0;
            int i2 = 0;
            while (true) {
                String[] strArr = f10096c;
                if (i2 >= strArr.length) {
                    break;
                }
                strArr[i2] = String.format("%8s", new Object[]{Integer.toBinaryString(i2)}).replace(' ', '0');
                i2++;
            }
            String[] strArr2 = f10095b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            for (int i3 = 0; i3 < 1; i3++) {
                int i4 = iArr[i3];
                String[] strArr3 = f10095b;
                strArr3[i4 | 8] = C0843a.m455p(new StringBuilder(), strArr3[i4], "|PADDED");
            }
            String[] strArr4 = f10095b;
            strArr4[4] = "END_HEADERS";
            strArr4[32] = "PRIORITY";
            strArr4[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i5 = 0; i5 < 3; i5++) {
                int i6 = iArr2[i5];
                for (int i7 = 0; i7 < 1; i7++) {
                    int i8 = iArr[i7];
                    String[] strArr5 = f10095b;
                    int i9 = i8 | i6;
                    strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                    StringBuilder sb = new StringBuilder();
                    sb.append(strArr5[i8]);
                    sb.append('|');
                    strArr5[i9 | 8] = C0843a.m455p(sb, strArr5[i6], "|PADDED");
                }
            }
            while (true) {
                String[] strArr6 = f10095b;
                if (i < strArr6.length) {
                    if (strArr6[i] == null) {
                        strArr6[i] = f10096c[i];
                    }
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        public static String m9547a(boolean z, int i, int i2, byte b, byte b2) {
            String str;
            String str2;
            String str3;
            String[] strArr = f10094a;
            String format = b < strArr.length ? strArr[b] : String.format("0x%02x", new Object[]{Byte.valueOf(b)});
            if (b2 == 0) {
                str = "";
            } else {
                if (!(b == 2 || b == 3)) {
                    if (b == 4 || b == 6) {
                        str = b2 == 1 ? "ACK" : f10096c[b2];
                    } else if (!(b == 7 || b == 8)) {
                        String[] strArr2 = f10095b;
                        String str4 = b2 < strArr2.length ? strArr2[b2] : f10096c[b2];
                        if (b == 5 && (b2 & 4) != 0) {
                            str2 = "HEADERS";
                            str3 = "PUSH_PROMISE";
                        } else if (b != 0 || (b2 & 32) == 0) {
                            str = str4;
                        } else {
                            str2 = "PRIORITY";
                            str3 = "COMPRESSED";
                        }
                        str = str4.replace(str2, str3);
                    }
                }
                str = f10096c[b2];
            }
            Object[] objArr = new Object[5];
            objArr[0] = z ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = format;
            objArr[4] = str;
            return String.format("%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    /* renamed from: b.p.b.a0.j.o$c */
    public static final class C5167c implements C5136b {

        /* renamed from: g */
        public final C8043g f10097g;

        /* renamed from: h */
        public final C5165a f10098h;

        /* renamed from: i */
        public final boolean f10099i;

        /* renamed from: j */
        public final C5161n.C5162a f10100j;

        public C5167c(C8043g gVar, int i, boolean z) {
            this.f10097g = gVar;
            this.f10099i = z;
            C5165a aVar = new C5165a(gVar);
            this.f10098h = aVar;
            this.f10100j = new C5161n.C5162a(i, aVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: short} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: short} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v45, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v58, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: boolean} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo16988b0(p005b.p280p.p285b.p286a0.p287j.C5136b.C5137a r21) {
            /*
                r20 = this;
                r1 = r20
                r0 = 0
                n.g r2 = r1.f10097g     // Catch:{ IOException -> 0x0336 }
                r3 = 9
                r2.mo25904d0(r3)     // Catch:{ IOException -> 0x0336 }
                n.g r2 = r1.f10097g
                int r2 = p005b.p280p.p285b.p286a0.p287j.C5164o.m9540d(r2)
                r3 = 1
                r4 = 0
                if (r2 < 0) goto L_0x0328
                r5 = 16384(0x4000, float:2.2959E-41)
                if (r2 > r5) goto L_0x0328
                n.g r6 = r1.f10097g
                byte r6 = r6.readByte()
                r6 = r6 & 255(0xff, float:3.57E-43)
                byte r6 = (byte) r6
                n.g r7 = r1.f10097g
                byte r7 = r7.readByte()
                r7 = r7 & 255(0xff, float:3.57E-43)
                byte r7 = (byte) r7
                n.g r8 = r1.f10097g
                int r8 = r8.readInt()
                r9 = 2147483647(0x7fffffff, float:NaN)
                r13 = r8 & r9
                java.util.logging.Logger r8 = p005b.p280p.p285b.p286a0.p287j.C5164o.f10086a
                java.util.logging.Level r10 = java.util.logging.Level.FINE
                boolean r10 = r8.isLoggable(r10)
                if (r10 == 0) goto L_0x0046
                java.lang.String r10 = p005b.p280p.p285b.p286a0.p287j.C5164o.C5166b.m9547a(r3, r13, r2, r6, r7)
                r8.fine(r10)
            L_0x0046:
                r8 = 2
                r10 = 4
                r11 = 8
                switch(r6) {
                    case 0: goto L_0x02ee;
                    case 1: goto L_0x02a8;
                    case 2: goto L_0x027d;
                    case 3: goto L_0x0240;
                    case 4: goto L_0x0181;
                    case 5: goto L_0x0110;
                    case 6: goto L_0x00dc;
                    case 7: goto L_0x008d;
                    case 8: goto L_0x0055;
                    default: goto L_0x004d;
                }
            L_0x004d:
                n.g r0 = r1.f10097g
                long r4 = (long) r2
                r0.skip(r4)
                goto L_0x0327
            L_0x0055:
                if (r2 != r10) goto L_0x007f
                n.g r2 = r1.f10097g
                int r2 = r2.readInt()
                long r5 = (long) r2
                r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
                long r5 = r5 & r7
                r7 = 0
                int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r2 == 0) goto L_0x0071
                r0 = r21
                b.p.b.a0.j.d$e r0 = (p005b.p280p.p285b.p286a0.p287j.C5139d.C5145e) r0
                r0.mo17017h(r13, r5)
                goto L_0x0327
            L_0x0071:
                java.lang.Object[] r2 = new java.lang.Object[r3]
                java.lang.Long r3 = java.lang.Long.valueOf(r5)
                r2[r0] = r3
                java.lang.String r0 = "windowSizeIncrement was 0"
                p005b.p280p.p285b.p286a0.p287j.C5164o.m9539c(r0, r2)
                throw r4
            L_0x007f:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r0] = r2
                java.lang.String r0 = "TYPE_WINDOW_UPDATE length !=4: %s"
                p005b.p280p.p285b.p286a0.p287j.C5164o.m9539c(r0, r3)
                throw r4
            L_0x008d:
                if (r2 < r11) goto L_0x00ce
                if (r13 != 0) goto L_0x00c6
                n.g r5 = r1.f10097g
                int r5 = r5.readInt()
                n.g r6 = r1.f10097g
                int r6 = r6.readInt()
                int r2 = r2 - r11
                b.p.b.a0.j.a r7 = p005b.p280p.p285b.p286a0.p287j.C5135a.m9468d(r6)
                if (r7 == 0) goto L_0x00b8
                n.h r0 = p435n.C8044h.f16142j
                if (r2 <= 0) goto L_0x00af
                n.g r0 = r1.f10097g
                long r8 = (long) r2
                n.h r0 = r0.mo25922p(r8)
            L_0x00af:
                r2 = r21
                b.p.b.a0.j.d$e r2 = (p005b.p280p.p285b.p286a0.p287j.C5139d.C5145e) r2
                r2.mo17012c(r5, r7, r0)
                goto L_0x0327
            L_0x00b8:
                java.lang.Object[] r2 = new java.lang.Object[r3]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
                r2[r0] = r3
                java.lang.String r0 = "TYPE_GOAWAY unexpected error code: %d"
                p005b.p280p.p285b.p286a0.p287j.C5164o.m9539c(r0, r2)
                throw r4
            L_0x00c6:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "TYPE_GOAWAY streamId != 0"
                p005b.p280p.p285b.p286a0.p287j.C5164o.m9539c(r2, r0)
                throw r4
            L_0x00ce:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r0] = r2
                java.lang.String r0 = "TYPE_GOAWAY length < 8: %s"
                p005b.p280p.p285b.p286a0.p287j.C5164o.m9539c(r0, r3)
                throw r4
            L_0x00dc:
                if (r2 != r11) goto L_0x0102
                if (r13 != 0) goto L_0x00fa
                n.g r2 = r1.f10097g
                int r2 = r2.readInt()
                n.g r4 = r1.f10097g
                int r4 = r4.readInt()
                r5 = r7 & 1
                if (r5 == 0) goto L_0x00f1
                r0 = r3
            L_0x00f1:
                r5 = r21
                b.p.b.a0.j.d$e r5 = (p005b.p280p.p285b.p286a0.p287j.C5139d.C5145e) r5
                r5.mo17014e(r0, r2, r4)
                goto L_0x0327
            L_0x00fa:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "TYPE_PING streamId != 0"
                p005b.p280p.p285b.p286a0.p287j.C5164o.m9539c(r2, r0)
                throw r4
            L_0x0102:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r0] = r2
                java.lang.String r0 = "TYPE_PING length != 8: %s"
                p005b.p280p.p285b.p286a0.p287j.C5164o.m9539c(r0, r3)
                throw r4
            L_0x0110:
                if (r13 == 0) goto L_0x0179
                r4 = r7 & 8
                if (r4 == 0) goto L_0x0120
                n.g r4 = r1.f10097g
                byte r4 = r4.readByte()
                r4 = r4 & 255(0xff, float:3.57E-43)
                short r4 = (short) r4
                goto L_0x0121
            L_0x0120:
                r4 = r0
            L_0x0121:
                n.g r5 = r1.f10097g
                int r5 = r5.readInt()
                r5 = r5 & r9
                int r2 = r2 + -4
                int r2 = p005b.p280p.p285b.p286a0.p287j.C5164o.m9541e(r2, r7, r4)
                java.util.List r19 = r1.mo17055d(r2, r4, r7, r13)
                r2 = r21
                b.p.b.a0.j.d$e r2 = (p005b.p280p.p285b.p286a0.p287j.C5139d.C5145e) r2
                b.p.b.a0.j.d r15 = p005b.p280p.p285b.p286a0.p287j.C5139d.this
                monitor-enter(r15)
                java.util.Set<java.lang.Integer> r2 = r15.f9998z     // Catch:{ all -> 0x0176 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0176 }
                boolean r2 = r2.contains(r4)     // Catch:{ all -> 0x0176 }
                if (r2 == 0) goto L_0x014d
                b.p.b.a0.j.a r0 = p005b.p280p.p285b.p286a0.p287j.C5135a.PROTOCOL_ERROR     // Catch:{ all -> 0x0176 }
                r15.mo17004S(r5, r0)     // Catch:{ all -> 0x0176 }
                monitor-exit(r15)     // Catch:{ all -> 0x0176 }
                goto L_0x0327
            L_0x014d:
                java.util.Set<java.lang.Integer> r2 = r15.f9998z     // Catch:{ all -> 0x0176 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0176 }
                r2.add(r4)     // Catch:{ all -> 0x0176 }
                monitor-exit(r15)     // Catch:{ all -> 0x0176 }
                java.util.concurrent.ExecutorService r2 = r15.f9987o
                b.p.b.a0.j.f r4 = new b.p.b.a0.j.f
                java.lang.String r16 = "OkHttp %s Push Request[%s]"
                java.lang.Object[] r6 = new java.lang.Object[r8]
                java.lang.String r7 = r15.f9983k
                r6[r0] = r7
                java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                r6[r3] = r0
                r14 = r4
                r17 = r6
                r18 = r5
                r14.<init>(r15, r16, r17, r18, r19)
                r2.execute(r4)
                goto L_0x0327
            L_0x0176:
                r0 = move-exception
                monitor-exit(r15)     // Catch:{ all -> 0x0176 }
                throw r0
            L_0x0179:
                java.lang.String r2 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
                java.lang.Object[] r0 = new java.lang.Object[r0]
                p005b.p280p.p285b.p286a0.p287j.C5164o.m9539c(r2, r0)
                throw r4
            L_0x0181:
                if (r13 != 0) goto L_0x0238
                r6 = r7 & 1
                if (r6 == 0) goto L_0x0197
                if (r2 != 0) goto L_0x018f
                r0 = r21
                b.p.b.a0.j.d$e r0 = (p005b.p280p.p285b.p286a0.p287j.C5139d.C5145e) r0
                goto L_0x0327
            L_0x018f:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "FRAME_SIZE_ERROR ack frame should be empty!"
                p005b.p280p.p285b.p286a0.p287j.C5164o.m9539c(r2, r0)
                throw r4
            L_0x0197:
                int r6 = r2 % 6
                if (r6 != 0) goto L_0x022a
                b.p.b.a0.j.t r6 = new b.p.b.a0.j.t
                r6.<init>()
                r7 = r0
            L_0x01a1:
                if (r7 >= r2) goto L_0x01f8
                n.g r9 = r1.f10097g
                short r9 = r9.readShort()
                n.g r11 = r1.f10097g
                int r11 = r11.readInt()
                switch(r9) {
                    case 1: goto L_0x01f1;
                    case 2: goto L_0x01e4;
                    case 3: goto L_0x01e2;
                    case 4: goto L_0x01d6;
                    case 5: goto L_0x01c0;
                    case 6: goto L_0x01f1;
                    default: goto L_0x01b2;
                }
            L_0x01b2:
                java.lang.Object[] r2 = new java.lang.Object[r3]
                java.lang.Short r3 = java.lang.Short.valueOf(r9)
                r2[r0] = r3
                java.lang.String r0 = "PROTOCOL_ERROR invalid settings id: %s"
                p005b.p280p.p285b.p286a0.p287j.C5164o.m9539c(r0, r2)
                goto L_0x01f7
            L_0x01c0:
                if (r11 < r5) goto L_0x01c8
                r12 = 16777215(0xffffff, float:2.3509886E-38)
                if (r11 > r12) goto L_0x01c8
                goto L_0x01f1
            L_0x01c8:
                java.lang.Object[] r2 = new java.lang.Object[r3]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
                r2[r0] = r3
                java.lang.String r0 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
                p005b.p280p.p285b.p286a0.p287j.C5164o.m9539c(r0, r2)
                throw r4
            L_0x01d6:
                r9 = 7
                if (r11 < 0) goto L_0x01da
                goto L_0x01f1
            L_0x01da:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
                p005b.p280p.p285b.p286a0.p287j.C5164o.m9539c(r2, r0)
                throw r4
            L_0x01e2:
                r9 = r10
                goto L_0x01f1
            L_0x01e4:
                if (r11 == 0) goto L_0x01f1
                if (r11 != r3) goto L_0x01e9
                goto L_0x01f1
            L_0x01e9:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
                p005b.p280p.p285b.p286a0.p287j.C5164o.m9539c(r2, r0)
                throw r4
            L_0x01f1:
                r6.mo17065d(r9, r0, r11)
                int r7 = r7 + 6
                goto L_0x01a1
            L_0x01f7:
                throw r4
            L_0x01f8:
                r2 = r21
                b.p.b.a0.j.d$e r2 = (p005b.p280p.p285b.p286a0.p287j.C5139d.C5145e) r2
                r2.mo17016g(r0, r6)
                int r0 = r6.f10120a
                r0 = r0 & r8
                r2 = -1
                if (r0 == 0) goto L_0x020a
                int[] r4 = r6.f10123d
                r4 = r4[r3]
                goto L_0x020b
            L_0x020a:
                r4 = r2
            L_0x020b:
                if (r4 < 0) goto L_0x0327
                b.p.b.a0.j.n$a r4 = r1.f10100j
                if (r0 == 0) goto L_0x0215
                int[] r0 = r6.f10123d
                r2 = r0[r3]
            L_0x0215:
                r4.f10079c = r2
                r4.f10080d = r2
                int r0 = r4.f10084h
                if (r2 >= r0) goto L_0x0327
                if (r2 != 0) goto L_0x0224
                r4.mo17042a()
                goto L_0x0327
            L_0x0224:
                int r0 = r0 - r2
                r4.mo17044c(r0)
                goto L_0x0327
            L_0x022a:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r0] = r2
                java.lang.String r0 = "TYPE_SETTINGS length %% 6 != 0: %s"
                p005b.p280p.p285b.p286a0.p287j.C5164o.m9539c(r0, r3)
                throw r4
            L_0x0238:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "TYPE_SETTINGS streamId != 0"
                p005b.p280p.p285b.p286a0.p287j.C5164o.m9539c(r2, r0)
                throw r4
            L_0x0240:
                if (r2 != r10) goto L_0x026f
                if (r13 == 0) goto L_0x0267
                n.g r2 = r1.f10097g
                int r2 = r2.readInt()
                b.p.b.a0.j.a r5 = p005b.p280p.p285b.p286a0.p287j.C5135a.m9468d(r2)
                if (r5 == 0) goto L_0x0259
                r0 = r21
                b.p.b.a0.j.d$e r0 = (p005b.p280p.p285b.p286a0.p287j.C5139d.C5145e) r0
                r0.mo17015f(r13, r5)
                goto L_0x0327
            L_0x0259:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r0] = r2
                java.lang.String r0 = "TYPE_RST_STREAM unexpected error code: %d"
                p005b.p280p.p285b.p286a0.p287j.C5164o.m9539c(r0, r3)
                throw r4
            L_0x0267:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "TYPE_RST_STREAM streamId == 0"
                p005b.p280p.p285b.p286a0.p287j.C5164o.m9539c(r2, r0)
                throw r4
            L_0x026f:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r0] = r2
                java.lang.String r0 = "TYPE_RST_STREAM length: %d != 4"
                p005b.p280p.p285b.p286a0.p287j.C5164o.m9539c(r0, r3)
                throw r4
            L_0x027d:
                r5 = 5
                if (r2 != r5) goto L_0x029a
                if (r13 == 0) goto L_0x0292
                n.g r0 = r1.f10097g
                r0.readInt()
                n.g r0 = r1.f10097g
                r0.readByte()
                r0 = r21
                b.p.b.a0.j.d$e r0 = (p005b.p280p.p285b.p286a0.p287j.C5139d.C5145e) r0
                goto L_0x0327
            L_0x0292:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "TYPE_PRIORITY streamId == 0"
                p005b.p280p.p285b.p286a0.p287j.C5164o.m9539c(r2, r0)
                throw r4
            L_0x029a:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r0] = r2
                java.lang.String r0 = "TYPE_PRIORITY length: %d != 5"
                p005b.p280p.p285b.p286a0.p287j.C5164o.m9539c(r0, r3)
                throw r4
            L_0x02a8:
                if (r13 == 0) goto L_0x02e6
                r4 = r7 & 1
                if (r4 == 0) goto L_0x02b0
                r12 = r3
                goto L_0x02b1
            L_0x02b0:
                r12 = r0
            L_0x02b1:
                r4 = r7 & 8
                if (r4 == 0) goto L_0x02be
                n.g r0 = r1.f10097g
                byte r0 = r0.readByte()
                r0 = r0 & 255(0xff, float:3.57E-43)
                short r0 = (short) r0
            L_0x02be:
                r4 = r7 & 32
                if (r4 == 0) goto L_0x02d2
                n.g r4 = r1.f10097g
                r4.readInt()
                n.g r4 = r1.f10097g
                r4.readByte()
                r4 = r21
                b.p.b.a0.j.d$e r4 = (p005b.p280p.p285b.p286a0.p287j.C5139d.C5145e) r4
                int r2 = r2 + -5
            L_0x02d2:
                int r2 = p005b.p280p.p285b.p286a0.p287j.C5164o.m9541e(r2, r7, r0)
                java.util.List r15 = r1.mo17055d(r2, r0, r7, r13)
                r11 = 0
                r14 = -1
                b.p.b.a0.j.m r16 = p005b.p280p.p285b.p286a0.p287j.C5160m.HTTP_20_HEADERS
                r10 = r21
                b.p.b.a0.j.d$e r10 = (p005b.p280p.p285b.p286a0.p287j.C5139d.C5145e) r10
                r10.mo17013d(r11, r12, r13, r14, r15, r16)
                goto L_0x0327
            L_0x02e6:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
                p005b.p280p.p285b.p286a0.p287j.C5164o.m9539c(r2, r0)
                throw r4
            L_0x02ee:
                r5 = r7 & 1
                if (r5 == 0) goto L_0x02f4
                r5 = r3
                goto L_0x02f5
            L_0x02f4:
                r5 = r0
            L_0x02f5:
                r6 = r7 & 32
                if (r6 == 0) goto L_0x02fb
                r6 = r3
                goto L_0x02fc
            L_0x02fb:
                r6 = r0
            L_0x02fc:
                if (r6 != 0) goto L_0x031f
                r4 = r7 & 8
                if (r4 == 0) goto L_0x030b
                n.g r0 = r1.f10097g
                byte r0 = r0.readByte()
                r0 = r0 & 255(0xff, float:3.57E-43)
                short r0 = (short) r0
            L_0x030b:
                int r2 = p005b.p280p.p285b.p286a0.p287j.C5164o.m9541e(r2, r7, r0)
                n.g r4 = r1.f10097g
                r6 = r21
                b.p.b.a0.j.d$e r6 = (p005b.p280p.p285b.p286a0.p287j.C5139d.C5145e) r6
                r6.mo17011b(r5, r13, r4, r2)
                n.g r2 = r1.f10097g
                long r4 = (long) r0
                r2.skip(r4)
                goto L_0x0327
            L_0x031f:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
                p005b.p280p.p285b.p286a0.p287j.C5164o.m9539c(r2, r0)
                throw r4
            L_0x0327:
                return r3
            L_0x0328:
                java.lang.String r5 = "FRAME_SIZE_ERROR: %s"
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3[r0] = r2
                p005b.p280p.p285b.p286a0.p287j.C5164o.m9539c(r5, r3)
                throw r4
            L_0x0336:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.p286a0.p287j.C5164o.C5167c.mo16988b0(b.p.b.a0.j.b$a):boolean");
        }

        public void close() {
            this.f10097g.close();
        }

        /* renamed from: d */
        public final List<C5159l> mo17055d(int i, short s, byte b, int i2) {
            C5165a aVar = this.f10098h;
            aVar.f10092k = i;
            aVar.f10089h = i;
            aVar.f10093l = s;
            aVar.f10090i = b;
            aVar.f10091j = i2;
            C5161n.C5162a aVar2 = this.f10100j;
            while (!aVar2.f10078b.mo25886D()) {
                byte readByte = aVar2.f10078b.readByte() & ExifInterface.MARKER;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    int g = aVar2.mo17048g(readByte, 127) - 1;
                    if (g >= 0 && g <= C5161n.f10075a.length - 1) {
                        aVar2.f10077a.add(C5161n.f10075a[g]);
                    } else {
                        int b2 = aVar2.mo17043b(g - C5161n.f10075a.length);
                        if (b2 >= 0) {
                            C5159l[] lVarArr = aVar2.f10081e;
                            if (b2 <= lVarArr.length - 1) {
                                aVar2.f10077a.add(lVarArr[b2]);
                            }
                        }
                        StringBuilder u = C0843a.m460u("Header index too large ");
                        u.append(g + 1);
                        throw new IOException(u.toString());
                    }
                } else if (readByte == 64) {
                    C8044h f = aVar2.mo17047f();
                    C5161n.m9528a(f);
                    aVar2.mo17046e(-1, new C5159l(f, aVar2.mo17047f()));
                } else if ((readByte & 64) == 64) {
                    aVar2.mo17046e(-1, new C5159l(aVar2.mo17045d(aVar2.mo17048g(readByte, 63) - 1), aVar2.mo17047f()));
                } else if ((readByte & 32) == 32) {
                    int g2 = aVar2.mo17048g(readByte, 31);
                    aVar2.f10080d = g2;
                    if (g2 < 0 || g2 > aVar2.f10079c) {
                        StringBuilder u2 = C0843a.m460u("Invalid dynamic table size update ");
                        u2.append(aVar2.f10080d);
                        throw new IOException(u2.toString());
                    }
                    int i3 = aVar2.f10084h;
                    if (g2 < i3) {
                        if (g2 == 0) {
                            aVar2.mo17042a();
                        } else {
                            aVar2.mo17044c(i3 - g2);
                        }
                    }
                } else if (readByte == 16 || readByte == 0) {
                    C8044h f2 = aVar2.mo17047f();
                    C5161n.m9528a(f2);
                    aVar2.f10077a.add(new C5159l(f2, aVar2.mo17047f()));
                } else {
                    aVar2.f10077a.add(new C5159l(aVar2.mo17045d(aVar2.mo17048g(readByte, 15) - 1), aVar2.mo17047f()));
                }
            }
            C5161n.C5162a aVar3 = this.f10100j;
            Objects.requireNonNull(aVar3);
            ArrayList arrayList = new ArrayList(aVar3.f10077a);
            aVar3.f10077a.clear();
            return arrayList;
        }

        /* renamed from: u */
        public void mo16989u() {
            if (!this.f10099i) {
                C8043g gVar = this.f10097g;
                C8044h hVar = C5164o.f10087b;
                C8044h p = gVar.mo25922p((long) hVar.mo25959l());
                Logger logger = C5164o.f10086a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(String.format("<< CONNECTION %s", new Object[]{p.mo25960p()}));
                }
                if (!hVar.equals(p)) {
                    C5164o.m9539c("Expected a connection header but was %s", new Object[]{p.mo25968z()});
                    throw null;
                }
            }
        }
    }

    /* renamed from: b.p.b.a0.j.o$d */
    public static final class C5168d implements C5138c {

        /* renamed from: g */
        public final C8042f f10101g;

        /* renamed from: h */
        public final boolean f10102h;

        /* renamed from: i */
        public final C8040e f10103i;

        /* renamed from: j */
        public final C5161n.C5163b f10104j;

        /* renamed from: k */
        public int f10105k = 16384;

        /* renamed from: l */
        public boolean f10106l;

        public C5168d(C8042f fVar, boolean z) {
            this.f10101g = fVar;
            this.f10102h = z;
            C8040e eVar = new C8040e();
            this.f10103i = eVar;
            this.f10104j = new C5161n.C5163b(eVar);
        }

        /* renamed from: F */
        public synchronized void mo16990F() {
            if (this.f10106l) {
                throw new IOException("closed");
            } else if (this.f10102h) {
                Logger logger = C5164o.f10086a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(String.format(">> CONNECTION %s", new Object[]{C5164o.f10087b.mo25960p()}));
                }
                this.f10101g.mo25889K(C5164o.f10087b.mo25967y());
                this.f10101g.flush();
            }
        }

        /* renamed from: L */
        public synchronized void mo16991L(boolean z, int i, C8040e eVar, int i2) {
            if (!this.f10106l) {
                mo17057d(i, i2, (byte) 0, z ? (byte) 1 : 0);
                if (i2 > 0) {
                    this.f10101g.mo17030j(eVar, (long) i2);
                }
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: a0 */
        public int mo16992a0() {
            return this.f10105k;
        }

        /* renamed from: b */
        public synchronized void mo16993b(boolean z, int i, int i2) {
            if (!this.f10106l) {
                mo17057d(0, 8, (byte) 6, z ? (byte) 1 : 0);
                this.f10101g.mo25939v(i);
                this.f10101g.mo25939v(i2);
                this.f10101g.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: c0 */
        public synchronized void mo16994c0(boolean z, boolean z2, int i, int i2, List<C5159l> list) {
            if (z2) {
                throw new UnsupportedOperationException();
            } else if (!this.f10106l) {
                mo17058e(z, i, list);
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void close() {
            this.f10106l = true;
            this.f10101g.close();
        }

        /* renamed from: d */
        public void mo17057d(int i, int i2, byte b, byte b2) {
            Logger logger = C5164o.f10086a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C5166b.m9547a(false, i, i2, b, b2));
            }
            int i3 = this.f10105k;
            if (i2 > i3) {
                C5164o.m9542f("FRAME_SIZE_ERROR length > %d: %d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)});
                throw null;
            } else if ((Integer.MIN_VALUE & i) == 0) {
                C8042f fVar = this.f10101g;
                fVar.mo25887E((i2 >>> 16) & 255);
                fVar.mo25887E((i2 >>> 8) & 255);
                fVar.mo25887E(i2 & 255);
                this.f10101g.mo25887E(b & ExifInterface.MARKER);
                this.f10101g.mo25887E(b2 & ExifInterface.MARKER);
                this.f10101g.mo25939v(i & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            } else {
                C5164o.m9542f("reserved bit set: %s", new Object[]{Integer.valueOf(i)});
                throw null;
            }
        }

        /* renamed from: e */
        public void mo17058e(boolean z, int i, List<C5159l> list) {
            if (!this.f10106l) {
                this.f10104j.mo17050b(list);
                long j = this.f10103i.f16140h;
                int min = (int) Math.min((long) this.f10105k, j);
                long j2 = (long) min;
                int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                byte b = i2 == 0 ? (byte) 4 : 0;
                if (z) {
                    b = (byte) (b | 1);
                }
                mo17057d(i, min, (byte) 1, b);
                this.f10101g.mo17030j(this.f10103i, j2);
                if (i2 > 0) {
                    mo17059q(i, j - j2);
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }

        public synchronized void flush() {
            if (!this.f10106l) {
                this.f10101g.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: g */
        public synchronized void mo16996g(int i, long j) {
            if (this.f10106l) {
                throw new IOException("closed");
            } else if (j == 0 || j > 2147483647L) {
                C5164o.m9542f("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[]{Long.valueOf(j)});
                throw null;
            } else {
                mo17057d(i, 4, (byte) 8, (byte) 0);
                this.f10101g.mo25939v((int) j);
                this.f10101g.flush();
            }
        }

        /* renamed from: g0 */
        public synchronized void mo16997g0(C5177t tVar) {
            if (!this.f10106l) {
                int i = 0;
                mo17057d(0, Integer.bitCount(tVar.f10120a) * 6, (byte) 4, (byte) 0);
                while (i < 10) {
                    if (tVar.mo17064c(i)) {
                        this.f10101g.mo25926r(i == 4 ? 3 : i == 7 ? 4 : i);
                        this.f10101g.mo25939v(tVar.f10123d[i]);
                    }
                    i++;
                }
                this.f10101g.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: k */
        public synchronized void mo16998k(C5177t tVar) {
            if (!this.f10106l) {
                int i = this.f10105k;
                if ((tVar.f10120a & 32) != 0) {
                    i = tVar.f10123d[5];
                }
                this.f10105k = i;
                mo17057d(0, 0, (byte) 4, (byte) 1);
                this.f10101g.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: q */
        public final void mo17059q(int i, long j) {
            while (j > 0) {
                int min = (int) Math.min((long) this.f10105k, j);
                long j2 = (long) min;
                j -= j2;
                mo17057d(i, min, (byte) 9, j == 0 ? (byte) 4 : 0);
                this.f10101g.mo17030j(this.f10103i, j2);
            }
        }

        /* renamed from: s */
        public synchronized void mo16999s(int i, C5135a aVar) {
            if (this.f10106l) {
                throw new IOException("closed");
            } else if (aVar.f9975g != -1) {
                mo17057d(i, 4, (byte) 3, (byte) 0);
                this.f10101g.mo25939v(aVar.f9975g);
                this.f10101g.flush();
            } else {
                throw new IllegalArgumentException();
            }
        }

        /* renamed from: w */
        public synchronized void mo17000w(int i, C5135a aVar, byte[] bArr) {
            if (this.f10106l) {
                throw new IOException("closed");
            } else if (aVar.f9975g != -1) {
                mo17057d(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f10101g.mo25939v(i);
                this.f10101g.mo25939v(aVar.f9975g);
                if (bArr.length > 0) {
                    this.f10101g.mo25889K(bArr);
                }
                this.f10101g.flush();
            } else {
                C5164o.m9542f("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
        }
    }

    /* renamed from: c */
    public static IOException m9539c(String str, Object[] objArr) {
        throw new IOException(String.format(str, objArr));
    }

    /* renamed from: d */
    public static int m9540d(C8043g gVar) {
        return (gVar.readByte() & ExifInterface.MARKER) | ((gVar.readByte() & ExifInterface.MARKER) << 16) | ((gVar.readByte() & ExifInterface.MARKER) << 8);
    }

    /* renamed from: e */
    public static int m9541e(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw new IOException(String.format("PROTOCOL_ERROR padding %s > remaining length %s", new Object[]{Short.valueOf(s), Integer.valueOf(i)}));
    }

    /* renamed from: f */
    public static IllegalArgumentException m9542f(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* renamed from: a */
    public C5136b mo17052a(C8043g gVar, boolean z) {
        return new C5167c(gVar, 4096, z);
    }

    /* renamed from: b */
    public C5138c mo17053b(C8042f fVar, boolean z) {
        return new C5168d(fVar, z);
    }
}
