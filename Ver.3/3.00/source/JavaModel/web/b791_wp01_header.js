gx.evt.autoSkip=!1;
gx.define("b791_wp01_header",!0,function(a){this.ServerClass="b791_wp01_header";this.PackageName="";this.setObjectType("web");this.setCmpContext(a);this.ReadonlyForm=true;this.setOnAjaxSessionTimeout("Warn");this.skipOnEnter=this.hasEnterEvent=false;this.autoRefresh=true;this.SetStandaloneVars=function(){};this.s112_client=function(){};this.s122_client=function(){this.AV14W_JS=""};this.s132_client=function(){gx.fn.setCtrlProperty("TXT_TITLE","Caption",this.AV10P_PGNM);gx.fn.setCtrlProperty("TXT_KNGN","Caption",
this.AV16P_AUTHNM);gx.fn.setCtrlProperty("TXT_BTN_END","Caption","\u8a66\u9a13\u691c\u7d22\u30fb\u6a29\u9650\u9078\u629e\u306b\u623b\u308b");this.AV11P_TAM02_APP_ID=="B710"?gx.fn.setCtrlProperty("TXT_BTN_END","Visible",0):this.AV11P_TAM02_APP_ID=="B711"?gx.fn.setCtrlProperty("TXT_BTN_END","Caption","\u30ed\u30b0\u30a2\u30a6\u30c8"):this.AV11P_TAM02_APP_ID=="B790"&&gx.fn.setCtrlProperty("TXT_BTN_END","Visible",0);gx.fn.setCtrlProperty("TXT_USER","Caption",this.AV9P_A_LOGIN_SDT.TAM07_USER_ID+" "+this.AV9P_A_LOGIN_SDT.TAM07_USER_NM)};
this.s142_client=function(){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption","<script language=javascript>");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"var confirmFlg = false;");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (window.addEventListener) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"  window.addEventListener('load', function(){inithead();}, false);");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"} else if (window.attachEvent) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"\twindow.attachEvent('onload',function(){inithead();});");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function inithead() {");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function prochead() {");""!=this.AV14W_JS&&gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+this.AV14W_JS);gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT",
"Caption")+"timerID = setTimeout('prochead()', 10);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"<\/script>")};this.e131h2_client=function(){this.executeServerEvent("'BTN_END'",true)};this.e151h2_client=function(){this.executeServerEvent("ENTER",true)};this.e161h2_client=function(){this.executeServerEvent("CANCEL",true)};a=this.GXValidFnc=[];this.GXCtrlIds=[2,5,10,12,15,16,19,21,30,39,42,45,46];this.GXLastCtrlId=46;a[2]={fld:"TABLE1",grid:0};a[5]=
{fld:"TABLE2",grid:0};a[10]={fld:"IMG_LOGO",grid:0};a[12]={fld:"TABLE6",grid:0};a[15]={fld:"SECTION1",grid:0};a[16]={fld:"TXT_TITLE",format:0,grid:0};a[19]={fld:"TXT_KNGN",format:0,grid:0};a[21]={fld:"TABLE5",grid:0};a[30]={fld:"TXT_USER",format:0,grid:0};a[39]={fld:"TXT_BTN_END",format:0,grid:0};a[42]={fld:"TBL_HIDDEN",grid:0};a[45]={fld:"TXT_JS_EVENT",format:1,grid:0};a[46]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_INIT_FLG",gxz:"ZV8H_INIT_FLG",
gxold:"OV8H_INIT_FLG",gxvar:"AV8H_INIT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV8H_INIT_FLG=a},v2z:function(a){gx.O.ZV8H_INIT_FLG=a},v2c:function(){gx.fn.setControlValue("vH_INIT_FLG",gx.O.AV8H_INIT_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.AV8H_INIT_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_INIT_FLG")},nac:gx.falseFn};this.declareDomainHdlr(46,function(){});this.AV8H_INIT_FLG="";this.AV9P_A_LOGIN_SDT=
{};this.AV14W_JS=this.AV12P_TAW01_DISP_DATETIME=this.AV16P_AUTHNM=this.AV10P_PGNM=this.AV11P_TAM02_APP_ID="";this.Events={e131h2_client:["'BTN_END'",true],e151h2_client:["ENTER",true],e161h2_client:["CANCEL",true]};this.InitStandaloneVars()});