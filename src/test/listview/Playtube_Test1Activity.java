package test.listview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class Playtube_Test1Activity extends ListActivity {
	
	// list
	private List<String> sampleList = new ArrayList<String>();
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // clear the list
        sampleList.clear();
		
        for (int i = 0; i < 5; i++) {
			sampleList.add("item=" + i);
		}//for (int i = 0; i < array.length; i++)
        
        // Define adapter
        ArrayAdapter<String> adpviewList = new ArrayAdapter<String>(
        		this,
        		R.layout.col,
        		sampleList);
        
        // set adapter
        this.setListAdapter(adpviewList);
        
        // toast
		Toast.makeText(this, "cleared", Toast.LENGTH_SHORT).show();
        
    }//public void onCreate(Bundle savedInstanceState)
}