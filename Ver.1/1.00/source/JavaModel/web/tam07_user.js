gx.evt.autoSkip=false;function tam07_user(){this.ServerClass="TAM07_USER";this.PackageName="";this.setObjectType("trn");this.hasEnterEvent=true;this.SetStandaloneVars=function(){this.AV9Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tam07_user_id=function(){gx.ajax.validSrvEvt("dyncall","valid_Tam07_user_id",["gx.O.A8TAM07_USER_ID",'gx.date.urlDateTime(gx.O.A35TAM07_CRT_DATETIME,"Y4MD")',"gx.O.A76TAM07_CRT_USER_ID",'gx.date.urlDateTime(gx.O.A37TAM07_UPD_DATETIME,"Y4MD")',"gx.O.A77TAM07_UPD_USER_ID","gx.O.A112TAM07_UPD_CNT","gx.O.A2TAM07_USER_NM","gx.O.A126TAM07_USER_KANA_NM","gx.O.A7TAM07_PWD","gx.O.A147TAM07_SITE_ID","gx.O.A593TAM07_EMAIL","gx.O.A16TAM07_DEL_FLG","gx.O.A36TAM07_CRT_PROG_NM","gx.O.A38TAM07_UPD_PROG_NM","gx.O.A14TAM07_AUTH_CD"],["A35TAM07_CRT_DATETIME","A76TAM07_CRT_USER_ID","A37TAM07_UPD_DATETIME","A77TAM07_UPD_USER_ID","A112TAM07_UPD_CNT","A2TAM07_USER_NM","A126TAM07_USER_KANA_NM","A7TAM07_PWD","A14TAM07_AUTH_CD","A147TAM07_SITE_ID","A593TAM07_EMAIL","A16TAM07_DEL_FLG","A36TAM07_CRT_PROG_NM","A38TAM07_UPD_PROG_NM","AV9Pgmname","Gx_mode","Z8TAM07_USER_ID","Z35TAM07_CRT_DATETIME","Z76TAM07_CRT_USER_ID","Z37TAM07_UPD_DATETIME","Z77TAM07_UPD_USER_ID","Z112TAM07_UPD_CNT","Z2TAM07_USER_NM","Z126TAM07_USER_KANA_NM","Z7TAM07_PWD","Z14TAM07_AUTH_CD","Z147TAM07_SITE_ID","Z593TAM07_EMAIL","Z16TAM07_DEL_FLG","Z36TAM07_CRT_PROG_NM","Z38TAM07_UPD_PROG_NM","ZV9Pgmname","O112TAM07_UPD_CNT",["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"]]);
return true};this.Valid_Tam07_auth_cd=function(){gx.ajax.validSrvEvt("dyncall","valid_Tam07_auth_cd",["gx.O.A14TAM07_AUTH_CD"],[]);return true};this.Valid_Tam07_crt_datetime=function(){try{var a=gx.util.balloon.getNew("TAM07_CRT_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("").compare(this.A35TAM07_CRT_DATETIME)==0)||new gx.date.gxdate(this.A35TAM07_CRT_DATETIME).compare(gx.date.ymdhmstot(1000,1,1,0,0,0))>=0)){try{a.setError("フィールド　作成日時 は範囲外です");this.AnyError=1}catch(b){}}}catch(b){}try{if(a==null){return true
}return a.show()}catch(b){}return true};this.Valid_Tam07_upd_datetime=function(){try{var a=gx.util.balloon.getNew("TAM07_UPD_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("").compare(this.A37TAM07_UPD_DATETIME)==0)||new gx.date.gxdate(this.A37TAM07_UPD_DATETIME).compare(gx.date.ymdhmstot(1000,1,1,0,0,0))>=0)){try{a.setError("フィールド　更新日時 は範囲外です");this.AnyError=1}catch(b){}}}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tam07_upd_cnt=function(){try{var a=gx.util.balloon.getNew("TAM07_UPD_CNT");
this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.e120a2_client=function(){this.executeServerEvent("AFTER TRN",true)};this.e130a10_client=function(){this.executeServerEvent("ENTER",true)};this.e140a10_client=function(){this.executeServerEvent("CANCEL",true)};this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,26,27,33,36,38,41,43,46,48,51,53,56,58,61,63,66,68,71,73,76,78,81,83,86,88,91,93,96,98,101,103,106,108];this.GXLastCtrlId=108;
this.GXValidFnc[2]={fld:"TABLEMAIN",grid:0};this.GXValidFnc[5]={fld:"TABLETOOLBAR",grid:0};this.GXValidFnc[8]={fld:"BTN_FIRST",grid:0};this.GXValidFnc[9]={fld:"BTN_FIRST_SEPARATOR",grid:0};this.GXValidFnc[10]={fld:"BTN_PREVIOUS",grid:0};this.GXValidFnc[11]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};this.GXValidFnc[12]={fld:"BTN_NEXT",grid:0};this.GXValidFnc[13]={fld:"BTN_NEXT_SEPARATOR",grid:0};this.GXValidFnc[14]={fld:"BTN_LAST",grid:0};this.GXValidFnc[15]={fld:"BTN_LAST_SEPARATOR",grid:0};this.GXValidFnc[16]={fld:"BTN_SELECT",grid:0};
this.GXValidFnc[17]={fld:"BTN_SELECT_SEPARATOR",grid:0};this.GXValidFnc[18]={fld:"BTN_ENTER2",grid:0};this.GXValidFnc[19]={fld:"BTN_ENTER2_SEPARATOR",grid:0};this.GXValidFnc[20]={fld:"BTN_CANCEL2",grid:0};this.GXValidFnc[21]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};this.GXValidFnc[22]={fld:"BTN_DELETE2",grid:0};this.GXValidFnc[23]={fld:"BTN_DELETE2_SEPARATOR",grid:0};this.GXValidFnc[26]={fld:"GROUPDATA",grid:0};this.GXValidFnc[27]={fld:"TABLE1",grid:0};this.GXValidFnc[33]={fld:"TABLE2",grid:0};this.GXValidFnc[36]={fld:"TEXTBLOCKTAM07_USER_ID",format:0,grid:0};
this.GXValidFnc[38]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam07_user_id,isvalid:null,fld:"TAM07_USER_ID",gxz:"Z8TAM07_USER_ID",gxold:"O8TAM07_USER_ID",gxvar:"A8TAM07_USER_ID",ucs:[],op:[58,103,88,73,68,63,53,48,43,108,98,93,83,78],ip:[58,103,88,73,68,63,53,48,43,108,98,93,83,78,38],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A8TAM07_USER_ID=a},v2z:function(a){gx.O.Z8TAM07_USER_ID=a},v2c:function(){gx.fn.setControlValue("TAM07_USER_ID",gx.O.A8TAM07_USER_ID,0)
},c2v:function(){gx.O.A8TAM07_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TAM07_USER_ID")},nac:function(){return false}};this.GXValidFnc[41]={fld:"TEXTBLOCKTAM07_USER_NM",format:0,grid:0};this.GXValidFnc[43]={lvl:0,type:"svchar",len:30,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TAM07_USER_NM",gxz:"Z2TAM07_USER_NM",gxold:"O2TAM07_USER_NM",gxvar:"A2TAM07_USER_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A2TAM07_USER_NM=a},v2z:function(a){gx.O.Z2TAM07_USER_NM=a
},v2c:function(){gx.fn.setControlValue("TAM07_USER_NM",gx.O.A2TAM07_USER_NM,0)},c2v:function(){gx.O.A2TAM07_USER_NM=this.val()},val:function(){return gx.fn.getControlValue("TAM07_USER_NM")},nac:function(){return false}};this.GXValidFnc[46]={fld:"TEXTBLOCKTAM07_USER_KANA_NM",format:0,grid:0};this.GXValidFnc[48]={lvl:0,type:"svchar",len:20,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TAM07_USER_KANA_NM",gxz:"Z126TAM07_USER_KANA_NM",gxold:"O126TAM07_USER_KANA_NM",gxvar:"A126TAM07_USER_KANA_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A126TAM07_USER_KANA_NM=a
},v2z:function(a){gx.O.Z126TAM07_USER_KANA_NM=a},v2c:function(){gx.fn.setControlValue("TAM07_USER_KANA_NM",gx.O.A126TAM07_USER_KANA_NM,0)},c2v:function(){gx.O.A126TAM07_USER_KANA_NM=this.val()},val:function(){return gx.fn.getControlValue("TAM07_USER_KANA_NM")},nac:function(){return false}};this.GXValidFnc[51]={fld:"TEXTBLOCKTAM07_PWD",format:0,grid:0};this.GXValidFnc[53]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TAM07_PWD",gxz:"Z7TAM07_PWD",gxold:"O7TAM07_PWD",gxvar:"A7TAM07_PWD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A7TAM07_PWD=a
},v2z:function(a){gx.O.Z7TAM07_PWD=a},v2c:function(){gx.fn.setControlValue("TAM07_PWD",gx.O.A7TAM07_PWD,0)},c2v:function(){gx.O.A7TAM07_PWD=this.val()},val:function(){return gx.fn.getControlValue("TAM07_PWD")},nac:function(){return false}};this.GXValidFnc[56]={fld:"TEXTBLOCKTAM07_AUTH_CD",format:0,grid:0};this.GXValidFnc[58]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam07_auth_cd,isvalid:null,fld:"TAM07_AUTH_CD",gxz:"Z14TAM07_AUTH_CD",gxold:"O14TAM07_AUTH_CD",gxvar:"A14TAM07_AUTH_CD",ucs:[],op:[],ip:[58],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A14TAM07_AUTH_CD=a
},v2z:function(a){gx.O.Z14TAM07_AUTH_CD=a},v2c:function(){gx.fn.setControlValue("TAM07_AUTH_CD",gx.O.A14TAM07_AUTH_CD,0)},c2v:function(){gx.O.A14TAM07_AUTH_CD=this.val()},val:function(){return gx.fn.getControlValue("TAM07_AUTH_CD")},nac:function(){return false}};this.GXValidFnc[61]={fld:"TEXTBLOCKTAM07_SITE_ID",format:0,grid:0};this.GXValidFnc[63]={lvl:0,type:"svchar",len:20,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TAM07_SITE_ID",gxz:"Z147TAM07_SITE_ID",gxold:"O147TAM07_SITE_ID",gxvar:"A147TAM07_SITE_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A147TAM07_SITE_ID=a
},v2z:function(a){gx.O.Z147TAM07_SITE_ID=a},v2c:function(){gx.fn.setControlValue("TAM07_SITE_ID",gx.O.A147TAM07_SITE_ID,0)},c2v:function(){gx.O.A147TAM07_SITE_ID=this.val()},val:function(){return gx.fn.getControlValue("TAM07_SITE_ID")},nac:function(){return false}};this.GXValidFnc[66]={fld:"TEXTBLOCKTAM07_EMAIL",format:0,grid:0};this.GXValidFnc[68]={lvl:0,type:"svchar",len:256,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TAM07_EMAIL",gxz:"Z593TAM07_EMAIL",gxold:"O593TAM07_EMAIL",gxvar:"A593TAM07_EMAIL",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A593TAM07_EMAIL=a
},v2z:function(a){gx.O.Z593TAM07_EMAIL=a},v2c:function(){gx.fn.setControlValue("TAM07_EMAIL",gx.O.A593TAM07_EMAIL,0)},c2v:function(){gx.O.A593TAM07_EMAIL=this.val()},val:function(){return gx.fn.getControlValue("TAM07_EMAIL")},nac:function(){return false}};this.GXValidFnc[71]={fld:"TEXTBLOCKTAM07_DEL_FLG",format:0,grid:0};this.GXValidFnc[73]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TAM07_DEL_FLG",gxz:"Z16TAM07_DEL_FLG",gxold:"O16TAM07_DEL_FLG",gxvar:"A16TAM07_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A16TAM07_DEL_FLG=a
},v2z:function(a){gx.O.Z16TAM07_DEL_FLG=a},v2c:function(){gx.fn.setControlValue("TAM07_DEL_FLG",gx.O.A16TAM07_DEL_FLG,0)},c2v:function(){gx.O.A16TAM07_DEL_FLG=this.val()},val:function(){return gx.fn.getControlValue("TAM07_DEL_FLG")},nac:function(){return false}};this.GXValidFnc[76]={fld:"TEXTBLOCKTAM07_CRT_DATETIME",format:0,grid:0};this.GXValidFnc[78]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam07_crt_datetime,isvalid:null,fld:"TAM07_CRT_DATETIME",gxz:"Z35TAM07_CRT_DATETIME",gxold:"O35TAM07_CRT_DATETIME",gxvar:"A35TAM07_CRT_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[78],ip:[78],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A35TAM07_CRT_DATETIME=gx.fn.toDatetimeValue(a)
},v2z:function(a){gx.O.Z35TAM07_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TAM07_CRT_DATETIME",gx.O.A35TAM07_CRT_DATETIME,0)},c2v:function(){gx.O.A35TAM07_CRT_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TAM07_CRT_DATETIME")},nac:function(){return false}};this.GXValidFnc[81]={fld:"TEXTBLOCKTAM07_CRT_USER_ID",format:0,grid:0};this.GXValidFnc[83]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TAM07_CRT_USER_ID",gxz:"Z76TAM07_CRT_USER_ID",gxold:"O76TAM07_CRT_USER_ID",gxvar:"A76TAM07_CRT_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A76TAM07_CRT_USER_ID=a
},v2z:function(a){gx.O.Z76TAM07_CRT_USER_ID=a},v2c:function(){gx.fn.setControlValue("TAM07_CRT_USER_ID",gx.O.A76TAM07_CRT_USER_ID,0)},c2v:function(){gx.O.A76TAM07_CRT_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TAM07_CRT_USER_ID")},nac:function(){return false}};this.GXValidFnc[86]={fld:"TEXTBLOCKTAM07_CRT_PROG_NM",format:0,grid:0};this.GXValidFnc[88]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TAM07_CRT_PROG_NM",gxz:"Z36TAM07_CRT_PROG_NM",gxold:"O36TAM07_CRT_PROG_NM",gxvar:"A36TAM07_CRT_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A36TAM07_CRT_PROG_NM=a
},v2z:function(a){gx.O.Z36TAM07_CRT_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TAM07_CRT_PROG_NM",gx.O.A36TAM07_CRT_PROG_NM,0)},c2v:function(){gx.O.A36TAM07_CRT_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TAM07_CRT_PROG_NM")},nac:function(){return false}};this.GXValidFnc[91]={fld:"TEXTBLOCKTAM07_UPD_DATETIME",format:0,grid:0};this.GXValidFnc[93]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam07_upd_datetime,isvalid:null,fld:"TAM07_UPD_DATETIME",gxz:"Z37TAM07_UPD_DATETIME",gxold:"O37TAM07_UPD_DATETIME",gxvar:"A37TAM07_UPD_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[93],ip:[93],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A37TAM07_UPD_DATETIME=gx.fn.toDatetimeValue(a)
},v2z:function(a){gx.O.Z37TAM07_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TAM07_UPD_DATETIME",gx.O.A37TAM07_UPD_DATETIME,0)},c2v:function(){gx.O.A37TAM07_UPD_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TAM07_UPD_DATETIME")},nac:function(){return false}};this.GXValidFnc[96]={fld:"TEXTBLOCKTAM07_UPD_USER_ID",format:0,grid:0};this.GXValidFnc[98]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TAM07_UPD_USER_ID",gxz:"Z77TAM07_UPD_USER_ID",gxold:"O77TAM07_UPD_USER_ID",gxvar:"A77TAM07_UPD_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A77TAM07_UPD_USER_ID=a
},v2z:function(a){gx.O.Z77TAM07_UPD_USER_ID=a},v2c:function(){gx.fn.setControlValue("TAM07_UPD_USER_ID",gx.O.A77TAM07_UPD_USER_ID,0)},c2v:function(){gx.O.A77TAM07_UPD_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TAM07_UPD_USER_ID")},nac:function(){return false}};this.GXValidFnc[101]={fld:"TEXTBLOCKTAM07_UPD_PROG_NM",format:0,grid:0};this.GXValidFnc[103]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TAM07_UPD_PROG_NM",gxz:"Z38TAM07_UPD_PROG_NM",gxold:"O38TAM07_UPD_PROG_NM",gxvar:"A38TAM07_UPD_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A38TAM07_UPD_PROG_NM=a
},v2z:function(a){gx.O.Z38TAM07_UPD_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TAM07_UPD_PROG_NM",gx.O.A38TAM07_UPD_PROG_NM,0)},c2v:function(){gx.O.A38TAM07_UPD_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TAM07_UPD_PROG_NM")},nac:function(){return false}};this.GXValidFnc[106]={fld:"TEXTBLOCKTAM07_UPD_CNT",format:0,grid:0};this.GXValidFnc[108]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam07_upd_cnt,isvalid:null,rgrid:[],fld:"TAM07_UPD_CNT",gxz:"Z112TAM07_UPD_CNT",gxold:"O112TAM07_UPD_CNT",gxvar:"A112TAM07_UPD_CNT",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A112TAM07_UPD_CNT=gx.num.intval(a)
},v2z:function(a){gx.O.Z112TAM07_UPD_CNT=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TAM07_UPD_CNT",gx.O.A112TAM07_UPD_CNT,0)},c2v:function(){gx.O.A112TAM07_UPD_CNT=this.val()},val:function(){return gx.fn.getIntegerValue("TAM07_UPD_CNT",",")},nac:function(){return false}};this.A8TAM07_USER_ID="";this.Z8TAM07_USER_ID="";this.O8TAM07_USER_ID="";this.A2TAM07_USER_NM="";this.Z2TAM07_USER_NM="";this.O2TAM07_USER_NM="";this.A126TAM07_USER_KANA_NM="";this.Z126TAM07_USER_KANA_NM="";this.O126TAM07_USER_KANA_NM="";
this.A7TAM07_PWD="";this.Z7TAM07_PWD="";this.O7TAM07_PWD="";this.A14TAM07_AUTH_CD="";this.Z14TAM07_AUTH_CD="";this.O14TAM07_AUTH_CD="";this.A147TAM07_SITE_ID="";this.Z147TAM07_SITE_ID="";this.O147TAM07_SITE_ID="";this.A593TAM07_EMAIL="";this.Z593TAM07_EMAIL="";this.O593TAM07_EMAIL="";this.A16TAM07_DEL_FLG="";this.Z16TAM07_DEL_FLG="";this.O16TAM07_DEL_FLG="";this.A35TAM07_CRT_DATETIME=gx.date.nullDate();this.Z35TAM07_CRT_DATETIME=gx.date.nullDate();this.O35TAM07_CRT_DATETIME=gx.date.nullDate();this.A76TAM07_CRT_USER_ID="";
this.Z76TAM07_CRT_USER_ID="";this.O76TAM07_CRT_USER_ID="";this.A36TAM07_CRT_PROG_NM="";this.Z36TAM07_CRT_PROG_NM="";this.O36TAM07_CRT_PROG_NM="";this.A37TAM07_UPD_DATETIME=gx.date.nullDate();this.Z37TAM07_UPD_DATETIME=gx.date.nullDate();this.O37TAM07_UPD_DATETIME=gx.date.nullDate();this.A77TAM07_UPD_USER_ID="";this.Z77TAM07_UPD_USER_ID="";this.O77TAM07_UPD_USER_ID="";this.A38TAM07_UPD_PROG_NM="";this.Z38TAM07_UPD_PROG_NM="";this.O38TAM07_UPD_PROG_NM="";this.A112TAM07_UPD_CNT=0;this.Z112TAM07_UPD_CNT=0;
this.O112TAM07_UPD_CNT=0;this.AV8W_BC_FLG="";this.AV9Pgmname="";this.ServerEvents=["e120a2_client","e130a10_client","e140a10_client"];this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];this.VarControlMap.AV9Pgmname={id:"vPGMNAME",grid:0,type:"char"};this.VarControlMap.Gx_mode={id:"vMODE",grid:0,type:"char"};this.SetStandaloneVars();this.LvlOlds[10]=["O112TAM07_UPD_CNT"]}tam07_user.prototype=new gx.GxObject;gx.setParentObj(new tam07_user());