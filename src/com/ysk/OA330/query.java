package com.ysk.OA330;
import setFuntion._hproc;
/**
 * �d�ߪ��\��
 * @author B0052
 *
 */

public class query extends _hproc{
	String tablename = "ECACCOUNT"; 
	String projectname = "�|�p��عq�l�y�{���";
	@Override
	public String action(String value)throws Throwable{
		// �i�۩wHTML�����U��쪺�w�]�ȻP���s���ʧ@ 
		// �ǤJ�� value
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