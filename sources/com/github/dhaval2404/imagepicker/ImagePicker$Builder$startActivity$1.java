package com.github.dhaval2404.imagepicker;

import com.github.florent37.inlineactivityresult.Result;
import kotlin.Metadata;
import p298d.C6777r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo24462d2 = {"Lcom/github/florent37/inlineactivityresult/Result;", "result", "Ld/r;", "invoke", "(Lcom/github/florent37/inlineactivityresult/Result;)V", "<anonymous>"}, mo24463k = 3, mo24464mv = {1, 4, 0})
public final class ImagePicker$Builder$startActivity$1 extends C6890k implements C6862l<Result, C6777r> {
    public final /* synthetic */ C6866p $completionHandler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImagePicker$Builder$startActivity$1(C6866p pVar) {
        super(1);
        this.$completionHandler = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Result) obj);
        return C6777r.f13694a;
    }

    public final void invoke(Result result) {
        C6888i.m12439f(result, "result");
        C6866p pVar = this.$completionHandler;
        if (pVar != null) {
            C6777r rVar = (C6777r) pVar.invoke(Integer.valueOf(result.getResultCode()), result.getData());
        }
    }
}
