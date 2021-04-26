package com.auth0.android.provider;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import p005b.p035e.p036a.p037a.C0843a;

public class WebAuthActivity extends AppCompatActivity {

    /* renamed from: k */
    public static final String f11178k = WebAuthActivity.class.getSimpleName();

    /* renamed from: g */
    public WebView f11179g;

    /* renamed from: h */
    public ProgressBar f11180h;

    /* renamed from: i */
    public View f11181i;

    /* renamed from: j */
    public TextView f11182j;

    /* renamed from: com.auth0.android.provider.WebAuthActivity$a */
    public class C5453a implements View.OnClickListener {
        public C5453a() {
        }

        public void onClick(View view) {
            WebAuthActivity.this.f11181i.setVisibility(8);
            String str = WebAuthActivity.f11178k;
            Log.v(WebAuthActivity.f11178k, "Retrying to load failed URL");
            WebAuthActivity.this.mo18696a();
        }
    }

    /* renamed from: com.auth0.android.provider.WebAuthActivity$b */
    public class C5454b extends WebChromeClient {
        public C5454b() {
        }

        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            if (i > 0) {
                WebAuthActivity.this.f11180h.setIndeterminate(false);
                WebAuthActivity.this.f11180h.setProgress(i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18696a() {
        /*
            r6 = this;
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            r1 = 0
            r2 = 1
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x0030 }
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.isConnectedOrConnecting()     // Catch:{ SecurityException -> 0x0030 }
            if (r0 == 0) goto L_0x0018
            r0 = r2
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            java.lang.String r3 = f11178k     // Catch:{ SecurityException -> 0x0031 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x0031 }
            r4.<init>()     // Catch:{ SecurityException -> 0x0031 }
            java.lang.String r5 = "Is network available? "
            r4.append(r5)     // Catch:{ SecurityException -> 0x0031 }
            r4.append(r0)     // Catch:{ SecurityException -> 0x0031 }
            java.lang.String r4 = r4.toString()     // Catch:{ SecurityException -> 0x0031 }
            android.util.Log.v(r3, r4)     // Catch:{ SecurityException -> 0x0031 }
            goto L_0x0038
        L_0x0030:
            r0 = r2
        L_0x0031:
            java.lang.String r3 = f11178k
            java.lang.String r4 = "Could not check for Network status. Please, be sure to include the android.permission.ACCESS_NETWORK_STATE permission in the manifest"
            android.util.Log.w(r3, r4)
        L_0x0038:
            if (r0 != 0) goto L_0x0052
            r0 = 2131755050(0x7f10002a, float:1.9140968E38)
            java.lang.String r0 = r6.getString(r0)
            android.widget.TextView r2 = r6.f11182j
            r2.setText(r0)
            android.webkit.WebView r0 = r6.f11179g
            r2 = 4
            r0.setVisibility(r2)
            android.view.View r0 = r6.f11181i
            r0.setVisibility(r1)
            return
        L_0x0052:
            android.content.Intent r0 = r6.getIntent()
            android.net.Uri r0 = r0.getData()
            java.lang.String r1 = "redirect_uri"
            java.lang.String r1 = r0.getQueryParameter(r1)
            android.webkit.WebView r3 = r6.f11179g
            com.auth0.android.provider.WebAuthActivity$b r4 = new com.auth0.android.provider.WebAuthActivity$b
            r4.<init>()
            r3.setWebChromeClient(r4)
            android.webkit.WebView r3 = r6.f11179g
            com.auth0.android.provider.WebAuthActivity$c r4 = new com.auth0.android.provider.WebAuthActivity$c
            r4.<init>(r1)
            r3.setWebViewClient(r4)
            android.webkit.WebView r1 = r6.f11179g
            android.webkit.WebSettings r1 = r1.getSettings()
            r1.setJavaScriptEnabled(r2)
            r1.setSupportZoom(r2)
            r1.setBuiltInZoomControls(r2)
            android.webkit.WebView r1 = r6.f11179g
            java.lang.String r0 = r0.toString()
            r1.loadUrl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.auth0.android.provider.WebAuthActivity.mo18696a():void");
    }

    public void onCreate(Bundle bundle) {
        String str = f11178k;
        StringBuilder u = C0843a.m460u("Creating a WebAuthActivity for navigating to ");
        u.append(getIntent().getData().toString());
        Log.v(str, u.toString());
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("fullscreen", false)) {
            Log.d(str, "Activity in fullscreen mode");
            getWindow().getDecorView().setSystemUiVisibility(1028);
        }
        setContentView((int) R.layout.com_auth0_activity_web_auth);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            String stringExtra = getIntent().getStringExtra("serviceName");
            supportActionBar.setIcon(17170445);
            supportActionBar.setDisplayShowTitleEnabled(false);
            supportActionBar.setDisplayUseLogoEnabled(false);
            supportActionBar.setDisplayHomeAsUpEnabled(false);
            supportActionBar.setDisplayShowCustomEnabled(true);
            supportActionBar.setTitle((CharSequence) stringExtra);
        }
        WebView webView = (WebView) findViewById(R.id.com_auth0_lock_webview);
        this.f11179g = webView;
        webView.setVisibility(4);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.com_auth0_lock_progressbar);
        this.f11180h = progressBar;
        progressBar.setIndeterminate(true);
        this.f11180h.setMax(100);
        View findViewById = findViewById(R.id.com_auth0_lock_error_view);
        this.f11181i = findViewById;
        findViewById.setVisibility(8);
        this.f11182j = (TextView) findViewById(R.id.com_auth0_lock_text);
        ((Button) findViewById(R.id.com_auth0_lock_retry)).setOnClickListener(new C5453a());
        mo18696a();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (getIntent().getBooleanExtra("fullscreen", false)) {
            Log.d(f11178k, "Activity in fullscreen mode");
            getWindow().getDecorView().setSystemUiVisibility(1028);
        }
    }

    /* renamed from: com.auth0.android.provider.WebAuthActivity$c */
    public class C5455c extends WebViewClient {

        /* renamed from: a */
        public final /* synthetic */ String f11185a;

        public C5455c(String str) {
            this.f11185a = str;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            int i = 0;
            WebAuthActivity.this.f11180h.setProgress(0);
            boolean z = true;
            WebAuthActivity.this.f11180h.setIndeterminate(true);
            WebAuthActivity.this.f11180h.setVisibility(8);
            if (WebAuthActivity.this.f11181i.getVisibility() != 0) {
                z = false;
            }
            WebView webView2 = WebAuthActivity.this.f11179g;
            if (z) {
                i = 4;
            }
            webView2.setVisibility(i);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            WebAuthActivity.this.f11180h.setProgress(0);
            WebAuthActivity.this.f11180h.setVisibility(0);
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            String str3 = WebAuthActivity.f11178k;
            Log.w(WebAuthActivity.f11178k, String.format("Load error (%d) %s", new Object[]{Integer.valueOf(i), str}));
            WebAuthActivity webAuthActivity = WebAuthActivity.this;
            webAuthActivity.f11182j.setText(str);
            webAuthActivity.f11179g.setVisibility(4);
            webAuthActivity.f11181i.setVisibility(0);
            super.onReceivedError(webView, i, str, str2);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!str.startsWith(this.f11185a)) {
                return false;
            }
            String str2 = WebAuthActivity.f11178k;
            Log.v(WebAuthActivity.f11178k, "Redirect URL was called");
            Intent intent = new Intent();
            intent.setData(Uri.parse(str));
            WebAuthActivity.this.setResult(-1, intent);
            WebAuthActivity.this.finish();
            return true;
        }

        @TargetApi(23)
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            String str = WebAuthActivity.f11178k;
            Log.w(WebAuthActivity.f11178k, String.format("Load error (%d) %s", new Object[]{Integer.valueOf(webResourceError.getErrorCode()), webResourceError.getDescription()}));
            WebAuthActivity webAuthActivity = WebAuthActivity.this;
            webAuthActivity.f11182j.setText(webResourceError.getDescription().toString());
            webAuthActivity.f11179g.setVisibility(4);
            webAuthActivity.f11181i.setVisibility(0);
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }
}
