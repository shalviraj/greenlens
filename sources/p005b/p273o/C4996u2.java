package p005b.p273o;

import android.view.animation.Interpolator;

/* renamed from: b.o.u2 */
public class C4996u2 implements Interpolator {

    /* renamed from: a */
    public double f9664a = 1.0d;

    /* renamed from: b */
    public double f9665b = 10.0d;

    public C4996u2(double d, double d2) {
        this.f9664a = d;
        this.f9665b = d2;
    }

    public float getInterpolation(float f) {
        return (float) ((Math.cos(this.f9665b * ((double) f)) * Math.pow(2.718281828459045d, ((double) (-f)) / this.f9664a) * -1.0d) + 1.0d);
    }
}
