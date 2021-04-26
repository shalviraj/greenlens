package p298d.p299a.p300a.p301a.p303y0.p314d.p324b.p325w;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005b.p265m.p266a.p267t.C4750k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6523z;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6552l;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.p325w.C6569a;
import p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6602c;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7226f;

/* renamed from: d.a.a.a.y0.d.b.w.b */
public class C6572b implements C6552l.C6555c {

    /* renamed from: j */
    public static final boolean f12888j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* renamed from: k */
    public static final Map<C6713a, C6569a.C6570a> f12889k;

    /* renamed from: a */
    public int[] f12890a = null;

    /* renamed from: b */
    public C6602c f12891b = null;

    /* renamed from: c */
    public String f12892c = null;

    /* renamed from: d */
    public int f12893d = 0;

    /* renamed from: e */
    public String f12894e = null;

    /* renamed from: f */
    public String[] f12895f = null;

    /* renamed from: g */
    public String[] f12896g = null;

    /* renamed from: h */
    public String[] f12897h = null;

    /* renamed from: i */
    public C6569a.C6570a f12898i = null;

    /* renamed from: d.a.a.a.y0.d.b.w.b$b */
    public static abstract class C6574b implements C6552l.C6554b {

        /* renamed from: a */
        public final List<String> f12899a = new ArrayList();

        /* renamed from: a */
        public void mo23630a() {
            mo23682e((String[]) this.f12899a.toArray(new String[0]));
        }

        /* renamed from: b */
        public void mo23631b(C7226f fVar) {
        }

        /* renamed from: c */
        public void mo23632c(Object obj) {
            if (obj instanceof String) {
                this.f12899a.add((String) obj);
            }
        }

        /* renamed from: d */
        public void mo23633d(C6713a aVar, C6717d dVar) {
        }

        /* renamed from: e */
        public abstract void mo23682e(String[] strArr);
    }

    /* renamed from: d.a.a.a.y0.d.b.w.b$c */
    public class C6575c implements C6552l.C6553a {
        public C6575c(C6573a aVar) {
        }

