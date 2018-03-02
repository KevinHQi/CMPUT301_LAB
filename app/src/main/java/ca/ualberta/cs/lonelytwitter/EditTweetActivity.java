package ca.ualberta.cs.lonelytwitter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by kq on 3/2/2018.
 */

public class EditTweetActivity extends LonelyTwitterActivity{
    private String theText;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit);

        Bundle comingText = getIntent().getExtras();
        String toBeEdit = comingText != null ? comingText.getString("toBeEdit") : null;
        TextView title = (TextView) findViewById(R.id.editText);
        title.setText(toBeEdit);
    }
}
