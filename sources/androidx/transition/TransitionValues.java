package androidx.transition;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p005b.p035e.p036a.p037a.C0843a;

public class TransitionValues {
    public final ArrayList<Transition> mTargetedTransitions = new ArrayList<>();
    public final Map<String, Object> values = new HashMap();
    public View view;

    @Deprecated
    public TransitionValues() {
    }

    public TransitionValues(@NonNull View view2) {
        this.view = view2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.view == transitionValues.view && this.values.equals(transitionValues.values);
    }

    public int hashCode() {
        return this.values.hashCode() + (this.view.hashCode() * 31);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("TransitionValues@");
        u.append(Integer.toHexString(hashCode()));
        u.append(":\n");
        StringBuilder y = C0843a.m464y(u.toString(), "    view = ");
        y.append(this.view);
        y.append("\n");
        String l = C0843a.m451l(y.toString(), "    values:");
        for (String next : this.values.keySet()) {
            l = l + "    " + next + ": " + this.values.get(next) + "\n";
        }
        return l;
    }
}
