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
		// �i�۩wHTML�����U��쪺�w�]�ȻP���s���ʧ@
		// �ǤJ�� value
		flowService = new OA330FlowService(this);
		talk t = getTalk();
		Init init = new Init();
		//��g�g�J��Ʈw�����
		String[] field = init.tot_field();
		//���o�U��쪺��
		String[] field_data = new String[field.length-1];
		for(int i=1;i<field_data.length;i++){
			field_data[i-1] = getValue(field[i]);
		}
		//��g�n���������
		String[] forget_data = init.forget_field();
		for(int i=0;i<forget_data.length;i++){
			forget_data[i] = getValue(forget_data[i]);
		}
		String[] forget_data_name = init.forget_title();
		// �w��forget�A������줣�o����
		Boolean forget = forget_field(forget_data,forget_data_name);
		if(forget==false) return value;
		// �s�W�ܸ�Ʈw
		String chief = "�|�p�D��";
		add_data(tablename,field,field_data,chief);
		//email���e
		String DEP_NAME = getValue("DEP_NAME");
		String query[] = init.query_field();
		for(int i=0;i<query.length;i++){
			query[i] = getValue(query[i]);
		}
		String content = "" + "�жi�J�t��(" + Mail.getOaSystemUrl() + ") ñ��"
				+ "\r\n";
		content += "��        ���G" + query[0].trim() + "\r\n";
		content += "�ӽФ���G" + query[1].trim() + "\r\n";
		content += "���u�s���G" + query[2].trim() + "\r\n";
		content += "�m�@�@�W�G" + getName(query[2]).trim() + "\r\n";
		content += "���@�@���G" + DEP_NAME.trim() + "\r\n";
		content += "���������G" + query[3].trim() + "\r\n";
		content += "�ݨD����G" + query[4].trim() + "\r\n";
		sendMail(t,query[2],flowService,content);
		//��g�n�M�Ū����
		String clear_field[] = init.clear_field();
		Clear_field(t, clear_field);
		//�]�w���_
		String no_field[] = init.setNo_field();
		for(int i=0;i<no_field.length;i++){
			setValue(no_field[i],"�_");
		}
		Process_PNO(t,tablename);
		return value;
	}

	public String getInformation() {
		return "---------------button1(\u63d0\u4ea4\u7533\u8acb).html_action()----------------";
	}
}
