package android.support.p001v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.core.app.BundleCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p352f.p353a.p355b.p357b.p358g.C6946b;
import p352f.p353a.p355b.p357b.p358g.C6949c;

@RequiresApi(21)
/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
public class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a */
    public final Object f35a;

    /* renamed from: b */
    public final Object f36b = new Object();
    @GuardedBy("mLock")

    /* renamed from: c */
    public final List<C6949c> f37c = new ArrayList();

    /* renamed from: d */
    public HashMap<C6949c, C0019a> f38d = new HashMap<>();

    /* renamed from: e */
    public final MediaSessionCompat.Token f39e;

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: g */
        public WeakReference<MediaControllerCompat$MediaControllerImplApi21> f40g;

        public ExtraBinderRequestResultReceiver(MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21) {
            super((Handler) null);
            this.f40g = new WeakReference<>(mediaControllerCompat$MediaControllerImplApi21);
        }

        public void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = (MediaControllerCompat$MediaControllerImplApi21) this.f40g.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.f36b) {
                    mediaControllerCompat$MediaControllerImplApi21.f39e.f46h = C6946b.C6947a.m12544g(BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                    MediaSessionCompat.Token token = mediaControllerCompat$MediaControllerImplApi21.f39e;
                    bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE");
                    Objects.requireNonNull(token);
                    mediaControllerCompat$MediaControllerImplApi21.mo36a();
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
    public static class C0019a extends C6949c.C6951b {
        public C0019a(C6949c cVar) {
            super(cVar);
        }

        /* renamed from: A */
        public void mo38A() {
            throw new AssertionError();
        }

        /* renamed from: B */
        public void mo39B(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        /* renamed from: i0 */
        public void mo40i0(Bundle bundle) {
            throw new AssertionError();
        }

        /* renamed from: m1 */
        public void mo41m1(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        /* renamed from: o0 */
        public void mo42o0(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        /* renamed from: s */
        public void mo43s(CharSequence charSequence) {
            throw new AssertionError();
        }
    }

    public MediaControllerCompat$MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
        this.f39e = token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) token.f45g);
        this.f35a = mediaController;
        if (token.f46h == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", (Bundle) null, new ExtraBinderRequestResultReceiver(this));
        }
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public void mo36a() {
        if (this.f39e.f46h != null) {
            for (C6949c next : this.f37c) {
                C0019a aVar = new C0019a(next);
                this.f38d.put(next, aVar);
                next.f13952a = aVar;
                try {
                    this.f39e.f46h.mo24327y(aVar);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            }
            this.f37c.clear();
        }
    }
}
