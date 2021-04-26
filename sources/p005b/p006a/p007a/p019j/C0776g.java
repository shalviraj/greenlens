package p005b.p006a.p007a.p019j;

import android.widget.ProgressBar;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.j.g */
public final class C0776g {

    /* renamed from: a */
    public final String f539a;

    /* renamed from: b */
    public final ProgressBar f540b;

    /* renamed from: c */
    public boolean f541c;

    public C0776g(String str, ProgressBar progressBar, boolean z) {
        C6888i.m12438e(progressBar, "progressBar");
        this.f539a = str;
        this.f540b = progressBar;
        this.f541c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0776g)) {
            return false;
        }
        C0776g gVar = (C0776g) obj;
        return C6888i.m12434a(this.f539a, gVar.f539a) && C6888i.m12434a(this.f540b, gVar.f540b) && this.f541c == gVar.f541c;
    }

    public int hashCode() {
        String str = this.f539a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ProgressBar progressBar = this.f540b;
        if (progressBar != null) {
            i = progressBar.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f541c;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("InputImageUploadFlag(componentId=");
        u.append(this.f539a);
        u.append(", progressBar=");
        u.append(this.f540b);
        u.append(", finished=");
        u.append(this.f541c);
        u.append(")");
        return u.toString();
    }
}
