package android.support.p001v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.media.MediaBrowserCompatUtils;
import androidx.media.MediaBrowserProtocol;
import androidx.media.MediaBrowserServiceCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p352f.p353a.p355b.p357b.C6938a;
import p352f.p353a.p355b.p357b.C6939b;
import p352f.p353a.p355b.p357b.C6940c;
import p352f.p353a.p355b.p357b.C6941d;
import p352f.p353a.p355b.p357b.C6942e;
import p352f.p353a.p355b.p357b.C6943f;
import p352f.p353a.p355b.p359c.C6959b;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {

    /* renamed from: b */
    public static final boolean f0b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a */
    public final C0006c f1a;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    public static class CustomActionResultReceiver extends C6959b {
        /* renamed from: a */
        public void mo1a(int i, Bundle bundle) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    public static class ItemReceiver extends C6959b {
        /* renamed from: a */
        public void mo1a(int i, Bundle bundle) {
            MediaSessionCompat.m27a(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_MEDIA_ITEM)) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM);
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                MediaItem mediaItem = (MediaItem) parcelable;
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new C0001a();

        /* renamed from: g */
        public final int f2g;

        /* renamed from: h */
        public final MediaDescriptionCompat f3h;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
        public static class C0001a implements Parcelable.Creator<MediaItem> {
            public Object createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            public Object[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(Parcel parcel) {
            this.f2g = parcel.readInt();
            this.f3h = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public MediaItem(@NonNull MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.f22g)) {
                this.f2g = i;
                this.f3h = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        /* renamed from: a */
        public static List<MediaItem> m4a(List<?> list) {
            MediaItem mediaItem;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object next : list) {
                if (next != null) {
                    MediaBrowser.MediaItem mediaItem2 = (MediaBrowser.MediaItem) next;
                    mediaItem = new MediaItem(MediaDescriptionCompat.m19a(mediaItem2.getDescription()), mediaItem2.getFlags());
                } else {
                    mediaItem = null;
                }
                arrayList.add(mediaItem);
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{" + "mFlags=" + this.f2g + ", mDescription=" + this.f3h + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2g);
            this.f3h.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    public static class SearchResultReceiver extends C6959b {
        /* renamed from: a */
        public void mo1a(int i, Bundle bundle) {
            MediaSessionCompat.m27a(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS)) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS);
            if (parcelableArray != null) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            }
            throw null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    public static class C0002a extends Handler {

        /* renamed from: a */
        public final WeakReference<C0010g> f4a;

        /* renamed from: b */
        public WeakReference<Messenger> f5b;

        public C0002a(C0010g gVar) {
            this.f4a = new WeakReference<>(gVar);
        }

        /* renamed from: a */
        public void mo7a(Messenger messenger) {
            this.f5b = new WeakReference<>(messenger);
        }

        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f5b;
            if (weakReference != null && weakReference.get() != null && this.f4a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.m27a(data);
                C0010g gVar = (C0010g) this.f4a.get();
                Messenger messenger = (Messenger) this.f5b.get();
                try {
                    int i = message.what;
                    if (i == 1) {
                        Bundle bundle = data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS);
                        MediaSessionCompat.m27a(bundle);
                        gVar.mo14b(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), (MediaSessionCompat.Token) data.getParcelable(MediaBrowserProtocol.DATA_MEDIA_SESSION_TOKEN), bundle);
                    } else if (i == 2) {
                        gVar.mo13a(messenger);
                    } else if (i != 3) {
                        Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: " + 1 + "\n  Service version: " + message.arg1);
                    } else {
                        Bundle bundle2 = data.getBundle(MediaBrowserProtocol.DATA_OPTIONS);
                        MediaSessionCompat.m27a(bundle2);
                        Bundle bundle3 = data.getBundle(MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS);
                        MediaSessionCompat.m27a(bundle3);
                        gVar.mo15c(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), data.getParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                    if (message.what == 1) {
                        gVar.mo13a(messenger);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static class C0003b {
        public C0004a mConnectionCallbackInternal;
        public final Object mConnectionCallbackObj = new C6939b(new C0005b());

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$a */
        public interface C0004a {
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b */
        public class C0005b implements C6938a {
            public C0005b() {
            }
        }

        public void onConnected() {
            throw null;
        }

        public void onConnectionFailed() {
            throw null;
        }

        public void onConnectionSuspended() {
            throw null;
        }

        public void setInternalConnectionCallback(C0004a aVar) {
            this.mConnectionCallbackInternal = aVar;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public interface C0006c {
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    public static class C0007d implements C0006c, C0010g, C0003b.C0004a {

        /* renamed from: a */
        public final Context f7a;

        /* renamed from: b */
        public final Object f8b;

        /* renamed from: c */
        public final Bundle f9c;

        /* renamed from: d */
        public final C0002a f10d = new C0002a(this);

        /* renamed from: e */
        public final ArrayMap<String, C0012i> f11e = new ArrayMap<>();

        /* renamed from: f */
        public C0011h f12f;

        /* renamed from: g */
        public Messenger f13g;

        /* renamed from: h */
        public MediaSessionCompat.Token f14h;

        public C0007d(Context context, ComponentName componentName, C0003b bVar, Bundle bundle) {
            Bundle bundle2;
            this.f7a = context;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            this.f9c = bundle2;
            bundle2.putInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 1);
            bVar.setInternalConnectionCallback(this);
            this.f8b = new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) bVar.mConnectionCallbackObj, bundle2);
        }

        /* renamed from: a */
        public void mo13a(Messenger messenger) {
        }

        /* renamed from: b */
        public void mo14b(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        /* renamed from: c */
        public void mo15c(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f13g == messenger) {
                C0012i iVar = this.f11e.get(str);
                if (iVar != null) {
                    iVar.mo17a(bundle);
                } else if (MediaBrowserCompat.f0b) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                }
            }
        }
    }

    @RequiresApi(23)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    public static class C0008e extends C0007d {
        public C0008e(Context context, ComponentName componentName, C0003b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    @RequiresApi(26)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    public static class C0009f extends C0008e {
        public C0009f(Context context, ComponentName componentName, C0003b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    public interface C0010g {
        /* renamed from: a */
        void mo13a(Messenger messenger);

        /* renamed from: b */
        void mo14b(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        /* renamed from: c */
        void mo15c(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    public static class C0011h {

        /* renamed from: a */
        public Messenger f15a;

        /* renamed from: b */
        public Bundle f16b;

        public C0011h(IBinder iBinder, Bundle bundle) {
            this.f15a = new Messenger(iBinder);
            this.f16b = bundle;
        }

        /* renamed from: a */
        public final void mo16a(int i, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f15a.send(obtain);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    public static class C0012i {

        /* renamed from: a */
        public final List<C0013j> f17a = new ArrayList();

        /* renamed from: b */
        public final List<Bundle> f18b = new ArrayList();

        /* renamed from: a */
        public C0013j mo17a(Bundle bundle) {
            for (int i = 0; i < this.f18b.size(); i++) {
                if (MediaBrowserCompatUtils.areSameOptions(this.f18b.get(i), bundle)) {
                    return this.f17a.get(i);
                }
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$j */
    public static abstract class C0013j {

        /* renamed from: a */
        public final IBinder f19a = new Binder();

        /* renamed from: android.support.v4.media.MediaBrowserCompat$j$a */
        public class C0014a implements C6940c {
            public C0014a() {
            }

            /* renamed from: c */
            public void mo18c(@NonNull String str, List<?> list) {
                Objects.requireNonNull(C0013j.this);
                C0013j jVar = C0013j.this;
                MediaItem.m4a(list);
                Objects.requireNonNull(jVar);
            }

            /* renamed from: d */
            public void mo19d(@NonNull String str) {
                Objects.requireNonNull(C0013j.this);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$j$b */
        public class C0015b extends C0014a implements C6942e {
            public C0015b() {
                super();
            }

            /* renamed from: a */
            public void mo20a(@NonNull String str, List<?> list, @NonNull Bundle bundle) {
                C0013j jVar = C0013j.this;
                MediaItem.m4a(list);
                Objects.requireNonNull(jVar);
            }

            /* renamed from: b */
            public void mo21b(@NonNull String str, @NonNull Bundle bundle) {
                Objects.requireNonNull(C0013j.this);
            }
        }

        public C0013j() {
            if (Build.VERSION.SDK_INT >= 26) {
                new C6943f(new C0015b());
            } else {
                new C6941d(new C0014a());
            }
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0003b bVar, Bundle bundle) {
        this.f1a = Build.VERSION.SDK_INT >= 26 ? new C0009f(context, componentName, bVar, (Bundle) null) : new C0008e(context, componentName, bVar, (Bundle) null);
    }
}
