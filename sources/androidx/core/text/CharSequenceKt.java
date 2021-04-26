package androidx.core.text;

import android.text.TextUtils;
import kotlin.Metadata;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0014\n\u0002\u0010\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo24462d2 = {"", "", "isDigitsOnly", "(Ljava/lang/CharSequence;)Z", "", "trimmedLength", "(Ljava/lang/CharSequence;)I", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class CharSequenceKt {
    public static final boolean isDigitsOnly(CharSequence charSequence) {
        C6888i.m12439f(charSequence, "$this$isDigitsOnly");
        return TextUtils.isDigitsOnly(charSequence);
    }

    public static final int trimmedLength(CharSequence charSequence) {
        C6888i.m12439f(charSequence, "$this$trimmedLength");
        return TextUtils.getTrimmedLength(charSequence);
    }
}
