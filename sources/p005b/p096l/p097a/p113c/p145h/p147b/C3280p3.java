package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.h.b.p3 */
public final class C3280p3 {
    @NonNull

    /* renamed from: a */
    public final String f5829a;
    @NonNull

    /* renamed from: b */
    public final String f5830b;

    /* renamed from: c */
    public final long f5831c;
    @NonNull

    /* renamed from: d */
    public final Bundle f5832d;

    public C3280p3(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j) {
        this.f5829a = str;
        this.f5830b = str2;
        this.f5832d = bundle;
        this.f5831c = j;
    }

    /* renamed from: a */
    public static C3280p3 m6270a(C3309s sVar) {
        return new C3280p3(sVar.f5937g, sVar.f5939i, sVar.f5938h.mo14488Z(), sVar.f5940j);
    }

    /* renamed from: b */
    public final C3309s mo14454b() {
        return new C3309s(this.f5829a, new C3287q(new Bundle(this.f5832d)), this.f5830b, this.f5831c);
    }

    public final String toString() {
        String str = this.f5830b;
        String str2 = this.f5829a;
        String valueOf = String.valueOf(this.f5832d);
        StringBuilder sb = new StringBuilder(C0843a.m441b(String.valueOf(str).length(), 21, String.valueOf(str2).length(), valueOf.length()));
        C0843a.m431G(sb, "origin=", str, ",name=", str2);
        return C0843a.m455p(sb, ",params=", valueOf);
    }
}
