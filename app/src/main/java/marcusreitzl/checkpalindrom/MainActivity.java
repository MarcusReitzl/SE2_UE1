package marcusreitzl.checkpalindrom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void conditions (View irgendwas) {
        TextView notok = (TextView) findViewById(R.id.Output);
        EditText et = (EditText) findViewById(R.id.Input);
        String input = et.getText().toString();
        if (input.length()<5){
            et.setText("CheckPalidrom failed");
        }else
            isPalindrome(input);
    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
