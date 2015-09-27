package org.hogel.mufgalertblocker;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "block mufg", Toast.LENGTH_SHORT).show();
        finish();
    }
}
