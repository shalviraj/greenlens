package androidx.core.net;

import android.net.Uri;
import java.io.File;
import kotlin.Metadata;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\b¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0004*\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo24462d2 = {"", "Landroid/net/Uri;", "toUri", "(Ljava/lang/String;)Landroid/net/Uri;", "Ljava/io/File;", "(Ljava/io/File;)Landroid/net/Uri;", "toFile", "(Landroid/net/Uri;)Ljava/io/File;", "core-ktx_release"}, mo24463k = 2, mo24464mv = {1, 4, 0})
public final class UriKt {
    public static final File toFile(Uri uri) {
        C6888i.m12439f(uri, "$this$toFile");
        if (C6888i.m12434a(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                return new File(path);
            }
            throw new IllegalArgumentException(C0843a.m449j("Uri path is null: ", uri).toString());
        }
        throw new IllegalArgumentException(C0843a.m449j("Uri lacks 'file' scheme: ", uri).toString());
    }

    public static final Uri toUri(File file) {
        C6888i.m12439f(file, "$this$toUri");
        Uri fromFile = Uri.fromFile(file);
        C6888i.m12435b(fromFile, "Uri.fromFile(this)");
        return fromFile;
    }

    public static final Uri toUri(String str) {
        C6888i.m12439f(str, "$this$toUri");
        Uri parse = Uri.parse(str);
        C6888i.m12435b(parse, "Uri.parse(this)");
        return parse;
    }
}
