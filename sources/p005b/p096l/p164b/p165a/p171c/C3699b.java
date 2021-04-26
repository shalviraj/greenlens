package p005b.p096l.p164b.p165a.p171c;

import java.io.IOException;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p164b.p165a.p173d.C3730k;

/* renamed from: b.l.b.a.c.b */
public class C3699b extends C3730k implements Cloneable {
    public C3700c jsonFactory;

    public C3699b clone() {
        return (C3699b) super.clone();
    }

    public C3699b set(String str, Object obj) {
        super.set(str, obj);
        return this;
    }

    public String toPrettyString() {
        C3700c cVar = this.jsonFactory;
        if (cVar != null) {
            return cVar.mo15028e(this, true);
        }
        return super.toString();
    }

    public String toString() {
        C3700c cVar = this.jsonFactory;
        if (cVar == null) {
            return super.toString();
        }
        try {
            return cVar.mo15028e(this, false);
        } catch (IOException e) {
            C1960d.m2704D0(e);
            throw null;
        }
    }
}
