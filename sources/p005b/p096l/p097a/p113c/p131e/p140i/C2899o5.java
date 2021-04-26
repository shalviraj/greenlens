package p005b.p096l.p097a.p113c.p131e.p140i;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p131e.p140i.C2860l5;
import p005b.p096l.p097a.p113c.p131e.p140i.C2899o5;

/* renamed from: b.l.a.c.e.i.o5 */
public abstract class C2899o5<MessageType extends C2899o5<MessageType, BuilderType>, BuilderType extends C2860l5<MessageType, BuilderType>> extends C2807h4<MessageType, BuilderType> {
    private static final Map<Object, C2899o5<?, ?>> zza = new ConcurrentHashMap();
    public C2888n7 zzc = C2888n7.f4905f;
    public int zzd = -1;

    /* renamed from: j */
    public static Object m5025j(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: k */
    public static C2964t5 m5026k(C2964t5 t5Var) {
        C2783f6 f6Var = (C2783f6) t5Var;
        int i = f6Var.f4724i;
        return f6Var.mo13230h(i == 0 ? 10 : i + i);
    }

    /* renamed from: l */
    public static <E> C2977u5<E> m5027l(C2977u5<E> u5Var) {
        int size = u5Var.size();
        return u5Var.mo13230h(size == 0 ? 10 : size + size);
    }

    /* renamed from: p */
    public static <T extends C2899o5> T m5028p(Class<T> cls) {
        Map<Object, C2899o5<?, ?>> map = zza;
        T t = (C2899o5) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C2899o5) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C2899o5) ((C2899o5) C3005w7.m5529e(cls)).mo13245r(6, (Object) null, (Object) null);
            if (t != null) {
                map.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: q */
    public static <T extends C2899o5> void m5029q(Class<T> cls, T t) {
        zza.put(cls, t);
    }

    /* renamed from: b */
    public final int mo13540b() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int c = C3004w6.f5106c.mo13896a(getClass()).mo13629c(this);
        this.zzd = c;
        return c;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C2794g4 mo13541c() {
        return (C2860l5) mo13245r(5, (Object) null, (Object) null);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C2913p6 mo13483d() {
        return (C2899o5) mo13245r(6, (Object) null, (Object) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C3004w6.f5106c.mo13896a(getClass()).mo13632f(this, (C2899o5) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C2794g4 mo13543f() {
        C2860l5 l5Var = (C2860l5) mo13245r(5, (Object) null, (Object) null);
        l5Var.mo13485h(this);
        return l5Var;
    }

    /* renamed from: g */
    public final int mo13372g() {
        return this.zzd;
    }

    /* renamed from: h */
    public final void mo13373h(int i) {
        this.zzd = i;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int e = C3004w6.f5106c.mo13896a(getClass()).mo13631e(this);
        this.zzb = e;
        return e;
    }

    /* renamed from: m */
    public final <MessageType extends C2899o5<MessageType, BuilderType>, BuilderType extends C2860l5<MessageType, BuilderType>> BuilderType mo13545m() {
        return (C2860l5) mo13245r(5, (Object) null, (Object) null);
    }

    /* renamed from: n */
    public final BuilderType mo13546n() {
        BuilderType buildertype = (C2860l5) mo13245r(5, (Object) null, (Object) null);
        buildertype.mo13485h(this);
        return buildertype;
    }

    /* renamed from: o */
    public final void mo13547o(C3002w4 w4Var) {
        C3043z6<?> a = C3004w6.f5106c.mo13896a(getClass());
        C3015x4 x4Var = w4Var.f5105a;
        if (x4Var == null) {
            x4Var = new C3015x4(w4Var);
        }
        a.mo13635i(this, x4Var);
    }

    /* renamed from: r */
    public abstract Object mo13245r(int i, Object obj, Object obj2);

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        C1960d.m2754T1(this, sb, 0);
        return sb.toString();
    }
}
