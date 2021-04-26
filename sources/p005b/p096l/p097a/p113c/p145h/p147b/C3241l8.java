package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import p005b.p096l.p097a.p113c.p131e.p140i.C2775ec;
import p005b.p096l.p097a.p113c.p145h.p147b.C3230k8;

/* renamed from: b.l.a.c.h.b.l8 */
public final class C3241l8<T extends Context & C3230k8> {

    /* renamed from: a */
    public final T f5715a;

    public C3241l8(T t) {
        this.f5715a = t;
    }

    @MainThread
    /* renamed from: a */
    public final boolean mo14395a(Intent intent) {
        if (intent == null) {
            mo14397c().f5799f.mo14414a("onUnbind called with null intent");
            return true;
        }
        mo14397c().f5807n.mo14415b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    @MainThread
    /* renamed from: b */
    public final void mo14396b(Intent intent) {
        if (intent == null) {
            mo14397c().f5799f.mo14414a("onRebind called with null intent");
            return;
        }
        mo14397c().f5807n.mo14415b("onRebind called. action", intent.getAction());
    }

    /* renamed from: c */
    public final C3269o3 mo14397c() {
        return C3281p4.m6272h(this.f5715a, (C2775ec) null, (Long) null).mo14329d();
    }
}
