package p005b.p096l.p097a.p113c.p131e.p140i;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: b.l.a.c.e.i.v7 */
public abstract class C2992v7 {

    /* renamed from: a */
    public final Unsafe f5090a;

    public C2992v7(Unsafe unsafe) {
        this.f5090a = unsafe;
    }

    /* renamed from: a */
    public abstract void mo13748a(Object obj, long j, byte b);

    /* renamed from: b */
    public abstract boolean mo13749b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo13750c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract float mo13751d(Object obj, long j);

    /* renamed from: e */
    public abstract void mo13752e(Object obj, long j, float f);

    /* renamed from: f */
    public abstract double mo13753f(Object obj, long j);

    /* renamed from: g */
    public abstract void mo13754g(Object obj, long j, double d);

    /* renamed from: h */
    public final long mo13796h(Field field) {
        return this.f5090a.objectFieldOffset(field);
    }

    /* renamed from: i */
    public final int mo13797i(Class<?> cls) {
        return this.f5090a.arrayBaseOffset(cls);
    }

    /* renamed from: j */
    public final int mo13798j(Class<?> cls) {
        return this.f5090a.arrayIndexScale(cls);
    }

    /* renamed from: k */
    public final int mo13799k(Object obj, long j) {
        return this.f5090a.getInt(obj, j);
    }

    /* renamed from: l */
    public final void mo13800l(Object obj, long j, int i) {
        this.f5090a.putInt(obj, j, i);
    }

    /* renamed from: m */
    public final long mo13801m(Object obj, long j) {
        return this.f5090a.getLong(obj, j);
    }

    /* renamed from: n */
    public final void mo13802n(Object obj, long j, long j2) {
        this.f5090a.putLong(obj, j, j2);
    }

    /* renamed from: o */
    public final Object mo13803o(Object obj, long j) {
        return this.f5090a.getObject(obj, j);
    }

    /* renamed from: p */
    public final void mo13804p(Object obj, long j, Object obj2) {
        this.f5090a.putObject(obj, j, obj2);
    }
}
