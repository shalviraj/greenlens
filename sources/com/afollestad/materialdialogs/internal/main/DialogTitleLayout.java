package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.segment.analytics.integrations.BasePayload;
import kotlin.Metadata;
import p005b.p025b.p026a.C0826c;
import p005b.p025b.p026a.p027e.p028a.C0829a;
import p298d.p344x.p346c.C6888i;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u00104\u001a\u000203\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0012\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00188\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\"\u0010,\u001a\u00020%8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010!R\u0016\u00100\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u0010!R\u0016\u00102\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u0010!¨\u00069"}, mo24462d2 = {"Lcom/afollestad/materialdialogs/internal/main/DialogTitleLayout;", "Lb/b/a/e/a/a;", "Ld/r;", "onFinishInflate", "()V", "", "b", "()Z", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/widget/ImageView;", "o", "Landroid/widget/ImageView;", "getIconView$core", "()Landroid/widget/ImageView;", "setIconView$core", "(Landroid/widget/ImageView;)V", "iconView", "n", "I", "iconSize", "m", "iconMargin", "Landroid/widget/TextView;", "p", "Landroid/widget/TextView;", "getTitleView$core", "()Landroid/widget/TextView;", "setTitleView$core", "(Landroid/widget/TextView;)V", "titleView", "l", "frameMarginHorizontal", "j", "frameMarginVertical", "k", "titleMarginBottom", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, mo24463k = 1, mo24464mv = {1, 4, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DialogTitleLayout extends C0829a {

    /* renamed from: j */
    public final int f10685j;

    /* renamed from: k */
    public final int f10686k;

    /* renamed from: l */
    public final int f10687l;

    /* renamed from: m */
    public final int f10688m;

    /* renamed from: n */
    public final int f10689n;

    /* renamed from: o */
    public ImageView f10690o;

    /* renamed from: p */
    public TextView f10691p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogTitleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C6888i.m12439f(context, BasePayload.CONTEXT_KEY);
        C6888i.m12439f(this, "$this$dimenPx");
        Context context2 = getContext();
        C6888i.m12435b(context2, BasePayload.CONTEXT_KEY);
        this.f10685j = context2.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_vertical);
        C6888i.m12439f(this, "$this$dimenPx");
        Context context3 = getContext();
        C6888i.m12435b(context3, BasePayload.CONTEXT_KEY);
        this.f10686k = context3.getResources().getDimensionPixelSize(R.dimen.md_dialog_title_layout_margin_bottom);
        C6888i.m12439f(this, "$this$dimenPx");
        Context context4 = getContext();
        C6888i.m12435b(context4, BasePayload.CONTEXT_KEY);
        this.f10687l = context4.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_horizontal);
        C6888i.m12439f(this, "$this$dimenPx");
        Context context5 = getContext();
        C6888i.m12435b(context5, BasePayload.CONTEXT_KEY);
        this.f10688m = context5.getResources().getDimensionPixelSize(R.dimen.md_icon_margin);
        C6888i.m12439f(this, "$this$dimenPx");
        Context context6 = getContext();
        C6888i.m12435b(context6, BasePayload.CONTEXT_KEY);
        this.f10689n = context6.getResources().getDimensionPixelSize(R.dimen.md_icon_size);
    }

    /* renamed from: b */
    public final boolean mo17345b() {
        ImageView imageView = this.f10690o;
        if (imageView != null) {
            C6888i.m12439f(imageView, "$this$isNotVisible");
            if (!C0826c.m415f(imageView)) {
                TextView textView = this.f10691p;
                if (textView != null) {
                    C6888i.m12439f(textView, "$this$isNotVisible");
                    if (!C0826c.m415f(textView)) {
                        return true;
                    }
                } else {
                    C6888i.m12446m("titleView");
                    throw null;
                }
            }
            return false;
        }
        C6888i.m12446m("iconView");
        throw null;
    }

    public final ImageView getIconView$core() {
        ImageView imageView = this.f10690o;
        if (imageView != null) {
            return imageView;
        }
        C6888i.m12446m("iconView");
        throw null;
    }

    public final TextView getTitleView$core() {
        TextView textView = this.f10691p;
        if (textView != null) {
            return textView;
        }
        C6888i.m12446m("titleView");
        throw null;
    }

    public void onDraw(Canvas canvas) {
        C6888i.m12439f(canvas, "canvas");
        super.onDraw(canvas);
        if (getDrawDivider()) {
            canvas.drawLine(0.0f, ((float) getMeasuredHeight()) - ((float) getDividerHeight()), (float) getMeasuredWidth(), (float) getMeasuredHeight(), mo10651a());
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.md_icon_title);
        C6888i.m12435b(findViewById, "findViewById(R.id.md_icon_title)");
        this.f10690o = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.md_text_title);
        C6888i.m12435b(findViewById2, "findViewById(R.id.md_text_title)");
        this.f10691p = (TextView) findViewById2;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!mo17345b()) {
            int i9 = this.f10685j;
            int measuredHeight = getMeasuredHeight() - this.f10686k;
            int i10 = measuredHeight - ((measuredHeight - i9) / 2);
            TextView textView = this.f10691p;
            if (textView != null) {
                int measuredHeight2 = textView.getMeasuredHeight() / 2;
                int i11 = i10 - measuredHeight2;
                int i12 = measuredHeight2 + i10;
                TextView textView2 = this.f10691p;
                if (textView2 != null) {
                    C6888i.m12439f(textView2, "$this$additionalPaddingForFont");
                    TextPaint paint = textView2.getPaint();
                    C6888i.m12435b(paint, "paint");
                    Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                    float f = fontMetrics.descent - fontMetrics.ascent;
                    int measuredHeight3 = i12 + (f > ((float) textView2.getMeasuredHeight()) ? (int) (f - ((float) textView2.getMeasuredHeight())) : 0);
                    if (C0826c.m413d(this)) {
                        i6 = getMeasuredWidth() - this.f10687l;
                        TextView textView3 = this.f10691p;
                        if (textView3 != null) {
                            i5 = i6 - textView3.getMeasuredWidth();
                        } else {
                            C6888i.m12446m("titleView");
                            throw null;
                        }
                    } else {
                        i5 = this.f10687l;
                        TextView textView4 = this.f10691p;
                        if (textView4 != null) {
                            i6 = textView4.getMeasuredWidth() + i5;
                        } else {
                            C6888i.m12446m("titleView");
                            throw null;
                        }
                    }
                    ImageView imageView = this.f10690o;
                    if (imageView != null) {
                        if (C0826c.m415f(imageView)) {
                            ImageView imageView2 = this.f10690o;
                            if (imageView2 != null) {
                                int measuredHeight4 = imageView2.getMeasuredHeight() / 2;
                                int i13 = i10 - measuredHeight4;
                                int i14 = i10 + measuredHeight4;
                                if (C0826c.m413d(this)) {
                                    ImageView imageView3 = this.f10690o;
                                    if (imageView3 != null) {
                                        i5 = i6 - imageView3.getMeasuredWidth();
                                        i8 = i5 - this.f10688m;
                                        TextView textView5 = this.f10691p;
                                        if (textView5 != null) {
                                            i7 = i8 - textView5.getMeasuredWidth();
                                        } else {
                                            C6888i.m12446m("titleView");
                                            throw null;
                                        }
                                    } else {
                                        C6888i.m12446m("iconView");
                                        throw null;
                                    }
                                } else {
                                    ImageView imageView4 = this.f10690o;
                                    if (imageView4 != null) {
                                        i6 = imageView4.getMeasuredWidth() + i5;
                                        int i15 = this.f10688m + i6;
                                        TextView textView6 = this.f10691p;
                                        if (textView6 != null) {
                                            int measuredWidth = textView6.getMeasuredWidth() + i15;
                                            i7 = i15;
                                            i8 = measuredWidth;
                                        } else {
                                            C6888i.m12446m("titleView");
                                            throw null;
                                        }
                                    } else {
                                        C6888i.m12446m("iconView");
                                        throw null;
                                    }
                                }
                                ImageView imageView5 = this.f10690o;
                                if (imageView5 != null) {
                                    imageView5.layout(i5, i13, i6, i14);
                                    i6 = i8;
                                    i5 = i7;
                                } else {
                                    C6888i.m12446m("iconView");
                                    throw null;
                                }
                            } else {
                                C6888i.m12446m("iconView");
                                throw null;
                            }
                        }
                        TextView textView7 = this.f10691p;
                        if (textView7 != null) {
                            textView7.layout(i5, i11, i6, measuredHeight3);
                        } else {
                            C6888i.m12446m("titleView");
                            throw null;
                        }
                    } else {
                        C6888i.m12446m("iconView");
                        throw null;
                    }
                } else {
                    C6888i.m12446m("titleView");
                    throw null;
                }
            } else {
                C6888i.m12446m("titleView");
                throw null;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3 = 0;
        if (mo17345b()) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int i4 = size - (this.f10687l * 2);
        ImageView imageView = this.f10690o;
        if (imageView != null) {
            if (C0826c.m415f(imageView)) {
                ImageView imageView2 = this.f10690o;
                if (imageView2 != null) {
                    imageView2.measure(View.MeasureSpec.makeMeasureSpec(this.f10689n, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(this.f10689n, BasicMeasure.EXACTLY));
                    ImageView imageView3 = this.f10690o;
                    if (imageView3 != null) {
                        i4 -= imageView3.getMeasuredWidth() + this.f10688m;
                    } else {
                        C6888i.m12446m("iconView");
                        throw null;
                    }
                } else {
                    C6888i.m12446m("iconView");
                    throw null;
                }
            }
            TextView textView = this.f10691p;
            if (textView != null) {
                textView.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                ImageView imageView4 = this.f10690o;
                if (imageView4 != null) {
                    if (C0826c.m415f(imageView4)) {
                        ImageView imageView5 = this.f10690o;
                        if (imageView5 != null) {
                            i3 = imageView5.getMeasuredHeight();
                        } else {
                            C6888i.m12446m("iconView");
                            throw null;
                        }
                    }
                    TextView textView2 = this.f10691p;
                    if (textView2 != null) {
                        int measuredHeight = textView2.getMeasuredHeight();
                        if (i3 < measuredHeight) {
                            i3 = measuredHeight;
                        }
                        setMeasuredDimension(size, i3 + this.f10685j + this.f10686k);
                        return;
                    }
                    C6888i.m12446m("titleView");
                    throw null;
                }
                C6888i.m12446m("iconView");
                throw null;
            }
            C6888i.m12446m("titleView");
            throw null;
        }
        C6888i.m12446m("iconView");
        throw null;
    }

    public final void setIconView$core(ImageView imageView) {
        C6888i.m12439f(imageView, "<set-?>");
        this.f10690o = imageView;
    }

    public final void setTitleView$core(TextView textView) {
        C6888i.m12439f(textView, "<set-?>");
        this.f10691p = textView;
    }
}
