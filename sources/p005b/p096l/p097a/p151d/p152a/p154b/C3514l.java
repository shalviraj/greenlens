package p005b.p096l.p097a.p151d.p152a.p154b;

import android.os.Bundle;
import p005b.p096l.p097a.p151d.p152a.p163i.C3647n;

/* renamed from: b.l.a.d.a.b.l */
public final class C3514l extends C3498h<Void> {

    /* renamed from: c */
    public final int f6460c;

    /* renamed from: d */
    public final String f6461d;

    /* renamed from: e */
    public final int f6462e;

    /* renamed from: f */
    public final /* synthetic */ C3518m f6463f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3514l(C3518m mVar, C3647n<Void> nVar, int i, String str, int i2) {
        super(mVar, nVar);
        this.f6463f = mVar;
        this.f6460c = i;
        this.f6461d = str;
        this.f6462e = i2;
    }

    /* renamed from: r0 */
    public final void mo14781r0(Bundle bundle) {
        this.f6463f.f6471c.mo14905b();
        int i = bundle.getInt("error_code");
        C3518m.f6467f.mo14884b(6, "onError(%d), retrying notifyModuleCompleted...", new Object[]{Integer.valueOf(i)});
        int i2 = this.f6462e;
        if (i2 > 0) {
            this.f6463f.mo14792k(this.f6460c, this.f6461d, i2 - 1);
        }
    }
}
