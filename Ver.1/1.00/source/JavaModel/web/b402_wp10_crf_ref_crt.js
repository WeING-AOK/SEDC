gx.evt.autoSkip=false;function b402_wp10_crf_ref_crt(){this.ServerClass="B402_WP10_CRF_REF_CRT";this.PackageName="";this.setObjectType("web");this.hasEnterEvent=false;this.addKeyListener("3","e11162_client");this.addKeyListener("11","e12162_client");this.SetStandaloneVars=function(){this.AV15P_STUDY_ID=gx.fn.getIntegerValue("vP_STUDY_ID",",");this.AV13P_CRF_ID=gx.fn.getIntegerValue("vP_CRF_ID",",")};this.Validv_D_study_id=function(){try{var a=gx.util.balloon.getNew("vD_STUDY_ID");this.AnyError=0}catch(b){}try{if(a==null){return true
}return a.show()}catch(b){}return true};this.s152_client=function(){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption","<script language=javascript>");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (window.addEventListener) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"  window.addEventListener('load', function(){init();}, false);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"} else if (window.attachEvent) {");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"	window.attachEvent('onload',function(){init();});");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function init() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function proc() {");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"ST_CLICK_SPACE();");if(!(""==this.AV17W_A821_JS)){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (!confirmFlg) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+this.AV17W_A821_JS);gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = true;")
}else{gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = false;")}gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"timerID = setTimeout('proc()', 10);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"<\/script>")};this.e11162_client=function(){this.executeServerEvent("'BTN_REG'",true)
};this.e12162_client=function(){this.executeServerEvent("'BTN_CAN'",true)};this.e15162_client=function(){this.executeServerEvent("VD_STUDY_ID.CLICK",true)};this.e17162_client=function(){this.executeServerEvent("ENTER",true)};this.e18162_client=function(){this.executeServerEvent("CANCEL",true)};this.GXValidFnc=[];this.GXCtrlIds=[2,6,12,15,17,20,26,31,33,36,38,43,46,47,48,49,50,51];this.GXLastCtrlId=51;this.GXValidFnc[2]={fld:"TABLE1",grid:0};this.GXValidFnc[6]={fld:"TABLE2",grid:0};this.GXValidFnc[12]={fld:"TBL_UPD_BTNSET",grid:0};
this.GXValidFnc[15]={fld:"TEXTBLOCK42",format:0,grid:0};this.GXValidFnc[17]={fld:"TEXTBLOCK46",format:0,grid:0};this.GXValidFnc[20]={fld:"TABLE4",grid:0};this.GXValidFnc[26]={fld:"TABLE5",grid:0};this.GXValidFnc[31]={fld:"TEXTBLOCK63",format:0,grid:0};this.GXValidFnc[33]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Validv_D_study_id,isvalid:null,rgrid:[],fld:"vD_STUDY_ID",gxz:"ZV8D_STUDY_ID",gxold:"OV8D_STUDY_ID",gxvar:"AV8D_STUDY_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"combo",v2v:function(a){gx.O.AV8D_STUDY_ID=gx.num.intval(a)
},v2z:function(a){gx.O.ZV8D_STUDY_ID=gx.num.intval(a)},v2c:function(){gx.fn.setComboBoxValue("vD_STUDY_ID",gx.O.AV8D_STUDY_ID)},c2v:function(){gx.O.AV8D_STUDY_ID=this.val()},val:function(){return gx.fn.getIntegerValue("vD_STUDY_ID",",")},nac:function(){return false}};this.GXValidFnc[36]={fld:"TEXTBLOCK65",format:0,grid:0};this.GXValidFnc[38]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_CRF_ID",gxz:"ZV7D_CRF_ID",gxold:"OV7D_CRF_ID",gxvar:"AV7D_CRF_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"combo",v2v:function(a){gx.O.AV7D_CRF_ID=gx.num.intval(a)
},v2z:function(a){gx.O.ZV7D_CRF_ID=gx.num.intval(a)},v2c:function(){gx.fn.setComboBoxValue("vD_CRF_ID",gx.O.AV7D_CRF_ID)},c2v:function(){gx.O.AV7D_CRF_ID=this.val()},val:function(){return gx.fn.getIntegerValue("vD_CRF_ID",",")},nac:function(){return false}};this.GXValidFnc[43]={fld:"TBL_HIDDEN",grid:0};this.GXValidFnc[46]={fld:"TXT_JS_EVENT",format:1,grid:0};this.GXValidFnc[47]={fld:"TXT_PDF",format:1,grid:0};this.GXValidFnc[48]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_INIT_FLG",gxz:"ZV9H_INIT_FLG",gxold:"OV9H_INIT_FLG",gxvar:"AV9H_INIT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV9H_INIT_FLG=a
},v2z:function(a){gx.O.ZV9H_INIT_FLG=a},v2c:function(){gx.fn.setControlValue("vH_INIT_FLG",gx.O.AV9H_INIT_FLG,0)},c2v:function(){gx.O.AV9H_INIT_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_INIT_FLG")},nac:function(){return false}};this.GXValidFnc[49]={lvl:0,type:"int",len:2,dec:0,sign:false,pic:"Z9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_ITEM_KBN",gxz:"ZV10H_ITEM_KBN",gxold:"OV10H_ITEM_KBN",gxvar:"AV10H_ITEM_KBN",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV10H_ITEM_KBN=gx.num.intval(a)
},v2z:function(a){gx.O.ZV10H_ITEM_KBN=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("vH_ITEM_KBN",gx.O.AV10H_ITEM_KBN,0)},c2v:function(){gx.O.AV10H_ITEM_KBN=this.val()},val:function(){return gx.fn.getIntegerValue("vH_ITEM_KBN",",")},nac:function(){return false}};this.GXValidFnc[50]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_SRCH_FLG",gxz:"ZV12H_SRCH_FLG",gxold:"OV12H_SRCH_FLG",gxvar:"AV12H_SRCH_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV12H_SRCH_FLG=a
},v2z:function(a){gx.O.ZV12H_SRCH_FLG=a},v2c:function(){gx.fn.setControlValue("vH_SRCH_FLG",gx.O.AV12H_SRCH_FLG,0)},c2v:function(){gx.O.AV12H_SRCH_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_SRCH_FLG")},nac:function(){return false}};this.GXValidFnc[51]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_KNGN_FLG",gxz:"ZV11H_KNGN_FLG",gxold:"OV11H_KNGN_FLG",gxvar:"AV11H_KNGN_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV11H_KNGN_FLG=a
},v2z:function(a){gx.O.ZV11H_KNGN_FLG=a},v2c:function(){gx.fn.setControlValue("vH_KNGN_FLG",gx.O.AV11H_KNGN_FLG,0)},c2v:function(){gx.O.AV11H_KNGN_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_KNGN_FLG")},nac:function(){return false}};this.AV8D_STUDY_ID=0;this.ZV8D_STUDY_ID=0;this.OV8D_STUDY_ID=0;this.AV7D_CRF_ID=0;this.ZV7D_CRF_ID=0;this.OV7D_CRF_ID=0;this.AV9H_INIT_FLG="";this.ZV9H_INIT_FLG="";this.OV9H_INIT_FLG="";this.AV10H_ITEM_KBN=0;this.ZV10H_ITEM_KBN=0;this.OV10H_ITEM_KBN=0;
this.AV12H_SRCH_FLG="";this.ZV12H_SRCH_FLG="";this.OV12H_SRCH_FLG="";this.AV11H_KNGN_FLG="";this.ZV11H_KNGN_FLG="";this.OV11H_KNGN_FLG="";this.AV15P_STUDY_ID=0;this.AV13P_CRF_ID=0;this.A513TBM21_STATUS="";this.A189TBM21_DEL_FLG="";this.A187TBM21_STUDY_NM="";this.A186TBM21_STUDY_ID=0;this.A551TBM31_STATUS="";this.A223TBM31_DEL_FLG="";this.A217TBM31_STUDY_ID=0;this.A219TBM31_CRF_NM="";this.A218TBM31_CRF_ID=0;this.AV17W_A821_JS="";this.ServerEvents=["e11162_client","e12162_client","e15162_client","e17162_client","e18162_client"];
this.VarControlMap.AV15P_STUDY_ID={id:"vP_STUDY_ID",grid:0,type:"int"};this.VarControlMap.AV13P_CRF_ID={id:"vP_CRF_ID",grid:0,type:"int"};this.SetStandaloneVars();this.setComponent({id:"WEBCOMP1",GXClass:null,Prefix:"W0009",lvl:1});this.setComponent({id:"WEBCOMP2",GXClass:null,Prefix:"W0041",lvl:1})}b402_wp10_crf_ref_crt.prototype=new gx.GxObject;gx.setParentObj(new b402_wp10_crf_ref_crt());