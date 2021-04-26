package p352f.p353a.p355b.p357b;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.p001v4.media.session.MediaSessionCompat;
import androidx.annotation.NonNull;
import java.util.List;
import p352f.p353a.p355b.p357b.C6942e;

/* renamed from: f.a.b.b.f */
public class C6943f<T extends C6942e> extends C6941d<T> {
    public C6943f(T t) {
        super(t);
    }

    public void onChildrenLoaded(@NonNull String str, List<MediaBrowser.MediaItem> list, @NonNull Bundle bundle) {
        MediaSessionCompat.m27a(bundle);
        ((C6942e) this.f13950a).mo20a(str, list, bundle);
    }

    public void onError(@NonNull String str, @NonNull Bundle bundle) {
        MediaSessionCompat.m27a(bundle);
        ((C6942e) this.f13950a).mo21b(str, bundle);
    }
}
