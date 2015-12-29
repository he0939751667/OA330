package com.ysk.OA330;

import java.io.*;
import java.util.*;
import setFuntion._hproc;
import jcx.util.*;
import jcx.html.*;
import jcx.db.*;

public class form_status extends _hproc{
	public String action(String value)throws Throwable{
		// 可自定HTML版本各欄位的預設值與按鈕的動作 
		// 傳入值 value 
		String USER = getUser();
		setValue("EMPID",USER);
		user_info_view(USER);
		String today = getToday("YYYYmmdd");
		setValue("SDATE",today);
		setValue("EDATE",today);
		 return value;
	}
	public String getInformation(){
		return "---------------text1(FORM_STATUS).html_action()----------------";
	}
}