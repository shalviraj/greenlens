package com.afollestad.materialdialogs.internal.button;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatCheckBox;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.segment.analytics.integrations.BasePayload;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import p005b.p025b.p026a.C0826c;
import p005b.p025b.p026a.C0827d;
import p005b.p025b.p026a.p027e.p028a.C0829a;
import p005b.p025b.p026a.p029f.C0831b;
import p005b.p291q.p292a.C5266a;
import p298d.C6774o;
import p298d.p334t.C6798p;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010<\u001a\u00020;\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b?\u0010@J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001c\u001a\u00020\n8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0019\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R(\u00102\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u0010 \"\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u0010+R\u0016\u00106\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u0010+R\u0016\u00108\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u0010+R\u0016\u0010:\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010+¨\u0006A"}, mo24462d2 = {"Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;", "Lb/b/a/e/a/a;", "Ld/r;", "onFinishInflate", "()V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "o", "Z", "getStackButtons$core", "()Z", "setStackButtons$core", "(Z)V", "stackButtons", "", "Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "getVisibleButtons", "()[Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "visibleButtons", "Landroidx/appcompat/widget/AppCompatCheckBox;", "q", "Landroidx/appcompat/widget/AppCompatCheckBox;", "getCheckBoxPrompt", "()Landroidx/appcompat/widget/AppCompatCheckBox;", "setCheckBoxPrompt", "(Landroidx/appcompat/widget/AppCompatCheckBox;)V", "checkBoxPrompt", "n", "I", "checkBoxPromptMarginHorizontal", "p", "[Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "getActionButtons", "setActionButtons", "([Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;)V", "actionButtons", "j", "buttonFramePadding", "l", "buttonFrameSpecHeight", "k", "buttonFramePaddingNeutral", "m", "checkBoxPromptMarginVertical", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, mo24463k = 1, mo24464mv = {1, 4, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DialogActionButtonLayout extends C0829a {

    /* renamed from: j */
    public final int f10656j;

    /* renamed from: k */
    public final int f10657k;

    /* renamed from: l */
    public final int f10658l;

    /* renamed from: m */
    public final int f10659m;

    /* renamed from: n */
    public final int f10660n;

    /* renamed from: o */
    public boolean f10661o;

    /* renamed from: p */
    public DialogActionButton[] f10662p;

    /* renamed from: q */
    public AppCompatCheckBox f10663q;

    /* renamed from: com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout$a */
    public static final class C5307a implements View.OnClickListener {

        /* renamed from: g */
        public final /* synthetic */ DialogActionButtonLayout f10664g;

        /* renamed from: h */
        public final /* synthetic */ C0827d f10665h;

        public C5307a(DialogActionButtonLayout dialogActionButtonLayout, C0827d dVar) {
            this.f10664g = dialogActionButtonLayout;
            this.f10665h = dVar;
        }

        public final void onClick(View view) {
            this.f10664g.getDialog();
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogActionButtonLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C6888i.m12439f(context, BasePayload.CONTEXT_KEY);
        C0831b bVar = C0831b.f661a;
        this.f10656j = bVar.mo10658a(this, R.dimen.md_action_button_frame_padding) - bVar.mo10658a(this, R.dimen.md_action_button_inset_horizontal);
        this.f10657k = bVar.mo10658a(this, R.dimen.md_action_button_frame_padding_neutral);
        this.f10658l = bVar.mo10658a(this, R.dimen.md_action_button_frame_spec_height);
        this.f10659m = bVar.mo10658a(this, R.dimen.md_checkbox_prompt_margin_vertical);
        this.f10660n = bVar.mo10658a(this, R.dimen.md_checkbox_prompt_margin_horizontal);
    }

    public final DialogActionButton[] getActionButtons() {
        DialogActionButton[] dialogActionButtonArr = this.f10662p;
        if (dialogActionButtonArr != null) {
            return dialogActionButtonArr;
        }
        C6888i.m12446m("actionButtons");
        throw null;
    }

    public final AppCompatCheckBox getCheckBoxPrompt() {
        AppCompatCheckBox appCompatCheckBox = this.f10663q;
        if (appCompatCheckBox != null) {
            return appCompatCheckBox;
        }
        C6888i.m12446m("checkBoxPrompt");
        throw null;
    }

    public final boolean getStackButtons$core() {
        return this.f10661o;
    }

    public final DialogActionButton[] getVisibleButtons() {
        DialogActionButton[] dialogActionButtonArr = this.f10662p;
        if (dialogActionButtonArr != null) {
            ArrayList arrayList = new ArrayList();
            for (DialogActionButton dialogActionButton : dialogActionButtonArr) {
                if (C0826c.m415f(dialogActionButton)) {
                    arrayList.add(dialogActionButton);
                }
            }
            Object[] array = arrayList.toArray(new DialogActionButton[0]);
            if (array != null) {
                return (DialogActionButton[]) array;
            }
            throw new C6774o("null cannot be cast to non-null type kotlin.Array<T>");
        }
        C6888i.m12446m("actionButtons");
        throw null;
    }

    public void onDraw(Canvas canvas) {
        C6888i.m12439f(canvas, "canvas");
        super.onDraw(canvas);
        if (getDrawDivider()) {
            canvas.drawLine(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getDividerHeight(), mo10651a());
        }
    }

    public void onFinishInflate() {
        C0827d dVar;
        super.onFinishInflate();
        View findViewById = findViewById(R.id.md_button_positive);
        C6888i.m12435b(findViewById, "findViewById(R.id.md_button_positive)");
        View findViewById2 = findViewById(R.id.md_button_negative);
        C6888i.m12435b(findViewById2, "findViewById(R.id.md_button_negative)");
        View findViewById3 = findViewById(R.id.md_button_neutral);
        C6888i.m12435b(findViewById3, "findViewById(R.id.md_button_neutral)");
        this.f10662p = new DialogActionButton[]{(DialogActionButton) findViewById, (DialogActionButton) findViewById2, (DialogActionButton) findViewById3};
        View findViewById4 = findViewById(R.id.md_checkbox_prompt);
        C6888i.m12435b(findViewById4, "findViewById(R.id.md_checkbox_prompt)");
        this.f10663q = (AppCompatCheckBox) findViewById4;
        DialogActionButton[] dialogActionButtonArr = this.f10662p;
        if (dialogActionButtonArr != null) {
            int length = dialogActionButtonArr.length;
            for (int i = 0; i < length; i++) {
                DialogActionButton dialogActionButton = dialogActionButtonArr[i];
                if (i == 0) {
                    dVar = C0827d.POSITIVE;
                } else if (i == 1) {
                    dVar = C0827d.NEGATIVE;
                } else if (i == 2) {
                    dVar = C0827d.NEUTRAL;
                } else {
                    throw new IndexOutOfBoundsException(i + " is not an action button index.");
                }
                dialogActionButton.setOnClickListener(new C5307a(this, dVar));
            }
            return;
        }
        C6888i.m12446m("actionButtons");
        throw null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        List<DialogActionButton> list;
        int i5;
        int i6;
        int i7;
        AppCompatCheckBox appCompatCheckBox;
        if (C0826c.m416g(this)) {
            AppCompatCheckBox appCompatCheckBox2 = this.f10663q;
            if (appCompatCheckBox2 != null) {
                if (C0826c.m415f(appCompatCheckBox2)) {
                    if (C0826c.m413d(this)) {
                        i7 = getMeasuredWidth() - this.f10660n;
                        i6 = this.f10659m;
                        AppCompatCheckBox appCompatCheckBox3 = this.f10663q;
                        if (appCompatCheckBox3 != null) {
                            i5 = i7 - appCompatCheckBox3.getMeasuredWidth();
                            appCompatCheckBox = this.f10663q;
                            if (appCompatCheckBox == null) {
                                C6888i.m12446m("checkBoxPrompt");
                                throw null;
                            }
                        } else {
                            C6888i.m12446m("checkBoxPrompt");
                            throw null;
                        }
                    } else {
                        i5 = this.f10660n;
                        i6 = this.f10659m;
                        AppCompatCheckBox appCompatCheckBox4 = this.f10663q;
                        if (appCompatCheckBox4 != null) {
                            i7 = appCompatCheckBox4.getMeasuredWidth() + i5;
                            appCompatCheckBox = this.f10663q;
                            if (appCompatCheckBox == null) {
                                C6888i.m12446m("checkBoxPrompt");
                                throw null;
                            }
                        } else {
                            C6888i.m12446m("checkBoxPrompt");
                            throw null;
                        }
                    }
                    int measuredHeight = appCompatCheckBox.getMeasuredHeight() + i6;
                    AppCompatCheckBox appCompatCheckBox5 = this.f10663q;
                    if (appCompatCheckBox5 != null) {
                        appCompatCheckBox5.layout(i5, i6, i7, measuredHeight);
                    } else {
                        C6888i.m12446m("checkBoxPrompt");
                        throw null;
                    }
                }
                boolean z2 = true;
                if (this.f10661o) {
                    int i8 = this.f10656j;
                    int measuredWidth = getMeasuredWidth() - this.f10656j;
                    int measuredHeight2 = getMeasuredHeight();
                    DialogActionButton[] visibleButtons = getVisibleButtons();
                    C6888i.m12438e(visibleButtons, "$this$reversed");
                    if (visibleButtons.length != 0) {
                        z2 = false;
                    }
                    if (z2) {
                        list = C6798p.f13713g;
                    } else {
                        list = C5266a.m9775A4(visibleButtons);
                        C6888i.m12438e(list, "$this$reverse");
                        Collections.reverse(list);
                    }
                    for (DialogActionButton layout : list) {
                        int i9 = measuredHeight2 - this.f10658l;
                        layout.layout(i8, i9, measuredWidth, measuredHeight2);
                        measuredHeight2 = i9;
                    }
                    return;
                }
                int measuredHeight3 = getMeasuredHeight() - this.f10658l;
                int measuredHeight4 = getMeasuredHeight();
                if (C0826c.m413d(this)) {
                    DialogActionButton[] dialogActionButtonArr = this.f10662p;
                    if (dialogActionButtonArr != null) {
                        if (C0826c.m415f(dialogActionButtonArr[2])) {
                            DialogActionButton[] dialogActionButtonArr2 = this.f10662p;
                            if (dialogActionButtonArr2 != null) {
                                DialogActionButton dialogActionButton = dialogActionButtonArr2[2];
                                int measuredWidth2 = getMeasuredWidth() - this.f10657k;
                                dialogActionButton.layout(measuredWidth2 - dialogActionButton.getMeasuredWidth(), measuredHeight3, measuredWidth2, measuredHeight4);
                            } else {
                                C6888i.m12446m("actionButtons");
                                throw null;
                            }
                        }
                        int i10 = this.f10656j;
                        DialogActionButton[] dialogActionButtonArr3 = this.f10662p;
                        if (dialogActionButtonArr3 != null) {
                            if (C0826c.m415f(dialogActionButtonArr3[0])) {
                                DialogActionButton[] dialogActionButtonArr4 = this.f10662p;
                                if (dialogActionButtonArr4 != null) {
                                    DialogActionButton dialogActionButton2 = dialogActionButtonArr4[0];
                                    int measuredWidth3 = dialogActionButton2.getMeasuredWidth() + i10;
                                    dialogActionButton2.layout(i10, measuredHeight3, measuredWidth3, measuredHeight4);
                                    i10 = measuredWidth3;
                                } else {
                                    C6888i.m12446m("actionButtons");
                                    throw null;
                                }
                            }
                            DialogActionButton[] dialogActionButtonArr5 = this.f10662p;
                            if (dialogActionButtonArr5 == null) {
                                C6888i.m12446m("actionButtons");
                                throw null;
                            } else if (C0826c.m415f(dialogActionButtonArr5[1])) {
                                DialogActionButton[] dialogActionButtonArr6 = this.f10662p;
                                if (dialogActionButtonArr6 != null) {
                                    DialogActionButton dialogActionButton3 = dialogActionButtonArr6[1];
                                    dialogActionButton3.layout(i10, measuredHeight3, dialogActionButton3.getMeasuredWidth() + i10, measuredHeight4);
                                    return;
                                }
                                C6888i.m12446m("actionButtons");
                                throw null;
                            }
                        } else {
                            C6888i.m12446m("actionButtons");
                            throw null;
                        }
                    } else {
                        C6888i.m12446m("actionButtons");
                        throw null;
                    }
                } else {
                    DialogActionButton[] dialogActionButtonArr7 = this.f10662p;
                    if (dialogActionButtonArr7 != null) {
                        if (C0826c.m415f(dialogActionButtonArr7[2])) {
                            DialogActionButton[] dialogActionButtonArr8 = this.f10662p;
                            if (dialogActionButtonArr8 != null) {
                                DialogActionButton dialogActionButton4 = dialogActionButtonArr8[2];
                                int i11 = this.f10657k;
                                dialogActionButton4.layout(i11, measuredHeight3, dialogActionButton4.getMeasuredWidth() + i11, measuredHeight4);
                            } else {
                                C6888i.m12446m("actionButtons");
                                throw null;
                            }
                        }
                        int measuredWidth4 = getMeasuredWidth() - this.f10656j;
                        DialogActionButton[] dialogActionButtonArr9 = this.f10662p;
                        if (dialogActionButtonArr9 != null) {
                            if (C0826c.m415f(dialogActionButtonArr9[0])) {
                                DialogActionButton[] dialogActionButtonArr10 = this.f10662p;
                                if (dialogActionButtonArr10 != null) {
                                    DialogActionButton dialogActionButton5 = dialogActionButtonArr10[0];
                                    int measuredWidth5 = measuredWidth4 - dialogActionButton5.getMeasuredWidth();
                                    dialogActionButton5.layout(measuredWidth5, measuredHeight3, measuredWidth4, measuredHeight4);
                                    measuredWidth4 = measuredWidth5;
                                } else {
                                    C6888i.m12446m("actionButtons");
                                    throw null;
                                }
                            }
                            DialogActionButton[] dialogActionButtonArr11 = this.f10662p;
                            if (dialogActionButtonArr11 == null) {
                                C6888i.m12446m("actionButtons");
                                throw null;
                            } else if (C0826c.m415f(dialogActionButtonArr11[1])) {
                                DialogActionButton[] dialogActionButtonArr12 = this.f10662p;
                                if (dialogActionButtonArr12 != null) {
                                    DialogActionButton dialogActionButton6 = dialogActionButtonArr12[1];
                                    dialogActionButton6.layout(measuredWidth4 - dialogActionButton6.getMeasuredWidth(), measuredHeight3, measuredWidth4, measuredHeight4);
                                    return;
                                }
                                C6888i.m12446m("actionButtons");
                                throw null;
                            }
                        } else {
                            C6888i.m12446m("actionButtons");
                            throw null;
                        }
                    } else {
                        C6888i.m12446m("actionButtons");
                        throw null;
                    }
                }
            } else {
                C6888i.m12446m("checkBoxPrompt");
                throw null;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        if (!C0826c.m416g(this)) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        AppCompatCheckBox appCompatCheckBox = this.f10663q;
        if (appCompatCheckBox != null) {
            if (C0826c.m415f(appCompatCheckBox)) {
                int i3 = size - (this.f10660n * 2);
                AppCompatCheckBox appCompatCheckBox2 = this.f10663q;
                if (appCompatCheckBox2 == null) {
                    C6888i.m12446m("checkBoxPrompt");
                    throw null;
                }
                appCompatCheckBox2.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            getDialog();
            throw null;
        }
        C6888i.m12446m("checkBoxPrompt");
        throw null;
    }

    public final void setActionButtons(DialogActionButton[] dialogActionButtonArr) {
        C6888i.m12439f(dialogActionButtonArr, "<set-?>");
        this.f10662p = dialogActionButtonArr;
    }

    public final void setCheckBoxPrompt(AppCompatCheckBox appCompatCheckBox) {
        C6888i.m12439f(appCompatCheckBox, "<set-?>");
        this.f10663q = appCompatCheckBox;
    }

    public final void setStackButtons$core(boolean z) {
        this.f10661o = z;
    }
}
