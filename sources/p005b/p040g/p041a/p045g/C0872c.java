package p005b.p040g.p041a.p045g;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Date;
import java.util.Objects;
import p005b.p096l.p224e.C4472q;
import p005b.p096l.p224e.C4477v;

/* renamed from: b.g.a.g.c */
public class C0872c extends C0870a {

    /* renamed from: a */
    public final C4472q f738a;

    public C0872c(@NonNull C4472q qVar) {
        this.f738a = qVar;
    }

    @Nullable
    /* renamed from: a */
    public Date mo10714a() {
        C4472q qVar = this.f738a;
        Objects.requireNonNull(qVar);
        if (!(qVar instanceof C4477v)) {
            return null;
        }
        return new Date(Long.parseLong(this.f738a.mo16134q()) * 1000);
    }

    @Nullable
    /* renamed from: b */
    public String mo10715b() {
        C4472q qVar = this.f738a;
        Objects.requireNonNull(qVar);
        if (!(qVar instanceof C4477v)) {
            return null;
        }
        return this.f738a.mo16134q();
    }
}
