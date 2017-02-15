package com.example.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by lenovo on 2/15/2017.
 */

public class CodeKul extends EditText {
    private Paint paint;
    public CodeKul(Context context) {
        super(context);
    }

    public CodeKul(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setColor(Color.BLUE);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(20,20,20,paint);
    }
}