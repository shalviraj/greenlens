package p005b.p096l.p180d.p213v;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Objects;

/* renamed from: b.l.d.v.o0 */
public class C4260o0 implements Parcelable {
    public static final Parcelable.Creator<C4260o0> CREATOR = new C4258n0();

    /* renamed from: g */
    public Messenger f7884g;

    /* renamed from: b.l.d.v.o0$a */
    public static final class C4261a extends ClassLoader {
        public final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (!FirebaseInstanceId.m10545n()) {
                return C4260o0.class;
            }
            Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            return C4260o0.class;
        }
    }

    public C4260o0(IBinder iBinder) {
        this.f7884g = new Messenger(iBinder);
    }

    /* renamed from: a */
    public final IBinder mo15855a() {
        Messenger messenger = this.f7884g;
        Objects.requireNonNull(messenger);
        return messenger.getBinder();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return mo15855a().equals(((C4260o0) obj).mo15855a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return mo15855a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f7884g;
        Objects.requireNonNull(messenger);
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
