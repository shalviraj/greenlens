package p005b.p096l.p097a.p113c.p119b.p122m;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.C1763f;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;

/* renamed from: b.l.a.c.b.m.m */
public class C1927m {

    /* renamed from: a */
    public final SparseIntArray f3474a = new SparseIntArray();

    /* renamed from: b */
    public C1763f f3475b;

    public C1927m(@NonNull C1763f fVar) {
        Objects.requireNonNull(fVar, "null reference");
        this.f3475b = fVar;
    }

    /* renamed from: a */
    public int mo12262a(@NonNull Context context, @NonNull C1770a.C1779f fVar) {
        Objects.requireNonNull(context, "null reference");
        Objects.requireNonNull(fVar, "null reference");
        int i = 0;
        if (!fVar.mo12023m()) {
            return 0;
        }
        int n = fVar.mo12024n();
        int i2 = this.f3474a.get(n, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.f3474a.size()) {
                i = i2;
                break;
            }
            int keyAt = this.f3474a.keyAt(i3);
            if (keyAt > n && this.f3474a.get(keyAt) == 0) {
                break;
            }
            i3++;
        }
        if (i == -1) {
            i = this.f3475b.mo12004b(context, n);
        }
        this.f3474a.put(n, i);
        return i;
    }
}
