package com.auth0.android.provider;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsClient;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p040g.p041a.p046h.C0883e;
import p005b.p040g.p041a.p046h.C0885g;
import p005b.p040g.p041a.p046h.C0886h;
import p005b.p040g.p041a.p046h.C0887i;
import p005b.p040g.p041a.p046h.C0906v;

public class AuthenticationActivity extends Activity {

    /* renamed from: g */
    public boolean f11176g;

    /* renamed from: h */
    public C0886h f11177h;

    /* renamed from: a */
    public static void m10312a(@NonNull Context context, @NonNull Uri uri, @Nullable C0887i iVar) {
        Intent intent = new Intent(context, AuthenticationActivity.class);
        intent.putExtra("com.auth0.android.EXTRA_AUTHORIZE_URI", uri);
        intent.putExtra("com.auth0.android.EXTRA_USE_BROWSER", true);
        intent.putExtra("com.auth0.android.EXTRA_CT_OPTIONS", iVar);
        intent.addFlags(67108864);
        context.startActivity(intent);
    }

    @VisibleForTesting
    /* renamed from: b */
    public void mo18688b(Intent intent) {
        if (C0906v.f812b == null) {
            Log.w(C0906v.f811a, "There is no previous instance of this provider.");
            return;
        }
        if (C0906v.f812b.mo10741a(new C0883e(intent))) {
            C0906v.f812b = null;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == 0) {
            intent = new Intent();
        }
        mo18688b(intent);
        finish();
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f11176g = bundle.getBoolean("com.auth0.android.EXTRA_INTENT_LAUNCHED", false);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C0886h hVar = this.f11177h;
        if (hVar != null) {
            Objects.requireNonNull(hVar);
            Log.v(C0886h.f757g, "Trying to unbind the service");
            Context context = (Context) hVar.f758a.get();
            if (hVar.f763f && context != null) {
                context.unbindService(hVar);
                hVar.f763f = false;
            }
            this.f11177h = null;
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public void onResume() {
        String str;
        super.onResume();
        Intent intent = getIntent();
        if (this.f11176g || intent.getExtras() != null) {
            boolean z = true;
            if (!this.f11176g) {
                this.f11176g = true;
                Bundle extras = getIntent().getExtras();
                Uri uri = (Uri) extras.getParcelable("com.auth0.android.EXTRA_AUTHORIZE_URI");
                if (!extras.getBoolean("com.auth0.android.EXTRA_USE_BROWSER", true)) {
                    Intent intent2 = new Intent(this, WebAuthActivity.class);
                    intent2.setData(uri);
                    intent2.putExtra("serviceName", extras.getString("com.auth0.android.EXTRA_CONNECTION_NAME"));
                    intent2.putExtra("fullscreen", extras.getBoolean("com.auth0.android.EXTRA_USE_FULL_SCREEN"));
                    startActivityForResult(intent2, 33);
                    return;
                }
                C0886h hVar = new C0886h(this);
                this.f11177h = hVar;
                hVar.f762e = (C0887i) extras.getParcelable("com.auth0.android.EXTRA_CT_OPTIONS");
                C0886h hVar2 = this.f11177h;
                Objects.requireNonNull(hVar2);
                String str2 = C0886h.f757g;
                Log.v(str2, "Trying to bind the service");
                Context context = (Context) hVar2.f758a.get();
                hVar2.f763f = false;
                if (!(context == null || (str = hVar2.f761d) == null)) {
                    hVar2.f763f = CustomTabsClient.bindCustomTabsService(context, str, hVar2);
                }
                StringBuilder u = C0843a.m460u("Bind request result: ");
                u.append(hVar2.f763f);
                Log.v(str2, u.toString());
                C0886h hVar3 = this.f11177h;
                Context context2 = (Context) hVar3.f758a.get();
                if (context2 == null) {
                    Log.v(str2, "Custom Tab Context was no longer valid.");
                    return;
                }
                if (hVar3.f762e == null) {
                    hVar3.f762e = new C0887i(false, 0, (C0887i.C0888a) null);
                }
                new Thread(new C0885g(hVar3, context2, uri)).start();
                return;
            }
            if (intent.getData() != null) {
                z = false;
            }
            if (z) {
                setResult(0);
            }
            mo18688b(intent);
            finish();
            return;
        }
        finish();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.auth0.android.EXTRA_INTENT_LAUNCHED", this.f11176g);
    }
}
