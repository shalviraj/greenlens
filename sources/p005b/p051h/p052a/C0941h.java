package p005b.p051h.p052a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p005b.p051h.p052a.p055m.p058v.C1086k;
import p005b.p051h.p052a.p071n.C1320n;
import p005b.p051h.p052a.p074q.C1339a;
import p005b.p051h.p052a.p074q.C1340b;
import p005b.p051h.p052a.p074q.C1341c;
import p005b.p051h.p052a.p074q.C1342d;
import p005b.p051h.p052a.p074q.C1343e;
import p005b.p051h.p052a.p074q.C1345g;
import p005b.p051h.p052a.p074q.p075h.C1348b;
import p005b.p051h.p052a.p074q.p075h.C1350d;
import p005b.p051h.p052a.p074q.p075h.C1354h;
import p005b.p051h.p052a.p074q.p075h.C1355i;
import p005b.p051h.p052a.p078s.C1373e;
import p005b.p051h.p052a.p078s.C1380j;

/* renamed from: b.h.a.h */
public class C0941h<TranscodeType> extends C1339a<C0941h<TranscodeType>> implements Cloneable {

    /* renamed from: G */
    public final Context f888G;

    /* renamed from: H */
    public final C0943i f889H;

    /* renamed from: I */
    public final Class<TranscodeType> f890I;

    /* renamed from: J */
    public final C0933e f891J;
    @NonNull

    /* renamed from: K */
    public C0946j<?, ? super TranscodeType> f892K;
    @Nullable

    /* renamed from: L */
    public Object f893L;
    @Nullable

    /* renamed from: M */
    public List<C1342d<TranscodeType>> f894M;

    /* renamed from: N */
    public boolean f895N = true;

    /* renamed from: O */
    public boolean f896O;

