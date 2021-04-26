package p005b.p096l.p097a.p113c.p119b;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p122m.C1921j0;
import p005b.p096l.p097a.p113c.p129c.C1980b;
import p005b.p096l.p097a.p113c.p129c.C1984d;
import p005b.p096l.p097a.p113c.p131e.p135d.C2017a;
import p005b.p096l.p097a.p113c.p131e.p135d.C2019c;

/* renamed from: b.l.a.c.b.u */
public abstract class C1972u extends C2017a implements C1921j0 {

    /* renamed from: b */
    public static final /* synthetic */ int f3535b = 0;

    /* renamed from: a */
    public int f3536a;

    public C1972u(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        C0823f.m360b(bArr.length == 25);
        this.f3536a = Arrays.hashCode(bArr);
    }

    /* renamed from: n */
    public static byte[] m2887n(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public final C1980b mo12255b() {
        return new C1984d(mo12302k());
    }

    /* renamed from: c */
    public final int mo12256c() {
        return this.f3536a;
    }

    public boolean equals(Object obj) {
        C1980b b;
        if (obj != null && (obj instanceof C1921j0)) {
            try {
                C1921j0 j0Var = (C1921j0) obj;
                if (j0Var.mo12256c() != this.f3536a || (b = j0Var.mo12255b()) == null) {
                    return false;
                }
                return Arrays.equals(mo12302k(), (byte[]) C1984d.m2900n(b));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo12265g(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C1980b b = mo12255b();
            parcel2.writeNoException();
            C2019c.m2942b(parcel2, b);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.f3536a;
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
    }

    public int hashCode() {
        return this.f3536a;
    }

    /* renamed from: k */
    public abstract byte[] mo12302k();
}
