package p005b.p096l.p180d.p191q.p192f.p195g;

import android.os.Bundle;
import com.segment.analytics.integrations.BasePayload;
import java.util.concurrent.Callable;

/* renamed from: b.l.d.q.f.g.j */
public class C4017j implements Callable<Void> {

    /* renamed from: a */
    public final /* synthetic */ long f7360a;

    /* renamed from: b */
    public final /* synthetic */ C4032q f7361b;

    public C4017j(C4032q qVar, long j) {
        this.f7361b = qVar;
        this.f7360a = j;
    }

    public Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong(BasePayload.TIMESTAMP_KEY, this.f7360a);
        this.f7361b.f7400m.mo15502a("_ae", bundle);
        return null;
    }
}
