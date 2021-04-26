package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import p352f.p353a.p354a.C6926a;
import p352f.p353a.p354a.C6932c;

public class PostMessageService extends Service {
    private C6932c.C6933a mBinder = new C6932c.C6933a() {
        public void onMessageChannelReady(C6926a aVar, Bundle bundle) {
            aVar.onMessageChannelReady(bundle);
        }

        public void onPostMessage(C6926a aVar, String str, Bundle bundle) {
            aVar.onPostMessage(str, bundle);
        }
    };

    public IBinder onBind(Intent intent) {
        return this.mBinder;
    }
}