    /* renamed from: b.h.a.h$a */
    public static /* synthetic */ class C0942a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f897a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f898b;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|(2:1|2)|3|5|6|7|8|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|(3:27|28|30)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|8|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0015 */
        static {
            /*
                p005b.p051h.p052a.C0934f.values()
                r0 = 4
                int[] r1 = new int[r0]
                f898b = r1
                r2 = 1
                r3 = 3
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x000c }
            L_0x000c:
                r1 = 2
                int[] r4 = f898b     // Catch:{ NoSuchFieldError -> 0x0011 }
                r4[r1] = r1     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                int[] r4 = f898b     // Catch:{ NoSuchFieldError -> 0x0015 }
                r4[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                int[] r4 = f898b     // Catch:{ NoSuchFieldError -> 0x001a }
                r5 = 0
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x001a }
            L_0x001a:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f897a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                int[] r2 = f897a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r1 = f897a     // Catch:{ NoSuchFieldError -> 0x003f }
                android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x003f }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x003f }
            L_0x003f:
                int[] r1 = f897a     // Catch:{ NoSuchFieldError -> 0x0049 }
                android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f897a     // Catch:{ NoSuchFieldError -> 0x0054 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f897a     // Catch:{ NoSuchFieldError -> 0x005f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x005f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                int[] r0 = f897a     // Catch:{ NoSuchFieldError -> 0x006a }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x006a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r0 = f897a     // Catch:{ NoSuchFieldError -> 0x0076 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x0076 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0076 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0076 }
            L_0x0076:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.C0941h.C0942a.<clinit>():void");
        }
    }

    static {
        C1343e eVar = (C1343e) ((C1343e) ((C1343e) new C1343e().mo10387g(C1086k.f1252b)).mo10394p(C0934f.LOW)).mo10397t(true);
    }

    @SuppressLint({"CheckResult"})
    public C0941h(@NonNull C0929c cVar, C0943i iVar, Class<TranscodeType> cls, Context context) {
        C1343e eVar;
        this.f889H = iVar;
        this.f890I = cls;
        this.f888G = context;
        C0933e eVar2 = iVar.f900g.f841i;
        C0946j<?, ?> jVar = eVar2.f868f.get(cls);
        if (jVar == null) {
            for (Map.Entry next : eVar2.f868f.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    jVar = (C0946j) next.getValue();
                }
            }
        }
        this.f892K = jVar == null ? C0933e.f862k : jVar;
        this.f891J = cVar.f841i;
        for (C1342d<Object> z : iVar.f909p) {
            mo10410z(z);
        }
        synchronized (iVar) {
            eVar = iVar.f910q;
        }
        mo10382a(eVar);
    }

    @CheckResult
    @NonNull
    /* renamed from: A */
    public C0941h<TranscodeType> mo10382a(@NonNull C1339a<?> aVar) {
        Objects.requireNonNull(aVar, "Argument must not be null");
        return (C0941h) super.mo10382a(aVar);
    }

    /* renamed from: B */
    public final C1340b mo10769B(Object obj, C1354h<TranscodeType> hVar, @Nullable C1342d<TranscodeType> dVar, @Nullable C1341c cVar, C0946j<?, ? super TranscodeType> jVar, C0934f fVar, int i, int i2, C1339a<?> aVar, Executor executor) {
        return mo10772J(obj, hVar, dVar, aVar, (C1341c) null, jVar, fVar, i, i2, executor);
    }

    @CheckResult
    /* renamed from: C */
    public C0941h<TranscodeType> mo10385d() {
        C0941h<TranscodeType> hVar = (C0941h) super.clone();
        hVar.f892K = hVar.f892K.mo10785a();
        return hVar;
    }

    /* renamed from: D */
    public final <Y extends C1354h<TranscodeType>> Y mo10770D(@NonNull Y y, @Nullable C1342d<TranscodeType> dVar, C1339a<?> aVar, Executor executor) {
        Y y2 = y;
        C1339a<?> aVar2 = aVar;
        Objects.requireNonNull(y, "Argument must not be null");
        if (this.f896O) {
            C1340b B = mo10769B(new Object(), y, dVar, (C1341c) null, this.f892K, aVar2.f1704j, aVar2.f1711q, aVar2.f1710p, aVar, executor);
            C1340b f = y.mo11213f();
            C1345g gVar = (C1345g) B;
            if (gVar.mo11201i(f)) {
                if (!(!aVar2.f1709o && f.mo11183c())) {
                    Objects.requireNonNull(f, "Argument must not be null");
                    if (!f.isRunning()) {
                        f.mo11181a();
                    }
                    return y2;
                }
            }
            this.f889H.mo10775n(y);
            y.mo11215i(B);
            C0943i iVar = this.f889H;
            synchronized (iVar) {
                iVar.f905l.f1677g.add(y);
                C1320n nVar = iVar.f903j;
                nVar.f1667a.add(B);
                if (!nVar.f1669c) {
                    gVar.mo11181a();
                } else {
                    gVar.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    nVar.f1668b.add(B);
                }
            }
            return y2;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    @NonNull
    /* renamed from: E */
    public C1355i<ImageView, TranscodeType> mo10771E(@NonNull ImageView imageView) {
        C1339a aVar;
        C1355i<ImageView, TranscodeType> iVar;
        C1380j.m1468a();
        if (!C1339a.m1361i(this.f1701g, 2048) && this.f1714t && imageView.getScaleType() != null) {
            switch (C0942a.f897a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = mo10385d().mo10390k();
                    break;
                case 2:
                case 6:
                    aVar = mo10385d().mo10391l();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = mo10385d().mo10392m();
                    break;
            }
        }
        aVar = this;
        C0933e eVar = this.f891J;
        Class<TranscodeType> cls = this.f890I;
        Objects.requireNonNull(eVar.f865c);
        if (Bitmap.class.equals(cls)) {
            iVar = new C1348b(imageView);
        } else if (Drawable.class.isAssignableFrom(cls)) {
            iVar = new C1350d(imageView);
        } else {
            throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
        }
        mo10770D(iVar, (C1342d) null, aVar, C1373e.f1789a);
        return iVar;
    }

    @CheckResult
    @NonNull
    /* renamed from: F */
    public C0941h<TranscodeType> mo10403F(@Nullable File file) {
        this.f893L = file;
        this.f896O = true;
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: G */
    public C0941h<TranscodeType> mo10404G(@Nullable Object obj) {
        this.f893L = obj;
        this.f896O = true;
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: I */
    public C0941h<TranscodeType> mo10405I(@Nullable String str) {
        this.f893L = str;
        this.f896O = true;
        return this;
    }

    /* renamed from: J */
    public final C1340b mo10772J(Object obj, C1354h<TranscodeType> hVar, C1342d<TranscodeType> dVar, C1339a<?> aVar, C1341c cVar, C0946j<?, ? super TranscodeType> jVar, C0934f fVar, int i, int i2, Executor executor) {
        Context context = this.f888G;
        C0933e eVar = this.f891J;
        return new C1345g(context, eVar, obj, this.f893L, this.f890I, aVar, i, i2, fVar, hVar, dVar, this.f894M, cVar, eVar.f869g, jVar.f914g, executor);
    }

    @CheckResult
    @NonNull
    /* renamed from: K */
    public C0941h<TranscodeType> mo10406K(@NonNull C0946j<?, ? super TranscodeType> jVar) {
        Objects.requireNonNull(jVar, "Argument must not be null");
        this.f892K = jVar;
        this.f895N = false;
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: z */
    public C0941h<TranscodeType> mo10410z(@Nullable C1342d<TranscodeType> dVar) {
        if (dVar != null) {
            if (this.f894M == null) {
                this.f894M = new ArrayList();
            }
            this.f894M.add(dVar);
        }
        return this;
    }
}
