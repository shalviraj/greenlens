package p005b.p273o;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.amplitude.api.Constants;
import p005b.p273o.C4857i2;
import p005b.p273o.C5009w3;

/* renamed from: b.o.x3 */
public class C5024x3 implements C5009w3 {

    /* renamed from: a */
    public static C5009w3.C5010a f9715a = null;

    /* renamed from: b */
    public static boolean f9716b = false;

    /* renamed from: b.o.x3$a */
    public class C5025a implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ Context f9717g;

        /* renamed from: h */
        public final /* synthetic */ C5009w3.C5010a f9718h;

        public C5025a(C5024x3 x3Var, Context context, C5009w3.C5010a aVar) {
            this.f9717g = context;
            this.f9718h = aVar;
        }

        public void run() {
            ADM adm = new ADM(this.f9717g);
            String registrationId = adm.getRegistrationId();
            if (registrationId == null) {
                adm.startRegister();
            } else {
                C4857i2.C4868k kVar = C4857i2.C4868k.DEBUG;
                C4857i2.m8933a(kVar, "ADM Already registered with ID:" + registrationId, (Throwable) null);
                ((C4857i2.C4861d) this.f9718h).mo16612a(registrationId, 1);
            }
            try {
                Thread.sleep(Constants.EVENT_UPLOAD_PERIOD_MILLIS);
            } catch (InterruptedException unused) {
            }
            if (!C5024x3.f9716b) {
                C4857i2.m8933a(C4857i2.C4868k.ERROR, "com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.", (Throwable) null);
                C5024x3.m9224b((String) null);
            }
        }
    }

    /* renamed from: b */
    public static void m9224b(String str) {
        C5009w3.C5010a aVar = f9715a;
        if (aVar != null) {
            f9716b = true;
            ((C4857i2.C4861d) aVar).mo16612a(str, 1);
        }
    }

    /* renamed from: a */
    public void mo16529a(Context context, String str, C5009w3.C5010a aVar) {
        f9715a = aVar;
        new Thread(new C5025a(this, context, aVar)).start();
    }
}
