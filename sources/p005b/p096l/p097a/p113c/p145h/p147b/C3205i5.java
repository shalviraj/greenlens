package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.BinderThread;
import com.amplitude.api.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.C1767i;
import p005b.p096l.p097a.p113c.p119b.C1768j;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p131e.p140i.C2980u8;

/* renamed from: b.l.a.c.h.b.i5 */
public final class C3205i5 extends C3158e3 {

    /* renamed from: a */
    public final C3220j9 f5605a;

    /* renamed from: b */
    public Boolean f5606b;

    /* renamed from: c */
    public String f5607c = null;

    public C3205i5(C3220j9 j9Var) {
        Objects.requireNonNull(j9Var, "null reference");
        this.f5605a = j9Var;
    }

    @BinderThread
    /* renamed from: A0 */
    public final void mo14157A0(C3352v9 v9Var) {
        mo14280n(v9Var);
        mo14279k(new C3183g5(this, v9Var));
    }

    @BinderThread
    /* renamed from: B0 */
    public final void mo14158B0(C3118b bVar, C3352v9 v9Var) {
        Objects.requireNonNull(bVar, "null reference");
        Objects.requireNonNull(bVar.f5304i, "null reference");
        mo14280n(v9Var);
        C3118b bVar2 = new C3118b(bVar);
        bVar2.f5302g = v9Var.f6029g;
        mo14279k(new C3303r4(this, bVar2, v9Var));
    }

    @BinderThread
    /* renamed from: C0 */
    public final void mo14159C0(long j, String str, String str2, String str3) {
        mo14279k(new C3194h5(this, str2, str3, str, j));
    }

    @BinderThread
    /* renamed from: D */
    public final void mo14160D(C3352v9 v9Var) {
        C2980u8.m5384b();
        if (this.f5605a.mo14341G().mo14197r((String) null, C3134c3.f5415w0)) {
            C0823f.m376j(v9Var.f6029g);
            Objects.requireNonNull(v9Var.f6028B, "null reference");
            C3391z4 z4Var = new C3391z4(this, v9Var);
            if (this.f5605a.mo14331f().mo14418o()) {
                z4Var.run();
            } else {
                this.f5605a.mo14331f().mo14422s(z4Var);
            }
        }
    }

    @BinderThread
    /* renamed from: K */
    public final void mo14161K(C3352v9 v9Var) {
        mo14280n(v9Var);
        mo14279k(new C3380y4(this, v9Var));
    }

