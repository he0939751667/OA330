package com.ysk.OA330;
import jcx.jform.bProcFlow;

import java.io.*;
import java.util.*;

import setFuntion._bProcFlow;
import jcx.util.*;
import jcx.html.*;
import jcx.db.*;

public class delete extends _bProcFlow{
	String tablename = "ECACCOUNT";
	public boolean action(String value)throws Throwable{
		// 回傳值為 true 表示執行接下來的流程處理
		// 回傳值為 false 表示接下來不執行任何流程處理
		// 傳入值 value 為 "刪除"
		String PNO = getValue("PNO");
		int no = showConfirmDialog("確定刪除?");
		boolean sure = true;
		if(no == 0){
			deleteData(tablename, PNO);
		}else{
			message("取消!!");
			sure = false;
		}
		return sure;
	}
	public String getInformation(){
		return "---------------\u522a\u9664.preProcess()----------------";
	}
}