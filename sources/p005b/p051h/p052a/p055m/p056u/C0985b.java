package p005b.p051h.p052a.p055m.p056u;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;
import p005b.p051h.p052a.C0934f;
import p005b.p051h.p052a.p055m.C0962a;
import p005b.p051h.p052a.p055m.p056u.C0987d;

/* renamed from: b.h.a.m.u.b */
public abstract class C0985b<T> implements C0987d<T> {

    /* renamed from: g */
    public final String f1029g;

    /* renamed from: h */
    public final AssetManager f1030h;

    /* renamed from: i */
    public T f1031i;

    public C0985b(AssetManager assetManager, String str) {
        this.f1030h = assetManager;
        this.f1029g = str;
    }

    /* renamed from: b */
    public void mo10842b() {
        T t = this.f1031i;
        if (t != null) {
            try {
                mo10843c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public abstract void mo10843c(T t);

    public void cancel() {
    }

    /* renamed from: d */
    public abstract T mo10845d(AssetManager assetManager, String str);

    @NonNull
    /* renamed from: e */
    public C0962a mo10846e() {
        return C0962a.LOCAL;
    }

    /* renamed from: f */
    public void mo10847f(@NonNull C0934f fVar, @NonNull C0987d.C0988a<? super T> aVar) {
        try {
            T d = mo10845d(this.f1030h, this.f1029g);
            this.f1031i = d;
            aVar.mo10854d(d);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            aVar.mo10853c(e);
        }
    }
}
