package p005b.p096l.p180d.p191q.p192f.p197i;

import androidx.annotation.NonNull;
import java.util.Arrays;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;

/* renamed from: b.l.d.q.f.i.e */
public final class C4091e extends C4129v.C4132c.C4133a {

    /* renamed from: a */
    public final String f7602a;

    /* renamed from: b */
    public final byte[] f7603b;

    public C4091e(String str, byte[] bArr, C4092a aVar) {
        this.f7602a = str;
        this.f7603b = bArr;
    }

    @NonNull
    /* renamed from: a */
    public byte[] mo15605a() {
        return this.f7603b;
    }

    @NonNull
    /* renamed from: b */
    public String mo15606b() {
        return this.f7602a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4129v.C4132c.C4133a)) {
            return false;
        }
        C4129v.C4132c.C4133a aVar = (C4129v.C4132c.C4133a) obj;
        if (this.f7602a.equals(aVar.mo15606b())) {
            if (Arrays.equals(this.f7603b, aVar instanceof C4091e ? ((C4091e) aVar).f7603b : aVar.mo15605a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f7602a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f7603b);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("File{filename=");
        u.append(this.f7602a);
        u.append(", contents=");
        u.append(Arrays.toString(this.f7603b));
        u.append("}");
        return u.toString();
    }
}
