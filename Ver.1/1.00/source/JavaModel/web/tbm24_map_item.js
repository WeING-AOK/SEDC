gx.evt.autoSkip=false;function tbm24_map_item(){this.ServerClass="TBM24_MAP_ITEM";this.PackageName="";this.setObjectType("trn");this.hasEnterEvent=true;this.SetStandaloneVars=function(){this.AV9Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tbm24_study_id=function(){gx.ajax.validSrvEvt("dyncall","valid_Tbm24_study_id",["gx.O.A422TBM24_STUDY_ID"],[]);return true};this.Valid_Tbm24_dom_cd=function(){try{var a=gx.util.balloon.getNew("TBM24_DOM_CD");this.AnyError=0
}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbm24_dom_var_nm=function(){try{var a=gx.util.balloon.getNew("TBM24_DOM_VAR_NM");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbm24_crf_item_div=function(){gx.ajax.validSrvEvt("dyncall","valid_Tbm24_crf_item_div",["gx.O.A422TBM24_STUDY_ID","gx.O.A423TBM24_DOM_CD","gx.O.A424TBM24_DOM_VAR_NM","gx.O.A425TBM24_CRF_ITEM_DIV",'gx.date.urlDateTime(gx.O.A428TBM24_CRT_DATETIME,"Y4MD")',"gx.O.A429TBM24_CRT_USER_ID",'gx.date.urlDateTime(gx.O.A431TBM24_UPD_DATETIME,"Y4MD")',"gx.O.A432TBM24_UPD_USER_ID","gx.O.A434TBM24_UPD_CNT","gx.O.A617TBM24_DOM_ITM_GRP_OID","gx.O.A618TBM24_DOM_ITM_GRP_ATTR_SEQ","gx.O.A619TBM24_DOM_ITM_GRP_ROWNO","gx.O.A620TBM24_CRF_ITEM_NM","gx.O.A543TBM24_IDENTIFICATION_CD","gx.O.A544TBM24_TEXT_MAXLENGTH","gx.O.A545TBM24_TEXT_MAXROWS","gx.O.A546TBM24_DECIMAL_DIGITS","gx.O.A547TBM24_TEXT","gx.O.A548TBM24_FIXED_VALUE","gx.O.A549TBM24_CHK_FALSE_INNER_VALUE","gx.O.A621TBM24_REQUIRED_INPUT_FLG","gx.O.A622TBM24_MIN_VALUE","gx.O.A623TBM24_MAX_VALUE","gx.O.A426TBM24_ORDER","gx.O.A427TBM24_DEL_FLG","gx.O.A430TBM24_CRT_PROG_NM","gx.O.A433TBM24_UPD_PROG_NM"],["A428TBM24_CRT_DATETIME","A429TBM24_CRT_USER_ID","A431TBM24_UPD_DATETIME","A432TBM24_UPD_USER_ID","A434TBM24_UPD_CNT","A617TBM24_DOM_ITM_GRP_OID","A618TBM24_DOM_ITM_GRP_ATTR_SEQ","A619TBM24_DOM_ITM_GRP_ROWNO","A620TBM24_CRF_ITEM_NM","A543TBM24_IDENTIFICATION_CD","A544TBM24_TEXT_MAXLENGTH","A545TBM24_TEXT_MAXROWS","A546TBM24_DECIMAL_DIGITS","A547TBM24_TEXT","A548TBM24_FIXED_VALUE","A549TBM24_CHK_FALSE_INNER_VALUE","A621TBM24_REQUIRED_INPUT_FLG","A622TBM24_MIN_VALUE","A623TBM24_MAX_VALUE","A426TBM24_ORDER","A427TBM24_DEL_FLG","A430TBM24_CRT_PROG_NM","A433TBM24_UPD_PROG_NM","AV9Pgmname","Gx_mode","Z422TBM24_STUDY_ID","Z423TBM24_DOM_CD","Z424TBM24_DOM_VAR_NM","Z425TBM24_CRF_ITEM_DIV","Z428TBM24_CRT_DATETIME","Z429TBM24_CRT_USER_ID","Z431TBM24_UPD_DATETIME","Z432TBM24_UPD_USER_ID","Z434TBM24_UPD_CNT","Z617TBM24_DOM_ITM_GRP_OID","Z618TBM24_DOM_ITM_GRP_ATTR_SEQ","Z619TBM24_DOM_ITM_GRP_ROWNO","Z620TBM24_CRF_ITEM_NM","Z543TBM24_IDENTIFICATION_CD","Z544TBM24_TEXT_MAXLENGTH","Z545TBM24_TEXT_MAXROWS","Z546TBM24_DECIMAL_DIGITS","Z547TBM24_TEXT","Z548TBM24_FIXED_VALUE","Z549TBM24_CHK_FALSE_INNER_VALUE","Z621TBM24_REQUIRED_INPUT_FLG","Z622TBM24_MIN_VALUE","Z623TBM24_MAX_VALUE","Z426TBM24_ORDER","Z427TBM24_DEL_FLG","Z430TBM24_CRT_PROG_NM","Z433TBM24_UPD_PROG_NM","ZV9Pgmname","O434TBM24_UPD_CNT",["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"]]);
return true};this.Valid_Tbm24_crt_datetime=function(){try{var a=gx.util.balloon.getNew("TBM24_CRT_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("").compare(this.A428TBM24_CRT_DATETIME)==0)||new gx.date.gxdate(this.A428TBM24_CRT_DATETIME).compare(gx.date.ymdhmstot(1000,1,1,0,0,0))>=0)){try{a.setError("フィールド　作成日時 は範囲外です");this.AnyError=1}catch(b){}}}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbm24_upd_datetime=function(){try{var a=gx.util.balloon.getNew("TBM24_UPD_DATETIME");
this.AnyError=0;if(!((new gx.date.gxdate("").compare(this.A431TBM24_UPD_DATETIME)==0)||new gx.date.gxdate(this.A431TBM24_UPD_DATETIME).compare(gx.date.ymdhmstot(1000,1,1,0,0,0))>=0)){try{a.setError("フィールド　更新日時 は範囲外です");this.AnyError=1}catch(b){}}}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbm24_upd_cnt=function(){try{var a=gx.util.balloon.getNew("TBM24_UPD_CNT");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true
};this.e120w2_client=function(){this.executeServerEvent("AFTER TRN",true)};this.e130w31_client=function(){this.executeServerEvent("ENTER",true)};this.e140w31_client=function(){this.executeServerEvent("CANCEL",true)};this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,26,27,33,36,38,41,43,46,48,51,53,56,58,61,63,66,68,71,73,76,78,81,83,86,88,91,93,96,98,101,103,106,108,111,113,116,118,121,123,126,128,131,133,136,138,141,143,146,148,151,153,156,158,161,163,166,168];
this.GXLastCtrlId=168;this.GXValidFnc[2]={fld:"TABLEMAIN",grid:0};this.GXValidFnc[5]={fld:"TABLETOOLBAR",grid:0};this.GXValidFnc[8]={fld:"BTN_FIRST",grid:0};this.GXValidFnc[9]={fld:"BTN_FIRST_SEPARATOR",grid:0};this.GXValidFnc[10]={fld:"BTN_PREVIOUS",grid:0};this.GXValidFnc[11]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};this.GXValidFnc[12]={fld:"BTN_NEXT",grid:0};this.GXValidFnc[13]={fld:"BTN_NEXT_SEPARATOR",grid:0};this.GXValidFnc[14]={fld:"BTN_LAST",grid:0};this.GXValidFnc[15]={fld:"BTN_LAST_SEPARATOR",grid:0};
this.GXValidFnc[16]={fld:"BTN_SELECT",grid:0};this.GXValidFnc[17]={fld:"BTN_SELECT_SEPARATOR",grid:0};this.GXValidFnc[18]={fld:"BTN_ENTER2",grid:0};this.GXValidFnc[19]={fld:"BTN_ENTER2_SEPARATOR",grid:0};this.GXValidFnc[20]={fld:"BTN_CANCEL2",grid:0};this.GXValidFnc[21]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};this.GXValidFnc[22]={fld:"BTN_DELETE2",grid:0};this.GXValidFnc[23]={fld:"BTN_DELETE2_SEPARATOR",grid:0};this.GXValidFnc[26]={fld:"GROUPDATA",grid:0};this.GXValidFnc[27]={fld:"TABLE1",grid:0};this.GXValidFnc[33]={fld:"TABLE2",grid:0};
this.GXValidFnc[36]={fld:"TEXTBLOCKTBM24_STUDY_ID",format:0,grid:0};this.GXValidFnc[38]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm24_study_id,isvalid:null,rgrid:[],fld:"TBM24_STUDY_ID",gxz:"Z422TBM24_STUDY_ID",gxold:"O422TBM24_STUDY_ID",gxvar:"A422TBM24_STUDY_ID",ucs:[],op:[],ip:[38],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A422TBM24_STUDY_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z422TBM24_STUDY_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM24_STUDY_ID",gx.O.A422TBM24_STUDY_ID,0)
},c2v:function(){gx.O.A422TBM24_STUDY_ID=this.val()},val:function(){return gx.fn.getIntegerValue("TBM24_STUDY_ID",",")},nac:function(){return false}};this.GXValidFnc[41]={fld:"TEXTBLOCKTBM24_DOM_CD",format:0,grid:0};this.GXValidFnc[43]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm24_dom_cd,isvalid:null,fld:"TBM24_DOM_CD",gxz:"Z423TBM24_DOM_CD",gxold:"O423TBM24_DOM_CD",gxvar:"A423TBM24_DOM_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A423TBM24_DOM_CD=a
},v2z:function(a){gx.O.Z423TBM24_DOM_CD=a},v2c:function(){gx.fn.setControlValue("TBM24_DOM_CD",gx.O.A423TBM24_DOM_CD,0)},c2v:function(){gx.O.A423TBM24_DOM_CD=this.val()},val:function(){return gx.fn.getControlValue("TBM24_DOM_CD")},nac:function(){return false}};this.GXValidFnc[46]={fld:"TEXTBLOCKTBM24_DOM_VAR_NM",format:0,grid:0};this.GXValidFnc[48]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm24_dom_var_nm,isvalid:null,fld:"TBM24_DOM_VAR_NM",gxz:"Z424TBM24_DOM_VAR_NM",gxold:"O424TBM24_DOM_VAR_NM",gxvar:"A424TBM24_DOM_VAR_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A424TBM24_DOM_VAR_NM=a
},v2z:function(a){gx.O.Z424TBM24_DOM_VAR_NM=a},v2c:function(){gx.fn.setControlValue("TBM24_DOM_VAR_NM",gx.O.A424TBM24_DOM_VAR_NM,0)},c2v:function(){gx.O.A424TBM24_DOM_VAR_NM=this.val()},val:function(){return gx.fn.getControlValue("TBM24_DOM_VAR_NM")},nac:function(){return false}};this.GXValidFnc[51]={fld:"TEXTBLOCKTBM24_DOM_ITM_GRP_OID",format:0,grid:0};this.GXValidFnc[53]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM24_DOM_ITM_GRP_OID",gxz:"Z617TBM24_DOM_ITM_GRP_OID",gxold:"O617TBM24_DOM_ITM_GRP_OID",gxvar:"A617TBM24_DOM_ITM_GRP_OID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A617TBM24_DOM_ITM_GRP_OID=a
},v2z:function(a){gx.O.Z617TBM24_DOM_ITM_GRP_OID=a},v2c:function(){gx.fn.setControlValue("TBM24_DOM_ITM_GRP_OID",gx.O.A617TBM24_DOM_ITM_GRP_OID,0)},c2v:function(){gx.O.A617TBM24_DOM_ITM_GRP_OID=this.val()},val:function(){return gx.fn.getControlValue("TBM24_DOM_ITM_GRP_OID")},nac:function(){return false}};this.GXValidFnc[56]={fld:"TEXTBLOCKTBM24_DOM_ITM_GRP_ATTR_SEQ",format:0,grid:0};this.GXValidFnc[58]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_DOM_ITM_GRP_ATTR_SEQ",gxz:"Z618TBM24_DOM_ITM_GRP_ATTR_SEQ",gxold:"O618TBM24_DOM_ITM_GRP_ATTR_SEQ",gxvar:"A618TBM24_DOM_ITM_GRP_ATTR_SEQ",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A618TBM24_DOM_ITM_GRP_ATTR_SEQ=gx.num.intval(a)
},v2z:function(a){gx.O.Z618TBM24_DOM_ITM_GRP_ATTR_SEQ=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM24_DOM_ITM_GRP_ATTR_SEQ",gx.O.A618TBM24_DOM_ITM_GRP_ATTR_SEQ,0)},c2v:function(){gx.O.A618TBM24_DOM_ITM_GRP_ATTR_SEQ=this.val()},val:function(){return gx.fn.getIntegerValue("TBM24_DOM_ITM_GRP_ATTR_SEQ",",")},nac:function(){return false}};this.GXValidFnc[61]={fld:"TEXTBLOCKTBM24_DOM_ITM_GRP_ROWNO",format:0,grid:0};this.GXValidFnc[63]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_DOM_ITM_GRP_ROWNO",gxz:"Z619TBM24_DOM_ITM_GRP_ROWNO",gxold:"O619TBM24_DOM_ITM_GRP_ROWNO",gxvar:"A619TBM24_DOM_ITM_GRP_ROWNO",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A619TBM24_DOM_ITM_GRP_ROWNO=gx.num.intval(a)
},v2z:function(a){gx.O.Z619TBM24_DOM_ITM_GRP_ROWNO=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM24_DOM_ITM_GRP_ROWNO",gx.O.A619TBM24_DOM_ITM_GRP_ROWNO,0)},c2v:function(){gx.O.A619TBM24_DOM_ITM_GRP_ROWNO=this.val()},val:function(){return gx.fn.getIntegerValue("TBM24_DOM_ITM_GRP_ROWNO",",")},nac:function(){return false}};this.GXValidFnc[66]={fld:"TEXTBLOCKTBM24_CRF_ITEM_NM",format:0,grid:0};this.GXValidFnc[68]={lvl:0,type:"svchar",len:200,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM24_CRF_ITEM_NM",gxz:"Z620TBM24_CRF_ITEM_NM",gxold:"O620TBM24_CRF_ITEM_NM",gxvar:"A620TBM24_CRF_ITEM_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A620TBM24_CRF_ITEM_NM=a
},v2z:function(a){gx.O.Z620TBM24_CRF_ITEM_NM=a},v2c:function(){gx.fn.setControlValue("TBM24_CRF_ITEM_NM",gx.O.A620TBM24_CRF_ITEM_NM,0)},c2v:function(){gx.O.A620TBM24_CRF_ITEM_NM=this.val()},val:function(){return gx.fn.getControlValue("TBM24_CRF_ITEM_NM")},nac:function(){return false}};this.GXValidFnc[71]={fld:"TEXTBLOCKTBM24_CRF_ITEM_DIV",format:0,grid:0};this.GXValidFnc[73]={lvl:0,type:"svchar",len:20,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm24_crf_item_div,isvalid:null,fld:"TBM24_CRF_ITEM_DIV",gxz:"Z425TBM24_CRF_ITEM_DIV",gxold:"O425TBM24_CRF_ITEM_DIV",gxvar:"A425TBM24_CRF_ITEM_DIV",ucs:[],op:[163,148,133,128,123,118,113,108,103,98,93,88,83,78,68,63,58,53,168,158,153,143,138],ip:[163,148,133,128,123,118,113,108,103,98,93,88,83,78,68,63,58,53,168,158,153,143,138,73,48,43,38],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A425TBM24_CRF_ITEM_DIV=a
},v2z:function(a){gx.O.Z425TBM24_CRF_ITEM_DIV=a},v2c:function(){gx.fn.setControlValue("TBM24_CRF_ITEM_DIV",gx.O.A425TBM24_CRF_ITEM_DIV,0)},c2v:function(){gx.O.A425TBM24_CRF_ITEM_DIV=this.val()},val:function(){return gx.fn.getControlValue("TBM24_CRF_ITEM_DIV")},nac:function(){return false}};this.GXValidFnc[76]={fld:"TEXTBLOCKTBM24_IDENTIFICATION_CD",format:0,grid:0};this.GXValidFnc[78]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM24_IDENTIFICATION_CD",gxz:"Z543TBM24_IDENTIFICATION_CD",gxold:"O543TBM24_IDENTIFICATION_CD",gxvar:"A543TBM24_IDENTIFICATION_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A543TBM24_IDENTIFICATION_CD=a
},v2z:function(a){gx.O.Z543TBM24_IDENTIFICATION_CD=a},v2c:function(){gx.fn.setControlValue("TBM24_IDENTIFICATION_CD",gx.O.A543TBM24_IDENTIFICATION_CD,0)},c2v:function(){gx.O.A543TBM24_IDENTIFICATION_CD=this.val()},val:function(){return gx.fn.getControlValue("TBM24_IDENTIFICATION_CD")},nac:function(){return false}};this.GXValidFnc[81]={fld:"TEXTBLOCKTBM24_TEXT_MAXLENGTH",format:0,grid:0};this.GXValidFnc[83]={lvl:0,type:"int",len:3,dec:0,sign:false,pic:"ZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_TEXT_MAXLENGTH",gxz:"Z544TBM24_TEXT_MAXLENGTH",gxold:"O544TBM24_TEXT_MAXLENGTH",gxvar:"A544TBM24_TEXT_MAXLENGTH",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A544TBM24_TEXT_MAXLENGTH=gx.num.intval(a)
},v2z:function(a){gx.O.Z544TBM24_TEXT_MAXLENGTH=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM24_TEXT_MAXLENGTH",gx.O.A544TBM24_TEXT_MAXLENGTH,0)},c2v:function(){gx.O.A544TBM24_TEXT_MAXLENGTH=this.val()},val:function(){return gx.fn.getIntegerValue("TBM24_TEXT_MAXLENGTH",",")},nac:function(){return false}};this.GXValidFnc[86]={fld:"TEXTBLOCKTBM24_TEXT_MAXROWS",format:0,grid:0};this.GXValidFnc[88]={lvl:0,type:"int",len:2,dec:0,sign:false,pic:"Z9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_TEXT_MAXROWS",gxz:"Z545TBM24_TEXT_MAXROWS",gxold:"O545TBM24_TEXT_MAXROWS",gxvar:"A545TBM24_TEXT_MAXROWS",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A545TBM24_TEXT_MAXROWS=gx.num.intval(a)
},v2z:function(a){gx.O.Z545TBM24_TEXT_MAXROWS=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM24_TEXT_MAXROWS",gx.O.A545TBM24_TEXT_MAXROWS,0)},c2v:function(){gx.O.A545TBM24_TEXT_MAXROWS=this.val()},val:function(){return gx.fn.getIntegerValue("TBM24_TEXT_MAXROWS",",")},nac:function(){return false}};this.GXValidFnc[91]={fld:"TEXTBLOCKTBM24_DECIMAL_DIGITS",format:0,grid:0};this.GXValidFnc[93]={lvl:0,type:"int",len:2,dec:0,sign:false,pic:"Z9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_DECIMAL_DIGITS",gxz:"Z546TBM24_DECIMAL_DIGITS",gxold:"O546TBM24_DECIMAL_DIGITS",gxvar:"A546TBM24_DECIMAL_DIGITS",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A546TBM24_DECIMAL_DIGITS=gx.num.intval(a)
},v2z:function(a){gx.O.Z546TBM24_DECIMAL_DIGITS=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM24_DECIMAL_DIGITS",gx.O.A546TBM24_DECIMAL_DIGITS,0)},c2v:function(){gx.O.A546TBM24_DECIMAL_DIGITS=this.val()},val:function(){return gx.fn.getIntegerValue("TBM24_DECIMAL_DIGITS",",")},nac:function(){return false}};this.GXValidFnc[96]={fld:"TEXTBLOCKTBM24_TEXT",format:0,grid:0};this.GXValidFnc[98]={lvl:0,type:"svchar",len:200,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM24_TEXT",gxz:"Z547TBM24_TEXT",gxold:"O547TBM24_TEXT",gxvar:"A547TBM24_TEXT",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A547TBM24_TEXT=a
},v2z:function(a){gx.O.Z547TBM24_TEXT=a},v2c:function(){gx.fn.setControlValue("TBM24_TEXT",gx.O.A547TBM24_TEXT,0)},c2v:function(){gx.O.A547TBM24_TEXT=this.val()},val:function(){return gx.fn.getControlValue("TBM24_TEXT")},nac:function(){return false}};this.GXValidFnc[101]={fld:"TEXTBLOCKTBM24_FIXED_VALUE",format:0,grid:0};this.GXValidFnc[103]={lvl:0,type:"svchar",len:100,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM24_FIXED_VALUE",gxz:"Z548TBM24_FIXED_VALUE",gxold:"O548TBM24_FIXED_VALUE",gxvar:"A548TBM24_FIXED_VALUE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A548TBM24_FIXED_VALUE=a
},v2z:function(a){gx.O.Z548TBM24_FIXED_VALUE=a},v2c:function(){gx.fn.setControlValue("TBM24_FIXED_VALUE",gx.O.A548TBM24_FIXED_VALUE,0)},c2v:function(){gx.O.A548TBM24_FIXED_VALUE=this.val()},val:function(){return gx.fn.getControlValue("TBM24_FIXED_VALUE")},nac:function(){return false}};this.GXValidFnc[106]={fld:"TEXTBLOCKTBM24_CHK_FALSE_INNER_VALUE",format:0,grid:0};this.GXValidFnc[108]={lvl:0,type:"svchar",len:100,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM24_CHK_FALSE_INNER_VALUE",gxz:"Z549TBM24_CHK_FALSE_INNER_VALUE",gxold:"O549TBM24_CHK_FALSE_INNER_VALUE",gxvar:"A549TBM24_CHK_FALSE_INNER_VALUE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A549TBM24_CHK_FALSE_INNER_VALUE=a
},v2z:function(a){gx.O.Z549TBM24_CHK_FALSE_INNER_VALUE=a},v2c:function(){gx.fn.setControlValue("TBM24_CHK_FALSE_INNER_VALUE",gx.O.A549TBM24_CHK_FALSE_INNER_VALUE,0)},c2v:function(){gx.O.A549TBM24_CHK_FALSE_INNER_VALUE=this.val()},val:function(){return gx.fn.getControlValue("TBM24_CHK_FALSE_INNER_VALUE")},nac:function(){return false}};this.GXValidFnc[111]={fld:"TEXTBLOCKTBM24_REQUIRED_INPUT_FLG",format:0,grid:0};this.GXValidFnc[113]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM24_REQUIRED_INPUT_FLG",gxz:"Z621TBM24_REQUIRED_INPUT_FLG",gxold:"O621TBM24_REQUIRED_INPUT_FLG",gxvar:"A621TBM24_REQUIRED_INPUT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A621TBM24_REQUIRED_INPUT_FLG=a
},v2z:function(a){gx.O.Z621TBM24_REQUIRED_INPUT_FLG=a},v2c:function(){gx.fn.setControlValue("TBM24_REQUIRED_INPUT_FLG",gx.O.A621TBM24_REQUIRED_INPUT_FLG,0)},c2v:function(){gx.O.A621TBM24_REQUIRED_INPUT_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM24_REQUIRED_INPUT_FLG")},nac:function(){return false}};this.GXValidFnc[116]={fld:"TEXTBLOCKTBM24_MIN_VALUE",format:0,grid:0};this.GXValidFnc[118]={lvl:0,type:"svchar",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM24_MIN_VALUE",gxz:"Z622TBM24_MIN_VALUE",gxold:"O622TBM24_MIN_VALUE",gxvar:"A622TBM24_MIN_VALUE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A622TBM24_MIN_VALUE=a
},v2z:function(a){gx.O.Z622TBM24_MIN_VALUE=a},v2c:function(){gx.fn.setControlValue("TBM24_MIN_VALUE",gx.O.A622TBM24_MIN_VALUE,0)},c2v:function(){gx.O.A622TBM24_MIN_VALUE=this.val()},val:function(){return gx.fn.getControlValue("TBM24_MIN_VALUE")},nac:function(){return false}};this.GXValidFnc[121]={fld:"TEXTBLOCKTBM24_MAX_VALUE",format:0,grid:0};this.GXValidFnc[123]={lvl:0,type:"svchar",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM24_MAX_VALUE",gxz:"Z623TBM24_MAX_VALUE",gxold:"O623TBM24_MAX_VALUE",gxvar:"A623TBM24_MAX_VALUE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A623TBM24_MAX_VALUE=a
},v2z:function(a){gx.O.Z623TBM24_MAX_VALUE=a},v2c:function(){gx.fn.setControlValue("TBM24_MAX_VALUE",gx.O.A623TBM24_MAX_VALUE,0)},c2v:function(){gx.O.A623TBM24_MAX_VALUE=this.val()},val:function(){return gx.fn.getControlValue("TBM24_MAX_VALUE")},nac:function(){return false}};this.GXValidFnc[126]={fld:"TEXTBLOCKTBM24_ORDER",format:0,grid:0};this.GXValidFnc[128]={lvl:0,type:"int",len:5,dec:0,sign:false,pic:"ZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_ORDER",gxz:"Z426TBM24_ORDER",gxold:"O426TBM24_ORDER",gxvar:"A426TBM24_ORDER",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A426TBM24_ORDER=gx.num.intval(a)
},v2z:function(a){gx.O.Z426TBM24_ORDER=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM24_ORDER",gx.O.A426TBM24_ORDER,0)},c2v:function(){gx.O.A426TBM24_ORDER=this.val()},val:function(){return gx.fn.getIntegerValue("TBM24_ORDER",",")},nac:function(){return false}};this.GXValidFnc[131]={fld:"TEXTBLOCKTBM24_DEL_FLG",format:0,grid:0};this.GXValidFnc[133]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM24_DEL_FLG",gxz:"Z427TBM24_DEL_FLG",gxold:"O427TBM24_DEL_FLG",gxvar:"A427TBM24_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A427TBM24_DEL_FLG=a
},v2z:function(a){gx.O.Z427TBM24_DEL_FLG=a},v2c:function(){gx.fn.setControlValue("TBM24_DEL_FLG",gx.O.A427TBM24_DEL_FLG,0)},c2v:function(){gx.O.A427TBM24_DEL_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM24_DEL_FLG")},nac:function(){return false}};this.GXValidFnc[136]={fld:"TEXTBLOCKTBM24_CRT_DATETIME",format:0,grid:0};this.GXValidFnc[138]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm24_crt_datetime,isvalid:null,fld:"TBM24_CRT_DATETIME",gxz:"Z428TBM24_CRT_DATETIME",gxold:"O428TBM24_CRT_DATETIME",gxvar:"A428TBM24_CRT_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[138],ip:[138],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A428TBM24_CRT_DATETIME=gx.fn.toDatetimeValue(a)
},v2z:function(a){gx.O.Z428TBM24_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBM24_CRT_DATETIME",gx.O.A428TBM24_CRT_DATETIME,0)},c2v:function(){gx.O.A428TBM24_CRT_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TBM24_CRT_DATETIME")},nac:function(){return false}};this.GXValidFnc[141]={fld:"TEXTBLOCKTBM24_CRT_USER_ID",format:0,grid:0};this.GXValidFnc[143]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM24_CRT_USER_ID",gxz:"Z429TBM24_CRT_USER_ID",gxold:"O429TBM24_CRT_USER_ID",gxvar:"A429TBM24_CRT_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A429TBM24_CRT_USER_ID=a
},v2z:function(a){gx.O.Z429TBM24_CRT_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBM24_CRT_USER_ID",gx.O.A429TBM24_CRT_USER_ID,0)},c2v:function(){gx.O.A429TBM24_CRT_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBM24_CRT_USER_ID")},nac:function(){return false}};this.GXValidFnc[146]={fld:"TEXTBLOCKTBM24_CRT_PROG_NM",format:0,grid:0};this.GXValidFnc[148]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM24_CRT_PROG_NM",gxz:"Z430TBM24_CRT_PROG_NM",gxold:"O430TBM24_CRT_PROG_NM",gxvar:"A430TBM24_CRT_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A430TBM24_CRT_PROG_NM=a
},v2z:function(a){gx.O.Z430TBM24_CRT_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBM24_CRT_PROG_NM",gx.O.A430TBM24_CRT_PROG_NM,0)},c2v:function(){gx.O.A430TBM24_CRT_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBM24_CRT_PROG_NM")},nac:function(){return false}};this.GXValidFnc[151]={fld:"TEXTBLOCKTBM24_UPD_DATETIME",format:0,grid:0};this.GXValidFnc[153]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm24_upd_datetime,isvalid:null,fld:"TBM24_UPD_DATETIME",gxz:"Z431TBM24_UPD_DATETIME",gxold:"O431TBM24_UPD_DATETIME",gxvar:"A431TBM24_UPD_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[153],ip:[153],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A431TBM24_UPD_DATETIME=gx.fn.toDatetimeValue(a)
},v2z:function(a){gx.O.Z431TBM24_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBM24_UPD_DATETIME",gx.O.A431TBM24_UPD_DATETIME,0)},c2v:function(){gx.O.A431TBM24_UPD_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TBM24_UPD_DATETIME")},nac:function(){return false}};this.GXValidFnc[156]={fld:"TEXTBLOCKTBM24_UPD_USER_ID",format:0,grid:0};this.GXValidFnc[158]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM24_UPD_USER_ID",gxz:"Z432TBM24_UPD_USER_ID",gxold:"O432TBM24_UPD_USER_ID",gxvar:"A432TBM24_UPD_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A432TBM24_UPD_USER_ID=a
},v2z:function(a){gx.O.Z432TBM24_UPD_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBM24_UPD_USER_ID",gx.O.A432TBM24_UPD_USER_ID,0)},c2v:function(){gx.O.A432TBM24_UPD_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBM24_UPD_USER_ID")},nac:function(){return false}};this.GXValidFnc[161]={fld:"TEXTBLOCKTBM24_UPD_PROG_NM",format:0,grid:0};this.GXValidFnc[163]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM24_UPD_PROG_NM",gxz:"Z433TBM24_UPD_PROG_NM",gxold:"O433TBM24_UPD_PROG_NM",gxvar:"A433TBM24_UPD_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A433TBM24_UPD_PROG_NM=a
},v2z:function(a){gx.O.Z433TBM24_UPD_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBM24_UPD_PROG_NM",gx.O.A433TBM24_UPD_PROG_NM,0)},c2v:function(){gx.O.A433TBM24_UPD_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBM24_UPD_PROG_NM")},nac:function(){return false}};this.GXValidFnc[166]={fld:"TEXTBLOCKTBM24_UPD_CNT",format:0,grid:0};this.GXValidFnc[168]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm24_upd_cnt,isvalid:null,rgrid:[],fld:"TBM24_UPD_CNT",gxz:"Z434TBM24_UPD_CNT",gxold:"O434TBM24_UPD_CNT",gxvar:"A434TBM24_UPD_CNT",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A434TBM24_UPD_CNT=gx.num.intval(a)
},v2z:function(a){gx.O.Z434TBM24_UPD_CNT=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM24_UPD_CNT",gx.O.A434TBM24_UPD_CNT,0)},c2v:function(){gx.O.A434TBM24_UPD_CNT=this.val()},val:function(){return gx.fn.getIntegerValue("TBM24_UPD_CNT",",")},nac:function(){return false}};this.A422TBM24_STUDY_ID=0;this.Z422TBM24_STUDY_ID=0;this.O422TBM24_STUDY_ID=0;this.A423TBM24_DOM_CD="";this.Z423TBM24_DOM_CD="";this.O423TBM24_DOM_CD="";this.A424TBM24_DOM_VAR_NM="";this.Z424TBM24_DOM_VAR_NM="";this.O424TBM24_DOM_VAR_NM="";
this.A617TBM24_DOM_ITM_GRP_OID="";this.Z617TBM24_DOM_ITM_GRP_OID="";this.O617TBM24_DOM_ITM_GRP_OID="";this.A618TBM24_DOM_ITM_GRP_ATTR_SEQ=0;this.Z618TBM24_DOM_ITM_GRP_ATTR_SEQ=0;this.O618TBM24_DOM_ITM_GRP_ATTR_SEQ=0;this.A619TBM24_DOM_ITM_GRP_ROWNO=0;this.Z619TBM24_DOM_ITM_GRP_ROWNO=0;this.O619TBM24_DOM_ITM_GRP_ROWNO=0;this.A620TBM24_CRF_ITEM_NM="";this.Z620TBM24_CRF_ITEM_NM="";this.O620TBM24_CRF_ITEM_NM="";this.A425TBM24_CRF_ITEM_DIV="";this.Z425TBM24_CRF_ITEM_DIV="";this.O425TBM24_CRF_ITEM_DIV="";
this.A543TBM24_IDENTIFICATION_CD="";this.Z543TBM24_IDENTIFICATION_CD="";this.O543TBM24_IDENTIFICATION_CD="";this.A544TBM24_TEXT_MAXLENGTH=0;this.Z544TBM24_TEXT_MAXLENGTH=0;this.O544TBM24_TEXT_MAXLENGTH=0;this.A545TBM24_TEXT_MAXROWS=0;this.Z545TBM24_TEXT_MAXROWS=0;this.O545TBM24_TEXT_MAXROWS=0;this.A546TBM24_DECIMAL_DIGITS=0;this.Z546TBM24_DECIMAL_DIGITS=0;this.O546TBM24_DECIMAL_DIGITS=0;this.A547TBM24_TEXT="";this.Z547TBM24_TEXT="";this.O547TBM24_TEXT="";this.A548TBM24_FIXED_VALUE="";this.Z548TBM24_FIXED_VALUE="";
this.O548TBM24_FIXED_VALUE="";this.A549TBM24_CHK_FALSE_INNER_VALUE="";this.Z549TBM24_CHK_FALSE_INNER_VALUE="";this.O549TBM24_CHK_FALSE_INNER_VALUE="";this.A621TBM24_REQUIRED_INPUT_FLG="";this.Z621TBM24_REQUIRED_INPUT_FLG="";this.O621TBM24_REQUIRED_INPUT_FLG="";this.A622TBM24_MIN_VALUE="";this.Z622TBM24_MIN_VALUE="";this.O622TBM24_MIN_VALUE="";this.A623TBM24_MAX_VALUE="";this.Z623TBM24_MAX_VALUE="";this.O623TBM24_MAX_VALUE="";this.A426TBM24_ORDER=0;this.Z426TBM24_ORDER=0;this.O426TBM24_ORDER=0;this.A427TBM24_DEL_FLG="";
this.Z427TBM24_DEL_FLG="";this.O427TBM24_DEL_FLG="";this.A428TBM24_CRT_DATETIME=gx.date.nullDate();this.Z428TBM24_CRT_DATETIME=gx.date.nullDate();this.O428TBM24_CRT_DATETIME=gx.date.nullDate();this.A429TBM24_CRT_USER_ID="";this.Z429TBM24_CRT_USER_ID="";this.O429TBM24_CRT_USER_ID="";this.A430TBM24_CRT_PROG_NM="";this.Z430TBM24_CRT_PROG_NM="";this.O430TBM24_CRT_PROG_NM="";this.A431TBM24_UPD_DATETIME=gx.date.nullDate();this.Z431TBM24_UPD_DATETIME=gx.date.nullDate();this.O431TBM24_UPD_DATETIME=gx.date.nullDate();
this.A432TBM24_UPD_USER_ID="";this.Z432TBM24_UPD_USER_ID="";this.O432TBM24_UPD_USER_ID="";this.A433TBM24_UPD_PROG_NM="";this.Z433TBM24_UPD_PROG_NM="";this.O433TBM24_UPD_PROG_NM="";this.A434TBM24_UPD_CNT=0;this.Z434TBM24_UPD_CNT=0;this.O434TBM24_UPD_CNT=0;this.AV8W_BC_FLG="";this.AV9Pgmname="";this.ServerEvents=["e120w2_client","e130w31_client","e140w31_client"];this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];this.VarControlMap.AV9Pgmname={id:"vPGMNAME",grid:0,type:"char"};this.VarControlMap.Gx_mode={id:"vMODE",grid:0,type:"char"};
this.SetStandaloneVars();this.LvlOlds[31]=["O434TBM24_UPD_CNT"]}tbm24_map_item.prototype=new gx.GxObject;gx.setParentObj(new tbm24_map_item());