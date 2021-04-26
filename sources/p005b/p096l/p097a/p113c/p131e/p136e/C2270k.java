package p005b.p096l.p097a.p113c.p131e.p136e;

import com.google.android.material.shadow.ShadowDrawableWrapper;

/* renamed from: b.l.a.c.e.e.k */
public enum C2270k {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(ShadowDrawableWrapper.COS_45)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C2317lm.class, C2317lm.class, C2317lm.f4051h),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: g */
    public final Class<?> f3986g;

    /* renamed from: h */
    public final Object f3987h;

    /* access modifiers changed from: public */
    C2270k(Class<?> cls, Class<?> cls2, Object obj) {
        this.f3986g = cls2;
        this.f3987h = obj;
    }
}
