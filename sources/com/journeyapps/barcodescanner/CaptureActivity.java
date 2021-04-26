package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import java.util.Objects;
import p005b.p265m.p266a.C4698a;
import p005b.p265m.p266a.C4708f;

public class CaptureActivity extends Activity {

    /* renamed from: g */
    public C4708f f11466g;

    /* renamed from: h */
    public DecoratedBarcodeView f11467h;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.zxing_capture);
        this.f11467h = (DecoratedBarcodeView) findViewById(R.id.zxing_barcode_scanner);
        C4708f fVar = new C4708f(this, this.f11467h);
        this.f11466g = fVar;
        fVar.mo16439c(getIntent(), bundle);
        C4708f fVar2 = this.f11466g;
        DecoratedBarcodeView decoratedBarcodeView = fVar2.f8981b;
        C4698a aVar = fVar2.f8989j;
        BarcodeView barcodeView = decoratedBarcodeView.f11468g;
        DecoratedBarcodeView.C5773b bVar = new DecoratedBarcodeView.C5773b(aVar);
        barcodeView.f11455H = BarcodeView.C5771b.SINGLE;
        barcodeView.f11456I = bVar;
        barcodeView.mo22194j();
    }

    public void onDestroy() {
        super.onDestroy();
        C4708f fVar = this.f11466g;
        fVar.f8984e = true;
        fVar.f8985f.mo16314a();
        fVar.f8987h.removeCallbacksAndMessages((Object) null);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f11467h.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        this.f11466g.mo16440d();
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        C4708f fVar = this.f11466g;
        Objects.requireNonNull(fVar);
        if (i != 250) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            fVar.mo16438b();
        } else {
            fVar.f8981b.f11468g.mo16406f();
        }
    }

    public void onResume() {
        super.onResume();
        this.f11466g.mo16441e();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f11466g.f8982c);
    }
}
