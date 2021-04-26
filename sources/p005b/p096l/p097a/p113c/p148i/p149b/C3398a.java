package p005b.p096l.p097a.p113c.p148i.p149b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiClient;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p114a.p115a.p117b.p118a.C1750a;
import p005b.p096l.p097a.p113c.p119b.p122m.C1889b;
import p005b.p096l.p097a.p113c.p119b.p122m.C1905d;
import p005b.p096l.p097a.p113c.p119b.p122m.C1917i;
import p005b.p096l.p097a.p113c.p119b.p122m.C1929n;
import p005b.p096l.p097a.p113c.p119b.p122m.C1944s;
import p005b.p096l.p097a.p113c.p148i.C3397a;
import p005b.p096l.p097a.p113c.p148i.C3412e;

/* renamed from: b.l.a.c.i.b.a */
public class C3398a extends C1917i<C3403f> implements C3412e {

    /* renamed from: D */
    public final boolean f6164D;

    /* renamed from: E */
    public final C1905d f6165E;

    /* renamed from: F */
    public final Bundle f6166F;

    /* renamed from: G */
    public Integer f6167G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3398a(Context context, Looper looper, C1905d dVar, GoogleApiClient.C5470b bVar, GoogleApiClient.C5471c cVar) {
        super(context, looper, 44, dVar, bVar, cVar);
        C1905d dVar2 = dVar;
        C3397a aVar = dVar2.f3418g;
        Integer num = dVar2.f3420i;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar2.f3412a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (aVar != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        }
        this.f6164D = true;
        this.f6165E = dVar2;
        this.f6166F = bundle;
        this.f6167G = dVar2.f3420i;
    }

    /* renamed from: C */
    public String mo12191C() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* renamed from: D */
    public String mo12192D() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: c */
    public final void mo14651c() {
        mo12210r(new C1889b.C1893d());
    }

    /* renamed from: d */
    public final void mo14652d() {
        try {
            ((C3403f) mo12190B()).mo14659T(this.f6167G.intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    /* renamed from: g */
    public final void mo14653g(C1929n nVar, boolean z) {
        try {
            ((C3403f) mo12190B()).mo14658G0(nVar, this.f6167G.intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    /* renamed from: l */
    public final void mo14654l(C3401d dVar) {
        C0823f.m380l(dVar, "Expecting a valid ISignInCallbacks");
        try {
            Account account = this.f6165E.f3412a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = C1750a.m2319a(this.f3372g).mo11977b();
            }
            ((C3403f) mo12190B()).mo14660U0(new C3407j(new C1944s(account, this.f6167G.intValue(), googleSignInAccount)), dVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                dVar.mo12065g0(new C3409l());
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* renamed from: n */
    public int mo12206n() {
        return 12451000;
    }

    /* renamed from: t */
    public boolean mo12212t() {
        return this.f6164D;
    }

    /* renamed from: w */
    public /* synthetic */ IInterface mo12215w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C3403f ? (C3403f) queryLocalInterface : new C3405h(iBinder);
    }

    /* renamed from: z */
    public Bundle mo12218z() {
        if (!this.f3372g.getPackageName().equals(this.f6165E.f3416e)) {
            this.f6166F.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f6165E.f3416e);
        }
        return this.f6166F;
    }
}
