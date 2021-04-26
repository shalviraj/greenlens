package p005b.p006a.p007a.p021l;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import com.appfoundry.previewer.model.AuthSettings;
import com.google.api.client.auth.oauth2.AuthorizationCodeTokenRequest;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.segment.analytics.integrations.BasePayload;
import com.wuman.android.auth.AuthorizationFlow;
import com.wuman.android.auth.OAuthManager;
import com.wuman.android.auth.oauth2.store.SharedPreferencesCredentialStore;
import java.io.IOException;
import java.util.Objects;
import java.util.regex.Pattern;
import p005b.p006a.p007a.p021l.C0783a;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p164b.p165a.p166a.p168b.C3658b;
import p005b.p096l.p164b.p165a.p166a.p168b.C3659c;
import p005b.p096l.p164b.p165a.p166a.p168b.C3661d;
import p005b.p096l.p164b.p165a.p166a.p168b.C3662e;
import p005b.p096l.p164b.p165a.p166a.p168b.C3663f;
import p005b.p096l.p164b.p165a.p166a.p168b.C3667h;
import p005b.p096l.p164b.p165a.p169b.C3674c;
import p005b.p096l.p164b.p165a.p169b.p170p.C3697e;
import p005b.p096l.p164b.p165a.p171c.p172j.C3708a;
import p005b.p096l.p164b.p165a.p173d.C3735m;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;
import p441p.p442a.C8091a;

/* renamed from: b.a.a.l.b */
public final class C0785b implements LoaderManager.LoaderCallbacks<C0783a.C0784a<C3663f>> {

    /* renamed from: a */
    public final AuthSettings f564a;

    /* renamed from: b */
    public OAuthManager f565b;

    /* renamed from: c */
    public C0793h f566c;

    /* renamed from: d */
    public C0794i f567d;

    /* renamed from: e */
    public String f568e;

    /* renamed from: f */
    public AuthorizationFlow f569f;

    /* renamed from: g */
    public String f570g;

    /* renamed from: h */
    public final Context f571h;

    /* renamed from: i */
    public final FragmentManager f572i;

    /* renamed from: b.a.a.l.b$a */
    public static final class C0786a extends C0783a<C3663f> {

        /* renamed from: b */
        public boolean f573b;

        /* renamed from: c */
        public final OAuthManager f574c;

        /* renamed from: d */
        public final String f575d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0786a(Context context, OAuthManager oAuthManager, String str) {
            super(context);
            C6888i.m12438e(context, BasePayload.CONTEXT_KEY);
            this.f574c = oAuthManager;
            this.f575d = str;
        }

        /* renamed from: b */
        public Object mo10617b() {
            boolean z;
            OAuthManager oAuthManager = this.f574c;
            if (oAuthManager != null) {
                String str = this.f575d;
                Objects.requireNonNull(str);
                OAuthManager.C58431 r4 = new OAuthManager.Future2Task<Boolean>((Handler) null, (OAuthManager.OAuthCallback) null, str) {
                    public final /* synthetic */ String val$userId;

                    {
                        this.val$userId = r4;
                    }

                    public void doWork() {
                        Boolean bool;
                        OAuthManager.LOGGER.info("deleteCredential");
                        C3667h hVar = OAuthManager.this.mFlow.credentialStore;
                        if (hVar == null) {
                            bool = Boolean.FALSE;
                        } else {
                            hVar.delete(this.val$userId, (C3663f) null);
                            bool = Boolean.TRUE;
                        }
                        set(bool);
                    }
                };
                oAuthManager.mExecutor.submit(new Runnable(oAuthManager, r4) {
                    public final /* synthetic */ Future2Task val$task;

                    {
                        this.val$task = r2;
                    }

                    public void run() {
                        this.val$task.start();
                    }
                });
                Boolean bool = (Boolean) r4.getResult();
                if (bool != null) {
                    z = bool.booleanValue();
                    this.f573b = z;
                    StringBuilder u = C0843a.m460u("AuthManager: DeleteTokenLoader - token deleted: ");
                    u.append(this.f573b);
                    C8091a.f16272d.mo26043a(u.toString(), new Object[0]);
                    return null;
                }
            }
            z = false;
            this.f573b = z;
            StringBuilder u2 = C0843a.m460u("AuthManager: DeleteTokenLoader - token deleted: ");
            u2.append(this.f573b);
            C8091a.f16272d.mo26043a(u2.toString(), new Object[0]);
            return null;
        }

