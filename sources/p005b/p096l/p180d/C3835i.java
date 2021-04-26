package p005b.p096l.p180d;

import androidx.annotation.NonNull;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.d.i */
public class C3835i extends Exception {
    @Deprecated
    public C3835i() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3835i(@NonNull String str) {
        super(str);
        C0823f.m374i(str, "Detail message must not be empty");
    }
}
