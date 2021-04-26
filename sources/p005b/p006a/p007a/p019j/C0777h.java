package p005b.p006a.p007a.p019j;

import android.media.MediaPlayer;
import android.os.Handler;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.j.h */
public final class C0777h {

    /* renamed from: a */
    public final String f542a;

    /* renamed from: b */
    public final String f543b;

    /* renamed from: c */
    public final MediaPlayer f544c;

    /* renamed from: d */
    public Handler f545d;

    /* renamed from: e */
    public boolean f546e;

    public C0777h(String str, String str2, MediaPlayer mediaPlayer, Handler handler, boolean z) {
        C6888i.m12438e(mediaPlayer, "mediaPlayer");
        C6888i.m12438e(handler, "handler");
        this.f542a = str;
        this.f543b = str2;
        this.f544c = mediaPlayer;
        this.f545d = handler;
        this.f546e = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0777h)) {
            return false;
        }
        C0777h hVar = (C0777h) obj;
        return C6888i.m12434a(this.f542a, hVar.f542a) && C6888i.m12434a(this.f543b, hVar.f543b) && C6888i.m12434a(this.f544c, hVar.f544c) && C6888i.m12434a(this.f545d, hVar.f545d) && this.f546e == hVar.f546e;
    }

    public int hashCode() {
        String str = this.f542a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f543b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        MediaPlayer mediaPlayer = this.f544c;
        int hashCode3 = (hashCode2 + (mediaPlayer != null ? mediaPlayer.hashCode() : 0)) * 31;
        Handler handler = this.f545d;
        if (handler != null) {
            i = handler.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.f546e;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("MediaPlayerInContainer(audioUrl=");
        u.append(this.f542a);
        u.append(", containerId=");
        u.append(this.f543b);
        u.append(", mediaPlayer=");
        u.append(this.f544c);
        u.append(", handler=");
        u.append(this.f545d);
        u.append(", runInBackground=");
        u.append(this.f546e);
        u.append(")");
        return u.toString();
    }
}
