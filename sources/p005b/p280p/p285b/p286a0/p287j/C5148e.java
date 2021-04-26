package p005b.p280p.p285b.p286a0.p287j;

import java.io.IOException;
import p005b.p280p.p285b.p286a0.C5125d;

/* renamed from: b.p.b.a0.j.e */
public class C5148e extends C5125d {

    /* renamed from: h */
    public final /* synthetic */ boolean f10016h;

    /* renamed from: i */
    public final /* synthetic */ int f10017i;

    /* renamed from: j */
    public final /* synthetic */ int f10018j;

    /* renamed from: k */
    public final /* synthetic */ C5174r f10019k;

    /* renamed from: l */
    public final /* synthetic */ C5139d f10020l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5148e(C5139d dVar, String str, Object[] objArr, boolean z, int i, int i2, C5174r rVar) {
        super(str, objArr);
        this.f10020l = dVar;
        this.f10016h = z;
        this.f10017i = i;
        this.f10018j = i2;
        this.f10019k = rVar;
    }

    /* renamed from: a */
    public void mo16974a() {
        try {
            C5139d dVar = this.f10020l;
            boolean z = this.f10016h;
            int i = this.f10017i;
            int i2 = this.f10018j;
            C5174r rVar = this.f10019k;
            synchronized (dVar.f9996x) {
                if (rVar != null) {
                    if (rVar.f10118a == -1) {
                        rVar.f10118a = System.nanoTime();
                    } else {
                        throw new IllegalStateException();
                    }
                }
                dVar.f9996x.mo16993b(z, i, i2);
            }
        } catch (IOException unused) {
        }
    }
}
