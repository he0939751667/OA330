package com.ysk.OA330;
import setFuntion._hproc;
/**
 * 查詢的功能
 * @author B0052
 *
 */

public class query extends _hproc{
	String tablename = "ECACCOUNT"; 
	String projectname = "會計科目電子流程表單";
	@Override
	public String action(String value)throws Throwable{
		// 可自定HTML版本各欄位的預設值與按鈕的動作 
		// 傳入值 value
		Init init = new Init();
		String EMPID = getValue("EMPID");
		String PNO = getValue("PNO");
		String MDATE = getValue("SDATE");
		String MDATE1 = getValue("EDATE");
		
		String field[] = init.query_field();
		String querydata[][] = queryFuntion(tablename,projectname, field,EMPID, PNO, MDATE, MDATE1);
		setTableData("table1", querydata);
		 return value;
	}
	public String getInformation(){
		return "---------------button2(\u67e5\u8a62).html_action()----------------";
	}
}