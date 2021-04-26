package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.h.b.m9 */
public final class C3253m9 extends C1948a {
    public static final Parcelable.Creator<C3253m9> CREATOR = new C3264n9();

    /* renamed from: g */
    public final int f5750g;

    /* renamed from: h */
    public final String f5751h;

    /* renamed from: i */
    public final long f5752i;
    @Nullable

    /* renamed from: j */
    public final Long f5753j;
    @Nullable

    /* renamed from: k */
    public final String f5754k;
    @Nullable

    /* renamed from: l */
    public final String f5755l;
    @Nullable

    /* renamed from: m */
    public final Double f5756m;

    public C3253m9(int i, String str, long j, @Nullable Long l, Float f, @Nullable String str2, @Nullable String str3, @Nullable Double d) {
        this.f5750g = i;
        this.f5751h = str;
        this.f5752i = j;
        this.f5753j = l;
        if (i == 1) {
            this.f5756m = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f5756m = d;
        }
        this.f5754k = str2;
        this.f5755l = str3;
    }

    public C3253m9(C3275o9 o9Var) {
        this(o9Var.f5821c, o9Var.f5822d, o9Var.f5823e, o9Var.f5820b);
    }

    public C3253m9(String str, long j, @Nullable Object obj, @Nullable String str2) {
        C0823f.m376j(str);
        this.f5750g = 2;
        this.f5751h = str;
        this.f5752i = j;
        this.f5755l = str2;
        if (obj == null) {
            this.f5753j = null;
            this.f5756m = null;
            this.f5754k = null;
        } else if (obj instanceof Long) {
            this.f5753j = (Long) obj;
            this.f5756m = null;
            this.f5754k = null;
        } else if (obj instanceof String) {
            this.f5753j = null;
            this.f5756m = null;
            this.f5754k = (String) obj;
        } else if (obj instanceof Double) {
            this.f5753j = null;
            this.f5756m = (Double) obj;
            this.f5754k = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    @Nullable
    /* renamed from: V */
    public final Object mo14428V() {
        Long l = this.f5753j;
        if (l != null) {
            return l;
        }
        Double d = this.f5756m;
        if (d != null) {
            return d;
        }
        String str = this.f5754k;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C3264n9.m6246a(this, parcel, i);
    }
}
