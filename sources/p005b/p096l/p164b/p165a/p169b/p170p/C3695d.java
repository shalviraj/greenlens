package p005b.p096l.p164b.p165a.p169b.p170p;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p164b.p165a.p169b.C3684l;

/* renamed from: b.l.b.a.b.p.d */
public final class C3695d extends C3684l {

    /* renamed from: a */
    public final HttpURLConnection f6820a;

    /* renamed from: b */
    public final int f6821b;

    /* renamed from: c */
    public final String f6822c;

    /* renamed from: d */
    public final ArrayList<String> f6823d;

    /* renamed from: e */
    public final ArrayList<String> f6824e;

    /* renamed from: b.l.b.a.b.p.d$a */
    public final class C3696a extends FilterInputStream {

        /* renamed from: g */
        public long f6825g = 0;

        public C3696a(InputStream inputStream) {
            super(inputStream);
        }

        /* renamed from: d */
        public final void mo15018d() {
            String headerField = C3695d.this.f6820a.getHeaderField("Content-Length");
            long parseLong = headerField == null ? -1 : Long.parseLong(headerField);
            if (parseLong != -1) {
                long j = this.f6825g;
                if (j != 0 && j < parseLong) {
                    StringBuilder u = C0843a.m460u("Connection closed prematurely: bytesRead = ");
                    u.append(this.f6825g);
                    u.append(", Content-Length = ");
                    u.append(parseLong);
                    throw new IOException(u.toString());
                }
            }
        }

        public int read() {
            int read = this.in.read();
            if (read == -1) {
                mo15018d();
            } else {
                this.f6825g++;
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) {
            int read = this.in.read(bArr, i, i2);
            if (read == -1) {
                mo15018d();
            } else {
                this.f6825g += (long) read;
            }
            return read;
        }

        public long skip(long j) {
            long skip = this.in.skip(j);
            this.f6825g += skip;
            return skip;
        }
    }

    public C3695d(HttpURLConnection httpURLConnection) {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f6823d = arrayList;
        ArrayList<String> arrayList2 = new ArrayList<>();
        this.f6824e = arrayList2;
        this.f6820a = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        this.f6821b = responseCode == -1 ? 0 : responseCode;
        this.f6822c = httpURLConnection.getResponseMessage();
        for (Map.Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                for (String str2 : (List) entry.getValue()) {
                    if (str2 != null) {
                        arrayList.add(str);
                        arrayList2.add(str2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo15003a() {
        this.f6820a.disconnect();
    }

    /* renamed from: b */
    public InputStream mo15004b() {
        InputStream inputStream;
        try {
            inputStream = this.f6820a.getInputStream();
        } catch (IOException unused) {
            inputStream = this.f6820a.getErrorStream();
        }
        if (inputStream == null) {
            return null;
        }
        return new C3696a(inputStream);
    }

    /* renamed from: c */
    public String mo15005c() {
        return this.f6820a.getContentEncoding();
    }

    /* renamed from: d */
    public long mo15006d() {
        String headerField = this.f6820a.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1;
        }
        return Long.parseLong(headerField);
    }

    /* renamed from: e */
    public String mo15007e() {
        return this.f6820a.getHeaderField("Content-Type");
    }

    /* renamed from: f */
    public int mo15008f() {
        return this.f6823d.size();
    }

    /* renamed from: g */
    public String mo15009g(int i) {
        return this.f6823d.get(i);
    }

    /* renamed from: h */
    public String mo15010h(int i) {
        return this.f6824e.get(i);
    }

    /* renamed from: i */
    public String mo15011i() {
        return this.f6822c;
    }

    /* renamed from: j */
    public int mo15012j() {
        return this.f6821b;
    }

    /* renamed from: k */
    public String mo15013k() {
        String headerField = this.f6820a.getHeaderField(0);
        if (headerField == null || !headerField.startsWith("HTTP/1.")) {
            return null;
        }
        return headerField;
    }
}
