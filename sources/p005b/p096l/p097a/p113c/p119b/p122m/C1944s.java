package p005b.p096l.p097a.p113c.p119b.p122m;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.b.m.s */
public class C1944s extends C1948a {
    public static final Parcelable.Creator<C1944s> CREATOR = new C1888a0();

    /* renamed from: g */
    public final int f3486g;

    /* renamed from: h */
    public final Account f3487h;

    /* renamed from: i */
    public final int f3488i;

    /* renamed from: j */
    public final GoogleSignInAccount f3489j;

    public C1944s(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f3486g = i;
        this.f3487h = account;
        this.f3488i = i2;
        this.f3489j = googleSignInAccount;
    }

    public C1944s(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this.f3486g = 2;
        this.f3487h = account;
        this.f3488i = i;
        this.f3489j = googleSignInAccount;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        int i2 = this.f3486g;
        C0823f.m333B0(parcel, 1, 4);
        parcel.writeInt(i2);
        C0823f.m393r0(parcel, 2, this.f3487h, i, false);
        int i3 = this.f3488i;
        C0823f.m333B0(parcel, 3, 4);
        parcel.writeInt(i3);
        C0823f.m393r0(parcel, 4, this.f3489j, i, false);
        C0823f.m331A0(parcel, w0);
    }
}
