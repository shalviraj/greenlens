package p005b.p280p.p285b.p286a0.p287j;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import p005b.p280p.p285b.p286a0.C5125d;

/* renamed from: b.p.b.a0.j.f */
public class C5149f extends C5125d {

    /* renamed from: h */
    public final /* synthetic */ int f10021h;

    /* renamed from: i */
    public final /* synthetic */ List f10022i;

    /* renamed from: j */
    public final /* synthetic */ C5139d f10023j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5149f(C5139d dVar, String str, Object[] objArr, int i, List list) {
        super(str, objArr);
        this.f10023j = dVar;
        this.f10021h = i;
        this.f10022i = list;
    }

    /* renamed from: a */
    public void mo16974a() {
        Objects.requireNonNull(this.f10023j.f9988p);
        try {
            this.f10023j.f9996x.mo16999s(this.f10021h, C5135a.CANCEL);
            synchronized (this.f10023j) {
                this.f10023j.f9998z.remove(Integer.valueOf(this.f10021h));
            }
        } catch (IOException unused) {
        }
    }
}
