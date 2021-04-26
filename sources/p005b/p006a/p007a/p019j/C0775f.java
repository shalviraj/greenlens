package p005b.p006a.p007a.p019j;

import android.widget.ProgressBar;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.j.f */
public final class C0775f {

    /* renamed from: a */
    public final String f536a;

    /* renamed from: b */
    public final ProgressBar f537b;

    /* renamed from: c */
    public boolean f538c;

    public C0775f(String str, ProgressBar progressBar, boolean z) {
        C6888i.m12438e(progressBar, "progressBar");
        this.f536a = str;
        this.f537b = progressBar;
        this.f538c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0775f)) {
            return false;
        }
        C0775f fVar = (C0775f) obj;
        return C6888i.m12434a(this.f536a, fVar.f536a) && C6888i.m12434a(this.f537b, fVar.f537b) && this.f538c == fVar.f538c;
    }

    public int hashCode() {
        String str = this.f536a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ProgressBar progressBar = this.f537b;
        if (progressBar != null) {
            i = progressBar.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f538c;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("InputFileUploadFlag(componentId=");
        u.append(this.f536a);
        u.append(", progressBar=");
        u.append(this.f537b);
        u.append(", finished=");
        u.append(this.f538c);
        u.append(")");
        return u.toString();
    }
}
