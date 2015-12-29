package com.ysk.OA330;

import jcx.jform.bProcFlow;

import java.io.*;
import java.util.*;

import setFuntion._bProcFlow;
import jcx.util.*;
import jcx.html.*;
import jcx.db.*;

public class update_process extends _bProcFlow {
	String tablename = "ECACCOUNT";

	public boolean action(String value) throws Throwable {
		// 回傳值為 true 表示執行接下來的流程處理
		// 回傳值為 false 表示接下來不執行任何流程處理
		// 傳入值 value 為 "修改"
		Init init = new Init();
		String PNO = getValue("PNO");
		String field[] = init.wait_process();
		String field_data[] = new String[field.length];
		for (int i = 0; i < field_data.length; i++) {
			field_data[i] = getValue(field[i]);
		}
		int no = showConfirmDialog("確定修改嗎?");
		boolean sure = true;
		if (no == 0) {
			UPDATE_PROCESS(tablename, field, field_data, PNO);
		}else{
			message("取消!!");
			sure = false;
		}
		return sure;
	}

	public String getInformation() {
		return "---------------\u4fee\u6539.preProcess()----------------";
	}
}
