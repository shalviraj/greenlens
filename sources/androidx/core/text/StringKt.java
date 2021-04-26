package androidx.core.text;

import android.text.TextUtils;
import kotlin.Metadata;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0014\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\b¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, mo24462d2 = {"", "htmlEncode", "(Ljava/lang/String;)Ljava/lang/String;", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class StringKt {
    public static final String htmlEncode(String str) {
        C6888i.m12439f(str, "$this$htmlEncode");
        String htmlEncode = TextUtils.htmlEncode(str);
        C6888i.m12435b(htmlEncode, "TextUtils.htmlEncode(this)");
        return htmlEncode;
    }
}
