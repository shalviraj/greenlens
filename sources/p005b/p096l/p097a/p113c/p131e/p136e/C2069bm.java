package p005b.p096l.p097a.p113c.p131e.p136e;

import java.io.IOException;
import java.util.logging.Logger;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p131e.p136e.C2044am;
import p005b.p096l.p097a.p113c.p131e.p136e.C2069bm;

/* renamed from: b.l.a.c.e.e.bm */
public abstract class C2069bm<MessageType extends C2069bm<MessageType, BuilderType>, BuilderType extends C2044am<MessageType, BuilderType>> implements C2072c0 {
    public int zza = 0;

    /* renamed from: a */
    public final byte[] mo12438a() {
        try {
            C2071c cVar = (C2071c) this;
            int o = cVar.mo12451o();
            byte[] bArr = new byte[o];
            Logger logger = C2509tm.f4329b;
            C2437qm qmVar = new C2437qm(bArr, 0, o);
            cVar.mo12449k(qmVar);
            if (qmVar.mo12932A() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(C0843a.m456q(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    /* renamed from: b */
    public int mo12439b() {
        throw null;
    }

    /* renamed from: c */
    public void mo12440c(int i) {
        throw null;
    }

    /* renamed from: n */
    public final C2317lm mo12441n() {
        try {
            C2071c cVar = (C2071c) this;
            int o = cVar.mo12451o();
            C2317lm lmVar = C2317lm.f4051h;
            byte[] bArr = new byte[o];
            Logger logger = C2509tm.f4329b;
            C2437qm qmVar = new C2437qm(bArr, 0, o);
            cVar.mo12449k(qmVar);
            if (qmVar.mo12932A() == 0) {
                return new C2293km(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(C0843a.m456q(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e);
        }
    }
}
