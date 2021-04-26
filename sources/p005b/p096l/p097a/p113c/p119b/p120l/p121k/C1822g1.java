package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1817g;

/* renamed from: b.l.a.c.b.l.k.g1 */
public abstract class C1822g1 {
    public C1822g1(int i) {
    }

    /* renamed from: d */
    public static Status m2447d(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (remoteException instanceof TransactionTooLargeException) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    /* renamed from: a */
    public abstract void mo12124a(@NonNull Status status);

    /* renamed from: b */
    public abstract void mo12125b(@NonNull C1804c2 c2Var, boolean z);

    /* renamed from: c */
    public abstract void mo12126c(@NonNull RuntimeException runtimeException);

    /* renamed from: e */
    public abstract void mo12127e(C1817g.C1818a<?> aVar);
}
