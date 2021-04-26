package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.h.b.s */
public final class C3309s extends C1948a {
    public static final Parcelable.Creator<C3309s> CREATOR = new C3320t();

    /* renamed from: g */
    public final String f5937g;

    /* renamed from: h */
    public final C3287q f5938h;

    /* renamed from: i */
    public final String f5939i;

    /* renamed from: j */
    public final long f5940j;

    public C3309s(C3309s sVar, long j) {
        Objects.requireNonNull(sVar, "null reference");
        this.f5937g = sVar.f5937g;
        this.f5938h = sVar.f5938h;
        this.f5939i = sVar.f5939i;
        this.f5940j = j;
    }

    public C3309s(String str, C3287q qVar, String str2, long j) {
        this.f5937g = str;
        this.f5938h = qVar;
        this.f5939i = str2;
        this.f5940j = j;
    }

    public final String toString() {
        String str = this.f5939i;
        String str2 = this.f5937g;
        String valueOf = String.valueOf(this.f5938h);
        StringBuilder sb = new StringBuilder(C0843a.m441b(String.valueOf(str).length(), 21, String.valueOf(str2).length(), valueOf.length()));
        C0843a.m431G(sb, "origin=", str, ",name=", str2);
        return C0843a.m455p(sb, ",params=", valueOf);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C3320t.m6414a(this, parcel, i);
    }
}
