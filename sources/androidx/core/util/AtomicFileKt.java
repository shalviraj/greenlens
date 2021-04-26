package androidx.core.util;

import android.util.AtomicFile;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import p298d.C6777r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7685a;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a(\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0014\u0010\u0011\u001a\u00020\u0007*\u00020\u0000H\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, mo24462d2 = {"Landroid/util/AtomicFile;", "Lkotlin/Function1;", "Ljava/io/FileOutputStream;", "Ld/r;", "block", "tryWrite", "(Landroid/util/AtomicFile;Ld/x/b/l;)V", "", "array", "writeBytes", "(Landroid/util/AtomicFile;[B)V", "", "text", "Ljava/nio/charset/Charset;", "charset", "writeText", "(Landroid/util/AtomicFile;Ljava/lang/String;Ljava/nio/charset/Charset;)V", "readBytes", "(Landroid/util/AtomicFile;)[B", "readText", "(Landroid/util/AtomicFile;Ljava/nio/charset/Charset;)Ljava/lang/String;", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class AtomicFileKt {
    @RequiresApi(17)
    public static final byte[] readBytes(AtomicFile atomicFile) {
        C6888i.m12439f(atomicFile, "$this$readBytes");
        byte[] readFully = atomicFile.readFully();
        C6888i.m12435b(readFully, "readFully()");
        return readFully;
    }

    @RequiresApi(17)
    public static final String readText(AtomicFile atomicFile, Charset charset) {
        C6888i.m12439f(atomicFile, "$this$readText");
        C6888i.m12439f(charset, "charset");
        byte[] readFully = atomicFile.readFully();
        C6888i.m12435b(readFully, "readFully()");
        return new String(readFully, charset);
    }

    public static /* synthetic */ String readText$default(AtomicFile atomicFile, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C7685a.f15210a;
        }
        return readText(atomicFile, charset);
    }

    @RequiresApi(17)
    public static final void tryWrite(AtomicFile atomicFile, C6862l<? super FileOutputStream, C6777r> lVar) {
        C6888i.m12439f(atomicFile, "$this$tryWrite");
        C6888i.m12439f(lVar, "block");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            C6888i.m12435b(startWrite, "stream");
            lVar.invoke(startWrite);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }

    @RequiresApi(17)
    public static final void writeBytes(AtomicFile atomicFile, byte[] bArr) {
        C6888i.m12439f(atomicFile, "$this$writeBytes");
        C6888i.m12439f(bArr, "array");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            C6888i.m12435b(startWrite, "stream");
            startWrite.write(bArr);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }

    @RequiresApi(17)
    public static final void writeText(AtomicFile atomicFile, String str, Charset charset) {
        C6888i.m12439f(atomicFile, "$this$writeText");
        C6888i.m12439f(str, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
        C6888i.m12439f(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        C6888i.m12435b(bytes, "(this as java.lang.String).getBytes(charset)");
        writeBytes(atomicFile, bytes);
    }

    public static /* synthetic */ void writeText$default(AtomicFile atomicFile, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = C7685a.f15210a;
        }
        writeText(atomicFile, str, charset);
    }
}
