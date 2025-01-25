package com.info.trello.genericutility;

import java.time.LocalDateTime;

public class JavaUtility {
/**
 * This method will help to Capture the Current Date And Time of the Machine .
 * @author denis
 * @return timeStamp
 */
	public String timeStamp() {
		String timeStamp=LocalDateTime.now().toString().replace(':', '-');
		return timeStamp;
	}
}
