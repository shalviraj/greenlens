package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import p298d.p414b0.C7668h;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo24462d2 = {"androidx/core/view/ViewGroupKt$children$1", "Ld/b0/h;", "Landroid/view/View;", "", "iterator", "()Ljava/util/Iterator;", "core-ktx_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class ViewGroupKt$children$1 implements C7668h<View> {
    public final /* synthetic */ ViewGroup $this_children;

    public ViewGroupKt$children$1(ViewGroup viewGroup) {
        this.$this_children = viewGroup;
    }

    public Iterator<View> iterator() {
        return ViewGroupKt.iterator(this.$this_children);
    }
}
