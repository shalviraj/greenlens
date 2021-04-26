package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.Metadata;
import p298d.p344x.p345b.C6862l;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011¸\u0006\u0000"}, mo24462d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Ld/r;", "afterTextChanged", "(Landroid/text/Editable;)V", "L;", "text", "", "start", "count", "kotlin/Int", "beforeTextChanged", "(L;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "before", "onTextChanged", "core-ktx_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$1 implements TextWatcher {
    public final /* synthetic */ C6862l $afterTextChanged;

    public TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$1(C6862l lVar) {
        this.$afterTextChanged = lVar;
    }

    public void afterTextChanged(Editable editable) {
        this.$afterTextChanged.invoke(editable);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}