package p005b.p096l.p097a.p151d.p152a.p154b;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p151d.p152a.p159e.C3583e0;
import p005b.p096l.p097a.p151d.p152a.p159e.C3585f0;

/* renamed from: b.l.a.d.a.b.h2 */
public final class C3501h2 implements C3585f0<Object> {

    /* renamed from: a */
    public final C3585f0 f6427a;

    /* renamed from: b */
    public final C3585f0 f6428b;

    /* renamed from: c */
    public final /* synthetic */ int f6429c = 0;

    public C3501h2(C3585f0<C3477b2> f0Var, C3585f0<Context> f0Var2) {
        this.f6427a = f0Var;
        this.f6428b = f0Var2;
    }

    public C3501h2(C3585f0<Context> f0Var, C3585f0<C3544t> f0Var2, byte[] bArr) {
        this.f6428b = f0Var;
        this.f6427a = f0Var2;
    }

    public C3501h2(C3585f0<Context> f0Var, C3585f0<C3511k0> f0Var2, char[] cArr) {
        this.f6427a = f0Var;
        this.f6428b = f0Var2;
    }

    public C3501h2(C3585f0<C3544t> f0Var, C3585f0<C3525n2> f0Var2, int[] iArr) {
        this.f6428b = f0Var;
        this.f6427a = f0Var2;
    }

    public C3501h2(C3585f0<Context> f0Var, C3585f0<C3528o1> f0Var2, short[] sArr) {
        this.f6427a = f0Var;
        this.f6428b = f0Var2;
    }

    /* renamed from: a */
    public final Object mo14735a() {
        int i = this.f6429c;
        if (i == 0) {
            Object a = this.f6427a.mo14735a();
            Context b = ((C3509j2) this.f6428b).mo14735a();
            C3477b2 b2Var = (C3477b2) a;
            C1960d.m2782c0(b.getPackageManager(), new ComponentName(b.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
            C1960d.m2782c0(b.getPackageManager(), new ComponentName(b.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
            int i2 = PlayCoreDialogWrapperActivity.f11404h;
            C1960d.m2782c0(b.getPackageManager(), new ComponentName(b.getPackageName(), "com.google.android.play.core.common.PlayCoreDialogWrapperActivity"), 1);
            Objects.requireNonNull(b2Var, "Cannot return null from a non-@Nullable @Provides method");
            return b2Var;
        } else if (i == 1) {
            return new C3559y(((C3509j2) this.f6428b).mo14735a(), (C3544t) this.f6427a.mo14735a());
        } else {
            if (i == 2) {
                return new C3518m(((C3509j2) this.f6427a).mo14735a(), (C3511k0) this.f6428b.mo14735a());
            }
            if (i == 3) {
                return new C3544t(((C3509j2) this.f6427a).mo14735a(), (C3528o1) this.f6428b.mo14735a());
            }
            return new C3536q1((C3544t) this.f6428b.mo14735a(), C3583e0.m6802b(this.f6427a));
        }
    }
}
