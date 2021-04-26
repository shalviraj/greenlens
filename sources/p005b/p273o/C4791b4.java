package p005b.p273o;

import android.content.Context;
import androidx.annotation.NonNull;
import com.huawei.hms.common.ApiException;
import p005b.p273o.C4857i2;
import p005b.p273o.C5009w3;

/* renamed from: b.o.b4 */
public class C4791b4 implements C5009w3 {

    /* renamed from: b.o.b4$a */
    public class C4792a implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ Context f9170g;

        /* renamed from: h */
        public final /* synthetic */ C5009w3.C5010a f9171h;

        public C4792a(Context context, C5009w3.C5010a aVar) {
            this.f9170g = context;
            this.f9171h = aVar;
        }

        public void run() {
            try {
                C4791b4.this.mo16530b(this.f9170g, this.f9171h);
            } catch (ApiException e) {
                C4857i2.m8933a(C4857i2.C4868k.ERROR, "HMS ApiException getting Huawei push token!", e);
                ((C4857i2.C4861d) this.f9171h).mo16612a((String) null, e.getStatusCode() == 907135000 ? -26 : -27);
            }
        }
    }

    /* renamed from: a */
    public void mo16529a(@NonNull Context context, String str, @NonNull C5009w3.C5010a aVar) {
        new Thread(new C4792a(context, aVar), "OS_HMS_GET_TOKEN").start();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:17|18|19|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0058 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo16530b(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.NonNull p005b.p273o.C5009w3.C5010a r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = p005b.p273o.C4835f2.m8859i()     // Catch:{ all -> 0x0068 }
            r1 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = p005b.p273o.C4835f2.m8862l()     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0010
            r0 = r1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r2 = 0
            if (r0 != 0) goto L_0x001d
            r6 = -28
            b.o.i2$d r7 = (p005b.p273o.C4857i2.C4861d) r7     // Catch:{ all -> 0x0068 }
            r7.mo16612a(r2, r6)     // Catch:{ all -> 0x0068 }
            monitor-exit(r5)
            return
        L_0x001d:
            com.huawei.agconnect.config.AGConnectServicesConfig r0 = com.huawei.agconnect.config.AGConnectServicesConfig.fromContext(r6)     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = "client/app_id"
            java.lang.String r0 = r0.getString(r3)     // Catch:{ all -> 0x0068 }
            com.huawei.hms.aaid.HmsInstanceId r6 = com.huawei.hms.aaid.HmsInstanceId.getInstance(r6)     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = "HCM"
            java.lang.String r6 = r6.getToken(r0, r3)     // Catch:{ all -> 0x0068 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0068 }
            if (r0 != 0) goto L_0x0053
            b.o.i2$k r0 = p005b.p273o.C4857i2.C4868k.INFO     // Catch:{ all -> 0x0068 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
            r3.<init>()     // Catch:{ all -> 0x0068 }
            java.lang.String r4 = "Device registered for HMS, push token = "
            r3.append(r4)     // Catch:{ all -> 0x0068 }
            r3.append(r6)     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0068 }
            p005b.p273o.C4857i2.m8933a(r0, r3, r2)     // Catch:{ all -> 0x0068 }
            b.o.i2$d r7 = (p005b.p273o.C4857i2.C4861d) r7     // Catch:{ all -> 0x0068 }
            r7.mo16612a(r6, r1)     // Catch:{ all -> 0x0068 }
            goto L_0x0066
        L_0x0053:
            r0 = 30000(0x7530, double:1.4822E-319)
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0058 }
        L_0x0058:
            b.o.i2$k r6 = p005b.p273o.C4857i2.C4868k.ERROR     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = "HmsMessageServiceOneSignal.onNewToken timed out."
            p005b.p273o.C4857i2.m8933a(r6, r0, r2)     // Catch:{ all -> 0x0068 }
            r6 = -25
            b.o.i2$d r7 = (p005b.p273o.C4857i2.C4861d) r7     // Catch:{ all -> 0x0068 }
            r7.mo16612a(r2, r6)     // Catch:{ all -> 0x0068 }
        L_0x0066:
            monitor-exit(r5)
            return
        L_0x0068:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p273o.C4791b4.mo16530b(android.content.Context, b.o.w3$a):void");
    }
}
