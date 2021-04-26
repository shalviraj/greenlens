package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p124n.C1955a;
import p005b.p096l.p180d.p185o.C3938x;

/* renamed from: b.l.a.c.e.e.zh */
public class C2648zh {

    /* renamed from: a */
    public final C2313li f4530a;

    /* renamed from: b */
    public final C1955a f4531b;

    public C2648zh(C2313li liVar, C1955a aVar) {
        Objects.requireNonNull(liVar, "null reference");
        this.f4530a = liVar;
        Objects.requireNonNull(aVar, "null reference");
        this.f4531b = aVar;
    }

    /* renamed from: a */
    public final void mo13137a(C2363nk nkVar, C2192gk gkVar) {
        try {
            this.f4530a.mo12401f1(nkVar, gkVar);
        } catch (RemoteException e) {
            C1955a aVar = this.f4531b;
            Log.e(aVar.f3501a, aVar.mo12284c("RemoteException when sending get token and account info user response", new Object[0]), e);
        }
    }

    /* renamed from: b */
    public final void mo13138b(@Nullable C2627yk ykVar) {
        try {
            this.f4530a.mo12409t(ykVar);
        } catch (RemoteException e) {
            C1955a aVar = this.f4531b;
            Log.e(aVar.f3501a, aVar.mo12284c("RemoteException when sending password reset response.", new Object[0]), e);
        }
    }

    /* renamed from: c */
    public void mo12770c(String str) {
        try {
            this.f4530a.mo12407m(str);
        } catch (RemoteException e) {
            C1955a aVar = this.f4531b;
            Log.e(aVar.f3501a, aVar.mo12284c("RemoteException when sending send verification code response.", new Object[0]), e);
        }
    }

    /* renamed from: d */
    public final void mo13139d(C3938x xVar) {
        try {
            this.f4530a.mo12397I(xVar);
        } catch (RemoteException e) {
            C1955a aVar = this.f4531b;
            Log.e(aVar.f3501a, aVar.mo12284c("RemoteException when sending verification completed response.", new Object[0]), e);
        }
    }

    /* renamed from: e */
    public final void mo13140e(String str) {
        try {
            this.f4530a.mo12396H0(str);
        } catch (RemoteException e) {
            C1955a aVar = this.f4531b;
            Log.e(aVar.f3501a, aVar.mo12284c("RemoteException when sending auto retrieval timeout response.", new Object[0]), e);
        }
    }

    /* renamed from: f */
    public void mo12771f(Status status) {
        try {
            this.f4530a.mo12399Z0(status);
        } catch (RemoteException e) {
            C1955a aVar = this.f4531b;
            Log.e(aVar.f3501a, aVar.mo12284c("RemoteException when sending failure result.", new Object[0]), e);
        }
    }

    /* renamed from: g */
    public final void mo13141g() {
        try {
            this.f4530a.mo12405l();
        } catch (RemoteException e) {
            C1955a aVar = this.f4531b;
            Log.e(aVar.f3501a, aVar.mo12284c("RemoteException when setting FirebaseUI Version", new Object[0]), e);
        }
    }

    /* renamed from: h */
    public final void mo13142h(C2429qe qeVar) {
        try {
            this.f4530a.mo12406l0(qeVar);
        } catch (RemoteException e) {
            C1955a aVar = this.f4531b;
            Log.e(aVar.f3501a, aVar.mo12284c("RemoteException when sending failure result for mfa", new Object[0]), e);
        }
    }
}
