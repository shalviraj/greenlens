package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: b.l.a.c.e.e.p0 */
public final class C2391p0 extends C2559w0 {
    public C2391p0(int i) {
        super(i);
    }

    /* renamed from: a */
    public final void mo12908a() {
        if (!this.f4389j) {
            for (int i = 0; i < mo13079b(); i++) {
                Map.Entry c = mo13080c(i);
                if (((C2070bn) c.getKey()).mo12444c()) {
                    c.setValue(Collections.unmodifiableList((List) c.getValue()));
                }
            }
            for (Map.Entry entry : this.f4388i.isEmpty() ? C2463s0.f4274b : this.f4388i.entrySet()) {
                if (((C2070bn) entry.getKey()).mo12444c()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo12908a();
    }
}
