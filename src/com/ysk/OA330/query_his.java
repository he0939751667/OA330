package com.ysk.OA330;
import javax.swing.*;
import jcx.jform.bproc;
import java.io.*;
import java.util.*;
import jcx.util.*;
import jcx.html.*;
import jcx.db.*;

import com.ysk.service.SignFlowHistoryService;
public class query_his extends bproc{
	public String getDefaultValue(String value)throws Throwable{
		String key = "a.PNO" + "='" + getValue("table1.PNO") + "'";

		SignFlowHistoryService service = new SignFlowHistoryService(this);
		service.doDisplaySignFlowHistory("會計科目電子流程表單", key);
		return value;
	}
	public String getInformation(){
		return "---------------null(null)..defaultValue()----------------";
	}
}