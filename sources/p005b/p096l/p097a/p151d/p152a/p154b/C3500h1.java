package p005b.p096l.p097a.p151d.p152a.p154b;

import java.io.File;
import java.io.IOException;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p151d.p152a.p159e.C3584f;

/* renamed from: b.l.a.d.a.b.h1 */
public final class C3500h1 {

    /* renamed from: b */
    public static final C3584f f6425b = new C3584f("MergeSliceTaskHandler");

    /* renamed from: a */
    public final C3544t f6426a;

    public C3500h1(C3544t tVar) {
        this.f6426a = tVar;
    }

    /* renamed from: b */
    public static void m6680b(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                m6680b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                String valueOf = String.valueOf(file);
                throw new C3495g0(C0843a.m455p(new StringBuilder(valueOf.length() + 28), "Unable to delete directory: ", valueOf));
            }
        } else if (file2.exists()) {
            String valueOf2 = String.valueOf(file2);
            throw new C3495g0(C0843a.m455p(new StringBuilder(valueOf2.length() + 51), "File clashing with existing file from other slice: ", valueOf2));
        } else if (!file.renameTo(file2)) {
            String valueOf3 = String.valueOf(file);
            throw new C3495g0(C0843a.m455p(new StringBuilder(valueOf3.length() + 21), "Unable to move file: ", valueOf3));
        }
    }

    /* renamed from: a */
    public final void mo14784a(C3496g1 g1Var) {
        File m = this.f6426a.mo14825m(g1Var.f6610b, g1Var.f6408c, g1Var.f6409d, g1Var.f6410e);
        if (m.exists()) {
            File n = this.f6426a.mo14826n(g1Var.f6610b, g1Var.f6408c, g1Var.f6409d);
            if (!n.exists()) {
                n.mkdirs();
            }
            m6680b(m, n);
            try {
                this.f6426a.mo14828p(g1Var.f6610b, g1Var.f6408c, g1Var.f6409d, this.f6426a.mo14827o(g1Var.f6610b, g1Var.f6408c, g1Var.f6409d) + 1);
            } catch (IOException e) {
                f6425b.mo14884b(6, "Writing merge checkpoint failed with %s.", new Object[]{e.getMessage()});
                throw new C3495g0("Writing merge checkpoint failed.", e, g1Var.f6609a);
            }
        } else {
            throw new C3495g0(String.format("Cannot find verified files for slice %s.", new Object[]{g1Var.f6410e}), g1Var.f6609a);
        }
    }
}
