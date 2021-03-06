/*
               File: tbw14_crf_sdt_work_impl
        Description: CRF入力SDTワーク
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:22:8.36
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw14_crf_sdt_work_impl extends GXWebPanel
{
   public void initenv( )
   {
      if ( GxWebError != 0 )
      {
         return  ;
      }
   }

   public void inittrn( )
   {
      initialize_properties( ) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      gxfirstwebparm_bkp = gxfirstwebparm ;
      gxfirstwebparm = httpContext.DecryptAjaxCall( gxfirstwebparm) ;
      if ( GXutil.strcmp(gxfirstwebparm, "dyncall") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         dyncall( httpContext.GetNextPar( )) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
      {
         httpContext.setAjaxEventMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else
      {
         if ( ! httpContext.IsValidAjaxCall( false) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = gxfirstwebparm_bkp ;
      }
      GXKey = context.getSiteKey( ) ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "CRF入力SDTワーク", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBW14_SESSION_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbw14_crf_sdt_work_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbw14_crf_sdt_work_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbw14_crf_sdt_work_impl.class ));
   }

   public tbw14_crf_sdt_work_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void webExecute( )
   {
      initenv( ) ;
      inittrn( ) ;
      if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
      {
         validateSpaRequest();
         userMain( ) ;
         if ( ! isFullAjaxMode( ) )
         {
            draw( ) ;
         }
         if ( ( GxWebError == 0 ) && httpContext.isAjaxRequest( ) )
         {
            httpContext.enableOutput();
            if ( ! httpContext.isAjaxRequest( ) )
            {
               httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
            }
            if ( (GXutil.strcmp("", httpContext.wjLoc)==0) )
            {
               httpContext.GX_webresponse.addString(httpContext.getJSONResponse( ));
            }
            else
            {
               if ( httpContext.isAjaxRequest( ) )
               {
                  httpContext.disableOutput();
               }
               renderHtmlHeaders( ) ;
               httpContext.redirect( httpContext.wjLoc );
               httpContext.dispatchAjaxCommands();
            }
         }
      }
      cleanup();
   }

   public void draw( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         disable_std_buttons( ) ;
         enableDisable( ) ;
         set_caption( ) ;
         /* Form start */
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         wb_table1_2_1H60( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1H60e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1H60( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1H60( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1H60( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1H60e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "CRF入力SDTワーク", 1, 0, "px", 0, "px", "Group", "", "HLP_TBW14_CRF_SDT_WORK.htm");
         wb_table3_28_1H60( true) ;
      }
      return  ;
   }

   public void wb_table3_28_1H60e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1H60e( true) ;
      }
      else
      {
         wb_table1_2_1H60e( false) ;
      }
   }

   public void wb_table3_28_1H60( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table4_34_1H60( true) ;
      }
      return  ;
   }

   public void wb_table4_34_1H60e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW14_CRF_SDT_WORK.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW14_CRF_SDT_WORK.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW14_CRF_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_1H60e( true) ;
      }
      else
      {
         wb_table3_28_1H60e( false) ;
      }
   }

   public void wb_table4_34_1H60( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Container", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw14_session_id_Internalname, "ID", "", "", lblTextblocktbw14_session_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW14_CRF_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW14_SESSION_ID_Internalname, GXutil.rtrim( A192TBW14_SESSION_ID), GXutil.rtrim( localUtil.format( A192TBW14_SESSION_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW14_SESSION_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW14_SESSION_ID_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_SESSION_ID", "left", "HLP_TBW14_CRF_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw14_disp_datetime_Internalname, "ブラウザ表示日時", "", "", lblTextblocktbw14_disp_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW14_CRF_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW14_DISP_DATETIME_Internalname, GXutil.rtrim( A193TBW14_DISP_DATETIME), GXutil.rtrim( localUtil.format( A193TBW14_DISP_DATETIME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW14_DISP_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW14_DISP_DATETIME_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_Y4MD_HMS_C", "left", "HLP_TBW14_CRF_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw14_study_id_Internalname, "ID", "", "", lblTextblocktbw14_study_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW14_CRF_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW14_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A194TBW14_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBW14_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194TBW14_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A194TBW14_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW14_STUDY_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW14_STUDY_ID_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_STUDY_ID", "right", "HLP_TBW14_CRF_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw14_subject_id_Internalname, "ID", "", "", lblTextblocktbw14_subject_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW14_CRF_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW14_SUBJECT_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A195TBW14_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtTBW14_SUBJECT_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A195TBW14_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A195TBW14_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW14_SUBJECT_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW14_SUBJECT_ID_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_SUBJECT_ID", "right", "HLP_TBW14_CRF_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw14_crf_id_Internalname, "ID", "", "", lblTextblocktbw14_crf_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW14_CRF_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW14_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A196TBW14_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBW14_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A196TBW14_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A196TBW14_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW14_CRF_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW14_CRF_ID_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_CRF_ID", "right", "HLP_TBW14_CRF_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw14_crf_eda_no_Internalname, "CRF枝番", "", "", lblTextblocktbw14_crf_eda_no_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW14_CRF_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW14_CRF_EDA_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A940TBW14_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")), ((edtTBW14_CRF_EDA_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A940TBW14_CRF_EDA_NO), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A940TBW14_CRF_EDA_NO), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW14_CRF_EDA_NO_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW14_CRF_EDA_NO_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW14_CRF_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw14_crf_latest_version_Internalname, "CRF更新バージョン", "", "", lblTextblocktbw14_crf_latest_version_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW14_CRF_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW14_CRF_LATEST_VERSION_Internalname, GXutil.ltrim( localUtil.ntoc( A197TBW14_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")), ((edtTBW14_CRF_LATEST_VERSION_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A197TBW14_CRF_LATEST_VERSION), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A197TBW14_CRF_LATEST_VERSION), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW14_CRF_LATEST_VERSION_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW14_CRF_LATEST_VERSION_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_CRF_VERSION", "right", "HLP_TBW14_CRF_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw14_sdt_save_Internalname, "SDT領域", "", "", lblTextblocktbw14_sdt_save_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW14_CRF_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBW14_SDT_SAVE_Internalname, A890TBW14_SDT_SAVE, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(74);\"", (short)(0), 1, edtTBW14_SDT_SAVE_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2097152", -1, "", "", (byte)(-1), true, "", "HLP_TBW14_CRF_SDT_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_1H60e( true) ;
      }
      else
      {
         wb_table4_34_1H60e( false) ;
      }
   }

   public void wb_table2_5_1H60( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTabletoolbar_Internalname, tblTabletoolbar_Internalname, "", "ViewTable", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, divSectiontoolbar_Internalname, 1, 0, "px", 0, "px", "ToolbarMain", "");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW14_CRF_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW14_CRF_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW14_CRF_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW14_CRF_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW14_CRF_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW14_CRF_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW14_CRF_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW14_CRF_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW14_CRF_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW14_CRF_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW14_CRF_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW14_CRF_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW14_CRF_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW14_CRF_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW14_CRF_SDT_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW14_CRF_SDT_WORK.htm");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_5_1H60e( true) ;
      }
      else
      {
         wb_table2_5_1H60e( false) ;
      }
   }

   public void userMain( )
   {
      standaloneStartup( ) ;
   }

   public void userMainFullajax( )
   {
      initenv( ) ;
      inittrn( ) ;
      userMain( ) ;
      draw( ) ;
   }

   public void standaloneStartup( )
   {
      standaloneStartupServer( ) ;
      disable_std_buttons( ) ;
      enableDisable( ) ;
      process( ) ;
   }

   public void standaloneStartupServer( )
   {
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A192TBW14_SESSION_ID = httpContext.cgiGet( edtTBW14_SESSION_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A192TBW14_SESSION_ID", A192TBW14_SESSION_ID);
            A193TBW14_DISP_DATETIME = httpContext.cgiGet( edtTBW14_DISP_DATETIME_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A193TBW14_DISP_DATETIME", A193TBW14_DISP_DATETIME);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW14_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW14_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW14_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW14_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A194TBW14_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A194TBW14_STUDY_ID", GXutil.ltrim( GXutil.str( A194TBW14_STUDY_ID, 10, 0)));
            }
            else
            {
               A194TBW14_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBW14_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A194TBW14_STUDY_ID", GXutil.ltrim( GXutil.str( A194TBW14_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW14_SUBJECT_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW14_SUBJECT_ID_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW14_SUBJECT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW14_SUBJECT_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A195TBW14_SUBJECT_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A195TBW14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A195TBW14_SUBJECT_ID, 6, 0)));
            }
            else
            {
               A195TBW14_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtTBW14_SUBJECT_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A195TBW14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A195TBW14_SUBJECT_ID, 6, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW14_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW14_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW14_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW14_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A196TBW14_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A196TBW14_CRF_ID", GXutil.ltrim( GXutil.str( A196TBW14_CRF_ID, 4, 0)));
            }
            else
            {
               A196TBW14_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW14_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A196TBW14_CRF_ID", GXutil.ltrim( GXutil.str( A196TBW14_CRF_ID, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW14_CRF_EDA_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW14_CRF_EDA_NO_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW14_CRF_EDA_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW14_CRF_EDA_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A940TBW14_CRF_EDA_NO = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A940TBW14_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A940TBW14_CRF_EDA_NO, 2, 0)));
            }
            else
            {
               A940TBW14_CRF_EDA_NO = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBW14_CRF_EDA_NO_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A940TBW14_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A940TBW14_CRF_EDA_NO, 2, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW14_CRF_LATEST_VERSION_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW14_CRF_LATEST_VERSION_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW14_CRF_LATEST_VERSION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW14_CRF_LATEST_VERSION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A197TBW14_CRF_LATEST_VERSION = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A197TBW14_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A197TBW14_CRF_LATEST_VERSION, 4, 0)));
            }
            else
            {
               A197TBW14_CRF_LATEST_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW14_CRF_LATEST_VERSION_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A197TBW14_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A197TBW14_CRF_LATEST_VERSION, 4, 0)));
            }
            A890TBW14_SDT_SAVE = httpContext.cgiGet( edtTBW14_SDT_SAVE_Internalname) ;
            n890TBW14_SDT_SAVE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A890TBW14_SDT_SAVE", A890TBW14_SDT_SAVE);
            n890TBW14_SDT_SAVE = ((GXutil.strcmp("", A890TBW14_SDT_SAVE)==0) ? true : false) ;
            /* Read saved values. */
            Z192TBW14_SESSION_ID = httpContext.cgiGet( "Z192TBW14_SESSION_ID") ;
            Z193TBW14_DISP_DATETIME = httpContext.cgiGet( "Z193TBW14_DISP_DATETIME") ;
            Z194TBW14_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z194TBW14_STUDY_ID"), ".", ",") ;
            Z195TBW14_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "Z195TBW14_SUBJECT_ID"), ".", ",")) ;
            Z196TBW14_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z196TBW14_CRF_ID"), ".", ",")) ;
            Z940TBW14_CRF_EDA_NO = (byte)(localUtil.ctol( httpContext.cgiGet( "Z940TBW14_CRF_EDA_NO"), ".", ",")) ;
            Z197TBW14_CRF_LATEST_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( "Z197TBW14_CRF_LATEST_VERSION"), ".", ",")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = context.getSiteKey( ) ;
            standaloneNotModal( ) ;
         }
         else
         {
            standaloneNotModal( ) ;
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
            {
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               A192TBW14_SESSION_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A192TBW14_SESSION_ID", A192TBW14_SESSION_ID);
               A193TBW14_DISP_DATETIME = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A193TBW14_DISP_DATETIME", A193TBW14_DISP_DATETIME);
               A194TBW14_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A194TBW14_STUDY_ID", GXutil.ltrim( GXutil.str( A194TBW14_STUDY_ID, 10, 0)));
               A195TBW14_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A195TBW14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A195TBW14_SUBJECT_ID, 6, 0)));
               A196TBW14_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A196TBW14_CRF_ID", GXutil.ltrim( GXutil.str( A196TBW14_CRF_ID, 4, 0)));
               A940TBW14_CRF_EDA_NO = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A940TBW14_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A940TBW14_CRF_EDA_NO, 2, 0)));
               A197TBW14_CRF_LATEST_VERSION = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A197TBW14_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A197TBW14_CRF_LATEST_VERSION, 4, 0)));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal( ) ;
            }
         }
      }
   }

   public void process( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read Transaction buttons. */
         sEvt = httpContext.cgiGet( "_EventName") ;
         EvtGridId = httpContext.cgiGet( "_EventGridId") ;
         EvtRowId = httpContext.cgiGet( "_EventRowId") ;
         if ( GXutil.len( sEvt) > 0 )
         {
            sEvtType = GXutil.left( sEvt, 1) ;
            sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
            if ( GXutil.strcmp(sEvtType, "E") == 0 )
            {
               sEvtType = GXutil.right( sEvt, 1) ;
               if ( GXutil.strcmp(sEvtType, ".") == 0 )
               {
                  sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                  if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     btn_enter( ) ;
                     /* No code required for Cancel button. It is implemented as the Reset button. */
                  }
                  else if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     btn_first( ) ;
                  }
                  else if ( GXutil.strcmp(sEvt, "PREVIOUS") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     btn_previous( ) ;
                  }
                  else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     btn_next( ) ;
                  }
                  else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     btn_last( ) ;
                  }
                  else if ( GXutil.strcmp(sEvt, "SELECT") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     btn_select( ) ;
                  }
                  else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     btn_delete( ) ;
                  }
                  else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     afterkeyloadscreen( ) ;
                  }
               }
               else
               {
               }
            }
            httpContext.wbHandled = (byte)(1) ;
         }
      }
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1H60( ) ;
            standaloneNotModal( ) ;
            standaloneModal( ) ;
         }
      }
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public void disable_std_buttons( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         imgBtn_delete2_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( imgBtn_delete2_Enabled, 5, 0)));
      }
   }

   public void disable_std_buttons_dsp( )
   {
      imgBtn_delete2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_delete2_Visible, 5, 0)));
      imgBtn_delete2_separator_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_separator_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_delete2_separator_Visible, 5, 0)));
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_delete_Visible, 5, 0)));
      imgBtn_first_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_first_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_first_Visible, 5, 0)));
      imgBtn_first_separator_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_first_separator_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_first_separator_Visible, 5, 0)));
      imgBtn_previous_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_previous_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_previous_Visible, 5, 0)));
      imgBtn_previous_separator_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_previous_separator_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_previous_separator_Visible, 5, 0)));
      imgBtn_next_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_next_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_next_Visible, 5, 0)));
      imgBtn_next_separator_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_next_separator_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_next_separator_Visible, 5, 0)));
      imgBtn_last_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_last_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_last_Visible, 5, 0)));
      imgBtn_last_separator_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_last_separator_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_last_separator_Visible, 5, 0)));
      imgBtn_select_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_select_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_select_Visible, 5, 0)));
      imgBtn_select_separator_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_select_separator_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_select_separator_Visible, 5, 0)));
      imgBtn_delete2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_delete2_Visible, 5, 0)));
      imgBtn_delete2_separator_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_separator_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_delete2_separator_Visible, 5, 0)));
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_delete_Visible, 5, 0)));
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         imgBtn_enter2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgBtn_enter2_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_enter2_Visible, 5, 0)));
         imgBtn_enter2_separator_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgBtn_enter2_separator_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgBtn_enter2_separator_Visible, 5, 0)));
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_enter_Visible, 5, 0)));
      }
      disableAttributes1H60( ) ;
   }

   public void set_caption( )
   {
      if ( ( IsConfirmed == 1 ) && ( AnyError == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "", true);
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "", true);
         }
      }
   }

   public void resetCaption1H0( )
   {
   }

   public void zm1H60( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -1 )
      {
         Z192TBW14_SESSION_ID = A192TBW14_SESSION_ID ;
         Z193TBW14_DISP_DATETIME = A193TBW14_DISP_DATETIME ;
         Z194TBW14_STUDY_ID = A194TBW14_STUDY_ID ;
         Z195TBW14_SUBJECT_ID = A195TBW14_SUBJECT_ID ;
         Z196TBW14_CRF_ID = A196TBW14_CRF_ID ;
         Z940TBW14_CRF_EDA_NO = A940TBW14_CRF_EDA_NO ;
         Z197TBW14_CRF_LATEST_VERSION = A197TBW14_CRF_LATEST_VERSION ;
         Z890TBW14_SDT_SAVE = A890TBW14_SDT_SAVE ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         imgBtn_delete2_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( imgBtn_delete2_Enabled, 5, 0)));
      }
      else
      {
         imgBtn_delete2_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, imgBtn_delete2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( imgBtn_delete2_Enabled, 5, 0)));
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         imgBtn_enter2_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgBtn_enter2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( imgBtn_enter2_Enabled, 5, 0)));
      }
      else
      {
         imgBtn_enter2_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, imgBtn_enter2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( imgBtn_enter2_Enabled, 5, 0)));
      }
   }

   public void load1H60( )
   {
      /* Using cursor T001H4 */
      pr_default.execute(2, new Object[] {A192TBW14_SESSION_ID, A193TBW14_DISP_DATETIME, new Long(A194TBW14_STUDY_ID), new Integer(A195TBW14_SUBJECT_ID), new Short(A196TBW14_CRF_ID), new Byte(A940TBW14_CRF_EDA_NO), new Short(A197TBW14_CRF_LATEST_VERSION)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound60 = (short)(1) ;
         A890TBW14_SDT_SAVE = T001H4_A890TBW14_SDT_SAVE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A890TBW14_SDT_SAVE", A890TBW14_SDT_SAVE);
         n890TBW14_SDT_SAVE = T001H4_n890TBW14_SDT_SAVE[0] ;
         zm1H60( -1) ;
      }
      pr_default.close(2);
      onLoadActions1H60( ) ;
   }

   public void onLoadActions1H60( )
   {
   }

   public void checkExtendedTable1H60( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1H60( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1H60( )
   {
      /* Using cursor T001H5 */
      pr_default.execute(3, new Object[] {A192TBW14_SESSION_ID, A193TBW14_DISP_DATETIME, new Long(A194TBW14_STUDY_ID), new Integer(A195TBW14_SUBJECT_ID), new Short(A196TBW14_CRF_ID), new Byte(A940TBW14_CRF_EDA_NO), new Short(A197TBW14_CRF_LATEST_VERSION)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound60 = (short)(1) ;
      }
      else
      {
         RcdFound60 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001H3 */
      pr_default.execute(1, new Object[] {A192TBW14_SESSION_ID, A193TBW14_DISP_DATETIME, new Long(A194TBW14_STUDY_ID), new Integer(A195TBW14_SUBJECT_ID), new Short(A196TBW14_CRF_ID), new Byte(A940TBW14_CRF_EDA_NO), new Short(A197TBW14_CRF_LATEST_VERSION)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1H60( 1) ;
         RcdFound60 = (short)(1) ;
         A192TBW14_SESSION_ID = T001H3_A192TBW14_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A192TBW14_SESSION_ID", A192TBW14_SESSION_ID);
         A193TBW14_DISP_DATETIME = T001H3_A193TBW14_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A193TBW14_DISP_DATETIME", A193TBW14_DISP_DATETIME);
         A194TBW14_STUDY_ID = T001H3_A194TBW14_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194TBW14_STUDY_ID", GXutil.ltrim( GXutil.str( A194TBW14_STUDY_ID, 10, 0)));
         A195TBW14_SUBJECT_ID = T001H3_A195TBW14_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A195TBW14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A195TBW14_SUBJECT_ID, 6, 0)));
         A196TBW14_CRF_ID = T001H3_A196TBW14_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A196TBW14_CRF_ID", GXutil.ltrim( GXutil.str( A196TBW14_CRF_ID, 4, 0)));
         A940TBW14_CRF_EDA_NO = T001H3_A940TBW14_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A940TBW14_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A940TBW14_CRF_EDA_NO, 2, 0)));
         A197TBW14_CRF_LATEST_VERSION = T001H3_A197TBW14_CRF_LATEST_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A197TBW14_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A197TBW14_CRF_LATEST_VERSION, 4, 0)));
         A890TBW14_SDT_SAVE = T001H3_A890TBW14_SDT_SAVE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A890TBW14_SDT_SAVE", A890TBW14_SDT_SAVE);
         n890TBW14_SDT_SAVE = T001H3_n890TBW14_SDT_SAVE[0] ;
         Z192TBW14_SESSION_ID = A192TBW14_SESSION_ID ;
         Z193TBW14_DISP_DATETIME = A193TBW14_DISP_DATETIME ;
         Z194TBW14_STUDY_ID = A194TBW14_STUDY_ID ;
         Z195TBW14_SUBJECT_ID = A195TBW14_SUBJECT_ID ;
         Z196TBW14_CRF_ID = A196TBW14_CRF_ID ;
         Z940TBW14_CRF_EDA_NO = A940TBW14_CRF_EDA_NO ;
         Z197TBW14_CRF_LATEST_VERSION = A197TBW14_CRF_LATEST_VERSION ;
         sMode60 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1H60( ) ;
         if ( AnyError == 1 )
         {
            RcdFound60 = (short)(0) ;
            initializeNonKey1H60( ) ;
         }
         Gx_mode = sMode60 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound60 = (short)(0) ;
         initializeNonKey1H60( ) ;
         sMode60 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode60 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1H60( ) ;
      if ( RcdFound60 == 0 )
      {
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound60 = (short)(0) ;
      /* Using cursor T001H6 */
      pr_default.execute(4, new Object[] {A192TBW14_SESSION_ID, A192TBW14_SESSION_ID, A193TBW14_DISP_DATETIME, A193TBW14_DISP_DATETIME, A192TBW14_SESSION_ID, new Long(A194TBW14_STUDY_ID), new Long(A194TBW14_STUDY_ID), A193TBW14_DISP_DATETIME, A192TBW14_SESSION_ID, new Integer(A195TBW14_SUBJECT_ID), new Integer(A195TBW14_SUBJECT_ID), new Long(A194TBW14_STUDY_ID), A193TBW14_DISP_DATETIME, A192TBW14_SESSION_ID, new Short(A196TBW14_CRF_ID), new Short(A196TBW14_CRF_ID), new Integer(A195TBW14_SUBJECT_ID), new Long(A194TBW14_STUDY_ID), A193TBW14_DISP_DATETIME, A192TBW14_SESSION_ID, new Byte(A940TBW14_CRF_EDA_NO), new Byte(A940TBW14_CRF_EDA_NO), new Short(A196TBW14_CRF_ID), new Integer(A195TBW14_SUBJECT_ID), new Long(A194TBW14_STUDY_ID), A193TBW14_DISP_DATETIME, A192TBW14_SESSION_ID, new Short(A197TBW14_CRF_LATEST_VERSION)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T001H6_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) < 0 ) || ( GXutil.strcmp(T001H6_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001H6_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) < 0 ) || ( GXutil.strcmp(T001H6_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001H6_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( T001H6_A194TBW14_STUDY_ID[0] < A194TBW14_STUDY_ID ) || ( T001H6_A194TBW14_STUDY_ID[0] == A194TBW14_STUDY_ID ) && ( GXutil.strcmp(T001H6_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001H6_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( T001H6_A195TBW14_SUBJECT_ID[0] < A195TBW14_SUBJECT_ID ) || ( T001H6_A195TBW14_SUBJECT_ID[0] == A195TBW14_SUBJECT_ID ) && ( T001H6_A194TBW14_STUDY_ID[0] == A194TBW14_STUDY_ID ) && ( GXutil.strcmp(T001H6_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001H6_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( T001H6_A196TBW14_CRF_ID[0] < A196TBW14_CRF_ID ) || ( T001H6_A196TBW14_CRF_ID[0] == A196TBW14_CRF_ID ) && ( T001H6_A195TBW14_SUBJECT_ID[0] == A195TBW14_SUBJECT_ID ) && ( T001H6_A194TBW14_STUDY_ID[0] == A194TBW14_STUDY_ID ) && ( GXutil.strcmp(T001H6_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001H6_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( T001H6_A940TBW14_CRF_EDA_NO[0] < A940TBW14_CRF_EDA_NO ) || ( T001H6_A940TBW14_CRF_EDA_NO[0] == A940TBW14_CRF_EDA_NO ) && ( T001H6_A196TBW14_CRF_ID[0] == A196TBW14_CRF_ID ) && ( T001H6_A195TBW14_SUBJECT_ID[0] == A195TBW14_SUBJECT_ID ) && ( T001H6_A194TBW14_STUDY_ID[0] == A194TBW14_STUDY_ID ) && ( GXutil.strcmp(T001H6_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001H6_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( T001H6_A197TBW14_CRF_LATEST_VERSION[0] < A197TBW14_CRF_LATEST_VERSION ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T001H6_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) > 0 ) || ( GXutil.strcmp(T001H6_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001H6_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) > 0 ) || ( GXutil.strcmp(T001H6_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001H6_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( T001H6_A194TBW14_STUDY_ID[0] > A194TBW14_STUDY_ID ) || ( T001H6_A194TBW14_STUDY_ID[0] == A194TBW14_STUDY_ID ) && ( GXutil.strcmp(T001H6_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001H6_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( T001H6_A195TBW14_SUBJECT_ID[0] > A195TBW14_SUBJECT_ID ) || ( T001H6_A195TBW14_SUBJECT_ID[0] == A195TBW14_SUBJECT_ID ) && ( T001H6_A194TBW14_STUDY_ID[0] == A194TBW14_STUDY_ID ) && ( GXutil.strcmp(T001H6_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001H6_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( T001H6_A196TBW14_CRF_ID[0] > A196TBW14_CRF_ID ) || ( T001H6_A196TBW14_CRF_ID[0] == A196TBW14_CRF_ID ) && ( T001H6_A195TBW14_SUBJECT_ID[0] == A195TBW14_SUBJECT_ID ) && ( T001H6_A194TBW14_STUDY_ID[0] == A194TBW14_STUDY_ID ) && ( GXutil.strcmp(T001H6_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001H6_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( T001H6_A940TBW14_CRF_EDA_NO[0] > A940TBW14_CRF_EDA_NO ) || ( T001H6_A940TBW14_CRF_EDA_NO[0] == A940TBW14_CRF_EDA_NO ) && ( T001H6_A196TBW14_CRF_ID[0] == A196TBW14_CRF_ID ) && ( T001H6_A195TBW14_SUBJECT_ID[0] == A195TBW14_SUBJECT_ID ) && ( T001H6_A194TBW14_STUDY_ID[0] == A194TBW14_STUDY_ID ) && ( GXutil.strcmp(T001H6_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001H6_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( T001H6_A197TBW14_CRF_LATEST_VERSION[0] > A197TBW14_CRF_LATEST_VERSION ) ) )
         {
            A192TBW14_SESSION_ID = T001H6_A192TBW14_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A192TBW14_SESSION_ID", A192TBW14_SESSION_ID);
            A193TBW14_DISP_DATETIME = T001H6_A193TBW14_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A193TBW14_DISP_DATETIME", A193TBW14_DISP_DATETIME);
            A194TBW14_STUDY_ID = T001H6_A194TBW14_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A194TBW14_STUDY_ID", GXutil.ltrim( GXutil.str( A194TBW14_STUDY_ID, 10, 0)));
            A195TBW14_SUBJECT_ID = T001H6_A195TBW14_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A195TBW14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A195TBW14_SUBJECT_ID, 6, 0)));
            A196TBW14_CRF_ID = T001H6_A196TBW14_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A196TBW14_CRF_ID", GXutil.ltrim( GXutil.str( A196TBW14_CRF_ID, 4, 0)));
            A940TBW14_CRF_EDA_NO = T001H6_A940TBW14_CRF_EDA_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A940TBW14_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A940TBW14_CRF_EDA_NO, 2, 0)));
            A197TBW14_CRF_LATEST_VERSION = T001H6_A197TBW14_CRF_LATEST_VERSION[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A197TBW14_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A197TBW14_CRF_LATEST_VERSION, 4, 0)));
            RcdFound60 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound60 = (short)(0) ;
      /* Using cursor T001H7 */
      pr_default.execute(5, new Object[] {A192TBW14_SESSION_ID, A192TBW14_SESSION_ID, A193TBW14_DISP_DATETIME, A193TBW14_DISP_DATETIME, A192TBW14_SESSION_ID, new Long(A194TBW14_STUDY_ID), new Long(A194TBW14_STUDY_ID), A193TBW14_DISP_DATETIME, A192TBW14_SESSION_ID, new Integer(A195TBW14_SUBJECT_ID), new Integer(A195TBW14_SUBJECT_ID), new Long(A194TBW14_STUDY_ID), A193TBW14_DISP_DATETIME, A192TBW14_SESSION_ID, new Short(A196TBW14_CRF_ID), new Short(A196TBW14_CRF_ID), new Integer(A195TBW14_SUBJECT_ID), new Long(A194TBW14_STUDY_ID), A193TBW14_DISP_DATETIME, A192TBW14_SESSION_ID, new Byte(A940TBW14_CRF_EDA_NO), new Byte(A940TBW14_CRF_EDA_NO), new Short(A196TBW14_CRF_ID), new Integer(A195TBW14_SUBJECT_ID), new Long(A194TBW14_STUDY_ID), A193TBW14_DISP_DATETIME, A192TBW14_SESSION_ID, new Short(A197TBW14_CRF_LATEST_VERSION)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T001H7_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) > 0 ) || ( GXutil.strcmp(T001H7_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001H7_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) > 0 ) || ( GXutil.strcmp(T001H7_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001H7_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( T001H7_A194TBW14_STUDY_ID[0] > A194TBW14_STUDY_ID ) || ( T001H7_A194TBW14_STUDY_ID[0] == A194TBW14_STUDY_ID ) && ( GXutil.strcmp(T001H7_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001H7_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( T001H7_A195TBW14_SUBJECT_ID[0] > A195TBW14_SUBJECT_ID ) || ( T001H7_A195TBW14_SUBJECT_ID[0] == A195TBW14_SUBJECT_ID ) && ( T001H7_A194TBW14_STUDY_ID[0] == A194TBW14_STUDY_ID ) && ( GXutil.strcmp(T001H7_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001H7_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( T001H7_A196TBW14_CRF_ID[0] > A196TBW14_CRF_ID ) || ( T001H7_A196TBW14_CRF_ID[0] == A196TBW14_CRF_ID ) && ( T001H7_A195TBW14_SUBJECT_ID[0] == A195TBW14_SUBJECT_ID ) && ( T001H7_A194TBW14_STUDY_ID[0] == A194TBW14_STUDY_ID ) && ( GXutil.strcmp(T001H7_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001H7_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( T001H7_A940TBW14_CRF_EDA_NO[0] > A940TBW14_CRF_EDA_NO ) || ( T001H7_A940TBW14_CRF_EDA_NO[0] == A940TBW14_CRF_EDA_NO ) && ( T001H7_A196TBW14_CRF_ID[0] == A196TBW14_CRF_ID ) && ( T001H7_A195TBW14_SUBJECT_ID[0] == A195TBW14_SUBJECT_ID ) && ( T001H7_A194TBW14_STUDY_ID[0] == A194TBW14_STUDY_ID ) && ( GXutil.strcmp(T001H7_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001H7_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( T001H7_A197TBW14_CRF_LATEST_VERSION[0] > A197TBW14_CRF_LATEST_VERSION ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T001H7_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) < 0 ) || ( GXutil.strcmp(T001H7_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001H7_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) < 0 ) || ( GXutil.strcmp(T001H7_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001H7_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( T001H7_A194TBW14_STUDY_ID[0] < A194TBW14_STUDY_ID ) || ( T001H7_A194TBW14_STUDY_ID[0] == A194TBW14_STUDY_ID ) && ( GXutil.strcmp(T001H7_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001H7_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( T001H7_A195TBW14_SUBJECT_ID[0] < A195TBW14_SUBJECT_ID ) || ( T001H7_A195TBW14_SUBJECT_ID[0] == A195TBW14_SUBJECT_ID ) && ( T001H7_A194TBW14_STUDY_ID[0] == A194TBW14_STUDY_ID ) && ( GXutil.strcmp(T001H7_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001H7_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( T001H7_A196TBW14_CRF_ID[0] < A196TBW14_CRF_ID ) || ( T001H7_A196TBW14_CRF_ID[0] == A196TBW14_CRF_ID ) && ( T001H7_A195TBW14_SUBJECT_ID[0] == A195TBW14_SUBJECT_ID ) && ( T001H7_A194TBW14_STUDY_ID[0] == A194TBW14_STUDY_ID ) && ( GXutil.strcmp(T001H7_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001H7_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( T001H7_A940TBW14_CRF_EDA_NO[0] < A940TBW14_CRF_EDA_NO ) || ( T001H7_A940TBW14_CRF_EDA_NO[0] == A940TBW14_CRF_EDA_NO ) && ( T001H7_A196TBW14_CRF_ID[0] == A196TBW14_CRF_ID ) && ( T001H7_A195TBW14_SUBJECT_ID[0] == A195TBW14_SUBJECT_ID ) && ( T001H7_A194TBW14_STUDY_ID[0] == A194TBW14_STUDY_ID ) && ( GXutil.strcmp(T001H7_A193TBW14_DISP_DATETIME[0], A193TBW14_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001H7_A192TBW14_SESSION_ID[0], A192TBW14_SESSION_ID) == 0 ) && ( T001H7_A197TBW14_CRF_LATEST_VERSION[0] < A197TBW14_CRF_LATEST_VERSION ) ) )
         {
            A192TBW14_SESSION_ID = T001H7_A192TBW14_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A192TBW14_SESSION_ID", A192TBW14_SESSION_ID);
            A193TBW14_DISP_DATETIME = T001H7_A193TBW14_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A193TBW14_DISP_DATETIME", A193TBW14_DISP_DATETIME);
            A194TBW14_STUDY_ID = T001H7_A194TBW14_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A194TBW14_STUDY_ID", GXutil.ltrim( GXutil.str( A194TBW14_STUDY_ID, 10, 0)));
            A195TBW14_SUBJECT_ID = T001H7_A195TBW14_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A195TBW14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A195TBW14_SUBJECT_ID, 6, 0)));
            A196TBW14_CRF_ID = T001H7_A196TBW14_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A196TBW14_CRF_ID", GXutil.ltrim( GXutil.str( A196TBW14_CRF_ID, 4, 0)));
            A940TBW14_CRF_EDA_NO = T001H7_A940TBW14_CRF_EDA_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A940TBW14_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A940TBW14_CRF_EDA_NO, 2, 0)));
            A197TBW14_CRF_LATEST_VERSION = T001H7_A197TBW14_CRF_LATEST_VERSION[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A197TBW14_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A197TBW14_CRF_LATEST_VERSION, 4, 0)));
            RcdFound60 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1H60( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBW14_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1H60( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound60 == 1 )
         {
            if ( ( GXutil.strcmp(A192TBW14_SESSION_ID, Z192TBW14_SESSION_ID) != 0 ) || ( GXutil.strcmp(A193TBW14_DISP_DATETIME, Z193TBW14_DISP_DATETIME) != 0 ) || ( A194TBW14_STUDY_ID != Z194TBW14_STUDY_ID ) || ( A195TBW14_SUBJECT_ID != Z195TBW14_SUBJECT_ID ) || ( A196TBW14_CRF_ID != Z196TBW14_CRF_ID ) || ( A940TBW14_CRF_EDA_NO != Z940TBW14_CRF_EDA_NO ) || ( A197TBW14_CRF_LATEST_VERSION != Z197TBW14_CRF_LATEST_VERSION ) )
            {
               A192TBW14_SESSION_ID = Z192TBW14_SESSION_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A192TBW14_SESSION_ID", A192TBW14_SESSION_ID);
               A193TBW14_DISP_DATETIME = Z193TBW14_DISP_DATETIME ;
               httpContext.ajax_rsp_assign_attri("", false, "A193TBW14_DISP_DATETIME", A193TBW14_DISP_DATETIME);
               A194TBW14_STUDY_ID = Z194TBW14_STUDY_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A194TBW14_STUDY_ID", GXutil.ltrim( GXutil.str( A194TBW14_STUDY_ID, 10, 0)));
               A195TBW14_SUBJECT_ID = Z195TBW14_SUBJECT_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A195TBW14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A195TBW14_SUBJECT_ID, 6, 0)));
               A196TBW14_CRF_ID = Z196TBW14_CRF_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A196TBW14_CRF_ID", GXutil.ltrim( GXutil.str( A196TBW14_CRF_ID, 4, 0)));
               A940TBW14_CRF_EDA_NO = Z940TBW14_CRF_EDA_NO ;
               httpContext.ajax_rsp_assign_attri("", false, "A940TBW14_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A940TBW14_CRF_EDA_NO, 2, 0)));
               A197TBW14_CRF_LATEST_VERSION = Z197TBW14_CRF_LATEST_VERSION ;
               httpContext.ajax_rsp_assign_attri("", false, "A197TBW14_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A197TBW14_CRF_LATEST_VERSION, 4, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBW14_SESSION_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW14_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBW14_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1H60( ) ;
               GX_FocusControl = edtTBW14_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A192TBW14_SESSION_ID, Z192TBW14_SESSION_ID) != 0 ) || ( GXutil.strcmp(A193TBW14_DISP_DATETIME, Z193TBW14_DISP_DATETIME) != 0 ) || ( A194TBW14_STUDY_ID != Z194TBW14_STUDY_ID ) || ( A195TBW14_SUBJECT_ID != Z195TBW14_SUBJECT_ID ) || ( A196TBW14_CRF_ID != Z196TBW14_CRF_ID ) || ( A940TBW14_CRF_EDA_NO != Z940TBW14_CRF_EDA_NO ) || ( A197TBW14_CRF_LATEST_VERSION != Z197TBW14_CRF_LATEST_VERSION ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBW14_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1H60( ) ;
               if ( AnyError == 1 )
               {
                  GX_FocusControl = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBW14_SESSION_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBW14_SESSION_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBW14_SESSION_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1H60( ) ;
                  if ( AnyError == 1 )
                  {
                     GX_FocusControl = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A192TBW14_SESSION_ID, Z192TBW14_SESSION_ID) != 0 ) || ( GXutil.strcmp(A193TBW14_DISP_DATETIME, Z193TBW14_DISP_DATETIME) != 0 ) || ( A194TBW14_STUDY_ID != Z194TBW14_STUDY_ID ) || ( A195TBW14_SUBJECT_ID != Z195TBW14_SUBJECT_ID ) || ( A196TBW14_CRF_ID != Z196TBW14_CRF_ID ) || ( A940TBW14_CRF_EDA_NO != Z940TBW14_CRF_EDA_NO ) || ( A197TBW14_CRF_LATEST_VERSION != Z197TBW14_CRF_LATEST_VERSION ) )
      {
         A192TBW14_SESSION_ID = Z192TBW14_SESSION_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A192TBW14_SESSION_ID", A192TBW14_SESSION_ID);
         A193TBW14_DISP_DATETIME = Z193TBW14_DISP_DATETIME ;
         httpContext.ajax_rsp_assign_attri("", false, "A193TBW14_DISP_DATETIME", A193TBW14_DISP_DATETIME);
         A194TBW14_STUDY_ID = Z194TBW14_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A194TBW14_STUDY_ID", GXutil.ltrim( GXutil.str( A194TBW14_STUDY_ID, 10, 0)));
         A195TBW14_SUBJECT_ID = Z195TBW14_SUBJECT_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A195TBW14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A195TBW14_SUBJECT_ID, 6, 0)));
         A196TBW14_CRF_ID = Z196TBW14_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A196TBW14_CRF_ID", GXutil.ltrim( GXutil.str( A196TBW14_CRF_ID, 4, 0)));
         A940TBW14_CRF_EDA_NO = Z940TBW14_CRF_EDA_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A940TBW14_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A940TBW14_CRF_EDA_NO, 2, 0)));
         A197TBW14_CRF_LATEST_VERSION = Z197TBW14_CRF_LATEST_VERSION ;
         httpContext.ajax_rsp_assign_attri("", false, "A197TBW14_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A197TBW14_CRF_LATEST_VERSION, 4, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBW14_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW14_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBW14_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         getByPrimaryKey( ) ;
      }
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getEqualNoModal( ) ;
      if ( RcdFound60 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBW14_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW14_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBW14_SDT_SAVE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1H60( ) ;
      if ( RcdFound60 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW14_SDT_SAVE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1H60( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      move_previous( ) ;
      if ( RcdFound60 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW14_SDT_SAVE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      move_next( ) ;
      if ( RcdFound60 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW14_SDT_SAVE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1H60( ) ;
      if ( RcdFound60 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound60 != 0 )
         {
            scanNext1H60( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW14_SDT_SAVE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1H60( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1H60( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T001H2 */
         pr_default.execute(0, new Object[] {A192TBW14_SESSION_ID, A193TBW14_DISP_DATETIME, new Long(A194TBW14_STUDY_ID), new Integer(A195TBW14_SUBJECT_ID), new Short(A196TBW14_CRF_ID), new Byte(A940TBW14_CRF_EDA_NO), new Short(A197TBW14_CRF_LATEST_VERSION)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW14_CRF_SDT_WORK"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBW14_CRF_SDT_WORK"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1H60( )
   {
      beforeValidate1H60( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1H60( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1H60( 0) ;
         checkOptimisticConcurrency1H60( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1H60( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1H60( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001H8 */
                  pr_default.execute(6, new Object[] {A192TBW14_SESSION_ID, A193TBW14_DISP_DATETIME, new Long(A194TBW14_STUDY_ID), new Integer(A195TBW14_SUBJECT_ID), new Short(A196TBW14_CRF_ID), new Byte(A940TBW14_CRF_EDA_NO), new Short(A197TBW14_CRF_LATEST_VERSION), new Boolean(n890TBW14_SDT_SAVE), A890TBW14_SDT_SAVE});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW14_CRF_SDT_WORK") ;
                  if ( (pr_default.getStatus(6) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "", true);
                        resetCaption1H0( ) ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load1H60( ) ;
         }
         endLevel1H60( ) ;
      }
      closeExtendedTableCursors1H60( ) ;
   }

   public void update1H60( )
   {
      beforeValidate1H60( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1H60( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1H60( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1H60( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1H60( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001H9 */
                  pr_default.execute(7, new Object[] {new Boolean(n890TBW14_SDT_SAVE), A890TBW14_SDT_SAVE, A192TBW14_SESSION_ID, A193TBW14_DISP_DATETIME, new Long(A194TBW14_STUDY_ID), new Integer(A195TBW14_SUBJECT_ID), new Short(A196TBW14_CRF_ID), new Byte(A940TBW14_CRF_EDA_NO), new Short(A197TBW14_CRF_LATEST_VERSION)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW14_CRF_SDT_WORK") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW14_CRF_SDT_WORK"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1H60( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption1H0( ) ;
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel1H60( ) ;
      }
      closeExtendedTableCursors1H60( ) ;
   }

   public void deferredUpdate1H60( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1H60( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1H60( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1H60( ) ;
         afterConfirm1H60( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1H60( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001H10 */
               pr_default.execute(8, new Object[] {A192TBW14_SESSION_ID, A193TBW14_DISP_DATETIME, new Long(A194TBW14_STUDY_ID), new Integer(A195TBW14_SUBJECT_ID), new Short(A196TBW14_CRF_ID), new Byte(A940TBW14_CRF_EDA_NO), new Short(A197TBW14_CRF_LATEST_VERSION)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW14_CRF_SDT_WORK") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound60 == 0 )
                     {
                        initAll1H60( ) ;
                        Gx_mode = "INS" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     else
                     {
                        getByPrimaryKey( ) ;
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), 0, "", true);
                     resetCaption1H0( ) ;
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode60 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1H60( ) ;
      Gx_mode = sMode60 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1H60( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1H60( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1H60( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbw14_crf_sdt_work");
         if ( AnyError == 0 )
         {
            confirmValues1H0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbw14_crf_sdt_work");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1H60( )
   {
      /* Using cursor T001H11 */
      pr_default.execute(9);
      RcdFound60 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound60 = (short)(1) ;
         A192TBW14_SESSION_ID = T001H11_A192TBW14_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A192TBW14_SESSION_ID", A192TBW14_SESSION_ID);
         A193TBW14_DISP_DATETIME = T001H11_A193TBW14_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A193TBW14_DISP_DATETIME", A193TBW14_DISP_DATETIME);
         A194TBW14_STUDY_ID = T001H11_A194TBW14_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194TBW14_STUDY_ID", GXutil.ltrim( GXutil.str( A194TBW14_STUDY_ID, 10, 0)));
         A195TBW14_SUBJECT_ID = T001H11_A195TBW14_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A195TBW14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A195TBW14_SUBJECT_ID, 6, 0)));
         A196TBW14_CRF_ID = T001H11_A196TBW14_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A196TBW14_CRF_ID", GXutil.ltrim( GXutil.str( A196TBW14_CRF_ID, 4, 0)));
         A940TBW14_CRF_EDA_NO = T001H11_A940TBW14_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A940TBW14_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A940TBW14_CRF_EDA_NO, 2, 0)));
         A197TBW14_CRF_LATEST_VERSION = T001H11_A197TBW14_CRF_LATEST_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A197TBW14_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A197TBW14_CRF_LATEST_VERSION, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1H60( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound60 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound60 = (short)(1) ;
         A192TBW14_SESSION_ID = T001H11_A192TBW14_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A192TBW14_SESSION_ID", A192TBW14_SESSION_ID);
         A193TBW14_DISP_DATETIME = T001H11_A193TBW14_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A193TBW14_DISP_DATETIME", A193TBW14_DISP_DATETIME);
         A194TBW14_STUDY_ID = T001H11_A194TBW14_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194TBW14_STUDY_ID", GXutil.ltrim( GXutil.str( A194TBW14_STUDY_ID, 10, 0)));
         A195TBW14_SUBJECT_ID = T001H11_A195TBW14_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A195TBW14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A195TBW14_SUBJECT_ID, 6, 0)));
         A196TBW14_CRF_ID = T001H11_A196TBW14_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A196TBW14_CRF_ID", GXutil.ltrim( GXutil.str( A196TBW14_CRF_ID, 4, 0)));
         A940TBW14_CRF_EDA_NO = T001H11_A940TBW14_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A940TBW14_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A940TBW14_CRF_EDA_NO, 2, 0)));
         A197TBW14_CRF_LATEST_VERSION = T001H11_A197TBW14_CRF_LATEST_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A197TBW14_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A197TBW14_CRF_LATEST_VERSION, 4, 0)));
      }
   }

   public void scanEnd1H60( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1H60( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1H60( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1H60( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1H60( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1H60( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1H60( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1H60( )
   {
      edtTBW14_SESSION_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW14_SESSION_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW14_SESSION_ID_Enabled, 5, 0)));
      edtTBW14_DISP_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW14_DISP_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW14_DISP_DATETIME_Enabled, 5, 0)));
      edtTBW14_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW14_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW14_STUDY_ID_Enabled, 5, 0)));
      edtTBW14_SUBJECT_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW14_SUBJECT_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW14_SUBJECT_ID_Enabled, 5, 0)));
      edtTBW14_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW14_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW14_CRF_ID_Enabled, 5, 0)));
      edtTBW14_CRF_EDA_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW14_CRF_EDA_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW14_CRF_EDA_NO_Enabled, 5, 0)));
      edtTBW14_CRF_LATEST_VERSION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW14_CRF_LATEST_VERSION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW14_CRF_LATEST_VERSION_Enabled, 5, 0)));
      edtTBW14_SDT_SAVE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW14_SDT_SAVE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW14_SDT_SAVE_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1H0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "CRF入力SDTワーク") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20207151322928");
      httpContext.closeHtmlHeader();
      FormProcess = " onkeyup=\"gx.evt.onkeyup(event)\" onkeypress=\"gx.evt.onkeypress(event,true,false)\" onkeydown=\"gx.evt.onkeypress(null,true,false)\"" ;
      httpContext.writeText( "<body") ;
      bodyStyle = "" ;
      bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
      httpContext.writeText( " "+"class=\"Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbw14_crf_sdt_work") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1H60( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z192TBW14_SESSION_ID", GXutil.rtrim( Z192TBW14_SESSION_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z193TBW14_DISP_DATETIME", GXutil.rtrim( Z193TBW14_DISP_DATETIME));
      GxWebStd.gx_hidden_field( httpContext, "Z194TBW14_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z194TBW14_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z195TBW14_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( Z195TBW14_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z196TBW14_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z196TBW14_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z940TBW14_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( Z940TBW14_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z197TBW14_CRF_LATEST_VERSION", GXutil.ltrim( localUtil.ntoc( Z197TBW14_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", "notset");
      httpContext.SendAjaxEncryptionKey();
      httpContext.SendComponentObjects();
      httpContext.SendServerCommands();
      httpContext.SendState();
      httpContext.writeTextNL( "</form>") ;
      include_jscripts( ) ;
      httpContext.writeTextNL( "</body>") ;
      httpContext.writeTextNL( "</html>") ;
   }

   public String getPgmname( )
   {
      return "TBW14_CRF_SDT_WORK" ;
   }

   public String getPgmdesc( )
   {
      return "CRF入力SDTワーク" ;
   }

   public void initializeNonKey1H60( )
   {
      A890TBW14_SDT_SAVE = "" ;
      n890TBW14_SDT_SAVE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A890TBW14_SDT_SAVE", A890TBW14_SDT_SAVE);
      n890TBW14_SDT_SAVE = ((GXutil.strcmp("", A890TBW14_SDT_SAVE)==0) ? true : false) ;
   }

   public void initAll1H60( )
   {
      A192TBW14_SESSION_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A192TBW14_SESSION_ID", A192TBW14_SESSION_ID);
      A193TBW14_DISP_DATETIME = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A193TBW14_DISP_DATETIME", A193TBW14_DISP_DATETIME);
      A194TBW14_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A194TBW14_STUDY_ID", GXutil.ltrim( GXutil.str( A194TBW14_STUDY_ID, 10, 0)));
      A195TBW14_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A195TBW14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A195TBW14_SUBJECT_ID, 6, 0)));
      A196TBW14_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A196TBW14_CRF_ID", GXutil.ltrim( GXutil.str( A196TBW14_CRF_ID, 4, 0)));
      A940TBW14_CRF_EDA_NO = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A940TBW14_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A940TBW14_CRF_EDA_NO, 2, 0)));
      A197TBW14_CRF_LATEST_VERSION = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A197TBW14_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A197TBW14_CRF_LATEST_VERSION, 4, 0)));
      initializeNonKey1H60( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1316731");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20207151322932");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbw14_crf_sdt_work.js", "?20207151322932");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      imgBtn_first_Internalname = "BTN_FIRST" ;
      imgBtn_first_separator_Internalname = "BTN_FIRST_SEPARATOR" ;
      imgBtn_previous_Internalname = "BTN_PREVIOUS" ;
      imgBtn_previous_separator_Internalname = "BTN_PREVIOUS_SEPARATOR" ;
      imgBtn_next_Internalname = "BTN_NEXT" ;
      imgBtn_next_separator_Internalname = "BTN_NEXT_SEPARATOR" ;
      imgBtn_last_Internalname = "BTN_LAST" ;
      imgBtn_last_separator_Internalname = "BTN_LAST_SEPARATOR" ;
      imgBtn_select_Internalname = "BTN_SELECT" ;
      imgBtn_select_separator_Internalname = "BTN_SELECT_SEPARATOR" ;
      imgBtn_enter2_Internalname = "BTN_ENTER2" ;
      imgBtn_enter2_separator_Internalname = "BTN_ENTER2_SEPARATOR" ;
      imgBtn_cancel2_Internalname = "BTN_CANCEL2" ;
      imgBtn_cancel2_separator_Internalname = "BTN_CANCEL2_SEPARATOR" ;
      imgBtn_delete2_Internalname = "BTN_DELETE2" ;
      imgBtn_delete2_separator_Internalname = "BTN_DELETE2_SEPARATOR" ;
      divSectiontoolbar_Internalname = "SECTIONTOOLBAR" ;
      tblTabletoolbar_Internalname = "TABLETOOLBAR" ;
      lblTextblocktbw14_session_id_Internalname = "TEXTBLOCKTBW14_SESSION_ID" ;
      edtTBW14_SESSION_ID_Internalname = "TBW14_SESSION_ID" ;
      lblTextblocktbw14_disp_datetime_Internalname = "TEXTBLOCKTBW14_DISP_DATETIME" ;
      edtTBW14_DISP_DATETIME_Internalname = "TBW14_DISP_DATETIME" ;
      lblTextblocktbw14_study_id_Internalname = "TEXTBLOCKTBW14_STUDY_ID" ;
      edtTBW14_STUDY_ID_Internalname = "TBW14_STUDY_ID" ;
      lblTextblocktbw14_subject_id_Internalname = "TEXTBLOCKTBW14_SUBJECT_ID" ;
      edtTBW14_SUBJECT_ID_Internalname = "TBW14_SUBJECT_ID" ;
      lblTextblocktbw14_crf_id_Internalname = "TEXTBLOCKTBW14_CRF_ID" ;
      edtTBW14_CRF_ID_Internalname = "TBW14_CRF_ID" ;
      lblTextblocktbw14_crf_eda_no_Internalname = "TEXTBLOCKTBW14_CRF_EDA_NO" ;
      edtTBW14_CRF_EDA_NO_Internalname = "TBW14_CRF_EDA_NO" ;
      lblTextblocktbw14_crf_latest_version_Internalname = "TEXTBLOCKTBW14_CRF_LATEST_VERSION" ;
      edtTBW14_CRF_LATEST_VERSION_Internalname = "TBW14_CRF_LATEST_VERSION" ;
      lblTextblocktbw14_sdt_save_Internalname = "TEXTBLOCKTBW14_SDT_SAVE" ;
      edtTBW14_SDT_SAVE_Internalname = "TBW14_SDT_SAVE" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      tblTable1_Internalname = "TABLE1" ;
      grpGroupdata_Internalname = "GROUPDATA" ;
      tblTablemain_Internalname = "TABLEMAIN" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      imgBtn_delete2_separator_Visible = 1 ;
      imgBtn_delete2_Enabled = 1 ;
      imgBtn_delete2_Visible = 1 ;
      imgBtn_cancel2_separator_Visible = 1 ;
      imgBtn_cancel2_Visible = 1 ;
      imgBtn_enter2_separator_Visible = 1 ;
      imgBtn_enter2_Enabled = 1 ;
      imgBtn_enter2_Visible = 1 ;
      imgBtn_select_separator_Visible = 1 ;
      imgBtn_select_Visible = 1 ;
      imgBtn_last_separator_Visible = 1 ;
      imgBtn_last_Visible = 1 ;
      imgBtn_next_separator_Visible = 1 ;
      imgBtn_next_Visible = 1 ;
      imgBtn_previous_separator_Visible = 1 ;
      imgBtn_previous_Visible = 1 ;
      imgBtn_first_separator_Visible = 1 ;
      imgBtn_first_Visible = 1 ;
      edtTBW14_SDT_SAVE_Enabled = 1 ;
      edtTBW14_CRF_LATEST_VERSION_Jsonclick = "" ;
      edtTBW14_CRF_LATEST_VERSION_Enabled = 1 ;
      edtTBW14_CRF_EDA_NO_Jsonclick = "" ;
      edtTBW14_CRF_EDA_NO_Enabled = 1 ;
      edtTBW14_CRF_ID_Jsonclick = "" ;
      edtTBW14_CRF_ID_Enabled = 1 ;
      edtTBW14_SUBJECT_ID_Jsonclick = "" ;
      edtTBW14_SUBJECT_ID_Enabled = 1 ;
      edtTBW14_STUDY_ID_Jsonclick = "" ;
      edtTBW14_STUDY_ID_Enabled = 1 ;
      edtTBW14_DISP_DATETIME_Jsonclick = "" ;
      edtTBW14_DISP_DATETIME_Enabled = 1 ;
      edtTBW14_SESSION_ID_Jsonclick = "" ;
      edtTBW14_SESSION_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getEqualNoModal( ) ;
      GX_FocusControl = edtTBW14_SDT_SAVE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbw14_crf_latest_version( String GX_Parm1 ,
                                               String GX_Parm2 ,
                                               long GX_Parm3 ,
                                               int GX_Parm4 ,
                                               short GX_Parm5 ,
                                               byte GX_Parm6 ,
                                               short GX_Parm7 ,
                                               String GX_Parm8 )
   {
      A192TBW14_SESSION_ID = GX_Parm1 ;
      A193TBW14_DISP_DATETIME = GX_Parm2 ;
      A194TBW14_STUDY_ID = GX_Parm3 ;
      A195TBW14_SUBJECT_ID = GX_Parm4 ;
      A196TBW14_CRF_ID = GX_Parm5 ;
      A940TBW14_CRF_EDA_NO = GX_Parm6 ;
      A197TBW14_CRF_LATEST_VERSION = GX_Parm7 ;
      A890TBW14_SDT_SAVE = GX_Parm8 ;
      n890TBW14_SDT_SAVE = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(A890TBW14_SDT_SAVE);
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z192TBW14_SESSION_ID));
      isValidOutput.add(GXutil.rtrim( Z193TBW14_DISP_DATETIME));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z194TBW14_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z195TBW14_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z196TBW14_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z940TBW14_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z197TBW14_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(Z890TBW14_SDT_SAVE);
      isValidOutput.add(imgBtn_delete2_Enabled);
      isValidOutput.add(imgBtn_enter2_Enabled);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   protected boolean isSpaSupported( )
   {
      return false ;
   }

   public void initializeDynEvents( )
   {
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z192TBW14_SESSION_ID = "" ;
      Z193TBW14_DISP_DATETIME = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      sStyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      lblTextblocktbw14_session_id_Jsonclick = "" ;
      A192TBW14_SESSION_ID = "" ;
      lblTextblocktbw14_disp_datetime_Jsonclick = "" ;
      A193TBW14_DISP_DATETIME = "" ;
      lblTextblocktbw14_study_id_Jsonclick = "" ;
      lblTextblocktbw14_subject_id_Jsonclick = "" ;
      lblTextblocktbw14_crf_id_Jsonclick = "" ;
      lblTextblocktbw14_crf_eda_no_Jsonclick = "" ;
      lblTextblocktbw14_crf_latest_version_Jsonclick = "" ;
      lblTextblocktbw14_sdt_save_Jsonclick = "" ;
      A890TBW14_SDT_SAVE = "" ;
      imgBtn_first_Jsonclick = "" ;
      imgBtn_first_separator_Jsonclick = "" ;
      imgBtn_previous_Jsonclick = "" ;
      imgBtn_previous_separator_Jsonclick = "" ;
      imgBtn_next_Jsonclick = "" ;
      imgBtn_next_separator_Jsonclick = "" ;
      imgBtn_last_Jsonclick = "" ;
      imgBtn_last_separator_Jsonclick = "" ;
      imgBtn_select_Jsonclick = "" ;
      imgBtn_select_separator_Jsonclick = "" ;
      imgBtn_enter2_Jsonclick = "" ;
      imgBtn_enter2_separator_Jsonclick = "" ;
      imgBtn_cancel2_Jsonclick = "" ;
      imgBtn_cancel2_separator_Jsonclick = "" ;
      imgBtn_delete2_Jsonclick = "" ;
      imgBtn_delete2_separator_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      Z890TBW14_SDT_SAVE = "" ;
      T001H4_A192TBW14_SESSION_ID = new String[] {""} ;
      T001H4_A193TBW14_DISP_DATETIME = new String[] {""} ;
      T001H4_A194TBW14_STUDY_ID = new long[1] ;
      T001H4_A195TBW14_SUBJECT_ID = new int[1] ;
      T001H4_A196TBW14_CRF_ID = new short[1] ;
      T001H4_A940TBW14_CRF_EDA_NO = new byte[1] ;
      T001H4_A197TBW14_CRF_LATEST_VERSION = new short[1] ;
      T001H4_A890TBW14_SDT_SAVE = new String[] {""} ;
      T001H4_n890TBW14_SDT_SAVE = new boolean[] {false} ;
      T001H5_A192TBW14_SESSION_ID = new String[] {""} ;
      T001H5_A193TBW14_DISP_DATETIME = new String[] {""} ;
      T001H5_A194TBW14_STUDY_ID = new long[1] ;
      T001H5_A195TBW14_SUBJECT_ID = new int[1] ;
      T001H5_A196TBW14_CRF_ID = new short[1] ;
      T001H5_A940TBW14_CRF_EDA_NO = new byte[1] ;
      T001H5_A197TBW14_CRF_LATEST_VERSION = new short[1] ;
      T001H3_A192TBW14_SESSION_ID = new String[] {""} ;
      T001H3_A193TBW14_DISP_DATETIME = new String[] {""} ;
      T001H3_A194TBW14_STUDY_ID = new long[1] ;
      T001H3_A195TBW14_SUBJECT_ID = new int[1] ;
      T001H3_A196TBW14_CRF_ID = new short[1] ;
      T001H3_A940TBW14_CRF_EDA_NO = new byte[1] ;
      T001H3_A197TBW14_CRF_LATEST_VERSION = new short[1] ;
      T001H3_A890TBW14_SDT_SAVE = new String[] {""} ;
      T001H3_n890TBW14_SDT_SAVE = new boolean[] {false} ;
      sMode60 = "" ;
      T001H6_A192TBW14_SESSION_ID = new String[] {""} ;
      T001H6_A193TBW14_DISP_DATETIME = new String[] {""} ;
      T001H6_A194TBW14_STUDY_ID = new long[1] ;
      T001H6_A195TBW14_SUBJECT_ID = new int[1] ;
      T001H6_A196TBW14_CRF_ID = new short[1] ;
      T001H6_A940TBW14_CRF_EDA_NO = new byte[1] ;
      T001H6_A197TBW14_CRF_LATEST_VERSION = new short[1] ;
      T001H7_A192TBW14_SESSION_ID = new String[] {""} ;
      T001H7_A193TBW14_DISP_DATETIME = new String[] {""} ;
      T001H7_A194TBW14_STUDY_ID = new long[1] ;
      T001H7_A195TBW14_SUBJECT_ID = new int[1] ;
      T001H7_A196TBW14_CRF_ID = new short[1] ;
      T001H7_A940TBW14_CRF_EDA_NO = new byte[1] ;
      T001H7_A197TBW14_CRF_LATEST_VERSION = new short[1] ;
      T001H2_A192TBW14_SESSION_ID = new String[] {""} ;
      T001H2_A193TBW14_DISP_DATETIME = new String[] {""} ;
      T001H2_A194TBW14_STUDY_ID = new long[1] ;
      T001H2_A195TBW14_SUBJECT_ID = new int[1] ;
      T001H2_A196TBW14_CRF_ID = new short[1] ;
      T001H2_A940TBW14_CRF_EDA_NO = new byte[1] ;
      T001H2_A197TBW14_CRF_LATEST_VERSION = new short[1] ;
      T001H2_A890TBW14_SDT_SAVE = new String[] {""} ;
      T001H2_n890TBW14_SDT_SAVE = new boolean[] {false} ;
      T001H11_A192TBW14_SESSION_ID = new String[] {""} ;
      T001H11_A193TBW14_DISP_DATETIME = new String[] {""} ;
      T001H11_A194TBW14_STUDY_ID = new long[1] ;
      T001H11_A195TBW14_SUBJECT_ID = new int[1] ;
      T001H11_A196TBW14_CRF_ID = new short[1] ;
      T001H11_A940TBW14_CRF_EDA_NO = new byte[1] ;
      T001H11_A197TBW14_CRF_LATEST_VERSION = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw14_crf_sdt_work__default(),
         new Object[] {
             new Object[] {
            T001H2_A192TBW14_SESSION_ID, T001H2_A193TBW14_DISP_DATETIME, T001H2_A194TBW14_STUDY_ID, T001H2_A195TBW14_SUBJECT_ID, T001H2_A196TBW14_CRF_ID, T001H2_A940TBW14_CRF_EDA_NO, T001H2_A197TBW14_CRF_LATEST_VERSION, T001H2_A890TBW14_SDT_SAVE, T001H2_n890TBW14_SDT_SAVE
            }
            , new Object[] {
            T001H3_A192TBW14_SESSION_ID, T001H3_A193TBW14_DISP_DATETIME, T001H3_A194TBW14_STUDY_ID, T001H3_A195TBW14_SUBJECT_ID, T001H3_A196TBW14_CRF_ID, T001H3_A940TBW14_CRF_EDA_NO, T001H3_A197TBW14_CRF_LATEST_VERSION, T001H3_A890TBW14_SDT_SAVE, T001H3_n890TBW14_SDT_SAVE
            }
            , new Object[] {
            T001H4_A192TBW14_SESSION_ID, T001H4_A193TBW14_DISP_DATETIME, T001H4_A194TBW14_STUDY_ID, T001H4_A195TBW14_SUBJECT_ID, T001H4_A196TBW14_CRF_ID, T001H4_A940TBW14_CRF_EDA_NO, T001H4_A197TBW14_CRF_LATEST_VERSION, T001H4_A890TBW14_SDT_SAVE, T001H4_n890TBW14_SDT_SAVE
            }
            , new Object[] {
            T001H5_A192TBW14_SESSION_ID, T001H5_A193TBW14_DISP_DATETIME, T001H5_A194TBW14_STUDY_ID, T001H5_A195TBW14_SUBJECT_ID, T001H5_A196TBW14_CRF_ID, T001H5_A940TBW14_CRF_EDA_NO, T001H5_A197TBW14_CRF_LATEST_VERSION
            }
            , new Object[] {
            T001H6_A192TBW14_SESSION_ID, T001H6_A193TBW14_DISP_DATETIME, T001H6_A194TBW14_STUDY_ID, T001H6_A195TBW14_SUBJECT_ID, T001H6_A196TBW14_CRF_ID, T001H6_A940TBW14_CRF_EDA_NO, T001H6_A197TBW14_CRF_LATEST_VERSION
            }
            , new Object[] {
            T001H7_A192TBW14_SESSION_ID, T001H7_A193TBW14_DISP_DATETIME, T001H7_A194TBW14_STUDY_ID, T001H7_A195TBW14_SUBJECT_ID, T001H7_A196TBW14_CRF_ID, T001H7_A940TBW14_CRF_EDA_NO, T001H7_A197TBW14_CRF_LATEST_VERSION
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001H11_A192TBW14_SESSION_ID, T001H11_A193TBW14_DISP_DATETIME, T001H11_A194TBW14_STUDY_ID, T001H11_A195TBW14_SUBJECT_ID, T001H11_A196TBW14_CRF_ID, T001H11_A940TBW14_CRF_EDA_NO, T001H11_A197TBW14_CRF_LATEST_VERSION
            }
         }
      );
   }

   private byte Z940TBW14_CRF_EDA_NO ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A940TBW14_CRF_EDA_NO ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short Z196TBW14_CRF_ID ;
   private short Z197TBW14_CRF_LATEST_VERSION ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A196TBW14_CRF_ID ;
   private short A197TBW14_CRF_LATEST_VERSION ;
   private short RcdFound60 ;
   private int Z195TBW14_SUBJECT_ID ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBW14_SESSION_ID_Enabled ;
   private int edtTBW14_DISP_DATETIME_Enabled ;
   private int edtTBW14_STUDY_ID_Enabled ;
   private int A195TBW14_SUBJECT_ID ;
   private int edtTBW14_SUBJECT_ID_Enabled ;
   private int edtTBW14_CRF_ID_Enabled ;
   private int edtTBW14_CRF_EDA_NO_Enabled ;
   private int edtTBW14_CRF_LATEST_VERSION_Enabled ;
   private int edtTBW14_SDT_SAVE_Enabled ;
   private int imgBtn_first_Visible ;
   private int imgBtn_first_separator_Visible ;
   private int imgBtn_previous_Visible ;
   private int imgBtn_previous_separator_Visible ;
   private int imgBtn_next_Visible ;
   private int imgBtn_next_separator_Visible ;
   private int imgBtn_last_Visible ;
   private int imgBtn_last_separator_Visible ;
   private int imgBtn_select_Visible ;
   private int imgBtn_select_separator_Visible ;
   private int imgBtn_enter2_Visible ;
   private int imgBtn_enter2_Enabled ;
   private int imgBtn_enter2_separator_Visible ;
   private int imgBtn_cancel2_Visible ;
   private int imgBtn_cancel2_separator_Visible ;
   private int imgBtn_delete2_Visible ;
   private int imgBtn_delete2_Enabled ;
   private int imgBtn_delete2_separator_Visible ;
   private int GX_JID ;
   private int idxLst ;
   private long Z194TBW14_STUDY_ID ;
   private long A194TBW14_STUDY_ID ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBW14_SESSION_ID_Internalname ;
   private String sStyleString ;
   private String tblTablemain_Internalname ;
   private String grpGroupdata_Internalname ;
   private String tblTable1_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String TempTags ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String tblTable2_Internalname ;
   private String lblTextblocktbw14_session_id_Internalname ;
   private String lblTextblocktbw14_session_id_Jsonclick ;
   private String edtTBW14_SESSION_ID_Jsonclick ;
   private String lblTextblocktbw14_disp_datetime_Internalname ;
   private String lblTextblocktbw14_disp_datetime_Jsonclick ;
   private String edtTBW14_DISP_DATETIME_Internalname ;
   private String edtTBW14_DISP_DATETIME_Jsonclick ;
   private String lblTextblocktbw14_study_id_Internalname ;
   private String lblTextblocktbw14_study_id_Jsonclick ;
   private String edtTBW14_STUDY_ID_Internalname ;
   private String edtTBW14_STUDY_ID_Jsonclick ;
   private String lblTextblocktbw14_subject_id_Internalname ;
   private String lblTextblocktbw14_subject_id_Jsonclick ;
   private String edtTBW14_SUBJECT_ID_Internalname ;
   private String edtTBW14_SUBJECT_ID_Jsonclick ;
   private String lblTextblocktbw14_crf_id_Internalname ;
   private String lblTextblocktbw14_crf_id_Jsonclick ;
   private String edtTBW14_CRF_ID_Internalname ;
   private String edtTBW14_CRF_ID_Jsonclick ;
   private String lblTextblocktbw14_crf_eda_no_Internalname ;
   private String lblTextblocktbw14_crf_eda_no_Jsonclick ;
   private String edtTBW14_CRF_EDA_NO_Internalname ;
   private String edtTBW14_CRF_EDA_NO_Jsonclick ;
   private String lblTextblocktbw14_crf_latest_version_Internalname ;
   private String lblTextblocktbw14_crf_latest_version_Jsonclick ;
   private String edtTBW14_CRF_LATEST_VERSION_Internalname ;
   private String edtTBW14_CRF_LATEST_VERSION_Jsonclick ;
   private String lblTextblocktbw14_sdt_save_Internalname ;
   private String lblTextblocktbw14_sdt_save_Jsonclick ;
   private String edtTBW14_SDT_SAVE_Internalname ;
   private String tblTabletoolbar_Internalname ;
   private String divSectiontoolbar_Internalname ;
   private String imgBtn_first_Internalname ;
   private String imgBtn_first_Jsonclick ;
   private String imgBtn_first_separator_Internalname ;
   private String imgBtn_first_separator_Jsonclick ;
   private String imgBtn_previous_Internalname ;
   private String imgBtn_previous_Jsonclick ;
   private String imgBtn_previous_separator_Internalname ;
   private String imgBtn_previous_separator_Jsonclick ;
   private String imgBtn_next_Internalname ;
   private String imgBtn_next_Jsonclick ;
   private String imgBtn_next_separator_Internalname ;
   private String imgBtn_next_separator_Jsonclick ;
   private String imgBtn_last_Internalname ;
   private String imgBtn_last_Jsonclick ;
   private String imgBtn_last_separator_Internalname ;
   private String imgBtn_last_separator_Jsonclick ;
   private String imgBtn_select_Internalname ;
   private String imgBtn_select_Jsonclick ;
   private String imgBtn_select_separator_Internalname ;
   private String imgBtn_select_separator_Jsonclick ;
   private String imgBtn_enter2_Internalname ;
   private String imgBtn_enter2_Jsonclick ;
   private String imgBtn_enter2_separator_Internalname ;
   private String imgBtn_enter2_separator_Jsonclick ;
   private String imgBtn_cancel2_Internalname ;
   private String imgBtn_cancel2_Jsonclick ;
   private String imgBtn_cancel2_separator_Internalname ;
   private String imgBtn_cancel2_separator_Jsonclick ;
   private String imgBtn_delete2_Internalname ;
   private String imgBtn_delete2_Jsonclick ;
   private String imgBtn_delete2_separator_Internalname ;
   private String imgBtn_delete2_separator_Jsonclick ;
   private String Gx_mode ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sMode60 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n890TBW14_SDT_SAVE ;
   private boolean toggleJsOutput ;
   private String A890TBW14_SDT_SAVE ;
   private String Z890TBW14_SDT_SAVE ;
   private String Z192TBW14_SESSION_ID ;
   private String Z193TBW14_DISP_DATETIME ;
   private String A192TBW14_SESSION_ID ;
   private String A193TBW14_DISP_DATETIME ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T001H4_A192TBW14_SESSION_ID ;
   private String[] T001H4_A193TBW14_DISP_DATETIME ;
   private long[] T001H4_A194TBW14_STUDY_ID ;
   private int[] T001H4_A195TBW14_SUBJECT_ID ;
   private short[] T001H4_A196TBW14_CRF_ID ;
   private byte[] T001H4_A940TBW14_CRF_EDA_NO ;
   private short[] T001H4_A197TBW14_CRF_LATEST_VERSION ;
   private String[] T001H4_A890TBW14_SDT_SAVE ;
   private boolean[] T001H4_n890TBW14_SDT_SAVE ;
   private String[] T001H5_A192TBW14_SESSION_ID ;
   private String[] T001H5_A193TBW14_DISP_DATETIME ;
   private long[] T001H5_A194TBW14_STUDY_ID ;
   private int[] T001H5_A195TBW14_SUBJECT_ID ;
   private short[] T001H5_A196TBW14_CRF_ID ;
   private byte[] T001H5_A940TBW14_CRF_EDA_NO ;
   private short[] T001H5_A197TBW14_CRF_LATEST_VERSION ;
   private String[] T001H3_A192TBW14_SESSION_ID ;
   private String[] T001H3_A193TBW14_DISP_DATETIME ;
   private long[] T001H3_A194TBW14_STUDY_ID ;
   private int[] T001H3_A195TBW14_SUBJECT_ID ;
   private short[] T001H3_A196TBW14_CRF_ID ;
   private byte[] T001H3_A940TBW14_CRF_EDA_NO ;
   private short[] T001H3_A197TBW14_CRF_LATEST_VERSION ;
   private String[] T001H3_A890TBW14_SDT_SAVE ;
   private boolean[] T001H3_n890TBW14_SDT_SAVE ;
   private String[] T001H6_A192TBW14_SESSION_ID ;
   private String[] T001H6_A193TBW14_DISP_DATETIME ;
   private long[] T001H6_A194TBW14_STUDY_ID ;
   private int[] T001H6_A195TBW14_SUBJECT_ID ;
   private short[] T001H6_A196TBW14_CRF_ID ;
   private byte[] T001H6_A940TBW14_CRF_EDA_NO ;
   private short[] T001H6_A197TBW14_CRF_LATEST_VERSION ;
   private String[] T001H7_A192TBW14_SESSION_ID ;
   private String[] T001H7_A193TBW14_DISP_DATETIME ;
   private long[] T001H7_A194TBW14_STUDY_ID ;
   private int[] T001H7_A195TBW14_SUBJECT_ID ;
   private short[] T001H7_A196TBW14_CRF_ID ;
   private byte[] T001H7_A940TBW14_CRF_EDA_NO ;
   private short[] T001H7_A197TBW14_CRF_LATEST_VERSION ;
   private String[] T001H2_A192TBW14_SESSION_ID ;
   private String[] T001H2_A193TBW14_DISP_DATETIME ;
   private long[] T001H2_A194TBW14_STUDY_ID ;
   private int[] T001H2_A195TBW14_SUBJECT_ID ;
   private short[] T001H2_A196TBW14_CRF_ID ;
   private byte[] T001H2_A940TBW14_CRF_EDA_NO ;
   private short[] T001H2_A197TBW14_CRF_LATEST_VERSION ;
   private String[] T001H2_A890TBW14_SDT_SAVE ;
   private boolean[] T001H2_n890TBW14_SDT_SAVE ;
   private String[] T001H11_A192TBW14_SESSION_ID ;
   private String[] T001H11_A193TBW14_DISP_DATETIME ;
   private long[] T001H11_A194TBW14_STUDY_ID ;
   private int[] T001H11_A195TBW14_SUBJECT_ID ;
   private short[] T001H11_A196TBW14_CRF_ID ;
   private byte[] T001H11_A940TBW14_CRF_EDA_NO ;
   private short[] T001H11_A197TBW14_CRF_LATEST_VERSION ;
}

final  class tbw14_crf_sdt_work__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001H2", "SELECT `TBW14_SESSION_ID`, `TBW14_DISP_DATETIME`, `TBW14_STUDY_ID`, `TBW14_SUBJECT_ID`, `TBW14_CRF_ID`, `TBW14_CRF_EDA_NO`, `TBW14_CRF_LATEST_VERSION`, `TBW14_SDT_SAVE` FROM `TBW14_CRF_SDT_WORK` WHERE `TBW14_SESSION_ID` = ? AND `TBW14_DISP_DATETIME` = ? AND `TBW14_STUDY_ID` = ? AND `TBW14_SUBJECT_ID` = ? AND `TBW14_CRF_ID` = ? AND `TBW14_CRF_EDA_NO` = ? AND `TBW14_CRF_LATEST_VERSION` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001H3", "SELECT `TBW14_SESSION_ID`, `TBW14_DISP_DATETIME`, `TBW14_STUDY_ID`, `TBW14_SUBJECT_ID`, `TBW14_CRF_ID`, `TBW14_CRF_EDA_NO`, `TBW14_CRF_LATEST_VERSION`, `TBW14_SDT_SAVE` FROM `TBW14_CRF_SDT_WORK` WHERE `TBW14_SESSION_ID` = ? AND `TBW14_DISP_DATETIME` = ? AND `TBW14_STUDY_ID` = ? AND `TBW14_SUBJECT_ID` = ? AND `TBW14_CRF_ID` = ? AND `TBW14_CRF_EDA_NO` = ? AND `TBW14_CRF_LATEST_VERSION` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001H4", "SELECT TM1.`TBW14_SESSION_ID`, TM1.`TBW14_DISP_DATETIME`, TM1.`TBW14_STUDY_ID`, TM1.`TBW14_SUBJECT_ID`, TM1.`TBW14_CRF_ID`, TM1.`TBW14_CRF_EDA_NO`, TM1.`TBW14_CRF_LATEST_VERSION`, TM1.`TBW14_SDT_SAVE` FROM `TBW14_CRF_SDT_WORK` TM1 WHERE TM1.`TBW14_SESSION_ID` = ? and TM1.`TBW14_DISP_DATETIME` = ? and TM1.`TBW14_STUDY_ID` = ? and TM1.`TBW14_SUBJECT_ID` = ? and TM1.`TBW14_CRF_ID` = ? and TM1.`TBW14_CRF_EDA_NO` = ? and TM1.`TBW14_CRF_LATEST_VERSION` = ? ORDER BY TM1.`TBW14_SESSION_ID`, TM1.`TBW14_DISP_DATETIME`, TM1.`TBW14_STUDY_ID`, TM1.`TBW14_SUBJECT_ID`, TM1.`TBW14_CRF_ID`, TM1.`TBW14_CRF_EDA_NO`, TM1.`TBW14_CRF_LATEST_VERSION` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T001H5", "SELECT `TBW14_SESSION_ID`, `TBW14_DISP_DATETIME`, `TBW14_STUDY_ID`, `TBW14_SUBJECT_ID`, `TBW14_CRF_ID`, `TBW14_CRF_EDA_NO`, `TBW14_CRF_LATEST_VERSION` FROM `TBW14_CRF_SDT_WORK` WHERE `TBW14_SESSION_ID` = ? AND `TBW14_DISP_DATETIME` = ? AND `TBW14_STUDY_ID` = ? AND `TBW14_SUBJECT_ID` = ? AND `TBW14_CRF_ID` = ? AND `TBW14_CRF_EDA_NO` = ? AND `TBW14_CRF_LATEST_VERSION` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001H6", "SELECT `TBW14_SESSION_ID`, `TBW14_DISP_DATETIME`, `TBW14_STUDY_ID`, `TBW14_SUBJECT_ID`, `TBW14_CRF_ID`, `TBW14_CRF_EDA_NO`, `TBW14_CRF_LATEST_VERSION` FROM `TBW14_CRF_SDT_WORK` WHERE ( `TBW14_SESSION_ID` > ? or `TBW14_SESSION_ID` = ? and `TBW14_DISP_DATETIME` > ? or `TBW14_DISP_DATETIME` = ? and `TBW14_SESSION_ID` = ? and `TBW14_STUDY_ID` > ? or `TBW14_STUDY_ID` = ? and `TBW14_DISP_DATETIME` = ? and `TBW14_SESSION_ID` = ? and `TBW14_SUBJECT_ID` > ? or `TBW14_SUBJECT_ID` = ? and `TBW14_STUDY_ID` = ? and `TBW14_DISP_DATETIME` = ? and `TBW14_SESSION_ID` = ? and `TBW14_CRF_ID` > ? or `TBW14_CRF_ID` = ? and `TBW14_SUBJECT_ID` = ? and `TBW14_STUDY_ID` = ? and `TBW14_DISP_DATETIME` = ? and `TBW14_SESSION_ID` = ? and `TBW14_CRF_EDA_NO` > ? or `TBW14_CRF_EDA_NO` = ? and `TBW14_CRF_ID` = ? and `TBW14_SUBJECT_ID` = ? and `TBW14_STUDY_ID` = ? and `TBW14_DISP_DATETIME` = ? and `TBW14_SESSION_ID` = ? and `TBW14_CRF_LATEST_VERSION` > ?) ORDER BY `TBW14_SESSION_ID`, `TBW14_DISP_DATETIME`, `TBW14_STUDY_ID`, `TBW14_SUBJECT_ID`, `TBW14_CRF_ID`, `TBW14_CRF_EDA_NO`, `TBW14_CRF_LATEST_VERSION`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001H7", "SELECT `TBW14_SESSION_ID`, `TBW14_DISP_DATETIME`, `TBW14_STUDY_ID`, `TBW14_SUBJECT_ID`, `TBW14_CRF_ID`, `TBW14_CRF_EDA_NO`, `TBW14_CRF_LATEST_VERSION` FROM `TBW14_CRF_SDT_WORK` WHERE ( `TBW14_SESSION_ID` < ? or `TBW14_SESSION_ID` = ? and `TBW14_DISP_DATETIME` < ? or `TBW14_DISP_DATETIME` = ? and `TBW14_SESSION_ID` = ? and `TBW14_STUDY_ID` < ? or `TBW14_STUDY_ID` = ? and `TBW14_DISP_DATETIME` = ? and `TBW14_SESSION_ID` = ? and `TBW14_SUBJECT_ID` < ? or `TBW14_SUBJECT_ID` = ? and `TBW14_STUDY_ID` = ? and `TBW14_DISP_DATETIME` = ? and `TBW14_SESSION_ID` = ? and `TBW14_CRF_ID` < ? or `TBW14_CRF_ID` = ? and `TBW14_SUBJECT_ID` = ? and `TBW14_STUDY_ID` = ? and `TBW14_DISP_DATETIME` = ? and `TBW14_SESSION_ID` = ? and `TBW14_CRF_EDA_NO` < ? or `TBW14_CRF_EDA_NO` = ? and `TBW14_CRF_ID` = ? and `TBW14_SUBJECT_ID` = ? and `TBW14_STUDY_ID` = ? and `TBW14_DISP_DATETIME` = ? and `TBW14_SESSION_ID` = ? and `TBW14_CRF_LATEST_VERSION` < ?) ORDER BY `TBW14_SESSION_ID` DESC, `TBW14_DISP_DATETIME` DESC, `TBW14_STUDY_ID` DESC, `TBW14_SUBJECT_ID` DESC, `TBW14_CRF_ID` DESC, `TBW14_CRF_EDA_NO` DESC, `TBW14_CRF_LATEST_VERSION` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001H8", "INSERT INTO `TBW14_CRF_SDT_WORK`(`TBW14_SESSION_ID`, `TBW14_DISP_DATETIME`, `TBW14_STUDY_ID`, `TBW14_SUBJECT_ID`, `TBW14_CRF_ID`, `TBW14_CRF_EDA_NO`, `TBW14_CRF_LATEST_VERSION`, `TBW14_SDT_SAVE`) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T001H9", "UPDATE `TBW14_CRF_SDT_WORK` SET `TBW14_SDT_SAVE`=?  WHERE `TBW14_SESSION_ID` = ? AND `TBW14_DISP_DATETIME` = ? AND `TBW14_STUDY_ID` = ? AND `TBW14_SUBJECT_ID` = ? AND `TBW14_CRF_ID` = ? AND `TBW14_CRF_EDA_NO` = ? AND `TBW14_CRF_LATEST_VERSION` = ?", GX_NOMASK)
         ,new UpdateCursor("T001H10", "DELETE FROM `TBW14_CRF_SDT_WORK`  WHERE `TBW14_SESSION_ID` = ? AND `TBW14_DISP_DATETIME` = ? AND `TBW14_STUDY_ID` = ? AND `TBW14_SUBJECT_ID` = ? AND `TBW14_CRF_ID` = ? AND `TBW14_CRF_EDA_NO` = ? AND `TBW14_CRF_LATEST_VERSION` = ?", GX_NOMASK)
         ,new ForEachCursor("T001H11", "SELECT `TBW14_SESSION_ID`, `TBW14_DISP_DATETIME`, `TBW14_STUDY_ID`, `TBW14_SUBJECT_ID`, `TBW14_CRF_ID`, `TBW14_CRF_EDA_NO`, `TBW14_CRF_LATEST_VERSION` FROM `TBW14_CRF_SDT_WORK` ORDER BY `TBW14_SESSION_ID`, `TBW14_DISP_DATETIME`, `TBW14_STUDY_ID`, `TBW14_SUBJECT_ID`, `TBW14_CRF_ID`, `TBW14_CRF_EDA_NO`, `TBW14_CRF_LATEST_VERSION` ",true, GX_NOMASK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((String[]) buf[7])[0] = rslt.getLongVarchar(8) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((String[]) buf[7])[0] = rslt.getLongVarchar(8) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((String[]) buf[7])[0] = rslt.getLongVarchar(8) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 14, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 14, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 14, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 14, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setVarchar(4, (String)parms[3], 14, false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setLong(7, ((Number) parms[6]).longValue());
               stmt.setVarchar(8, (String)parms[7], 14, false);
               stmt.setVarchar(9, (String)parms[8], 50, false);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setLong(12, ((Number) parms[11]).longValue());
               stmt.setVarchar(13, (String)parms[12], 14, false);
               stmt.setVarchar(14, (String)parms[13], 50, false);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setLong(18, ((Number) parms[17]).longValue());
               stmt.setVarchar(19, (String)parms[18], 14, false);
               stmt.setVarchar(20, (String)parms[19], 50, false);
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setLong(25, ((Number) parms[24]).longValue());
               stmt.setVarchar(26, (String)parms[25], 14, false);
               stmt.setVarchar(27, (String)parms[26], 50, false);
               stmt.setShort(28, ((Number) parms[27]).shortValue());
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setVarchar(4, (String)parms[3], 14, false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setLong(7, ((Number) parms[6]).longValue());
               stmt.setVarchar(8, (String)parms[7], 14, false);
               stmt.setVarchar(9, (String)parms[8], 50, false);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setLong(12, ((Number) parms[11]).longValue());
               stmt.setVarchar(13, (String)parms[12], 14, false);
               stmt.setVarchar(14, (String)parms[13], 50, false);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setLong(18, ((Number) parms[17]).longValue());
               stmt.setVarchar(19, (String)parms[18], 14, false);
               stmt.setVarchar(20, (String)parms[19], 50, false);
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setLong(25, ((Number) parms[24]).longValue());
               stmt.setVarchar(26, (String)parms[25], 14, false);
               stmt.setVarchar(27, (String)parms[26], 50, false);
               stmt.setShort(28, ((Number) parms[27]).shortValue());
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 14, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setNLongVarchar(8, (String)parms[8]);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setNLongVarchar(1, (String)parms[1]);
               }
               stmt.setVarchar(2, (String)parms[2], 50, false);
               stmt.setVarchar(3, (String)parms[3], 14, false);
               stmt.setLong(4, ((Number) parms[4]).longValue());
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 14, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

