package p298d.p299a.p300a.p301a.p303y0.p314d.p324b;

import androidx.core.app.FrameMetricsAggregator;
import androidx.media.AudioAttributesCompat;

/* renamed from: d.a.a.a.y0.d.b.v */
public final class C6568v {

    /* renamed from: k */
    public static final C6568v f12858k;

    /* renamed from: l */
    public static final C6568v f12859l = new C6568v(false, false, false, false, false, (C6568v) null, false, (C6568v) null, (C6568v) null, true, FrameMetricsAggregator.EVERY_DURATION);

    /* renamed from: m */
    public static final C6568v f12860m;

    /* renamed from: a */
    public final boolean f12861a;

    /* renamed from: b */
    public final boolean f12862b;

    /* renamed from: c */
    public final boolean f12863c;

    /* renamed from: d */
    public final boolean f12864d;

    /* renamed from: e */
    public final boolean f12865e;

    /* renamed from: f */
    public final C6568v f12866f;

    /* renamed from: g */
    public final boolean f12867g;

    /* renamed from: h */
    public final C6568v f12868h;

    /* renamed from: i */
    public final C6568v f12869i;

    /* renamed from: j */
    public final boolean f12870j;

    static {
        C6568v vVar = new C6568v(false, false, false, false, false, (C6568v) null, false, (C6568v) null, (C6568v) null, false, AudioAttributesCompat.FLAG_ALL);
        f12858k = vVar;
        f12860m = new C6568v(false, false, false, false, false, vVar, false, (C6568v) null, (C6568v) null, false, 988);
    }

    public C6568v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C6568v vVar, boolean z6, C6568v vVar2, C6568v vVar3, boolean z7, int i) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        z3 = (i & 4) != 0 ? false : z3;
        z4 = (i & 8) != 0 ? false : z4;
        z5 = (i & 16) != 0 ? false : z5;
        vVar = (i & 32) != 0 ? null : vVar;
        z6 = (i & 64) != 0 ? true : z6;
        vVar2 = (i & 128) != 0 ? vVar : vVar2;
        vVar3 = (i & 256) != 0 ? vVar : vVar3;
        z7 = (i & 512) != 0 ? false : z7;
        this.f12861a = z;
        this.f12862b = z2;
        this.f12863c = z3;
        this.f12864d = z4;
        this.f12865e = z5;
        this.f12866f = vVar;
        this.f12867g = z6;
        this.f12868h = vVar2;
        this.f12869i = vVar3;
        this.f12870j = z7;
    }
}
