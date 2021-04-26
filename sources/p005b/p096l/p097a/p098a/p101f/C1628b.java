package p005b.p096l.p097a.p098a.p101f;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Arrays;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p098a.C1584b;
import p005b.p096l.p097a.p098a.p101f.C1640h;

/* renamed from: b.l.a.a.f.b */
public final class C1628b extends C1640h {

    /* renamed from: a */
    public final String f2859a;

    /* renamed from: b */
    public final byte[] f2860b;

    /* renamed from: c */
    public final C1584b f2861c;

    /* renamed from: b.l.a.a.f.b$b */
    public static final class C1630b extends C1640h.C1641a {

        /* renamed from: a */
        public String f2862a;

        /* renamed from: b */
        public byte[] f2863b;

        /* renamed from: c */
        public C1584b f2864c;

        /* renamed from: a */
        public C1640h mo11813a() {
            String str = this.f2862a == null ? " backendName" : "";
            if (this.f2864c == null) {
                str = C0843a.m451l(str, " priority");
            }
            if (str.isEmpty()) {
                return new C1628b(this.f2862a, this.f2863b, this.f2864c, (C1629a) null);
            }
            throw new IllegalStateException(C0843a.m451l("Missing required properties:", str));
        }

        /* renamed from: b */
        public C1640h.C1641a mo11814b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f2862a = str;
            return this;
        }

        /* renamed from: c */
        public C1640h.C1641a mo11815c(C1584b bVar) {
            Objects.requireNonNull(bVar, "Null priority");
            this.f2864c = bVar;
            return this;
        }
    }

    public C1628b(String str, byte[] bArr, C1584b bVar, C1629a aVar) {
        this.f2859a = str;
        this.f2860b = bArr;
        this.f2861c = bVar;
    }

    /* renamed from: b */
    public String mo11808b() {
        return this.f2859a;
    }

    @Nullable
    /* renamed from: c */
    public byte[] mo11809c() {
        return this.f2860b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public C1584b mo11810d() {
        return this.f2861c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1640h)) {
            return false;
        }
        C1640h hVar = (C1640h) obj;
        if (this.f2859a.equals(hVar.mo11808b())) {
            if (Arrays.equals(this.f2860b, hVar instanceof C1628b ? ((C1628b) hVar).f2860b : hVar.mo11809c()) && this.f2861c.equals(hVar.mo11810d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f2859a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2860b)) * 1000003) ^ this.f2861c.hashCode();
    }
}