        /* renamed from: d */
        public void mo10619d(C0783a.C0784a<C3663f> aVar) {
            C6888i.m12436c(aVar);
            boolean z = this.f573b;
            aVar.f562c = z;
            aVar.f563d = z ? null : "error";
        }
    }

    /* renamed from: b.a.a.l.b$b */
    public static final class C0787b extends C0783a<C3663f> {

        /* renamed from: b */
        public final OAuthManager f576b;

        /* renamed from: c */
        public final boolean f577c;

        /* renamed from: d */
        public final String f578d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0787b(Context context, OAuthManager oAuthManager, boolean z, String str) {
            super(context);
            C6888i.m12436c(context);
            this.f576b = oAuthManager;
            this.f577c = z;
            this.f578d = str;
        }

        /* renamed from: b */
        public Object mo10617b() {
            C3663f fVar;
            C3663f fVar2;
            String str = null;
            if (this.f577c) {
                OAuthManager oAuthManager = this.f576b;
                if (oAuthManager != null) {
                    String str2 = this.f578d;
                    Objects.requireNonNull(str2);
                    OAuthManager.C58454 r5 = new OAuthManager.Future2Task<C3663f>((Handler) null, (OAuthManager.OAuthCallback) null, str2) {
                        public final /* synthetic */ String val$userId;

                        {
                            this.val$userId = r4;
                        }

                        public void doWork() {
                            try {
                                OAuthManager.LOGGER.info("authorizeImplicitly");
                                C3663f loadCredential = OAuthManager.this.mFlow.loadCredential(this.val$userId);
                                if (loadCredential == null || loadCredential.getAccessToken() == null || (loadCredential.getRefreshToken() == null && loadCredential.getExpiresInSeconds() != null && loadCredential.getExpiresInSeconds().longValue() <= 60)) {
                                    String redirectUri = OAuthManager.this.mUIController.getRedirectUri();
                                    AuthorizationFlow authorizationFlow = OAuthManager.this.mFlow;
                                    Objects.requireNonNull(authorizationFlow);
                                    C3661d dVar = new C3661d(authorizationFlow.authorizationServerEncodedUrl, authorizationFlow.clientId);
                                    dVar.mo22108h(authorizationFlow.scopes);
                                    dVar.mo22107f(redirectUri);
                                    OAuthManager.this.mUIController.requestAuthorization(dVar);
                                    loadCredential = OAuthManager.this.mFlow.createAndStoreCredential(OAuthManager.this.mUIController.waitForImplicitResponseUrl(), this.val$userId);
                                }
                                set(loadCredential);
                            } finally {
                                OAuthManager.this.mUIController.stop();
                            }
                        }
                    };
                    oAuthManager.mExecutor.submit(new Runnable(oAuthManager, r5) {
                        public final /* synthetic */ Future2Task val$task;

                        {
                            this.val$task = r2;
                        }

                        public void run() {
                            this.val$task.start();
                        }
                    });
                    fVar = (C3663f) r5.getResult();
                } else {
                    fVar = null;
                }
                Object[] objArr = new Object[1];
                if (fVar != null) {
                    str = fVar.getAccessToken();
                }
                objArr[0] = str;
                C8091a.f16272d.mo26043a("AuthManager: GetTokenLoader: implicit -> token: %s", objArr);
            } else {
                OAuthManager oAuthManager2 = this.f576b;
                if (oAuthManager2 != null) {
                    String str3 = this.f578d;
                    Objects.requireNonNull(str3);
                    OAuthManager.C58443 r52 = new OAuthManager.Future2Task<C3663f>((Handler) null, (OAuthManager.OAuthCallback) null, str3) {
                        public final /* synthetic */ String val$userId;

                        {
                            this.val$userId = r4;
                        }

                        public void doWork() {
                            try {
                                C3663f loadCredential = OAuthManager.this.mFlow.loadCredential(this.val$userId);
                                OAuthManager.LOGGER.info("authorizeExplicitly");
                                if (loadCredential == null || loadCredential.getAccessToken() == null || (loadCredential.getRefreshToken() == null && loadCredential.getExpiresInSeconds() != null && loadCredential.getExpiresInSeconds().longValue() <= 60)) {
                                    String redirectUri = OAuthManager.this.mUIController.getRedirectUri();
                                    AuthorizationFlow authorizationFlow = OAuthManager.this.mFlow;
                                    Objects.requireNonNull(authorizationFlow);
                                    C3658b bVar = new C3658b(authorizationFlow.authorizationServerEncodedUrl, authorizationFlow.clientId);
                                    bVar.mo22108h(authorizationFlow.scopes);
                                    bVar.mo22107f(redirectUri);
                                    OAuthManager.this.mUIController.requestAuthorization(bVar);
                                    AuthorizationCodeTokenRequest newTokenRequest = OAuthManager.this.mFlow.newTokenRequest(OAuthManager.this.mUIController.waitForExplicitCode());
                                    newTokenRequest.setRedirectUri(redirectUri);
                                    TokenResponse execute = newTokenRequest.execute();
                                    Objects.requireNonNull(OAuthManager.this);
                                    AuthorizationFlow authorizationFlow2 = OAuthManager.this.mFlow;
                                    String str = this.val$userId;
                                    C3663f newCredential = authorizationFlow2.newCredential(str);
                                    newCredential.setFromTokenResponse(execute);
                                    C3667h hVar = authorizationFlow2.credentialStore;
                                    if (hVar != null) {
                                        hVar.store(str, newCredential);
                                    }
                                    set(newCredential);
                                } else {
                                    set(loadCredential);
                                }
                            } finally {
                                OAuthManager.this.mUIController.stop();
                            }
                        }
                    };
                    oAuthManager2.mExecutor.submit(new Runnable(oAuthManager2, r52) {
                        public final /* synthetic */ Future2Task val$task;

                        {
                            this.val$task = r2;
                        }

                        public void run() {
                            this.val$task.start();
                        }
                    });
                    fVar2 = (C3663f) r52.getResult();
                } else {
                    fVar2 = null;
                }
                Object[] objArr2 = new Object[1];
                if (fVar != null) {
                    str = fVar.getAccessToken();
                }
                objArr2[0] = str;
                C8091a.f16272d.mo26043a("AuthManager: GetTokenLoader: explicit -> token: %s", objArr2);
            }
            return fVar;
        }

