package p364h.p365a.p366a.p367a.p368c;

import android.content.Context;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.io.File;
import java.io.IOException;
import java.net.URI;

/* renamed from: h.a.a.a.c.a */
public class C6970a extends PagerAdapter {

    /* renamed from: a */
    public String f13983a;

    /* renamed from: b */
    public Context f13984b;

    /* renamed from: c */
    public PdfRenderer f13985c;

    /* renamed from: d */
    public C6971b f13986d;

    /* renamed from: e */
    public LayoutInflater f13987e;

    /* renamed from: f */
    public float f13988f = 2.0f;

    /* renamed from: g */
    public int f13989g = 1;

    public C6970a(Context context, String str) {
        this.f13983a = str;
        this.f13984b = context;
        try {
            this.f13985c = new PdfRenderer(mo24359a(this.f13983a));
            this.f13987e = (LayoutInflater) this.f13984b.getSystemService("layout_inflater");
            PdfRenderer pdfRenderer = this.f13985c;
            float f = this.f13988f;
            PdfRenderer.Page openPage = pdfRenderer.openPage(0);
            C6973d dVar = new C6973d();
            dVar.f13993c = this.f13989g;
            dVar.f13991a = (int) (((float) openPage.getWidth()) * f);
            dVar.f13992b = (int) (((float) openPage.getHeight()) * f);
            openPage.close();
            this.f13986d = new C6974e(dVar);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public ParcelFileDescriptor mo24359a(String str) {
        File file = new File(str);
        if (file.exists()) {
            return ParcelFileDescriptor.open(file, 268435456);
        }
        if (!str.startsWith("/")) {
            return ParcelFileDescriptor.open(new File(this.f13984b.getCacheDir(), str), 268435456);
        }
        return this.f13984b.getContentResolver().openFileDescriptor(Uri.parse(URI.create(String.format("file://%s", new Object[]{str})).toString()), "rw");
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
    }

    public int getCount() {
        PdfRenderer pdfRenderer = this.f13985c;
        if (pdfRenderer != null) {
            return pdfRenderer.getPageCount();
        }
        return 0;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == ((View) obj);
    }
}
