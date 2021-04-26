package p005b.p006a.p007a.p009b.p012m;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.MediaController;
import java.io.IOException;
import java.util.Objects;
import kotlin.Metadata;
import p298d.p344x.p346c.C6888i;
import p441p.p442a.C8091a;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003:0#J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0013J\u000f\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u0013J\u000f\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0018J\u000f\u0010\u001e\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u0018J\u0017\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\u0015J'\u0010'\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010\u0015J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0016H\u0016¢\u0006\u0004\b+\u0010,J'\u0010-\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b-\u0010(J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0006H\u0002¢\u0006\u0004\b0\u0010\u0015J\u000f\u00101\u001a\u00020\u0006H\u0002¢\u0006\u0004\b1\u0010\u0015J7\u0010:\u001a\u0002092\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u0002042\u0006\u00108\u001a\u000204H\u0002¢\u0006\u0004\b:\u0010;R\u0016\u0010>\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010F\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010K\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010=R\u0016\u0010M\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010=R\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010U\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010Y\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010[\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bZ\u0010=¨\u0006\\"}, mo24462d2 = {"Lb/a/a/b/m/a;", "Landroid/view/TextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/widget/MediaController$MediaPlayerControl;", "Lb/a/a/b/m/a$b;", "scaleType", "Ld/r;", "setScaleType", "(Lb/a/a/b/m/a$b;)V", "", "path", "setDataSource", "(Ljava/lang/String;)V", "Lb/a/a/b/m/a$a;", "listener", "setListener", "(Lb/a/a/b/m/a$a;)V", "", "isPlaying", "()Z", "start", "()V", "", "getCurrentPosition", "()I", "getBufferPercentage", "canPause", "canSeekBackward", "canSeekForward", "getAudioSessionId", "getDuration", "Landroid/graphics/SurfaceTexture;", "surface", "onSurfaceTextureDestroyed", "(Landroid/graphics/SurfaceTexture;)Z", "c", "surfaceTexture", "width", "height", "onSurfaceTextureAvailable", "(Landroid/graphics/SurfaceTexture;II)V", "pause", "milliseconds", "seekTo", "(I)V", "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "(Landroid/graphics/SurfaceTexture;)V", "b", "d", "", "viewSize", "", "sx", "sy", "px", "py", "Landroid/graphics/Matrix;", "a", "(Ljava/lang/Object;FFFF)Landroid/graphics/Matrix;", "i", "Z", "mIsViewAvailable", "Landroid/widget/ImageView;", "n", "Landroid/widget/ImageView;", "getThumbnail", "()Landroid/widget/ImageView;", "setThumbnail", "(Landroid/widget/ImageView;)V", "thumbnail", "o", "Lb/a/a/b/m/a$a;", "mListener", "k", "mIsPlayCalled", "h", "mIsDataSourceSet", "Lb/a/a/b/m/a$c;", "l", "Lb/a/a/b/m/a$c;", "mState", "Landroid/media/MediaPlayer;", "g", "Landroid/media/MediaPlayer;", "mMediaPlayer", "Landroid/view/Surface;", "m", "Landroid/view/Surface;", "mSurface", "j", "mIsVideoPrepared", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
/* renamed from: b.a.a.b.m.a */
public final class C0647a extends TextureView implements TextureView.SurfaceTextureListener, MediaController.MediaPlayerControl {

    /* renamed from: p */
    public static final /* synthetic */ int f329p = 0;

    /* renamed from: g */
    public MediaPlayer f330g;

    /* renamed from: h */
    public boolean f331h;

    /* renamed from: i */
    public boolean f332i;

    /* renamed from: j */
    public boolean f333j;

    /* renamed from: k */
    public boolean f334k;

    /* renamed from: l */
    public C0650c f335l;

    /* renamed from: m */
    public Surface f336m;

    /* renamed from: n */
    public ImageView f337n;

    /* renamed from: o */
    public C0648a f338o;

    /* renamed from: b.a.a.b.m.a$a */
    public interface C0648a {
        /* renamed from: a */
        void mo10451a();

        /* renamed from: b */
        void mo10452b();
    }

    /* renamed from: b.a.a.b.m.a$b */
    public enum C0649b {
        CENTER_CROP,
        TOP,
        BOTTOM
    }

    /* renamed from: b.a.a.b.m.a$c */
    public enum C0650c {
        UNINITIALIZED,
        PLAY,
        STOP,
        PAUSE,
        END
    }

    /* renamed from: b.a.a.b.m.a$d */
    public static final class C0651d implements MediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a */
        public final /* synthetic */ C0647a f349a;

