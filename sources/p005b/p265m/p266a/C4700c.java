package p005b.p265m.p266a;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* renamed from: b.m.a.c */
public class C4700c implements TextureView.SurfaceTextureListener {

    /* renamed from: g */
    public final /* synthetic */ C4701d f8946g;

    public C4700c(C4701d dVar) {
        this.f8946g = dVar;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C4701d dVar = this.f8946g;
        dVar.f8969v = new C4729r(i, i2);
        dVar.mo16416h();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C4701d dVar = this.f8946g;
        dVar.f8969v = new C4729r(i, i2);
        dVar.mo16416h();
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
