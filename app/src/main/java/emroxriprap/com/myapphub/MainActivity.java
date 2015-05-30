package emroxriprap.com.myapphub;

import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{


    private Button spotify,scores,library,buildItBigger,xyzReader,capstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    private void initViews(){

        spotify = (Button)findViewById(R.id.b_spotify_streamer);
        scores = (Button)findViewById(R.id.b_scores_app);
        library = (Button)findViewById(R.id.b_library_app);
        buildItBigger = (Button)findViewById(R.id.b_build_it_bigger);
        xyzReader = (Button)findViewById(R.id.b_xyz_reader);
        capstone = (Button)findViewById(R.id.b_capstone_my_own_app);

        spotify.setOnClickListener(this);
        scores.setOnClickListener(this);
        library.setOnClickListener(this);
        buildItBigger.setOnClickListener(this);
        xyzReader.setOnClickListener(this);
        capstone.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id){

            case R.id.b_spotify_streamer:
                Toast.makeText(getApplicationContext(),"Launch the Spotify Streamer App",Toast.LENGTH_SHORT).show();
                break;
            case R.id.b_scores_app:
                Toast.makeText(getApplicationContext(),"Launch the Scores App",Toast.LENGTH_SHORT).show();
                break;
            case R.id.b_library_app:
                Toast.makeText(getApplicationContext(),"Launch the Library App",Toast.LENGTH_SHORT).show();
                break;
            case R.id.b_build_it_bigger:
                Toast.makeText(getApplicationContext(),"Launch Build It Bigger",Toast.LENGTH_SHORT).show();
                break;
            case R.id.b_xyz_reader:
                Toast.makeText(getApplicationContext(),"Launch the XYZ App",Toast.LENGTH_SHORT).show();
                break;
            case R.id.b_capstone_my_own_app:
                Toast.makeText(getApplicationContext(),"Launch My Awesome App!",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
