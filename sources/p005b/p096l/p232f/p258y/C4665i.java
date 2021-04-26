package p005b.p096l.p232f.p258y;

/* renamed from: b.l.f.y.i */
public final class C4665i {

    /* renamed from: a */
    public final float f8841a;

    /* renamed from: b */
    public final float f8842b;

    /* renamed from: c */
    public final float f8843c;

    /* renamed from: d */
    public final float f8844d;

    /* renamed from: e */
    public final float f8845e;

    /* renamed from: f */
    public final float f8846f;

    /* renamed from: g */
    public final float f8847g;

    /* renamed from: h */
    public final float f8848h;

    /* renamed from: i */
    public final float f8849i;

    public C4665i(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f8841a = f;
        this.f8842b = f4;
        this.f8843c = f7;
        this.f8844d = f2;
        this.f8845e = f5;
        this.f8846f = f8;
        this.f8847g = f3;
        this.f8848h = f6;
        this.f8849i = f9;
    }

    /* renamed from: a */
    public static C4665i m8589a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        C4665i b = m8590b(f, f2, f3, f4, f5, f6, f7, f8);
        float f17 = b.f8845e;
        float f18 = b.f8849i;
        float f19 = b.f8846f;
        float f20 = b.f8848h;
        float f21 = (f17 * f18) - (f19 * f20);
        float f22 = b.f8847g;
        float f23 = b.f8844d;
        float f24 = (f19 * f22) - (f23 * f18);
        float f25 = (f23 * f20) - (f17 * f22);
        float f26 = b.f8843c;
        float f27 = b.f8842b;
        float f28 = (f26 * f20) - (f27 * f18);
        float f29 = b.f8841a;
        float f30 = (f18 * f29) - (f26 * f22);
        float f31 = (f22 * f27) - (f20 * f29);
        float f32 = (f27 * f19) - (f26 * f17);
        float f33 = (f26 * f23) - (f19 * f29);
        float f34 = (f29 * f17) - (f27 * f23);
        C4665i b2 = m8590b(f9, f10, f11, f12, f13, f14, f15, f16);
        float f35 = b2.f8841a;
        float f36 = b2.f8844d;
        float f37 = b2.f8847g;
        float f38 = (f36 * f28) + (f35 * f21) + (f37 * f32);
        float f39 = (f37 * f33) + (f36 * f30) + (f35 * f24);
        float f40 = f37 * f34;
        float f41 = f40 + (f36 * f31) + (f35 * f25);
        float f42 = b2.f8842b;
        float f43 = f41;
        float f44 = b2.f8845e;
        float f45 = b2.f8848h;
        float f46 = (f45 * f32) + (f44 * f28) + (f42 * f21);
        float f47 = (f44 * f30) + (f42 * f24);
        float f48 = (f44 * f31) + (f42 * f25) + (f45 * f34);
        float f49 = b2.f8843c;
        float f50 = b2.f8846f;
        float f51 = f28 * f50;
        float f52 = b2.f8849i;
        return new C4665i(f38, f39, f43, f46, (f45 * f33) + f47, f48, (f32 * f52) + f51 + (f21 * f49), (f30 * f50) + (f24 * f49) + (f33 * f52), (f52 * f34) + (f50 * f31) + (f49 * f25));
    }

    /* renamed from: b */
    public static C4665i m8590b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new C4665i(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new C4665i((f16 * f3) + (f3 - f), (f17 * f7) + (f7 - f), f, (f16 * f4) + (f4 - f2), (f17 * f8) + (f8 - f2), f2, f16, f17, 1.0f);
    }
}
