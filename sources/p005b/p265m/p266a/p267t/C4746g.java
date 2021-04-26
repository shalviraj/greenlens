package p005b.p265m.p266a.p267t;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;

/* renamed from: b.m.a.t.g */
public class C4746g {

    /* renamed from: a */
    public SurfaceHolder f9089a;

    /* renamed from: b */
    public SurfaceTexture f9090b;

    public C4746g(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.f9090b = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }

    public C4746g(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.f9089a = surfaceHolder;
            return;
        }
        throw new IllegalArgumentException("surfaceHolder may not be null");
    }
}
