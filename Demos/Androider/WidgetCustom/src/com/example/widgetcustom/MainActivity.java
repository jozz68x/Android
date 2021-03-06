package com.example.widgetcustom;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends Activity {

	MyWidgetView myWidget_01, myWidget_02, myWidget_03;

	/** Called when the activity is first created. */

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		myWidget_01 = (MyWidgetView) findViewById(R.id.mywidget_01);

		myWidget_02 = (MyWidgetView) findViewById(R.id.mywidget_02);

		myWidget_03 = (MyWidgetView) findViewById(R.id.mywidget_03);

		myWidget_02.setColor(Color.RED);

		myWidget_03.setBackgroundColor(Color.GREEN);

		myWidget_03.setColor(Color.BLUE);

	}

}
