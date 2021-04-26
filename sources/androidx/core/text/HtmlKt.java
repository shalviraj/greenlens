package androidx.core.text;

import android.text.Html;
import android.text.Spanned;
import kotlin.Metadata;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a6\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\b¢\u0006\u0004\b\b\u0010\t\u001a\u001e\u0010\u000b\u001a\u00020\u0000*\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0001H\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, mo24462d2 = {"", "", "flags", "Landroid/text/Html$ImageGetter;", "imageGetter", "Landroid/text/Html$TagHandler;", "tagHandler", "Landroid/text/Spanned;", "parseAsHtml", "(Ljava/lang/String;ILandroid/text/Html$ImageGetter;Landroid/text/Html$TagHandler;)Landroid/text/Spanned;", "option", "toHtml", "(Landroid/text/Spanned;I)Ljava/lang/String;", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class HtmlKt {
    public static final Spanned parseAsHtml(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        C6888i.m12439f(str, "$this$parseAsHtml");
        Spanned fromHtml = HtmlCompat.fromHtml(str, i, imageGetter, tagHandler);
        C6888i.m12435b(fromHtml, "HtmlCompat.fromHtml(this… imageGetter, tagHandler)");
        return fromHtml;
    }

    public static /* synthetic */ Spanned parseAsHtml$default(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            imageGetter = null;
        }
        if ((i2 & 4) != 0) {
            tagHandler = null;
        }
        C6888i.m12439f(str, "$this$parseAsHtml");
        Spanned fromHtml = HtmlCompat.fromHtml(str, i, imageGetter, tagHandler);
        C6888i.m12435b(fromHtml, "HtmlCompat.fromHtml(this… imageGetter, tagHandler)");
        return fromHtml;
    }

    public static final String toHtml(Spanned spanned, int i) {
        C6888i.m12439f(spanned, "$this$toHtml");
        String html = HtmlCompat.toHtml(spanned, i);
        C6888i.m12435b(html, "HtmlCompat.toHtml(this, option)");
        return html;
    }

    public static /* synthetic */ String toHtml$default(Spanned spanned, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        C6888i.m12439f(spanned, "$this$toHtml");
        String html = HtmlCompat.toHtml(spanned, i);
        C6888i.m12435b(html, "HtmlCompat.toHtml(this, option)");
        return html;
    }
}
