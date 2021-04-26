package p005b.p096l.p180d.p185o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.d.o.d */
public class C3861d extends C3859c {
    @RecentlyNonNull
    public static final Parcelable.Creator<C3861d> CREATOR = new C3923p0();

    /* renamed from: g */
    public String f7107g;
    @Nullable

    /* renamed from: h */
    public String f7108h;
    @Nullable

    /* renamed from: i */
    public final String f7109i;
    @Nullable

    /* renamed from: j */
    public String f7110j;

    /* renamed from: k */
    public boolean f7111k;

    public C3861d(String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z) {
        C0823f.m376j(str);
        this.f7107g = str;
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            this.f7108h = str2;
            this.f7109i = str3;
            this.f7110j = str4;
            this.f7111k = z;
            return;
        }
        throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f7107g, false);
        C0823f.m395s0(parcel, 2, this.f7108h, false);
        C0823f.m395s0(parcel, 3, this.f7109i, false);
        C0823f.m395s0(parcel, 4, this.f7110j, false);
        boolean z = this.f7111k;
        C0823f.m333B0(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        C0823f.m331A0(parcel, w0);
    }
}
