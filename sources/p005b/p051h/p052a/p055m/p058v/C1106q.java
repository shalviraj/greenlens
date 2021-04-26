package p005b.p051h.p052a.p055m.p058v;

import androidx.annotation.NonNull;
import java.util.Objects;
import p005b.p051h.p052a.p055m.C0974m;

/* renamed from: b.h.a.m.v.q */
public class C1106q<Z> implements C1115w<Z> {

    /* renamed from: g */
    public final boolean f1321g;

    /* renamed from: h */
    public final boolean f1322h;

    /* renamed from: i */
    public final C1115w<Z> f1323i;

    /* renamed from: j */
    public final C1107a f1324j;

    /* renamed from: k */
    public final C0974m f1325k;

    /* renamed from: l */
    public int f1326l;

    /* renamed from: m */
    public boolean f1327m;

    /* renamed from: b.h.a.m.v.q$a */
    public interface C1107a {
        /* renamed from: a */
        void mo10982a(C0974m mVar, C1106q<?> qVar);
    }

    public C1106q(C1115w<Z> wVar, boolean z, boolean z2, C0974m mVar, C1107a aVar) {
        Objects.requireNonNull(wVar, "Argument must not be null");
        this.f1323i = wVar;
        this.f1321g = z;
        this.f1322h = z2;
        this.f1325k = mVar;
        Objects.requireNonNull(aVar, "Argument must not be null");
        this.f1324j = aVar;
    }

    /* renamed from: a */
    public int mo11004a() {
        return this.f1323i.mo11004a();
    }

    @NonNull
    /* renamed from: b */
    public Class<Z> mo11005b() {
        return this.f1323i.mo11005b();
    }

    /* renamed from: c */
    public synchronized void mo11006c() {
        if (!this.f1327m) {
            this.f1326l++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* renamed from: d */
    public void mo11007d() {
        boolean z;
        synchronized (this) {
            int i = this.f1326l;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.f1326l = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f1324j.mo10982a(this.f1325k, this);
        }
    }

    @NonNull
    public Z get() {
        return this.f1323i.get();
    }

    public synchronized void recycle() {
        if (this.f1326l > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f1327m) {
            this.f1327m = true;
            if (this.f1322h) {
                this.f1323i.recycle();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f1321g + ", listener=" + this.f1324j + ", key=" + this.f1325k + ", acquired=" + this.f1326l + ", isRecycled=" + this.f1327m + ", resource=" + this.f1323i + '}';
    }
}
