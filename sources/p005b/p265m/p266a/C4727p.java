package p005b.p265m.p266a;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import p005b.p265m.p266a.C4701d;

/* renamed from: b.m.a.p */
public class C4727p extends OrientationEventListener {

    /* renamed from: a */
    public final /* synthetic */ C4728q f9024a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4727p(C4728q qVar, Context context, int i) {
        super(context, i);
        this.f9024a = qVar;
    }

    public void onOrientationChanged(int i) {
        C4728q qVar = this.f9024a;
        WindowManager windowManager = qVar.f9026b;
        C4726o oVar = qVar.f9028d;
        if (windowManager != null && oVar != null) {
            int rotation = windowManager.getDefaultDisplay().getRotation();
            C4728q qVar2 = this.f9024a;
            if (rotation != qVar2.f9025a) {
                qVar2.f9025a = rotation;
                C4701d.C4704c cVar = (C4701d.C4704c) oVar;
                C4701d.this.f8956i.postDelayed(new C4707e(cVar), 250);
            }
        }
    }
}
