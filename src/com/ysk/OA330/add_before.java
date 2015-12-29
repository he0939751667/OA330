package com.ysk.OA330;

import java.io.*;
import java.util.*;

import setFuntion._hproc;
import jcx.util.*;
import jcx.html.*;
import jcx.db.*;

public class add_before extends _hproc{
	String tablename = "ECACCOUNT";
	public String action(String value)throws Throwable{
		talk t = getTalk();
		Init init = new Init();
		Process_PNO(t,tablename);
		String today = getToday("YYYYmmdd");
		setValue("APDATE",today);
		String field[] = init.setNo_field();
		for(int i=0;i<field.length;i++){
			setValue(field[i],"§_");
		}
		setValue("CURRACCOUNT","CNY");
		return value;
	}
	public String getInformation(){
		return "---------------button1(\u65b0\u589e).html_action()----------------";
	}
}