package p005b.p096l.p164b.p165a.p166a.p168b;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p005b.p096l.p164b.p165a.p169b.C3672a;
import p005b.p096l.p164b.p165a.p169b.C3675d;
import p005b.p096l.p164b.p165a.p169b.C3677f;
import p005b.p096l.p164b.p165a.p169b.C3678g;
import p005b.p096l.p164b.p165a.p169b.C3687n;
import p005b.p096l.p164b.p165a.p173d.C3723g;

/* renamed from: b.l.b.a.a.b.e */
public class C3662e implements C3678g, C3675d {

    /* renamed from: a */
    public final String f6744a;

    /* renamed from: b */
    public final String f6745b;

    public C3662e(String str, String str2) {
        Objects.requireNonNull(str);
        this.f6744a = str;
        this.f6745b = str2;
    }

    public void initialize(C3677f fVar) {
        fVar.f6765a = this;
    }

    public void intercept(C3677f fVar) {
        C3687n nVar;
        C3672a aVar = fVar.f6772h;
        if (aVar != null) {
            nVar = (C3687n) aVar;
        } else {
            nVar = new C3687n(new HashMap());
            fVar.f6772h = nVar;
        }
        Map<String, Object> e = C3723g.m7022e(nVar.f6811c);
        e.put("client_id", this.f6744a);
        String str = this.f6745b;
        if (str != null) {
            e.put("client_secret", str);
        }
    }
}
