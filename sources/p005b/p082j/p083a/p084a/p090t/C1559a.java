package p005b.p082j.p083a.p084a.p090t;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: b.j.a.a.t.a */
public class C1559a {

    /* renamed from: c */
    public static final int[] f2603c = {8000, 8000, RecyclerView.MAX_SCROLL_DURATION, RecyclerView.MAX_SCROLL_DURATION};

    /* renamed from: d */
    public static final int[] f2604d = {4000, 4000, 200, 200};

    /* renamed from: a */
    public final AtomicReferenceArray<byte[]> f2605a = new AtomicReferenceArray<>(4);

    /* renamed from: b */
    public final AtomicReferenceArray<char[]> f2606b = new AtomicReferenceArray<>(4);

    /* renamed from: a */
    public final byte[] mo11684a(int i) {
        int i2 = f2603c[i];
        if (i2 <= 0) {
            i2 = 0;
        }
        byte[] andSet = this.f2605a.getAndSet(i, (Object) null);
        return (andSet == null || andSet.length < i2) ? new byte[i2] : andSet;
    }

    /* renamed from: b */
    public char[] mo11685b(int i, int i2) {
        int i3 = f2604d[i];
        if (i2 < i3) {
            i2 = i3;
        }
        char[] andSet = this.f2606b.getAndSet(i, (Object) null);
        return (andSet == null || andSet.length < i2) ? new char[i2] : andSet;
    }
}
