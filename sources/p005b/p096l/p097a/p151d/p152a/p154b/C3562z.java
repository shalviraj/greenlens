package p005b.p096l.p097a.p151d.p152a.p154b;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p151d.p152a.p159e.C3579c0;

/* renamed from: b.l.a.d.a.b.z */
public final class C3562z {

    /* renamed from: a */
    public final C3579c0<C3525n2> f6626a;

    public C3562z(C3579c0<C3525n2> c0Var) {
        this.f6626a = c0Var;
    }

    /* renamed from: a */
    public final InputStream mo14868a(int i, String str, String str2, int i2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C1960d.m2801h(this.f6626a.mo14881a().mo14759b(i, str, str2, i2));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new C3495g0(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), i);
        } catch (ExecutionException e) {
            throw new C3495g0(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), e, i);
        } catch (InterruptedException e2) {
            throw new C3495g0("Extractor was interrupted while waiting for chunk file.", e2, i);
        }
    }
}
