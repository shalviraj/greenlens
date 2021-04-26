package p005b.p265m.p266a.p267t;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/* renamed from: b.m.a.t.a */
public final class C4731a {

    /* renamed from: h */
    public static final String f9036h = "a";

    /* renamed from: i */
    public static final Collection<String> f9037i;

    /* renamed from: a */
    public boolean f9038a;

    /* renamed from: b */
    public boolean f9039b;

    /* renamed from: c */
    public final boolean f9040c;

    /* renamed from: d */
    public final Camera f9041d;

    /* renamed from: e */
    public Handler f9042e;

    /* renamed from: f */
    public final Handler.Callback f9043f;

    /* renamed from: g */
    public final Camera.AutoFocusCallback f9044g = new C4733b();

    /* renamed from: b.m.a.t.a$a */
    public class C4732a implements Handler.Callback {
        public C4732a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            Objects.requireNonNull(C4731a.this);
            if (i != 1) {
                return false;
            }
            C4731a.this.mo16459b();
            return true;
        }
    }

    /* renamed from: b.m.a.t.a$b */
    public class C4733b implements Camera.AutoFocusCallback {

        /* renamed from: b.m.a.t.a$b$a */
        public class C4734a implements Runnable {
            public C4734a() {
            }

            public void run() {
                C4731a aVar = C4731a.this;
                aVar.f9039b = false;
                aVar.mo16458a();
            }
        }

        public C4733b() {
        }

        public void onAutoFocus(boolean z, Camera camera) {
            C4731a.this.f9042e.post(new C4734a());
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f9037i = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public C4731a(Camera camera, C4745f fVar) {
        C4732a aVar = new C4732a();
        this.f9043f = aVar;
        this.f9042e = new Handler(aVar);
        this.f9041d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        Objects.requireNonNull(fVar);
        boolean contains = f9037i.contains(focusMode);
        this.f9040c = contains;
        String str = f9036h;
        Log.i(str, "Current focus mode '" + focusMode + "'; use auto focus? " + contains);
        this.f9038a = false;
        mo16459b();
    }

    /* renamed from: a */
    public final synchronized void mo16458a() {
        if (!this.f9038a && !this.f9042e.hasMessages(1)) {
            Handler handler = this.f9042e;
            handler.sendMessageDelayed(handler.obtainMessage(1), 2000);
        }
    }

    /* renamed from: b */
    public final void mo16459b() {
        if (this.f9040c && !this.f9038a && !this.f9039b) {
            try {
                this.f9041d.autoFocus(this.f9044g);
                this.f9039b = true;
            } catch (RuntimeException e) {
                Log.w(f9036h, "Unexpected exception while focusing", e);
                mo16458a();
            }
        }
    }

    /* renamed from: c */
    public void mo16460c() {
        this.f9038a = true;
        this.f9039b = false;
        this.f9042e.removeMessages(1);
        if (this.f9040c) {
            try {
                this.f9041d.cancelAutoFocus();
            } catch (RuntimeException e) {
                Log.w(f9036h, "Unexpected exception while cancelling focusing", e);
            }
        }
    }
}
