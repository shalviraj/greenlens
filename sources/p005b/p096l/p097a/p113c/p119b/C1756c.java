package p005b.p096l.p097a.p113c.p119b;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: b.l.a.c.b.c */
public class C1756c extends DialogFragment {

    /* renamed from: g */
    public Dialog f3098g = null;

    /* renamed from: h */
    public DialogInterface.OnCancelListener f3099h = null;

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f3099h;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f3098g == null) {
            setShowsDialog(false);
        }
        return this.f3098g;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
