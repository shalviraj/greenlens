package p298d.p299a.p300a.p301a.p303y0.p304b;

import java.util.Collection;

/* renamed from: d.a.a.a.y0.b.b */
public interface C6023b extends C6019a, C6249x {

    /* renamed from: d.a.a.a.y0.b.b$a */
    public enum C6024a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        /* renamed from: d */
        public boolean mo23098d() {
            return this != FAKE_OVERRIDE;
        }
    }

    C6023b copy(C6206k kVar, C6251y yVar, C6233r rVar, C6024a aVar, boolean z);

    C6024a getKind();

    C6023b getOriginal();

    Collection<? extends C6023b> getOverriddenDescriptors();

    void setOverriddenDescriptors(Collection<? extends C6023b> collection);
}
