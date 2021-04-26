package p005b.p096l.p097a.p113c.p119b.p122m;

import android.app.Activity;
import android.content.Intent;

/* renamed from: b.l.a.c.b.m.x */
public final class C1952x extends C1911f {

    /* renamed from: g */
    public final /* synthetic */ Intent f3496g;

    /* renamed from: h */
    public final /* synthetic */ Activity f3497h;

    /* renamed from: i */
    public final /* synthetic */ int f3498i;

    public C1952x(Intent intent, Activity activity, int i) {
        this.f3496g = intent;
        this.f3497h = activity;
        this.f3498i = i;
    }

    /* renamed from: a */
    public final void mo12243a() {
        Intent intent = this.f3496g;
        if (intent != null) {
            this.f3497h.startActivityForResult(intent, this.f3498i);
        }
    }
}
