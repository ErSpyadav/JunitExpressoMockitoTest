package demo.pushnotification.junittestappjan2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity implements View.OnClickListener {

    // The TextView used to display the message inside the Activity.
    private TextView mTextView;

    // The EditText where the user types the message.
    private EditText mEditText;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the listeners for the buttons.
        findViewById(R.id.changeTextBt).setOnClickListener(this);
        findViewById(R.id.activityChangeTextBtn).setOnClickListener(this);

        mTextView = (TextView) findViewById(R.id.textToBeChanged);
        mEditText = (EditText) findViewById(R.id.editTextUserInput);
        recyclerView =(RecyclerView)findViewById(R.id.rvAnimals);
        List list = Arrays.asList("Lion","Tiger","Cat","Elephant");
        MyRecyclerViewAdapter adapter =new MyRecyclerViewAdapter(this,list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        // Get the text from the EditText view.
        final String text = mEditText.getText().toString();

        final int changeTextBtId = R.id.changeTextBt;
        final int activityChangeTextBtnId = R.id.activityChangeTextBtn;

        if (view.getId() == changeTextBtId) {
            // First button's interaction: set a text in a text view.
            mTextView.setText(text);
        } else if (view.getId() == activityChangeTextBtnId) {
            // Second button's interaction: start an activity and send a message to it.
            Intent intent = ShowTextActivity
                    .newStartIntent(this, text);
            startActivity(intent);
        }
    }

    public String getName(){
        return "Sarayu Yadav";
    }
}
