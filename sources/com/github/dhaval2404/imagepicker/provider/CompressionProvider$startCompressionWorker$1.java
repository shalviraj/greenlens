package com.github.dhaval2404.imagepicker.provider;

import android.os.AsyncTask;
import com.github.dhaval2404.imagepicker.C5456R;
import java.io.File;
import kotlin.Metadata;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u0001J%\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\"\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, mo24462d2 = {"com/github/dhaval2404/imagepicker/provider/CompressionProvider$startCompressionWorker$1", "Landroid/os/AsyncTask;", "Ljava/io/File;", "Ljava/lang/Void;", "", "params", "doInBackground", "([Ljava/io/File;)Ljava/io/File;", "file", "Ld/r;", "onPostExecute", "(Ljava/io/File;)V", "imagepicker_release"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class CompressionProvider$startCompressionWorker$1 extends AsyncTask<File, Void, File> {
    public final /* synthetic */ CompressionProvider this$0;

    public CompressionProvider$startCompressionWorker$1(CompressionProvider compressionProvider) {
        this.this$0 = compressionProvider;
    }

    public File doInBackground(File... fileArr) {
        C6888i.m12439f(fileArr, "params");
        return this.this$0.startCompression(fileArr[0]);
    }

    public void onPostExecute(File file) {
        super.onPostExecute(file);
        if (file != null) {
            this.this$0.handleResult(file);
        } else {
            this.this$0.setError(C5456R.string.error_failed_to_compress_image);
        }
    }
}
