package p005b.p051h.p052a.p055m.p064x.p065c;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Queue;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0981r;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1023b;
import p005b.p051h.p052a.p055m.p058v.p059c0.C1025d;
import p005b.p051h.p052a.p055m.p064x.p065c.C1245m;
import p005b.p051h.p052a.p078s.C1372d;
import p005b.p051h.p052a.p078s.C1378h;

/* renamed from: b.h.a.m.x.c.y */
public class C1263y implements C0981r<InputStream, Bitmap> {

    /* renamed from: a */
    public final C1245m f1569a;

    /* renamed from: b */
    public final C1023b f1570b;

    /* renamed from: b.h.a.m.x.c.y$a */
    public static class C1264a implements C1245m.C1247b {

        /* renamed from: a */
        public final C1260w f1571a;

        /* renamed from: b */
        public final C1372d f1572b;

        public C1264a(C1260w wVar, C1372d dVar) {
            this.f1571a = wVar;
            this.f1572b = dVar;
        }

        /* renamed from: a */
        public void mo11087a(C1025d dVar, Bitmap bitmap) {
            IOException iOException = this.f1572b.f1788h;
            if (iOException != null) {
                if (bitmap != null) {
                    dVar.mo10896e(bitmap);
                }
                throw iOException;
            }
        }

        /* renamed from: b */
        public void mo11088b() {
            C1260w wVar = this.f1571a;
            synchronized (wVar) {
                wVar.f1563i = wVar.f1561g.length;
            }
        }
    }

    public C1263y(C1245m mVar, C1023b bVar) {
        this.f1569a = mVar;
        this.f1570b = bVar;
    }

    /* renamed from: a */
    public C1115w mo10836a(@NonNull Object obj, int i, int i2, @NonNull C0979p pVar) {
        C1260w wVar;
        boolean z;
        C1372d poll;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof C1260w) {
            wVar = (C1260w) inputStream;
            z = false;
        } else {
            z = true;
            wVar = new C1260w(inputStream, this.f1570b);
        }
        Queue<C1372d> queue = C1372d.f1786i;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new C1372d();
        }
        poll.f1787g = wVar;
        try {
            return this.f1569a.mo11085b(new C1378h(poll), i, i2, pVar, new C1264a(wVar, poll));
        } finally {
            poll.mo11242d();
            if (z) {
                wVar.mo11097e();
            }
        }
    }

    /* renamed from: b */
    public boolean mo10837b(@NonNull Object obj, @NonNull C0979p pVar) {
        InputStream inputStream = (InputStream) obj;
        Objects.requireNonNull(this.f1569a);
        return true;
    }
}
