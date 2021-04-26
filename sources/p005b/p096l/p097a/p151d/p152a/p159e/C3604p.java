package p005b.p096l.p097a.p151d.p152a.p159e;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: b.l.a.d.a.e.p */
public final class C3604p<T extends IInterface> {

    /* renamed from: l */
    public static final Map<String, Handler> f6662l = new HashMap();

    /* renamed from: a */
    public final Context f6663a;

    /* renamed from: b */
    public final C3584f f6664b;

    /* renamed from: c */
    public final String f6665c;

    /* renamed from: d */
    public final List<C3586g> f6666d = new ArrayList();

    /* renamed from: e */
    public boolean f6667e;

    /* renamed from: f */
    public final Intent f6668f;

    /* renamed from: g */
    public final C3596l<T> f6669g;

    /* renamed from: h */
    public final WeakReference<C3594k> f6670h;

    /* renamed from: i */
    public final IBinder.DeathRecipient f6671i = new C3588h(this);
    @Nullable

    /* renamed from: j */
    public ServiceConnection f6672j;
    @Nullable

    /* renamed from: k */
    public T f6673k;

    public C3604p(Context context, C3584f fVar, String str, Intent intent, C3596l<T> lVar) {
        this.f6663a = context;
        this.f6664b = fVar;
        this.f6665c = str;
        this.f6668f = intent;
        this.f6669g = lVar;
        this.f6670h = new WeakReference<>((Object) null);
    }

    /* renamed from: a */
    public final void mo14904a(C3586g gVar) {
        mo14906c(new C3590i(this, gVar.f6649g, gVar));
    }

    /* renamed from: b */
    public final void mo14905b() {
        mo14906c(new C3592j(this));
    }

    /* renamed from: c */
    public final void mo14906c(C3586g gVar) {
        Handler handler;
        Map<String, Handler> map = f6662l;
        synchronized (map) {
            if (!map.containsKey(this.f6665c)) {
                HandlerThread handlerThread = new HandlerThread(this.f6665c, 10);
                handlerThread.start();
                map.put(this.f6665c, new Handler(handlerThread.getLooper()));
            }
            handler = map.get(this.f6665c);
        }
        handler.post(gVar);
    }
}
