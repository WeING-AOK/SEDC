gx.evt.autoSkip=false;function tbw13_csv_record(){this.ServerClass="TBW13_CSV_RECORD";this.PackageName="";this.setObjectType("trn");this.hasEnterEvent=true;this.SetStandaloneVars=function(){this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tbw13_session_id=function(){try{var a=gx.util.balloon.getNew("TBW13_SESSION_ID");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbw13_datetime=function(){try{var a=gx.util.balloon.getNew("TBW13_DATETIME");
this.AnyError=0;if(!((new gx.date.gxdate("").compare(this.A814TBW13_DATETIME)==0)||new gx.date.gxdate(this.A814TBW13_DATETIME).compare(gx.date.ymdhmstot(1000,1,1,0,0,0))>=0)){try{a.setError("フィールド　実行日時 は範囲外です");this.AnyError=1}catch(b){}}}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbw13_study_id=function(){try{var a=gx.util.balloon.getNew("TBW13_STUDY_ID");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbw13_subject_id=function(){try{var a=gx.util.balloon.getNew("TBW13_SUBJECT_ID");
this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbw13_visit_no=function(){try{var a=gx.util.balloon.getNew("TBW13_VISIT_NO");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbw13_dom_cd=function(){try{var a=gx.util.balloon.getNew("TBW13_DOM_CD");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbw13_dom_itm_grp_oid=function(){try{var a=gx.util.balloon.getNew("TBW13_DOM_ITM_GRP_OID");
this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbw13_dom_itm_grp_rowno=function(){gx.ajax.validSrvEvt("dyncall","valid_Tbw13_dom_itm_grp_rowno",["gx.O.A813TBW13_SESSION_ID",'gx.date.urlDateTime(gx.O.A814TBW13_DATETIME,"Y4MD")',"gx.O.A815TBW13_STUDY_ID","gx.O.A816TBW13_SUBJECT_ID","gx.O.A817TBW13_VISIT_NO","gx.O.A818TBW13_DOM_CD","gx.O.A819TBW13_DOM_ITM_GRP_OID","gx.O.A820TBW13_DOM_ITM_GRP_ROWNO","gx.O.A821TBW13_VALUE"],["A821TBW13_VALUE","Gx_mode","Z813TBW13_SESSION_ID","Z814TBW13_DATETIME","Z815TBW13_STUDY_ID","Z816TBW13_SUBJECT_ID","Z817TBW13_VISIT_NO","Z818TBW13_DOM_CD","Z819TBW13_DOM_ITM_GRP_OID","Z820TBW13_DOM_ITM_GRP_ROWNO","Z821TBW13_VALUE",["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"]]);
return true};this.e111e49_client=function(){this.executeServerEvent("ENTER",true)};this.e121e49_client=function(){this.executeServerEvent("CANCEL",true)};this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,26,27,33,36,38,41,43,46,48,51,53,56,58,61,63,66,68,71,73,76,78];this.GXLastCtrlId=78;this.GXValidFnc[2]={fld:"TABLEMAIN",grid:0};this.GXValidFnc[5]={fld:"TABLETOOLBAR",grid:0};this.GXValidFnc[8]={fld:"BTN_FIRST",grid:0};this.GXValidFnc[9]={fld:"BTN_FIRST_SEPARATOR",grid:0};
this.GXValidFnc[10]={fld:"BTN_PREVIOUS",grid:0};this.GXValidFnc[11]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};this.GXValidFnc[12]={fld:"BTN_NEXT",grid:0};this.GXValidFnc[13]={fld:"BTN_NEXT_SEPARATOR",grid:0};this.GXValidFnc[14]={fld:"BTN_LAST",grid:0};this.GXValidFnc[15]={fld:"BTN_LAST_SEPARATOR",grid:0};this.GXValidFnc[16]={fld:"BTN_SELECT",grid:0};this.GXValidFnc[17]={fld:"BTN_SELECT_SEPARATOR",grid:0};this.GXValidFnc[18]={fld:"BTN_ENTER2",grid:0};this.GXValidFnc[19]={fld:"BTN_ENTER2_SEPARATOR",grid:0};
this.GXValidFnc[20]={fld:"BTN_CANCEL2",grid:0};this.GXValidFnc[21]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};this.GXValidFnc[22]={fld:"BTN_DELETE2",grid:0};this.GXValidFnc[23]={fld:"BTN_DELETE2_SEPARATOR",grid:0};this.GXValidFnc[26]={fld:"GROUPDATA",grid:0};this.GXValidFnc[27]={fld:"TABLE1",grid:0};this.GXValidFnc[33]={fld:"TABLE2",grid:0};this.GXValidFnc[36]={fld:"TEXTBLOCKTBW13_SESSION_ID",format:0,grid:0};this.GXValidFnc[38]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw13_session_id,isvalid:null,fld:"TBW13_SESSION_ID",gxz:"Z813TBW13_SESSION_ID",gxold:"O813TBW13_SESSION_ID",gxvar:"A813TBW13_SESSION_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A813TBW13_SESSION_ID=a
},v2z:function(a){gx.O.Z813TBW13_SESSION_ID=a},v2c:function(){gx.fn.setControlValue("TBW13_SESSION_ID",gx.O.A813TBW13_SESSION_ID,0)},c2v:function(){gx.O.A813TBW13_SESSION_ID=this.val()},val:function(){return gx.fn.getControlValue("TBW13_SESSION_ID")},nac:function(){return false}};this.GXValidFnc[41]={fld:"TEXTBLOCKTBW13_DATETIME",format:0,grid:0};this.GXValidFnc[43]={lvl:0,type:"dtime",len:8,dec:5,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw13_datetime,isvalid:null,fld:"TBW13_DATETIME",gxz:"Z814TBW13_DATETIME",gxold:"O814TBW13_DATETIME",gxvar:"A814TBW13_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/99 99:99",dec:5},ucs:[],op:[43],ip:[43],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A814TBW13_DATETIME=gx.fn.toDatetimeValue(a)
},v2z:function(a){gx.O.Z814TBW13_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBW13_DATETIME",gx.O.A814TBW13_DATETIME,0)},c2v:function(){gx.O.A814TBW13_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TBW13_DATETIME")},nac:function(){return false}};this.GXValidFnc[46]={fld:"TEXTBLOCKTBW13_STUDY_ID",format:0,grid:0};this.GXValidFnc[48]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw13_study_id,isvalid:null,rgrid:[],fld:"TBW13_STUDY_ID",gxz:"Z815TBW13_STUDY_ID",gxold:"O815TBW13_STUDY_ID",gxvar:"A815TBW13_STUDY_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A815TBW13_STUDY_ID=gx.num.intval(a)
},v2z:function(a){gx.O.Z815TBW13_STUDY_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW13_STUDY_ID",gx.O.A815TBW13_STUDY_ID,0)},c2v:function(){gx.O.A815TBW13_STUDY_ID=this.val()},val:function(){return gx.fn.getIntegerValue("TBW13_STUDY_ID",",")},nac:function(){return false}};this.GXValidFnc[51]={fld:"TEXTBLOCKTBW13_SUBJECT_ID",format:0,grid:0};this.GXValidFnc[53]={lvl:0,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw13_subject_id,isvalid:null,rgrid:[],fld:"TBW13_SUBJECT_ID",gxz:"Z816TBW13_SUBJECT_ID",gxold:"O816TBW13_SUBJECT_ID",gxvar:"A816TBW13_SUBJECT_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A816TBW13_SUBJECT_ID=gx.num.intval(a)
},v2z:function(a){gx.O.Z816TBW13_SUBJECT_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW13_SUBJECT_ID",gx.O.A816TBW13_SUBJECT_ID,0)},c2v:function(){gx.O.A816TBW13_SUBJECT_ID=this.val()},val:function(){return gx.fn.getIntegerValue("TBW13_SUBJECT_ID",",")},nac:function(){return false}};this.GXValidFnc[56]={fld:"TEXTBLOCKTBW13_VISIT_NO",format:0,grid:0};this.GXValidFnc[58]={lvl:0,type:"int",len:3,dec:0,sign:false,pic:"ZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw13_visit_no,isvalid:null,rgrid:[],fld:"TBW13_VISIT_NO",gxz:"Z817TBW13_VISIT_NO",gxold:"O817TBW13_VISIT_NO",gxvar:"A817TBW13_VISIT_NO",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A817TBW13_VISIT_NO=gx.num.intval(a)
},v2z:function(a){gx.O.Z817TBW13_VISIT_NO=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW13_VISIT_NO",gx.O.A817TBW13_VISIT_NO,0)},c2v:function(){gx.O.A817TBW13_VISIT_NO=this.val()},val:function(){return gx.fn.getIntegerValue("TBW13_VISIT_NO",",")},nac:function(){return false}};this.GXValidFnc[61]={fld:"TEXTBLOCKTBW13_DOM_CD",format:0,grid:0};this.GXValidFnc[63]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw13_dom_cd,isvalid:null,fld:"TBW13_DOM_CD",gxz:"Z818TBW13_DOM_CD",gxold:"O818TBW13_DOM_CD",gxvar:"A818TBW13_DOM_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A818TBW13_DOM_CD=a
},v2z:function(a){gx.O.Z818TBW13_DOM_CD=a},v2c:function(){gx.fn.setControlValue("TBW13_DOM_CD",gx.O.A818TBW13_DOM_CD,0)},c2v:function(){gx.O.A818TBW13_DOM_CD=this.val()},val:function(){return gx.fn.getControlValue("TBW13_DOM_CD")},nac:function(){return false}};this.GXValidFnc[66]={fld:"TEXTBLOCKTBW13_DOM_ITM_GRP_OID",format:0,grid:0};this.GXValidFnc[68]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw13_dom_itm_grp_oid,isvalid:null,fld:"TBW13_DOM_ITM_GRP_OID",gxz:"Z819TBW13_DOM_ITM_GRP_OID",gxold:"O819TBW13_DOM_ITM_GRP_OID",gxvar:"A819TBW13_DOM_ITM_GRP_OID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A819TBW13_DOM_ITM_GRP_OID=a
},v2z:function(a){gx.O.Z819TBW13_DOM_ITM_GRP_OID=a},v2c:function(){gx.fn.setControlValue("TBW13_DOM_ITM_GRP_OID",gx.O.A819TBW13_DOM_ITM_GRP_OID,0)},c2v:function(){gx.O.A819TBW13_DOM_ITM_GRP_OID=this.val()},val:function(){return gx.fn.getControlValue("TBW13_DOM_ITM_GRP_OID")},nac:function(){return false}};this.GXValidFnc[71]={fld:"TEXTBLOCKTBW13_DOM_ITM_GRP_ROWNO",format:0,grid:0};this.GXValidFnc[73]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw13_dom_itm_grp_rowno,isvalid:null,rgrid:[],fld:"TBW13_DOM_ITM_GRP_ROWNO",gxz:"Z820TBW13_DOM_ITM_GRP_ROWNO",gxold:"O820TBW13_DOM_ITM_GRP_ROWNO",gxvar:"A820TBW13_DOM_ITM_GRP_ROWNO",ucs:[],op:[78],ip:[78,73,68,63,58,53,48,43,38],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A820TBW13_DOM_ITM_GRP_ROWNO=gx.num.intval(a)
},v2z:function(a){gx.O.Z820TBW13_DOM_ITM_GRP_ROWNO=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW13_DOM_ITM_GRP_ROWNO",gx.O.A820TBW13_DOM_ITM_GRP_ROWNO,0)},c2v:function(){gx.O.A820TBW13_DOM_ITM_GRP_ROWNO=this.val()},val:function(){return gx.fn.getIntegerValue("TBW13_DOM_ITM_GRP_ROWNO",",")},nac:function(){return false}};this.GXValidFnc[76]={fld:"TEXTBLOCKTBW13_VALUE",format:0,grid:0};this.GXValidFnc[78]={lvl:0,type:"vchar",len:50000,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBW13_VALUE",gxz:"Z821TBW13_VALUE",gxold:"O821TBW13_VALUE",gxvar:"A821TBW13_VALUE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A821TBW13_VALUE=a
},v2z:function(a){gx.O.Z821TBW13_VALUE=a},v2c:function(){gx.fn.setControlValue("TBW13_VALUE",gx.O.A821TBW13_VALUE,0)},c2v:function(){gx.O.A821TBW13_VALUE=this.val()},val:function(){return gx.fn.getControlValue("TBW13_VALUE")},nac:function(){return false}};this.A813TBW13_SESSION_ID="";this.Z813TBW13_SESSION_ID="";this.O813TBW13_SESSION_ID="";this.A814TBW13_DATETIME=gx.date.nullDate();this.Z814TBW13_DATETIME=gx.date.nullDate();this.O814TBW13_DATETIME=gx.date.nullDate();this.A815TBW13_STUDY_ID=0;this.Z815TBW13_STUDY_ID=0;
this.O815TBW13_STUDY_ID=0;this.A816TBW13_SUBJECT_ID=0;this.Z816TBW13_SUBJECT_ID=0;this.O816TBW13_SUBJECT_ID=0;this.A817TBW13_VISIT_NO=0;this.Z817TBW13_VISIT_NO=0;this.O817TBW13_VISIT_NO=0;this.A818TBW13_DOM_CD="";this.Z818TBW13_DOM_CD="";this.O818TBW13_DOM_CD="";this.A819TBW13_DOM_ITM_GRP_OID="";this.Z819TBW13_DOM_ITM_GRP_OID="";this.O819TBW13_DOM_ITM_GRP_OID="";this.A820TBW13_DOM_ITM_GRP_ROWNO=0;this.Z820TBW13_DOM_ITM_GRP_ROWNO=0;this.O820TBW13_DOM_ITM_GRP_ROWNO=0;this.A821TBW13_VALUE="";this.Z821TBW13_VALUE="";
this.O821TBW13_VALUE="";this.ServerEvents=["e111e49_client","e121e49_client"];this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];this.VarControlMap.Gx_mode={id:"vMODE",grid:0,type:"char"};this.SetStandaloneVars()}tbw13_csv_record.prototype=new gx.GxObject;gx.setParentObj(new tbw13_csv_record());