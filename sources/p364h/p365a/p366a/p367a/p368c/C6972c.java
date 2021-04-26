package p364h.p365a.p366a.p367a.p368c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import android.view.View;
import android.view.ViewGroup;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import java.util.Objects;
import p351es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView;
import p364h.p365a.p366a.p367a.p370e.C6983a;

/* renamed from: h.a.a.a.c.c */
public class C6972c extends C6970a {
    public C6972c(Context context, String str) {
        super(context, str);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View inflate = this.f13987e.inflate(R.layout.view_pdf_page, viewGroup, false);
        SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) inflate.findViewById(R.id.subsamplingImageView);
        if (this.f13985c != null && getCount() >= i) {
            PdfRenderer.Page openPage = this.f13985c.openPage(i);
            C6974e eVar = (C6974e) this.f13986d;
            int i2 = i % eVar.f13996b;
            if (eVar.f13995a[i2] == null) {
                eVar.f13995a[i2] = Bitmap.createBitmap(eVar.f13997c, eVar.f13998d, eVar.f13999e);
            }
            eVar.f13995a[i2].eraseColor(0);
            Bitmap bitmap = eVar.f13995a[i2];
            Objects.requireNonNull(bitmap, "Bitmap must not be null");
            subsamplingScaleImageView.setImage(new C6983a(bitmap, false));
            openPage.render(bitmap, (Rect) null, (Matrix) null, 1);
            openPage.close();
            viewGroup.addView(inflate, 0);
        }
        return inflate;
    }
}
