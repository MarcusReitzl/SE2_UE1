package marcusreitzl.checkpalindrom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void conditions (View irgendwas) {
        TextView invalid = (TextView) findViewById(R.id.Output);
        EditText et = (EditText) findViewById(R.id.Input);
        String input = et.getText().toString();
        if (input.length()<5){
            invalid.setText("invalid input");
        }else {
            isPalindrome(input);
            if (isPalindrome(input) == true) {
                invalid.setText("CheckPalindrom OK");
            } else {
                invalid.setText("CheckPalindrom failed ");
            }
        }
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
