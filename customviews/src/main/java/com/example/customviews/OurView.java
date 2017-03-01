package com.example.customviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by Ajinkya Virkud on 3/1/2017.
 */

public class OurView extends EditText {

    private Paint paint;

    public OurView(Context context) {
        super(context);

        initPaint();
    }

    public OurView(Context context, AttributeSet attrs){

        super(context,attrs);
        initPaint();

    }

    private void initPaint() {
        paint = new Paint();
        paint.setColor(Color.GREEN);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //canvas.drawCircle(100,70,50,paint);
        paint.setColor(Color.GREEN);
        for(int i = 5; i < 1000; i+= 30)
        canvas.drawLine(10, i,600, i, paint);

        paint.setColor(Color.RED);
        canvas.drawLine(80, 10, 80, 1000, paint);
    }
}
