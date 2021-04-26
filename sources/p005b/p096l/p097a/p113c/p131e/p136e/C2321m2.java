package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.Arrays;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.m2 */
public final class C2321m2 implements Comparable<C2321m2> {

    /* renamed from: g */
    public final byte[] f4055g;

    public /* synthetic */ C2321m2(byte[] bArr) {
        this.f4055g = Arrays.copyOf(bArr, bArr.length);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C2321m2 m2Var = (C2321m2) obj;
        int length = this.f4055g.length;
        int length2 = m2Var.f4055g.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.f4055g;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = m2Var.f4055g[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2321m2)) {
            return false;
        }
        return Arrays.equals(this.f4055g, ((C2321m2) obj).f4055g);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4055g);
    }

    public final String toString() {
        return C1960d.m2807i1(this.f4055g);
    }
}
