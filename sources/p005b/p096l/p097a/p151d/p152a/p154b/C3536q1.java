package p005b.p096l.p097a.p151d.p152a.p154b;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.zip.GZIPInputStream;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p151d.p152a.p159e.C3577b0;
import p005b.p096l.p097a.p151d.p152a.p159e.C3579c0;
import p005b.p096l.p097a.p151d.p152a.p159e.C3584f;

/* renamed from: b.l.a.d.a.b.q1 */
public final class C3536q1 {

    /* renamed from: c */
    public static final C3584f f6533c = new C3584f("PatchSliceTaskHandler");

    /* renamed from: a */
    public final C3544t f6534a;

    /* renamed from: b */
    public final C3579c0<C3525n2> f6535b;

    public C3536q1(C3544t tVar, C3579c0<C3525n2> c0Var) {
        this.f6534a = tVar;
        this.f6535b = c0Var;
    }

    /* renamed from: a */
    public final void mo14799a(C3532p1 p1Var) {
        InputStream inputStream;
        File k = this.f6534a.mo14823k(p1Var.f6610b, p1Var.f6513c, p1Var.f6514d);
        C3544t tVar = this.f6534a;
        String str = p1Var.f6610b;
        int i = p1Var.f6513c;
        long j = p1Var.f6514d;
        String str2 = p1Var.f6518h;
        Objects.requireNonNull(tVar);
        File file = new File(new File(tVar.mo14823k(str, i, j), "_metadata"), str2);
        try {
            inputStream = p1Var.f6520j;
            if (p1Var.f6517g == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            C3550v vVar = new C3550v(k, file);
            File l = this.f6534a.mo14824l(p1Var.f6610b, p1Var.f6515e, p1Var.f6516f, p1Var.f6518h);
            if (!l.exists()) {
                l.mkdirs();
            }
            C3543s1 s1Var = new C3543s1(this.f6534a, p1Var.f6610b, p1Var.f6515e, p1Var.f6516f, p1Var.f6518h);
            C1960d.m2862w0(vVar, inputStream, new C3507j0(l, s1Var), p1Var.f6519i);
            s1Var.mo14806d(0);
            inputStream.close();
            f6533c.mo14884b(4, "Patching and extraction finished for slice %s of pack %s.", new Object[]{p1Var.f6518h, p1Var.f6610b});
            this.f6535b.mo14881a().mo14764g(p1Var.f6609a, p1Var.f6610b, p1Var.f6518h, 0);
            try {
                p1Var.f6520j.close();
                return;
            } catch (IOException unused) {
                f6533c.mo14884b(5, "Could not close file for slice %s of pack %s.", new Object[]{p1Var.f6518h, p1Var.f6610b});
                return;
            }
        } catch (IOException e) {
            f6533c.mo14884b(6, "IOException during patching %s.", new Object[]{e.getMessage()});
            throw new C3495g0(String.format("Error patching slice %s of pack %s.", new Object[]{p1Var.f6518h, p1Var.f6610b}), e, p1Var.f6609a);
        } catch (Throwable th) {
            C3577b0.f6643a.mo14880a(th, th);
        }
        throw th;
    }
}
