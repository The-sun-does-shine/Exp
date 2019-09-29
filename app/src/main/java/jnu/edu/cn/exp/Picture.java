package jnu.edu.cn.exp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Picture extends AppCompatActivity {
private Button button1;
private Button button2;
private ImageView image;
private int indext=0;
private int[] imgs={
        R.drawable.a0,
        R.drawable.a1,
        R.drawable.a2
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);
        button1=(Button)findViewById(R.id.btn_1);
        button2=(Button)findViewById(R.id.btn_2);
        button1.setOnClickListener(new Mclick());
        button2.setOnClickListener(new Mclick());
        image=(ImageView)findViewById(R.id.imageView);
    }

    private class Mclick implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if(view==button1)
            {
                if(indext==1)
                {
                   indext=imgs.length;
                   image.setImageResource(imgs[indext]);
                }
                else
                {
                   indext--;
                   image.setImageResource(imgs[indext]);
                }
            }
            else {
                if (indext == imgs.length) {
                    indext = 1;
                    image.setImageResource(imgs[indext]);
                } else {
                    indext++;
                    image.setImageResource(imgs[indext]);
                }
            }
        }
    }
}
