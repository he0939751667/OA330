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
		// �^�ǭȬ� true ��ܰ��汵�U�Ӫ��y�{�B�z
		// �^�ǭȬ� false ��ܱ��U�Ӥ��������y�{�B�z
		// �ǤJ�� value �� "�֭�"
		talk t = getTalk();
		flowService = new OA330FlowService(this);
		Init init = new Init();
		//�e�Xmail
		String DEP_NAME = getValue("DEP_NAME");
		String query[] = init.query_field();
		for(int i=0;i<query.length;i++){
			query[i] = getValue(query[i]);
		}
		String[][] get_tot_user = getFlowHistory();
		String title = flowService.getMailSubject(query[2], getName(query[2]));
		String content = "�|�p��عq�l�y�{��浲�׳q��"
				+ "\r\n";
		content += "��        ���G" + query[0].trim() + "\r\n";
		content += "�ӽФ���G" + query[1].trim() + "\r\n";
		content += "���u�s���G" + query[2].trim() + "\r\n";
		content += "�m�@�@�W�G" + getName(query[2]).trim() + "\r\n";
		content += "���@�@���G" + DEP_NAME.trim() + "\r\n";
		content += "���������G" + query[3].trim() + "\r\n";
		content += "�ݨD����G" + query[4].trim() + "\r\n";
		content += "ñ�ַN���G" + getMemo() + "\r\n";
		sendallmail(t, get_tot_user, title, content, flowService);
		return true;
	}
	public String getInformation(){
		return "---------------\u6838\u51c6.preProcess()----------------";
	}
}