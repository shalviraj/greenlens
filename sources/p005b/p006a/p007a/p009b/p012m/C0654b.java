package p005b.p006a.p007a.p009b.p012m;

import android.media.MediaPlayer;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.b.m.b */
public final class C0654b implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C0647a f352g;

    public C0654b(C0647a aVar) {
        this.f352g = aVar;
    }

    public final void run() {
        MediaPlayer mediaPlayer = this.f352g.f330g;
        if (mediaPlayer != null) {
            C6888i.m12436c(mediaPlayer);
            mediaPlayer.reset();
            MediaPlayer mediaPlayer2 = this.f352g.f330g;
            C6888i.m12436c(mediaPlayer2);
            mediaPlayer2.release();
            this.f352g.f330g = null;
        }
    }
}
