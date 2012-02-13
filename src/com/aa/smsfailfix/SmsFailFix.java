/*
 *  Copyright (C) 2012  Andrea Arcangeli
 *
 *  This work is licensed under the terms of the GNU GPL, version 2. See
 *  the COPYING file in the top-level directory.
 */

package com.aa.smsfailfix;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SmsFailFix extends Activity
{
	private TextView recordUpdate;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		int nr;
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		nr = SmsFixup.smsFixup(this);

		recordUpdate = (TextView) findViewById(R.id.record_update);
		if (nr != 0) {
			recordUpdate.setText("Adjusted " + nr + " SMS. " +
					     "Supposedly this is the first " +
					     "time you run this app.");
		} else {
			recordUpdate.setText("No SMS needed adjustment on " +
					     "your device.");
		}
	}
}
