package androidx.core.p003os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.Metadata;
import p298d.C6768j;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo24462d2 = {"", "Ld/j;", "", "", "pairs", "Landroid/os/Bundle;", "bundleOf", "([Lkotlin/Pair;)Landroid/os/Bundle;", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
/* renamed from: androidx.core.os.BundleKt */
public final class BundleKt {
    public static final Bundle bundleOf(C6768j<String, ? extends Object>... jVarArr) {
        C6888i.m12439f(jVarArr, "pairs");
        Bundle bundle = new Bundle(jVarArr.length);
        for (C6768j<String, ? extends Object> jVar : jVarArr) {
            String str = (String) jVar.f13681g;
            B b = jVar.f13682h;
            if (b == null) {
                bundle.putString(str, (String) null);
            } else if (b instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b).booleanValue());
            } else if (b instanceof Byte) {
                bundle.putByte(str, ((Number) b).byteValue());
            } else if (b instanceof Character) {
                bundle.putChar(str, ((Character) b).charValue());
            } else if (b instanceof Double) {
                bundle.putDouble(str, ((Number) b).doubleValue());
            } else if (b instanceof Float) {
                bundle.putFloat(str, ((Number) b).floatValue());
            } else if (b instanceof Integer) {
                bundle.putInt(str, ((Number) b).intValue());
            } else if (b instanceof Long) {
                bundle.putLong(str, ((Number) b).longValue());
            } else if (b instanceof Short) {
                bundle.putShort(str, ((Number) b).shortValue());
            } else if (b instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b);
            } else if (b instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b);
            } else if (b instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b);
            } else if (b instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b);
            } else if (b instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b);
            } else if (b instanceof char[]) {
                bundle.putCharArray(str, (char[]) b);
            } else if (b instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b);
            } else if (b instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b);
            } else if (b instanceof int[]) {
                bundle.putIntArray(str, (int[]) b);
            } else if (b instanceof long[]) {
                bundle.putLongArray(str, (long[]) b);
            } else if (b instanceof short[]) {
                bundle.putShortArray(str, (short[]) b);
            } else {
                if (b instanceof Object[]) {
                    Class<?> componentType = b.getClass().getComponentType();
                    if (componentType != null) {
                        C6888i.m12435b(componentType, "value::class.java.componentType!!");
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str, (Parcelable[]) b);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str, (String[]) b);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str, (CharSequence[]) b);
                        } else if (!Serializable.class.isAssignableFrom(componentType)) {
                            throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                        }
                    } else {
                        C6888i.m12445l();
                        throw null;
                    }
                } else if (!(b instanceof Serializable)) {
                    if (b instanceof IBinder) {
                        bundle.putBinder(str, (IBinder) b);
                    } else if (b instanceof Size) {
                        bundle.putSize(str, (Size) b);
                    } else if (b instanceof SizeF) {
                        bundle.putSizeF(str, (SizeF) b);
                    } else {
                        throw new IllegalArgumentException("Illegal value type " + b.getClass().getCanonicalName() + " for key \"" + str + '\"');
                    }
                }
                bundle.putSerializable(str, (Serializable) b);
            }
        }
        return bundle;
    }
}
