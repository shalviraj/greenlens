package p005b.p280p.p285b.p286a0.p287j;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import p005b.p280p.p285b.p286a0.C5125d;

/* renamed from: b.p.b.a0.j.g */
public class C5150g extends C5125d {

    /* renamed from: h */
    public final /* synthetic */ int f10024h;

    /* renamed from: i */
    public final /* synthetic */ List f10025i;

    /* renamed from: j */
    public final /* synthetic */ boolean f10026j;

    /* renamed from: k */
    public final /* synthetic */ C5139d f10027k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5150g(C5139d dVar, String str, Object[] objArr, int i, List list, boolean z) {
        super(str, objArr);
        this.f10027k = dVar;
        this.f10024h = i;
        this.f10025i = list;
        this.f10026j = z;
    }

    /* renamed from: a */
    public void mo16974a() {
        Objects.requireNonNull(this.f10027k.f9988p);
        try {
            this.f10027k.f9996x.mo16999s(this.f10024h, C5135a.CANCEL);
            synchronized (this.f10027k) {
                this.f10027k.f9998z.remove(Integer.valueOf(this.f10024h));
            }
        } catch (IOException unused) {
        }
    }
}
