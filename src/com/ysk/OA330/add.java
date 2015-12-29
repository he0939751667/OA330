package com.ysk.OA330;

import java.io.*;
import java.util.*;

import setFuntion._hproc;
import jcx.util.*;
import jcx.html.*;
import jcx.db.*;

//import com.ysk.OA314.OA314FlowService;
import com.ysk.field.Mail;
public class add extends _hproc {
	String tablename = "ECACCOUNT";
	OA330FlowService flowService;
	public String action(String value) throws Throwable {
		// 可自定HTML版本各欄位的預設值與按鈕的動作
		// 傳入值 value
		flowService = new OA330FlowService(this);
		talk t = getTalk();
		Init init = new Init();
		//填寫寫入資料庫的欄位
		String[] field = init.tot_field();
		//取得各欄位的值
		String[] field_data = new String[field.length-1];
		for(int i=1;i<field_data.length;i++){
			field_data[i-1] = getValue(field[i]);
		}
		//填寫要提醒的欄位
		String[] forget_data = init.forget_field();
		for(int i=0;i<forget_data.length;i++){
			forget_data[i] = getValue(forget_data[i]);
		}
		String[] forget_data_name = init.forget_title();
		// 預防forget，提醒欄位不得為空
		Boolean forget = forget_field(forget_data,forget_data_name);
		if(forget==false) return value;
		// 新增至資料庫
		String chief = "會計主管";
		add_data(tablename,field,field_data,chief);
		//email內容
		String DEP_NAME = getValue("DEP_NAME");
		String query[] = init.query_field();
		for(int i=0;i<query.length;i++){
			query[i] = getValue(query[i]);
		}
		String content = "" + "請進入系統(" + Mail.getOaSystemUrl() + ") 簽核"
				+ "\r\n";
		content += "單        號：" + query[0].trim() + "\r\n";
		content += "申請日期：" + query[1].trim() + "\r\n";
		content += "員工編號：" + query[2].trim() + "\r\n";
		content += "姓　　名：" + getName(query[2]).trim() + "\r\n";
		content += "部　　門：" + DEP_NAME.trim() + "\r\n";
		content += "異動類型：" + query[3].trim() + "\r\n";
		content += "需求日期：" + query[4].trim() + "\r\n";
		sendMail(t,query[2],flowService,content);
		//填寫要清空的欄位
		String clear_field[] = init.clear_field();
		Clear_field(t, clear_field);
		//設定為否
		String no_field[] = init.setNo_field();
		for(int i=0;i<no_field.length;i++){
			setValue(no_field[i],"否");
		}
		Process_PNO(t,tablename);
		return value;
	}

	public String getInformation() {
		return "---------------button1(\u63d0\u4ea4\u7533\u8acb).html_action()----------------";
	}
}
