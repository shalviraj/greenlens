package p005b.p096l.p180d.p185o.p189e0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p180d.p185o.C3940y;

/* renamed from: b.l.d.o.e0.p */
public final class C3891p extends C1948a {
    public static final Parcelable.Creator<C3891p> CREATOR = new C3892q();

    /* renamed from: g */
    public final List<C3940y> f7170g;

    public C3891p(List<C3940y> list) {
        this.f7170g = list == null ? new ArrayList<>() : list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m401v0(parcel, 1, this.f7170g, false);
        C0823f.m331A0(parcel, w0);
    }
}
