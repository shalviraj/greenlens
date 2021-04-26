package p005b.p096l.p097a.p151d.p152a.p154b;

import androidx.annotation.Nullable;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.d.a.b.w */
public final class C3553w extends C3474b {

    /* renamed from: a */
    public final String f6592a;

    /* renamed from: b */
    public final String f6593b;

    public C3553w(int i, @Nullable String str, @Nullable String str2) {
        this.f6592a = str;
        this.f6593b = str2;
    }

    @Nullable
    /* renamed from: a */
    public final String mo14753a() {
        return this.f6593b;
    }

    /* renamed from: b */
    public final int mo14754b() {
        return 0;
    }

    @Nullable
    /* renamed from: c */
    public final String mo14755c() {
        return this.f6592a;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3474b) {
            C3474b bVar = (C3474b) obj;
            if (bVar.mo14754b() == 0 && ((str = this.f6592a) != null ? str.equals(bVar.mo14755c()) : bVar.mo14755c() == null)) {
                String str2 = this.f6593b;
                String a = bVar.mo14753a();
                if (str2 != null ? str2.equals(a) : a == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6592a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ -721379959) * 1000003;
        String str2 = this.f6593b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f6592a;
        String str2 = this.f6593b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(0);
        sb.append(", path=");
        sb.append(str);
        return C0843a.m456q(sb, ", assetsPath=", str2, "}");
    }
}
