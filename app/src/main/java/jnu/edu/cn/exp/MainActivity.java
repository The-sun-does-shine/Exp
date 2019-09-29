package jnu.edu.cn.exp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button button1;
private Button button2;
private EditText edit1;
private TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button_1);
        button2=(Button)findViewById(R.id.button_2);
        edit1=(EditText)findViewById(R.id.put_in_edit_text);
        text1=(TextView)findViewById(R.id.text_view);
        button1.setOnClickListener(new mclick());
    }

    private class mclick implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String txt;
            txt=edit1.getText().toString();
            text1.setText(txt);
        }
    }
}