        /* renamed from: d */
        public void mo10619d(C0783a.C0784a<C3663f> aVar) {
            C6888i.m12436c(aVar);
            C3663f fVar = (C3663f) aVar.f560a;
            C6888i.m12436c(fVar);
            String accessToken = fVar.getAccessToken();
            C6888i.m12437d(accessToken, "data!!.accessToken");
            boolean z = !(accessToken.length() == 0);
            aVar.f562c = z;
            aVar.f563d = z ? null : "error";
        }
    }

    public C0785b(Context context, FragmentManager fragmentManager, AuthSettings authSettings, Boolean bool, int i) {
        String str;
        C6888i.m12438e(context, BasePayload.CONTEXT_KEY);
        C6888i.m12438e(fragmentManager, "fragmentManager");
        this.f571h = context;
        this.f572i = fragmentManager;
        this.f564a = authSettings;
        String str2 = "";
        this.f570g = str2;
        if (!(authSettings == null || (str = authSettings.f10911f) == null)) {
            str2 = str;
        }
        this.f570g = str2;
        C0791f fVar = new C0791f(this, fragmentManager);
        SharedPreferencesCredentialStore sharedPreferencesCredentialStore = new SharedPreferencesCredentialStore(context, "authManager", new C3708a());
        if (authSettings != null) {
            this.f568e = authSettings.f10909d;
            String str3 = authSettings.f10908c;
            Pattern pattern = C3659c.f6743a;
            AuthorizationFlow.Builder builder = new AuthorizationFlow.Builder(new C3659c.C3660a(), new C3697e(), new C3708a(), new C3674c(authSettings.f10910e), new C3662e(this.f568e, authSettings.f10912g), this.f568e, str3);
            builder.requestInitializer = C0789d.f580a;
            C6888i.m12437d(builder, "builder");
            builder.scopes = C6790h.m12318E(authSettings.f10907b);
            builder.refreshListeners.add(new C0790e(this));
            C1960d.m2849t(true);
            builder.credentialStore = sharedPreferencesCredentialStore;
            AuthorizationFlow authorizationFlow = new AuthorizationFlow(builder);
            this.f569f = authorizationFlow;
            C8091a.f16272d.mo26043a("AuthManager: scopes: %s", C3735m.m7052b(' ').mo15114a(authorizationFlow.scopes));
            this.f565b = new OAuthManager(this.f569f, fVar);
        }
    }

