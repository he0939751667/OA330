package com.ysk.OA330;

import java.io.*;
import java.util.*;

import setFuntion._hproc;
import jcx.util.*;
import jcx.html.*;
import jcx.db.*;

public class check_EMP extends _hproc{
	public String action(String value)throws Throwable{
		talk t = getTalk();
		String EMPID = getValue("EMPID");
		user_info_view(EMPID);
		return value;
	}
	public String getInformation(){
		return "---------------UNDERTAKER_EMP_ID(\u627f\u8fa6\u4eba\uff1a).html_action()----------------";
	}
}