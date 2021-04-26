package p005b.p280p.p285b.p286a0;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p285b.C5235j;
import p005b.p280p.p285b.C5252r;

/* renamed from: b.p.b.a0.a */
public final class C5122a {

    /* renamed from: a */
    public final List<C5235j> f9925a;

    /* renamed from: b */
    public int f9926b = 0;

    /* renamed from: c */
    public boolean f9927c;

    /* renamed from: d */
    public boolean f9928d;

    public C5122a(List<C5235j> list) {
        this.f9925a = list;
    }

    /* renamed from: a */
    public C5235j mo16966a(SSLSocket sSLSocket) {
        C5235j jVar;
        boolean z;
        int i = this.f9926b;
        int size = this.f9925a.size();
        while (true) {
            if (i >= size) {
                jVar = null;
                break;
            }
            jVar = this.f9925a.get(i);
            if (jVar.mo17139a(sSLSocket)) {
                this.f9926b = i + 1;
                break;
            }
            i++;
        }
        if (jVar != null) {
            int i2 = this.f9926b;
            while (true) {
                if (i2 >= this.f9925a.size()) {
                    z = false;
                    break;
                } else if (this.f9925a.get(i2).mo17139a(sSLSocket)) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.f9927c = z;
            C5123b bVar = C5123b.f9930b;
            boolean z2 = this.f9928d;
            Objects.requireNonNull((C5252r.C5253a) bVar);
            Class<String> cls = String.class;
            String[] strArr = jVar.f10404c;
            String[] enabledCipherSuites = strArr != null ? (String[]) C5134i.m9465j(cls, strArr, sSLSocket.getEnabledCipherSuites()) : sSLSocket.getEnabledCipherSuites();
            String[] strArr2 = jVar.f10405d;
            String[] enabledProtocols = strArr2 != null ? (String[]) C5134i.m9465j(cls, strArr2, sSLSocket.getEnabledProtocols()) : sSLSocket.getEnabledProtocols();
            if (z2) {
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                byte[] bArr = C5134i.f9953a;
                if (Arrays.asList(supportedCipherSuites).contains("TLS_FALLBACK_SCSV")) {
                    int length = enabledCipherSuites.length + 1;
                    String[] strArr3 = new String[length];
                    System.arraycopy(enabledCipherSuites, 0, strArr3, 0, enabledCipherSuites.length);
                    strArr3[length - 1] = "TLS_FALLBACK_SCSV";
                    enabledCipherSuites = strArr3;
                }
            }
            C5235j.C5237b bVar2 = new C5235j.C5237b(jVar);
            bVar2.mo17144b(enabledCipherSuites);
            bVar2.mo17146d(enabledProtocols);
            C5235j a = bVar2.mo17143a();
            String[] strArr4 = a.f10405d;
            if (strArr4 != null) {
                sSLSocket.setEnabledProtocols(strArr4);
            }
            String[] strArr5 = a.f10404c;
            if (strArr5 != null) {
                sSLSocket.setEnabledCipherSuites(strArr5);
            }
            return jVar;
        }
        StringBuilder u = C0843a.m460u("Unable to find acceptable protocols. isFallback=");
        u.append(this.f9928d);
        u.append(", modes=");
        u.append(this.f9925a);
        u.append(", supported protocols=");
        u.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(u.toString());
    }
}