        /* renamed from: g */
        public static /* synthetic */ void m11690g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "classLiteralValue";
            } else if (i == 7) {
                objArr[0] = "classId";
            } else if (i == 4) {
                objArr[0] = "enumClassId";
            } else if (i != 5) {
                objArr[0] = "name";
            } else {
                objArr[0] = "enumEntryName";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            switch (i) {
                case 2:
                    objArr[2] = "visitArray";
                    break;
                case 3:
                case 4:
                case 5:
                    objArr[2] = "visitEnum";
                    break;
                case 6:
                case 7:
                    objArr[2] = "visitAnnotation";
                    break;
                default:
                    objArr[2] = "visitClassLiteral";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo23623a() {
        }

        /* renamed from: b */
        public void mo23624b(C6717d dVar, C7226f fVar) {
            if (dVar == null) {
                m11690g(0);
                throw null;
            }
        }

        /* renamed from: c */
        public C6552l.C6553a mo23625c(C6717d dVar, C6713a aVar) {
            if (dVar != null) {
                return null;
            }
            m11690g(6);
            throw null;
        }

        /* renamed from: d */
        public void mo23626d(C6717d dVar, Object obj) {
            if (dVar != null) {
                String e = dVar.mo23886e();
                if (C4750k.f9100b.equals(e)) {
                    if (obj instanceof Integer) {
                        C6572b bVar = C6572b.this;
                        C6569a.C6570a aVar = C6569a.C6570a.f12879i.get(Integer.valueOf(((Integer) obj).intValue()));
                        if (aVar == null) {
                            aVar = C6569a.C6570a.UNKNOWN;
                        }
                        bVar.f12898i = aVar;
                    }
                } else if ("mv".equals(e)) {
                    if (obj instanceof int[]) {
                        C6572b.this.f12890a = (int[]) obj;
                    }
                } else if ("bv".equals(e)) {
                    if (obj instanceof int[]) {
                        C6572b.this.f12891b = new C6602c((int[]) obj);
                    }
                } else if ("xs".equals(e)) {
                    if (obj instanceof String) {
                        C6572b.this.f12892c = (String) obj;
                    }
                } else if ("xi".equals(e)) {
                    if (obj instanceof Integer) {
                        C6572b.this.f12893d = ((Integer) obj).intValue();
                    }
                } else if ("pn".equals(e) && (obj instanceof String)) {
                    C6572b.this.f12894e = (String) obj;
                }
            }
        }

        /* renamed from: e */
        public void mo23627e(C6717d dVar, C6713a aVar, C6717d dVar2) {
            if (dVar == null) {
                m11690g(3);
                throw null;
            }
        }

        /* renamed from: f */
        public C6552l.C6554b mo23628f(C6717d dVar) {
            if (dVar != null) {
                String e = dVar.mo23886e();
                if ("d1".equals(e)) {
                    return new C6577c(this);
                }
                if ("d2".equals(e)) {
                    return new C6578d(this);
                }
                return null;
            }
            m11690g(2);
            throw null;
        }
    }

    /* renamed from: d.a.a.a.y0.d.b.w.b$d */
    public class C6576d implements C6552l.C6553a {
        public C6576d(C6573a aVar) {
        }

        /* renamed from: g */
        public static /* synthetic */ void m11697g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "classLiteralValue";
            } else if (i == 7) {
                objArr[0] = "classId";
            } else if (i == 4) {
                objArr[0] = "enumClassId";
            } else if (i != 5) {
                objArr[0] = "name";
            } else {
                objArr[0] = "enumEntryName";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            switch (i) {
                case 2:
                    objArr[2] = "visitArray";
                    break;
                case 3:
                case 4:
                case 5:
                    objArr[2] = "visitEnum";
                    break;
                case 6:
                case 7:
                    objArr[2] = "visitAnnotation";
                    break;
                default:
                    objArr[2] = "visitClassLiteral";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo23623a() {
        }

        /* renamed from: b */
        public void mo23624b(C6717d dVar, C7226f fVar) {
            if (dVar == null) {
                m11697g(0);
                throw null;
            }
        }

        /* renamed from: c */
        public C6552l.C6553a mo23625c(C6717d dVar, C6713a aVar) {
            if (dVar != null) {
                return null;
            }
            m11697g(6);
            throw null;
        }

        /* renamed from: d */
        public void mo23626d(C6717d dVar, Object obj) {
            if (dVar != null) {
                String e = dVar.mo23886e();
                if ("version".equals(e)) {
                    if (obj instanceof int[]) {
                        C6572b bVar = C6572b.this;
                        int[] iArr = (int[]) obj;
                        bVar.f12890a = iArr;
                        if (bVar.f12891b == null) {
                            bVar.f12891b = new C6602c(iArr);
                        }
                    }
                } else if ("multifileClassName".equals(e)) {
                    C6572b.this.f12892c = obj instanceof String ? (String) obj : null;
                }
            }
        }

        /* renamed from: e */
        public void mo23627e(C6717d dVar, C6713a aVar, C6717d dVar2) {
            if (dVar == null) {
                m11697g(3);
                throw null;
            }
        }

        /* renamed from: f */
        public C6552l.C6554b mo23628f(C6717d dVar) {
            if (dVar != null) {
                String e = dVar.mo23886e();
                if ("data".equals(e) || "filePartClassNames".equals(e)) {
                    return new C6579e(this);
                }
                if ("strings".equals(e)) {
                    return new C6580f(this);
                }
                return null;
            }
            m11697g(2);
            throw null;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f12889k = hashMap;
        hashMap.put(C6713a.m12239l(new C6714b("kotlin.jvm.internal.KotlinClass")), C6569a.C6570a.CLASS);
        hashMap.put(C6713a.m12239l(new C6714b("kotlin.jvm.internal.KotlinFileFacade")), C6569a.C6570a.FILE_FACADE);
        hashMap.put(C6713a.m12239l(new C6714b("kotlin.jvm.internal.KotlinMultifileClass")), C6569a.C6570a.MULTIFILE_CLASS);
        hashMap.put(C6713a.m12239l(new C6714b("kotlin.jvm.internal.KotlinMultifileClassPart")), C6569a.C6570a.MULTIFILE_CLASS_PART);
        hashMap.put(C6713a.m12239l(new C6714b("kotlin.jvm.internal.KotlinSyntheticClass")), C6569a.C6570a.SYNTHETIC_CLASS);
    }

    /* renamed from: a */
    public void mo23618a() {
    }

    /* renamed from: b */
    public C6552l.C6553a mo23619b(C6713a aVar, C6234r0 r0Var) {
        C6569a.C6570a aVar2;
        if (aVar.mo23851b().equals(C6523z.f12769a)) {
            return new C6575c((C6573a) null);
        }
        if (f12888j || this.f12898i != null || (aVar2 = f12889k.get(aVar)) == null) {
            return null;
        }
        this.f12898i = aVar2;
        return new C6576d((C6573a) null);
    }
}
