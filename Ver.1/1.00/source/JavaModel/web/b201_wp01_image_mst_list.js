gx.evt.autoSkip=false;function b201_wp01_image_mst_list(){this.ServerClass="B201_WP01_IMAGE_MST_LIST";this.PackageName="";this.setObjectType("web");this.hasEnterEvent=false;this.addKeyListener("3","e11182_client");this.addKeyListener("5","e12182_client");this.addKeyListener("6","e13182_client");this.addKeyListener("7","e14182_client");this.SetStandaloneVars=function(){this.AV18P_MOVE_KBN=gx.fn.getIntegerValue("vP_MOVE_KBN",",")};this.s162_client=function(){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption","<script language=javascript>");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"var confirmFlg = false;");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (window.addEventListener) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"  window.addEventListener('load', function(){init();}, false);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"} else if (window.attachEvent) {");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"	window.attachEvent('onload',function(){init();});");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function init() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function proc() {");
if(!(""==this.AV21W_A821_JS)){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (!confirmFlg) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+this.AV21W_A821_JS);gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = true;")}else{gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = false;")
}gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"timerID = setTimeout('proc()', 10);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"<\/script>")};this.e11182_client=function(){this.executeServerEvent("'BTN_REG'",true)};this.e12182_client=function(){this.executeServerEvent("'BTN_SRCH'",true)};this.e13182_client=function(){this.executeServerEvent("'BTN_CLER'",true)
};this.e14182_client=function(){this.executeServerEvent("'BTN_EDIT'",true)};this.e32182_client=function(){this.executeServerEvent("'BTN_SEL'",true,arguments[0])};this.e15182_client=function(){this.executeServerEvent("'PAGE_FIRST'",true)};this.e16182_client=function(){this.executeServerEvent("'PAGE_LAST'",true)};this.e17182_client=function(){this.executeServerEvent("'PAGE_BACK'",true)};this.e18182_client=function(){this.executeServerEvent("'PAGE_NEXT'",true)};this.e19182_client=function(){this.executeServerEvent("'PAGE01'",true)
};this.e20182_client=function(){this.executeServerEvent("'PAGE02'",true)};this.e21182_client=function(){this.executeServerEvent("'PAGE03'",true)};this.e22182_client=function(){this.executeServerEvent("'PAGE04'",true)};this.e23182_client=function(){this.executeServerEvent("'PAGE05'",true)};this.e24182_client=function(){this.executeServerEvent("'PAGE06'",true)};this.e25182_client=function(){this.executeServerEvent("'PAGE07'",true)};this.e26182_client=function(){this.executeServerEvent("'PAGE08'",true)
};this.e27182_client=function(){this.executeServerEvent("'PAGE09'",true)};this.e28182_client=function(){this.executeServerEvent("'PAGE10'",true)};this.e33182_client=function(){this.executeServerEvent("ENTER",true,arguments[0])};this.e34182_client=function(){this.executeServerEvent("CANCEL",true,arguments[0])};this.GXValidFnc=[];this.GXCtrlIds=[2,6,12,15,16,19,22,25,29,32,35,38,41,47,50,53,56,59,62,65,68,71,74,77,80,83,86,89,92,95,98,101,104,107,110,113,116,119,122,125,128,131,134,137,139,142,144,147,152,156,158,160,162,164,170,172,174,176,178,180,187,190,191,192,193,194,195,196,199,201,204,206,209,214,216,219,221,224,226,229,231,234,236,239,241,244,246,249,251,254,256,259,261,264,266,269,271,274,276,279,281,284,286,289,291,294,296,299,301,304,306,309,311,314,316,319,321,324,326,329,331];
this.GXLastCtrlId=331;this.Grid1Container=new gx.grid.grid(this,2,"WbpLvl2",167,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"b201_wp01_image_mst_list",[],true,1,true,true,10,false,false,false,"",0,"px","行追加",true,false,true,null,null,false,"");this.Grid1Container.startRow("","","","","","");this.Grid1Container.startCell("","center","","","","","45px","","","");this.Grid1Container.addTextBlock("BTN_SEL","e32182_client");this.Grid1Container.endCell();this.Grid1Container.startCell("","","","","","","50px","","","");
this.Grid1Container.addSingleLineEdit("D_grd_line",172,"vD_GRD_LINE","","","D_GRD_LINE","int",4,"chr",4,4,"right",null,[],"D_grd_line","D_GRD_LINE",true,0,false,false);this.Grid1Container.endCell();this.Grid1Container.startCell("","","","","","","120px","","","");this.Grid1Container.addHtmlCode('<DIV style="WIDTH: 115px" class="SectionWordBreak" id="Section1">');this.Grid1Container.addSingleLineEdit(411,174,"TBM11_IMAGE_CD","","","TBM11_IMAGE_CD","svchar",10,"chr",50,50,"left",null,[],411,"TBM11_IMAGE_CD",true,0,false,false);
this.Grid1Container.addHtmlCode("</DIV>");this.Grid1Container.endCell();this.Grid1Container.startCell("","","","","","","200px","","","");this.Grid1Container.addHtmlCode('<DIV style="WIDTH: 195px" class="SectionWordBreak" id="Section2">');this.Grid1Container.addSingleLineEdit("D_grd_study_nm",176,"vD_GRD_STUDY_NM","","","D_GRD_STUDY_NM","svchar",30,"chr",100,100,"left",null,[],"D_grd_study_nm","D_GRD_STUDY_NM",true,0,false,false);this.Grid1Container.addHtmlCode("</DIV>");this.Grid1Container.endCell();
this.Grid1Container.startCell("","","","","","","300px","","","");this.Grid1Container.addHtmlCode('<DIV style="WIDTH: 295px" class="SectionWordBreak" id="Section3">');this.Grid1Container.addSingleLineEdit(413,178,"TBM11_FILE_NAME","","","TBM11_FILE_NAME","svchar",20,"chr",100,100,"left",null,[],413,"TBM11_FILE_NAME",true,0,false,false);this.Grid1Container.addHtmlCode("</DIV>");this.Grid1Container.endCell();this.Grid1Container.startCell("","center","","","","","100px","","","");this.Grid1Container.addSingleLineEdit("D_grd_del",180,"vD_GRD_DEL","","","D_GRD_DEL","svchar",10,"chr",10,10,"left",null,[],"D_grd_del","D_GRD_DEL",true,0,false,false);
this.Grid1Container.endCell();this.Grid1Container.endRow();this.setGrid(this.Grid1Container);this.GXValidFnc[2]={fld:"TABLE1",grid:0};this.GXValidFnc[6]={fld:"TABLE2",grid:0};this.GXValidFnc[12]={fld:"TABLE8",grid:0};this.GXValidFnc[15]={fld:"TXT_BTN_REG",format:0,grid:0};this.GXValidFnc[16]={fld:"TXT_BTN_REG2",format:0,grid:0};this.GXValidFnc[19]={fld:"TABLE3",grid:0};this.GXValidFnc[22]={fld:"TABLE4",grid:0};this.GXValidFnc[25]={fld:"TABLE5",grid:0};this.GXValidFnc[29]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vD_IMAGE_CD",gxz:"ZV10D_IMAGE_CD",gxold:"OV10D_IMAGE_CD",gxvar:"AV10D_IMAGE_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV10D_IMAGE_CD=a
},v2z:function(a){gx.O.ZV10D_IMAGE_CD=a},v2c:function(){gx.fn.setControlValue("vD_IMAGE_CD",gx.O.AV10D_IMAGE_CD,0)},c2v:function(){gx.O.AV10D_IMAGE_CD=this.val()},val:function(){return gx.fn.getControlValue("vD_IMAGE_CD")},nac:function(){return false}};this.GXValidFnc[32]={lvl:0,type:"svchar",len:100,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vD_FILE_NAME",gxz:"ZV7D_FILE_NAME",gxold:"OV7D_FILE_NAME",gxvar:"AV7D_FILE_NAME",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV7D_FILE_NAME=a
},v2z:function(a){gx.O.ZV7D_FILE_NAME=a},v2c:function(){gx.fn.setControlValue("vD_FILE_NAME",gx.O.AV7D_FILE_NAME,0)},c2v:function(){gx.O.AV7D_FILE_NAME=this.val()},val:function(){return gx.fn.getControlValue("vD_FILE_NAME")},nac:function(){return false}};this.GXValidFnc[35]={fld:"TABLE9",grid:0};this.GXValidFnc[38]={fld:"TEXTBLOCK45",format:0,grid:0};this.GXValidFnc[41]={fld:"TEXTBLOCK44",format:0,grid:0};this.GXValidFnc[47]={fld:"TBL_PAGE_AREA",grid:0};this.GXValidFnc[50]={fld:"TXT_REC_CNT",format:0,grid:0};
this.GXValidFnc[53]={fld:"TBL_PAGE",grid:0};this.GXValidFnc[56]={fld:"TBL_FIRST",grid:0};this.GXValidFnc[59]={fld:"TXT_FIRST",format:0,grid:0};this.GXValidFnc[62]={fld:"TBL_BACK",grid:0};this.GXValidFnc[65]={fld:"TXT_BACK",format:0,grid:0};this.GXValidFnc[68]={fld:"TBL_PAGE01",grid:0};this.GXValidFnc[71]={fld:"TXT_PAGE01",format:0,grid:0};this.GXValidFnc[74]={fld:"TBL_PAGE02",grid:0};this.GXValidFnc[77]={fld:"TXT_PAGE02",format:0,grid:0};this.GXValidFnc[80]={fld:"TBL_PAGE03",grid:0};this.GXValidFnc[83]={fld:"TXT_PAGE03",format:0,grid:0};
this.GXValidFnc[86]={fld:"TBL_PAGE04",grid:0};this.GXValidFnc[89]={fld:"TXT_PAGE04",format:0,grid:0};this.GXValidFnc[92]={fld:"TBL_PAGE05",grid:0};this.GXValidFnc[95]={fld:"TXT_PAGE05",format:0,grid:0};this.GXValidFnc[98]={fld:"TBL_PAGE06",grid:0};this.GXValidFnc[101]={fld:"TXT_PAGE06",format:0,grid:0};this.GXValidFnc[104]={fld:"TBL_PAGE07",grid:0};this.GXValidFnc[107]={fld:"TXT_PAGE07",format:0,grid:0};this.GXValidFnc[110]={fld:"TBL_PAGE08",grid:0};this.GXValidFnc[113]={fld:"TXT_PAGE08",format:0,grid:0};
this.GXValidFnc[116]={fld:"TBL_PAGE09",grid:0};this.GXValidFnc[119]={fld:"TXT_PAGE09",format:0,grid:0};this.GXValidFnc[122]={fld:"TBL_PAGE10",grid:0};this.GXValidFnc[125]={fld:"TXT_PAGE10",format:0,grid:0};this.GXValidFnc[128]={fld:"TBL_NEXT",grid:0};this.GXValidFnc[131]={fld:"TXT_NEXT",format:0,grid:0};this.GXValidFnc[134]={fld:"TBL_LAST",grid:0};this.GXValidFnc[137]={fld:"TXT_LAST",format:0,grid:0};this.GXValidFnc[139]={fld:"TBL_EDIT",grid:0};this.GXValidFnc[142]={fld:"TEXTBLOCK29",format:0,grid:0};
this.GXValidFnc[144]={lvl:0,type:"char",len:4,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vD_LINE",gxz:"ZV11D_LINE",gxold:"OV11D_LINE",gxvar:"AV11D_LINE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV11D_LINE=a},v2z:function(a){gx.O.ZV11D_LINE=a},v2c:function(){gx.fn.setControlValue("vD_LINE",gx.O.AV11D_LINE,0)},c2v:function(){gx.O.AV11D_LINE=this.val()},val:function(){return gx.fn.getControlValue("vD_LINE")},nac:function(){return false}};this.GXValidFnc[147]={fld:"TEXTBLOCK28",format:0,grid:0};
this.GXValidFnc[152]={fld:"TBL_GRID_HEADER",grid:0};this.GXValidFnc[156]={fld:"TEXTBLOCK34",format:0,grid:0};this.GXValidFnc[158]={fld:"TEXTBLOCK32",format:0,grid:0};this.GXValidFnc[160]={fld:"TEXTBLOCK30",format:0,grid:0};this.GXValidFnc[162]={fld:"TEXTBLOCK31",format:0,grid:0};this.GXValidFnc[164]={fld:"TEXTBLOCK33",format:0,grid:0};this.GXValidFnc[170]={fld:"BTN_SEL",format:0,grid:167};this.GXValidFnc[172]={lvl:2,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:167,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vD_GRD_LINE",gxz:"ZV9D_GRD_LINE",gxold:"OV9D_GRD_LINE",gxvar:"AV9D_GRD_LINE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV9D_GRD_LINE=gx.num.intval(a)
},v2z:function(a){gx.O.ZV9D_GRD_LINE=gx.num.intval(a)},v2c:function(){gx.fn.setGridControlValue("vD_GRD_LINE",gx.fn.currentGridRowImpl(167),gx.O.AV9D_GRD_LINE,0)},c2v:function(){gx.O.AV9D_GRD_LINE=this.val()},val:function(){return gx.fn.getGridIntegerValue("vD_GRD_LINE",gx.fn.currentGridRowImpl(167),",")},nac:function(){return false}};this.GXValidFnc[174]={lvl:2,type:"svchar",len:50,dec:0,sign:false,ro:1,grid:167,gxgrid:this.Grid1Container,fnc:null,isvalid:null,fld:"TBM11_IMAGE_CD",gxz:"Z411TBM11_IMAGE_CD",gxold:"O411TBM11_IMAGE_CD",gxvar:"A411TBM11_IMAGE_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A411TBM11_IMAGE_CD=a
},v2z:function(a){gx.O.Z411TBM11_IMAGE_CD=a},v2c:function(){gx.fn.setGridControlValue("TBM11_IMAGE_CD",gx.fn.currentGridRowImpl(167),gx.O.A411TBM11_IMAGE_CD,0)},c2v:function(){gx.O.A411TBM11_IMAGE_CD=this.val()},val:function(){return gx.fn.getGridControlValue("TBM11_IMAGE_CD",gx.fn.currentGridRowImpl(167))},nac:function(){return false}};this.GXValidFnc[176]={lvl:2,type:"svchar",len:100,dec:0,sign:false,ro:0,grid:167,gxgrid:this.Grid1Container,fnc:null,isvalid:null,fld:"vD_GRD_STUDY_NM",gxz:"ZV30D_GRD_STUDY_NM",gxold:"OV30D_GRD_STUDY_NM",gxvar:"AV30D_GRD_STUDY_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV30D_GRD_STUDY_NM=a
},v2z:function(a){gx.O.ZV30D_GRD_STUDY_NM=a},v2c:function(){gx.fn.setGridControlValue("vD_GRD_STUDY_NM",gx.fn.currentGridRowImpl(167),gx.O.AV30D_GRD_STUDY_NM,0)},c2v:function(){gx.O.AV30D_GRD_STUDY_NM=this.val()},val:function(){return gx.fn.getGridControlValue("vD_GRD_STUDY_NM",gx.fn.currentGridRowImpl(167))},nac:function(){return false}};this.GXValidFnc[178]={lvl:2,type:"svchar",len:100,dec:0,sign:false,ro:1,grid:167,gxgrid:this.Grid1Container,fnc:null,isvalid:null,fld:"TBM11_FILE_NAME",gxz:"Z413TBM11_FILE_NAME",gxold:"O413TBM11_FILE_NAME",gxvar:"A413TBM11_FILE_NAME",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A413TBM11_FILE_NAME=a
},v2z:function(a){gx.O.Z413TBM11_FILE_NAME=a},v2c:function(){gx.fn.setGridControlValue("TBM11_FILE_NAME",gx.fn.currentGridRowImpl(167),gx.O.A413TBM11_FILE_NAME,0)},c2v:function(){gx.O.A413TBM11_FILE_NAME=this.val()},val:function(){return gx.fn.getGridControlValue("TBM11_FILE_NAME",gx.fn.currentGridRowImpl(167))},nac:function(){return false}};this.GXValidFnc[180]={lvl:2,type:"svchar",len:10,dec:0,sign:false,ro:0,grid:167,gxgrid:this.Grid1Container,fnc:null,isvalid:null,fld:"vD_GRD_DEL",gxz:"ZV8D_GRD_DEL",gxold:"OV8D_GRD_DEL",gxvar:"AV8D_GRD_DEL",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV8D_GRD_DEL=a
},v2z:function(a){gx.O.ZV8D_GRD_DEL=a},v2c:function(){gx.fn.setGridControlValue("vD_GRD_DEL",gx.fn.currentGridRowImpl(167),gx.O.AV8D_GRD_DEL,0)},c2v:function(){gx.O.AV8D_GRD_DEL=this.val()},val:function(){return gx.fn.getGridControlValue("vD_GRD_DEL",gx.fn.currentGridRowImpl(167))},nac:function(){return false}};this.GXValidFnc[187]={fld:"TBL_HIDDEN",grid:0};this.GXValidFnc[190]={fld:"TXT_JS_EVENT",format:1,grid:0};this.GXValidFnc[191]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_INIT_FLG",gxz:"ZV15H_INIT_FLG",gxold:"OV15H_INIT_FLG",gxvar:"AV15H_INIT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV15H_INIT_FLG=a
},v2z:function(a){gx.O.ZV15H_INIT_FLG=a},v2c:function(){gx.fn.setControlValue("vH_INIT_FLG",gx.O.AV15H_INIT_FLG,0)},c2v:function(){gx.O.AV15H_INIT_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_INIT_FLG")},nac:function(){return false}};this.GXValidFnc[192]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_SRCH_FLG",gxz:"ZV17H_SRCH_FLG",gxold:"OV17H_SRCH_FLG",gxvar:"AV17H_SRCH_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV17H_SRCH_FLG=a
},v2z:function(a){gx.O.ZV17H_SRCH_FLG=a},v2c:function(){gx.fn.setControlValue("vH_SRCH_FLG",gx.O.AV17H_SRCH_FLG,0)},c2v:function(){gx.O.AV17H_SRCH_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_SRCH_FLG")},nac:function(){return false}};this.GXValidFnc[193]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_KNGN_FLG",gxz:"ZV16H_KNGN_FLG",gxold:"OV16H_KNGN_FLG",gxvar:"AV16H_KNGN_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV16H_KNGN_FLG=a
},v2z:function(a){gx.O.ZV16H_KNGN_FLG=a},v2c:function(){gx.fn.setControlValue("vH_KNGN_FLG",gx.O.AV16H_KNGN_FLG,0)},c2v:function(){gx.O.AV16H_KNGN_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_KNGN_FLG")},nac:function(){return false}};this.GXValidFnc[194]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_IMAGE_CD",gxz:"ZV14H_IMAGE_CD",gxold:"OV14H_IMAGE_CD",gxvar:"AV14H_IMAGE_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV14H_IMAGE_CD=a
},v2z:function(a){gx.O.ZV14H_IMAGE_CD=a},v2c:function(){gx.fn.setControlValue("vH_IMAGE_CD",gx.O.AV14H_IMAGE_CD,0)},c2v:function(){gx.O.AV14H_IMAGE_CD=this.val()},val:function(){return gx.fn.getControlValue("vH_IMAGE_CD")},nac:function(){return false}};this.GXValidFnc[195]={lvl:0,type:"svchar",len:100,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_FILE_NAME",gxz:"ZV13H_FILE_NAME",gxold:"OV13H_FILE_NAME",gxvar:"AV13H_FILE_NAME",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV13H_FILE_NAME=a
},v2z:function(a){gx.O.ZV13H_FILE_NAME=a},v2c:function(){gx.fn.setControlValue("vH_FILE_NAME",gx.O.AV13H_FILE_NAME,0)},c2v:function(){gx.O.AV13H_FILE_NAME=this.val()},val:function(){return gx.fn.getControlValue("vH_FILE_NAME")},nac:function(){return false}};this.GXValidFnc[196]={fld:"TABLE7",grid:0};this.GXValidFnc[199]={fld:"TEXTBLOCK1",format:0,grid:0};this.GXValidFnc[201]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLMAX_ROW",gxz:"ZV33GXV1",gxold:"OV33GXV1",gxvar:"GXV1",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV1=gx.num.intval(a)
},v2z:function(a){gx.O.ZV33GXV1=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLMAX_ROW",gx.O.GXV1,0)},c2v:function(){gx.O.GXV1=this.val()},val:function(){return gx.fn.getIntegerValue("CTLMAX_ROW",",")},nac:function(){return false}};this.GXValidFnc[204]={fld:"TEXTBLOCK2",format:0,grid:0};this.GXValidFnc[206]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLREC_CNT",gxz:"ZV34GXV2",gxold:"OV34GXV2",gxvar:"GXV2",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV2=gx.num.intval(a)
},v2z:function(a){gx.O.ZV34GXV2=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLREC_CNT",gx.O.GXV2,0)},c2v:function(){gx.O.GXV2=this.val()},val:function(){return gx.fn.getIntegerValue("CTLREC_CNT",",")},nac:function(){return false}};this.GXValidFnc[209]={fld:"TEXTBLOCK3",format:0,grid:0};this.GXValidFnc[214]={fld:"TEXTBLOCK4",format:0,grid:0};this.GXValidFnc[216]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_NO",gxz:"ZV35GXV4",gxold:"OV35GXV4",gxvar:"GXV4",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV4=gx.num.intval(a)
},v2z:function(a){gx.O.ZV35GXV4=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_NO",gx.O.GXV4,0)},c2v:function(){gx.O.GXV4=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_NO",",")},nac:function(){return false}};this.GXValidFnc[219]={fld:"TEXTBLOCK5",format:0,grid:0};this.GXValidFnc[221]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE01",gxz:"ZV36GXV5",gxold:"OV36GXV5",gxvar:"GXV5",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV5=gx.num.intval(a)
},v2z:function(a){gx.O.ZV36GXV5=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE01",gx.O.GXV5,0)},c2v:function(){gx.O.GXV5=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE01",",")},nac:function(){return false}};this.GXValidFnc[224]={fld:"TEXTBLOCK6",format:0,grid:0};this.GXValidFnc[226]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE02",gxz:"ZV37GXV6",gxold:"OV37GXV6",gxvar:"GXV6",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV6=gx.num.intval(a)
},v2z:function(a){gx.O.ZV37GXV6=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE02",gx.O.GXV6,0)},c2v:function(){gx.O.GXV6=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE02",",")},nac:function(){return false}};this.GXValidFnc[229]={fld:"TEXTBLOCK7",format:0,grid:0};this.GXValidFnc[231]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE03",gxz:"ZV38GXV7",gxold:"OV38GXV7",gxvar:"GXV7",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV7=gx.num.intval(a)
},v2z:function(a){gx.O.ZV38GXV7=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE03",gx.O.GXV7,0)},c2v:function(){gx.O.GXV7=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE03",",")},nac:function(){return false}};this.GXValidFnc[234]={fld:"TEXTBLOCK8",format:0,grid:0};this.GXValidFnc[236]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE04",gxz:"ZV39GXV8",gxold:"OV39GXV8",gxvar:"GXV8",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV8=gx.num.intval(a)
},v2z:function(a){gx.O.ZV39GXV8=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE04",gx.O.GXV8,0)},c2v:function(){gx.O.GXV8=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE04",",")},nac:function(){return false}};this.GXValidFnc[239]={fld:"TEXTBLOCK9",format:0,grid:0};this.GXValidFnc[241]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE05",gxz:"ZV40GXV9",gxold:"OV40GXV9",gxvar:"GXV9",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV9=gx.num.intval(a)
},v2z:function(a){gx.O.ZV40GXV9=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE05",gx.O.GXV9,0)},c2v:function(){gx.O.GXV9=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE05",",")},nac:function(){return false}};this.GXValidFnc[244]={fld:"TEXTBLOCK10",format:0,grid:0};this.GXValidFnc[246]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE06",gxz:"ZV41GXV10",gxold:"OV41GXV10",gxvar:"GXV10",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV10=gx.num.intval(a)
},v2z:function(a){gx.O.ZV41GXV10=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE06",gx.O.GXV10,0)},c2v:function(){gx.O.GXV10=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE06",",")},nac:function(){return false}};this.GXValidFnc[249]={fld:"TEXTBLOCK11",format:0,grid:0};this.GXValidFnc[251]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE07",gxz:"ZV42GXV11",gxold:"OV42GXV11",gxvar:"GXV11",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV11=gx.num.intval(a)
},v2z:function(a){gx.O.ZV42GXV11=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE07",gx.O.GXV11,0)},c2v:function(){gx.O.GXV11=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE07",",")},nac:function(){return false}};this.GXValidFnc[254]={fld:"TEXTBLOCK12",format:0,grid:0};this.GXValidFnc[256]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE08",gxz:"ZV43GXV12",gxold:"OV43GXV12",gxvar:"GXV12",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV12=gx.num.intval(a)
},v2z:function(a){gx.O.ZV43GXV12=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE08",gx.O.GXV12,0)},c2v:function(){gx.O.GXV12=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE08",",")},nac:function(){return false}};this.GXValidFnc[259]={fld:"TEXTBLOCK13",format:0,grid:0};this.GXValidFnc[261]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE09",gxz:"ZV44GXV13",gxold:"OV44GXV13",gxvar:"GXV13",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV13=gx.num.intval(a)
},v2z:function(a){gx.O.ZV44GXV13=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE09",gx.O.GXV13,0)},c2v:function(){gx.O.GXV13=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE09",",")},nac:function(){return false}};this.GXValidFnc[264]={fld:"TEXTBLOCK14",format:0,grid:0};this.GXValidFnc[266]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE10",gxz:"ZV45GXV14",gxold:"OV45GXV14",gxvar:"GXV14",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV14=gx.num.intval(a)
},v2z:function(a){gx.O.ZV45GXV14=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE10",gx.O.GXV14,0)},c2v:function(){gx.O.GXV14=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE10",",")},nac:function(){return false}};this.GXValidFnc[269]={fld:"TEXTBLOCK15",format:0,grid:0};this.GXValidFnc[271]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP01",gxz:"ZV46GXV15",gxold:"OV46GXV15",gxvar:"GXV15",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV15=gx.num.intval(a)
},v2z:function(a){gx.O.ZV46GXV15=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP01",gx.O.GXV15,0)},c2v:function(){gx.O.GXV15=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP01",",")},nac:function(){return false}};this.GXValidFnc[274]={fld:"TEXTBLOCK16",format:0,grid:0};this.GXValidFnc[276]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP02",gxz:"ZV47GXV16",gxold:"OV47GXV16",gxvar:"GXV16",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV16=gx.num.intval(a)
},v2z:function(a){gx.O.ZV47GXV16=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP02",gx.O.GXV16,0)},c2v:function(){gx.O.GXV16=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP02",",")},nac:function(){return false}};this.GXValidFnc[279]={fld:"TEXTBLOCK17",format:0,grid:0};this.GXValidFnc[281]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP03",gxz:"ZV48GXV17",gxold:"OV48GXV17",gxvar:"GXV17",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV17=gx.num.intval(a)
},v2z:function(a){gx.O.ZV48GXV17=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP03",gx.O.GXV17,0)},c2v:function(){gx.O.GXV17=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP03",",")},nac:function(){return false}};this.GXValidFnc[284]={fld:"TEXTBLOCK18",format:0,grid:0};this.GXValidFnc[286]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP04",gxz:"ZV49GXV18",gxold:"OV49GXV18",gxvar:"GXV18",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV18=gx.num.intval(a)
},v2z:function(a){gx.O.ZV49GXV18=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP04",gx.O.GXV18,0)},c2v:function(){gx.O.GXV18=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP04",",")},nac:function(){return false}};this.GXValidFnc[289]={fld:"TEXTBLOCK19",format:0,grid:0};this.GXValidFnc[291]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP05",gxz:"ZV50GXV19",gxold:"OV50GXV19",gxvar:"GXV19",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV19=gx.num.intval(a)
},v2z:function(a){gx.O.ZV50GXV19=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP05",gx.O.GXV19,0)},c2v:function(){gx.O.GXV19=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP05",",")},nac:function(){return false}};this.GXValidFnc[294]={fld:"TEXTBLOCK20",format:0,grid:0};this.GXValidFnc[296]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP06",gxz:"ZV51GXV20",gxold:"OV51GXV20",gxvar:"GXV20",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV20=gx.num.intval(a)
},v2z:function(a){gx.O.ZV51GXV20=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP06",gx.O.GXV20,0)},c2v:function(){gx.O.GXV20=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP06",",")},nac:function(){return false}};this.GXValidFnc[299]={fld:"TEXTBLOCK21",format:0,grid:0};this.GXValidFnc[301]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP07",gxz:"ZV52GXV21",gxold:"OV52GXV21",gxvar:"GXV21",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV21=gx.num.intval(a)
},v2z:function(a){gx.O.ZV52GXV21=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP07",gx.O.GXV21,0)},c2v:function(){gx.O.GXV21=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP07",",")},nac:function(){return false}};this.GXValidFnc[304]={fld:"TEXTBLOCK22",format:0,grid:0};this.GXValidFnc[306]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP08",gxz:"ZV53GXV22",gxold:"OV53GXV22",gxvar:"GXV22",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV22=gx.num.intval(a)
},v2z:function(a){gx.O.ZV53GXV22=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP08",gx.O.GXV22,0)},c2v:function(){gx.O.GXV22=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP08",",")},nac:function(){return false}};this.GXValidFnc[309]={fld:"TEXTBLOCK23",format:0,grid:0};this.GXValidFnc[311]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP09",gxz:"ZV54GXV23",gxold:"OV54GXV23",gxvar:"GXV23",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV23=gx.num.intval(a)
},v2z:function(a){gx.O.ZV54GXV23=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP09",gx.O.GXV23,0)},c2v:function(){gx.O.GXV23=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP09",",")},nac:function(){return false}};this.GXValidFnc[314]={fld:"TEXTBLOCK24",format:0,grid:0};this.GXValidFnc[316]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP10",gxz:"ZV55GXV24",gxold:"OV55GXV24",gxvar:"GXV24",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV24=gx.num.intval(a)
},v2z:function(a){gx.O.ZV55GXV24=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP10",gx.O.GXV24,0)},c2v:function(){gx.O.GXV24=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP10",",")},nac:function(){return false}};this.GXValidFnc[319]={fld:"TEXTBLOCK25",format:0,grid:0};this.GXValidFnc[321]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP_BACK",gxz:"ZV56GXV25",gxold:"OV56GXV25",gxvar:"GXV25",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV25=gx.num.intval(a)
},v2z:function(a){gx.O.ZV56GXV25=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP_BACK",gx.O.GXV25,0)},c2v:function(){gx.O.GXV25=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP_BACK",",")},nac:function(){return false}};this.GXValidFnc[324]={fld:"TEXTBLOCK26",format:0,grid:0};this.GXValidFnc[326]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP_NEXT",gxz:"ZV57GXV26",gxold:"OV57GXV26",gxvar:"GXV26",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV26=gx.num.intval(a)
},v2z:function(a){gx.O.ZV57GXV26=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP_NEXT",gx.O.GXV26,0)},c2v:function(){gx.O.GXV26=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP_NEXT",",")},nac:function(){return false}};this.GXValidFnc[329]={fld:"TEXTBLOCK27",format:0,grid:0};this.GXValidFnc[331]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP_AREA",gxz:"ZV58GXV27",gxold:"OV58GXV27",gxvar:"GXV27",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV27=gx.num.intval(a)
},v2z:function(a){gx.O.ZV58GXV27=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP_AREA",gx.O.GXV27,0)},c2v:function(){gx.O.GXV27=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP_AREA",",")},nac:function(){return false}};this.AV10D_IMAGE_CD="";this.ZV10D_IMAGE_CD="";this.OV10D_IMAGE_CD="";this.AV7D_FILE_NAME="";this.ZV7D_FILE_NAME="";this.OV7D_FILE_NAME="";this.AV11D_LINE="";this.ZV11D_LINE="";this.OV11D_LINE="";this.ZV9D_GRD_LINE=0;this.OV9D_GRD_LINE=0;this.Z411TBM11_IMAGE_CD="";
this.O411TBM11_IMAGE_CD="";this.ZV30D_GRD_STUDY_NM="";this.OV30D_GRD_STUDY_NM="";this.Z413TBM11_FILE_NAME="";this.O413TBM11_FILE_NAME="";this.ZV8D_GRD_DEL="";this.OV8D_GRD_DEL="";this.AV15H_INIT_FLG="";this.ZV15H_INIT_FLG="";this.OV15H_INIT_FLG="";this.AV17H_SRCH_FLG="";this.ZV17H_SRCH_FLG="";this.OV17H_SRCH_FLG="";this.AV16H_KNGN_FLG="";this.ZV16H_KNGN_FLG="";this.OV16H_KNGN_FLG="";this.AV14H_IMAGE_CD="";this.ZV14H_IMAGE_CD="";this.OV14H_IMAGE_CD="";this.AV13H_FILE_NAME="";this.ZV13H_FILE_NAME="";
this.OV13H_FILE_NAME="";this.GXV1=0;this.ZV33GXV1=0;this.OV33GXV1=0;this.GXV2=0;this.ZV34GXV2=0;this.OV34GXV2=0;this.GXV4=0;this.ZV35GXV4=0;this.OV35GXV4=0;this.GXV5=0;this.ZV36GXV5=0;this.OV36GXV5=0;this.GXV6=0;this.ZV37GXV6=0;this.OV37GXV6=0;this.GXV7=0;this.ZV38GXV7=0;this.OV38GXV7=0;this.GXV8=0;this.ZV39GXV8=0;this.OV39GXV8=0;this.GXV9=0;this.ZV40GXV9=0;this.OV40GXV9=0;this.GXV10=0;this.ZV41GXV10=0;this.OV41GXV10=0;this.GXV11=0;this.ZV42GXV11=0;this.OV42GXV11=0;this.GXV12=0;this.ZV43GXV12=0;this.OV43GXV12=0;
this.GXV13=0;this.ZV44GXV13=0;this.OV44GXV13=0;this.GXV14=0;this.ZV45GXV14=0;this.OV45GXV14=0;this.GXV15=0;this.ZV46GXV15=0;this.OV46GXV15=0;this.GXV16=0;this.ZV47GXV16=0;this.OV47GXV16=0;this.GXV17=0;this.ZV48GXV17=0;this.OV48GXV17=0;this.GXV18=0;this.ZV49GXV18=0;this.OV49GXV18=0;this.GXV19=0;this.ZV50GXV19=0;this.OV50GXV19=0;this.GXV20=0;this.ZV51GXV20=0;this.OV51GXV20=0;this.GXV21=0;this.ZV52GXV21=0;this.OV52GXV21=0;this.GXV22=0;this.ZV53GXV22=0;this.OV53GXV22=0;this.GXV23=0;this.ZV54GXV23=0;this.OV54GXV23=0;
this.GXV24=0;this.ZV55GXV24=0;this.OV55GXV24=0;this.GXV25=0;this.ZV56GXV25=0;this.OV56GXV25=0;this.GXV26=0;this.ZV57GXV26=0;this.OV57GXV26=0;this.GXV27=0;this.ZV58GXV27=0;this.OV58GXV27=0;this.GXV3="";this.AV18P_MOVE_KBN=0;this.A512TBM11_STUDY_ID=0;this.A414TBM11_DEL_FLG="";this.AV9D_GRD_LINE=0;this.A411TBM11_IMAGE_CD="";this.AV30D_GRD_STUDY_NM="";this.A413TBM11_FILE_NAME="";this.AV8D_GRD_DEL="";this.A186TBM21_STUDY_ID=0;this.A187TBM21_STUDY_NM="";this.AV21W_A821_JS="";this.ServerEvents=["e11182_client","e12182_client","e13182_client","e14182_client","e32182_client","e15182_client","e16182_client","e17182_client","e18182_client","e19182_client","e20182_client","e21182_client","e22182_client","e23182_client","e24182_client","e25182_client","e26182_client","e27182_client","e28182_client","e33182_client","e34182_client"];
this.VarControlMap.AV18P_MOVE_KBN={id:"vP_MOVE_KBN",grid:0,type:"int"};this.VarControlMap.A187TBM21_STUDY_NM={id:"TBM21_STUDY_NM",grid:0,type:"svchar"};this.VarControlMap.AV29W_TOP_LINE_NO={id:"vW_TOP_LINE_NO",grid:0,type:"int"};this.VarControlMap.AV28W_CNT={id:"vW_CNT",grid:0,type:"int"};this.VarControlMap.AV24W_F7FLG={id:"vW_F7FLG",grid:0,type:"boolean"};this.Grid1Container.addRefreshingVar(this.GXValidFnc[192]);this.Grid1Container.addRefreshingVar(this.GXValidFnc[194]);this.Grid1Container.addRefreshingVar(this.GXValidFnc[195]);
this.Grid1Container.addRefreshingVar({rfrVar:"A187TBM21_STUDY_NM"});this.Grid1Container.addRefreshingVar({rfrVar:"AV29W_TOP_LINE_NO"});this.Grid1Container.addRefreshingVar({rfrVar:"AV28W_CNT"});this.Grid1Container.addRefreshingVar({rfrVar:"AV24W_F7FLG"});this.addBCProperty("H_a_paging_sdt",["MAX_ROW"],this.GXValidFnc[201],"AV12H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["REC_CNT"],this.GXValidFnc[206],"AV12H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_NO"],this.GXValidFnc[216],"AV12H_A_PAGING_SDT");
this.addBCProperty("H_a_paging_sdt",["PAGE01"],this.GXValidFnc[221],"AV12H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE02"],this.GXValidFnc[226],"AV12H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE03"],this.GXValidFnc[231],"AV12H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE04"],this.GXValidFnc[236],"AV12H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE05"],this.GXValidFnc[241],"AV12H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE06"],this.GXValidFnc[246],"AV12H_A_PAGING_SDT");
this.addBCProperty("H_a_paging_sdt",["PAGE07"],this.GXValidFnc[251],"AV12H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE08"],this.GXValidFnc[256],"AV12H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE09"],this.GXValidFnc[261],"AV12H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE10"],this.GXValidFnc[266],"AV12H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP01"],this.GXValidFnc[271],"AV12H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP02"],this.GXValidFnc[276],"AV12H_A_PAGING_SDT");
this.addBCProperty("H_a_paging_sdt",["PAGE_DISP03"],this.GXValidFnc[281],"AV12H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP04"],this.GXValidFnc[286],"AV12H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP05"],this.GXValidFnc[291],"AV12H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP06"],this.GXValidFnc[296],"AV12H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP07"],this.GXValidFnc[301],"AV12H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP08"],this.GXValidFnc[306],"AV12H_A_PAGING_SDT");
this.addBCProperty("H_a_paging_sdt",["PAGE_DISP09"],this.GXValidFnc[311],"AV12H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP10"],this.GXValidFnc[316],"AV12H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP_BACK"],this.GXValidFnc[321],"AV12H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP_NEXT"],this.GXValidFnc[326],"AV12H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP_AREA"],this.GXValidFnc[331],"AV12H_A_PAGING_SDT");this.SetStandaloneVars();
this.setComponent({id:"WEBCOMP1",GXClass:null,Prefix:"W0009",lvl:1});this.setComponent({id:"WEBCOMP2",GXClass:null,Prefix:"W0185",lvl:1})}b201_wp01_image_mst_list.prototype=new gx.GxObject;gx.setParentObj(new b201_wp01_image_mst_list());