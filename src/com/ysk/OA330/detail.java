package com.ysk.OA330;
import javax.swing.*;

import setFuntion._bproc;
import setFuntion._hproc;
import jcx.jform.bproc;

import java.io.*;
import java.util.*;

import jcx.util.*;
import jcx.html.*;
import jcx.db.*;

public class detail extends _bproc{
	String tablename = "ECACCOUNT";
	public String getDefaultValue(String value)throws Throwable{
		String table_PNO = getValue("table1.PNO");
		Init init = new Init();
		String[] field = init.tot_field();
		//���oSTABLEREMIND_MOVE�Ҧ�����setValue�Ҧ����
		setDetail(tablename, field, table_PNO);
		return value;
	}
	public String getInformation(){
		return "---------------null(null)..defaultValue()----------------";
	}
}