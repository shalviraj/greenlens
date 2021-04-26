package p298d.p333a0;

import java.util.NoSuchElementException;
import p298d.p334t.C6804v;

/* renamed from: d.a0.c */
public final class C6757c extends C6804v {

    /* renamed from: g */
    public final int f13661g;

    /* renamed from: h */
    public boolean f13662h;

    /* renamed from: i */
    public int f13663i;

    /* renamed from: j */
    public final int f13664j;

    public C6757c(int i, int i2, int i3) {
        this.f13664j = i3;
        this.f13661g = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f13662h = z;
        this.f13663i = !z ? i2 : i;
    }

    public boolean hasNext() {
        return this.f13662h;
    }

    public int nextInt() {
        int i = this.f13663i;
        if (i != this.f13661g) {
            this.f13663i = this.f13664j + i;
        } else if (this.f13662h) {
            this.f13662h = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }
}
