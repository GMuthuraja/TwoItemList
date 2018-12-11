package app.example.app.twoitemlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private String[][] StatesAndCapitals = {
          {"Alabama","Montgomery"},
          {"Alaska","Juneau"},
          {"Arizona","Phoenix"},
          {"Arkansas","Little Rock"},
          {"California","Sacramento"},
          {"Colorado","Denver"},
          {"Connecticut","Hartford"},
          {"Delaware","Dover"},
          {"Florida","Tallahassee"},
          {"Georgia","Atlanta"},
          {"Hawaii","Honolulu"},
          {"Idaho","Boise"},
          {"Illinois","Springfield"},
          {"Indiana","Indianapolis"},
          {"Iowa","Des Moines"},
          {"Kansas","Topeka"},
          {"Kentucky","Frankfort"},
          {"Louisiana","Baton Rouge"},
          {"Maine","Augusta"}
    };

    ListView list;
    ArrayList<HashMap<String,String>> arr_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.listView);

        arr_list = new ArrayList<HashMap<String,String>>();
        HashMap<String,String> item;

        for(int i=0;i<StatesAndCapitals.length;i++){
            item = new HashMap<String,String>();
            item.put("line1", StatesAndCapitals[i][0]);
            item.put("line2", StatesAndCapitals[i][1]);
            arr_list.add(item);
        }

        Log.i("Data>>>>>>", arr_list.toString());

        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this,arr_list, R.layout.two_lines, new String[]{"line1", "line2"}, new int[]{R.id.textView1, R.id.textView2});
        list.setAdapter(adapter);
    }
}
