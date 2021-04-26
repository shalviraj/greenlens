package com.appfoundry.previewer.activities;

import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.model.Animation;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.Page;
import java.util.List;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import p005b.p006a.p007a.p014e.C0687p;
import p005b.p006a.p007a.p017h.C0706h0;
import p005b.p006a.p007a.p017h.C0729t;
import p005b.p006a.p007a.p017h.C0730t0;
import p005b.p006a.p007a.p017h.C0732u0;
import p005b.p006a.p007a.p017h.C0738z;
import p005b.p006a.p007a.p018i.C0758q;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p038f.p039a.C0849e;
import p298d.p344x.p346c.C6888i;
import p437o.p438a.p439a.C8068c;
import p437o.p438a.p439a.C8083m;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, mo24462d2 = {"Lcom/appfoundry/previewer/activities/LongPressActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Ld/r;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", "onBackPressed", "onDestroy", "finish", "Lb/a/a/h/t;", "event", "onLongPressPageUnlinkEvent", "(Lb/a/a/h/t;)V", "Lb/a/a/h/u0;", "onUpdateEvent", "(Lb/a/a/h/u0;)V", "Lb/a/a/h/h0;", "onPushDialogEvent", "(Lb/a/a/h/h0;)V", "Lb/a/a/h/z;", "onOpenIntroEvent", "(Lb/a/a/h/z;)V", "<init>", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class LongPressActivity extends AppCompatActivity {

    /* renamed from: com.appfoundry.previewer.activities.LongPressActivity$a */
    public static final class C5449a implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ LongPressActivity f10851g;

        public C5449a(LongPressActivity longPressActivity) {
            this.f10851g = longPressActivity;
        }

        public final void run() {
            C8068c.m14948b().mo26008g(new C0730t0());
            this.f10851g.finish();
        }
    }

    public void finish() {
        super.finish();
        C0849e.m524j0(this);
    }

    public void onBackPressed() {
        BravoApp.C5403b bVar = BravoApp.f10730N;
        BravoApp.f10746v = false;
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0849e.m554y0(this);
        C0849e.m512d0(this);
        setContentView((int) R.layout.fragment_list_toolbar_solid);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setEnabled(false);
        }
        C0849e.m522i0(this);
        BravoApp.C5403b bVar = BravoApp.f10730N;
        BravoApp.f10746v = true;
        Page K = C0823f.m342K("page-unlink");
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.activity_parent);
        Animation animation = null;
        if (frameLayout != null) {
            C0758q.m244i(frameLayout);
            C0758q.m239d(frameLayout, K != null ? K.f11033a : null, K != null ? K.f11036d : null, Boolean.FALSE);
            C0758q.m237b(frameLayout, K != null ? K.f11033a : null, K != null ? K.f11041i : null, (Boolean) null, 4);
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        if (recyclerView != null) {
            String str = K != null ? K.f11033a : null;
            List<Container> list = K != null ? K.f11038f : null;
            if (K != null) {
                animation = K.f11053u;
            }
            C0849e.m556z0(recyclerView, str, list, animation, (Boolean) null, false, false, (Float) null, 120);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C0849e.m487J0(this);
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onLongPressPageUnlinkEvent(C0729t tVar) {
        C6888i.m12438e(tVar, "event");
        BravoApp.C5403b bVar = BravoApp.f10730N;
        BravoApp.f10746v = false;
        new Handler().postDelayed(new C5449a(this), 350);
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onOpenIntroEvent(C0738z zVar) {
        C6888i.m12438e(zVar, "event");
        BravoApp.C5403b bVar = BravoApp.f10730N;
        BravoApp.f10746v = false;
        new Handler().postDelayed(new C0687p(this), 350);
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onPushDialogEvent(C0706h0 h0Var) {
        C6888i.m12438e(h0Var, "event");
        C0849e.m473C0(this);
    }

    public void onStart() {
        super.onStart();
        C0849e.m536p0(this);
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onUpdateEvent(C0732u0 u0Var) {
        C6888i.m12438e(u0Var, "event");
        BravoApp.C5403b bVar = BravoApp.f10730N;
        BravoApp.f10746v = false;
        new Handler().postDelayed(new C0687p(this), 350);
    }
}
