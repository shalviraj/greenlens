package p005b.p096l.p097a.p098a.p101f.p102n;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p098a.p101f.p110s.C1735a;

/* renamed from: b.l.a.a.f.n.c */
public final class C1650c extends C1656h {

    /* renamed from: a */
    public final Context f2901a;

    /* renamed from: b */
    public final C1735a f2902b;

    /* renamed from: c */
    public final C1735a f2903c;

    /* renamed from: d */
    public final String f2904d;

    public C1650c(Context context, C1735a aVar, C1735a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f2901a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f2902b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f2903c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f2904d = str;
    }

    /* renamed from: a */
    public Context mo11839a() {
        return this.f2901a;
    }

    @NonNull
    /* renamed from: b */
    public String mo11840b() {
        return this.f2904d;
    }

    /* renamed from: c */
    public C1735a mo11841c() {
        return this.f2903c;
    }

    /* renamed from: d */
    public C1735a mo11842d() {
        return this.f2902b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1656h)) {
            return false;
        }
        C1656h hVar = (C1656h) obj;
        return this.f2901a.equals(hVar.mo11839a()) && this.f2902b.equals(hVar.mo11842d()) && this.f2903c.equals(hVar.mo11841c()) && this.f2904d.equals(hVar.mo11840b());
    }

    public int hashCode() {
        return ((((((this.f2901a.hashCode() ^ 1000003) * 1000003) ^ this.f2902b.hashCode()) * 1000003) ^ this.f2903c.hashCode()) * 1000003) ^ this.f2904d.hashCode();
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("CreationContext{applicationContext=");
        u.append(this.f2901a);
        u.append(", wallClock=");
        u.append(this.f2902b);
        u.append(", monotonicClock=");
        u.append(this.f2903c);
        u.append(", backendName=");
        return C0843a.m455p(u, this.f2904d, "}");
    }
}
