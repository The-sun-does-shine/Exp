package jnu.edu.cn.exp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.Gravity.CENTER;

public class Message_Activity extends AppCompatActivity {
private Button btn1;
private Button btn2;
private Button btn3;
private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_);
        btn1=(Button)findViewById(R.id.button1);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        text=(TextView)findViewById(R.id.textView);
        btn1.setOnClickListener(new Nclick());
        btn2.setOnClickListener(new Nclick());
        btn3.setOnClickListener(new Nclick());
    }

    private class Nclick implements View.OnClickListener {

        Toast toast;
        LinearLayout toastView;
        ImageView imageCode;
        @Override
        public void onClick(View view) {
            if(view==btn1)
            {
                Toast.makeText(getApplicationContext(),"默认Toast方式",Toast.LENGTH_SHORT).show();
            }
            else if(view==btn2)
            {
                toast=Toast.makeText(getApplicationContext(),"自定义Toast的位置",Toast.LENGTH_SHORT);
                toast.setGravity(CENTER,0,0);
                toast.show();
            }
            else{

            }
        }
    }
}
