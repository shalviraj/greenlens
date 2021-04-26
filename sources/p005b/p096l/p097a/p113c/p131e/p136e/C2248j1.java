package p005b.p096l.p097a.p113c.p131e.p136e;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: b.l.a.c.e.e.j1 */
public abstract class C2248j1 {

    /* renamed from: a */
    public final Unsafe f3954a;

    public C2248j1(Unsafe unsafe) {
        this.f3954a = unsafe;
    }

    /* renamed from: a */
    public abstract void mo12694a(Object obj, long j, byte b);

    /* renamed from: b */
    public abstract boolean mo12695b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo12696c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract float mo12697d(Object obj, long j);

    /* renamed from: e */
    public abstract void mo12698e(Object obj, long j, float f);

    /* renamed from: f */
    public abstract double mo12699f(Object obj, long j);

    /* renamed from: g */
    public abstract void mo12700g(Object obj, long j, double d);

    /* renamed from: h */
    public final long mo12724h(Field field) {
        return this.f3954a.objectFieldOffset(field);
    }

    /* renamed from: i */
    public final int mo12725i(Class<?> cls) {
        return this.f3954a.arrayBaseOffset(cls);
    }

    /* renamed from: j */
    public final int mo12726j(Class<?> cls) {
        return this.f3954a.arrayIndexScale(cls);
    }

    /* renamed from: k */
    public final int mo12727k(Object obj, long j) {
        return this.f3954a.getInt(obj, j);
    }

    /* renamed from: l */
    public final void mo12728l(Object obj, long j, int i) {
        this.f3954a.putInt(obj, j, i);
    }

    /* renamed from: m */
    public final long mo12729m(Object obj, long j) {
        return this.f3954a.getLong(obj, j);
    }

    /* renamed from: n */
    public final void mo12730n(Object obj, long j, long j2) {
        this.f3954a.putLong(obj, j, j2);
    }

    /* renamed from: o */
    public final Object mo12731o(Object obj, long j) {
        return this.f3954a.getObject(obj, j);
    }

    /* renamed from: p */
    public final void mo12732p(Object obj, long j, Object obj2) {
        this.f3954a.putObject(obj, j, obj2);
    }
}
