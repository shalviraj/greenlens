package p298d.p299a.p300a.p301a.p303y0.p391i.p394v;

import java.util.Arrays;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.i.v.e */
public final class C7225e extends C7240q<Character> {
    public C7225e(char c) {
        super(Character.valueOf(c));
    }

    /* renamed from: a */
    public C7452c0 mo24893a(C6021a0 a0Var) {
        C6888i.m12438e(a0Var, "module");
        C7489j0 charType = a0Var.getBuiltIns().getCharType();
        C6888i.m12437d(charType, "module.builtIns.charType");
        return charType;
    }

    public String toString() {
        String str;
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = Integer.valueOf(((Character) this.f14459a).charValue());
        char charValue = ((Character) this.f14459a).charValue();
        if (charValue == 8) {
            str = "\\b";
        } else if (charValue == 9) {
            str = "\\t";
        } else if (charValue == 10) {
            str = "\\n";
        } else if (charValue == 12) {
            str = "\\f";
        } else if (charValue == 13) {
            str = "\\r";
        } else {
            byte type = (byte) Character.getType(charValue);
            if (!(type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19)) {
                z = true;
            }
            str = z ? String.valueOf(charValue) : "?";
        }
        objArr[1] = str;
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(objArr, 2));
        C6888i.m12437d(format, "java.lang.String.format(this, *args)");
        return format;
    }
}
