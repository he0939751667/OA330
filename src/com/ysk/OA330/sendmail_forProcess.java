package com.ysk.OA330;
import jcx.jform.bNotify;

import java.io.*;
import java.util.*;
import com.ysk.field.Mail;

import setFuntion._bNotify;
import jcx.util.*;
import jcx.html.*;
import jcx.db.*;

public class sendmail_forProcess extends _bNotify{
	OA330FlowService flowService;
	public void actionPerformed(String value)throws Throwable{
		// 當表單進入流程狀態待處理時,會執行本段程式
		//可用以寄發Email通知等等與資料庫無關的做業
		//如果要異動資料庫，建議放在流程預處理程序中，用 addToTransaction(sql); 以確保資料庫異動一致.
		flowService = new OA330FlowService(this);
		String state = getState().trim();
		talk t = getTalk();
		Init init = new Init();
		// 取得目前節點可以簽核的人
		Vector vid = getEngagedPeople();
		if (vid.size() == 0) return;
		// 取得欄位資料
		String DEP_NAME = getValue("DEP_NAME");
		String query[] = init.query_field();
		for(int i=0;i<query.length;i++){
			query[i] = getValue(query[i]);
		}
		Vector V2 = getmail(t, vid);
		// 每個流程關卡的email通知格式
		if (state.trim().equals("會計主管")) {
			String title = flowService.getMailSubject(query[2], getName(query[2]));
			String content = "" + "請進入系統(" + Mail.getOaSystemUrl() + ") 簽核"
					+ "\r\n";
			content += "單        號：" + query[0].trim() + "\r\n";
			content += "申請日期：" + query[1].trim() + "\r\n";
			content += "員工編號：" + query[2].trim() + "\r\n";
			content += "姓　　名：" + getName(query[2]).trim() + "\r\n";
			content += "部　　門：" + DEP_NAME.trim() + "\r\n";
			content += "異動類型：" + query[3].trim() + "\r\n";
			content += "需求日期：" + query[4].trim() + "\r\n";
			content += "簽核意見：" + getMemo() + "\r\n";
			sendmail(V2, flowService, title, content);
		} 
		return;
	}
	public String getInformation(){
		return "---------------\u5f85\u8655\u7406.Notify()----------------";
	}
}