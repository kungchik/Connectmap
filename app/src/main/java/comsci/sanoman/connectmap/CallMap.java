package comsci.sanoman.connectmap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CallMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_map);
    }
    public void runCallMap(View view){
        EditText latitude = (EditText) findViewById(R.id.mapLat);
        EditText longtitude = (EditText) findViewById(R.id.mapLat2);
        EditText label = (EditText) findViewById(R.id.mapLabel);

        String mlabel = label.getText().toString().trim();
        String lat = latitude.getText().toString().trim();
        String longs = longtitude.getText().toString().trim();

        Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:13.759754,100.541522(ศูนย์รางน้ำ)");

        Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);
        //mapIntent.setPackage("con.google.android.apps.maps");//ใช้ไม่ได้กับgenimotion ใช้สำหรับมือถือandroid
        startActivity(mapIntent);
    } //runcallmap
}
