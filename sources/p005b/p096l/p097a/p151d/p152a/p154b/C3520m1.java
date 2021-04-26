package p005b.p096l.p097a.p151d.p152a.p154b;

import java.io.File;
import java.util.Objects;
import java.util.concurrent.Executor;
import p005b.p096l.p097a.p151d.p152a.p156c.C3567c;
import p005b.p096l.p097a.p151d.p152a.p159e.C3579c0;

/* renamed from: b.l.a.d.a.b.m1 */
public final class C3520m1 {

    /* renamed from: a */
    public final C3544t f6477a;

    /* renamed from: b */
    public final C3579c0<C3525n2> f6478b;

    /* renamed from: c */
    public final C3551v0 f6479c;

    /* renamed from: d */
    public final C3579c0<Executor> f6480d;

    /* renamed from: e */
    public final C3511k0 f6481e;

    /* renamed from: f */
    public final C3567c f6482f;

    public C3520m1(C3544t tVar, C3579c0<C3525n2> c0Var, C3551v0 v0Var, C3579c0<Executor> c0Var2, C3511k0 k0Var, C3567c cVar) {
        this.f6477a = tVar;
        this.f6478b = c0Var;
        this.f6479c = v0Var;
        this.f6480d = c0Var2;
        this.f6481e = k0Var;
        this.f6482f = cVar;
    }

    /* renamed from: a */
    public final void mo14794a(C3508j1 j1Var) {
        File n = this.f6477a.mo14826n(j1Var.f6610b, j1Var.f6452c, j1Var.f6453d);
        C3544t tVar = this.f6477a;
        String str = j1Var.f6610b;
        int i = j1Var.f6452c;
        long j = j1Var.f6453d;
        Objects.requireNonNull(tVar);
        File file = new File(new File(tVar.mo14818e(str, i, j), "_slices"), "_metadata");
        if (!n.exists() || !file.exists()) {
            throw new C3495g0(String.format("Cannot find pack files to move for pack %s.", new Object[]{j1Var.f6610b}), j1Var.f6609a);
        }
        File k = this.f6477a.mo14823k(j1Var.f6610b, j1Var.f6452c, j1Var.f6453d);
        k.mkdirs();
        if (n.renameTo(k)) {
            new File(this.f6477a.mo14823k(j1Var.f6610b, j1Var.f6452c, j1Var.f6453d), "merge.tmp").delete();
            C3544t tVar2 = this.f6477a;
            String str2 = j1Var.f6610b;
            int i2 = j1Var.f6452c;
            long j2 = j1Var.f6453d;
            Objects.requireNonNull(tVar2);
            File file2 = new File(tVar2.mo14823k(str2, i2, j2), "_metadata");
            file2.mkdirs();
            if (file.renameTo(file2)) {
                if (this.f6482f.mo14870a()) {
                    this.f6480d.mo14881a().execute(new C3512k1(this, j1Var));
                } else {
                    C3544t tVar3 = this.f6477a;
                    tVar3.getClass();
                    this.f6480d.mo14881a().execute(new C3516l1(tVar3));
                }
                C3551v0 v0Var = this.f6479c;
                v0Var.mo14843b(new C3523n0(v0Var, j1Var.f6610b, j1Var.f6452c, j1Var.f6453d));
                this.f6481e.mo14789a(j1Var.f6610b);
                this.f6478b.mo14881a().mo14758a(j1Var.f6609a, j1Var.f6610b);
                return;
            }
            throw new C3495g0("Cannot move metadata files to final location.", j1Var.f6609a);
        }
        throw new C3495g0("Cannot move merged pack files to final location.", j1Var.f6609a);
    }
}
