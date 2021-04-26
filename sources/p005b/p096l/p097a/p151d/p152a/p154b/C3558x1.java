package p005b.p096l.p097a.p151d.p152a.p154b;

import androidx.annotation.Nullable;
import java.util.Arrays;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.d.a.b.x1 */
public final class C3558x1 {

    /* renamed from: a */
    public final String f6611a;

    /* renamed from: b */
    public final long f6612b;

    /* renamed from: c */
    public final int f6613c;

    /* renamed from: d */
    public final boolean f6614d;

    /* renamed from: e */
    public final boolean f6615e;

    /* renamed from: f */
    public final byte[] f6616f;

    public C3558x1() {
    }

    public C3558x1(@Nullable String str, long j, int i, boolean z, boolean z2, @Nullable byte[] bArr) {
        this.f6611a = str;
        this.f6612b = j;
        this.f6613c = i;
        this.f6614d = z;
        this.f6615e = z2;
        this.f6616f = bArr;
    }

    /* renamed from: a */
    public final boolean mo14860a() {
        String str = this.f6611a;
        if (str == null) {
            return false;
        }
        return str.endsWith("/");
    }

    /* renamed from: b */
    public final boolean mo14861b() {
        return this.f6613c == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3558x1) {
            C3558x1 x1Var = (C3558x1) obj;
            String str = this.f6611a;
            if (str != null ? str.equals(x1Var.f6611a) : x1Var.f6611a == null) {
                return this.f6612b == x1Var.f6612b && this.f6613c == x1Var.f6613c && this.f6614d == x1Var.f6614d && this.f6615e == x1Var.f6615e && Arrays.equals(this.f6616f, x1Var.f6616f);
            }
        }
    }

    public int hashCode() {
        String str = this.f6611a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f6612b;
        int i = 1237;
        int i2 = (((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f6613c) * 1000003) ^ (true != this.f6614d ? 1237 : 1231)) * 1000003;
        if (true == this.f6615e) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ Arrays.hashCode(this.f6616f);
    }

    public String toString() {
        String str = this.f6611a;
        long j = this.f6612b;
        int i = this.f6613c;
        boolean z = this.f6614d;
        boolean z2 = this.f6615e;
        String arrays = Arrays.toString(this.f6616f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j);
        sb.append(", compressionMethod=");
        sb.append(i);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        return C0843a.m456q(sb, ", headerBytes=", arrays, "}");
    }
}
