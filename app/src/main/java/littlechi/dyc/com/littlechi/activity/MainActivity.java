package littlechi.dyc.com.littlechi.activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import littlechi.dyc.com.littlechi.R;
import littlechi.dyc.com.littlechi.fragment.FragmentManager;
import littlechi.dyc.com.littlechi.fragment.MainFragment;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager.setMainFragmentWithStrName(this, MainFragment.class.getName(),R.id.fragmentlayout);

    }

}
