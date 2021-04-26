package p005b.p096l.p097a.p151d.p152a.p161g;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import p005b.p096l.p097a.p151d.p152a.p159e.C3578c;
import p005b.p096l.p097a.p151d.p152a.p159e.C3584f;
import p005b.p096l.p097a.p151d.p152a.p159e.C3604p;
import p005b.p096l.p097a.p151d.p152a.p159e.C3608r;

/* renamed from: b.l.a.d.a.g.h */
public final class C3632h {

    /* renamed from: c */
    public static final C3584f f6699c = new C3584f("ReviewService");
    @Nullable

    /* renamed from: a */
    public C3604p<C3578c> f6700a;

    /* renamed from: b */
    public final String f6701b;

    public C3632h(Context context) {
        this.f6701b = context.getPackageName();
        if (C3608r.m6844a(context)) {
            Context context2 = context;
            this.f6700a = new C3604p(context2, f6699c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), C3628d.f6693a);
        }
    }
}
