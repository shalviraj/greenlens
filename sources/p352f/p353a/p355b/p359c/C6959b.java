package p352f.p353a.p355b.p359c;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import java.util.Objects;
import p352f.p353a.p355b.p359c.C6956a;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: f.a.b.c.b */
public class C6959b implements Parcelable {
    public static final Parcelable.Creator<C6959b> CREATOR = new C6960a();

    /* renamed from: g */
    public C6956a f13958g;

    /* renamed from: f.a.b.c.b$a */
    public class C6960a implements Parcelable.Creator<C6959b> {
        public Object createFromParcel(Parcel parcel) {
            return new C6959b(parcel);
        }

        public Object[] newArray(int i) {
            return new C6959b[i];
        }
    }

    /* renamed from: f.a.b.c.b$b */
    public class C6961b extends C6956a.C6957a {
        public C6961b() {
        }

        /* renamed from: j1 */
        public void mo24338j1(int i, Bundle bundle) {
            Objects.requireNonNull(C6959b.this);
            C6959b.this.mo1a(i, bundle);
        }
    }

    public C6959b(Parcel parcel) {
        C6956a aVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i = C6956a.C6957a.f13956a;
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C6956a)) ? new C6956a.C6957a.C6958a(readStrongBinder) : (C6956a) queryLocalInterface;
        }
        this.f13958g = aVar;
    }

    /* renamed from: a */
    public void mo1a(int i, Bundle bundle) {
    }

    /* renamed from: b */
    public void mo24342b(int i, Bundle bundle) {
        C6956a aVar = this.f13958g;
        if (aVar != null) {
            try {
                aVar.mo24338j1(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f13958g == null) {
                this.f13958g = new C6961b();
            }
            parcel.writeStrongBinder(this.f13958g.asBinder());
        }
    }
}
