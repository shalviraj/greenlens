package p005b.p096l.p180d.p185o.p189e0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.List;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p180d.p185o.C3934v;
import p005b.p096l.p180d.p185o.C3940y;

/* renamed from: b.l.d.o.e0.g */
public final class C3876g extends C3934v {
    public static final Parcelable.Creator<C3876g> CREATOR = new C3878h();
    @Nullable

    /* renamed from: g */
    public String f7131g;
    @Nullable

    /* renamed from: h */
    public String f7132h;
    @Nullable

    /* renamed from: i */
    public List<C3940y> f7133i;

    public C3876g() {
    }

    public C3876g(String str, String str2, List<C3940y> list) {
        this.f7131g = str;
        this.f7132h = str2;
        this.f7133i = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f7131g, false);
        C0823f.m395s0(parcel, 2, this.f7132h, false);
        C0823f.m401v0(parcel, 3, this.f7133i, false);
        C0823f.m331A0(parcel, w0);
    }
}
