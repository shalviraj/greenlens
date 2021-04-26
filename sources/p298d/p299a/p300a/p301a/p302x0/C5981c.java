package p298d.p299a.p300a.p301a.p302x0;

import java.util.Arrays;
import java.util.Map;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.x0.c */
public final class C5981c extends C6890k implements C6851a<Integer> {

    /* renamed from: g */
    public final /* synthetic */ Map f11823g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5981c(Map map) {
        super(0);
        this.f11823g = map;
    }

    public Object invoke() {
        int i = 0;
        for (Map.Entry entry : this.f11823g.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            i += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
        }
        return Integer.valueOf(i);
    }
}
