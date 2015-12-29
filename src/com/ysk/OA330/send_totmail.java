package com.ysk.OA330;
import jcx.jform.bProcFlow;

import java.io.*;
import java.util.*;
import setFuntion._bProcFlow;
import jcx.util.*;
import jcx.html.*;
import jcx.db.*;

public class send_totmail extends _bProcFlow{
	OA330FlowService flowService;
	public boolean action(String value)throws Throwable{
		// 回傳值為 true 表示執行接下來的流程處理
		// 回傳值為 false 表示接下來不執行任何流程處理
		// 傳入值 value 為 "核准"
		talk t = getTalk();
		flowService = new OA330FlowService(this);
		Init init = new Init();
		//送出mail
		String DEP_NAME = getValue("DEP_NAME");
		String query[] = init.query_field();
		for(int i=0;i<query.length;i++){
			query[i] = getValue(query[i]);
		}
		String[][] get_tot_user = getFlowHistory();
		String title = flowService.getMailSubject(query[2], getName(query[2]));
		String content = "會計科目電子流程表單結案通知"
				+ "\r\n";
		content += "單        號：" + query[0].trim() + "\r\n";
		content += "申請日期：" + query[1].trim() + "\r\n";
		content += "員工編號：" + query[2].trim() + "\r\n";
		content += "姓　　名：" + getName(query[2]).trim() + "\r\n";
		content += "部　　門：" + DEP_NAME.trim() + "\r\n";
		content += "異動類型：" + query[3].trim() + "\r\n";
		content += "需求日期：" + query[4].trim() + "\r\n";
		content += "簽核意見：" + getMemo() + "\r\n";
		sendallmail(t, get_tot_user, title, content, flowService);
		return true;
	}
	public String getInformation(){
		return "---------------\u6838\u51c6.preProcess()----------------";
	}
}