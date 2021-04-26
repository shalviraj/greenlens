package p005b.p096l.p097a.p151d.p152a.p154b;

import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Objects;
import java.util.Properties;
import p005b.p096l.p097a.p151d.p152a.p159e.C3577b0;
import p005b.p096l.p097a.p151d.p152a.p159e.C3584f;

/* renamed from: b.l.a.d.a.b.s1 */
public final class C3543s1 {

    /* renamed from: h */
    public static final C3584f f6555h = new C3584f("SliceMetadataManager");

    /* renamed from: a */
    public final byte[] f6556a = new byte[8192];

    /* renamed from: b */
    public final C3544t f6557b;

    /* renamed from: c */
    public final String f6558c;

    /* renamed from: d */
    public final int f6559d;

    /* renamed from: e */
    public final long f6560e;

    /* renamed from: f */
    public final String f6561f;

    /* renamed from: g */
    public int f6562g;

    public C3543s1(C3544t tVar, String str, int i, long j, String str2) {
        this.f6557b = tVar;
        this.f6558c = str;
        this.f6559d = i;
        this.f6560e = j;
        this.f6561f = str2;
        this.f6562g = -1;
    }

    /* renamed from: a */
    public final void mo14803a(String str, long j, long j2, int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f6562g));
        FileOutputStream fileOutputStream = new FileOutputStream(mo14815m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C3577b0.f6643a.mo14880a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final void mo14804b(byte[] bArr, int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", ExifInterface.GPS_MEASUREMENT_2D);
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f6562g));
        FileOutputStream fileOutputStream = new FileOutputStream(mo14815m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            C3544t tVar = this.f6557b;
            String str = this.f6558c;
            int i2 = this.f6559d;
            long j = this.f6560e;
            String str2 = this.f6561f;
            Objects.requireNonNull(tVar);
            File file = new File(tVar.mo14830r(str, i2, j, str2), "checkpoint_ext.dat");
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                return;
            } catch (Throwable th) {
                C3577b0.f6643a.mo14880a(th, th);
            }
            throw th;
            throw th;
        } catch (Throwable th2) {
            C3577b0.f6643a.mo14880a(th, th2);
        }
    }

    /* renamed from: c */
    public final void mo14805c(int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", ExifInterface.GPS_MEASUREMENT_3D);
        properties.put("fileOffset", String.valueOf(mo14811i().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f6562g));
        FileOutputStream fileOutputStream = new FileOutputStream(mo14815m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C3577b0.f6643a.mo14880a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    public final void mo14806d(int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f6562g));
        FileOutputStream fileOutputStream = new FileOutputStream(mo14815m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C3577b0.f6643a.mo14880a(th, th);
        }
        throw th;
    }

    /* renamed from: e */
    public final C3540r1 mo14807e() {
        File q = this.f6557b.mo14829q(this.f6558c, this.f6559d, this.f6560e, this.f6561f);
        if (q.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(q);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new C3495g0("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.f6562g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new C3540r1(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e) {
                    throw new C3495g0("Slice checkpoint file corrupt.", (Exception) e);
                }
            } catch (Throwable th) {
                C3577b0.f6643a.mo14880a(th, th);
            }
        } else {
            throw new C3495g0("Slice checkpoint file does not exist.");
        }
        throw th;
    }

    /* renamed from: f */
    public final void mo14808f(byte[] bArr) {
        FileOutputStream fileOutputStream;
        this.f6562g++;
        try {
            fileOutputStream = new FileOutputStream(new File(mo14814l(), String.format("%s-LFH.dat", new Object[]{Integer.valueOf(this.f6562g)})));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return;
        } catch (IOException e) {
            throw new C3495g0("Could not write metadata file.", (Exception) e);
        } catch (Throwable th) {
            C3577b0.f6643a.mo14880a(th, th);
        }
        throw th;
    }

    /* renamed from: g */
    public final void mo14809g(byte[] bArr, InputStream inputStream) {
        this.f6562g++;
        FileOutputStream fileOutputStream = new FileOutputStream(mo14811i());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f6556a);
            while (read > 0) {
                fileOutputStream.write(this.f6556a, 0, read);
                read = inputStream.read(this.f6556a);
            }
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C3577b0.f6643a.mo14880a(th, th);
        }
        throw th;
    }

    /* renamed from: h */
    public final void mo14810h(long j, byte[] bArr, int i, int i2) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(mo14811i(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
            return;
        } catch (Throwable th) {
            C3577b0.f6643a.mo14880a(th, th);
        }
        throw th;
    }

    /* renamed from: i */
    public final File mo14811i() {
        return new File(mo14814l(), String.format("%s-NAM.dat", new Object[]{Integer.valueOf(this.f6562g)}));
    }

    /* renamed from: j */
    public final int mo14812j() {
        File q = this.f6557b.mo14829q(this.f6558c, this.f6559d, this.f6560e, this.f6561f);
        if (!q.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(q);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new C3495g0("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            C3577b0.f6643a.mo14880a(th, th);
        }
        throw th;
    }

    /* renamed from: k */
    public final void mo14813k(byte[] bArr, int i) {
        this.f6562g++;
        FileOutputStream fileOutputStream = new FileOutputStream(mo14811i());
        try {
            fileOutputStream.write(bArr, 0, i);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C3577b0.f6643a.mo14880a(th, th);
        }
        throw th;
    }

    /* renamed from: l */
    public final File mo14814l() {
        File r = this.f6557b.mo14830r(this.f6558c, this.f6559d, this.f6560e, this.f6561f);
        if (!r.exists()) {
            r.mkdirs();
        }
        return r;
    }

    /* renamed from: m */
    public final File mo14815m() {
        File q = this.f6557b.mo14829q(this.f6558c, this.f6559d, this.f6560e, this.f6561f);
        q.getParentFile().mkdirs();
        q.createNewFile();
        return q;
    }
}
