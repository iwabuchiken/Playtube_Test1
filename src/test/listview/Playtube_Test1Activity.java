package test.listview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;

public class Playtube_Test1Activity extends ListActivity {
	
	// list
	private List<String> sampleList = new ArrayList<String>();
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
    }//public void onCreate(Bundle savedInstanceState)
}