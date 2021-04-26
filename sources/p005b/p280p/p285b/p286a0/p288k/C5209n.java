package p005b.p280p.p285b.p286a0.p288k;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p285b.C5121a;
import p005b.p280p.p285b.C5239l;
import p005b.p280p.p285b.C5245o;
import p005b.p280p.p285b.C5264y;
import p005b.p280p.p285b.p286a0.C5132g;

/* renamed from: b.p.b.a0.k.n */
public final class C5209n {

    /* renamed from: a */
    public final C5121a f10216a;

    /* renamed from: b */
    public final C5132g f10217b;

    /* renamed from: c */
    public Proxy f10218c;

    /* renamed from: d */
    public InetSocketAddress f10219d;

    /* renamed from: e */
    public List<Proxy> f10220e = Collections.emptyList();

    /* renamed from: f */
    public int f10221f;

    /* renamed from: g */
    public List<InetSocketAddress> f10222g = Collections.emptyList();

    /* renamed from: h */
    public int f10223h;

    /* renamed from: i */
    public final List<C5264y> f10224i = new ArrayList();

    public C5209n(C5121a aVar, C5132g gVar) {
        this.f10216a = aVar;
        this.f10217b = gVar;
        C5245o oVar = aVar.f9914a;
        Proxy proxy = aVar.f9921h;
        if (proxy != null) {
            this.f10220e = Collections.singletonList(proxy);
        } else {
            this.f10220e = new ArrayList();
            List<Proxy> select = aVar.f9920g.select(oVar.mo17173r());
            if (select != null) {
                this.f10220e.addAll(select);
            }
            this.f10220e.removeAll(Collections.singleton(Proxy.NO_PROXY));
            this.f10220e.add(Proxy.NO_PROXY);
        }
        this.f10221f = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f10216a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17103a(p005b.p280p.p285b.C5264y r4, java.io.IOException r5) {
        /*
            r3 = this;
            java.net.Proxy r0 = r4.f10518b
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT
            if (r0 == r1) goto L_0x001f
            b.p.b.a r0 = r3.f10216a
            java.net.ProxySelector r1 = r0.f9920g
            if (r1 == 0) goto L_0x001f
            b.p.b.o r0 = r0.f9914a
            java.net.URI r0 = r0.mo17173r()
            java.net.Proxy r2 = r4.f10518b
            java.net.SocketAddress r2 = r2.address()
            r1.connectFailed(r0, r2, r5)
        L_0x001f:
            b.p.b.a0.g r5 = r3.f10217b
            monitor-enter(r5)
            java.util.Set<b.p.b.y> r0 = r5.f9950a     // Catch:{ all -> 0x0029 }
            r0.add(r4)     // Catch:{ all -> 0x0029 }
            monitor-exit(r5)
            return
        L_0x0029:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.p286a0.p288k.C5209n.mo17103a(b.p.b.y, java.io.IOException):void");
    }

    /* renamed from: b */
    public boolean mo17104b() {
        return mo17105c() || mo17106d() || (this.f10224i.isEmpty() ^ true);
    }

    /* renamed from: c */
    public final boolean mo17105c() {
        return this.f10223h < this.f10222g.size();
    }

    /* renamed from: d */
    public final boolean mo17106d() {
        return this.f10221f < this.f10220e.size();
    }

    /* renamed from: e */
    public C5264y mo17107e() {
        boolean contains;
        String str;
        int i;
        if (!mo17105c()) {
            if (!mo17106d()) {
                if (!this.f10224i.isEmpty()) {
                    return this.f10224i.remove(0);
                }
                throw new NoSuchElementException();
            } else if (mo17106d()) {
                List<Proxy> list = this.f10220e;
                int i2 = this.f10221f;
                this.f10221f = i2 + 1;
                Proxy proxy = list.get(i2);
                this.f10222g = new ArrayList();
                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                    C5245o oVar = this.f10216a.f9914a;
                    str = oVar.f10423d;
                    i = oVar.f10424e;
                } else {
                    SocketAddress address = proxy.address();
                    if (address instanceof InetSocketAddress) {
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                        InetAddress address2 = inetSocketAddress.getAddress();
                        str = address2 == null ? inetSocketAddress.getHostName() : address2.getHostAddress();
                        i = inetSocketAddress.getPort();
                    } else {
                        StringBuilder u = C0843a.m460u("Proxy.address() is not an InetSocketAddress: ");
                        u.append(address.getClass());
                        throw new IllegalArgumentException(u.toString());
                    }
                }
                if (i < 1 || i > 65535) {
                    throw new SocketException("No route to " + str + ":" + i + "; port is out of range");
                }
                if (proxy.type() == Proxy.Type.SOCKS) {
                    this.f10222g.add(InetSocketAddress.createUnresolved(str, i));
                } else {
                    Objects.requireNonNull((C5239l.C5240a) this.f10216a.f9915b);
                    if (str != null) {
                        List asList = Arrays.asList(InetAddress.getAllByName(str));
                        int size = asList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            this.f10222g.add(new InetSocketAddress((InetAddress) asList.get(i3), i));
                        }
                    } else {
                        throw new UnknownHostException("hostname == null");
                    }
                }
                this.f10223h = 0;
                this.f10218c = proxy;
            } else {
                StringBuilder u2 = C0843a.m460u("No route to ");
                u2.append(this.f10216a.f9914a.f10423d);
                u2.append("; exhausted proxy configurations: ");
                u2.append(this.f10220e);
                throw new SocketException(u2.toString());
            }
        }
        if (mo17105c()) {
            List<InetSocketAddress> list2 = this.f10222g;
            int i4 = this.f10223h;
            this.f10223h = i4 + 1;
            InetSocketAddress inetSocketAddress2 = list2.get(i4);
            this.f10219d = inetSocketAddress2;
            C5264y yVar = new C5264y(this.f10216a, this.f10218c, inetSocketAddress2);
            C5132g gVar = this.f10217b;
            synchronized (gVar) {
                contains = gVar.f9950a.contains(yVar);
            }
            if (!contains) {
                return yVar;
            }
            this.f10224i.add(yVar);
            return mo17107e();
        }
        StringBuilder u3 = C0843a.m460u("No route to ");
        u3.append(this.f10216a.f9914a.f10423d);
        u3.append("; exhausted inet socket addresses: ");
        u3.append(this.f10222g);
        throw new SocketException(u3.toString());
    }
}
