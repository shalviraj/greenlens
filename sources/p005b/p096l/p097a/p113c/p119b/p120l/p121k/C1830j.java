package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p131e.p134c.C2016c;

/* renamed from: b.l.a.c.b.l.k.j */
public final class C1830j<L> {

    /* renamed from: a */
    public final C1833c f3230a;

    /* renamed from: b */
    public volatile L f3231b;

    /* renamed from: c */
    public final C1831a<L> f3232c;

    /* renamed from: b.l.a.c.b.l.k.j$a */
    public static final class C1831a<L> {

        /* renamed from: a */
        public final L f3233a;

        /* renamed from: b */
        public final String f3234b;

        public C1831a(L l, String str) {
            this.f3233a = l;
            this.f3234b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1831a)) {
                return false;
            }
            C1831a aVar = (C1831a) obj;
            return this.f3233a == aVar.f3233a && this.f3234b.equals(aVar.f3234b);
        }

        public final int hashCode() {
            return this.f3234b.hashCode() + (System.identityHashCode(this.f3233a) * 31);
        }
    }

    /* renamed from: b.l.a.c.b.l.k.j$b */
    public interface C1832b<L> {
        /* renamed from: a */
        void mo12135a(L l);

        /* renamed from: b */
        void mo12136b();
    }

    /* renamed from: b.l.a.c.b.l.k.j$c */
    public final class C1833c extends C2016c {
        public C1833c(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            C0823f.m360b(z);
            C1832b bVar = (C1832b) message.obj;
            L l = C1830j.this.f3231b;
            if (l == null) {
                bVar.mo12136b();
                return;
            }
            try {
                bVar.mo12135a(l);
            } catch (RuntimeException e) {
                bVar.mo12136b();
                throw e;
            }
        }
    }

    public C1830j(@NonNull Looper looper, @NonNull L l, @NonNull String str) {
        this.f3230a = new C1833c(looper);
        C0823f.m380l(l, "Listener must not be null");
        this.f3231b = l;
        C0823f.m376j(str);
        this.f3232c = new C1831a<>(l, str);
    }

    /* renamed from: a */
    public final void mo12132a(C1832b<? super L> bVar) {
        C0823f.m380l(bVar, "Notifier must not be null");
        this.f3230a.sendMessage(this.f3230a.obtainMessage(1, bVar));
    }
}
