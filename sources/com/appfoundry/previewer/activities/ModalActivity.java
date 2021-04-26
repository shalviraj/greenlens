package com.appfoundry.previewer.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.model.Animation;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.Page;
import java.util.List;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import p005b.p006a.p007a.p008a.C0594b;
import p005b.p006a.p007a.p017h.C0706h0;
import p005b.p006a.p007a.p017h.C0723q;
import p005b.p006a.p007a.p017h.C0733v;
import p005b.p006a.p007a.p017h.C0736x;
import p005b.p006a.p007a.p018i.C0744e;
import p005b.p006a.p007a.p018i.C0758q;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p038f.p039a.C0849e;
import p298d.p344x.p346c.C6888i;
import p437o.p438a.p439a.C8083m;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010&\u001a\u00020#8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, mo24462d2 = {"Lcom/appfoundry/previewer/activities/ModalActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Ld/r;", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "()V", "onStart", "onDestroy", "finish", "Lb/a/a/h/q;", "event", "onIntroCloseEvent", "(Lb/a/a/h/q;)V", "Lb/a/a/h/v;", "onNavigationEvent", "(Lb/a/a/h/v;)V", "Lb/a/a/h/h0;", "onPushDialogEvent", "(Lb/a/a/h/h0;)V", "Lb/a/a/h/x;", "onOpenAppSettingsEvent", "(Lb/a/a/h/x;)V", "Lcom/appfoundry/previewer/model/Page;", "h", "Lcom/appfoundry/previewer/model/Page;", "page", "", "j", "Z", "isModalMenu", "i", "buildingIntroFromShakePage", "", "g", "Ljava/lang/String;", "pageId", "<init>", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class ModalActivity extends AppCompatActivity {

    /* renamed from: g */
    public String f10852g;

    /* renamed from: h */
    public Page f10853h;

    /* renamed from: i */
    public boolean f10854i;

    /* renamed from: j */
    public boolean f10855j;

    public void finish() {
        super.finish();
        if (this.f10855j) {
            BravoApp.C5403b bVar = BravoApp.f10730N;
            BravoApp.f10745u = false;
        }
        C0849e.m524j0(this);
    }

    public void onBackPressed() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        C0849e.m554y0(this);
        C0849e.m512d0(this);
        setContentView((int) R.layout.activity_modal);
        C0849e.m522i0(this);
        this.f10855j = getIntent().getBooleanExtra("is_menu", false);
        this.f10854i = getIntent().getBooleanExtra("building_intro_from_shake_page", false);
        Intent intent = getIntent();
        if (intent == null || (str = intent.getStringExtra("page_id")) == null) {
            str = "";
        }
        this.f10852g = str;
        Boolean bool = null;
        this.f10853h = this.f10855j ? C0849e.m488K() : this.f10854i ? C0823f.m341J(str) : C0823f.m339H(str);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.activity_modal_parent);
        if (frameLayout != null) {
            Page page = this.f10853h;
            C0758q.m237b(frameLayout, page != null ? page.f11033a : null, page != null ? page.f11041i : null, (Boolean) null, 4);
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        if (recyclerView != null) {
            Page page2 = this.f10853h;
            String str2 = page2 != null ? page2.f11033a : null;
            List<Container> list = page2 != null ? page2.f11038f : null;
            Animation animation = page2 != null ? page2.f11053u : null;
            if (page2 != null) {
                bool = Boolean.valueOf(page2.f11056x);
            }
            C0849e.m556z0(recyclerView, str2, list, animation, bool, false, false, (Float) null, 112);
        }
        if (this.f10855j) {
            BravoApp.C5403b bVar = BravoApp.f10730N;
            BravoApp bravoApp = BravoApp.f10731g;
            BravoApp.f10745u = true;
        }
        if (this.f10854i) {
            BravoApp.C5403b bVar2 = BravoApp.f10730N;
            BravoApp.f10747w = true;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f10854i) {
            BravoApp.C5403b bVar = BravoApp.f10730N;
            BravoApp.f10747w = false;
        }
        C0849e.m487J0(this);
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onIntroCloseEvent(C0723q qVar) {
        C6888i.m12438e(qVar, "event");
        finish();
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onNavigationEvent(C0733v vVar) {
        C6888i.m12438e(vVar, "event");
        if (this.f10854i) {
            Page J = C0823f.m341J(vVar.f442a);
            C0594b bVar = null;
            if (J != null) {
                bVar = C0744e.m200d(J, (Boolean) null, 1);
            }
            C0849e.m540r0(this, bVar, R.id.container);
            return;
        }
        finish();
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onOpenAppSettingsEvent(C0736x xVar) {
        C6888i.m12438e(xVar, "event");
        C6888i.m12438e(this, "$this$openAppSystemSettings");
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setFlags(268435456);
        intent.setData(Uri.fromParts("package", getPackageName(), (String) null));
        startActivity(intent);
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
}
