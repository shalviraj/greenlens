package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import com.afollestad.materialdialogs.internal.message.DialogContentLayout;
import com.segment.analytics.integrations.BasePayload;
import kotlin.Metadata;
import p005b.p025b.p026a.C0824a;
import p005b.p025b.p026a.C0825b;
import p005b.p025b.p026a.C0826c;
import p298d.C6774o;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010v\u001a\u00020u\u0012\b\u0010x\u001a\u0004\u0018\u00010w¢\u0006\u0004\by\u0010zJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0011\u0010\u000bJ\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b!\u0010 R\u001c\u0010&\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u0010#R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00106R\"\u00109\u001a\u0002088\u0006@\u0006X.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010F\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER*\u0010O\u001a\u00020G2\u0006\u0010H\u001a\u00020G8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0016\u0010S\u001a\u00020P8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\"\u0010[\u001a\u00020T8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0016\u0010^\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u001c\u0010a\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b_\u0010#\u001a\u0004\b`\u0010%R\"\u0010i\u001a\u00020b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR*\u0010o\u001a\u00020\f2\u0006\u0010H\u001a\u00020\f8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bj\u0010]\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bp\u0010#\u001a\u0004\bq\u0010%\"\u0004\br\u0010s¨\u0006{"}, mo24462d2 = {"Lcom/afollestad/materialdialogs/internal/main/DialogLayout;", "Landroid/widget/FrameLayout;", "", "color", "", "alpha", "Landroid/graphics/Paint;", "c", "(IF)Landroid/graphics/Paint;", "Ld/r;", "onFinishInflate", "()V", "", "showTop", "showBottom", "b", "(ZZ)V", "onAttachedToWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "dispatchDraw", "l", "I", "getFrameMarginVerticalLess$core", "()I", "frameMarginVerticalLess", "Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;", "n", "Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;", "getContentLayout", "()Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;", "setContentLayout", "(Lcom/afollestad/materialdialogs/internal/message/DialogContentLayout;)V", "contentLayout", "r", "windowHeight", "Landroid/graphics/RectF;", "t", "Landroid/graphics/RectF;", "cornerRadiusRect", "j", "Landroid/graphics/Paint;", "debugPaint", "Lb/b/a/b;", "dialog", "Lb/b/a/b;", "getDialog", "()Lb/b/a/b;", "setDialog", "(Lb/b/a/b;)V", "Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;", "o", "Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;", "getButtonsLayout", "()Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;", "setButtonsLayout", "(Lcom/afollestad/materialdialogs/internal/button/DialogActionButtonLayout;)V", "buttonsLayout", "", "value", "i", "[F", "getCornerRadii", "()[F", "setCornerRadii", "([F)V", "cornerRadii", "Landroid/graphics/Path;", "s", "Landroid/graphics/Path;", "cornerRadiusPath", "Lb/b/a/a;", "p", "Lb/b/a/a;", "getLayoutMode", "()Lb/b/a/a;", "setLayoutMode", "(Lb/b/a/a;)V", "layoutMode", "q", "Z", "isButtonsLayoutAChild", "k", "getFrameMarginVertical$core", "frameMarginVertical", "Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;", "m", "Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;", "getTitleLayout", "()Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;", "setTitleLayout", "(Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;)V", "titleLayout", "h", "getDebugMode", "()Z", "setDebugMode", "(Z)V", "debugMode", "g", "getMaxHeight", "setMaxHeight", "(I)V", "maxHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, mo24463k = 1, mo24464mv = {1, 4, 0})
public final class DialogLayout extends FrameLayout {

    /* renamed from: g */
    public int f10669g;

    /* renamed from: h */
    public boolean f10670h;

    /* renamed from: i */
    public float[] f10671i = new float[0];

    /* renamed from: j */
    public Paint f10672j;

    /* renamed from: k */
    public final int f10673k;

    /* renamed from: l */
    public final int f10674l;

    /* renamed from: m */
    public DialogTitleLayout f10675m;

    /* renamed from: n */
    public DialogContentLayout f10676n;

    /* renamed from: o */
    public DialogActionButtonLayout f10677o;

    /* renamed from: p */
    public C0824a f10678p;

    /* renamed from: q */
    public boolean f10679q;

    /* renamed from: r */
    public int f10680r;

    /* renamed from: s */
    public final Path f10681s;

