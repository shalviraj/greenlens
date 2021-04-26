package p005b.p096l.p097a.p113c.p119b.p122m;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p131e.p134c.C2016c;

/* renamed from: b.l.a.c.b.m.j */
public final class C1919j implements Handler.Callback {

    /* renamed from: a */
    public final C1920a f3456a;

    /* renamed from: b */
    public final ArrayList<GoogleApiClient.C5470b> f3457b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<GoogleApiClient.C5470b> f3458c = new ArrayList<>();

    /* renamed from: d */
    public final ArrayList<GoogleApiClient.C5471c> f3459d = new ArrayList<>();

    /* renamed from: e */
    public volatile boolean f3460e = false;

    /* renamed from: f */
    public final AtomicInteger f3461f = new AtomicInteger(0);

    /* renamed from: g */
    public boolean f3462g = false;

    /* renamed from: h */
    public final Handler f3463h;

    /* renamed from: i */
    public final Object f3464i = new Object();

    /* renamed from: b.l.a.c.b.m.j$a */
    public interface C1920a {
        /* renamed from: a */
        boolean mo12130a();

        /* renamed from: u */
        Bundle mo12131u();
    }

    public C1919j(Looper looper, C1920a aVar) {
        this.f3456a = aVar;
        this.f3463h = new C2016c(looper, this);
    }

    /* renamed from: a */
    public final void mo12252a() {
        this.f3460e = false;
        this.f3461f.incrementAndGet();
    }

    /* renamed from: b */
    public final void mo12253b(GoogleApiClient.C5471c cVar) {
        Objects.requireNonNull(cVar, "null reference");
        synchronized (this.f3464i) {
            if (this.f3459d.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f3459d.add(cVar);
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            GoogleApiClient.C5470b bVar = (GoogleApiClient.C5470b) message.obj;
            synchronized (this.f3464i) {
                if (this.f3460e && this.f3456a.mo12130a() && this.f3457b.contains(bVar)) {
                    bVar.mo12087k(this.f3456a.mo12131u());
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", C0843a.m438N(45, "Don't know how to handle message: ", i), new Exception());
        return false;
    }
}
