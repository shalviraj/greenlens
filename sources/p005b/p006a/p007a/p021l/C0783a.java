package p005b.p006a.p007a.p021l;

import android.content.Context;
import android.text.TextUtils;
import androidx.loader.content.AsyncTaskLoader;
import com.google.api.client.auth.oauth2.TokenErrorResponse;
import com.segment.analytics.integrations.BasePayload;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p164b.p165a.p166a.p168b.C3671k;
import p298d.p344x.p346c.C6888i;
import p441p.p442a.C8091a;

/* renamed from: b.a.a.l.a */
public abstract class C0783a<T> extends AsyncTaskLoader<C0784a<T>> {

    /* renamed from: a */
    public C0784a<T> f559a;

    /* renamed from: b.a.a.l.a$a */
    public static final class C0784a<T> {

        /* renamed from: a */
        public T f560a;

        /* renamed from: b */
        public Exception f561b;

        /* renamed from: c */
        public boolean f562c = true;

        /* renamed from: d */
        public String f563d;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0783a(Context context) {
        super(context);
        C6888i.m12438e(context, BasePayload.CONTEXT_KEY);
    }

    /* renamed from: a */
    public void deliverResult(C0784a<T> aVar) {
        if (!isReset()) {
            C0784a<T> aVar2 = this.f559a;
            this.f559a = aVar;
            if (isStarted()) {
                super.deliverResult(aVar);
            }
            if (aVar2 != null) {
                mo10618c(aVar2);
            }
        } else if (aVar != null) {
            mo10618c(aVar);
        }
    }

    /* renamed from: b */
    public abstract T mo10617b();

    /* renamed from: c */
    public final void mo10618c(C0784a<T> aVar) {
        if (aVar != null) {
            if (aVar.f560a != null) {
                aVar.f560a = null;
            }
            if (aVar.f561b != null) {
                aVar.f561b = null;
            }
        }
    }

    /* renamed from: d */
    public abstract void mo10619d(C0784a<T> aVar);

    public Object loadInBackground() {
        String str;
        String str2;
        StringBuilder sb;
        String str3;
        C0784a aVar = new C0784a();
        try {
            aVar.f560a = mo10617b();
            mo10619d(aVar);
        } catch (Exception e) {
            C8091a.f16272d.mo26044b("loadInBackground thrown error: %s", e.toString());
            StackTraceElement stackTraceElement = e.getStackTrace()[0];
            aVar.f562c = false;
            if (e instanceof C0792g) {
                C0792g gVar = (C0792g) e;
                str3 = null;
                aVar.f563d = null;
                if (!TextUtils.isEmpty((CharSequence) null)) {
                    str2 = aVar.f563d;
                    sb = C0843a.m460u(": ");
                }
                String str4 = aVar.f563d;
                StringBuilder u = C0843a.m460u("\n");
                u.append(e.getClass().getName());
                u.append(" at ");
                C6888i.m12437d(stackTraceElement, "t");
                u.append(stackTraceElement.getClassName());
                u.append("(");
                u.append(stackTraceElement.getFileName());
                u.append(":");
                u.append(stackTraceElement.getLineNumber());
                u.append(")");
                aVar.f563d = C6888i.m12444k(str4, u.toString());
                aVar.f561b = e;
            } else if (e instanceof C3671k) {
                TokenErrorResponse tokenErrorResponse = ((C3671k) e).f6751g;
                C6888i.m12437d(tokenErrorResponse, "errorResponse");
                aVar.f563d = tokenErrorResponse.getError();
                if (!TextUtils.isEmpty(tokenErrorResponse.getErrorDescription())) {
                    str2 = aVar.f563d;
                    sb = C0843a.m460u(": ");
                    str3 = tokenErrorResponse.getErrorDescription();
                }
                String str42 = aVar.f563d;
                StringBuilder u2 = C0843a.m460u("\n");
                u2.append(e.getClass().getName());
                u2.append(" at ");
                C6888i.m12437d(stackTraceElement, "t");
                u2.append(stackTraceElement.getClassName());
                u2.append("(");
                u2.append(stackTraceElement.getFileName());
                u2.append(":");
                u2.append(stackTraceElement.getLineNumber());
                u2.append(")");
                aVar.f563d = C6888i.m12444k(str42, u2.toString());
                aVar.f561b = e;
            } else {
                str = e.getMessage();
                aVar.f563d = str;
                String str422 = aVar.f563d;
                StringBuilder u22 = C0843a.m460u("\n");
                u22.append(e.getClass().getName());
                u22.append(" at ");
                C6888i.m12437d(stackTraceElement, "t");
                u22.append(stackTraceElement.getClassName());
                u22.append("(");
                u22.append(stackTraceElement.getFileName());
                u22.append(":");
                u22.append(stackTraceElement.getLineNumber());
                u22.append(")");
                aVar.f563d = C6888i.m12444k(str422, u22.toString());
                aVar.f561b = e;
            }
            sb.append(str3);
            str = C6888i.m12444k(str2, sb.toString());
            aVar.f563d = str;
            String str4222 = aVar.f563d;
            StringBuilder u222 = C0843a.m460u("\n");
            u222.append(e.getClass().getName());
            u222.append(" at ");
            C6888i.m12437d(stackTraceElement, "t");
            u222.append(stackTraceElement.getClassName());
            u222.append("(");
            u222.append(stackTraceElement.getFileName());
            u222.append(":");
            u222.append(stackTraceElement.getLineNumber());
            u222.append(")");
            aVar.f563d = C6888i.m12444k(str4222, u222.toString());
            aVar.f561b = e;
        }
        return aVar;
    }

    public void onCanceled(Object obj) {
        C0784a aVar = (C0784a) obj;
        super.onCanceled(aVar);
        mo10618c(aVar);
    }

    public void onReset() {
        super.onReset();
        cancelLoad();
        C0784a<T> aVar = this.f559a;
        if (aVar != null) {
            mo10618c(aVar);
            this.f559a = null;
        }
    }

    public void onStartLoading() {
        C0784a<T> aVar = this.f559a;
        if (aVar != null) {
            deliverResult(aVar);
        }
        if (takeContentChanged() || this.f559a == null) {
            forceLoad();
        }
    }

    public void onStopLoading() {
        cancelLoad();
    }
}