    @BinderThread
    /* renamed from: N0 */
    public final List<C3253m9> mo14162N0(String str, String str2, boolean z, C3352v9 v9Var) {
        mo14280n(v9Var);
        String str3 = v9Var.f6029g;
        Objects.requireNonNull(str3, "null reference");
        try {
            List<C3275o9> list = (List) ((FutureTask) this.f5605a.mo14331f().mo14419p(new C3325t4(this, str3, str, str2))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C3275o9 o9Var : list) {
                if (z || !C3297q9.m6338F(o9Var.f5821c)) {
                    arrayList.add(new C3253m9(o9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f5605a.mo14329d().f5799f.mo14416c("Failed to query user properties. appId", C3269o3.m6253t(v9Var.f6029g), e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    /* renamed from: Q */
    public final String mo14163Q(C3352v9 v9Var) {
        mo14280n(v9Var);
        C3220j9 j9Var = this.f5605a;
        try {
            return (String) ((FutureTask) j9Var.mo14331f().mo14419p(new C3176f9(j9Var, v9Var))).get(Constants.EVENT_UPLOAD_PERIOD_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            j9Var.mo14329d().f5799f.mo14416c("Failed to get app instance id. appId", C3269o3.m6253t(v9Var.f6029g), e);
            return null;
        }
    }

    @BinderThread
    /* renamed from: Q0 */
    public final List<C3118b> mo14164Q0(String str, String str2, String str3) {
        mo14281o(str, true);
        try {
            return (List) ((FutureTask) this.f5605a.mo14331f().mo14419p(new C3358w4(this, str, str2, str3))).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f5605a.mo14329d().f5799f.mo14415b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    /* renamed from: T0 */
    public final void mo14165T0(C3352v9 v9Var) {
        C0823f.m376j(v9Var.f6029g);
        mo14281o(v9Var.f6029g, false);
        mo14279k(new C3369x4(this, v9Var));
    }

    @BinderThread
    /* renamed from: W0 */
    public final void mo14166W0(C3253m9 m9Var, C3352v9 v9Var) {
        Objects.requireNonNull(m9Var, "null reference");
        mo14280n(v9Var);
        mo14279k(new C3160e5(this, m9Var, v9Var));
    }

    @BinderThread
    /* renamed from: Y0 */
    public final void mo14167Y0(C3309s sVar, C3352v9 v9Var) {
        Objects.requireNonNull(sVar, "null reference");
        mo14280n(v9Var);
        mo14279k(new C3124b5(this, sVar, v9Var));
    }

    @BinderThread
    /* renamed from: b1 */
    public final List<C3253m9> mo14168b1(String str, String str2, String str3, boolean z) {
        mo14281o(str, true);
        try {
            List<C3275o9> list = (List) ((FutureTask) this.f5605a.mo14331f().mo14419p(new C3336u4(this, str, str2, str3))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C3275o9 o9Var : list) {
                if (z || !C3297q9.m6338F(o9Var.f5821c)) {
                    arrayList.add(new C3253m9(o9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f5605a.mo14329d().f5799f.mo14416c("Failed to get user properties as. appId", C3269o3.m6253t(str), e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    /* renamed from: c1 */
    public final void mo14169c1(Bundle bundle, C3352v9 v9Var) {
        mo14280n(v9Var);
        String str = v9Var.f6029g;
        Objects.requireNonNull(str, "null reference");
        mo14279k(new C3292q4(this, str, bundle));
    }

    /* renamed from: k */
    public final void mo14279k(Runnable runnable) {
        if (this.f5605a.mo14331f().mo14418o()) {
            runnable.run();
        } else {
            this.f5605a.mo14331f().mo14420q(runnable);
        }
    }

    @BinderThread
    /* renamed from: l1 */
    public final byte[] mo14170l1(C3309s sVar, String str) {
        C0823f.m376j(str);
        Objects.requireNonNull(sVar, "null reference");
        mo14281o(str, true);
        this.f5605a.mo14329d().f5806m.mo14415b("Log and bundle. event", this.f5605a.mo14345K().mo14321p(sVar.f5937g));
        Objects.requireNonNull((C1959c) this.f5605a.mo14330e());
        long nanoTime = System.nanoTime() / 1000000;
        C3248m4 f = this.f5605a.mo14331f();
        C3148d5 d5Var = new C3148d5(this, sVar, str);
        f.mo14377l();
        C3226k4 k4Var = new C3226k4(f, d5Var, true);
        if (Thread.currentThread() == f.f5729c) {
            k4Var.run();
        } else {
            f.mo14424u(k4Var);
        }
        try {
            byte[] bArr = (byte[]) k4Var.get();
            if (bArr == null) {
                this.f5605a.mo14329d().f5799f.mo14415b("Log and bundle returned null. appId", C3269o3.m6253t(str));
                bArr = new byte[0];
            }
            Objects.requireNonNull((C1959c) this.f5605a.mo14330e());
            this.f5605a.mo14329d().f5806m.mo14417d("Log and bundle processed. event, size, time_ms", this.f5605a.mo14345K().mo14321p(sVar.f5937g), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f5605a.mo14329d().f5799f.mo14417d("Failed to log and bundle. appId, event, error", C3269o3.m6253t(str), this.f5605a.mo14345K().mo14321p(sVar.f5937g), e);
            return null;
        }
    }

    @BinderThread
    /* renamed from: n */
    public final void mo14280n(C3352v9 v9Var) {
        Objects.requireNonNull(v9Var, "null reference");
        C0823f.m376j(v9Var.f6029g);
        mo14281o(v9Var.f6029g, false);
        this.f5605a.mo14346L().mo14544o(v9Var.f6030h, v9Var.f6045w, v9Var.f6027A);
    }

    @BinderThread
    /* renamed from: o */
    public final void mo14281o(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f5606b == null) {
                        if (!"com.google.android.gms".equals(this.f5607c) && !C1960d.m2822m0(this.f5605a.f5658k.f5842a, Binder.getCallingUid())) {
                            if (!C1768j.m2347a(this.f5605a.f5658k.f5842a).mo12011b(Binder.getCallingUid())) {
                                z2 = false;
                                this.f5606b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f5606b = Boolean.valueOf(z2);
                    }
                    if (this.f5606b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f5605a.mo14329d().f5799f.mo14415b("Measurement Service called with invalid calling package. appId", C3269o3.m6253t(str));
                    throw e;
                }
            }
            if (this.f5607c == null) {
                Context context = this.f5605a.f5658k.f5842a;
                int callingUid = Binder.getCallingUid();
                boolean z3 = C1767i.f3116a;
                if (C1960d.m2744Q0(context, callingUid, str)) {
                    this.f5607c = str;
                }
            }
            if (!str.equals(this.f5607c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f5605a.mo14329d().f5799f.mo14414a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @BinderThread
    /* renamed from: r */
    public final List<C3118b> mo14171r(String str, String str2, C3352v9 v9Var) {
        mo14280n(v9Var);
        String str3 = v9Var.f6029g;
        Objects.requireNonNull(str3, "null reference");
        try {
            return (List) ((FutureTask) this.f5605a.mo14331f().mo14419p(new C3347v4(this, str3, str, str2))).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f5605a.mo14329d().f5799f.mo14415b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }
}
