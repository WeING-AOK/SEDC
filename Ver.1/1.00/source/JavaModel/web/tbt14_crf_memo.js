gx.evt.autoSkip=false;function tbt14_crf_memo(){this.ServerClass="TBT14_CRF_MEMO";this.PackageName="";this.setObjectType("trn");this.hasEnterEvent=true;this.SetStandaloneVars=function(){this.AV9Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tbt14_study_id=function(){try{var a=gx.util.balloon.getNew("TBT14_STUDY_ID");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbt14_subject_id=function(){gx.ajax.validSrvEvt("dyncall","valid_Tbt14_subject_id",["gx.O.A329TBT14_STUDY_ID","gx.O.A330TBT14_SUBJECT_ID"],[]);
return true};this.Valid_Tbt14_memo_no=function(){gx.ajax.validSrvEvt("dyncall","valid_Tbt14_memo_no",["gx.O.A329TBT14_STUDY_ID","gx.O.A330TBT14_SUBJECT_ID","gx.O.A922TBT14_MEMO_NO",'gx.date.urlDateTime(gx.O.A338TBT14_CRT_DATETIME,"Y4MD")',"gx.O.A339TBT14_CRT_USER_ID",'gx.date.urlDateTime(gx.O.A341TBT14_UPD_DATETIME,"Y4MD")',"gx.O.A342TBT14_UPD_USER_ID","gx.O.A344TBT14_UPD_CNT","gx.O.A331TBT14_CRF_ID","gx.O.A332TBT14_CRF_VERSION","gx.O.A923TBT14_MEMO_KBN","gx.O.A335TBT14_MEMO","gx.O.A928TBT14_REQUEST_SITE_ID","gx.O.A929TBT14_REQUEST_AUTH_CD","gx.O.A930TBT14_CRT_AUTH_CD","gx.O.A927TBT14_KAKUNIN_FLG","gx.O.A931TBT14_KAKUNIN_USER_ID","gx.O.A933TBT14_KAKUNIN_COMMENT","gx.O.A924TBT14_KANRYO_FLG","gx.O.A337TBT14_DEL_FLG","gx.O.A340TBT14_CRT_PROG_NM","gx.O.A343TBT14_UPD_PROG_NM"],["A338TBT14_CRT_DATETIME","A339TBT14_CRT_USER_ID","A341TBT14_UPD_DATETIME","A342TBT14_UPD_USER_ID","A344TBT14_UPD_CNT","A331TBT14_CRF_ID","A332TBT14_CRF_VERSION","A923TBT14_MEMO_KBN","A335TBT14_MEMO","A928TBT14_REQUEST_SITE_ID","A929TBT14_REQUEST_AUTH_CD","A930TBT14_CRT_AUTH_CD","A927TBT14_KAKUNIN_FLG","A931TBT14_KAKUNIN_USER_ID","A933TBT14_KAKUNIN_COMMENT","A924TBT14_KANRYO_FLG","A337TBT14_DEL_FLG","A340TBT14_CRT_PROG_NM","A343TBT14_UPD_PROG_NM","AV9Pgmname","Gx_mode","Z329TBT14_STUDY_ID","Z330TBT14_SUBJECT_ID","Z922TBT14_MEMO_NO","Z338TBT14_CRT_DATETIME","Z339TBT14_CRT_USER_ID","Z341TBT14_UPD_DATETIME","Z342TBT14_UPD_USER_ID","Z344TBT14_UPD_CNT","Z331TBT14_CRF_ID","Z332TBT14_CRF_VERSION","Z923TBT14_MEMO_KBN","Z335TBT14_MEMO","Z928TBT14_REQUEST_SITE_ID","Z929TBT14_REQUEST_AUTH_CD","Z930TBT14_CRT_AUTH_CD","Z927TBT14_KAKUNIN_FLG","Z931TBT14_KAKUNIN_USER_ID","Z933TBT14_KAKUNIN_COMMENT","Z924TBT14_KANRYO_FLG","Z337TBT14_DEL_FLG","Z340TBT14_CRT_PROG_NM","Z343TBT14_UPD_PROG_NM","ZV9Pgmname","O344TBT14_UPD_CNT",["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"]]);
return true};this.Valid_Tbt14_crt_datetime=function(){try{var a=gx.util.balloon.getNew("TBT14_CRT_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("").compare(this.A338TBT14_CRT_DATETIME)==0)||new gx.date.gxdate(this.A338TBT14_CRT_DATETIME).compare(gx.date.ymdhmstot(1000,1,1,0,0,0))>=0)){try{a.setError("フィールド　作成日時 は範囲外です");this.AnyError=1}catch(b){}}}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbt14_upd_datetime=function(){try{var a=gx.util.balloon.getNew("TBT14_UPD_DATETIME");
this.AnyError=0;if(!((new gx.date.gxdate("").compare(this.A341TBT14_UPD_DATETIME)==0)||new gx.date.gxdate(this.A341TBT14_UPD_DATETIME).compare(gx.date.ymdhmstot(1000,1,1,0,0,0))>=0)){try{a.setError("フィールド　更新日時 は範囲外です");this.AnyError=1}catch(b){}}}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbt14_upd_cnt=function(){try{var a=gx.util.balloon.getNew("TBT14_UPD_CNT");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true
};this.e120s2_client=function(){this.executeServerEvent("AFTER TRN",true)};this.e130s27_client=function(){this.executeServerEvent("ENTER",true)};this.e140s27_client=function(){this.executeServerEvent("CANCEL",true)};this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,26,27,33,36,38,41,43,46,48,51,53,56,58,61,63,66,68,71,73,76,78,81,83,86,88,91,93,96,98,101,103,106,108,111,113,116,118,121,123,126,128,131,133,136,138,141,143];this.GXLastCtrlId=143;this.GXValidFnc[2]={fld:"TABLEMAIN",grid:0};
this.GXValidFnc[5]={fld:"TABLETOOLBAR",grid:0};this.GXValidFnc[8]={fld:"BTN_FIRST",grid:0};this.GXValidFnc[9]={fld:"BTN_FIRST_SEPARATOR",grid:0};this.GXValidFnc[10]={fld:"BTN_PREVIOUS",grid:0};this.GXValidFnc[11]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};this.GXValidFnc[12]={fld:"BTN_NEXT",grid:0};this.GXValidFnc[13]={fld:"BTN_NEXT_SEPARATOR",grid:0};this.GXValidFnc[14]={fld:"BTN_LAST",grid:0};this.GXValidFnc[15]={fld:"BTN_LAST_SEPARATOR",grid:0};this.GXValidFnc[16]={fld:"BTN_SELECT",grid:0};this.GXValidFnc[17]={fld:"BTN_SELECT_SEPARATOR",grid:0};
this.GXValidFnc[18]={fld:"BTN_ENTER2",grid:0};this.GXValidFnc[19]={fld:"BTN_ENTER2_SEPARATOR",grid:0};this.GXValidFnc[20]={fld:"BTN_CANCEL2",grid:0};this.GXValidFnc[21]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};this.GXValidFnc[22]={fld:"BTN_DELETE2",grid:0};this.GXValidFnc[23]={fld:"BTN_DELETE2_SEPARATOR",grid:0};this.GXValidFnc[26]={fld:"GROUPDATA",grid:0};this.GXValidFnc[27]={fld:"TABLE1",grid:0};this.GXValidFnc[33]={fld:"TABLE2",grid:0};this.GXValidFnc[36]={fld:"TEXTBLOCKTBT14_STUDY_ID",format:0,grid:0};
this.GXValidFnc[38]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt14_study_id,isvalid:null,rgrid:[],fld:"TBT14_STUDY_ID",gxz:"Z329TBT14_STUDY_ID",gxold:"O329TBT14_STUDY_ID",gxvar:"A329TBT14_STUDY_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A329TBT14_STUDY_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z329TBT14_STUDY_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT14_STUDY_ID",gx.O.A329TBT14_STUDY_ID,0)},c2v:function(){gx.O.A329TBT14_STUDY_ID=this.val()
},val:function(){return gx.fn.getIntegerValue("TBT14_STUDY_ID",",")},nac:function(){return false}};this.GXValidFnc[41]={fld:"TEXTBLOCKTBT14_SUBJECT_ID",format:0,grid:0};this.GXValidFnc[43]={lvl:0,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt14_subject_id,isvalid:null,rgrid:[],fld:"TBT14_SUBJECT_ID",gxz:"Z330TBT14_SUBJECT_ID",gxold:"O330TBT14_SUBJECT_ID",gxvar:"A330TBT14_SUBJECT_ID",ucs:[],op:[],ip:[43,38],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A330TBT14_SUBJECT_ID=gx.num.intval(a)
},v2z:function(a){gx.O.Z330TBT14_SUBJECT_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT14_SUBJECT_ID",gx.O.A330TBT14_SUBJECT_ID,0)},c2v:function(){gx.O.A330TBT14_SUBJECT_ID=this.val()},val:function(){return gx.fn.getIntegerValue("TBT14_SUBJECT_ID",",")},nac:function(){return false}};this.GXValidFnc[46]={fld:"TEXTBLOCKTBT14_MEMO_NO",format:0,grid:0};this.GXValidFnc[48]={lvl:0,type:"int",len:3,dec:0,sign:false,pic:"ZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt14_memo_no,isvalid:null,rgrid:[],fld:"TBT14_MEMO_NO",gxz:"Z922TBT14_MEMO_NO",gxold:"O922TBT14_MEMO_NO",gxvar:"A922TBT14_MEMO_NO",ucs:[],op:[138,123,108,103,98,93,88,83,78,73,68,63,58,53,143,133,128,118,113],ip:[138,123,108,103,98,93,88,83,78,73,68,63,58,53,143,133,128,118,113,48,43,38],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A922TBT14_MEMO_NO=gx.num.intval(a)
},v2z:function(a){gx.O.Z922TBT14_MEMO_NO=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT14_MEMO_NO",gx.O.A922TBT14_MEMO_NO,0)},c2v:function(){gx.O.A922TBT14_MEMO_NO=this.val()},val:function(){return gx.fn.getIntegerValue("TBT14_MEMO_NO",",")},nac:function(){return false}};this.GXValidFnc[51]={fld:"TEXTBLOCKTBT14_CRF_ID",format:0,grid:0};this.GXValidFnc[53]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT14_CRF_ID",gxz:"Z331TBT14_CRF_ID",gxold:"O331TBT14_CRF_ID",gxvar:"A331TBT14_CRF_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A331TBT14_CRF_ID=gx.num.intval(a)
},v2z:function(a){gx.O.Z331TBT14_CRF_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT14_CRF_ID",gx.O.A331TBT14_CRF_ID,0)},c2v:function(){gx.O.A331TBT14_CRF_ID=this.val()},val:function(){return gx.fn.getIntegerValue("TBT14_CRF_ID",",")},nac:function(){return false}};this.GXValidFnc[56]={fld:"TEXTBLOCKTBT14_CRF_VERSION",format:0,grid:0};this.GXValidFnc[58]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT14_CRF_VERSION",gxz:"Z332TBT14_CRF_VERSION",gxold:"O332TBT14_CRF_VERSION",gxvar:"A332TBT14_CRF_VERSION",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A332TBT14_CRF_VERSION=gx.num.intval(a)
},v2z:function(a){gx.O.Z332TBT14_CRF_VERSION=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT14_CRF_VERSION",gx.O.A332TBT14_CRF_VERSION,0)},c2v:function(){gx.O.A332TBT14_CRF_VERSION=this.val()},val:function(){return gx.fn.getIntegerValue("TBT14_CRF_VERSION",",")},nac:function(){return false}};this.GXValidFnc[61]={fld:"TEXTBLOCKTBT14_MEMO_KBN",format:0,grid:0};this.GXValidFnc[63]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBT14_MEMO_KBN",gxz:"Z923TBT14_MEMO_KBN",gxold:"O923TBT14_MEMO_KBN",gxvar:"A923TBT14_MEMO_KBN",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A923TBT14_MEMO_KBN=a
},v2z:function(a){gx.O.Z923TBT14_MEMO_KBN=a},v2c:function(){gx.fn.setControlValue("TBT14_MEMO_KBN",gx.O.A923TBT14_MEMO_KBN,0)},c2v:function(){gx.O.A923TBT14_MEMO_KBN=this.val()},val:function(){return gx.fn.getControlValue("TBT14_MEMO_KBN")},nac:function(){return false}};this.GXValidFnc[66]={fld:"TEXTBLOCKTBT14_MEMO",format:0,grid:0};this.GXValidFnc[68]={lvl:0,type:"svchar",len:2000,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBT14_MEMO",gxz:"Z335TBT14_MEMO",gxold:"O335TBT14_MEMO",gxvar:"A335TBT14_MEMO",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A335TBT14_MEMO=a
},v2z:function(a){gx.O.Z335TBT14_MEMO=a},v2c:function(){gx.fn.setControlValue("TBT14_MEMO",gx.O.A335TBT14_MEMO,0)},c2v:function(){gx.O.A335TBT14_MEMO=this.val()},val:function(){return gx.fn.getControlValue("TBT14_MEMO")},nac:function(){return false}};this.GXValidFnc[71]={fld:"TEXTBLOCKTBT14_REQUEST_SITE_ID",format:0,grid:0};this.GXValidFnc[73]={lvl:0,type:"svchar",len:20,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBT14_REQUEST_SITE_ID",gxz:"Z928TBT14_REQUEST_SITE_ID",gxold:"O928TBT14_REQUEST_SITE_ID",gxvar:"A928TBT14_REQUEST_SITE_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A928TBT14_REQUEST_SITE_ID=a
},v2z:function(a){gx.O.Z928TBT14_REQUEST_SITE_ID=a},v2c:function(){gx.fn.setControlValue("TBT14_REQUEST_SITE_ID",gx.O.A928TBT14_REQUEST_SITE_ID,0)},c2v:function(){gx.O.A928TBT14_REQUEST_SITE_ID=this.val()},val:function(){return gx.fn.getControlValue("TBT14_REQUEST_SITE_ID")},nac:function(){return false}};this.GXValidFnc[76]={fld:"TEXTBLOCKTBT14_REQUEST_AUTH_CD",format:0,grid:0};this.GXValidFnc[78]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBT14_REQUEST_AUTH_CD",gxz:"Z929TBT14_REQUEST_AUTH_CD",gxold:"O929TBT14_REQUEST_AUTH_CD",gxvar:"A929TBT14_REQUEST_AUTH_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A929TBT14_REQUEST_AUTH_CD=a
},v2z:function(a){gx.O.Z929TBT14_REQUEST_AUTH_CD=a},v2c:function(){gx.fn.setControlValue("TBT14_REQUEST_AUTH_CD",gx.O.A929TBT14_REQUEST_AUTH_CD,0)},c2v:function(){gx.O.A929TBT14_REQUEST_AUTH_CD=this.val()},val:function(){return gx.fn.getControlValue("TBT14_REQUEST_AUTH_CD")},nac:function(){return false}};this.GXValidFnc[81]={fld:"TEXTBLOCKTBT14_CRT_AUTH_CD",format:0,grid:0};this.GXValidFnc[83]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBT14_CRT_AUTH_CD",gxz:"Z930TBT14_CRT_AUTH_CD",gxold:"O930TBT14_CRT_AUTH_CD",gxvar:"A930TBT14_CRT_AUTH_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A930TBT14_CRT_AUTH_CD=a
},v2z:function(a){gx.O.Z930TBT14_CRT_AUTH_CD=a},v2c:function(){gx.fn.setControlValue("TBT14_CRT_AUTH_CD",gx.O.A930TBT14_CRT_AUTH_CD,0)},c2v:function(){gx.O.A930TBT14_CRT_AUTH_CD=this.val()},val:function(){return gx.fn.getControlValue("TBT14_CRT_AUTH_CD")},nac:function(){return false}};this.GXValidFnc[86]={fld:"TEXTBLOCKTBT14_KAKUNIN_FLG",format:0,grid:0};this.GXValidFnc[88]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBT14_KAKUNIN_FLG",gxz:"Z927TBT14_KAKUNIN_FLG",gxold:"O927TBT14_KAKUNIN_FLG",gxvar:"A927TBT14_KAKUNIN_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A927TBT14_KAKUNIN_FLG=a
},v2z:function(a){gx.O.Z927TBT14_KAKUNIN_FLG=a},v2c:function(){gx.fn.setControlValue("TBT14_KAKUNIN_FLG",gx.O.A927TBT14_KAKUNIN_FLG,0)},c2v:function(){gx.O.A927TBT14_KAKUNIN_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBT14_KAKUNIN_FLG")},nac:function(){return false}};this.GXValidFnc[91]={fld:"TEXTBLOCKTBT14_KAKUNIN_USER_ID",format:0,grid:0};this.GXValidFnc[93]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBT14_KAKUNIN_USER_ID",gxz:"Z931TBT14_KAKUNIN_USER_ID",gxold:"O931TBT14_KAKUNIN_USER_ID",gxvar:"A931TBT14_KAKUNIN_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A931TBT14_KAKUNIN_USER_ID=a
},v2z:function(a){gx.O.Z931TBT14_KAKUNIN_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBT14_KAKUNIN_USER_ID",gx.O.A931TBT14_KAKUNIN_USER_ID,0)},c2v:function(){gx.O.A931TBT14_KAKUNIN_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBT14_KAKUNIN_USER_ID")},nac:function(){return false}};this.GXValidFnc[96]={fld:"TEXTBLOCKTBT14_KAKUNIN_COMMENT",format:0,grid:0};this.GXValidFnc[98]={lvl:0,type:"svchar",len:2000,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBT14_KAKUNIN_COMMENT",gxz:"Z933TBT14_KAKUNIN_COMMENT",gxold:"O933TBT14_KAKUNIN_COMMENT",gxvar:"A933TBT14_KAKUNIN_COMMENT",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A933TBT14_KAKUNIN_COMMENT=a
},v2z:function(a){gx.O.Z933TBT14_KAKUNIN_COMMENT=a},v2c:function(){gx.fn.setControlValue("TBT14_KAKUNIN_COMMENT",gx.O.A933TBT14_KAKUNIN_COMMENT,0)},c2v:function(){gx.O.A933TBT14_KAKUNIN_COMMENT=this.val()},val:function(){return gx.fn.getControlValue("TBT14_KAKUNIN_COMMENT")},nac:function(){return false}};this.GXValidFnc[101]={fld:"TEXTBLOCKTBT14_KANRYO_FLG",format:0,grid:0};this.GXValidFnc[103]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBT14_KANRYO_FLG",gxz:"Z924TBT14_KANRYO_FLG",gxold:"O924TBT14_KANRYO_FLG",gxvar:"A924TBT14_KANRYO_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A924TBT14_KANRYO_FLG=a
},v2z:function(a){gx.O.Z924TBT14_KANRYO_FLG=a},v2c:function(){gx.fn.setControlValue("TBT14_KANRYO_FLG",gx.O.A924TBT14_KANRYO_FLG,0)},c2v:function(){gx.O.A924TBT14_KANRYO_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBT14_KANRYO_FLG")},nac:function(){return false}};this.GXValidFnc[106]={fld:"TEXTBLOCKTBT14_DEL_FLG",format:0,grid:0};this.GXValidFnc[108]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBT14_DEL_FLG",gxz:"Z337TBT14_DEL_FLG",gxold:"O337TBT14_DEL_FLG",gxvar:"A337TBT14_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A337TBT14_DEL_FLG=a
},v2z:function(a){gx.O.Z337TBT14_DEL_FLG=a},v2c:function(){gx.fn.setControlValue("TBT14_DEL_FLG",gx.O.A337TBT14_DEL_FLG,0)},c2v:function(){gx.O.A337TBT14_DEL_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBT14_DEL_FLG")},nac:function(){return false}};this.GXValidFnc[111]={fld:"TEXTBLOCKTBT14_CRT_DATETIME",format:0,grid:0};this.GXValidFnc[113]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt14_crt_datetime,isvalid:null,fld:"TBT14_CRT_DATETIME",gxz:"Z338TBT14_CRT_DATETIME",gxold:"O338TBT14_CRT_DATETIME",gxvar:"A338TBT14_CRT_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[113],ip:[113],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A338TBT14_CRT_DATETIME=gx.fn.toDatetimeValue(a)
},v2z:function(a){gx.O.Z338TBT14_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBT14_CRT_DATETIME",gx.O.A338TBT14_CRT_DATETIME,0)},c2v:function(){gx.O.A338TBT14_CRT_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TBT14_CRT_DATETIME")},nac:function(){return false}};this.GXValidFnc[116]={fld:"TEXTBLOCKTBT14_CRT_USER_ID",format:0,grid:0};this.GXValidFnc[118]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBT14_CRT_USER_ID",gxz:"Z339TBT14_CRT_USER_ID",gxold:"O339TBT14_CRT_USER_ID",gxvar:"A339TBT14_CRT_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A339TBT14_CRT_USER_ID=a
},v2z:function(a){gx.O.Z339TBT14_CRT_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBT14_CRT_USER_ID",gx.O.A339TBT14_CRT_USER_ID,0)},c2v:function(){gx.O.A339TBT14_CRT_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBT14_CRT_USER_ID")},nac:function(){return false}};this.GXValidFnc[121]={fld:"TEXTBLOCKTBT14_CRT_PROG_NM",format:0,grid:0};this.GXValidFnc[123]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBT14_CRT_PROG_NM",gxz:"Z340TBT14_CRT_PROG_NM",gxold:"O340TBT14_CRT_PROG_NM",gxvar:"A340TBT14_CRT_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A340TBT14_CRT_PROG_NM=a
},v2z:function(a){gx.O.Z340TBT14_CRT_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBT14_CRT_PROG_NM",gx.O.A340TBT14_CRT_PROG_NM,0)},c2v:function(){gx.O.A340TBT14_CRT_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBT14_CRT_PROG_NM")},nac:function(){return false}};this.GXValidFnc[126]={fld:"TEXTBLOCKTBT14_UPD_DATETIME",format:0,grid:0};this.GXValidFnc[128]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt14_upd_datetime,isvalid:null,fld:"TBT14_UPD_DATETIME",gxz:"Z341TBT14_UPD_DATETIME",gxold:"O341TBT14_UPD_DATETIME",gxvar:"A341TBT14_UPD_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[128],ip:[128],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A341TBT14_UPD_DATETIME=gx.fn.toDatetimeValue(a)
},v2z:function(a){gx.O.Z341TBT14_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBT14_UPD_DATETIME",gx.O.A341TBT14_UPD_DATETIME,0)},c2v:function(){gx.O.A341TBT14_UPD_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TBT14_UPD_DATETIME")},nac:function(){return false}};this.GXValidFnc[131]={fld:"TEXTBLOCKTBT14_UPD_USER_ID",format:0,grid:0};this.GXValidFnc[133]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBT14_UPD_USER_ID",gxz:"Z342TBT14_UPD_USER_ID",gxold:"O342TBT14_UPD_USER_ID",gxvar:"A342TBT14_UPD_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A342TBT14_UPD_USER_ID=a
},v2z:function(a){gx.O.Z342TBT14_UPD_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBT14_UPD_USER_ID",gx.O.A342TBT14_UPD_USER_ID,0)},c2v:function(){gx.O.A342TBT14_UPD_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBT14_UPD_USER_ID")},nac:function(){return false}};this.GXValidFnc[136]={fld:"TEXTBLOCKTBT14_UPD_PROG_NM",format:0,grid:0};this.GXValidFnc[138]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBT14_UPD_PROG_NM",gxz:"Z343TBT14_UPD_PROG_NM",gxold:"O343TBT14_UPD_PROG_NM",gxvar:"A343TBT14_UPD_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A343TBT14_UPD_PROG_NM=a
},v2z:function(a){gx.O.Z343TBT14_UPD_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBT14_UPD_PROG_NM",gx.O.A343TBT14_UPD_PROG_NM,0)},c2v:function(){gx.O.A343TBT14_UPD_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBT14_UPD_PROG_NM")},nac:function(){return false}};this.GXValidFnc[141]={fld:"TEXTBLOCKTBT14_UPD_CNT",format:0,grid:0};this.GXValidFnc[143]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt14_upd_cnt,isvalid:null,rgrid:[],fld:"TBT14_UPD_CNT",gxz:"Z344TBT14_UPD_CNT",gxold:"O344TBT14_UPD_CNT",gxvar:"A344TBT14_UPD_CNT",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A344TBT14_UPD_CNT=gx.num.intval(a)
},v2z:function(a){gx.O.Z344TBT14_UPD_CNT=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT14_UPD_CNT",gx.O.A344TBT14_UPD_CNT,0)},c2v:function(){gx.O.A344TBT14_UPD_CNT=this.val()},val:function(){return gx.fn.getIntegerValue("TBT14_UPD_CNT",",")},nac:function(){return false}};this.A329TBT14_STUDY_ID=0;this.Z329TBT14_STUDY_ID=0;this.O329TBT14_STUDY_ID=0;this.A330TBT14_SUBJECT_ID=0;this.Z330TBT14_SUBJECT_ID=0;this.O330TBT14_SUBJECT_ID=0;this.A922TBT14_MEMO_NO=0;this.Z922TBT14_MEMO_NO=0;this.O922TBT14_MEMO_NO=0;
this.A331TBT14_CRF_ID=0;this.Z331TBT14_CRF_ID=0;this.O331TBT14_CRF_ID=0;this.A332TBT14_CRF_VERSION=0;this.Z332TBT14_CRF_VERSION=0;this.O332TBT14_CRF_VERSION=0;this.A923TBT14_MEMO_KBN="";this.Z923TBT14_MEMO_KBN="";this.O923TBT14_MEMO_KBN="";this.A335TBT14_MEMO="";this.Z335TBT14_MEMO="";this.O335TBT14_MEMO="";this.A928TBT14_REQUEST_SITE_ID="";this.Z928TBT14_REQUEST_SITE_ID="";this.O928TBT14_REQUEST_SITE_ID="";this.A929TBT14_REQUEST_AUTH_CD="";this.Z929TBT14_REQUEST_AUTH_CD="";this.O929TBT14_REQUEST_AUTH_CD="";
this.A930TBT14_CRT_AUTH_CD="";this.Z930TBT14_CRT_AUTH_CD="";this.O930TBT14_CRT_AUTH_CD="";this.A927TBT14_KAKUNIN_FLG="";this.Z927TBT14_KAKUNIN_FLG="";this.O927TBT14_KAKUNIN_FLG="";this.A931TBT14_KAKUNIN_USER_ID="";this.Z931TBT14_KAKUNIN_USER_ID="";this.O931TBT14_KAKUNIN_USER_ID="";this.A933TBT14_KAKUNIN_COMMENT="";this.Z933TBT14_KAKUNIN_COMMENT="";this.O933TBT14_KAKUNIN_COMMENT="";this.A924TBT14_KANRYO_FLG="";this.Z924TBT14_KANRYO_FLG="";this.O924TBT14_KANRYO_FLG="";this.A337TBT14_DEL_FLG="";this.Z337TBT14_DEL_FLG="";
this.O337TBT14_DEL_FLG="";this.A338TBT14_CRT_DATETIME=gx.date.nullDate();this.Z338TBT14_CRT_DATETIME=gx.date.nullDate();this.O338TBT14_CRT_DATETIME=gx.date.nullDate();this.A339TBT14_CRT_USER_ID="";this.Z339TBT14_CRT_USER_ID="";this.O339TBT14_CRT_USER_ID="";this.A340TBT14_CRT_PROG_NM="";this.Z340TBT14_CRT_PROG_NM="";this.O340TBT14_CRT_PROG_NM="";this.A341TBT14_UPD_DATETIME=gx.date.nullDate();this.Z341TBT14_UPD_DATETIME=gx.date.nullDate();this.O341TBT14_UPD_DATETIME=gx.date.nullDate();this.A342TBT14_UPD_USER_ID="";
this.Z342TBT14_UPD_USER_ID="";this.O342TBT14_UPD_USER_ID="";this.A343TBT14_UPD_PROG_NM="";this.Z343TBT14_UPD_PROG_NM="";this.O343TBT14_UPD_PROG_NM="";this.A344TBT14_UPD_CNT=0;this.Z344TBT14_UPD_CNT=0;this.O344TBT14_UPD_CNT=0;this.AV8W_BC_FLG="";this.AV9Pgmname="";this.ServerEvents=["e120s2_client","e130s27_client","e140s27_client"];this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];this.VarControlMap.AV9Pgmname={id:"vPGMNAME",grid:0,type:"char"};this.VarControlMap.Gx_mode={id:"vMODE",grid:0,type:"char"};
this.SetStandaloneVars();this.LvlOlds[27]=["O344TBT14_UPD_CNT"]}tbt14_crf_memo.prototype=new gx.GxObject;gx.setParentObj(new tbt14_crf_memo());