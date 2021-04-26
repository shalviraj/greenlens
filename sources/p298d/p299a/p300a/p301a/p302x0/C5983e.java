package p298d.p299a.p300a.p301a.p302x0;

import java.util.Arrays;
import java.util.Map;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.x0.e */
public final class C5983e extends C6890k implements C6862l<Map.Entry<? extends String, ? extends Object>, CharSequence> {

    /* renamed from: g */
    public static final C5983e f11829g = new C5983e();

    public C5983e() {
        super(1);
    }

    public Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        C6888i.m12438e(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        String arrays = value instanceof boolean[] ? Arrays.toString((boolean[]) value) : value instanceof char[] ? Arrays.toString((char[]) value) : value instanceof byte[] ? Arrays.toString((byte[]) value) : value instanceof short[] ? Arrays.toString((short[]) value) : value instanceof int[] ? Arrays.toString((int[]) value) : value instanceof float[] ? Arrays.toString((float[]) value) : value instanceof long[] ? Arrays.toString((long[]) value) : value instanceof double[] ? Arrays.toString((double[]) value) : value instanceof Object[] ? Arrays.toString((Object[]) value) : value.toString();
        return str + '=' + arrays;
    }
}
