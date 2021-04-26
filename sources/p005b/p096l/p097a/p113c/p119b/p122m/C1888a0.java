package p005b.p096l.p097a.p113c.p119b.p122m;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.b.m.a0 */
public final class C1888a0 implements Parcelable.Creator<C1944s> {
    public final Object createFromParcel(Parcel parcel) {
        int l0 = C0823f.m381l0(parcel);
        Account account = null;
        int i = 0;
        int i2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < l0) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = C0823f.m367e0(parcel, readInt);
            } else if (i3 == 2) {
                account = (Account) C0823f.m392r(parcel, readInt, Account.CREATOR);
            } else if (i3 == 3) {
                i2 = C0823f.m367e0(parcel, readInt);
            } else if (i3 != 4) {
                C0823f.m379k0(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C0823f.m392r(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        C0823f.m408z(parcel, l0);
        return new C1944s(i, account, i2, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1944s[i];
    }
}
