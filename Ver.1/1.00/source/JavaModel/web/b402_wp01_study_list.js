gx.evt.autoSkip=false;function b402_wp01_study_list(){this.ServerClass="B402_WP01_STUDY_LIST";this.PackageName="";this.setObjectType("web");this.hasEnterEvent=false;this.addKeyListener("3","e110w2_client");this.addKeyListener("5","e120w2_client");this.addKeyListener("6","e130w2_client");this.SetStandaloneVars=function(){this.AV17P_MOVE_KBN=gx.fn.getIntegerValue("vP_MOVE_KBN",",")};this.s172_client=function(){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption","<script language=javascript>");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"var confirmFlg = false;");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (window.addEventListener) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"  window.addEventListener('load', function(){init();}, false);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"} else if (window.attachEvent) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"	window.attachEvent('onload',function(){init();});");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function init() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function proc() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"timerID = setTimeout('proc()', 10);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"<\/script>")};this.e110w2_client=function(){this.executeServerEvent("'BTN_REG'",true)};this.e120w2_client=function(){this.executeServerEvent("'BTN_SRCH'",true)};this.e130w2_client=function(){this.executeServerEvent("'BTN_CLER'",true)};this.e310w2_client=function(){this.executeServerEvent("'BTN_SEL'",true,arguments[0])
};this.e140w2_client=function(){this.executeServerEvent("'PAGE_FIRST'",true)};this.e150w2_client=function(){this.executeServerEvent("'PAGE_LAST'",true)};this.e160w2_client=function(){this.executeServerEvent("'PAGE_BACK'",true)};this.e170w2_client=function(){this.executeServerEvent("'PAGE_NEXT'",true)};this.e180w2_client=function(){this.executeServerEvent("'PAGE01'",true)};this.e190w2_client=function(){this.executeServerEvent("'PAGE02'",true)};this.e200w2_client=function(){this.executeServerEvent("'PAGE03'",true)
};this.e210w2_client=function(){this.executeServerEvent("'PAGE04'",true)};this.e220w2_client=function(){this.executeServerEvent("'PAGE05'",true)};this.e230w2_client=function(){this.executeServerEvent("'PAGE06'",true)};this.e240w2_client=function(){this.executeServerEvent("'PAGE07'",true)};this.e250w2_client=function(){this.executeServerEvent("'PAGE08'",true)};this.e260w2_client=function(){this.executeServerEvent("'PAGE09'",true)};this.e270w2_client=function(){this.executeServerEvent("'PAGE10'",true)
};this.e320w2_client=function(){this.executeServerEvent("ENTER",true,arguments[0])};this.e330w2_client=function(){this.executeServerEvent("CANCEL",true,arguments[0])};this.GXValidFnc=[];this.GXCtrlIds=[2,6,12,15,18,21,24,27,29,31,33,35,37,40,43,46,52,55,58,61,64,67,70,73,76,79,82,85,88,91,94,97,100,103,106,109,112,115,118,121,124,127,130,133,136,139,142,145,151,155,157,159,165,168,170,171,172,174,176,181,184,185,186,187,188,189,190,191,194,196,199,201,204,206,209,211,214,216,219,221,224,226,229,231,234,236,239,241,244,246,249,251,254,256,259,261,264,266,269,271,274,276,279,281,284,286,289,291,294,296,299,301,304,306,309,311,314,316,319,321,324,326,329,331,334,336];
this.GXLastCtrlId=336;this.Grid1Container=new gx.grid.grid(this,2,"WbpLvl2",162,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"b402_wp01_study_list",[],true,1,true,true,10,false,false,false,"",935,"px","行追加",true,false,false,null,null,false,"");this.Grid1Container.startRow("","","","","","");this.Grid1Container.startCell("","","","","","","","","","");this.Grid1Container.startTable("Tbl_grid_header2",165,"935px");this.Grid1Container.addHtmlCode("<TBODY>");this.Grid1Container.startRow("","","","","","");
this.Grid1Container.startCell("","center","","","","","45px","","","");this.Grid1Container.addTextBlock("BTN_SEL","e310w2_client");this.Grid1Container.endCell();this.Grid1Container.startCell("","","","","","","","","","");this.Grid1Container.addSingleLineEdit(186,170,"TBM21_STUDY_ID","","","TBM21_STUDY_ID","int",10,"chr",10,10,"right",null,[],186,"TBM21_STUDY_ID",true,0,false,false);this.Grid1Container.addSingleLineEdit("D_space",171,"vD_SPACE","","","D_SPACE","char",1,"chr",1,1,"left",null,[],"D_space","D_SPACE",true,0,false,false);
this.Grid1Container.addSingleLineEdit(187,172,"TBM21_STUDY_NM","","","TBM21_STUDY_NM","svchar",80,"chr",100,100,"left",null,[],187,"TBM21_STUDY_NM",true,0,false,false);this.Grid1Container.endCell();this.Grid1Container.startCell("","","","","","","100px","","","");this.Grid1Container.addComboBox(513,174,"TBM21_STATUS","","TBM21_STATUS","svchar",null,0,true,false,1,"chr");this.Grid1Container.endCell();this.Grid1Container.startCell("","","","","","","100px","","","");this.Grid1Container.addComboBox(189,176,"TBM21_DEL_FLG","","TBM21_DEL_FLG","svchar",null,0,true,false,1,"chr");
this.Grid1Container.endCell();this.Grid1Container.endRow();this.Grid1Container.addHtmlCode("</TBODY>");this.Grid1Container.endTable();this.Grid1Container.endCell();this.Grid1Container.endRow();this.setGrid(this.Grid1Container);this.GXValidFnc[2]={fld:"TABLE1",grid:0};this.GXValidFnc[6]={fld:"TABLE2",grid:0};this.GXValidFnc[12]={fld:"TBL_UPD_BTNSET",grid:0};this.GXValidFnc[15]={fld:"TXT_BTN_REG",format:0,grid:0};this.GXValidFnc[18]={fld:"TABLE3",grid:0};this.GXValidFnc[21]={fld:"TABLE4",grid:0};this.GXValidFnc[24]={fld:"TABLE10",grid:0};
this.GXValidFnc[27]={fld:"TEXTBLOCK16",format:0,grid:0};this.GXValidFnc[29]={lvl:0,type:"svchar",len:100,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vD_STUDY_NM",gxz:"ZV9D_STUDY_NM",gxold:"OV9D_STUDY_NM",gxvar:"AV9D_STUDY_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV9D_STUDY_NM=a},v2z:function(a){gx.O.ZV9D_STUDY_NM=a},v2c:function(){gx.fn.setControlValue("vD_STUDY_NM",gx.O.AV9D_STUDY_NM,0)},c2v:function(){gx.O.AV9D_STUDY_NM=this.val()},val:function(){return gx.fn.getControlValue("vD_STUDY_NM")
},nac:function(){return false}};this.GXValidFnc[31]={fld:"TEXTBLOCK18",format:0,grid:0};this.GXValidFnc[33]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vD_STATUS",gxz:"ZV8D_STATUS",gxold:"OV8D_STATUS",gxvar:"AV8D_STATUS",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"radio",v2v:function(a){gx.O.AV8D_STATUS=a},v2z:function(a){gx.O.ZV8D_STATUS=a},v2c:function(){gx.fn.setRadioValue("vD_STATUS",gx.O.AV8D_STATUS)},c2v:function(){gx.O.AV8D_STATUS=this.val()},val:function(){return gx.fn.getControlValue("vD_STATUS")
},nac:function(){return false}};this.GXValidFnc[35]={fld:"TEXTBLOCK84",format:0,grid:0};this.GXValidFnc[37]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vD_DEL_FLG",gxz:"ZV7D_DEL_FLG",gxold:"OV7D_DEL_FLG",gxvar:"AV7D_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"radio",v2v:function(a){gx.O.AV7D_DEL_FLG=a},v2z:function(a){gx.O.ZV7D_DEL_FLG=a},v2c:function(){gx.fn.setRadioValue("vD_DEL_FLG",gx.O.AV7D_DEL_FLG)},c2v:function(){gx.O.AV7D_DEL_FLG=this.val()
},val:function(){return gx.fn.getControlValue("vD_DEL_FLG")},nac:function(){return false}};this.GXValidFnc[40]={fld:"TABLE9",grid:0};this.GXValidFnc[43]={fld:"TEXTBLOCK45",format:0,grid:0};this.GXValidFnc[46]={fld:"TEXTBLOCK44",format:0,grid:0};this.GXValidFnc[52]={fld:"TBL_LIST",grid:0};this.GXValidFnc[55]={fld:"TBL_PAGE_AREA",grid:0};this.GXValidFnc[58]={fld:"TXT_REC_CNT",format:0,grid:0};this.GXValidFnc[61]={fld:"TBL_PAGE",grid:0};this.GXValidFnc[64]={fld:"TBL_FIRST",grid:0};this.GXValidFnc[67]={fld:"TXT_FIRST",format:0,grid:0};
this.GXValidFnc[70]={fld:"TBL_BACK",grid:0};this.GXValidFnc[73]={fld:"TXT_BACK",format:0,grid:0};this.GXValidFnc[76]={fld:"TBL_PAGE01",grid:0};this.GXValidFnc[79]={fld:"TXT_PAGE01",format:0,grid:0};this.GXValidFnc[82]={fld:"TBL_PAGE02",grid:0};this.GXValidFnc[85]={fld:"TXT_PAGE02",format:0,grid:0};this.GXValidFnc[88]={fld:"TBL_PAGE03",grid:0};this.GXValidFnc[91]={fld:"TXT_PAGE03",format:0,grid:0};this.GXValidFnc[94]={fld:"TBL_PAGE04",grid:0};this.GXValidFnc[97]={fld:"TXT_PAGE04",format:0,grid:0};
this.GXValidFnc[100]={fld:"TBL_PAGE05",grid:0};this.GXValidFnc[103]={fld:"TXT_PAGE05",format:0,grid:0};this.GXValidFnc[106]={fld:"TBL_PAGE06",grid:0};this.GXValidFnc[109]={fld:"TXT_PAGE06",format:0,grid:0};this.GXValidFnc[112]={fld:"TBL_PAGE07",grid:0};this.GXValidFnc[115]={fld:"TXT_PAGE07",format:0,grid:0};this.GXValidFnc[118]={fld:"TBL_PAGE08",grid:0};this.GXValidFnc[121]={fld:"TXT_PAGE08",format:0,grid:0};this.GXValidFnc[124]={fld:"TBL_PAGE09",grid:0};this.GXValidFnc[127]={fld:"TXT_PAGE09",format:0,grid:0};
this.GXValidFnc[130]={fld:"TBL_PAGE10",grid:0};this.GXValidFnc[133]={fld:"TXT_PAGE10",format:0,grid:0};this.GXValidFnc[136]={fld:"TBL_NEXT",grid:0};this.GXValidFnc[139]={fld:"TXT_NEXT",format:0,grid:0};this.GXValidFnc[142]={fld:"TBL_LAST",grid:0};this.GXValidFnc[145]={fld:"TXT_LAST",format:0,grid:0};this.GXValidFnc[151]={fld:"TBL_GRID_HEADER",grid:0};this.GXValidFnc[155]={fld:"TEXTBLOCK13",format:0,grid:0};this.GXValidFnc[157]={fld:"TEXTBLOCK43",format:0,grid:0};this.GXValidFnc[159]={fld:"TEXTBLOCK46",format:0,grid:0};
this.GXValidFnc[165]={fld:"TBL_GRID_HEADER2",grid:162};this.GXValidFnc[168]={fld:"BTN_SEL",format:0,grid:162};this.GXValidFnc[170]={lvl:2,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:1,grid:162,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"TBM21_STUDY_ID",gxz:"Z186TBM21_STUDY_ID",gxold:"O186TBM21_STUDY_ID",gxvar:"A186TBM21_STUDY_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A186TBM21_STUDY_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z186TBM21_STUDY_ID=gx.num.intval(a)
},v2c:function(){gx.fn.setGridControlValue("TBM21_STUDY_ID",gx.fn.currentGridRowImpl(162),gx.O.A186TBM21_STUDY_ID,0)},c2v:function(){gx.O.A186TBM21_STUDY_ID=this.val()},val:function(){return gx.fn.getGridIntegerValue("TBM21_STUDY_ID",gx.fn.currentGridRowImpl(162),",")},nac:function(){return false}};this.GXValidFnc[171]={lvl:2,type:"char",len:1,dec:0,sign:false,ro:0,grid:162,gxgrid:this.Grid1Container,fnc:null,isvalid:null,fld:"vD_SPACE",gxz:"ZV27D_SPACE",gxold:"OV27D_SPACE",gxvar:"AV27D_SPACE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV27D_SPACE=a
},v2z:function(a){gx.O.ZV27D_SPACE=a},v2c:function(){gx.fn.setGridControlValue("vD_SPACE",gx.fn.currentGridRowImpl(162),gx.O.AV27D_SPACE,0)},c2v:function(){gx.O.AV27D_SPACE=this.val()},val:function(){return gx.fn.getGridControlValue("vD_SPACE",gx.fn.currentGridRowImpl(162))},nac:function(){return false}};this.GXValidFnc[172]={lvl:2,type:"svchar",len:100,dec:0,sign:false,ro:1,grid:162,gxgrid:this.Grid1Container,fnc:null,isvalid:null,fld:"TBM21_STUDY_NM",gxz:"Z187TBM21_STUDY_NM",gxold:"O187TBM21_STUDY_NM",gxvar:"A187TBM21_STUDY_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A187TBM21_STUDY_NM=a
},v2z:function(a){gx.O.Z187TBM21_STUDY_NM=a},v2c:function(){gx.fn.setGridControlValue("TBM21_STUDY_NM",gx.fn.currentGridRowImpl(162),gx.O.A187TBM21_STUDY_NM,0)},c2v:function(){gx.O.A187TBM21_STUDY_NM=this.val()},val:function(){return gx.fn.getGridControlValue("TBM21_STUDY_NM",gx.fn.currentGridRowImpl(162))},nac:function(){return false}};this.GXValidFnc[174]={lvl:2,type:"svchar",len:1,dec:0,sign:false,ro:1,grid:162,gxgrid:this.Grid1Container,fnc:null,isvalid:null,fld:"TBM21_STATUS",gxz:"Z513TBM21_STATUS",gxold:"O513TBM21_STATUS",gxvar:"A513TBM21_STATUS",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"combo",v2v:function(a){gx.O.A513TBM21_STATUS=a
},v2z:function(a){gx.O.Z513TBM21_STATUS=a},v2c:function(){gx.fn.setGridComboBoxValue("TBM21_STATUS",gx.fn.currentGridRowImpl(162),gx.O.A513TBM21_STATUS)},c2v:function(){gx.O.A513TBM21_STATUS=this.val()},val:function(){return gx.fn.getGridControlValue("TBM21_STATUS",gx.fn.currentGridRowImpl(162))},nac:function(){return false}};this.GXValidFnc[176]={lvl:2,type:"svchar",len:1,dec:0,sign:false,ro:1,grid:162,gxgrid:this.Grid1Container,fnc:null,isvalid:null,fld:"TBM21_DEL_FLG",gxz:"Z189TBM21_DEL_FLG",gxold:"O189TBM21_DEL_FLG",gxvar:"A189TBM21_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"combo",v2v:function(a){gx.O.A189TBM21_DEL_FLG=a
},v2z:function(a){gx.O.Z189TBM21_DEL_FLG=a},v2c:function(){gx.fn.setGridComboBoxValue("TBM21_DEL_FLG",gx.fn.currentGridRowImpl(162),gx.O.A189TBM21_DEL_FLG)},c2v:function(){gx.O.A189TBM21_DEL_FLG=this.val()},val:function(){return gx.fn.getGridControlValue("TBM21_DEL_FLG",gx.fn.currentGridRowImpl(162))},nac:function(){return false}};this.GXValidFnc[181]={fld:"TBL_HIDDEN",grid:0};this.GXValidFnc[184]={fld:"TXT_JS_EVENT",format:1,grid:0};this.GXValidFnc[185]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_INIT_FLG",gxz:"ZV12H_INIT_FLG",gxold:"OV12H_INIT_FLG",gxvar:"AV12H_INIT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV12H_INIT_FLG=a
},v2z:function(a){gx.O.ZV12H_INIT_FLG=a},v2c:function(){gx.fn.setControlValue("vH_INIT_FLG",gx.O.AV12H_INIT_FLG,0)},c2v:function(){gx.O.AV12H_INIT_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_INIT_FLG")},nac:function(){return false}};this.GXValidFnc[186]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_SRCH_FLG",gxz:"ZV14H_SRCH_FLG",gxold:"OV14H_SRCH_FLG",gxvar:"AV14H_SRCH_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV14H_SRCH_FLG=a
},v2z:function(a){gx.O.ZV14H_SRCH_FLG=a},v2c:function(){gx.fn.setControlValue("vH_SRCH_FLG",gx.O.AV14H_SRCH_FLG,0)},c2v:function(){gx.O.AV14H_SRCH_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_SRCH_FLG")},nac:function(){return false}};this.GXValidFnc[187]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_KNGN_FLG",gxz:"ZV13H_KNGN_FLG",gxold:"OV13H_KNGN_FLG",gxvar:"AV13H_KNGN_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV13H_KNGN_FLG=a
},v2z:function(a){gx.O.ZV13H_KNGN_FLG=a},v2c:function(){gx.fn.setControlValue("vH_KNGN_FLG",gx.O.AV13H_KNGN_FLG,0)},c2v:function(){gx.O.AV13H_KNGN_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_KNGN_FLG")},nac:function(){return false}};this.GXValidFnc[188]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_DEL_FLG",gxz:"ZV11H_DEL_FLG",gxold:"OV11H_DEL_FLG",gxvar:"AV11H_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV11H_DEL_FLG=a
},v2z:function(a){gx.O.ZV11H_DEL_FLG=a},v2c:function(){gx.fn.setControlValue("vH_DEL_FLG",gx.O.AV11H_DEL_FLG,0)},c2v:function(){gx.O.AV11H_DEL_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_DEL_FLG")},nac:function(){return false}};this.GXValidFnc[189]={lvl:0,type:"svchar",len:100,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_STUDY_NM",gxz:"ZV16H_STUDY_NM",gxold:"OV16H_STUDY_NM",gxvar:"AV16H_STUDY_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV16H_STUDY_NM=a
},v2z:function(a){gx.O.ZV16H_STUDY_NM=a},v2c:function(){gx.fn.setControlValue("vH_STUDY_NM",gx.O.AV16H_STUDY_NM,0)},c2v:function(){gx.O.AV16H_STUDY_NM=this.val()},val:function(){return gx.fn.getControlValue("vH_STUDY_NM")},nac:function(){return false}};this.GXValidFnc[190]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_STATUS",gxz:"ZV15H_STATUS",gxold:"OV15H_STATUS",gxvar:"AV15H_STATUS",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV15H_STATUS=a
},v2z:function(a){gx.O.ZV15H_STATUS=a},v2c:function(){gx.fn.setControlValue("vH_STATUS",gx.O.AV15H_STATUS,0)},c2v:function(){gx.O.AV15H_STATUS=this.val()},val:function(){return gx.fn.getControlValue("vH_STATUS")},nac:function(){return false}};this.GXValidFnc[191]={fld:"TABLE6",grid:0};this.GXValidFnc[194]={fld:"TEXTBLOCK1",format:0,grid:0};this.GXValidFnc[196]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLMAX_ROW",gxz:"ZV32GXV1",gxold:"OV32GXV1",gxvar:"GXV1",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV1=gx.num.intval(a)
},v2z:function(a){gx.O.ZV32GXV1=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLMAX_ROW",gx.O.GXV1,0)},c2v:function(){gx.O.GXV1=this.val()},val:function(){return gx.fn.getIntegerValue("CTLMAX_ROW",",")},nac:function(){return false}};this.GXValidFnc[199]={fld:"TEXTBLOCK2",format:0,grid:0};this.GXValidFnc[201]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLMAX_PAGE",gxz:"ZV33GXV2",gxold:"OV33GXV2",gxvar:"GXV2",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV2=gx.num.intval(a)
},v2z:function(a){gx.O.ZV33GXV2=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLMAX_PAGE",gx.O.GXV2,0)},c2v:function(){gx.O.GXV2=this.val()},val:function(){return gx.fn.getIntegerValue("CTLMAX_PAGE",",")},nac:function(){return false}};this.GXValidFnc[204]={fld:"TEXTBLOCK3",format:0,grid:0};this.GXValidFnc[206]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLREC_CNT",gxz:"ZV34GXV3",gxold:"OV34GXV3",gxvar:"GXV3",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV3=gx.num.intval(a)
},v2z:function(a){gx.O.ZV34GXV3=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLREC_CNT",gx.O.GXV3,0)},c2v:function(){gx.O.GXV3=this.val()},val:function(){return gx.fn.getIntegerValue("CTLREC_CNT",",")},nac:function(){return false}};this.GXValidFnc[209]={fld:"TEXTBLOCK4",format:0,grid:0};this.GXValidFnc[211]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_NO",gxz:"ZV35GXV4",gxold:"OV35GXV4",gxvar:"GXV4",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV4=gx.num.intval(a)
},v2z:function(a){gx.O.ZV35GXV4=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_NO",gx.O.GXV4,0)},c2v:function(){gx.O.GXV4=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_NO",",")},nac:function(){return false}};this.GXValidFnc[214]={fld:"TEXTBLOCK5",format:0,grid:0};this.GXValidFnc[216]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE01",gxz:"ZV36GXV5",gxold:"OV36GXV5",gxvar:"GXV5",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV5=gx.num.intval(a)
},v2z:function(a){gx.O.ZV36GXV5=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE01",gx.O.GXV5,0)},c2v:function(){gx.O.GXV5=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE01",",")},nac:function(){return false}};this.GXValidFnc[219]={fld:"TEXTBLOCK6",format:0,grid:0};this.GXValidFnc[221]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE02",gxz:"ZV37GXV6",gxold:"OV37GXV6",gxvar:"GXV6",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV6=gx.num.intval(a)
},v2z:function(a){gx.O.ZV37GXV6=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE02",gx.O.GXV6,0)},c2v:function(){gx.O.GXV6=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE02",",")},nac:function(){return false}};this.GXValidFnc[224]={fld:"TEXTBLOCK7",format:0,grid:0};this.GXValidFnc[226]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE03",gxz:"ZV38GXV7",gxold:"OV38GXV7",gxvar:"GXV7",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV7=gx.num.intval(a)
},v2z:function(a){gx.O.ZV38GXV7=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE03",gx.O.GXV7,0)},c2v:function(){gx.O.GXV7=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE03",",")},nac:function(){return false}};this.GXValidFnc[229]={fld:"TEXTBLOCK8",format:0,grid:0};this.GXValidFnc[231]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE04",gxz:"ZV39GXV8",gxold:"OV39GXV8",gxvar:"GXV8",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV8=gx.num.intval(a)
},v2z:function(a){gx.O.ZV39GXV8=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE04",gx.O.GXV8,0)},c2v:function(){gx.O.GXV8=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE04",",")},nac:function(){return false}};this.GXValidFnc[234]={fld:"TEXTBLOCK9",format:0,grid:0};this.GXValidFnc[236]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE05",gxz:"ZV40GXV9",gxold:"OV40GXV9",gxvar:"GXV9",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV9=gx.num.intval(a)
},v2z:function(a){gx.O.ZV40GXV9=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE05",gx.O.GXV9,0)},c2v:function(){gx.O.GXV9=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE05",",")},nac:function(){return false}};this.GXValidFnc[239]={fld:"TEXTBLOCK10",format:0,grid:0};this.GXValidFnc[241]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE06",gxz:"ZV41GXV10",gxold:"OV41GXV10",gxvar:"GXV10",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV10=gx.num.intval(a)
},v2z:function(a){gx.O.ZV41GXV10=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE06",gx.O.GXV10,0)},c2v:function(){gx.O.GXV10=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE06",",")},nac:function(){return false}};this.GXValidFnc[244]={fld:"TEXTBLOCK11",format:0,grid:0};this.GXValidFnc[246]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE07",gxz:"ZV42GXV11",gxold:"OV42GXV11",gxvar:"GXV11",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV11=gx.num.intval(a)
},v2z:function(a){gx.O.ZV42GXV11=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE07",gx.O.GXV11,0)},c2v:function(){gx.O.GXV11=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE07",",")},nac:function(){return false}};this.GXValidFnc[249]={fld:"TEXTBLOCK12",format:0,grid:0};this.GXValidFnc[251]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE08",gxz:"ZV43GXV12",gxold:"OV43GXV12",gxvar:"GXV12",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV12=gx.num.intval(a)
},v2z:function(a){gx.O.ZV43GXV12=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE08",gx.O.GXV12,0)},c2v:function(){gx.O.GXV12=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE08",",")},nac:function(){return false}};this.GXValidFnc[254]={fld:"TEXTBLOCK14",format:0,grid:0};this.GXValidFnc[256]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE09",gxz:"ZV44GXV13",gxold:"OV44GXV13",gxvar:"GXV13",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV13=gx.num.intval(a)
},v2z:function(a){gx.O.ZV44GXV13=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE09",gx.O.GXV13,0)},c2v:function(){gx.O.GXV13=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE09",",")},nac:function(){return false}};this.GXValidFnc[259]={fld:"TEXTBLOCK15",format:0,grid:0};this.GXValidFnc[261]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE10",gxz:"ZV45GXV14",gxold:"OV45GXV14",gxvar:"GXV14",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV14=gx.num.intval(a)
},v2z:function(a){gx.O.ZV45GXV14=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE10",gx.O.GXV14,0)},c2v:function(){gx.O.GXV14=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE10",",")},nac:function(){return false}};this.GXValidFnc[264]={fld:"TEXTBLOCK17",format:0,grid:0};this.GXValidFnc[266]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP01",gxz:"ZV46GXV15",gxold:"OV46GXV15",gxvar:"GXV15",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV15=gx.num.intval(a)
},v2z:function(a){gx.O.ZV46GXV15=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP01",gx.O.GXV15,0)},c2v:function(){gx.O.GXV15=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP01",",")},nac:function(){return false}};this.GXValidFnc[269]={fld:"TEXTBLOCK19",format:0,grid:0};this.GXValidFnc[271]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP02",gxz:"ZV47GXV16",gxold:"OV47GXV16",gxvar:"GXV16",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV16=gx.num.intval(a)
},v2z:function(a){gx.O.ZV47GXV16=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP02",gx.O.GXV16,0)},c2v:function(){gx.O.GXV16=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP02",",")},nac:function(){return false}};this.GXValidFnc[274]={fld:"TEXTBLOCK20",format:0,grid:0};this.GXValidFnc[276]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP03",gxz:"ZV48GXV17",gxold:"OV48GXV17",gxvar:"GXV17",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV17=gx.num.intval(a)
},v2z:function(a){gx.O.ZV48GXV17=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP03",gx.O.GXV17,0)},c2v:function(){gx.O.GXV17=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP03",",")},nac:function(){return false}};this.GXValidFnc[279]={fld:"TEXTBLOCK21",format:0,grid:0};this.GXValidFnc[281]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP04",gxz:"ZV49GXV18",gxold:"OV49GXV18",gxvar:"GXV18",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV18=gx.num.intval(a)
},v2z:function(a){gx.O.ZV49GXV18=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP04",gx.O.GXV18,0)},c2v:function(){gx.O.GXV18=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP04",",")},nac:function(){return false}};this.GXValidFnc[284]={fld:"TEXTBLOCK22",format:0,grid:0};this.GXValidFnc[286]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP05",gxz:"ZV50GXV19",gxold:"OV50GXV19",gxvar:"GXV19",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV19=gx.num.intval(a)
},v2z:function(a){gx.O.ZV50GXV19=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP05",gx.O.GXV19,0)},c2v:function(){gx.O.GXV19=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP05",",")},nac:function(){return false}};this.GXValidFnc[289]={fld:"TEXTBLOCK23",format:0,grid:0};this.GXValidFnc[291]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP06",gxz:"ZV51GXV20",gxold:"OV51GXV20",gxvar:"GXV20",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV20=gx.num.intval(a)
},v2z:function(a){gx.O.ZV51GXV20=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP06",gx.O.GXV20,0)},c2v:function(){gx.O.GXV20=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP06",",")},nac:function(){return false}};this.GXValidFnc[294]={fld:"TEXTBLOCK24",format:0,grid:0};this.GXValidFnc[296]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP07",gxz:"ZV52GXV21",gxold:"OV52GXV21",gxvar:"GXV21",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV21=gx.num.intval(a)
},v2z:function(a){gx.O.ZV52GXV21=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP07",gx.O.GXV21,0)},c2v:function(){gx.O.GXV21=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP07",",")},nac:function(){return false}};this.GXValidFnc[299]={fld:"TEXTBLOCK25",format:0,grid:0};this.GXValidFnc[301]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP08",gxz:"ZV53GXV22",gxold:"OV53GXV22",gxvar:"GXV22",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV22=gx.num.intval(a)
},v2z:function(a){gx.O.ZV53GXV22=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP08",gx.O.GXV22,0)},c2v:function(){gx.O.GXV22=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP08",",")},nac:function(){return false}};this.GXValidFnc[304]={fld:"TEXTBLOCK26",format:0,grid:0};this.GXValidFnc[306]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP09",gxz:"ZV54GXV23",gxold:"OV54GXV23",gxvar:"GXV23",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV23=gx.num.intval(a)
},v2z:function(a){gx.O.ZV54GXV23=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP09",gx.O.GXV23,0)},c2v:function(){gx.O.GXV23=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP09",",")},nac:function(){return false}};this.GXValidFnc[309]={fld:"TEXTBLOCK27",format:0,grid:0};this.GXValidFnc[311]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP10",gxz:"ZV55GXV24",gxold:"OV55GXV24",gxvar:"GXV24",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV24=gx.num.intval(a)
},v2z:function(a){gx.O.ZV55GXV24=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP10",gx.O.GXV24,0)},c2v:function(){gx.O.GXV24=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP10",",")},nac:function(){return false}};this.GXValidFnc[314]={fld:"TEXTBLOCK28",format:0,grid:0};this.GXValidFnc[316]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP_BACK",gxz:"ZV56GXV25",gxold:"OV56GXV25",gxvar:"GXV25",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV25=gx.num.intval(a)
},v2z:function(a){gx.O.ZV56GXV25=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP_BACK",gx.O.GXV25,0)},c2v:function(){gx.O.GXV25=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP_BACK",",")},nac:function(){return false}};this.GXValidFnc[319]={fld:"TEXTBLOCK29",format:0,grid:0};this.GXValidFnc[321]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP_NEXT",gxz:"ZV57GXV26",gxold:"OV57GXV26",gxvar:"GXV26",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV26=gx.num.intval(a)
},v2z:function(a){gx.O.ZV57GXV26=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP_NEXT",gx.O.GXV26,0)},c2v:function(){gx.O.GXV26=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP_NEXT",",")},nac:function(){return false}};this.GXValidFnc[324]={fld:"TEXTBLOCK30",format:0,grid:0};this.GXValidFnc[326]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP_FIRST",gxz:"ZV58GXV27",gxold:"OV58GXV27",gxvar:"GXV27",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV27=gx.num.intval(a)
},v2z:function(a){gx.O.ZV58GXV27=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP_FIRST",gx.O.GXV27,0)},c2v:function(){gx.O.GXV27=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP_FIRST",",")},nac:function(){return false}};this.GXValidFnc[329]={fld:"TEXTBLOCK31",format:0,grid:0};this.GXValidFnc[331]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP_LAST",gxz:"ZV59GXV28",gxold:"OV59GXV28",gxvar:"GXV28",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV28=gx.num.intval(a)
},v2z:function(a){gx.O.ZV59GXV28=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP_LAST",gx.O.GXV28,0)},c2v:function(){gx.O.GXV28=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP_LAST",",")},nac:function(){return false}};this.GXValidFnc[334]={fld:"TEXTBLOCK32",format:0,grid:0};this.GXValidFnc[336]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP_AREA",gxz:"ZV60GXV29",gxold:"OV60GXV29",gxvar:"GXV29",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV29=gx.num.intval(a)
},v2z:function(a){gx.O.ZV60GXV29=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP_AREA",gx.O.GXV29,0)},c2v:function(){gx.O.GXV29=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP_AREA",",")},nac:function(){return false}};this.AV9D_STUDY_NM="";this.ZV9D_STUDY_NM="";this.OV9D_STUDY_NM="";this.AV8D_STATUS="";this.ZV8D_STATUS="";this.OV8D_STATUS="";this.AV7D_DEL_FLG="";this.ZV7D_DEL_FLG="";this.OV7D_DEL_FLG="";this.Z186TBM21_STUDY_ID=0;this.O186TBM21_STUDY_ID=0;
this.ZV27D_SPACE="";this.OV27D_SPACE="";this.Z187TBM21_STUDY_NM="";this.O187TBM21_STUDY_NM="";this.Z513TBM21_STATUS="";this.O513TBM21_STATUS="";this.Z189TBM21_DEL_FLG="";this.O189TBM21_DEL_FLG="";this.AV12H_INIT_FLG="";this.ZV12H_INIT_FLG="";this.OV12H_INIT_FLG="";this.AV14H_SRCH_FLG="";this.ZV14H_SRCH_FLG="";this.OV14H_SRCH_FLG="";this.AV13H_KNGN_FLG="";this.ZV13H_KNGN_FLG="";this.OV13H_KNGN_FLG="";this.AV11H_DEL_FLG="";this.ZV11H_DEL_FLG="";this.OV11H_DEL_FLG="";this.AV16H_STUDY_NM="";this.ZV16H_STUDY_NM="";
this.OV16H_STUDY_NM="";this.AV15H_STATUS="";this.ZV15H_STATUS="";this.OV15H_STATUS="";this.GXV1=0;this.ZV32GXV1=0;this.OV32GXV1=0;this.GXV2=0;this.ZV33GXV2=0;this.OV33GXV2=0;this.GXV3=0;this.ZV34GXV3=0;this.OV34GXV3=0;this.GXV4=0;this.ZV35GXV4=0;this.OV35GXV4=0;this.GXV5=0;this.ZV36GXV5=0;this.OV36GXV5=0;this.GXV6=0;this.ZV37GXV6=0;this.OV37GXV6=0;this.GXV7=0;this.ZV38GXV7=0;this.OV38GXV7=0;this.GXV8=0;this.ZV39GXV8=0;this.OV39GXV8=0;this.GXV9=0;this.ZV40GXV9=0;this.OV40GXV9=0;this.GXV10=0;this.ZV41GXV10=0;
this.OV41GXV10=0;this.GXV11=0;this.ZV42GXV11=0;this.OV42GXV11=0;this.GXV12=0;this.ZV43GXV12=0;this.OV43GXV12=0;this.GXV13=0;this.ZV44GXV13=0;this.OV44GXV13=0;this.GXV14=0;this.ZV45GXV14=0;this.OV45GXV14=0;this.GXV15=0;this.ZV46GXV15=0;this.OV46GXV15=0;this.GXV16=0;this.ZV47GXV16=0;this.OV47GXV16=0;this.GXV17=0;this.ZV48GXV17=0;this.OV48GXV17=0;this.GXV18=0;this.ZV49GXV18=0;this.OV49GXV18=0;this.GXV19=0;this.ZV50GXV19=0;this.OV50GXV19=0;this.GXV20=0;this.ZV51GXV20=0;this.OV51GXV20=0;this.GXV21=0;this.ZV52GXV21=0;
this.OV52GXV21=0;this.GXV22=0;this.ZV53GXV22=0;this.OV53GXV22=0;this.GXV23=0;this.ZV54GXV23=0;this.OV54GXV23=0;this.GXV24=0;this.ZV55GXV24=0;this.OV55GXV24=0;this.GXV25=0;this.ZV56GXV25=0;this.OV56GXV25=0;this.GXV26=0;this.ZV57GXV26=0;this.OV57GXV26=0;this.GXV27=0;this.ZV58GXV27=0;this.OV58GXV27=0;this.GXV28=0;this.ZV59GXV28=0;this.OV59GXV28=0;this.GXV29=0;this.ZV60GXV29=0;this.OV60GXV29=0;this.AV17P_MOVE_KBN=0;this.A186TBM21_STUDY_ID=0;this.AV27D_SPACE="";this.A187TBM21_STUDY_NM="";this.A513TBM21_STATUS="";
this.A189TBM21_DEL_FLG="";this.ServerEvents=["e110w2_client","e120w2_client","e130w2_client","e310w2_client","e140w2_client","e150w2_client","e160w2_client","e170w2_client","e180w2_client","e190w2_client","e200w2_client","e210w2_client","e220w2_client","e230w2_client","e240w2_client","e250w2_client","e260w2_client","e270w2_client","e320w2_client","e330w2_client"];this.VarControlMap.AV17P_MOVE_KBN={id:"vP_MOVE_KBN",grid:0,type:"int"};this.VarControlMap.AV29W_TOP_LINE_NO={id:"vW_TOP_LINE_NO",grid:0,type:"int"};
this.VarControlMap.AV21W_CNT={id:"vW_CNT",grid:0,type:"int"};this.Grid1Container.addRefreshingVar(this.GXValidFnc[186]);this.Grid1Container.addRefreshingVar(this.GXValidFnc[188]);this.Grid1Container.addRefreshingVar(this.GXValidFnc[189]);this.Grid1Container.addRefreshingVar(this.GXValidFnc[190]);this.Grid1Container.addRefreshingVar({rfrVar:"AV27D_SPACE",rfrProp:"Value",gxAttId:"D_space"});this.Grid1Container.addRefreshingVar({rfrVar:"AV29W_TOP_LINE_NO"});this.Grid1Container.addRefreshingVar({rfrVar:"AV21W_CNT"});
this.addBCProperty("H_a_paging_sdt",["MAX_ROW"],this.GXValidFnc[196],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["MAX_PAGE"],this.GXValidFnc[201],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["REC_CNT"],this.GXValidFnc[206],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_NO"],this.GXValidFnc[211],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE01"],this.GXValidFnc[216],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE02"],this.GXValidFnc[221],"AV10H_A_PAGING_SDT");
this.addBCProperty("H_a_paging_sdt",["PAGE03"],this.GXValidFnc[226],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE04"],this.GXValidFnc[231],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE05"],this.GXValidFnc[236],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE06"],this.GXValidFnc[241],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE07"],this.GXValidFnc[246],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE08"],this.GXValidFnc[251],"AV10H_A_PAGING_SDT");
this.addBCProperty("H_a_paging_sdt",["PAGE09"],this.GXValidFnc[256],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE10"],this.GXValidFnc[261],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP01"],this.GXValidFnc[266],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP02"],this.GXValidFnc[271],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP03"],this.GXValidFnc[276],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP04"],this.GXValidFnc[281],"AV10H_A_PAGING_SDT");
this.addBCProperty("H_a_paging_sdt",["PAGE_DISP05"],this.GXValidFnc[286],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP06"],this.GXValidFnc[291],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP07"],this.GXValidFnc[296],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP08"],this.GXValidFnc[301],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP09"],this.GXValidFnc[306],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP10"],this.GXValidFnc[311],"AV10H_A_PAGING_SDT");
this.addBCProperty("H_a_paging_sdt",["PAGE_DISP_BACK"],this.GXValidFnc[316],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP_NEXT"],this.GXValidFnc[321],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP_FIRST"],this.GXValidFnc[326],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP_LAST"],this.GXValidFnc[331],"AV10H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP_AREA"],this.GXValidFnc[336],"AV10H_A_PAGING_SDT");this.SetStandaloneVars();
this.setComponent({id:"WEBCOMP1",GXClass:null,Prefix:"W0009",lvl:1});this.setComponent({id:"WEBCOMP2",GXClass:null,Prefix:"W0179",lvl:1})}b402_wp01_study_list.prototype=new gx.GxObject;gx.setParentObj(new b402_wp01_study_list());