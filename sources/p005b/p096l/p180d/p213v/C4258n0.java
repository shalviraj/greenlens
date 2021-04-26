package p005b.p096l.p180d.p213v;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b.l.d.v.n0 */
public final class C4258n0 implements Parcelable.Creator<C4260o0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            return new C4260o0(readStrongBinder);
        }
        return null;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4260o0[i];
    }
}
