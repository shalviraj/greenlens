package p005b.p051h.p052a.p055m.p056u;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.util.Objects;
import p005b.p051h.p052a.p055m.p056u.C0989e;

/* renamed from: b.h.a.m.u.m */
public final class C1003m implements C0989e<ParcelFileDescriptor> {

    /* renamed from: a */
    public final C1005b f1055a;

    @RequiresApi(21)
    /* renamed from: b.h.a.m.u.m$a */
    public static final class C1004a implements C0989e.C0990a<ParcelFileDescriptor> {
        @NonNull
        /* renamed from: a */
        public Class<ParcelFileDescriptor> mo10857a() {
            return ParcelFileDescriptor.class;
        }

        @NonNull
        /* renamed from: b */
        public C0989e mo10858b(@NonNull Object obj) {
            return new C1003m((ParcelFileDescriptor) obj);
        }
    }

    @RequiresApi(21)
    /* renamed from: b.h.a.m.u.m$b */
    public static final class C1005b {

        /* renamed from: a */
        public final ParcelFileDescriptor f1056a;

        public C1005b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f1056a = parcelFileDescriptor;
        }
    }

    @RequiresApi(21)
    public C1003m(ParcelFileDescriptor parcelFileDescriptor) {
        this.f1055a = new C1005b(parcelFileDescriptor);
    }

    /* renamed from: b */
    public void mo10856b() {
    }

    @RequiresApi(21)
    @NonNull
    /* renamed from: c */
    public ParcelFileDescriptor mo10855a() {
        C1005b bVar = this.f1055a;
        Objects.requireNonNull(bVar);
        try {
            Os.lseek(bVar.f1056a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
            return bVar.f1056a;
        } catch (ErrnoException e) {
            throw new IOException(e);
        }
    }
}
