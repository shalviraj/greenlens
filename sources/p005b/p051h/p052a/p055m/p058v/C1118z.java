package p005b.p051h.p052a.p055m.p058v;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: b.h.a.m.v.z */
public class C1118z {

    /* renamed from: a */
    public boolean f1365a;

    /* renamed from: b */
    public final Handler f1366b = new Handler(Looper.getMainLooper(), new C1119a());

    /* renamed from: b.h.a.m.v.z$a */
    public static final class C1119a implements Handler.Callback {
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((C1115w) message.obj).recycle();
            return true;
        }
    }

    /* renamed from: a */
    public synchronized void mo11028a(C1115w<?> wVar, boolean z) {
        if (!this.f1365a) {
            if (!z) {
                this.f1365a = true;
                wVar.recycle();
                this.f1365a = false;
            }
        }
        this.f1366b.obtainMessage(1, wVar).sendToTarget();
    }
}
