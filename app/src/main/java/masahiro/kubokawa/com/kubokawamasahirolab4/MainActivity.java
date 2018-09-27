package masahiro.kubokawa.com.kubokawamasahirolab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.design.widget.Snackbar;


public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LIFECYCLE", "onCreate() was called");

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Back Button is Clicked", Toast.LENGTH_LONG).show();
            }
        });

        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Next Button is Clicked", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("LIFECYCLE", "onStart() was called");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("LIFECYCLE","onResume() was called");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("LIFECYCLE","onPause() was called");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("LIFECYCLE","onStop() was called");
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d("LIFECYCLE","onRestart() was called");
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("LIFECYCLE","onDestroy() was called");
    }
}
