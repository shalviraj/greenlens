package p005b.p006a.p007a.p018i;

import android.view.View;
import android.widget.EditText;

/* renamed from: b.a.a.i.u */
public final class C0763u implements View.OnFocusChangeListener {

    /* renamed from: g */
    public final /* synthetic */ EditText f496g;

    public C0763u(EditText editText) {
        this.f496g = editText;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.f496g.callOnClick();
        }
    }
}
