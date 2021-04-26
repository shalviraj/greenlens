package p005b.p040g.p041a.p046h;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: b.g.a.h.g */
public class C0885g implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ Context f754g;

    /* renamed from: h */
    public final /* synthetic */ Uri f755h;

    /* renamed from: i */
    public final /* synthetic */ C0886h f756i;

    public C0885g(C0886h hVar, Context context, Uri uri) {
        this.f756i = hVar;
        this.f754g = context;
        this.f755h = uri;
    }

    public void run() {
        boolean z;
        try {
            C0886h hVar = this.f756i;
            z = hVar.f760c.await(hVar.f761d == null ? 0 : 1, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        String str = C0886h.f757g;
        String str2 = C0886h.f757g;
        Log.d(str2, "Launching URI. Custom Tabs available: " + z);
        C0886h hVar2 = this.f756i;
        C0887i iVar = hVar2.f762e;
        Context context = this.f754g;
        Objects.requireNonNull(iVar);
        CustomTabsIntent.Builder showTitle = new CustomTabsIntent.Builder(hVar2.f759b.get()).setShowTitle(iVar.f764g);
        int i = iVar.f765h;
        if (i > 0) {
            showTitle.setToolbarColor(ContextCompat.getColor(context, i));
        }
        Intent intent = showTitle.build().intent;
        intent.setData(this.f755h);
        try {
            this.f754g.startActivity(intent);
        } catch (ActivityNotFoundException unused2) {
            String str3 = C0886h.f757g;
            Log.e(C0886h.f757g, "Could not find any Browser application installed in this device to handle the intent.");
        }
    }
}
