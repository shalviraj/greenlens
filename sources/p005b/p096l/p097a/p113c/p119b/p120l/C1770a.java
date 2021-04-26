package p005b.p096l.p097a.p113c.p119b.p120l;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.C1758d;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a.C1774d;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1813f;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1839l;
import p005b.p096l.p097a.p113c.p119b.p122m.C1889b;
import p005b.p096l.p097a.p113c.p119b.p122m.C1905d;
import p005b.p096l.p097a.p113c.p119b.p122m.C1929n;

/* renamed from: b.l.a.c.b.l.a */
public final class C1770a<O extends C1774d> {

    /* renamed from: a */
    public final C1771a<?, O> f3124a;

    /* renamed from: b */
    public final C1780g<?> f3125b;

    /* renamed from: c */
    public final String f3126c;

    /* renamed from: b.l.a.c.b.l.a$a */
    public static abstract class C1771a<T extends C1779f, O> extends C1778e<T, O> {
        @Deprecated
        /* renamed from: a */
        public T mo12013a(Context context, Looper looper, C1905d dVar, O o, GoogleApiClient.C5470b bVar, GoogleApiClient.C5471c cVar) {
            return mo11976b(context, looper, dVar, o, bVar, cVar);
        }

        /* renamed from: b */
        public T mo11976b(Context context, Looper looper, C1905d dVar, O o, C1813f fVar, C1839l lVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: b.l.a.c.b.l.a$b */
    public interface C1772b {
    }

    /* renamed from: b.l.a.c.b.l.a$c */
    public static class C1773c<C extends C1772b> {
    }

    /* renamed from: b.l.a.c.b.l.a$d */
    public interface C1774d {

        /* renamed from: b.l.a.c.b.l.a$d$a */
        public interface C1775a extends C1774d {
            /* renamed from: a */
            Account mo12014a();
        }

        /* renamed from: b.l.a.c.b.l.a$d$b */
        public interface C1776b extends C1774d {
            /* renamed from: b */
            GoogleSignInAccount mo12015b();
        }

        /* renamed from: b.l.a.c.b.l.a$d$c */
        public static final class C1777c implements C1774d {
        }
    }

    /* renamed from: b.l.a.c.b.l.a$e */
    public static abstract class C1778e<T extends C1772b, O> {
    }

    /* renamed from: b.l.a.c.b.l.a$f */
    public interface C1779f extends C1772b {
        /* renamed from: a */
        boolean mo12016a();

        /* renamed from: b */
        void mo12017b();

        /* renamed from: e */
        void mo12018e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        /* renamed from: f */
        void mo12019f(C1889b.C1894e eVar);

        /* renamed from: h */
        boolean mo12020h();

        @NonNull
        /* renamed from: i */
        Set<Scope> mo12021i();

        /* renamed from: j */
        void mo12022j(C1929n nVar, Set<Scope> set);

        /* renamed from: m */
        boolean mo12023m();

        /* renamed from: n */
        int mo12024n();

        /* renamed from: o */
        boolean mo12025o();

        /* renamed from: p */
        C1758d[] mo12026p();

        /* renamed from: q */
        String mo12027q();

        /* renamed from: r */
        void mo12028r(C1889b.C1892c cVar);

        /* renamed from: s */
        Intent mo12029s();

        /* renamed from: t */
        boolean mo12030t();
    }

    /* renamed from: b.l.a.c.b.l.a$g */
    public static final class C1780g<C extends C1779f> extends C1773c<C> {
    }

    public <C extends C1779f> C1770a(String str, C1771a<C, O> aVar, C1780g<C> gVar) {
        C0823f.m380l(aVar, "Cannot construct an Api with a null ClientBuilder");
        C0823f.m380l(gVar, "Cannot construct an Api with a null ClientKey");
        this.f3126c = str;
        this.f3124a = aVar;
        this.f3125b = gVar;
    }

    /* renamed from: a */
    public final C1773c<?> mo12012a() {
        C1780g<?> gVar = this.f3125b;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }
}
