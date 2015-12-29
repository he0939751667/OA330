package com.ysk.OA330;
import jcx.jform.bRule;

import java.io.*;
import java.util.*;

import setFuntion._bRule;
import jcx.util.*;
import jcx.html.*;
import jcx.db.*;

public class ECACCOUNT_RULE extends _bRule{
	public Vector getIDs(String value)throws Throwable{
		// 回傳值為 Vector contails 符合這條規格的帳號
		// value 為 "QA會計科目電子流程"
		talk t = getTalk();
		String PNO = getData("PNO");
		String EMPID = getData("EMPID");
		String state = getState().trim();
		Vector id=new Vector();
		if(state.equals("待處理")){
			String sql = "select EMPID from ECACCOUNT where PNO='"+PNO+"'";
			String ret[][] = t.queryFromPool(sql);
			for(int i=0;i<ret.length;i++){
				if(ret[i][0].length()!=0){
					id.addElement(ret[i][0]);
				}else{
					id.addElement("admin");
				}
			}
		}else if(state.equals("會計主管")){
			String DEPT = "100149";
			String ACcheif[][] = getHRUSERDEPTid(t, DEPT);
			for(int i=0;i<ACcheif.length;i++){
				if(ACcheif[i][0].length()!=0){
					id.addElement(ACcheif[i][0]);
				}else{
					id.addElement("admin");
				}
			}
		}else if(state.equals("資訊主管")){
			String DEPT = "100151";
			String ITcheif[][] = getHRUSERDEPTid(t, DEPT);
			for(int i=0;i<ITcheif.length;i++){
				if(ITcheif[i][0].length()!=0){
					id.addElement(ITcheif[i][0]);
				}else{
					id.addElement("admin");
				}
			}
		}else if(state.equals("資訊經辦")){
			String DEPT = "100150";
			String ITUSER[][] = getHRUSERDEPTid(t, DEPT);
			for(int i=0;i<ITUSER.length;i++){
				if(ITUSER[i][0].length()!=0){
					id.addElement(ITUSER[i][0]);
				}else{
					id.addElement("admin");
				}
			}
		}
		return id;
	}
	public String getInformation(){
		return "---------------QA\u6703\u8a08\u79d1\u76ee\u96fb\u5b50\u6d41\u7a0b.Rule()----------------";
	}
}