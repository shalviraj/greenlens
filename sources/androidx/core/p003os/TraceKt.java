package androidx.core.p003os;

import kotlin.Metadata;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo24462d2 = {"T", "", "sectionName", "Lkotlin/Function0;", "block", "trace", "(Ljava/lang/String;Ld/x/b/a;)Ljava/lang/Object;", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
/* renamed from: androidx.core.os.TraceKt */
public final class TraceKt {
    public static final <T> T trace(String str, C6851a<? extends T> aVar) {
        C6888i.m12439f(str, "sectionName");
        C6888i.m12439f(aVar, "block");
        TraceCompat.beginSection(str);
        try {
            return aVar.invoke();
        } finally {
            TraceCompat.endSection();
        }
    }
}
