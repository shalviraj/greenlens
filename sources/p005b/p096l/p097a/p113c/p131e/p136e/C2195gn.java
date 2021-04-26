package p005b.p096l.p097a.p113c.p131e.p136e;

import p005b.p096l.p097a.p113c.p131e.p136e.C2071c;
import p005b.p096l.p097a.p113c.p131e.p136e.C2195gn;

/* renamed from: b.l.a.c.e.e.gn */
public class C2195gn<MessageType extends C2071c<MessageType, BuilderType>, BuilderType extends C2195gn<MessageType, BuilderType>> extends C2044am<MessageType, BuilderType> {

    /* renamed from: g */
    public final MessageType f3907g;

    /* renamed from: h */
    public MessageType f3908h;

    /* renamed from: i */
    public boolean f3909i = false;

    public C2195gn(MessageType messagetype) {
        this.f3907g = messagetype;
        this.f3908h = (C2071c) messagetype.mo12376h(4, (Object) null, (Object) null);
    }

    /* renamed from: a */
    public void mo12689a() {
        MessageType messagetype = (C2071c) this.f3908h.mo12376h(4, (Object) null, (Object) null);
        C2247j0.f3951c.mo12723a(messagetype.getClass()).mo12557d(messagetype, this.f3908h);
        this.f3908h = messagetype;
    }

    /* renamed from: b */
    public MessageType mo12690b() {
        if (this.f3909i) {
            return this.f3908h;
        }
        MessageType messagetype = this.f3908h;
        C2247j0.f3951c.mo12723a(messagetype.getClass()).mo12555b(messagetype);
        this.f3909i = true;
        return this.f3908h;
    }

    /* renamed from: c */
    public final MessageType mo12691c() {
        MessageType b = mo12690b();
        if (b.mo12448j()) {
            return b;
        }
        throw new C2631z0();
    }

    public final Object clone() {
        C2195gn gnVar = (C2195gn) this.f3907g.mo12376h(5, (Object) null, (Object) null);
        gnVar.mo12693d(mo12690b());
        return gnVar;
    }

    /* renamed from: d */
    public final BuilderType mo12693d(MessageType messagetype) {
        if (this.f3909i) {
            mo12689a();
            this.f3909i = false;
        }
        MessageType messagetype2 = this.f3908h;
        C2247j0.f3951c.mo12723a(messagetype2.getClass()).mo12557d(messagetype2, messagetype);
        return this;
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C2072c0 mo12453q() {
        return this.f3907g;
    }
}
