package p005b.p096l.p180d.p185o;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.d.o.r */
public class C3926r extends C3859c {
    @RecentlyNonNull
    public static final Parcelable.Creator<C3926r> CREATOR = new C3939x0();

    /* renamed from: g */
    public String f7199g;

    public C3926r(String str) {
        C0823f.m376j(str);
        this.f7199g = str;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f7199g, false);
        C0823f.m331A0(parcel, w0);
    }
}
