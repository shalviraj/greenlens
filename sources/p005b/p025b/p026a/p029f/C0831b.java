package p005b.p025b.p026a.p029f;

import android.content.Context;
import android.view.View;
import androidx.annotation.DimenRes;
import androidx.annotation.RestrictTo;
import com.segment.analytics.integrations.BasePayload;
import p298d.p344x.p346c.C6888i;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: b.b.a.f.b */
public final class C0831b {

    /* renamed from: a */
    public static final C0831b f661a = new C0831b();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public final <T extends View> int mo10658a(T t, @DimenRes int i) {
        C6888i.m12439f(t, "$this$dimenPx");
        Context context = t.getContext();
        C6888i.m12435b(context, BasePayload.CONTEXT_KEY);
        return context.getResources().getDimensionPixelSize(i);
    }
}
