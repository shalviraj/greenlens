package p005b.p096l.p097a.p113c.p131e.p136e;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p131e.p136e.C2071c;
import p005b.p096l.p097a.p113c.p131e.p136e.C2195gn;

/* renamed from: b.l.a.c.e.e.c */
public abstract class C2071c<MessageType extends C2071c<MessageType, BuilderType>, BuilderType extends C2195gn<MessageType, BuilderType>> extends C2069bm<MessageType, BuilderType> {
    private static final Map<Object, C2071c<?, ?>> zzb = new ConcurrentHashMap();
    public C2048b1 zzc = C2048b1.f3616f;
    public int zzd = -1;

    /* renamed from: d */
    public static Object m3078d(Method method, Object obj, Object... objArr) {
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

    /* renamed from: e */
    public static <T extends C2071c<T, ?>> T m3079e(T t, C2317lm lmVar, C2605xm xmVar) {
        try {
            C2365nm H = lmVar.mo12776H();
            T t2 = (C2071c) t.mo12376h(4, (Object) null, (Object) null);
            C2319m0<?> a = C2247j0.f3951c.mo12723a(t2.getClass());
            C2389om omVar = H.f4125b;
            if (omVar == null) {
                omVar = new C2389om(H);
            }
            a.mo12560g(t2, omVar, xmVar);
            a.mo12555b(t2);
            H.mo12848b(0);
            m3081g(t2);
            return t2;
        } catch (C2246j e) {
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof C2246j) {
                throw ((C2246j) e2.getCause());
            }
            throw new C2246j(e2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof C2246j) {
                throw ((C2246j) e3.getCause());
            }
            throw e3;
        } catch (C2246j e4) {
            throw e4;
        } catch (C2246j e5) {
            throw e5;
        }
    }

    /* renamed from: f */
    public static <T extends C2071c<T, ?>> T m3080f(T t, byte[] bArr, C2605xm xmVar) {
        int length = bArr.length;
        T t2 = (C2071c) t.mo12376h(4, (Object) null, (Object) null);
        try {
            C2319m0<?> a = C2247j0.f3951c.mo12723a(t2.getClass());
            a.mo12563j(t2, bArr, 0, length, new C2144em(xmVar));
            a.mo12555b(t2);
            if (t2.zza == 0) {
                m3081g(t2);
                return t2;
            }
            throw new RuntimeException();
        } catch (C2246j e) {
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof C2246j) {
                throw ((C2246j) e2.getCause());
            }
            throw new C2246j(e2);
        } catch (IndexOutOfBoundsException unused) {
            throw C2246j.m3524a();
        }
    }

    /* renamed from: g */
    public static <T extends C2071c<T, ?>> T m3081g(T t) {
        if (t.mo12448j()) {
            return t;
        }
        throw new C2246j(new C2631z0().getMessage());
    }

    /* renamed from: l */
    public static <T extends C2071c> T m3082l(Class<T> cls) {
        Map<Object, C2071c<?, ?>> map = zzb;
        T t = (C2071c) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C2071c) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C2071c) ((C2071c) C2272k1.m3623e(cls)).mo12376h(6, (Object) null, (Object) null);
            if (t != null) {
                map.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: r */
    public static <T extends C2071c> void m3083r(Class<T> cls, T t) {
        zzb.put(cls, t);
    }

    /* renamed from: b */
    public final int mo12439b() {
        return this.zzd;
    }

    /* renamed from: c */
    public final void mo12440c(int i) {
        this.zzd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C2247j0.f3951c.mo12723a(getClass()).mo12559f(this, (C2071c) obj);
        }
        return false;
    }

    /* renamed from: h */
    public abstract Object mo12376h(int i, Object obj, Object obj2);

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int e = C2247j0.f3951c.mo12723a(getClass()).mo12558e(this);
        this.zza = e;
        return e;
    }

    /* renamed from: i */
    public final <MessageType extends C2071c<MessageType, BuilderType>, BuilderType extends C2195gn<MessageType, BuilderType>> BuilderType mo12447i() {
        return (C2195gn) mo12376h(5, (Object) null, (Object) null);
    }

    /* renamed from: j */
    public final boolean mo12448j() {
        byte byteValue = ((Byte) mo12376h(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean i = C2247j0.f3951c.mo12723a(getClass()).mo12562i(this);
        mo12376h(2, true != i ? null : this, (Object) null);
        return i;
    }

    /* renamed from: k */
    public final void mo12449k(C2509tm tmVar) {
        C2319m0<?> a = C2247j0.f3951c.mo12723a(getClass());
        C2533um umVar = tmVar.f4331a;
        if (umVar == null) {
            umVar = new C2533um(tmVar);
        }
        a.mo12561h(this, umVar);
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C2044am mo12450m() {
        C2195gn gnVar = (C2195gn) mo12376h(5, (Object) null, (Object) null);
        gnVar.mo12693d(this);
        return gnVar;
    }

    /* renamed from: o */
    public final int mo12451o() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int c = C2247j0.f3951c.mo12723a(getClass()).mo12556c(this);
        this.zzd = c;
        return c;
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C2044am mo12452p() {
        return (C2195gn) mo12376h(5, (Object) null, (Object) null);
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C2072c0 mo12453q() {
        return (C2071c) mo12376h(6, (Object) null, (Object) null);
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        C1960d.m2751S1(this, sb, 0);
        return sb.toString();
    }
}