    /* renamed from: a */
    public final void mo10620a(AppCompatActivity appCompatActivity) {
        C3667h hVar;
        C6888i.m12438e(appCompatActivity, BasePayload.CONTEXT_KEY);
        LoaderManager instance = LoaderManager.getInstance(appCompatActivity);
        C6888i.m12437d(instance, "LoaderManager.getInstance(context)");
        CookieSyncManager.createInstance(appCompatActivity);
        CookieManager instance2 = CookieManager.getInstance();
        C6888i.m12437d(instance2, "CookieManager.getInstance()");
        instance2.removeAllCookie();
        if (instance.getLoader(1) == null) {
            instance.initLoader(1, (Bundle) null, this);
        } else {
            instance.restartLoader(1, (Bundle) null, this);
        }
        try {
            AuthorizationFlow authorizationFlow = this.f569f;
            if (authorizationFlow != null && (hVar = authorizationFlow.credentialStore) != null) {
                String str = this.f568e;
                hVar.delete(str, authorizationFlow.loadCredential(str));
            }
        } catch (IOException e) {
            C8091a.f16272d.mo26044b("AuthManager: deleteCredential: Exception: %s", e.toString());
        }
    }

    public Loader onCreateLoader(int i, Bundle bundle) {
        return i == 0 ? new C0787b(this.f571h, this.f565b, false, this.f568e) : new C0786a(this.f571h, this.f565b, this.f568e);
    }

    public void onLoadFinished(Loader loader, Object obj) {
        C0783a.C0784a aVar = (C0783a.C0784a) obj;
        C6888i.m12438e(loader, "loader");
        String str = null;
        if ((aVar != null ? (C3663f) aVar.f560a : null) == null) {
            C0793h hVar = this.f566c;
            if (hVar != null) {
                hVar.mo10464a(aVar != null ? aVar.f563d : null);
            }
            Object[] objArr = new Object[1];
            if (aVar != null) {
                str = aVar.f563d;
            }
            objArr[0] = str;
            C8091a.f16272d.mo26044b("AuthManager: data.data is null: %s", objArr);
        } else if (aVar.f562c) {
            Object[] objArr2 = new Object[1];
            C3663f fVar = (C3663f) aVar.f560a;
            if (fVar != null) {
                str = fVar.getAccessToken();
            }
            objArr2[0] = str;
            C8091a.f16272d.mo26043a("AuthManager: onLoadFinished: success: %s", objArr2);
            C0793h hVar2 = this.f566c;
            if (hVar2 != null) {
                hVar2.mo10465b((C3663f) aVar.f560a);
            }
        } else {
            C0793h hVar3 = this.f566c;
            if (hVar3 != null) {
                hVar3.mo10464a(aVar.f563d);
            }
            C8091a.f16272d.mo26044b("AuthManager: onLoadFinished: not success: %s", aVar.f563d);
        }
    }

    public void onLoaderReset(Loader<C0783a.C0784a<C3663f>> loader) {
        C6888i.m12438e(loader, "loader");
        C8091a.f16272d.mo26043a("AuthManager: onLoaderReset: %s", loader.toString());
    }
}
