package p005b.p096l.p180d.p213v;

import android.os.Bundle;
import android.util.Log;
import p005b.p096l.p097a.p113c.p150j.C3429i;

/* renamed from: b.l.d.v.m */
public abstract class C4255m<T> {

    /* renamed from: a */
    public final int f7879a;

    /* renamed from: b */
    public final C3429i<T> f7880b = new C3429i<>();

    /* renamed from: c */
    public final int f7881c;

    /* renamed from: d */
    public final Bundle f7882d;

    public C4255m(int i, int i2, Bundle bundle) {
        this.f7879a = i;
        this.f7881c = i2;
        this.f7882d = bundle;
    }

    /* renamed from: a */
    public final void mo15847a(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 16);
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f7880b.f6197a.mo14695q(t);
    }

    /* renamed from: b */
    public final void mo15848b(C4262p pVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(pVar);
            StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 14);
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f7880b.f6197a.mo14694p(pVar);
    }

    /* renamed from: c */
    public abstract boolean mo15849c();

    /* renamed from: d */
    public abstract void mo15850d(Bundle bundle);

    public String toString() {
        int i = this.f7881c;
        int i2 = this.f7879a;
        boolean c = mo15849c();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
