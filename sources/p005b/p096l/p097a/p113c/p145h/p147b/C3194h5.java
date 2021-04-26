package p005b.p096l.p097a.p113c.p145h.p147b;

/* renamed from: b.l.a.c.h.b.h5 */
public final class C3194h5 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ String f5577g;

    /* renamed from: h */
    public final /* synthetic */ String f5578h;

    /* renamed from: i */
    public final /* synthetic */ String f5579i;

    /* renamed from: j */
    public final /* synthetic */ long f5580j;

    /* renamed from: k */
    public final /* synthetic */ C3205i5 f5581k;

    public C3194h5(C3205i5 i5Var, String str, String str2, String str3, long j) {
        this.f5581k = i5Var;
        this.f5577g = str;
        this.f5578h = str2;
        this.f5579i = str3;
        this.f5580j = j;
    }

    public final void run() {
        if (this.f5577g == null) {
            this.f5581k.f5605a.f5658k.mo14472y().mo14215s(this.f5578h, (C3371x6) null);
            return;
        }
        C3174f7 y = this.f5581k.f5605a.f5658k.mo14472y();
        String str = this.f5578h;
        y.mo14126h();
        synchronized (y) {
            String str2 = y.f5519m;
            if (str2 != null) {
                boolean equals = str2.equals(str);
            }
            y.f5519m = str;
        }
    }
}
