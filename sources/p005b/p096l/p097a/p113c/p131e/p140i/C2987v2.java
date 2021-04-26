package p005b.p096l.p097a.p113c.p131e.p140i;

import android.content.Context;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.i.v2 */
public final class C2987v2 extends C2897o3 {

    /* renamed from: a */
    public final Context f5083a;

    /* renamed from: b */
    public final C2975u3<C2949s3<C2766e3>> f5084b;

    public C2987v2(Context context, C2975u3<C2949s3<C2766e3>> u3Var) {
        this.f5083a = context;
        this.f5084b = u3Var;
    }

    /* renamed from: a */
    public final Context mo13536a() {
        return this.f5083a;
    }

    /* renamed from: b */
    public final C2975u3<C2949s3<C2766e3>> mo13537b() {
        return this.f5084b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2897o3) {
            C2897o3 o3Var = (C2897o3) obj;
            if (this.f5083a.equals(o3Var.mo13536a())) {
                C2975u3<C2949s3<C2766e3>> u3Var = this.f5084b;
                C2975u3<C2949s3<C2766e3>> b = o3Var.mo13537b();
                if (u3Var != null ? u3Var.equals(b) : b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f5083a.hashCode() ^ 1000003) * 1000003;
        C2975u3<C2949s3<C2766e3>> u3Var = this.f5084b;
        return hashCode ^ (u3Var == null ? 0 : u3Var.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5083a);
        String valueOf2 = String.valueOf(this.f5084b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 46 + valueOf2.length());
        C0843a.m431G(sb, "FlagsContext{context=", valueOf, ", hermeticFileOverrides=", valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
