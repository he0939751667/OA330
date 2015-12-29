package com.ysk.OA330;

import jcx.jform.hproc;

import java.io.*;
import java.util.*;

import setFuntion._hproc;
import jcx.util.*;
import jcx.html.*;
import jcx.db.*;

public class REPLY extends _hproc {
	String tablename = "ECACCOUNT";

	public String action(String value) throws Throwable {
		// 可自定HTML版本各欄位的預設值與按鈕的動作
		// 傳入值 value
		String PNO = getValue("PNO");
		if (getName().equals("button3")) {
			String field_data = "待處理";
			update_flow(tablename, field_data, PNO);
		}else if (getName().equals("button4")){
			String field_data = "會計主管";
			update_flow(tablename, field_data, PNO);
		}else if (getName().equals("button5")){
			String field_data = "資訊主管";
			update_flow(tablename, field_data, PNO);
		}else if (getName().equals("button6")){
			String field_data = "資訊經辦";
			update_flow(tablename, field_data, PNO);
		}
		return value;
	}

	public String getInformation() {
		return "---------------button3(\u5feb\u901f\u56de\u5fa9\u6d41\u7a0b\u6309\u9215).html_action()----------------";
	}
}