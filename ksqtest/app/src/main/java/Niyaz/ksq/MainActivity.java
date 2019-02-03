package Niyaz.ksq;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class MainActivity extends Activity implements OnClickListener
{

	


	

	
		EditText EditText_ksq1;
		EditText EditText_ksq2;
		EditText EditText_ksq3;

		Button MainButtonHesabla;

		TextView Textnetice; 
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    	// elementleri daxil edirik
	
		EditText_ksq1 = (EditText) findViewById(R.id.EditText_ksq1);
		EditText_ksq2 = (EditText) findViewById(R.id.EditText_ksq2);
		EditText_ksq3 = (EditText) findViewById(R.id.EditText_ksq3);
		
		MainButtonHesabla = (Button) findViewById(R.id.mainButtonHesabla);
	
		Textnetice = (TextView) findViewById(R.id.Textnetice);
		//Obrabotcik
		
		MainButtonHesabla.setOnClickListener(this); 
	}

	@Override
	public void onClick(View v)
	{
		// TODO: Implement this method
		float ksq1 =0; 
		float ksq2 =0;
		float ksq3 =0;
		float netice=0;
		
		ksq1 = Float.parseFloat(EditText_ksq1.getText().toString());
		ksq2 = Float.parseFloat(EditText_ksq2.getText().toString());
		ksq3 = Float.parseFloat(EditText_ksq3.getText().toString()); 
	
		switch(v.getId()) 
		{
			case R.id.mainButtonHesabla:
				netice=(ksq1+ksq2+ksq3)/3;
				break;
				default:
				break; 
		}
		
	
	
		Textnetice.setText(netice);
		
		
	
		
	}


	
	
	


	
}
