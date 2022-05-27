package com.chaisys.miniproject.commonutil;

public class ExceptionManager {
	public static String handleException(Exception e,String source,String message) {
		LogManagers.logException(e,source);
		message +="Message: "+e.getMessage();
		String errorPage=HTMLHelper.getHTMLTemplate("ERROR",message);
		return errorPage;
	}
}
