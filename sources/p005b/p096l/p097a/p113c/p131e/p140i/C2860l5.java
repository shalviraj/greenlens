package p005b.p096l.p097a.p113c.p131e.p140i;

import java.io.IOException;
import p005b.p096l.p097a.p113c.p131e.p140i.C2860l5;
import p005b.p096l.p097a.p113c.p131e.p140i.C2899o5;

/* renamed from: b.l.a.c.e.i.l5 */
public class C2860l5<MessageType extends C2899o5<MessageType, BuilderType>, BuilderType extends C2860l5<MessageType, BuilderType>> extends C2794g4<MessageType, BuilderType> {

    /* renamed from: g */
    public final MessageType f4884g;

    /* renamed from: h */
    public MessageType f4885h;

    /* renamed from: i */
    public boolean f4886i = false;

    public C2860l5(MessageType messagetype) {
        this.f4884g = messagetype;
        this.f4885h = (C2899o5) messagetype.mo13245r(4, (Object) null, (Object) null);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C2913p6 mo13483d() {
        return this.f4884g;
    }

    /* renamed from: g */
    public final MessageType mo13484g() {
        MessageType l = mo13489l();
        boolean z = true;
        byte byteValue = ((Byte) l.mo13245r(1, (Object) null, (Object) null)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                boolean b = C3004w6.f5106c.mo13896a(l.getClass()).mo13628b(l);
                l.mo13245r(2, true != b ? null : l, (Object) null);
                z = b;
            }
        }
        if (z) {
            return l;
        }
        throw new C2862l7();
    }

    /* renamed from: h */
    public final BuilderType mo13485h(MessageType messagetype) {
        if (this.f4886i) {
            mo13487j();
            this.f4886i = false;
        }
        MessageType messagetype2 = this.f4885h;
        C3004w6.f5106c.mo13896a(messagetype2.getClass()).mo13630d(messagetype2, messagetype);
        return this;
    }

    /* renamed from: i */
    public final BuilderType mo13486i(byte[] bArr, int i, int i2, C2726b5 b5Var) {
        if (this.f4886i) {
            mo13487j();
            this.f4886i = false;
        }
        try {
            C3004w6.f5106c.mo13896a(this.f4885h.getClass()).mo13634h(this.f4885h, bArr, 0, i2, new C2846k4(b5Var));
            return this;
        } catch (C3016x5 e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw C3016x5.m5682a();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    /* renamed from: j */
    public void mo13487j() {
        MessageType messagetype = (C2899o5) this.f4885h.mo13245r(4, (Object) null, (Object) null);
        C3004w6.f5106c.mo13896a(messagetype.getClass()).mo13630d(messagetype, this.f4885h);
        this.f4885h = messagetype;
    }

    /* renamed from: k */
    public final BuilderType clone() {
        BuilderType buildertype = (C2860l5) this.f4884g.mo13245r(5, (Object) null, (Object) null);
        buildertype.mo13485h(mo13489l());
        return buildertype;
    }

    /* renamed from: l */
    public MessageType mo13489l() {
        if (this.f4886i) {
            return this.f4885h;
        }
        MessageType messagetype = this.f4885h;
        C3004w6.f5106c.mo13896a(messagetype.getClass()).mo13633g(messagetype);
        this.f4886i = true;
        return this.f4885h;
    }
}
