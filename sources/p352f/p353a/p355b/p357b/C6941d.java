package p352f.p353a.p355b.p357b;

import android.media.browse.MediaBrowser;
import androidx.annotation.NonNull;
import java.util.List;
import p352f.p353a.p355b.p357b.C6940c;

/* renamed from: f.a.b.b.d */
public class C6941d<T extends C6940c> extends MediaBrowser.SubscriptionCallback {

    /* renamed from: a */
    public final T f13950a;

    public C6941d(T t) {
        this.f13950a = t;
    }

    public void onChildrenLoaded(@NonNull String str, List<MediaBrowser.MediaItem> list) {
        this.f13950a.mo18c(str, list);
    }

    public void onError(@NonNull String str) {
        this.f13950a.mo19d(str);
    }
}