        public C0651d(C0647a aVar) {
            this.f349a = aVar;
        }

        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            C0647a aVar = this.f349a;
            int i3 = C0647a.f329p;
            Objects.requireNonNull(aVar);
            if (i != 0 && i2 != 0) {
                float width = (float) aVar.getWidth();
                float f = width / ((float) i);
                float height = (float) aVar.getHeight();
                float f2 = height / ((float) i2);
                float max = Math.max(f, f2);
                aVar.setTransform(aVar.mo10428a(max / f, max / f2, width / 2.0f, height / 2.0f));
            }
        }
    }

    /* renamed from: b.a.a.b.m.a$e */
    public static final class C0652e implements MediaPlayer.OnCompletionListener {

        /* renamed from: a */
        public final /* synthetic */ C0647a f350a;

        public C0652e(C0647a aVar) {
            this.f350a = aVar;
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            this.f350a.f335l = C0650c.END;
            C8091a.f16272d.mo26043a("Video has ended.", new Object[0]);
            C0648a aVar = this.f350a.f338o;
            if (aVar != null && aVar != null) {
                aVar.mo10452b();
            }
        }
    }

    /* renamed from: b.a.a.b.m.a$f */
    public static final class C0653f implements MediaPlayer.OnPreparedListener {

        /* renamed from: a */
        public final /* synthetic */ C0647a f351a;

        public C0653f(C0647a aVar) {
            this.f351a = aVar;
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            C8091a.C8093b bVar = C8091a.f16272d;
            bVar.mo26043a("MEDIAPLAYER PREPARED", new Object[0]);
            C0647a aVar = this.f351a;
            aVar.f333j = true;
            if (aVar.f334k && aVar.f332i) {
                bVar.mo26043a("Player is prepared and play() was called.", new Object[0]);
                this.f351a.mo10430c();
            }
            C0648a aVar2 = this.f351a.f338o;
            if (!(aVar2 == null || aVar2 == null)) {
                aVar2.mo10451a();
            }
            ImageView thumbnail = this.f351a.getThumbnail();
            if (thumbnail != null && (animate = thumbnail.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(1000)) != null) {
                duration.start();
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0647a(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
        /*
            r0 = this;
            r2 = r4 & 2
            r2 = 0
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0008
            r3 = 0
        L_0x0008:
            java.lang.String r4 = "context"
            p298d.p344x.p346c.C6888i.m12438e(r1, r4)
            r0.<init>(r1, r2, r3)
            r0.mo10429b()
            b.a.a.b.m.a$b r1 = p005b.p006a.p007a.p009b.p012m.C0647a.C0649b.CENTER_CROP
            r0.setScaleType(r1)
            r0.setSurfaceTextureListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p009b.p012m.C0647a.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    private final void setScaleType(C0649b bVar) {
    }

    /* renamed from: a */
    public final Matrix mo10428a(float f, float f2, float f3, float f4) {
        Matrix matrix = new Matrix();
        matrix.setScale(f, f2, f3, f4);
        return matrix;
    }

    /* renamed from: b */
    public final void mo10429b() {
        MediaPlayer mediaPlayer = this.f330g;
        if (mediaPlayer == null) {
            this.f330g = new MediaPlayer();
        } else if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
        this.f333j = false;
        this.f334k = false;
        this.f335l = C0650c.UNINITIALIZED;
    }

    /* renamed from: c */
    public final void mo10430c() {
        if (!this.f331h) {
            C8091a.f16272d.mo26043a("play() was called but data source was not set.", new Object[0]);
            return;
        }
        this.f334k = true;
        if (!this.f333j) {
            C8091a.f16272d.mo26043a("play() was called but video is not prepared yet, waiting.", new Object[0]);
        } else if (!this.f332i) {
            C8091a.f16272d.mo26043a("play() was called but view is not available yet, waiting.", new Object[0]);
        } else {
            C0650c cVar = this.f335l;
            C0650c cVar2 = C0650c.PLAY;
            if (cVar == cVar2) {
                C8091a.f16272d.mo26043a("play() was called but video is already playing.", new Object[0]);
            } else if (cVar == C0650c.PAUSE) {
                C8091a.f16272d.mo26043a("play() was called but video is paused, resuming.", new Object[0]);
                this.f335l = cVar2;
                MediaPlayer mediaPlayer = this.f330g;
                if (mediaPlayer != null) {
                    mediaPlayer.start();
                }
            } else if (cVar == C0650c.END || cVar == C0650c.STOP) {
                C8091a.f16272d.mo26043a("play() was called but video already ended, starting over.", new Object[0]);
                this.f335l = cVar2;
                MediaPlayer mediaPlayer2 = this.f330g;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.seekTo(0);
                }
                MediaPlayer mediaPlayer3 = this.f330g;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.start();
                }
            } else {
                this.f335l = cVar2;
                MediaPlayer mediaPlayer4 = this.f330g;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.start();
                }
            }
        }
    }

    public boolean canPause() {
        return true;
    }

    public boolean canSeekBackward() {
        return false;
    }

    public boolean canSeekForward() {
        return false;
    }

    /* renamed from: d */
    public final void mo10434d() {
        try {
            MediaPlayer mediaPlayer = this.f330g;
            if (mediaPlayer != null) {
                mediaPlayer.setLooping(true);
            }
            MediaPlayer mediaPlayer2 = this.f330g;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setOnVideoSizeChangedListener(new C0651d(this));
            }
            MediaPlayer mediaPlayer3 = this.f330g;
            if (mediaPlayer3 != null) {
                mediaPlayer3.setOnCompletionListener(new C0652e(this));
            }
            MediaPlayer mediaPlayer4 = this.f330g;
            if (mediaPlayer4 != null) {
                mediaPlayer4.prepareAsync();
            }
            MediaPlayer mediaPlayer5 = this.f330g;
            if (mediaPlayer5 != null) {
                mediaPlayer5.setOnPreparedListener(new C0653f(this));
            }
        } catch (IllegalArgumentException e) {
            C8091a.f16272d.mo26044b("IllegalArgumentException %s", e.getMessage());
        } catch (SecurityException e2) {
            C8091a.f16272d.mo26044b("SecurityException %s", e2.getMessage());
        } catch (IllegalStateException e3) {
            C8091a.f16272d.mo26044b("IllegalStateException %s", e3.toString());
        }
    }

    public int getAudioSessionId() {
        return 0;
    }

    public int getBufferPercentage() {
        MediaPlayer mediaPlayer = this.f330g;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentPosition() {
        return 0;
    }

    public int getDuration() {
        MediaPlayer mediaPlayer = this.f330g;
        if (mediaPlayer != null) {
            return mediaPlayer.getDuration();
        }
        return 0;
    }

    public final ImageView getThumbnail() {
        return this.f337n;
    }

    public boolean isPlaying() {
        return this.f335l == C0650c.PLAY;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C6888i.m12438e(surfaceTexture, "surfaceTexture");
        Surface surface = new Surface(surfaceTexture);
        this.f336m = surface;
        MediaPlayer mediaPlayer = this.f330g;
        if (mediaPlayer != null) {
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(surface);
            }
            this.f332i = true;
            if (this.f331h && this.f334k && this.f333j) {
                mo10430c();
            }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C6888i.m12438e(surfaceTexture, "surface");
        Surface surface = this.f336m;
        if (surface != null) {
            if (surface != null) {
                surface.release();
            }
            this.f336m = null;
        }
        AsyncTask.execute(new C0654b(this));
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C6888i.m12438e(surfaceTexture, "surface");
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C6888i.m12438e(surfaceTexture, "surface");
    }

    public void pause() {
        MediaPlayer mediaPlayer;
        C0650c cVar = this.f335l;
        C0650c cVar2 = C0650c.PAUSE;
        if (cVar == cVar2) {
            C8091a.f16272d.mo26043a("pause() was called but video already paused.", new Object[0]);
        } else if (cVar == C0650c.STOP) {
            C8091a.f16272d.mo26043a("pause() was called but video already stopped.", new Object[0]);
        } else if (cVar == C0650c.END) {
            C8091a.f16272d.mo26043a("pause() was called but video already ended.", new Object[0]);
        } else {
            this.f335l = cVar2;
            MediaPlayer mediaPlayer2 = this.f330g;
            if (mediaPlayer2 != null && mediaPlayer2.isPlaying() && (mediaPlayer = this.f330g) != null) {
                mediaPlayer.pause();
            }
        }
    }

    public void seekTo(int i) {
        MediaPlayer mediaPlayer = this.f330g;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(i);
        }
    }

    public final void setDataSource(String str) {
        mo10429b();
        try {
            MediaPlayer mediaPlayer = this.f330g;
            if (mediaPlayer != null) {
                mediaPlayer.setDataSource(str);
            }
            MediaPlayer mediaPlayer2 = this.f330g;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setVolume(0.0f, 0.0f);
            }
            this.f331h = true;
            mo10434d();
        } catch (IOException e) {
            C8091a.f16272d.mo26044b("Error %s", e.getLocalizedMessage());
        }
    }

    public final void setListener(C0648a aVar) {
        C6888i.m12438e(aVar, "listener");
        this.f338o = aVar;
    }

    public final void setThumbnail(ImageView imageView) {
        this.f337n = imageView;
    }

    public void start() {
        mo10430c();
    }
}
