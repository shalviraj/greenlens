package p364h.p365a.p366a.p367a.p369d;

import android.os.Handler;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: h.a.a.a.d.b */
public class C6977b implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ String f14000g;

    /* renamed from: h */
    public final /* synthetic */ String f14001h;

    /* renamed from: i */
    public final /* synthetic */ C6981f f14002i;

    public C6977b(C6981f fVar, String str, String str2) {
        this.f14002i = fVar;
        this.f14000g = str;
        this.f14001h = str2;
    }

    public void run() {
        C6979d dVar;
        Handler handler;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f14000g));
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f14001h).openConnection();
            int contentLength = httpURLConnection.getContentLength();
            byte[] bArr = new byte[1024];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
            int i = 0;
            int i2 = 0;
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
                i += read;
                i2 += read;
                C6981f fVar = this.f14002i;
                if (fVar.f14012b != null && i2 > 153600) {
                    Handler handler2 = fVar.f14011a;
                    if (handler2 != null) {
                        handler2.post(new C6980e(fVar, i, contentLength));
                    }
                    i2 = 0;
                }
            }
            httpURLConnection.disconnect();
            fileOutputStream.close();
            C6981f fVar2 = this.f14002i;
            String str = this.f14001h;
            String str2 = this.f14000g;
            Handler handler3 = fVar2.f14011a;
            if (handler3 != null) {
                handler3.post(new C6978c(fVar2, str, str2));
            }
        } catch (MalformedURLException e) {
            C6981f fVar3 = this.f14002i;
            handler = fVar3.f14011a;
            if (handler != null) {
                dVar = new C6979d(fVar3, e);
                handler.post(dVar);
            }
        } catch (IOException e2) {
            C6981f fVar4 = this.f14002i;
            handler = fVar4.f14011a;
            if (handler != null) {
                dVar = new C6979d(fVar4, e2);
                handler.post(dVar);
            }
        }
    }
}
