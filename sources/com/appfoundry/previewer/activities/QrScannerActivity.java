package com.appfoundry.previewer.activities;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import p005b.p006a.p007a.p017h.C0699e;
import p005b.p006a.p007a.p023n.C0817f;
import p005b.p038f.p039a.C0849e;
import p005b.p265m.p266a.C4698a;
import p005b.p265m.p266a.C4708f;
import p298d.p344x.p346c.C6888i;
import p437o.p438a.p439a.C8083m;
import p441p.p442a.C8091a;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\u0006J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\bJ\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\bJ-\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, mo24462d2 = {"Lcom/appfoundry/previewer/activities/QrScannerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Ld/r;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "()V", "onPause", "onDestroy", "outState", "onSaveInstanceState", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "onBackPressed", "onStart", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lb/a/a/h/e;", "onPageCloseEvent", "(Lb/a/a/h/e;)V", "Lb/m/a/f;", "g", "Lb/m/a/f;", "capture", "Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;", "h", "Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;", "zxingBarcodeScanner", "<init>", "app_debug"}, mo24463k = 1, mo24464mv = {1, 4, 2})
public final class QrScannerActivity extends AppCompatActivity {

    /* renamed from: g */
    public C4708f f10856g;

    /* renamed from: h */
    public DecoratedBarcodeView f10857h;

    public void onBackPressed() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_qr_scanner);
        C0849e.m554y0(this);
        C0849e.m512d0(this);
        View findViewById = findViewById(R.id.zxing_barcode_scanner);
        C6888i.m12437d(findViewById, "findViewById(R.id.zxing_barcode_scanner)");
        this.f10857h = (DecoratedBarcodeView) findViewById;
        DecoratedBarcodeView decoratedBarcodeView = this.f10857h;
        if (decoratedBarcodeView != null) {
            C4708f fVar = new C4708f(this, decoratedBarcodeView);
            this.f10856g = fVar;
            fVar.mo16439c(getIntent(), bundle);
            C4708f fVar2 = this.f10856g;
            if (fVar2 != null) {
                DecoratedBarcodeView decoratedBarcodeView2 = fVar2.f8981b;
                C4698a aVar = fVar2.f8989j;
                BarcodeView barcodeView = decoratedBarcodeView2.f11468g;
                DecoratedBarcodeView.C5773b bVar = new DecoratedBarcodeView.C5773b(aVar);
                barcodeView.f11455H = BarcodeView.C5771b.SINGLE;
                barcodeView.f11456I = bVar;
                barcodeView.mo22194j();
                return;
            }
            C6888i.m12446m("capture");
            throw null;
        }
        C6888i.m12446m("zxingBarcodeScanner");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C4708f fVar = this.f10856g;
        if (fVar != null) {
            fVar.f8984e = true;
            fVar.f8985f.mo16314a();
            fVar.f8987h.removeCallbacksAndMessages((Object) null);
            C0849e.m487J0(this);
            return;
        }
        C6888i.m12446m("capture");
        throw null;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C6888i.m12438e(keyEvent, "event");
        DecoratedBarcodeView decoratedBarcodeView = this.f10857h;
        if (decoratedBarcodeView != null) {
            return decoratedBarcodeView.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent);
        }
        C6888i.m12446m("zxingBarcodeScanner");
        throw null;
    }

    @C8083m(threadMode = ThreadMode.MAIN)
    public final void onPageCloseEvent(C0699e eVar) {
        C6888i.m12438e(eVar, "event");
        finish();
    }

    public void onPause() {
        super.onPause();
        C4708f fVar = this.f10856g;
        if (fVar != null) {
            fVar.mo16440d();
        } else {
            C6888i.m12446m("capture");
            throw null;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C6888i.m12438e(strArr, "permissions");
        C6888i.m12438e(iArr, "grantResults");
        if (!(!(iArr.length == 0)) || iArr[0] != 0) {
            if (!shouldShowRequestPermissionRationale(strArr[0])) {
                C0817f fVar = C0817f.f641b;
                C0817f.m297e("user_disabled_ask_for_camera_permission");
            } else {
                C8091a.f16272d.mo26043a("JUST DENIED", new Object[0]);
            }
            finish();
            return;
        }
        C8091a.f16272d.mo26043a("ACCEPTED", new Object[0]);
    }

    public void onResume() {
        super.onResume();
        C4708f fVar = this.f10856g;
        if (fVar != null) {
            fVar.mo16441e();
        } else {
            C6888i.m12446m("capture");
            throw null;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C6888i.m12438e(bundle, "outState");
        super.onSaveInstanceState(bundle);
        C4708f fVar = this.f10856g;
        if (fVar != null) {
            bundle.putInt("SAVED_ORIENTATION_LOCK", fVar.f8982c);
        } else {
            C6888i.m12446m("capture");
            throw null;
        }
    }

    public void onStart() {
        super.onStart();
        C0849e.m536p0(this);
    }
}
