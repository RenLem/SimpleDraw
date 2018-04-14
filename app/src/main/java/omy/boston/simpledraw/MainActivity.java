package omy.boston.simpledraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import omy.boston.simpledraw.views.SimpleShape;

public class MainActivity extends AppCompatActivity {

    /**FRAGMENTS*/
    // Za dodavanje iz .class
    // View rootView = new SimpleShape(getActivity());

    // Za dodavanje .xml
    // View rootView = inflater.inflate(R.layout.fragment_layout, conteiner, false);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new SimpleShape(this));

    }
}
