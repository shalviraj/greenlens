package p005b.p273o;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.List;

/* renamed from: b.o.y2 */
public class C5044y2 extends CustomTabsServiceConnection {

    /* renamed from: a */
    public String f9749a;

    /* renamed from: b */
    public boolean f9750b;

    public C5044y2(@NonNull String str, boolean z) {
        this.f9749a = str;
        this.f9750b = z;
    }

    public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        customTabsClient.warmup(0);
        CustomTabsSession newSession = customTabsClient.newSession((CustomTabsCallback) null);
        if (newSession != null) {
            Uri parse = Uri.parse(this.f9749a);
            newSession.mayLaunchUrl(parse, (Bundle) null, (List<Bundle>) null);
            if (this.f9750b) {
                CustomTabsIntent build = new CustomTabsIntent.Builder(newSession).build();
                build.intent.setData(parse);
                build.intent.addFlags(268435456);
                C4857i2.f9358c.startActivity(build.intent, build.startAnimationBundle);
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
