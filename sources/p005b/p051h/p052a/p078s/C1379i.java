package p005b.p051h.p052a.p078s;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.h.a.s.i */
public class C1379i {

    /* renamed from: a */
    public Class<?> f1798a;

    /* renamed from: b */
    public Class<?> f1799b;

    /* renamed from: c */
    public Class<?> f1800c;

    public C1379i() {
    }

    public C1379i(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.f1798a = cls;
        this.f1799b = cls2;
        this.f1800c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1379i.class != obj.getClass()) {
            return false;
        }
        C1379i iVar = (C1379i) obj;
        return this.f1798a.equals(iVar.f1798a) && this.f1799b.equals(iVar.f1799b) && C1380j.m1469b(this.f1800c, iVar.f1800c);
    }

    public int hashCode() {
        int hashCode = (this.f1799b.hashCode() + (this.f1798a.hashCode() * 31)) * 31;
        Class<?> cls = this.f1800c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("MultiClassKey{first=");
        u.append(this.f1798a);
        u.append(", second=");
        u.append(this.f1799b);
        u.append('}');
        return u.toString();
    }
}
