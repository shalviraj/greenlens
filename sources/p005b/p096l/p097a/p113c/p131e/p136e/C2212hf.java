package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p124n.C1955a;
import p005b.p096l.p180d.p185o.C3919n0;
import p005b.p096l.p180d.p185o.C3938x;

/* renamed from: b.l.a.c.e.e.hf */
public final class C2212hf implements C2116dj<C2604xl> {

    /* renamed from: a */
    public final /* synthetic */ C2116dj f3916a;

    /* renamed from: b */
    public final /* synthetic */ C2237if f3917b;

    public C2212hf(C2237if ifVar, C2116dj djVar) {
        this.f3917b = ifVar;
        this.f3916a = djVar;
    }

    /* renamed from: a */
    public final void mo12389a(Object obj) {
        C2604xl xlVar = (C2604xl) obj;
        if (!TextUtils.isEmpty(xlVar.f4467k)) {
            Status status = new Status(17025);
            C2648zh zhVar = this.f3917b.f3940b;
            C3938x xVar = new C3938x((String) null, (String) null, false, xlVar.f4468l, true, xlVar.f4467k, (String) null);
            Objects.requireNonNull(zhVar);
            try {
                zhVar.f4530a.mo12403i1(status, xVar);
            } catch (RemoteException e) {
                C1955a aVar = zhVar.f4531b;
                Log.e(aVar.f3501a, aVar.mo12284c("RemoteException when sending failure result.", new Object[0]), e);
            }
        } else {
            this.f3917b.f3941c.mo12748f(new C2363nk(xlVar.f4464h, xlVar.f4463g, Long.valueOf(xlVar.f4465i), "Bearer"), (String) null, "phone", Boolean.valueOf(xlVar.f4466j), (C3919n0) null, this.f3917b.f3940b, this.f3916a);
        }
    }

    /* renamed from: d */
    public final void mo12390d(@Nullable String str) {
        this.f3916a.mo12390d(str);
    }
}
