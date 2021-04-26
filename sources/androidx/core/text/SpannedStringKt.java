package androidx.core.text;

import android.text.Spanned;
import android.text.SpannedString;
import kotlin.Metadata;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\"\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a<\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\t\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0004*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, mo24462d2 = {"", "Landroid/text/Spanned;", "toSpanned", "(Ljava/lang/CharSequence;)Landroid/text/Spanned;", "", "T", "", "start", "end", "", "getSpans", "(Landroid/text/Spanned;II)[Ljava/lang/Object;", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class SpannedStringKt {
    public static final /* synthetic */ <T> T[] getSpans(Spanned spanned, int i, int i2) {
        C6888i.m12439f(spanned, "$this$getSpans");
        C6888i.m12442i();
        throw null;
    }

    public static /* synthetic */ Object[] getSpans$default(Spanned spanned, int i, int i2, int i3, Object obj) {
        int i4 = i3 & 1;
        if ((i3 & 2) != 0) {
            spanned.length();
        }
        C6888i.m12439f(spanned, "$this$getSpans");
        C6888i.m12442i();
        throw null;
    }

    public static final Spanned toSpanned(CharSequence charSequence) {
        C6888i.m12439f(charSequence, "$this$toSpanned");
        SpannedString valueOf = SpannedString.valueOf(charSequence);
        C6888i.m12435b(valueOf, "SpannedString.valueOf(this)");
        return valueOf;
    }
}
