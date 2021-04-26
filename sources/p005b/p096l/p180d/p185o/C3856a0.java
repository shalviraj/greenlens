package p005b.p096l.p180d.p185o;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.d.o.a0 */
public class C3856a0 extends C3859c {
    @RecentlyNonNull
    public static final Parcelable.Creator<C3856a0> CREATOR = new C3911j0();

    /* renamed from: g */
    public String f7097g;

    /* renamed from: h */
    public String f7098h;

    public C3856a0(@NonNull String str, @NonNull String str2) {
        C0823f.m376j(str);
        this.f7097g = str;
        C0823f.m376j(str2);
        this.f7098h = str2;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f7097g, false);
        C0823f.m395s0(parcel, 2, this.f7098h, false);
        C0823f.m331A0(parcel, w0);
    }
}
