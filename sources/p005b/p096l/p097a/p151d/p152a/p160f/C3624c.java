package p005b.p096l.p097a.p151d.p152a.p160f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p005b.p096l.p097a.p151d.p152a.p159e.C3584f;

/* renamed from: b.l.a.d.a.f.c */
public abstract class C3624c<StateT> {

    /* renamed from: a */
    public final C3584f f6683a;

    /* renamed from: b */
    public final IntentFilter f6684b;

    /* renamed from: c */
    public final Context f6685c;

    /* renamed from: d */
    public final Set<C3622a<StateT>> f6686d = new HashSet();
    @Nullable

    /* renamed from: e */
    public C3623b f6687e = null;

    /* renamed from: f */
    public volatile boolean f6688f = false;

    public C3624c(C3584f fVar, IntentFilter intentFilter, Context context) {
        this.f6683a = fVar;
        this.f6684b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f6685c = applicationContext != null ? applicationContext : context;
    }

    /* renamed from: a */
    public abstract void mo14734a(Context context, Intent intent);

    /* renamed from: b */
    public final void mo14915b() {
        C3623b bVar;
        if ((this.f6688f || !this.f6686d.isEmpty()) && this.f6687e == null) {
            C3623b bVar2 = new C3623b(this);
            this.f6687e = bVar2;
            this.f6685c.registerReceiver(bVar2, this.f6684b);
        }
        if (!this.f6688f && this.f6686d.isEmpty() && (bVar = this.f6687e) != null) {
            this.f6685c.unregisterReceiver(bVar);
            this.f6687e = null;
        }
    }

    /* renamed from: c */
    public final synchronized void mo14916c(StateT statet) {
        Iterator it = new HashSet(this.f6686d).iterator();
        while (it.hasNext()) {
            ((C3622a) it.next()).mo10457a(statet);
        }
    }
}
