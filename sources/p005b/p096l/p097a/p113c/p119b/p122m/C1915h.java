package p005b.p096l.p097a.p113c.p119b.p122m;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.C1758d;
import p005b.p096l.p097a.p113c.p119b.C1763f;
import p005b.p096l.p097a.p113c.p119b.p122m.C1929n;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.b.m.h */
public class C1915h extends C1948a {
    public static final Parcelable.Creator<C1915h> CREATOR = new C1910e0();

    /* renamed from: g */
    public final int f3433g;

    /* renamed from: h */
    public final int f3434h;

    /* renamed from: i */
    public int f3435i;

    /* renamed from: j */
    public String f3436j;

    /* renamed from: k */
    public IBinder f3437k;

    /* renamed from: l */
    public Scope[] f3438l;

    /* renamed from: m */
    public Bundle f3439m;

    /* renamed from: n */
    public Account f3440n;

    /* renamed from: o */
    public C1758d[] f3441o;

    /* renamed from: p */
    public C1758d[] f3442p;

    /* renamed from: q */
    public boolean f3443q;

    /* renamed from: r */
    public int f3444r;

    public C1915h(int i) {
        this.f3433g = 4;
        this.f3435i = C1763f.f3112a;
        this.f3434h = i;
        this.f3443q = true;
    }

    public C1915h(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C1758d[] dVarArr, C1758d[] dVarArr2, boolean z, int i4) {
        this.f3433g = i;
        this.f3434h = i2;
        this.f3435i = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f3436j = "com.google.android.gms";
        } else {
            this.f3436j = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                C1929n k = C1929n.C1930a.m2662k(iBinder);
                int i5 = C1887a.f3364a;
                if (k != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        account2 = k.mo12263a();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            this.f3440n = account2;
        } else {
            this.f3437k = iBinder;
            this.f3440n = account;
        }
        this.f3438l = scopeArr;
        this.f3439m = bundle;
        this.f3441o = dVarArr;
        this.f3442p = dVarArr2;
        this.f3443q = z;
        this.f3444r = i4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        int i2 = this.f3433g;
        C0823f.m333B0(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.f3434h;
        C0823f.m333B0(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = this.f3435i;
        C0823f.m333B0(parcel, 3, 4);
        parcel.writeInt(i4);
        C0823f.m395s0(parcel, 4, this.f3436j, false);
        C0823f.m389p0(parcel, 5, this.f3437k, false);
        C0823f.m399u0(parcel, 6, this.f3438l, i, false);
        C0823f.m385n0(parcel, 7, this.f3439m, false);
        C0823f.m393r0(parcel, 8, this.f3440n, i, false);
        C0823f.m399u0(parcel, 10, this.f3441o, i, false);
        C0823f.m399u0(parcel, 11, this.f3442p, i, false);
        boolean z = this.f3443q;
        C0823f.m333B0(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = this.f3444r;
        C0823f.m333B0(parcel, 13, 4);
        parcel.writeInt(i5);
        C0823f.m331A0(parcel, w0);
    }
}
