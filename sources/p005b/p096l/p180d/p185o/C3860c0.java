package p005b.p096l.p180d.p185o;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.d.o.c0 */
public class C3860c0 extends C1948a {
    @RecentlyNonNull
    public static final Parcelable.Creator<C3860c0> CREATOR = new C3913k0();
    @Nullable

    /* renamed from: g */
    public String f7102g;
    @Nullable

    /* renamed from: h */
    public String f7103h;

    /* renamed from: i */
    public boolean f7104i;

    /* renamed from: j */
    public boolean f7105j;
    @Nullable

    /* renamed from: k */
    public Uri f7106k;

    public C3860c0(@Nullable String str, @Nullable String str2, boolean z, boolean z2) {
        this.f7102g = str;
        this.f7103h = str2;
        this.f7104i = z;
        this.f7105j = z2;
        this.f7106k = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 2, this.f7102g, false);
        C0823f.m395s0(parcel, 3, this.f7103h, false);
        boolean z = this.f7104i;
        C0823f.m333B0(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f7105j;
        C0823f.m333B0(parcel, 5, 4);
        parcel.writeInt(z2 ? 1 : 0);
        C0823f.m331A0(parcel, w0);
    }
}
