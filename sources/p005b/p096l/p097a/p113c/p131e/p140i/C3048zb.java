package p005b.p096l.p097a.p113c.p131e.p140i;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: b.l.a.c.e.i.zb */
public final class C3048zb extends C2706a implements C2733bc {
    public C3048zb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: a0 */
    public final void mo13254a0(String str, String str2, Bundle bundle, long j) {
        Parcel g = mo13211g();
        g.writeString(str);
        g.writeString(str2);
        C2894o0.m5008b(g, bundle);
        g.writeLong(j);
        mo13212k(1, g);
    }

    /* renamed from: e */
    public final int mo13255e() {
        Parcel n = mo13213n(2, mo13211g());
        int readInt = n.readInt();
        n.recycle();
        return readInt;
    }
}
