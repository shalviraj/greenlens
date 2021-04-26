package p005b.p096l.p097a.p098a.p101f.p102n;

import androidx.annotation.Nullable;
import java.util.Arrays;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p098a.p101f.C1634e;

/* renamed from: b.l.a.a.f.n.a */
public final class C1647a extends C1653f {

    /* renamed from: a */
    public final Iterable<C1634e> f2897a;

    /* renamed from: b */
    public final byte[] f2898b;

    public C1647a(Iterable iterable, byte[] bArr, C1648a aVar) {
        this.f2897a = iterable;
        this.f2898b = bArr;
    }

    /* renamed from: a */
    public Iterable<C1634e> mo11829a() {
        return this.f2897a;
    }

    @Nullable
    /* renamed from: b */
    public byte[] mo11830b() {
        return this.f2898b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1653f)) {
            return false;
        }
        C1653f fVar = (C1653f) obj;
        if (this.f2897a.equals(fVar.mo11829a())) {
            if (Arrays.equals(this.f2898b, fVar instanceof C1647a ? ((C1647a) fVar).f2898b : fVar.mo11830b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f2897a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2898b);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("BackendRequest{events=");
        u.append(this.f2897a);
        u.append(", extras=");
        u.append(Arrays.toString(this.f2898b));
        u.append("}");
        return u.toString();
    }
}
