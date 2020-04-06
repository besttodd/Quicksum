package au.edu.jcu.cp3406.wk3quicksum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int sum = 0;
    int questions = 0;

    public void buttonClicked(View view) {
        Button button = (Button) view;

        int number = Integer.parseInt(button.getText().toString());
        sum += number;
        questions += 1;

        TextView textView = findViewById(R.id.sum);
        TextView textView1 = findViewById(R.id.numQuestions);
        String result = "" + sum;
        String numQuestions = "Questions" + '\n' + questions;
        textView.setText(result);
        textView1.setText(numQuestions);
    }

    public void clearButton(View view) {
        TextView textView = findViewById(R.id.sum);
        textView.setText("");
        TextView textView1 = findViewById(R.id.numQuestions);
        textView1.setText("");
        sum = 0;
        questions = 0;
    }
}
