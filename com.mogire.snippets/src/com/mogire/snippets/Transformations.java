package com.mogire.snippets;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transformations {
String transformData(final Object[] data, final String pattern) {
	Date date = (Date) data[0];
	int percentage = (Integer) data[1];
	StringBuilder resultline = new StringBuilder("[");
	resultline.append(new SimpleDateFormat(pattern).format(date));
	resultline.append("',");
	resultline.append(percentage);
	resultline.append("%");
	return resultline.toString();
	
}
}
