package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.Spannable;
import android.text.SpannableString;
import kotlin.Metadata;
import p298d.p333a0.C6758d;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000,\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u0001H\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a,\u0010\f\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\n¢\u0006\u0004\b\f\u0010\r\u001a$\u0010\f\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\n¢\u0006\u0004\b\f\u0010\u0010¨\u0006\u0011"}, mo24462d2 = {"", "Landroid/text/Spannable;", "toSpannable", "(Ljava/lang/CharSequence;)Landroid/text/Spannable;", "Ld/r;", "clearSpans", "(Landroid/text/Spannable;)V", "", "start", "end", "", "span", "set", "(Landroid/text/Spannable;IILjava/lang/Object;)V", "Ld/a0/d;", "range", "(Landroid/text/Spannable;Ld/a0/d;Ljava/lang/Object;)V", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class SpannableStringKt {
    @SuppressLint({"SyntheticAccessor"})
    public static final void clearSpans(Spannable spannable) {
        C6888i.m12439f(spannable, "$this$clearSpans");
        Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
        C6888i.m12435b(spans, "getSpans(start, end, T::class.java)");
        for (Object removeSpan : spans) {
            spannable.removeSpan(removeSpan);
        }
    }

    public static final void set(Spannable spannable, int i, int i2, Object obj) {
        C6888i.m12439f(spannable, "$this$set");
        C6888i.m12439f(obj, "span");
        spannable.setSpan(obj, i, i2, 17);
    }

    public static final void set(Spannable spannable, C6758d dVar, Object obj) {
        C6888i.m12439f(spannable, "$this$set");
        C6888i.m12439f(dVar, "range");
        C6888i.m12439f(obj, "span");
        spannable.setSpan(obj, dVar.getStart().intValue(), dVar.getEndInclusive().intValue(), 17);
    }

    public static final Spannable toSpannable(CharSequence charSequence) {
        C6888i.m12439f(charSequence, "$this$toSpannable");
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        C6888i.m12435b(valueOf, "SpannableString.valueOf(this)");
        return valueOf;
    }
}
