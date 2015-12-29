package com.ysk.OA330;

public class Init {
	// �Ҧ����W��
	String PNO = "PNO";
	String APDATE = "APDATE";
	String EMPID = "EMPID";
	String MOVETYPE = "MOVETYPE";
	String DEDATE = "DEDATE";
	String GLACCOUNTNO = "GLACCOUNTNO";
	String GLACCOUNTNO_EX = "GLACCOUNTNO_EX";
	String COMPANYCODE = "COMPANYCODE";
	String ACCOUNTGROUP = "ACCOUNTGROUP";
	String PLSTATEMENT = "PLSTATEMENT";
	String FUNTIONRANGE = "FUNTIONRANGE";
	String BALANCESHEET = "BALANCESHEET";
	String ESSAY = "ESSAY";
	String LONGARTICLE = "LONGARTICLE";
	String CURRACCOUNT = "CURRACCOUNT";
	String TAX = "TAX";
	String ALLOWNOTAX = "ALLOWNOTAX";
	String ADJUSTACCOUNT = "ADJUSTACCOUNT";
	String PENDINGITEM = "PENDINGITEM";
	String DETAILITEM = "DETAILITEM";
	String SORTCODE = "SORTCODE";
	String FIELDGROUP = "FIELDGROUP";
	String ALLOWAUTO = "ALLOWAUTO";
	String ACCOUNTENTER = "ACCOUNTENTER";
	String PROJECTHIER = "PROJECTHIER";
	String REMARK = "REMARK";

	// �Ҧ������D
	String PNO_TITLE = "�渹";
	String APDATE_TITLE = "�ӽФ��";
	String EMPID_TITLE = "���u�s��";
	String MOVETYPE_TITLE = "��������";
	String DEDATE_TITLE = "�ݨD���";
	String GLACCOUNTNO_TITLE = "�`�b��ؽs��";
	String GLACCOUNTNO_EX_TITLE = "�`�b��ؽs������";
	String COMPANYCODE_TITLE = "���q�N�X";
	String ACCOUNTGROUP_TITLE = "��ظs��";
	String PLSTATEMENT_TITLE = "�l�q������";
	String FUNTIONRANGE_TITLE = "�\��d��";
	String BALANCESHEET_TITLE = "�겣�t�Ū���";
	String ESSAY_TITLE = "�`�b��ت��u��";
	String LONGARTICLE_TITLE = "�`�b��ت�������";
	String CURRACCOUNT_TITLE = "��ع��O";
	String TAX_TITLE = "�|�O";
	String ALLOWNOTAX_TITLE = "���\�L�|�ڹL�b";
	String ADJUSTACCOUNT_TITLE = "���������ո`���";
	String PENDINGITEM_TITLE = "�������غ޲z";
	String DETAILITEM_TITLE = "���Ӷ������";
	String SORTCODE_TITLE = "�ƧǽX";
	String FIELDGROUP_TITLE = "��쪬�A�s��";
	String ALLOWAUTO_TITLE = "�u���\�۰ʹL�b";
	String ACCOUNTENTER_TITLE = "��b��إi��J";
	String PROJECTHIER_TITLE = "�p�e�h��";
	String REMARK_TITLE = "�Ƶ�";

	/**
	 * ���o�Ҧ����
	 * 
	 * @return
	 */
	public String[] tot_field() {
		String[] tot_field = { PNO, APDATE, EMPID, MOVETYPE, DEDATE,
				GLACCOUNTNO, GLACCOUNTNO_EX, COMPANYCODE, ACCOUNTGROUP,
				PLSTATEMENT, FUNTIONRANGE, BALANCESHEET, ESSAY, LONGARTICLE,
				CURRACCOUNT, TAX, ALLOWNOTAX, ADJUSTACCOUNT, PENDINGITEM,
				DETAILITEM, SORTCODE, FIELDGROUP, ALLOWAUTO, ACCOUNTENTER,
				PROJECTHIER, REMARK };
		return tot_field;
	}

	/**
	 * �w����Ѷ�g�����
	 * 
	 * @return
	 */
	public String[] forget_field() {
		String[] tot_field = { APDATE, EMPID, MOVETYPE, DEDATE, GLACCOUNTNO,
				GLACCOUNTNO_EX, COMPANYCODE, ACCOUNTGROUP, PLSTATEMENT,
				BALANCESHEET, ESSAY, LONGARTICLE, CURRACCOUNT, ALLOWNOTAX,
				PENDINGITEM, DETAILITEM, SORTCODE, FIELDGROUP, ALLOWAUTO,
				ACCOUNTENTER};
		return tot_field;
	}

	/**
	 * �w����Ѷ�g�������D
	 * 
	 * @return
	 */
	public String[] forget_title() {
		String[] tot_field = { APDATE_TITLE, EMPID_TITLE, MOVETYPE_TITLE,
				DEDATE_TITLE, GLACCOUNTNO_TITLE, GLACCOUNTNO_EX_TITLE,
				COMPANYCODE_TITLE, ACCOUNTGROUP_TITLE, PLSTATEMENT_TITLE,
				BALANCESHEET_TITLE, ESSAY_TITLE, LONGARTICLE_TITLE,
				CURRACCOUNT_TITLE, ALLOWNOTAX_TITLE, PENDINGITEM_TITLE,
				DETAILITEM_TITLE, SORTCODE_TITLE, FIELDGROUP_TITLE,
				ALLOWAUTO_TITLE, ACCOUNTENTER_TITLE};
		return tot_field;
	}
	
	/**
	 * �M�������
	 * 
	 * @return
	 */
	public String[] clear_field() {
		String[] tot_field = { MOVETYPE, DEDATE, GLACCOUNTNO,
				GLACCOUNTNO_EX, COMPANYCODE, ACCOUNTGROUP, FUNTIONRANGE, ESSAY, LONGARTICLE,TAX,
				ADJUSTACCOUNT, SORTCODE, FIELDGROUP, PROJECTHIER, REMARK };
		return tot_field;
	}
	/**
	 * �]���_�����
	 * @return
	 */
	public String[] setNo_field(){
		String[] setNo_field = {PLSTATEMENT,BALANCESHEET,ALLOWNOTAX,PENDINGITEM,DETAILITEM,ALLOWAUTO,ACCOUNTENTER};
		return setNo_field;
	}
	/**
	 * �d�ߪ����
	 * @return
	 */
	public String[] query_field(){
		String[] query_field = {PNO, APDATE, EMPID, MOVETYPE, DEDATE};
		return query_field;
	}
	/**
	 * �ݳB�z���n��s�M�i�s�誺���
	 * @return
	 */
	public String[] wait_process(){
		String[] wait_process = {MOVETYPE, DEDATE,
				GLACCOUNTNO, GLACCOUNTNO_EX, COMPANYCODE, ACCOUNTGROUP,
				PLSTATEMENT, FUNTIONRANGE, BALANCESHEET, ESSAY, LONGARTICLE,
				CURRACCOUNT, TAX, ALLOWNOTAX, ADJUSTACCOUNT, PENDINGITEM,
				DETAILITEM, SORTCODE, FIELDGROUP, ALLOWAUTO, ACCOUNTENTER,
				PROJECTHIER, REMARK};
		return wait_process;
	}
}
