package p372i.p373a.p374a.p375a;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Message;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatDialogFragment;
import p372i.p373a.p374a.p375a.C6996c;

/* renamed from: i.a.a.a.e */
public abstract class C6999e extends AppCompatDialogFragment {

    /* renamed from: g */
    public C6996c f14050g;

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        C6996c cVar = this.f14050g;
        if (cVar != null) {
            cVar.f14041g = activity;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6996c cVar = new C6996c(getActivity());
        this.f14050g = cVar;
        cVar.f14040f = 10;
        if (((double) 16.0f) > 1.0d) {
            cVar.f14039e = 16.0f;
            cVar.f14045k = true;
            cVar.f14038d = false;
            cVar.f14044j = false;
            return;
        }
        throw new IllegalArgumentException("Down scale must be strictly greater than 1.0. Found : " + 16.0f);
    }

    public void onDestroyView() {
        if (getDialog() != null) {
            getDialog().setDismissMessage((Message) null);
        }
        super.onDestroyView();
    }

    public void onDetach() {
        super.onDetach();
        C6996c cVar = this.f14050g;
        C6996c.C6997a aVar = cVar.f14037c;
        if (aVar != null) {
            aVar.cancel(true);
        }
        cVar.f14037c = null;
        cVar.f14041g = null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C6996c cVar = this.f14050g;
        C6996c.C6997a aVar = cVar.f14037c;
        if (aVar != null) {
            aVar.cancel(true);
        }
        ImageView imageView = cVar.f14035a;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).setDuration((long) cVar.f14043i).setInterpolator(new AccelerateInterpolator()).setListener(new C6995b(cVar)).start();
        }
    }

    public void onResume() {
        super.onResume();
        C6996c cVar = this.f14050g;
        boolean retainInstance = getRetainInstance();
        if (cVar.f14035a != null && !retainInstance) {
            return;
        }
        if (cVar.f14041g.getWindow().getDecorView().isShown()) {
            C6996c.C6997a aVar = new C6996c.C6997a((C6994a) null);
            cVar.f14037c = aVar;
            aVar.execute(new Void[0]);
            return;
        }
        cVar.f14041g.getWindow().getDecorView().getViewTreeObserver().addOnPreDrawListener(new C6994a(cVar));
    }

    public void onStart() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().clearFlags(2);
            if (dialog.getWindow().getAttributes().windowAnimations == 0) {
                dialog.getWindow().getAttributes().windowAnimations = 2131820773;
            }
        }
        super.onStart();
    }
}
