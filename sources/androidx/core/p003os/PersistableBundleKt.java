package androidx.core.p003os;

import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import p298d.C6768j;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo24462d2 = {"", "Ld/j;", "", "", "pairs", "Landroid/os/PersistableBundle;", "persistableBundleOf", "([Lkotlin/Pair;)Landroid/os/PersistableBundle;", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
/* renamed from: androidx.core.os.PersistableBundleKt */
public final class PersistableBundleKt {
    @RequiresApi(21)
    public static final PersistableBundle persistableBundleOf(C6768j<String, ? extends Object>... jVarArr) {
        C6888i.m12439f(jVarArr, "pairs");
        PersistableBundle persistableBundle = new PersistableBundle(jVarArr.length);
        for (C6768j<String, ? extends Object> jVar : jVarArr) {
            String str = (String) jVar.f13681g;
            B b = jVar.f13682h;
            if (b == null) {
                persistableBundle.putString(str, (String) null);
            } else if (b instanceof Boolean) {
                persistableBundle.putBoolean(str, ((Boolean) b).booleanValue());
            } else if (b instanceof Double) {
                persistableBundle.putDouble(str, ((Number) b).doubleValue());
            } else if (b instanceof Integer) {
                persistableBundle.putInt(str, ((Number) b).intValue());
            } else if (b instanceof Long) {
                persistableBundle.putLong(str, ((Number) b).longValue());
            } else if (b instanceof String) {
                persistableBundle.putString(str, (String) b);
            } else if (b instanceof boolean[]) {
                persistableBundle.putBooleanArray(str, (boolean[]) b);
            } else if (b instanceof double[]) {
                persistableBundle.putDoubleArray(str, (double[]) b);
            } else if (b instanceof int[]) {
                persistableBundle.putIntArray(str, (int[]) b);
            } else if (b instanceof long[]) {
                persistableBundle.putLongArray(str, (long[]) b);
            } else if (b instanceof Object[]) {
                Class<?> componentType = b.getClass().getComponentType();
                if (componentType != null) {
                    C6888i.m12435b(componentType, "value::class.java.componentType!!");
                    if (String.class.isAssignableFrom(componentType)) {
                        persistableBundle.putStringArray(str, (String[]) b);
                    } else {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                } else {
                    C6888i.m12445l();
                    throw null;
                }
            } else {
                throw new IllegalArgumentException("Illegal value type " + b.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return persistableBundle;
    }
}
