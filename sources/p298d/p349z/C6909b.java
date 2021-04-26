package p298d.p349z;

import java.util.Random;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.z.b */
public final class C6909b extends C6908a {

    /* renamed from: c */
    public final C6910a f13806c = new C6910a();

    /* renamed from: d.z.b$a */
    public static final class C6910a extends ThreadLocal<Random> {
        public Object initialValue() {
            return new Random();
        }
    }

    /* renamed from: b */
    public Random mo24214b() {
        Object obj = this.f13806c.get();
        C6888i.m12437d(obj, "implStorage.get()");
        return (Random) obj;
    }
}
