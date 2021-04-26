package p005b.p051h.p052a.p055m.p056u;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;
import p005b.p051h.p052a.C0934f;
import p005b.p051h.p052a.p055m.C0962a;
import p005b.p051h.p052a.p055m.p056u.C0987d;

/* renamed from: b.h.a.m.u.l */
public abstract class C1002l<T> implements C0987d<T> {

    /* renamed from: g */
    public final Uri f1052g;

    /* renamed from: h */
    public final ContentResolver f1053h;

    /* renamed from: i */
    public T f1054i;

    public C1002l(ContentResolver contentResolver, Uri uri) {
        this.f1053h = contentResolver;
        this.f1052g = uri;
    }

    /* renamed from: b */
    public void mo10842b() {
        T t = this.f1054i;
        if (t != null) {
            try {
                mo10840c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public abstract void mo10840c(T t);

    public void cancel() {
    }

    /* renamed from: d */
    public abstract T mo10841d(Uri uri, ContentResolver contentResolver);

    @NonNull
    /* renamed from: e */
    public C0962a mo10846e() {
        return C0962a.LOCAL;
    }

    /* renamed from: f */
    public final void mo10847f(@NonNull C0934f fVar, @NonNull C0987d.C0988a<? super T> aVar) {
        try {
            T d = mo10841d(this.f1052g, this.f1053h);
            this.f1054i = d;
            aVar.mo10854d(d);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            aVar.mo10853c(e);
        }
    }
}
