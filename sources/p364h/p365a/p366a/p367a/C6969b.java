package p364h.p365a.p366a.p367a;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import java.io.File;
import p364h.p365a.p366a.p367a.p369d.C6975a;
import p364h.p365a.p366a.p367a.p369d.C6977b;
import p364h.p365a.p366a.p367a.p369d.C6981f;

/* renamed from: h.a.a.a.b */
public class C6969b extends ViewPager implements C6975a.C6976a {

    /* renamed from: g */
    public Context f13981g;

    /* renamed from: h */
    public C6975a.C6976a f13982h;

    public C6969b(Context context, String str, C6975a.C6976a aVar) {
        super(context);
        this.f13981g = context;
        this.f13982h = aVar;
        C6981f fVar = new C6981f(context, new Handler(), this);
        setDownloader(fVar);
        new Thread(new C6977b(fVar, new File(this.f13981g.getCacheDir(), str.substring(str.lastIndexOf(47) + 1)).getAbsolutePath(), str)).start();
    }

    /* renamed from: a */
    public void mo10341a(int i, int i2) {
        this.f13982h.mo10341a(i, i2);
    }

    /* renamed from: b */
    public void mo10342b(Exception exc) {
        this.f13982h.mo10342b(exc);
    }

    /* renamed from: c */
    public void mo10343c(String str, String str2) {
        this.f13982h.mo10343c(str, str2);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void setDownloader(C6975a aVar) {
    }
}
