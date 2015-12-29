package com.ysk.OA330;

public class Init {
	// 所有欄位名稱
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

	// 所有欄位標題
	String PNO_TITLE = "單號";
	String APDATE_TITLE = "申請日期";
	String EMPID_TITLE = "員工編號";
	String MOVETYPE_TITLE = "異動類型";
	String DEDATE_TITLE = "需求日期";
	String GLACCOUNTNO_TITLE = "總帳科目編號";
	String GLACCOUNTNO_EX_TITLE = "總帳科目編號說明";
	String COMPANYCODE_TITLE = "公司代碼";
	String ACCOUNTGROUP_TITLE = "科目群組";
	String PLSTATEMENT_TITLE = "損益報表科目";
	String FUNTIONRANGE_TITLE = "功能範圍";
	String BALANCESHEET_TITLE = "資產負債表科目";
	String ESSAY_TITLE = "總帳科目的短文";
	String LONGARTICLE_TITLE = "總帳科目的長內文";
	String CURRACCOUNT_TITLE = "科目幣別";
	String TAX_TITLE = "稅別";
	String ALLOWNOTAX_TITLE = "允許無稅款過帳";
	String ADJUSTACCOUNT_TITLE = "對科目類型調節科目";
	String PENDINGITEM_TITLE = "未結項目管理";
	String DETAILITEM_TITLE = "明細項目顯示";
	String SORTCODE_TITLE = "排序碼";
	String FIELDGROUP_TITLE = "欄位狀態群組";
	String ALLOWAUTO_TITLE = "只允許自動過帳";
	String ACCOUNTENTER_TITLE = "對帳科目可輸入";
	String PROJECTHIER_TITLE = "計畫層次";
	String REMARK_TITLE = "備註";

	/**
	 * 取得所有欄位
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
	 * 預防遺忘填寫的欄位
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
	 * 預防遺忘填寫的欄位標題
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
	 * 清除的欄位
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
	 * 設為否的欄位
	 * @return
	 */
	public String[] setNo_field(){
		String[] setNo_field = {PLSTATEMENT,BALANCESHEET,ALLOWNOTAX,PENDINGITEM,DETAILITEM,ALLOWAUTO,ACCOUNTENTER};
		return setNo_field;
	}
	/**
	 * 查詢的欄位
	 * @return
	 */
	public String[] query_field(){
		String[] query_field = {PNO, APDATE, EMPID, MOVETYPE, DEDATE};
		return query_field;
	}
	/**
	 * 待處理中要更新和可編輯的欄位
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
