package p005b.p096l.p232f.p254x.p255a;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.util.Log;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import java.io.IOException;

/* renamed from: b.l.f.x.a.c */
public final class C4645c {

    /* renamed from: c */
    public static final String f8758c = "c";

    /* renamed from: a */
    public final Context f8759a;

    /* renamed from: b */
    public boolean f8760b = true;

    /* renamed from: b.l.f.x.a.c$a */
    public class C4646a implements MediaPlayer.OnCompletionListener {
        public C4646a(C4645c cVar) {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }

    /* renamed from: b.l.f.x.a.c$b */
    public class C4647b implements MediaPlayer.OnErrorListener {
        public C4647b(C4645c cVar) {
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            String str = C4645c.f8758c;
            Log.w(str, "Failed to beep " + i + ", " + i2);
            mediaPlayer.stop();
            mediaPlayer.release();
            return true;
        }
    }

    public C4645c(Activity activity) {
        activity.setVolumeControlStream(3);
        this.f8759a = activity.getApplicationContext();
    }

    /* renamed from: a */
    public MediaPlayer mo16311a() {
        AssetFileDescriptor openRawResourceFd;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnCompletionListener(new C4646a(this));
        mediaPlayer.setOnErrorListener(new C4647b(this));
        try {
            openRawResourceFd = this.f8759a.getResources().openRawResourceFd(R.raw.zxing_beep);
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
            mediaPlayer.setVolume(0.1f, 0.1f);
            mediaPlayer.prepare();
            mediaPlayer.start();
            return mediaPlayer;
        } catch (IOException e) {
            Log.w(f8758c, e);
            mediaPlayer.release();
            return null;
        } catch (Throwable th) {
            openRawResourceFd.close();
            throw th;
        }
    }
}
