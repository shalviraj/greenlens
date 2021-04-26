package p005b.p096l.p097a.p113c.p119b.p122m;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.b.m.c */
public class C1903c extends C1948a {
    public static final Parcelable.Creator<C1903c> CREATOR = new C1951w();

    /* renamed from: g */
    public final int f3407g;
    @Nullable

    /* renamed from: h */
    public final String f3408h;

    public C1903c(int i, @Nullable String str) {
        this.f3407g = i;
        this.f3408h = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof C1903c)) {
            C1903c cVar = (C1903c) obj;
            return cVar.f3407g == this.f3407g && C0823f.m330A(cVar.f3408h, this.f3408h);
        }
    }

    public int hashCode() {
        return this.f3407g;
    }

    public String toString() {
        int i = this.f3407g;
        String str = this.f3408h;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        int i2 = this.f3407g;
        C0823f.m333B0(parcel, 1, 4);
        parcel.writeInt(i2);
        C0823f.m395s0(parcel, 2, this.f3408h, false);
        C0823f.m331A0(parcel, w0);
    }
}
