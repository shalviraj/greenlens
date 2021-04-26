package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import java.util.List;
import p005b.p096l.p232f.C4625s;
import p005b.p096l.p232f.p254x.p255a.C4654g;
import p005b.p265m.p266a.C4698a;
import p005b.p265m.p266a.C4699b;
import p005b.p265m.p266a.C4717h;
import p005b.p265m.p266a.p267t.C4745f;

public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: g */
    public BarcodeView f11468g;

    /* renamed from: h */
    public ViewfinderView f11469h;

    /* renamed from: i */
    public TextView f11470i;

    /* renamed from: j */
    public C5772a f11471j;

    /* renamed from: com.journeyapps.barcodescanner.DecoratedBarcodeView$a */
    public interface C5772a {
        /* renamed from: a */
        void mo22215a();

        /* renamed from: b */
        void mo22216b();
    }

    /* renamed from: com.journeyapps.barcodescanner.DecoratedBarcodeView$b */
    public class C5773b implements C4698a {

        /* renamed from: a */
        public C4698a f11472a;

        public C5773b(C4698a aVar) {
            this.f11472a = aVar;
        }

        /* renamed from: a */
        public void mo16395a(C4699b bVar) {
            this.f11472a.mo16395a(bVar);
        }

        /* renamed from: b */
        public void mo16396b(List<C4625s> list) {
            for (C4625s next : list) {
                ViewfinderView viewfinderView = DecoratedBarcodeView.this.f11469h;
                if (viewfinderView.f11481m.size() < 20) {
                    viewfinderView.f11481m.add(next);
                }
            }
            this.f11472a.mo16396b(list);
        }
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C4654g.f8782c);
        int resourceId = obtainStyledAttributes.getResourceId(0, R.layout.zxing_barcode_scanner);
        obtainStyledAttributes.recycle();
        FrameLayout.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(R.id.zxing_barcode_surface);
        this.f11468g = barcodeView;
        if (barcodeView != null) {
            barcodeView.mo16403c(attributeSet);
            ViewfinderView viewfinderView = (ViewfinderView) findViewById(R.id.zxing_viewfinder_view);
            this.f11469h = viewfinderView;
            if (viewfinderView != null) {
                viewfinderView.setCameraPreview(this.f11468g);
                this.f11470i = (TextView) findViewById(R.id.zxing_status_view);
                return;
            }
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(R.id.zxing_barcode_surface);
    }

    public C4745f getCameraSettings() {
        return this.f11468g.getCameraSettings();
    }

    public C4717h getDecoderFactory() {
        return this.f11468g.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.f11470i;
    }

    public ViewfinderView getViewFinder() {
        return this.f11469h;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 24) {
            this.f11468g.setTorch(true);
            C5772a aVar = this.f11471j;
            if (aVar != null) {
                aVar.mo22216b();
            }
            return true;
        } else if (i == 25) {
            this.f11468g.setTorch(false);
            C5772a aVar2 = this.f11471j;
            if (aVar2 != null) {
                aVar2.mo22215a();
            }
            return true;
        } else if (i == 27 || i == 80) {
            return true;
        } else {
            return super.onKeyDown(i, keyEvent);
        }
    }

    public void setCameraSettings(C4745f fVar) {
        this.f11468g.setCameraSettings(fVar);
    }

    public void setDecoderFactory(C4717h hVar) {
        this.f11468g.setDecoderFactory(hVar);
    }

    public void setStatusText(String str) {
        TextView textView = this.f11470i;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(C5772a aVar) {
        this.f11471j = aVar;
    }
}
