package com.ysk.OA330;

import jcx.jform.hproc;

import java.io.*;
import java.util.*;

import setFuntion._hproc;
import jcx.util.*;
import jcx.html.*;
import jcx.db.*;

public class flow_set extends _hproc {
	public String action(String value) throws Throwable {
		// 可自定HTML版本各欄位的預設值與按鈕的動作
		// 傳入值 value
		try {
			if(POSITION!=5){
				setNewView("queryPage");
				String MUSER = getUser();
				user_info_view(MUSER);
				String today = getToday("YYYYmmdd");
				setValue("SDATE",today);
				setValue("EDATE",today);
			}
//			setEditable("button3", true);
//			setEditable("button4", true);
//			setEditable("button5", true);
//			setEditable("button6", true);
			String state = getState().trim();
			Init init = new Init();
			String EMPID = getValue("EMPID");
			user_info_view(EMPID);
			if (state.equals("待處理")) {
				String field[] = init.wait_process();
				for (int i = 0; i < field.length; i++) {
					setEditable(field[i], true);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public String getInformation() {
		return "---------------text3(FORM_STATUS).html_action()----------------";
	}
}