package p352f.p353a.p355b.p357b.p358g;

import android.os.Bundle;
import android.os.IBinder;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.support.p001v4.media.session.ParcelableVolumeInfo;
import java.lang.ref.WeakReference;
import java.util.List;
import p352f.p353a.p355b.p357b.p358g.C6944a;

/* renamed from: f.a.b.b.g.c */
public abstract class C6949c implements IBinder.DeathRecipient {

    /* renamed from: a */
    public C6944a f13952a;

    /* renamed from: f.a.b.b.g.c$a */
    public static class C6950a implements C6954f {

        /* renamed from: a */
        public final WeakReference<C6949c> f13953a;

        public C6950a(C6949c cVar) {
            this.f13953a = new WeakReference<>(cVar);
        }
    }

    /* renamed from: f.a.b.b.g.c$b */
    public static class C6951b extends C6944a.C6945a {

        /* renamed from: a */
        public final WeakReference<C6949c> f13954a;

        public C6951b(C6949c cVar) {
            this.f13954a = new WeakReference<>(cVar);
        }

        /* renamed from: A */
        public void mo38A() {
            C6949c cVar = (C6949c) this.f13954a.get();
        }

        /* renamed from: B */
        public void mo39B(MediaMetadataCompat mediaMetadataCompat) {
            C6949c cVar = (C6949c) this.f13954a.get();
        }

        /* renamed from: i0 */
        public void mo40i0(Bundle bundle) {
            C6949c cVar = (C6949c) this.f13954a.get();
        }

        /* renamed from: m1 */
        public void mo41m1(ParcelableVolumeInfo parcelableVolumeInfo) {
            C6949c cVar = (C6949c) this.f13954a.get();
        }

        /* renamed from: o0 */
        public void mo42o0(List<MediaSessionCompat.QueueItem> list) {
            C6949c cVar = (C6949c) this.f13954a.get();
        }

        /* renamed from: s */
        public void mo43s(CharSequence charSequence) {
            C6949c cVar = (C6949c) this.f13954a.get();
        }
    }

    public C6949c() {
        new C6955g(new C6950a(this));
    }

    public void binderDied() {
    }
}
