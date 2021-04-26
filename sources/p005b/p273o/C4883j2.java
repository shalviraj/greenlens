package p005b.p273o;

import java.util.Iterator;
import org.json.JSONObject;
import p005b.p273o.C4857i2;
import p005b.p273o.C4921n4;

/* renamed from: b.o.j2 */
public final class C4883j2 implements Runnable {
    public void run() {
        JSONObject jSONObject;
        C4921n4.C4923b d = C4947q3.m9084d(!C4857i2.f9342L);
        if (d.f9504a) {
            C4857i2.f9342L = true;
        }
        synchronized (C4857i2.f9341K) {
            Iterator<C4857i2.C4866i> it = C4857i2.f9341K.iterator();
            while (it.hasNext()) {
                C4857i2.C4866i next = it.next();
                if (d.f9505b != null) {
                    if (!d.toString().equals("{}")) {
                        jSONObject = d.f9505b;
                        next.mo16616a(jSONObject);
                    }
                }
                jSONObject = null;
                next.mo16616a(jSONObject);
            }
            C4857i2.f9341K.clear();
        }
    }
}
