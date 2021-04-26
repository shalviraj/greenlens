package p005b.p280p.p285b.p286a0.p287j;

import java.io.IOException;
import java.util.Objects;
import p005b.p280p.p285b.p286a0.C5125d;
import p005b.p280p.p285b.p286a0.p287j.C5175s;
import p435n.C8040e;

/* renamed from: b.p.b.a0.j.h */
public class C5151h extends C5125d {

    /* renamed from: h */
    public final /* synthetic */ int f10028h;

    /* renamed from: i */
    public final /* synthetic */ C8040e f10029i;

    /* renamed from: j */
    public final /* synthetic */ int f10030j;

    /* renamed from: k */
    public final /* synthetic */ boolean f10031k;

    /* renamed from: l */
    public final /* synthetic */ C5139d f10032l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5151h(C5139d dVar, String str, Object[] objArr, int i, C8040e eVar, int i2, boolean z) {
        super(str, objArr);
        this.f10032l = dVar;
        this.f10028h = i;
        this.f10029i = eVar;
        this.f10030j = i2;
        this.f10031k = z;
    }

    /* renamed from: a */
    public void mo16974a() {
        try {
            C5175s sVar = this.f10032l.f9988p;
            C8040e eVar = this.f10029i;
            int i = this.f10030j;
            Objects.requireNonNull((C5175s.C5176a) sVar);
            eVar.skip((long) i);
            this.f10032l.f9996x.mo16999s(this.f10028h, C5135a.CANCEL);
            synchronized (this.f10032l) {
                this.f10032l.f9998z.remove(Integer.valueOf(this.f10028h));
            }
        } catch (IOException unused) {
        }
    }
}
