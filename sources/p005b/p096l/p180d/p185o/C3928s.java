package p005b.p096l.p180d.p185o;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.d.o.s */
public class C3928s extends C3859c {
    @RecentlyNonNull
    public static final Parcelable.Creator<C3928s> CREATOR = new C3903f0();
    @Nullable

    /* renamed from: g */
    public final String f7202g;
    @Nullable

    /* renamed from: h */
    public final String f7203h;

    public C3928s(@Nullable String str, @Nullable String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        } else if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        } else if (str2 == null || str2.length() != 0) {
            this.f7202g = str;
            this.f7203h = str2;
        } else {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f7202g, false);
        C0823f.m395s0(parcel, 2, this.f7203h, false);
        C0823f.m331A0(parcel, w0);
    }
}
