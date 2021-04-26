package p005b.p268n.p269a.p270a;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p005b.p051h.p052a.C0929c;
import p005b.p051h.p052a.C0935g;
import p005b.p051h.p052a.p055m.p062w.C1183v;
import p005b.p051h.p052a.p072o.C1327d;
import p005b.p080i.p081a.C1422f;
import p005b.p268n.p269a.p270a.p271e.C4760a;
import p005b.p268n.p269a.p270a.p271e.C4761b;
import p005b.p268n.p269a.p270a.p271e.C4762c;
import p005b.p268n.p269a.p270a.p271e.C4763d;
import p005b.p268n.p269a.p270a.p271e.C4764e;
import p005b.p268n.p269a.p270a.p271e.C4765f;
import p005b.p268n.p269a.p270a.p271e.C4766g;
import p005b.p268n.p269a.p270a.p271e.C4769j;

/* renamed from: b.n.a.a.c */
public final class C4758c extends C1327d {
    /* renamed from: b */
    public void mo11169b(@NonNull Context context, @NonNull C0929c cVar, @NonNull C0935g gVar) {
        Class<String> cls = String.class;
        Class<C1422f> cls2 = C1422f.class;
        gVar.mo10768h(cls2, BitmapDrawable.class, new C4756b(context, cVar));
        gVar.mo10763c(cls2, cls2, C1183v.C1184a.f1443a);
        gVar.mo10763c(cls, cls, C4755a.f9104a);
        gVar.mo10764d("com.kirich1409.svgloader.glide", InputStream.class, cls2, new C4763d());
        gVar.mo10764d("com.kirich1409.svgloader.glide", File.class, cls2, new C4762c());
        gVar.mo10764d("com.kirich1409.svgloader.glide", FileDescriptor.class, cls2, new C4761b());
        gVar.mo10764d("com.kirich1409.svgloader.glide", ParcelFileDescriptor.class, cls2, new C4764e());
        gVar.mo10764d("com.kirich1409.svgloader.glide", cls2, cls2, new C4769j());
        gVar.mo10764d("com.kirich1409.svgloader.glide", ByteBuffer.class, cls2, new C4760a());
        gVar.mo10764d("com.kirich1409.svgloader.glide", cls, cls2, new C4766g());
        gVar.mo10764d("com.kirich1409.svgloader.glide", Uri.class, cls2, new C4765f(context));
    }
}
