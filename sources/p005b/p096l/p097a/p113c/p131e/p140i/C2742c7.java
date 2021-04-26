package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: b.l.a.c.e.i.c7 */
public final class C2742c7 extends C2836j7 {
    public C2742c7(int i) {
        super(i);
    }

    /* renamed from: a */
    public final void mo13268a() {
        if (!this.f4858j) {
            for (int i = 0; i < mo13420b(); i++) {
                Map.Entry c = mo13421c(i);
                if (((C2782f5) c.getKey()).mo13319c()) {
                    c.setValue(Collections.unmodifiableList((List) c.getValue()));
                }
            }
            for (Map.Entry entry : this.f4857i.isEmpty() ? C2784f7.f4726b : this.f4857i.entrySet()) {
                if (((C2782f5) entry.getKey()).mo13319c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo13268a();
    }
}
