package p005b.p096l.p180d.p213v;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: b.l.d.v.k */
public final class C4251k {

    /* renamed from: a */
    public final Messenger f7868a;

    /* renamed from: b */
    public final C4260o0 f7869b;

    public C4251k(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f7868a = new Messenger(iBinder);
            this.f7869b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f7869b = new C4260o0(iBinder);
            this.f7868a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }
}
