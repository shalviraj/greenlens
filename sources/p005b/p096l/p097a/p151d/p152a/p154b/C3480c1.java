package p005b.p096l.p097a.p151d.p152a.p154b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import androidx.core.app.NotificationCompat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p151d.p152a.p156c.C3565a;
import p005b.p096l.p097a.p151d.p152a.p159e.C3579c0;
import p005b.p096l.p097a.p151d.p152a.p159e.C3584f;
import p005b.p096l.p097a.p151d.p152a.p163i.C3651r;

/* renamed from: b.l.a.d.a.b.c1 */
public final class C3480c1 implements C3525n2 {

    /* renamed from: g */
    public static final C3584f f6317g = new C3584f("FakeAssetPackService");

    /* renamed from: a */
    public final String f6318a;

    /* renamed from: b */
    public final C3534q f6319b;

    /* renamed from: c */
    public final Context f6320c;

    /* renamed from: d */
    public final C3528o1 f6321d;

    /* renamed from: e */
    public final C3579c0<Executor> f6322e;

    /* renamed from: f */
    public final Handler f6323f = new Handler(Looper.getMainLooper());

    static {
        new AtomicInteger(1);
    }

    public C3480c1(File file, C3534q qVar, C3511k0 k0Var, Context context, C3528o1 o1Var, C3579c0<Executor> c0Var) {
        this.f6318a = file.getAbsolutePath();
        this.f6319b = qVar;
        this.f6320c = context;
        this.f6321d = o1Var;
        this.f6322e = c0Var;
    }

    /* renamed from: h */
    public static long m6643h(int i, long j) {
        if (i == 2) {
            return j / 2;
        }
        if (i == 3 || i == 4) {
            return j;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo14758a(int i, String str) {
        f6317g.mo14884b(4, "notifyModuleCompleted", new Object[0]);
        this.f6322e.mo14881a().execute(new C3563z0(this, i, str));
    }

    /* renamed from: b */
    public final C3651r<ParcelFileDescriptor> mo14759b(int i, String str, String str2, int i2) {
        f6317g.mo14884b(4, "getChunkFileDescriptor(session=%d, %s, %s, %d)", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)});
        C3651r<ParcelFileDescriptor> rVar = new C3651r<>();
        try {
            for (File file : mo14765i(str)) {
                if (C1960d.m2809j(file).equals(str2)) {
                    rVar.mo14932a(ParcelFileDescriptor.open(file, 268435456));
                    return rVar;
                }
            }
            throw new C3565a(String.format("Local testing slice for '%s' not found.", new Object[]{str2}));
        } catch (FileNotFoundException e) {
            f6317g.mo14884b(5, "getChunkFileDescriptor failed", new Object[]{e});
            rVar.mo14935d(new C3565a("Asset Slice file not found.", e));
        } catch (C3565a e2) {
            f6317g.mo14884b(5, "getChunkFileDescriptor failed", new Object[]{e2});
            rVar.mo14935d(e2);
        }
    }

    /* renamed from: c */
    public final void mo14760c() {
        f6317g.mo14884b(4, "keepAlive", new Object[0]);
    }

    /* renamed from: d */
    public final void mo14761d(int i) {
        f6317g.mo14884b(4, "notifySessionFailed", new Object[0]);
    }

    /* renamed from: e */
    public final C3651r<List<String>> mo14762e(Map<String, Long> map) {
        f6317g.mo14884b(4, "syncPacks()", new Object[0]);
        ArrayList arrayList = new ArrayList();
        C3651r<List<String>> rVar = new C3651r<>();
        rVar.mo14932a(arrayList);
        return rVar;
    }

    /* renamed from: f */
    public final void mo14763f(List<String> list) {
        f6317g.mo14884b(4, "cancelDownload(%s)", new Object[]{list});
    }

    /* renamed from: g */
    public final void mo14764g(int i, String str, String str2, int i2) {
        f6317g.mo14884b(4, "notifyChunkTransferred", new Object[0]);
    }

    /* renamed from: i */
    public final File[] mo14765i(String str) {
        File file = new File(this.f6318a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new C3472a1(str));
            if (listFiles != null) {
                if (r1 != 0) {
                    for (File j : listFiles) {
                        if (C1960d.m2809j(j).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new C3565a(String.format("No master slice available for pack '%s'.", new Object[]{str}));
                }
                throw new C3565a(String.format("No APKs available for pack '%s'.", new Object[]{str}));
            }
            throw new C3565a(String.format("Failed fetching APKs for pack '%s'.", new Object[]{str}));
        }
        throw new C3565a(String.format("Local testing directory '%s' not found.", new Object[]{file}));
    }

    /* renamed from: j */
    public final void mo14766j(int i, String str, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f6321d.mo14797a());
        bundle.putInt("session_id", i);
        File[] i3 = mo14765i(str);
        ArrayList arrayList = new ArrayList();
        int length = i3.length;
        long j = 0;
        int i4 = 0;
        while (i4 < length) {
            File file = i3[i4];
            j += file.length();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(i2 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String j2 = C1960d.m2809j(file);
            bundle.putParcelableArrayList(C1960d.m2728L("chunk_intents", str, j2), arrayList2);
            try {
                bundle.putString(C1960d.m2728L("uncompressed_hash_sha256", str, j2), C3484d1.m6655a(Arrays.asList(new File[]{file})));
                bundle.putLong(C1960d.m2728L("uncompressed_size", str, j2), file.length());
                arrayList.add(j2);
                i4++;
            } catch (NoSuchAlgorithmException e) {
                throw new C3565a("SHA256 algorithm not supported.", e);
            } catch (IOException e2) {
                throw new C3565a(String.format("Could not digest file: %s.", new Object[]{file}), e2);
            }
        }
        bundle.putStringArrayList(C1960d.m2722J("slice_ids", str), arrayList);
        bundle.putLong(C1960d.m2722J("pack_version", str), (long) this.f6321d.mo14797a());
        bundle.putInt(C1960d.m2722J(NotificationCompat.CATEGORY_STATUS, str), i2);
        bundle.putInt(C1960d.m2722J("error_code", str), 0);
        bundle.putLong(C1960d.m2722J("bytes_downloaded", str), m6643h(i2, j));
        bundle.putLong(C1960d.m2722J("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList(Arrays.asList(new String[]{str})));
        bundle.putLong("bytes_downloaded", m6643h(i2, j));
        bundle.putLong("total_bytes_to_download", j);
        this.f6323f.post(new C3476b1(this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
    }
}
