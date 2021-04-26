package p421m.p422m0.p429j;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;
import p421m.p422m0.C7867c;
import p435n.C8044h;

/* renamed from: m.m0.j.e */
public final class C7928e {

    /* renamed from: a */
    public static final C8044h f15839a = C8044h.f16143k.mo25970b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    public static final String[] f15840b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    public static final String[] f15841c = new String[64];

    /* renamed from: d */
    public static final String[] f15842d;

    /* renamed from: e */
    public static final C7928e f15843e = new C7928e();

    static {
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            C6888i.m12437d(binaryString, "Integer.toBinaryString(it)");
            strArr[i] = C7694h.m13943u(C7867c.m14288i("%8s", binaryString), ' ', '0', false, 4);
        }
        f15842d = strArr;
        String[] strArr2 = f15841c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i2 = 0; i2 < 1; i2++) {
            int i3 = iArr[i2];
            String[] strArr3 = f15841c;
            strArr3[i3 | 8] = C6888i.m12444k(strArr3[i3], "|PADDED");
        }
        String[] strArr4 = f15841c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 < 1; i6++) {
                int i7 = iArr[i6];
                String[] strArr5 = f15841c;
                int i8 = i7 | i5;
                strArr5[i8] = strArr5[i7] + "|" + strArr5[i5];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr5[i7]);
                sb.append("|");
                strArr5[i8 | 8] = C0843a.m455p(sb, strArr5[i5], "|PADDED");
            }
        }
        int length = f15841c.length;
        for (int i9 = 0; i9 < length; i9++) {
            String[] strArr6 = f15841c;
            if (strArr6[i9] == null) {
                strArr6[i9] = f15842d[i9];
            }
        }
    }

    /* renamed from: a */
    public final String mo25690a(int i) {
        String[] strArr = f15840b;
        if (i < strArr.length) {
            return strArr[i];
        }
        return C7867c.m14288i("0x%02x", Integer.valueOf(i));
    }

    /* renamed from: b */
    public final String mo25691b(boolean z, int i, int i2, int i3, int i4) {
        String str;
        String str2;
        String str3;
        String str4;
        String a = mo25690a(i3);
        if (i4 == 0) {
            str = "";
        } else {
            if (!(i3 == 2 || i3 == 3)) {
                if (i3 == 4 || i3 == 6) {
                    str = i4 == 1 ? "ACK" : f15842d[i4];
                } else if (!(i3 == 7 || i3 == 8)) {
                    String[] strArr = f15841c;
                    if (i4 < strArr.length) {
                        str2 = strArr[i4];
                        C6888i.m12436c(str2);
                    } else {
                        str2 = f15842d[i4];
                    }
                    if (i3 == 5 && (i4 & 4) != 0) {
                        str4 = "HEADERS";
                        str3 = "PUSH_PROMISE";
                    } else if (i3 != 0 || (i4 & 32) == 0) {
                        str = str2;
                    } else {
                        str4 = "PRIORITY";
                        str3 = "COMPRESSED";
                    }
                    str = C7694h.m13944v(str2, str4, str3, false, 4);
                }
            }
            str = f15842d[i4];
        }
        return C7867c.m14288i("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), a, str);
    }
}
