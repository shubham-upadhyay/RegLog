package in.blogspot.shiftcodes.reglog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        textView = (TextView) findViewById(R.id.tvwelcome);

        Intent intent = getIntent();

        textView.setText("Welcome To Goa Singham " + intent.getStringExtra(Login.KEY_USERNAME));
    }

    public void letsout(View view) {
        startActivity(new Intent(this, Login.class));
        finish();
    }
}
