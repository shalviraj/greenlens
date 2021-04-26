package p005b.p096l.p097a.p151d.p152a.p154b;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import p005b.p096l.p097a.p151d.p152a.p159e.C3584f;

/* renamed from: b.l.a.d.a.b.w1 */
public final class C3555w1 {

    /* renamed from: b */
    public static final C3584f f6599b = new C3584f("VerifySliceTaskHandler");

    /* renamed from: a */
    public final C3544t f6600a;

    public C3555w1(C3544t tVar) {
        this.f6600a = tVar;
    }

    /* renamed from: a */
    public final void mo14848a(C3552v1 v1Var) {
        File l = this.f6600a.mo14824l(v1Var.f6610b, v1Var.f6588c, v1Var.f6589d, v1Var.f6590e);
        if (l.exists()) {
            try {
                File r = this.f6600a.mo14830r(v1Var.f6610b, v1Var.f6588c, v1Var.f6589d, v1Var.f6590e);
                if (r.exists()) {
                    try {
                        if (C3484d1.m6655a(C3549u1.m6761a(l, r)).equals(v1Var.f6591f)) {
                            f6599b.mo14884b(4, "Verification of slice %s of pack %s successful.", new Object[]{v1Var.f6590e, v1Var.f6610b});
                            File m = this.f6600a.mo14825m(v1Var.f6610b, v1Var.f6588c, v1Var.f6589d, v1Var.f6590e);
                            if (!m.exists()) {
                                m.mkdirs();
                            }
                            if (!l.renameTo(m)) {
                                throw new C3495g0(String.format("Failed to move slice %s after verification.", new Object[]{v1Var.f6590e}), v1Var.f6609a);
                            }
                            return;
                        }
                        throw new C3495g0(String.format("Verification failed for slice %s.", new Object[]{v1Var.f6590e}), v1Var.f6609a);
                    } catch (NoSuchAlgorithmException e) {
                        throw new C3495g0("SHA256 algorithm not supported.", e, v1Var.f6609a);
                    } catch (IOException e2) {
                        throw new C3495g0(String.format("Could not digest file during verification for slice %s.", new Object[]{v1Var.f6590e}), e2, v1Var.f6609a);
                    }
                } else {
                    throw new C3495g0(String.format("Cannot find metadata files for slice %s.", new Object[]{v1Var.f6590e}), v1Var.f6609a);
                }
            } catch (IOException e3) {
                throw new C3495g0(String.format("Could not reconstruct slice archive during verification for slice %s.", new Object[]{v1Var.f6590e}), e3, v1Var.f6609a);
            }
        } else {
            throw new C3495g0(String.format("Cannot find unverified files for slice %s.", new Object[]{v1Var.f6590e}), v1Var.f6609a);
        }
    }
}
