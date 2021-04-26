package androidx.core.view;

import android.view.View;
import kotlin.Metadata;
import p298d.p344x.p345b.C6862l;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo24462d2 = {"Ld/r;", "run", "()V", "<anonymous>"}, mo24463k = 3, mo24464mv = {1, 4, 0})
public final class ViewKt$doOnPreDraw$1 implements Runnable {
    public final /* synthetic */ C6862l $action;
    public final /* synthetic */ View $this_doOnPreDraw;

    public ViewKt$doOnPreDraw$1(View view, C6862l lVar) {
        this.$this_doOnPreDraw = view;
        this.$action = lVar;
    }

    public final void run() {
        this.$action.invoke(this.$this_doOnPreDraw);
    }
}
