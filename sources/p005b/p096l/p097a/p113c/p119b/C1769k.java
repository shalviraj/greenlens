package p005b.p096l.p097a.p113c.p119b;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

/* renamed from: b.l.a.c.b.k */
public class C1769k extends DialogFragment {

    /* renamed from: g */
    public Dialog f3122g = null;

    /* renamed from: h */
    public DialogInterface.OnCancelListener f3123h = null;

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f3123h;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f3122g == null) {
            setShowsDialog(false);
        }
        return this.f3122g;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
