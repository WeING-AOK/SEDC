gx.evt.autoSkip=false;function tam03_appli(){this.ServerClass="TAM03_APPLI";this.PackageName="";this.setObjectType("trn");this.hasEnterEvent=true;this.SetStandaloneVars=function(){this.A97TAM03_UPD_CNT=gx.fn.getIntegerValue("TAM03_UPD_CNT",",");this.Gx_BScreen=gx.fn.getIntegerValue("vGXBSCREEN",",");this.AV14Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tam03_app_id=function(){gx.ajax.validSrvEvt("dyncall","valid_Tam03_app_id",["gx.O.A88TAM03_APP_ID",'gx.date.urlDateTime(gx.O.A91TAM03_CRT_DATETIME,"Y4MD")',"gx.O.A92TAM03_CRT_USER_ID",'gx.date.urlDateTime(gx.O.A94TAM03_UPD_DATETIME,"Y4MD")',"gx.O.A95TAM03_UPD_USER_ID","gx.O.A97TAM03_UPD_CNT","gx.O.A127TAM03_APP_NM","gx.O.A128TAM03_SUB_MENU_FLG","gx.O.A89TAM03_KIDO_PG","gx.O.A90TAM03_DEL_FLG","gx.O.A93TAM03_CRT_PROG_NM","gx.O.A96TAM03_UPD_PROG_NM"],["A91TAM03_CRT_DATETIME","A92TAM03_CRT_USER_ID","A94TAM03_UPD_DATETIME","A95TAM03_UPD_USER_ID","A97TAM03_UPD_CNT","A127TAM03_APP_NM","A128TAM03_SUB_MENU_FLG","A89TAM03_KIDO_PG","A90TAM03_DEL_FLG","A93TAM03_CRT_PROG_NM","A96TAM03_UPD_PROG_NM","AV14Pgmname","Gx_mode","Z88TAM03_APP_ID","Z91TAM03_CRT_DATETIME","Z92TAM03_CRT_USER_ID","Z94TAM03_UPD_DATETIME","Z95TAM03_UPD_USER_ID","Z97TAM03_UPD_CNT","Z127TAM03_APP_NM","Z128TAM03_SUB_MENU_FLG","Z89TAM03_KIDO_PG","Z90TAM03_DEL_FLG","Z93TAM03_CRT_PROG_NM","Z96TAM03_UPD_PROG_NM","ZV14Pgmname","O97TAM03_UPD_CNT",["A88TAM03_APP_ID","Enabled"],["A91TAM03_CRT_DATETIME","Visible"],["A93TAM03_CRT_PROG_NM","Visible"],["A94TAM03_UPD_DATETIME","Visible"],["A96TAM03_UPD_PROG_NM","Visible"],["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"],["BTN_CANCEL","Enabled"]]);
return true};this.Valid_Tam03_app_nm=function(){try{var a=gx.util.balloon.getNew("TAM03_APP_NM");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tam03_sub_menu_flg=function(){try{var a=gx.util.balloon.getNew("TAM03_SUB_MENU_FLG");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tam03_kido_pg=function(){try{var a=gx.util.balloon.getNew("TAM03_KIDO_PG");this.AnyError=0}catch(b){}try{if(a==null){return true
}return a.show()}catch(b){}return true};this.Valid_Tam03_del_flg=function(){try{var a=gx.util.balloon.getNew("TAM03_DEL_FLG");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tam03_crt_datetime=function(){try{var a=gx.util.balloon.getNew("TAM03_CRT_DATETIME");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tam03_crt_user_id=function(){try{var a=gx.util.balloon.getNew("TAM03_CRT_USER_ID");
this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tam03_crt_prog_nm=function(){try{var a=gx.util.balloon.getNew("TAM03_CRT_PROG_NM");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tam03_upd_datetime=function(){try{var a=gx.util.balloon.getNew("TAM03_UPD_DATETIME");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tam03_upd_user_id=function(){try{var a=gx.util.balloon.getNew("TAM03_UPD_USER_ID");
this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tam03_upd_prog_nm=function(){try{var a=gx.util.balloon.getNew("TAM03_UPD_PROG_NM");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.e12082_client=function(){this.executeServerEvent("'BTN_CLER'",true)};this.e13088_client=function(){this.executeServerEvent("ENTER",true)};this.e14088_client=function(){this.executeServerEvent("CANCEL",true)};this.GXValidFnc=[];
this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,26,27,33,36,37,39,43,46,48,51,52,54,57,59,62,64,67,69,75,77,80,82,85,87,90,92,95,97,100,102,108,111,114,117];this.GXLastCtrlId=117;this.GXValidFnc[2]={fld:"TABLEMAIN",grid:0};this.GXValidFnc[5]={fld:"TABLETOOLBAR",grid:0};this.GXValidFnc[8]={fld:"BTN_FIRST",grid:0};this.GXValidFnc[9]={fld:"BTN_FIRST_SEPARATOR",grid:0};this.GXValidFnc[10]={fld:"BTN_PREVIOUS",grid:0};this.GXValidFnc[11]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};this.GXValidFnc[12]={fld:"BTN_NEXT",grid:0};
this.GXValidFnc[13]={fld:"BTN_NEXT_SEPARATOR",grid:0};this.GXValidFnc[14]={fld:"BTN_LAST",grid:0};this.GXValidFnc[15]={fld:"BTN_LAST_SEPARATOR",grid:0};this.GXValidFnc[16]={fld:"BTN_SELECT",grid:0};this.GXValidFnc[17]={fld:"BTN_SELECT_SEPARATOR",grid:0};this.GXValidFnc[18]={fld:"BTN_ENTER2",grid:0};this.GXValidFnc[19]={fld:"BTN_ENTER2_SEPARATOR",grid:0};this.GXValidFnc[20]={fld:"BTN_CANCEL2",grid:0};this.GXValidFnc[21]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};this.GXValidFnc[22]={fld:"BTN_DELETE2",grid:0};
this.GXValidFnc[23]={fld:"BTN_DELETE2_SEPARATOR",grid:0};this.GXValidFnc[26]={fld:"GROUPDATA",grid:0};this.GXValidFnc[27]={fld:"TABLE1",grid:0};this.GXValidFnc[33]={fld:"TABLE2",grid:0};this.GXValidFnc[36]={fld:"IMAGE19",grid:0};this.GXValidFnc[37]={fld:"TEXTBLOCKTAM03_APP_ID",format:0,grid:0};this.GXValidFnc[39]={lvl:0,type:"svchar",len:7,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam03_app_id,isvalid:null,fld:"TAM03_APP_ID",gxz:"Z88TAM03_APP_ID",gxold:"O88TAM03_APP_ID",gxvar:"A88TAM03_APP_ID",ucs:[],op:[102,87,69,64,59,54,97,92,82,77],ip:[102,87,69,64,59,54,97,92,82,77,39],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A88TAM03_APP_ID=a
},v2z:function(a){gx.O.Z88TAM03_APP_ID=a},v2c:function(){gx.fn.setControlValue("TAM03_APP_ID",gx.O.A88TAM03_APP_ID,0)},c2v:function(){gx.O.A88TAM03_APP_ID=this.val()},val:function(){return gx.fn.getControlValue("TAM03_APP_ID")},nac:function(){return false}};this.GXValidFnc[43]={fld:"TABLE3",grid:0};this.GXValidFnc[46]={fld:"TEXTBLOCK2",format:0,grid:0};this.GXValidFnc[48]={fld:"TEXTBLOCK1",format:1,grid:0};this.GXValidFnc[51]={fld:"IMAGE20",grid:0};this.GXValidFnc[52]={fld:"TEXTBLOCKTAM03_APP_NM",format:0,grid:0};
this.GXValidFnc[54]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam03_app_nm,isvalid:null,fld:"TAM03_APP_NM",gxz:"Z127TAM03_APP_NM",gxold:"O127TAM03_APP_NM",gxvar:"A127TAM03_APP_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A127TAM03_APP_NM=a},v2z:function(a){gx.O.Z127TAM03_APP_NM=a},v2c:function(){gx.fn.setControlValue("TAM03_APP_NM",gx.O.A127TAM03_APP_NM,0)},c2v:function(){gx.O.A127TAM03_APP_NM=this.val()},val:function(){return gx.fn.getControlValue("TAM03_APP_NM")
},nac:function(){return false}};this.GXValidFnc[57]={fld:"TEXTBLOCKTAM03_SUB_MENU_FLG",format:0,grid:0};this.GXValidFnc[59]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam03_sub_menu_flg,isvalid:null,fld:"TAM03_SUB_MENU_FLG",gxz:"Z128TAM03_SUB_MENU_FLG",gxold:"O128TAM03_SUB_MENU_FLG",gxvar:"A128TAM03_SUB_MENU_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"radio",v2v:function(a){gx.O.A128TAM03_SUB_MENU_FLG=a},v2z:function(a){gx.O.Z128TAM03_SUB_MENU_FLG=a},v2c:function(){gx.fn.setRadioValue("TAM03_SUB_MENU_FLG",gx.O.A128TAM03_SUB_MENU_FLG)
},c2v:function(){gx.O.A128TAM03_SUB_MENU_FLG=this.val()},val:function(){return gx.fn.getControlValue("TAM03_SUB_MENU_FLG")},nac:function(){return false}};this.GXValidFnc[62]={fld:"TEXTBLOCKTAM03_KIDO_PG",format:0,grid:0};this.GXValidFnc[64]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam03_kido_pg,isvalid:null,fld:"TAM03_KIDO_PG",gxz:"Z89TAM03_KIDO_PG",gxold:"O89TAM03_KIDO_PG",gxvar:"A89TAM03_KIDO_PG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A89TAM03_KIDO_PG=a
},v2z:function(a){gx.O.Z89TAM03_KIDO_PG=a},v2c:function(){gx.fn.setControlValue("TAM03_KIDO_PG",gx.O.A89TAM03_KIDO_PG,0)},c2v:function(){gx.O.A89TAM03_KIDO_PG=this.val()},val:function(){return gx.fn.getControlValue("TAM03_KIDO_PG")},nac:function(){return false}};this.GXValidFnc[67]={fld:"TEXTBLOCKTAM01_DEL_FLG",format:0,grid:0};this.GXValidFnc[69]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam03_del_flg,isvalid:null,fld:"TAM03_DEL_FLG",gxz:"Z90TAM03_DEL_FLG",gxold:"O90TAM03_DEL_FLG",gxvar:"A90TAM03_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"radio",v2v:function(a){gx.O.A90TAM03_DEL_FLG=a
},v2z:function(a){gx.O.Z90TAM03_DEL_FLG=a},v2c:function(){gx.fn.setRadioValue("TAM03_DEL_FLG",gx.O.A90TAM03_DEL_FLG)},c2v:function(){gx.O.A90TAM03_DEL_FLG=this.val()},val:function(){return gx.fn.getControlValue("TAM03_DEL_FLG")},nac:function(){return false}};this.GXValidFnc[75]={fld:"TEXTBLOCKTAM03_CRT_DATETIME",format:0,grid:0};this.GXValidFnc[77]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tam03_crt_datetime,isvalid:null,fld:"TAM03_CRT_DATETIME",gxz:"Z91TAM03_CRT_DATETIME",gxold:"O91TAM03_CRT_DATETIME",gxvar:"A91TAM03_CRT_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A91TAM03_CRT_DATETIME=gx.fn.toDatetimeValue(a)
},v2z:function(a){gx.O.Z91TAM03_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TAM03_CRT_DATETIME",gx.O.A91TAM03_CRT_DATETIME,0)},c2v:function(){gx.O.A91TAM03_CRT_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TAM03_CRT_DATETIME")},nac:function(){return false}};this.GXValidFnc[80]={fld:"TEXTBLOCKTAM03_CRT_USER_ID",format:0,grid:0};this.GXValidFnc[82]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tam03_crt_user_id,isvalid:null,fld:"TAM03_CRT_USER_ID",gxz:"Z92TAM03_CRT_USER_ID",gxold:"O92TAM03_CRT_USER_ID",gxvar:"A92TAM03_CRT_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A92TAM03_CRT_USER_ID=a
},v2z:function(a){gx.O.Z92TAM03_CRT_USER_ID=a},v2c:function(){gx.fn.setControlValue("TAM03_CRT_USER_ID",gx.O.A92TAM03_CRT_USER_ID,0)},c2v:function(){gx.O.A92TAM03_CRT_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TAM03_CRT_USER_ID")},nac:function(){return false}};this.GXValidFnc[85]={fld:"TEXTBLOCKTAM03_CRT_PROG_NM",format:0,grid:0};this.GXValidFnc[87]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tam03_crt_prog_nm,isvalid:null,fld:"TAM03_CRT_PROG_NM",gxz:"Z93TAM03_CRT_PROG_NM",gxold:"O93TAM03_CRT_PROG_NM",gxvar:"A93TAM03_CRT_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A93TAM03_CRT_PROG_NM=a
},v2z:function(a){gx.O.Z93TAM03_CRT_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TAM03_CRT_PROG_NM",gx.O.A93TAM03_CRT_PROG_NM,0)},c2v:function(){gx.O.A93TAM03_CRT_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TAM03_CRT_PROG_NM")},nac:function(){return false}};this.GXValidFnc[90]={fld:"TEXTBLOCKTAM03_UPD_DATETIME",format:0,grid:0};this.GXValidFnc[92]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tam03_upd_datetime,isvalid:null,fld:"TAM03_UPD_DATETIME",gxz:"Z94TAM03_UPD_DATETIME",gxold:"O94TAM03_UPD_DATETIME",gxvar:"A94TAM03_UPD_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A94TAM03_UPD_DATETIME=gx.fn.toDatetimeValue(a)
},v2z:function(a){gx.O.Z94TAM03_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TAM03_UPD_DATETIME",gx.O.A94TAM03_UPD_DATETIME,0)},c2v:function(){gx.O.A94TAM03_UPD_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TAM03_UPD_DATETIME")},nac:function(){return false}};this.GXValidFnc[95]={fld:"TEXTBLOCKTAM03_UPD_USER_ID",format:0,grid:0};this.GXValidFnc[97]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tam03_upd_user_id,isvalid:null,fld:"TAM03_UPD_USER_ID",gxz:"Z95TAM03_UPD_USER_ID",gxold:"O95TAM03_UPD_USER_ID",gxvar:"A95TAM03_UPD_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A95TAM03_UPD_USER_ID=a
},v2z:function(a){gx.O.Z95TAM03_UPD_USER_ID=a},v2c:function(){gx.fn.setControlValue("TAM03_UPD_USER_ID",gx.O.A95TAM03_UPD_USER_ID,0)},c2v:function(){gx.O.A95TAM03_UPD_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TAM03_UPD_USER_ID")},nac:function(){return false}};this.GXValidFnc[100]={fld:"TEXTBLOCKTAM03_UPD_PROG_NM",format:0,grid:0};this.GXValidFnc[102]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tam03_upd_prog_nm,isvalid:null,fld:"TAM03_UPD_PROG_NM",gxz:"Z96TAM03_UPD_PROG_NM",gxold:"O96TAM03_UPD_PROG_NM",gxvar:"A96TAM03_UPD_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A96TAM03_UPD_PROG_NM=a
},v2z:function(a){gx.O.Z96TAM03_UPD_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TAM03_UPD_PROG_NM",gx.O.A96TAM03_UPD_PROG_NM,0)},c2v:function(){gx.O.A96TAM03_UPD_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TAM03_UPD_PROG_NM")},nac:function(){return false}};this.GXValidFnc[108]={fld:"TABLE4",grid:0};this.GXValidFnc[111]={fld:"TEXTBLOCK44",format:0,grid:0};this.GXValidFnc[114]={fld:"TEXTBLOCK45",format:0,grid:0};this.GXValidFnc[117]={fld:"BTN_CANCEL",format:0,grid:0};this.A88TAM03_APP_ID="";
this.Z88TAM03_APP_ID="";this.O88TAM03_APP_ID="";this.A127TAM03_APP_NM="";this.Z127TAM03_APP_NM="";this.O127TAM03_APP_NM="";this.A128TAM03_SUB_MENU_FLG="";this.Z128TAM03_SUB_MENU_FLG="";this.O128TAM03_SUB_MENU_FLG="";this.A89TAM03_KIDO_PG="";this.Z89TAM03_KIDO_PG="";this.O89TAM03_KIDO_PG="";this.A90TAM03_DEL_FLG="";this.Z90TAM03_DEL_FLG="";this.O90TAM03_DEL_FLG="";this.A91TAM03_CRT_DATETIME=gx.date.nullDate();this.Z91TAM03_CRT_DATETIME=gx.date.nullDate();this.O91TAM03_CRT_DATETIME=gx.date.nullDate();
this.A92TAM03_CRT_USER_ID="";this.Z92TAM03_CRT_USER_ID="";this.O92TAM03_CRT_USER_ID="";this.A93TAM03_CRT_PROG_NM="";this.Z93TAM03_CRT_PROG_NM="";this.O93TAM03_CRT_PROG_NM="";this.A94TAM03_UPD_DATETIME=gx.date.nullDate();this.Z94TAM03_UPD_DATETIME=gx.date.nullDate();this.O94TAM03_UPD_DATETIME=gx.date.nullDate();this.A95TAM03_UPD_USER_ID="";this.Z95TAM03_UPD_USER_ID="";this.O95TAM03_UPD_USER_ID="";this.A96TAM03_UPD_PROG_NM="";this.Z96TAM03_UPD_PROG_NM="";this.O96TAM03_UPD_PROG_NM="";this.AV7C_TAM02_APP_ID="";
this.AV14Pgmname="";this.AV12W_MSG="";this.A97TAM03_UPD_CNT=0;this.Gx_BScreen=0;this.ServerEvents=["e12082_client","e13088_client","e14088_client"];this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","TEXTBLOCK44"];this.CheckCtrl=["BTN_CANCEL"];this.VarControlMap.A97TAM03_UPD_CNT={id:"TAM03_UPD_CNT",grid:0,type:"int"};this.VarControlMap.Gx_BScreen={id:"vGXBSCREEN",grid:0,type:"int"};this.VarControlMap.AV14Pgmname={id:"vPGMNAME",grid:0,type:"char"};this.VarControlMap.Gx_mode={id:"vMODE",grid:0,type:"char"};
this.SetStandaloneVars();this.LvlOlds[8]=["O97TAM03_UPD_CNT"]}tam03_appli.prototype=new gx.GxObject;gx.setParentObj(new tam03_appli());