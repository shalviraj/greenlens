package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import p352f.p353a.p354a.C6929b;

public abstract class CustomTabsServiceConnection implements ServiceConnection {
    public abstract void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        onCustomTabsServiceConnected(componentName, new CustomTabsClient(C6929b.C6930a.asInterface(iBinder), componentName) {
        });
    }
}
