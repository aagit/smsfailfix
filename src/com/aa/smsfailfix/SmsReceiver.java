/*
 *  Copyright (C) 2012  Andrea Arcangeli
 *
 *  This work is licensed under the terms of the GNU GPL, version 2. See
 *  the COPYING file in the top-level directory.
 */

package com.aa.smsfailfix;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

public class SmsReceiver extends BroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {
		SystemClock.sleep(2000);
		SmsFixup.smsFixup(context);
	}
}
