package p005b.p006a.p007a.p018i;

import android.view.View;
import android.widget.EditText;

/* renamed from: b.a.a.i.r */
public final class C0760r implements View.OnFocusChangeListener {

    /* renamed from: g */
    public final /* synthetic */ EditText f489g;

    public C0760r(EditText editText) {
        this.f489g = editText;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.f489g.callOnClick();
        }
    }
}
