package p005b.p096l.p097a.p113c.p119b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.C1921j0;
import p005b.p096l.p097a.p113c.p119b.p122m.C1924k0;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;
import p005b.p096l.p097a.p113c.p129c.C1980b;
import p005b.p096l.p097a.p113c.p129c.C1984d;

/* renamed from: b.l.a.c.b.a0 */
public final class C1753a0 extends C1948a {
    public static final Parcelable.Creator<C1753a0> CREATOR = new C1759d0();

    /* renamed from: g */
    public final String f3089g;

    /* renamed from: h */
    public final C1972u f3090h;

    /* renamed from: i */
    public final boolean f3091i;

    /* renamed from: j */
    public final boolean f3092j;

    public C1753a0(String str, IBinder iBinder, boolean z, boolean z2) {
        this.f3089g = str;
        C1975x xVar = null;
        if (iBinder != null) {
            try {
                int i = C1972u.f3535b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                C1980b b = (queryLocalInterface instanceof C1921j0 ? (C1921j0) queryLocalInterface : new C1924k0(iBinder)).mo12255b();
                byte[] bArr = b == null ? null : (byte[]) C1984d.m2900n(b);
                if (bArr != null) {
                    xVar = new C1975x(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.f3090h = xVar;
        this.f3091i = z;
        this.f3092j = z2;
    }

    public C1753a0(String str, C1972u uVar, boolean z, boolean z2) {
        this.f3089g = str;
        this.f3090h = uVar;
        this.f3091i = z;
        this.f3092j = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int w0 = C0823f.m403w0(parcel, 20293);
        C0823f.m395s0(parcel, 1, this.f3089g, false);
        C1972u uVar = this.f3090h;
        if (uVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            uVar = null;
        } else {
            Objects.requireNonNull(uVar);
        }
        C0823f.m389p0(parcel, 2, uVar, false);
        boolean z = this.f3091i;
        C0823f.m333B0(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f3092j;
        C0823f.m333B0(parcel, 4, 4);
        parcel.writeInt(z2 ? 1 : 0);
        C0823f.m331A0(parcel, w0);
    }
}
