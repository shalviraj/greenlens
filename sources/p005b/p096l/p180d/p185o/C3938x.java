package p005b.p096l.p180d.p185o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.d.o.x */
public class C3938x extends C3859c implements Cloneable {
    @RecentlyNonNull
    public static final Parcelable.Creator<C3938x> CREATOR = new C3905g0();
    @Nullable

    /* renamed from: g */
    public String f7209g;
    @Nullable

    /* renamed from: h */
    public String f7210h;

    /* renamed from: i */
    public boolean f7211i;
    @Nullable

    /* renamed from: j */
    public String f7212j;

    /* renamed from: k */
    public boolean f7213k;
    @Nullable

    /* renamed from: l */
    public String f7214l;
    @Nullable

    /* renamed from: m */
    public String f7215m;

    public C3938x(@Nullable String str, @Nullable String str2, boolean z, @Nullable String str3, boolean z2, @Nullable String str4, @Nullable String str5) {
        boolean z3 = false;
        if ((z && !TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5)) || ((z && TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str5)) || ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4))))) {
            z3 = true;
        }
        C0823f.m362c(z3, "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.");
        this.f7209g = str;
        this.f7210h = str2;
        this.f7211i = z;
        this.f7212j = str3;
        this.f7213k = z2;
        this.f7214l = str4;
        this.f7215m = str5;
    }

    @RecentlyNonNull
    /* renamed from: V */
    public static C3938x m7314V(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        return new C3938x(str, str2, false, (String) null, true, (String) null, (String) null);
    }

    @RecentlyNonNull
    /* renamed from: W */
    public final C3938x clone() {
        return new C3938x(this.f7209g, this.f7210h, this.f7211i, this.f7212j, this.f7213k, this.f7214l, this.f7215m);
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f7209g, false);
        C0823f.m395s0(parcel, 2, this.f7210h, false);
        boolean z = this.f7211i;
        C0823f.m333B0(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        C0823f.m395s0(parcel, 4, this.f7212j, false);
        boolean z2 = this.f7213k;
        C0823f.m333B0(parcel, 5, 4);
        parcel.writeInt(z2 ? 1 : 0);
        C0823f.m395s0(parcel, 6, this.f7214l, false);
        C0823f.m395s0(parcel, 7, this.f7215m, false);
        C0823f.m331A0(parcel, w0);
    }
}
