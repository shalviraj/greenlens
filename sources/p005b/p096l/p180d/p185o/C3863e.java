package p005b.p096l.p180d.p185o;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.d.o.e */
public class C3863e extends C3859c {
    @RecentlyNonNull
    public static final Parcelable.Creator<C3863e> CREATOR = new C3925q0();

    /* renamed from: g */
    public final String f7113g;

    public C3863e(String str) {
        C0823f.m376j(str);
        this.f7113g = str;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f7113g, false);
        C0823f.m331A0(parcel, w0);
    }
}
