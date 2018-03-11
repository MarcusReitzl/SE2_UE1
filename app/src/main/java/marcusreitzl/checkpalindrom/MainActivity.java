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
        String entry = et.getText().toString();
        if (entry.length()<5){
            invalid.setText("invalid entry");
        }else {
            if (isPalindrome(entry) == true) {
                invalid.setText("CheckPalindrom PalindromOK");
            } else {
                invalid.setText("CheckPalindrom noPalindrom ");
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
