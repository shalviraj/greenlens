package p005b.p096l.p097a.p113c.p119b.p126p;

import androidx.exifinterface.media.ExifInterface;

/* renamed from: b.l.a.c.b.p.e */
public class C1961e {

    /* renamed from: a */
    public static final char[] f3519a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    public static final char[] f3520b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m2877a(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length << 1);
        int i = 0;
        while (i < length && (!z || i != length - 1 || (bArr[i] & ExifInterface.MARKER) != 0)) {
            char[] cArr = f3519a;
            sb.append(cArr[(bArr[i] & 240) >>> 4]);
            sb.append(cArr[bArr[i] & 15]);
            i++;
        }
        return sb.toString();
    }
}
