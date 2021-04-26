package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a.C1772b;
import p005b.p096l.p097a.p113c.p119b.p120l.C1789h;
import p005b.p096l.p097a.p113c.p119b.p122m.C1947u;

/* renamed from: b.l.a.c.b.l.k.d */
public abstract class C1805d<R extends C1789h, A extends C1770a.C1772b> extends BasePendingResult<R> implements C1809e<R> {

    /* renamed from: o */
    public final C1770a.C1773c<A> f3158o;

    /* renamed from: p */
    public final C1770a<?> f3159p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1805d(@NonNull C1770a<?> aVar, @NonNull GoogleApiClient googleApiClient) {
        super(googleApiClient);
        C0823f.m380l(googleApiClient, "GoogleApiClient must not be null");
        C0823f.m380l(aVar, "Api must not be null");
        this.f3158o = aVar.mo12012a();
        this.f3159p = aVar;
    }

    /* renamed from: j */
    public abstract void mo12072j(@NonNull A a);

    /* renamed from: k */
    public final void mo12073k(@NonNull A a) {
        if (a instanceof C1947u) {
            Objects.requireNonNull((C1947u) a);
            a = null;
        }
        try {
            mo12072j(a);
        } catch (DeadObjectException e) {
            mo12074l(new Status(1, 8, e.getLocalizedMessage(), (PendingIntent) null));
            throw e;
        } catch (RemoteException e2) {
            mo12074l(new Status(1, 8, e2.getLocalizedMessage(), (PendingIntent) null));
        }
    }

    /* renamed from: l */
    public final void mo12074l(@NonNull Status status) {
        C0823f.m362c(!status.mo18856V(), "Failed result must not be success");
        mo18865e(mo13164b(status));
    }
}
