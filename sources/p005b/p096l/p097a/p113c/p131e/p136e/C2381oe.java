package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p180d.p185o.C3919n0;

/* renamed from: b.l.a.c.e.e.oe */
public final class C2381oe extends C1948a {
    public static final Parcelable.Creator<C2381oe> CREATOR = new C2405pe();

    /* renamed from: g */
    public final Status f4170g;

    /* renamed from: h */
    public final C3919n0 f4171h;

    /* renamed from: i */
    public final String f4172i;

    /* renamed from: j */
    public final String f4173j;

    public C2381oe(Status status, C3919n0 n0Var, String str, @Nullable String str2) {
        this.f4170g = status;
        this.f4171h = n0Var;
        this.f4172i = str;
        this.f4173j = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m393r0(parcel, 1, this.f4170g, i, false);
        C0823f.m393r0(parcel, 2, this.f4171h, i, false);
        C0823f.m395s0(parcel, 3, this.f4172i, false);
        C0823f.m395s0(parcel, 4, this.f4173j, false);
        C0823f.m331A0(parcel, w0);
    }
}
