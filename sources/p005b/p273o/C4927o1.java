package p005b.p273o;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: b.o.o1 */
public class C4927o1<ObserverType, StateType> {

    /* renamed from: a */
    public String f9512a;

    /* renamed from: b */
    public List<Object> f9513b = new ArrayList();

    /* renamed from: c */
    public boolean f9514c;

    /* renamed from: b.o.o1$a */
    public class C4928a implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ Method f9515g;

        /* renamed from: h */
        public final /* synthetic */ Object f9516h;

        /* renamed from: i */
        public final /* synthetic */ Object f9517i;

        public C4928a(C4927o1 o1Var, Method method, Object obj, Object obj2) {
            this.f9515g = method;
            this.f9516h = obj;
            this.f9517i = obj2;
        }

        public void run() {
            try {
                this.f9515g.invoke(this.f9516h, new Object[]{this.f9517i});
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    public C4927o1(String str, boolean z) {
        this.f9512a = str;
        this.f9514c = z;
    }

    /* renamed from: a */
    public boolean mo16673a(StateType statetype) {
        Iterator<Object> it = this.f9513b.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof WeakReference) {
                next = ((WeakReference) next).get();
            }
            if (next != null) {
                try {
                    Method declaredMethod = next.getClass().getDeclaredMethod(this.f9512a, new Class[]{statetype.getClass()});
                    declaredMethod.setAccessible(true);
                    if (this.f9514c) {
                        C4835f2.m8871u(new C4928a(this, declaredMethod, next, statetype));
                    } else {
                        try {
                            declaredMethod.invoke(next, new Object[]{statetype});
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    }
                    z = true;
                } catch (NoSuchMethodException e3) {
                    e3.printStackTrace();
                }
            }
        }
        return z;
    }
}
