package p352f.p353a.p355b.p357b;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.p001v4.media.MediaBrowserCompat;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.core.app.BundleCompat;
import androidx.media.MediaBrowserProtocol;
import java.util.Objects;
import p352f.p353a.p355b.p357b.C6938a;
import p352f.p353a.p355b.p357b.p358g.C6946b;

/* renamed from: f.a.b.b.b */
public class C6939b<T extends C6938a> extends MediaBrowser.ConnectionCallback {

    /* renamed from: a */
    public final T f13949a;

    public C6939b(T t) {
        this.f13949a = t;
    }

    public void onConnected() {
        MediaBrowserCompat.C0003b.C0005b bVar = (MediaBrowserCompat.C0003b.C0005b) this.f13949a;
        MediaBrowserCompat.C0003b.C0004a aVar = MediaBrowserCompat.C0003b.this.mConnectionCallbackInternal;
        if (aVar != null) {
            MediaBrowserCompat.C0007d dVar = (MediaBrowserCompat.C0007d) aVar;
            Bundle extras = ((MediaBrowser) dVar.f8b).getExtras();
            if (extras != null) {
                extras.getInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 0);
                IBinder binder = BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_MESSENGER_BINDER);
                if (binder != null) {
                    dVar.f12f = new MediaBrowserCompat.C0011h(binder, dVar.f9c);
                    Messenger messenger = new Messenger(dVar.f10d);
                    dVar.f13g = messenger;
                    dVar.f10d.mo7a(messenger);
                    try {
                        MediaBrowserCompat.C0011h hVar = dVar.f12f;
                        Context context = dVar.f7a;
                        Messenger messenger2 = dVar.f13g;
                        Objects.requireNonNull(hVar);
                        Bundle bundle = new Bundle();
                        bundle.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
                        bundle.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, hVar.f16b);
                        hVar.mo16a(6, bundle, messenger2);
                    } catch (RemoteException unused) {
                        Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                    }
                }
                C6946b g = C6946b.C6947a.m12544g(BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_SESSION_BINDER));
                if (g != null) {
                    dVar.f14h = MediaSessionCompat.Token.m28a(((MediaBrowser) dVar.f8b).getSessionToken(), g);
                }
            }
        }
        MediaBrowserCompat.C0003b.this.onConnected();
    }

    public void onConnectionFailed() {
        MediaBrowserCompat.C0003b bVar = MediaBrowserCompat.C0003b.this;
        MediaBrowserCompat.C0003b.C0004a aVar = bVar.mConnectionCallbackInternal;
        if (aVar != null) {
            MediaBrowserCompat.C0007d dVar = (MediaBrowserCompat.C0007d) aVar;
        }
        bVar.onConnectionFailed();
    }

    public void onConnectionSuspended() {
        MediaBrowserCompat.C0003b.C0005b bVar = (MediaBrowserCompat.C0003b.C0005b) this.f13949a;
        MediaBrowserCompat.C0003b.C0004a aVar = MediaBrowserCompat.C0003b.this.mConnectionCallbackInternal;
        if (aVar != null) {
            MediaBrowserCompat.C0007d dVar = (MediaBrowserCompat.C0007d) aVar;
            dVar.f12f = null;
            dVar.f13g = null;
            dVar.f14h = null;
            dVar.f10d.mo7a((Messenger) null);
        }
        MediaBrowserCompat.C0003b.this.onConnectionSuspended();
    }
}
