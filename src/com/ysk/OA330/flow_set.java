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
		// �i�۩wHTML�����U��쪺�w�]�ȻP���s���ʧ@
		// �ǤJ�� value
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
			if (state.equals("�ݳB�z")) {
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