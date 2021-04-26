package p005b.p096l.p097a.p151d.p152a.p153a;

/* renamed from: b.l.a.d.a.a.t */
public final class C3467t extends C3450c {

    /* renamed from: a */
    public final int f6287a;

    /* renamed from: b */
    public final boolean f6288b;

    public /* synthetic */ C3467t(int i, boolean z) {
        this.f6287a = i;
        this.f6288b = z;
    }

    /* renamed from: a */
    public final boolean mo14732a() {
        return this.f6288b;
    }

    /* renamed from: b */
    public final int mo14733b() {
        return this.f6287a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3450c) {
            C3450c cVar = (C3450c) obj;
            return this.f6287a == cVar.mo14733b() && this.f6288b == cVar.mo14732a();
        }
    }

    public final int hashCode() {
        return ((this.f6287a ^ 1000003) * 1000003) ^ (true != this.f6288b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f6287a;
        boolean z = this.f6288b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("AppUpdateOptions{appUpdateType=");
        sb.append(i);
        sb.append(", allowAssetPackDeletion=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
