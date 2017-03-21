package moran19.drawinghomework;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));

    }

    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {

        }
    }

    public class MyView extends View
    {
        public MyView(Context context)
        {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas)
        {
            super.onDraw(canvas);
            int x = getWidth();
            int y = getHeight();
            int radius;
            radius = 100;
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.WHITE);
            canvas.drawPaint(paint);
            paint.setColor(Color.parseColor("#da4747"));

            CustomCircle circle = new CustomCircle("Joe",Color.RED, x, y, radius);
            circle.drawMe(canvas);
        }
    }


}
