package p005b.p096l.p180d.p213v;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;
import p005b.p096l.p097a.p113c.p150j.C3414a;
import p005b.p096l.p097a.p113c.p150j.C3428h;

/* renamed from: b.l.d.v.u0 */
public final class C4273u0 implements C3414a<Bundle, String> {

    /* renamed from: a */
    public final /* synthetic */ C4271t0 f7913a;

    public C4273u0(C4271t0 t0Var) {
        this.f7913a = t0Var;
    }

    /* renamed from: a */
    public final Object mo14670a(@NonNull C3428h hVar) {
        Bundle bundle = (Bundle) hVar.mo14689k(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null || (string = bundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = bundle.getString("error");
            if ("RST".equals(string2)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string2 != null) {
                throw new IOException(string2);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(valueOf.length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
