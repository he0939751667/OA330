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
		// ����i�J�y�{���A�ݳB�z��,�|���楻�q�{��
		//�i�ΥH�H�oEmail�q�������P��Ʈw�L�������~
		//�p�G�n���ʸ�Ʈw�A��ĳ��b�y�{�w�B�z�{�Ǥ��A�� addToTransaction(sql); �H�T�O��Ʈw���ʤ@�P.
		flowService = new OA330FlowService(this);
		String state = getState().trim();
		talk t = getTalk();
		Init init = new Init();
		// ���o�ثe�`�I�i�Hñ�֪��H
		Vector vid = getEngagedPeople();
		if (vid.size() == 0) return;
		// ���o�����
		String DEP_NAME = getValue("DEP_NAME");
		String query[] = init.query_field();
		for(int i=0;i<query.length;i++){
			query[i] = getValue(query[i]);
		}
		Vector V2 = getmail(t, vid);
		// �C�Ӭy�{���d��email�q���榡
		if (state.trim().equals("�|�p�D��")) {
			String title = flowService.getMailSubject(query[2], getName(query[2]));
			String content = "" + "�жi�J�t��(" + Mail.getOaSystemUrl() + ") ñ��"
					+ "\r\n";
			content += "��        ���G" + query[0].trim() + "\r\n";
			content += "�ӽФ���G" + query[1].trim() + "\r\n";
			content += "���u�s���G" + query[2].trim() + "\r\n";
			content += "�m�@�@�W�G" + getName(query[2]).trim() + "\r\n";
			content += "���@�@���G" + DEP_NAME.trim() + "\r\n";
			content += "���������G" + query[3].trim() + "\r\n";
			content += "�ݨD����G" + query[4].trim() + "\r\n";
			content += "ñ�ַN���G" + getMemo() + "\r\n";
			sendmail(V2, flowService, title, content);
		} 
		return;
	}
	public String getInformation(){
		return "---------------\u5f85\u8655\u7406.Notify()----------------";
	}
}