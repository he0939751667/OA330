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
		// �^�ǭȬ� true ��ܰ��汵�U�Ӫ��y�{�B�z
		// �^�ǭȬ� false ��ܱ��U�Ӥ��������y�{�B�z
		// �ǤJ�� value �� "�R��"
		String PNO = getValue("PNO");
		int no = showConfirmDialog("�T�w�R��?");
		boolean sure = true;
		if(no == 0){
			deleteData(tablename, PNO);
		}else{
			message("����!!");
			sure = false;
		}
		return sure;
	}
	public String getInformation(){
		return "---------------\u522a\u9664.preProcess()----------------";
	}
}