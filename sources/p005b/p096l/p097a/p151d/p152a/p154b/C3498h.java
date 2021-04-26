package p005b.p096l.p097a.p151d.p152a.p154b;

import android.os.Bundle;
import java.util.List;
import p005b.p096l.p097a.p151d.p152a.p159e.C3609r0;
import p005b.p096l.p097a.p151d.p152a.p163i.C3647n;

/* renamed from: b.l.a.d.a.b.h */
public class C3498h<T> extends C3609r0 {

    /* renamed from: a */
    public final C3647n<T> f6413a;

    /* renamed from: b */
    public final /* synthetic */ C3518m f6414b;

    public C3498h(C3518m mVar, C3647n<T> nVar) {
        this.f6414b = mVar;
        this.f6413a = nVar;
    }

    public C3498h(C3518m mVar, C3647n nVar, byte[] bArr) {
        this.f6414b = mVar;
        this.f6413a = nVar;
    }

    /* renamed from: I0 */
    public void mo14779I0(List<Bundle> list) {
        this.f6414b.f6471c.mo14905b();
        C3518m.f6467f.mo14884b(4, "onGetSessionStates", new Object[0]);
    }

    /* renamed from: d0 */
    public void mo14780d0(Bundle bundle, Bundle bundle2) {
        this.f6414b.f6472d.mo14905b();
        C3518m.f6467f.mo14884b(4, "onKeepAlive(%b)", new Object[]{Boolean.valueOf(bundle.getBoolean("keep_alive"))});
    }

    /* renamed from: r0 */
    public void mo14781r0(Bundle bundle) {
        this.f6414b.f6471c.mo14905b();
        int i = bundle.getInt("error_code");
        C3518m.f6467f.mo14884b(6, "onError(%d)", new Object[]{Integer.valueOf(i)});
        this.f6413a.mo14928a(new C3470a(i));
    }

    /* renamed from: t0 */
    public void mo14782t0(Bundle bundle, Bundle bundle2) {
        this.f6414b.f6471c.mo14905b();
        C3518m.f6467f.mo14884b(4, "onGetChunkFileDescriptor", new Object[0]);
    }

    public C3498h(C3518m mVar, C3647n nVar, char[] cArr) {
        this.f6414b = mVar;
        this.f6413a = nVar;
    }

    public C3498h(C3518m mVar, C3647n nVar, int[] iArr) {
        this.f6414b = mVar;
        this.f6413a = nVar;
    }
}
