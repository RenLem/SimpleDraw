package omy.boston.simpledraw.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;

/**
 * Created by LosFrancisco on 15-Feb-17.
 */

public class SimpleShape extends View{
    private ShapeDrawable mDrawable;

    public SimpleShape(Context context) {
        super(context);
        setFocusable(true);
        this.mDrawable = new ShapeDrawable(new RectShape());
        this.mDrawable.getPaint().setColor(0xFFFF00FF);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int x = 10;
        int y = 10;
        int height = 50;
        int width = 300;
        this.mDrawable.setBounds(x, y, x + width, y + height);
        this.mDrawable.draw(canvas);
    }
}
