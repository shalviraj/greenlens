package p005b.p096l.p097a.p113c.p131e.p140i;

import com.google.android.material.shadow.ShadowDrawableWrapper;

/* renamed from: b.l.a.c.e.i.y5 */
public enum C3029y5 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(ShadowDrawableWrapper.COS_45)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C2937r4.class, C2937r4.class, C2937r4.f4977h),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: g */
    public final Class<?> f5168g;

    /* renamed from: h */
    public final Object f5169h;

    /* access modifiers changed from: public */
    C3029y5(Class<?> cls, Class<?> cls2, Object obj) {
        this.f5168g = cls2;
        this.f5169h = obj;
    }
}
