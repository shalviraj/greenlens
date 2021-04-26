package p005b.p280p.p285b.p286a0.p287j;

import java.util.Objects;
import p005b.p280p.p285b.p286a0.C5125d;
import p005b.p280p.p285b.p286a0.p287j.C5175s;

/* renamed from: b.p.b.a0.j.i */
public class C5152i extends C5125d {

    /* renamed from: h */
    public final /* synthetic */ int f10033h;

    /* renamed from: i */
    public final /* synthetic */ C5135a f10034i;

    /* renamed from: j */
    public final /* synthetic */ C5139d f10035j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5152i(C5139d dVar, String str, Object[] objArr, int i, C5135a aVar) {
        super(str, objArr);
        this.f10035j = dVar;
        this.f10033h = i;
        this.f10034i = aVar;
    }

    /* renamed from: a */
    public void mo16974a() {
        Objects.requireNonNull((C5175s.C5176a) this.f10035j.f9988p);
        synchronized (this.f10035j) {
            this.f10035j.f9998z.remove(Integer.valueOf(this.f10033h));
        }
    }
}
