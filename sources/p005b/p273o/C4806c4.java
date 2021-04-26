package p005b.p273o;

import android.content.Context;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import p005b.p273o.C4857i2;

/* renamed from: b.o.c4 */
public class C4806c4 {

    /* renamed from: a */
    public Context f9198a;

    /* renamed from: b */
    public boolean f9199b = false;

    /* renamed from: c */
    public C4808b f9200c;

    /* renamed from: d */
    public Object f9201d;

    /* renamed from: e */
    public Field f9202e;

    /* renamed from: b.o.c4$b */
    public class C4808b implements PurchasingListener {
        public C4808b(C4806c4 c4Var, C4807a aVar) {
        }
    }

    public C4806c4(Context context) {
        this.f9198a = context;
        try {
            Class<?> cls = Class.forName("com.amazon.device.iap.internal.d");
            this.f9201d = cls.getMethod("d", new Class[0]).invoke((Object) null, new Object[0]);
            Field declaredField = cls.getDeclaredField("f");
            this.f9202e = declaredField;
            declaredField.setAccessible(true);
            C4808b bVar = new C4808b(this, (C4807a) null);
            this.f9200c = bVar;
            PurchasingListener purchasingListener = (PurchasingListener) this.f9202e.get(this.f9201d);
            Objects.requireNonNull(bVar);
            this.f9199b = true;
            mo16548c();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            m8823b(e);
        }
    }

    /* renamed from: b */
    public static void m8823b(Exception exc) {
        C4857i2.m8933a(C4857i2.C4868k.ERROR, "Error adding Amazon IAP listener.", exc);
        exc.printStackTrace();
    }

    /* renamed from: a */
    public void mo16547a() {
        if (this.f9199b) {
            try {
                C4808b bVar = (PurchasingListener) this.f9202e.get(this.f9201d);
                C4808b bVar2 = this.f9200c;
                if (bVar != bVar2) {
                    Objects.requireNonNull(bVar2);
                    mo16548c();
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public final void mo16548c() {
        PurchasingService.registerListener(this.f9198a, this.f9200c);
    }
}
