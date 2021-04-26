package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Pair;
import kotlin.Metadata;
import p298d.C6768j;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a4\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a4\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0005\u001aH\u0010\b\u001a\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00018\u00008\u0000\u0012\f\u0012\n \u0003*\u0004\u0018\u00018\u00018\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\b¢\u0006\u0004\b\b\u0010\t\u001a8\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, mo24462d2 = {"F", "S", "Landroid/util/Pair;", "kotlin.jvm.PlatformType", "component1", "(Landroid/util/Pair;)Ljava/lang/Object;", "component2", "Ld/j;", "toKotlinPair", "(Landroid/util/Pair;)Ld/j;", "toAndroidPair", "(Ld/j;)Landroid/util/Pair;", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class PairKt {
    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F component1(Pair<F, S> pair) {
        C6888i.m12439f(pair, "$this$component1");
        return pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S component2(Pair<F, S> pair) {
        C6888i.m12439f(pair, "$this$component2");
        return pair.second;
    }

    public static final <F, S> Pair<F, S> toAndroidPair(C6768j<? extends F, ? extends S> jVar) {
        C6888i.m12439f(jVar, "$this$toAndroidPair");
        return new Pair<>(jVar.f13681g, jVar.f13682h);
    }

    public static final <F, S> C6768j<F, S> toKotlinPair(Pair<F, S> pair) {
        C6888i.m12439f(pair, "$this$toKotlinPair");
        return new C6768j<>(pair.first, pair.second);
    }
}
