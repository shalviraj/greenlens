package p005b.p006a.p007a.p018i;

import android.app.DatePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.DatePicker;
import java.util.Calendar;
import java.util.Date;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.i.s */
public final class C0761s implements View.OnClickListener {

    /* renamed from: g */
    public final /* synthetic */ Context f490g;

    /* renamed from: h */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f491h;

    /* renamed from: i */
    public final /* synthetic */ Calendar f492i;

    /* renamed from: j */
    public final /* synthetic */ Date f493j;

    public C0761s(Context context, DatePickerDialog.OnDateSetListener onDateSetListener, Calendar calendar, Date date) {
        this.f490g = context;
        this.f491h = onDateSetListener;
        this.f492i = calendar;
        this.f493j = date;
    }

    public final void onClick(View view) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this.f490g, this.f491h, this.f492i.get(1), this.f492i.get(2), this.f492i.get(5));
        Date date = this.f493j;
        if (date != null) {
            long longValue = Long.valueOf(date.getTime()).longValue();
            DatePicker datePicker = datePickerDialog.getDatePicker();
            C6888i.m12437d(datePicker, "datePicker");
            datePicker.setMaxDate(longValue);
        }
        datePickerDialog.show();
    }
}