    /* renamed from: t */
    public final RectF f10682t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C6888i.m12439f(context, BasePayload.CONTEXT_KEY);
        C6888i.m12439f(this, "$this$dimenPx");
        Context context2 = getContext();
        C6888i.m12435b(context2, BasePayload.CONTEXT_KEY);
        this.f10673k = context2.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_vertical);
        C6888i.m12439f(this, "$this$dimenPx");
        Context context3 = getContext();
        C6888i.m12435b(context3, BasePayload.CONTEXT_KEY);
        this.f10674l = context3.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_vertical_less);
        this.f10678p = C0824a.WRAP_CONTENT;
        this.f10679q = true;
        this.f10680r = -1;
        this.f10681s = new Path();
        this.f10682t = new RectF();
    }

    /* renamed from: a */
    public static void m10102a(DialogLayout dialogLayout, Canvas canvas, int i, float f, float f2, int i2) {
        if ((i2 & 2) != 0) {
            f = (float) dialogLayout.getMeasuredHeight();
        }
        float f3 = f;
        canvas.drawLine(0.0f, f3, (float) dialogLayout.getMeasuredWidth(), (i2 & 4) != 0 ? f3 : f2, dialogLayout.mo17314c(i, 1.0f));
    }

    /* renamed from: d */
    public static void m10103d(DialogLayout dialogLayout, Canvas canvas, int i, float f, float f2, int i2) {
        canvas.drawLine(f, 0.0f, (i2 & 4) != 0 ? f : f2, (float) dialogLayout.getMeasuredHeight(), dialogLayout.mo17314c(i, 1.0f));
    }

    /* renamed from: b */
    public final void mo17313b(boolean z, boolean z2) {
        DialogTitleLayout dialogTitleLayout = this.f10675m;
        if (dialogTitleLayout != null) {
            dialogTitleLayout.setDrawDivider(z);
            DialogActionButtonLayout dialogActionButtonLayout = this.f10677o;
            if (dialogActionButtonLayout != null) {
                dialogActionButtonLayout.setDrawDivider(z2);
                return;
            }
            return;
        }
        C6888i.m12446m("titleLayout");
        throw null;
    }

    /* renamed from: c */
    public final Paint mo17314c(int i, float f) {
        if (this.f10672j == null) {
            Paint paint = new Paint();
            paint.setStrokeWidth(C0826c.m410a(this, 1));
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            this.f10672j = paint;
        }
        Paint paint2 = this.f10672j;
        if (paint2 != null) {
            paint2.setColor(i);
            setAlpha(f);
            return paint2;
        }
        C6888i.m12445l();
        throw null;
    }

    public void dispatchDraw(Canvas canvas) {
        C6888i.m12439f(canvas, "canvas");
        if (!(this.f10671i.length == 0)) {
            canvas.clipPath(this.f10681s);
        }
        super.dispatchDraw(canvas);
    }

    public final DialogActionButtonLayout getButtonsLayout() {
        return this.f10677o;
    }

    public final DialogContentLayout getContentLayout() {
        DialogContentLayout dialogContentLayout = this.f10676n;
        if (dialogContentLayout != null) {
            return dialogContentLayout;
        }
        C6888i.m12446m("contentLayout");
        throw null;
    }

    public final float[] getCornerRadii() {
        return this.f10671i;
    }

    public final boolean getDebugMode() {
        return this.f10670h;
    }

    public final C0825b getDialog() {
        C6888i.m12446m("dialog");
        throw null;
    }

    public final int getFrameMarginVertical$core() {
        return this.f10673k;
    }

    public final int getFrameMarginVerticalLess$core() {
        return this.f10674l;
    }

    public final C0824a getLayoutMode() {
        return this.f10678p;
    }

    public final int getMaxHeight() {
        return this.f10669g;
    }

    public final DialogTitleLayout getTitleLayout() {
        DialogTitleLayout dialogTitleLayout = this.f10675m;
        if (dialogTitleLayout != null) {
            return dialogTitleLayout;
        }
        C6888i.m12446m("titleLayout");
        throw null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object systemService = getContext().getSystemService("window");
        if (systemService != null) {
            WindowManager windowManager = (WindowManager) systemService;
            C6888i.m12439f(windowManager, "$this$getWidthAndHeight");
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            this.f10680r = Integer.valueOf(point.y).intValue();
            return;
        }
        throw new C6774o("null cannot be cast to non-null type android.view.WindowManager");
    }

    public void onDraw(Canvas canvas) {
        float f;
        int i;
        C6888i.m12439f(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f10670h) {
            Canvas canvas2 = canvas;
            m10103d(this, canvas2, -16776961, C0826c.m410a(this, 24), 0.0f, 4);
            m10102a(this, canvas2, -16776961, C0826c.m410a(this, 24), 0.0f, 4);
            m10103d(this, canvas, -16776961, ((float) getMeasuredWidth()) - C0826c.m410a(this, 24), 0.0f, 4);
            DialogTitleLayout dialogTitleLayout = this.f10675m;
            if (dialogTitleLayout != null) {
                if (C0826c.m415f(dialogTitleLayout)) {
                    DialogTitleLayout dialogTitleLayout2 = this.f10675m;
                    if (dialogTitleLayout2 != null) {
                        m10102a(this, canvas, SupportMenu.CATEGORY_MASK, (float) dialogTitleLayout2.getBottom(), 0.0f, 4);
                    } else {
                        C6888i.m12446m("titleLayout");
                        throw null;
                    }
                }
                DialogContentLayout dialogContentLayout = this.f10676n;
                if (dialogContentLayout != null) {
                    if (C0826c.m415f(dialogContentLayout)) {
                        DialogContentLayout dialogContentLayout2 = this.f10676n;
                        if (dialogContentLayout2 != null) {
                            m10102a(this, canvas, InputDeviceCompat.SOURCE_ANY, (float) dialogContentLayout2.getTop(), 0.0f, 4);
                        } else {
                            C6888i.m12446m("contentLayout");
                            throw null;
                        }
                    }
                    if (C0826c.m416g(this.f10677o)) {
                        int i2 = -16711681;
                        m10103d(this, canvas, -16711681, C0826c.m413d(this) ? C0826c.m410a(this, 8) : ((float) getMeasuredWidth()) - C0826c.m410a(this, 8), 0.0f, 4);
                        DialogActionButtonLayout dialogActionButtonLayout = this.f10677o;
                        float f2 = 0.4f;
                        int i3 = 0;
                        if (dialogActionButtonLayout == null || !dialogActionButtonLayout.getStackButtons$core()) {
                            DialogActionButtonLayout dialogActionButtonLayout2 = this.f10677o;
                            if (dialogActionButtonLayout2 != null) {
                                DialogActionButton[] visibleButtons = dialogActionButtonLayout2.getVisibleButtons();
                                int length = visibleButtons.length;
                                while (i3 < length) {
                                    DialogActionButton dialogActionButton = visibleButtons[i3];
                                    DialogActionButtonLayout dialogActionButtonLayout3 = this.f10677o;
                                    if (dialogActionButtonLayout3 != null) {
                                        float a = C0826c.m410a(this, 8) + ((float) dialogActionButtonLayout3.getTop()) + ((float) dialogActionButton.getTop());
                                        DialogActionButtonLayout dialogActionButtonLayout4 = this.f10677o;
                                        if (dialogActionButtonLayout4 != null) {
                                            canvas.drawRect(C0826c.m410a(this, 4) + ((float) dialogActionButton.getLeft()), a, ((float) dialogActionButton.getRight()) - C0826c.m410a(this, 4), ((float) dialogActionButtonLayout4.getBottom()) - C0826c.m410a(this, 8), mo17314c(-16711681, 0.4f));
                                            i3++;
                                        } else {
                                            C6888i.m12445l();
                                            throw null;
                                        }
                                    } else {
                                        C6888i.m12445l();
                                        throw null;
                                    }
                                }
                                DialogActionButtonLayout dialogActionButtonLayout5 = this.f10677o;
                                if (dialogActionButtonLayout5 != null) {
                                    m10102a(this, canvas, -65281, (float) dialogActionButtonLayout5.getTop(), 0.0f, 4);
                                    float measuredHeight = ((float) getMeasuredHeight()) - (C0826c.m410a(this, 52) - C0826c.m410a(this, 8));
                                    float measuredHeight2 = ((float) getMeasuredHeight()) - C0826c.m410a(this, 8);
                                    Canvas canvas3 = canvas;
                                    m10102a(this, canvas3, SupportMenu.CATEGORY_MASK, measuredHeight, 0.0f, 4);
                                    m10102a(this, canvas3, SupportMenu.CATEGORY_MASK, measuredHeight2, 0.0f, 4);
                                    i = -16776961;
                                    f = measuredHeight - C0826c.m410a(this, 8);
                                } else {
                                    C6888i.m12445l();
                                    throw null;
                                }
                            } else {
                                return;
                            }
                        } else {
                            DialogActionButtonLayout dialogActionButtonLayout6 = this.f10677o;
                            if (dialogActionButtonLayout6 != null) {
                                float a2 = C0826c.m410a(this, 8) + ((float) dialogActionButtonLayout6.getTop());
                                DialogActionButtonLayout dialogActionButtonLayout7 = this.f10677o;
                                if (dialogActionButtonLayout7 != null) {
                                    DialogActionButton[] visibleButtons2 = dialogActionButtonLayout7.getVisibleButtons();
                                    int length2 = visibleButtons2.length;
                                    float f3 = a2;
                                    while (i3 < length2) {
                                        DialogActionButton dialogActionButton2 = visibleButtons2[i3];
                                        float a3 = C0826c.m410a(this, 36) + f3;
                                        canvas.drawRect((float) dialogActionButton2.getLeft(), f3, ((float) getMeasuredWidth()) - C0826c.m410a(this, 8), a3, mo17314c(i2, f2));
                                        f3 = C0826c.m410a(this, 16) + a3;
                                        i3++;
                                        i2 = i2;
                                        f2 = 0.4f;
                                    }
                                    DialogActionButtonLayout dialogActionButtonLayout8 = this.f10677o;
                                    if (dialogActionButtonLayout8 != null) {
                                        m10102a(this, canvas, -16776961, (float) dialogActionButtonLayout8.getTop(), 0.0f, 4);
                                        DialogActionButtonLayout dialogActionButtonLayout9 = this.f10677o;
                                        if (dialogActionButtonLayout9 != null) {
                                            float a4 = C0826c.m410a(this, 8) + ((float) dialogActionButtonLayout9.getTop());
                                            float measuredHeight3 = ((float) getMeasuredHeight()) - C0826c.m410a(this, 8);
                                            i = -65536;
                                            m10102a(this, canvas, SupportMenu.CATEGORY_MASK, a4, 0.0f, 4);
                                            f = measuredHeight3;
                                        } else {
                                            C6888i.m12445l();
                                            throw null;
                                        }
                                    } else {
                                        C6888i.m12445l();
                                        throw null;
                                    }
                                } else {
                                    C6888i.m12445l();
                                    throw null;
                                }
                            } else {
                                C6888i.m12445l();
                                throw null;
                            }
                        }
                        m10102a(this, canvas, i, f, 0.0f, 4);
                        return;
                    }
                    return;
                }
                C6888i.m12446m("contentLayout");
                throw null;
            }
            C6888i.m12446m("titleLayout");
            throw null;
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.md_title_layout);
        C6888i.m12435b(findViewById, "findViewById(R.id.md_title_layout)");
        this.f10675m = (DialogTitleLayout) findViewById;
        View findViewById2 = findViewById(R.id.md_content_layout);
        C6888i.m12435b(findViewById2, "findViewById(R.id.md_content_layout)");
        this.f10676n = (DialogContentLayout) findViewById2;
        this.f10677o = (DialogActionButtonLayout) findViewById(R.id.md_button_layout);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int measuredWidth = getMeasuredWidth();
        DialogTitleLayout dialogTitleLayout = this.f10675m;
        if (dialogTitleLayout != null) {
            int measuredHeight = dialogTitleLayout.getMeasuredHeight();
            DialogTitleLayout dialogTitleLayout2 = this.f10675m;
            if (dialogTitleLayout2 != null) {
                dialogTitleLayout2.layout(0, 0, measuredWidth, measuredHeight);
                if (this.f10679q) {
                    int measuredHeight2 = getMeasuredHeight();
                    DialogActionButtonLayout dialogActionButtonLayout = this.f10677o;
                    i5 = measuredHeight2 - (dialogActionButtonLayout != null ? dialogActionButtonLayout.getMeasuredHeight() : 0);
                    if (C0826c.m416g(this.f10677o)) {
                        int measuredWidth2 = getMeasuredWidth();
                        int measuredHeight3 = getMeasuredHeight();
                        DialogActionButtonLayout dialogActionButtonLayout2 = this.f10677o;
                        if (dialogActionButtonLayout2 != null) {
                            dialogActionButtonLayout2.layout(0, i5, measuredWidth2, measuredHeight3);
                        } else {
                            C6888i.m12445l();
                            throw null;
                        }
                    }
                } else {
                    i5 = getMeasuredHeight();
                }
                int measuredWidth3 = getMeasuredWidth();
                DialogContentLayout dialogContentLayout = this.f10676n;
                if (dialogContentLayout != null) {
                    dialogContentLayout.layout(0, measuredHeight, measuredWidth3, i5);
                } else {
                    C6888i.m12446m("contentLayout");
                    throw null;
                }
            } else {
                C6888i.m12446m("titleLayout");
                throw null;
            }
        } else {
            C6888i.m12446m("titleLayout");
            throw null;
        }
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.f10669g;
        if (1 <= i3 && size2 > i3) {
            size2 = i3;
        }
        DialogTitleLayout dialogTitleLayout = this.f10675m;
        if (dialogTitleLayout != null) {
            boolean z = false;
            dialogTitleLayout.measure(View.MeasureSpec.makeMeasureSpec(size, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(0, 0));
            if (C0826c.m416g(this.f10677o)) {
                DialogActionButtonLayout dialogActionButtonLayout = this.f10677o;
                if (dialogActionButtonLayout != null) {
                    dialogActionButtonLayout.measure(View.MeasureSpec.makeMeasureSpec(size, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(0, 0));
                } else {
                    C6888i.m12445l();
                    throw null;
                }
            }
            DialogTitleLayout dialogTitleLayout2 = this.f10675m;
            if (dialogTitleLayout2 != null) {
                int measuredHeight = dialogTitleLayout2.getMeasuredHeight();
                DialogActionButtonLayout dialogActionButtonLayout2 = this.f10677o;
                int measuredHeight2 = size2 - (measuredHeight + (dialogActionButtonLayout2 != null ? dialogActionButtonLayout2.getMeasuredHeight() : 0));
                DialogContentLayout dialogContentLayout = this.f10676n;
                if (dialogContentLayout != null) {
                    dialogContentLayout.measure(View.MeasureSpec.makeMeasureSpec(size, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(measuredHeight2, Integer.MIN_VALUE));
                    if (this.f10678p == C0824a.WRAP_CONTENT) {
                        DialogTitleLayout dialogTitleLayout3 = this.f10675m;
                        if (dialogTitleLayout3 != null) {
                            int measuredHeight3 = dialogTitleLayout3.getMeasuredHeight();
                            DialogContentLayout dialogContentLayout2 = this.f10676n;
                            if (dialogContentLayout2 != null) {
                                int measuredHeight4 = dialogContentLayout2.getMeasuredHeight() + measuredHeight3;
                                DialogActionButtonLayout dialogActionButtonLayout3 = this.f10677o;
                                setMeasuredDimension(size, measuredHeight4 + (dialogActionButtonLayout3 != null ? dialogActionButtonLayout3.getMeasuredHeight() : 0));
                            } else {
                                C6888i.m12446m("contentLayout");
                                throw null;
                            }
                        } else {
                            C6888i.m12446m("titleLayout");
                            throw null;
                        }
                    } else {
                        setMeasuredDimension(size, this.f10680r);
                    }
                    if (this.f10671i.length == 0) {
                        z = true;
                    }
                    if (!z) {
                        RectF rectF = this.f10682t;
                        rectF.left = 0.0f;
                        rectF.top = 0.0f;
                        rectF.right = (float) getMeasuredWidth();
                        rectF.bottom = (float) getMeasuredHeight();
                        this.f10681s.addRoundRect(this.f10682t, this.f10671i, Path.Direction.CW);
                        return;
                    }
                    return;
                }
                C6888i.m12446m("contentLayout");
                throw null;
            }
            C6888i.m12446m("titleLayout");
            throw null;
        }
        C6888i.m12446m("titleLayout");
        throw null;
    }

    public final void setButtonsLayout(DialogActionButtonLayout dialogActionButtonLayout) {
        this.f10677o = dialogActionButtonLayout;
    }

    public final void setContentLayout(DialogContentLayout dialogContentLayout) {
        C6888i.m12439f(dialogContentLayout, "<set-?>");
        this.f10676n = dialogContentLayout;
    }

    public final void setCornerRadii(float[] fArr) {
        C6888i.m12439f(fArr, "value");
        this.f10671i = fArr;
        if (!this.f10681s.isEmpty()) {
            this.f10681s.reset();
        }
        invalidate();
    }

    public final void setDebugMode(boolean z) {
        this.f10670h = z;
        setWillNotDraw(!z);
    }

    public final void setDialog(C0825b bVar) {
        C6888i.m12439f(bVar, "<set-?>");
    }

    public final void setLayoutMode(C0824a aVar) {
        C6888i.m12439f(aVar, "<set-?>");
        this.f10678p = aVar;
    }

    public final void setMaxHeight(int i) {
        this.f10669g = i;
    }

    public final void setTitleLayout(DialogTitleLayout dialogTitleLayout) {
        C6888i.m12439f(dialogTitleLayout, "<set-?>");
        this.f10675m = dialogTitleLayout;
    }
}
