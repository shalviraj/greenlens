package p005b.p096l.p180d.p191q;

import android.util.Log;
import androidx.annotation.NonNull;
import p005b.p096l.p097a.p113c.p150j.C3414a;
import p005b.p096l.p097a.p113c.p150j.C3428h;
import p005b.p096l.p180d.p191q.p192f.C3982b;

/* renamed from: b.l.d.q.c */
public class C3978c implements C3414a<Void, Object> {
    /* renamed from: a */
    public Object mo14670a(@NonNull C3428h<Void> hVar) {
        if (hVar.mo14692n()) {
            return null;
        }
        C3982b bVar = C3982b.f7289a;
        Exception i = hVar.mo14687i();
        if (!bVar.mo15495a(6)) {
            return null;
        }
        Log.e("FirebaseCrashlytics", "Error fetching settings.", i);
        return null;
    }
}
