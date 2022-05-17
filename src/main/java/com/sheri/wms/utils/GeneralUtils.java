package com.sheri.wms.utils;

public class GeneralUtils {
	public static boolean isNullOrEmpty(String str)
	{
		if(str==null || str.trim().equals(""))
			return true;
		else
			return false;
	}

}
