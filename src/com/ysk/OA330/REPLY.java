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
		// �i�۩wHTML�����U��쪺�w�]�ȻP���s���ʧ@
		// �ǤJ�� value
		String PNO = getValue("PNO");
		if (getName().equals("button3")) {
			String field_data = "�ݳB�z";
			update_flow(tablename, field_data, PNO);
		}else if (getName().equals("button4")){
			String field_data = "�|�p�D��";
			update_flow(tablename, field_data, PNO);
		}else if (getName().equals("button5")){
			String field_data = "��T�D��";
			update_flow(tablename, field_data, PNO);
		}else if (getName().equals("button6")){
			String field_data = "��T�g��";
			update_flow(tablename, field_data, PNO);
		}
		return value;
	}

	public String getInformation() {
		return "---------------button3(\u5feb\u901f\u56de\u5fa9\u6d41\u7a0b\u6309\u9215).html_action()----------------";
	}
}