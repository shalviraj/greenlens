package p005b.p096l.p097a.p113c.p129c;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* renamed from: b.l.a.c.c.h */
public final class C1988h implements View.OnClickListener {

    /* renamed from: g */
    public final /* synthetic */ Context f3552g;

    /* renamed from: h */
    public final /* synthetic */ Intent f3553h;

    public C1988h(Context context, Intent intent) {
        this.f3552g = context;
        this.f3553h = intent;
    }

    public final void onClick(View view) {
        try {
            this.f3552g.startActivity(this.f3553h);
        } catch (ActivityNotFoundException e) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}
