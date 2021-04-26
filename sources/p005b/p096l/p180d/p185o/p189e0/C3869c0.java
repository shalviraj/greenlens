package p005b.p096l.p180d.p185o.p189e0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1950c;

/* renamed from: b.l.d.o.e0.c0 */
public final class C3869c0 implements C1950c {
    public static final Parcelable.Creator<C3869c0> CREATOR = new C3871d0();

    /* renamed from: g */
    public final String f7118g;

    /* renamed from: h */
    public final String f7119h;

    /* renamed from: i */
    public final Map<String, Object> f7120i;

    /* renamed from: j */
    public final boolean f7121j;

    public C3869c0(String str, String str2, boolean z) {
        C0823f.m376j(str);
        C0823f.m376j(str2);
        this.f7118g = str;
        this.f7119h = str2;
        this.f7120i = C3890o.m7280b(str2);
        this.f7121j = z;
    }

    public C3869c0(boolean z) {
        this.f7121j = z;
        this.f7119h = null;
        this.f7118g = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f7118g, false);
        C0823f.m395s0(parcel, 2, this.f7119h, false);
        boolean z = this.f7121j;
        C0823f.m333B0(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        C0823f.m331A0(parcel, w0);
    }
}
