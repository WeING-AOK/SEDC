/*
               File: tbm23_study_staff_impl
        Description: 試験参加スタッフマスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:37.86
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm23_study_staff_impl extends GXWebPanel
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
      gxfirstwebparm = httpContext.DecryptAjaxCall( gxfirstwebparm, "High") ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBM23_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbm23_crt_user_id0I17( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBM23_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbm23_upd_user_id0I17( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A207TBM23_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A207TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A207TBM23_STUDY_ID, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A207TBM23_STUDY_ID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A208TBM23_USER_ID = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A208TBM23_USER_ID", A208TBM23_USER_ID);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A208TBM23_USER_ID) ;
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
      Form.getMeta().addItem("Generator", "GeneXus Java", (short)(0)) ;
      Form.getMeta().addItem("Version", "10_1_8-58720", (short)(0)) ;
      Form.getMeta().addItem("Description", "試験参加スタッフマスタ", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
   }

   public tbm23_study_staff_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm23_study_staff_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm23_study_staff_impl.class ));
   }

   public tbm23_study_staff_impl( int remoteHandle ,
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
      if ( ( GxWebError == 0 ) && ! httpContext.isAjaxCallMode( ) )
      {
         userMain( ) ;
         if ( ! httpContext.isFullAjaxMode( ) )
         {
            draw( ) ;
         }
         if ( httpContext.isAjaxRequest( ) )
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
         wb_table1_2_0I17( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0I17e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0I17( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0I17( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0I17( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0I17e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"試験参加スタッフマスタ"+"</legend>") ;
         wb_table3_27_0I17( true) ;
      }
      return  ;
   }

   public void wb_table3_27_0I17e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0I17e( true) ;
      }
      else
      {
         wb_table1_2_0I17e( false) ;
      }
   }

   public void wb_table3_27_0I17( boolean wbgen )
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
         wb_table4_33_0I17( true) ;
      }
      return  ;
   }

   public void wb_table4_33_0I17e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM23_STUDY_STAFF.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM23_STUDY_STAFF.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_0I17e( true) ;
      }
      else
      {
         wb_table3_27_0I17e( false) ;
      }
   }

   public void wb_table4_33_0I17( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm23_study_id_Internalname, "試験ID", "", "", lblTextblocktbm23_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A207TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A207TBM23_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM23_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A207TBM23_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBM23_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A207TBM23_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A207TBM23_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(38);\"", "", "", "", "", edtTBM23_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM23_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm23_user_id_Internalname, "ユーザＩＤ", "", "", lblTextblocktbm23_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A208TBM23_USER_ID", A208TBM23_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM23_USER_ID_Internalname, GXutil.rtrim( A208TBM23_USER_ID), GXutil.rtrim( localUtil.format( A208TBM23_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(43);\"", "", "", "", "", edtTBM23_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM23_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm23_stydy_auth_cd_Internalname, "試験内権限コード", "", "", lblTextblocktbm23_stydy_auth_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A407TBM23_STYDY_AUTH_CD", A407TBM23_STYDY_AUTH_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM23_STYDY_AUTH_CD_Internalname, GXutil.rtrim( A407TBM23_STYDY_AUTH_CD), GXutil.rtrim( localUtil.format( A407TBM23_STYDY_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "", "", "", "", edtTBM23_STYDY_AUTH_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM23_STYDY_AUTH_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm23_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm23_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A209TBM23_DEL_FLG", A209TBM23_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM23_DEL_FLG_Internalname, GXutil.rtrim( A209TBM23_DEL_FLG), GXutil.rtrim( localUtil.format( A209TBM23_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(53);\"", "", "", "", "", edtTBM23_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM23_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm23_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm23_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A210TBM23_CRT_DATETIME", localUtil.ttoc( A210TBM23_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM23_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM23_CRT_DATETIME_Internalname, localUtil.format(A210TBM23_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A210TBM23_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(58);\"", "", "", "", "", edtTBM23_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM23_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM23_STUDY_STAFF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM23_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM23_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm23_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbm23_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A211TBM23_CRT_USER_ID", A211TBM23_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM23_CRT_USER_ID_Internalname, GXutil.rtrim( A211TBM23_CRT_USER_ID), GXutil.rtrim( localUtil.format( A211TBM23_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(63);\"", "", "", "", "", edtTBM23_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM23_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm23_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm23_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A212TBM23_CRT_PROG_NM", A212TBM23_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM23_CRT_PROG_NM_Internalname, GXutil.rtrim( A212TBM23_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A212TBM23_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "", "", "", "", edtTBM23_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM23_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm23_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm23_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A213TBM23_UPD_DATETIME", localUtil.ttoc( A213TBM23_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM23_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM23_UPD_DATETIME_Internalname, localUtil.format(A213TBM23_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A213TBM23_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(73);\"", "", "", "", "", edtTBM23_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM23_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM23_STUDY_STAFF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM23_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM23_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm23_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbm23_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A214TBM23_UPD_USER_ID", A214TBM23_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM23_UPD_USER_ID_Internalname, GXutil.rtrim( A214TBM23_UPD_USER_ID), GXutil.rtrim( localUtil.format( A214TBM23_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", "", "", "", "", edtTBM23_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM23_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm23_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm23_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A215TBM23_UPD_PROG_NM", A215TBM23_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM23_UPD_PROG_NM_Internalname, GXutil.rtrim( A215TBM23_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A215TBM23_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", "", "", "", "", edtTBM23_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM23_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm23_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm23_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A216TBM23_UPD_CNT", GXutil.ltrim( GXutil.str( A216TBM23_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM23_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A216TBM23_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM23_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A216TBM23_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A216TBM23_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(88);\"", "", "", "", "", edtTBM23_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM23_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_0I17e( true) ;
      }
      else
      {
         wb_table4_33_0I17e( false) ;
      }
   }

   public void wb_table2_5_0I17( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTabletoolbar_Internalname, tblTabletoolbar_Internalname, "", "ViewTable", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "<div style=\"WHITE-SPACE: nowrap\" class=\"ToolbarMain\">") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM23_STUDY_STAFF.htm");
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
         wb_table2_5_0I17e( true) ;
      }
      else
      {
         wb_table2_5_0I17e( false) ;
      }
   }

   public void userMain( )
   {
      standaloneStartup( ) ;
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
      /* Execute user event: e110I2 */
      e110I2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM23_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM23_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM23_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A207TBM23_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A207TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A207TBM23_STUDY_ID, 10, 0)));
            }
            else
            {
               A207TBM23_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM23_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A207TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A207TBM23_STUDY_ID, 10, 0)));
            }
            A208TBM23_USER_ID = httpContext.cgiGet( edtTBM23_USER_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A208TBM23_USER_ID", A208TBM23_USER_ID);
            A407TBM23_STYDY_AUTH_CD = httpContext.cgiGet( edtTBM23_STYDY_AUTH_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A407TBM23_STYDY_AUTH_CD", A407TBM23_STYDY_AUTH_CD);
            A209TBM23_DEL_FLG = httpContext.cgiGet( edtTBM23_DEL_FLG_Internalname) ;
            n209TBM23_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A209TBM23_DEL_FLG", A209TBM23_DEL_FLG);
            n209TBM23_DEL_FLG = ((GXutil.strcmp("", A209TBM23_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM23_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TBM23_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM23_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A210TBM23_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n210TBM23_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A210TBM23_CRT_DATETIME", localUtil.ttoc( A210TBM23_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A210TBM23_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM23_CRT_DATETIME_Internalname)) ;
               n210TBM23_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A210TBM23_CRT_DATETIME", localUtil.ttoc( A210TBM23_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n210TBM23_CRT_DATETIME = (GXutil.nullDate().equals(A210TBM23_CRT_DATETIME) ? true : false) ;
            A211TBM23_CRT_USER_ID = httpContext.cgiGet( edtTBM23_CRT_USER_ID_Internalname) ;
            n211TBM23_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A211TBM23_CRT_USER_ID", A211TBM23_CRT_USER_ID);
            n211TBM23_CRT_USER_ID = ((GXutil.strcmp("", A211TBM23_CRT_USER_ID)==0) ? true : false) ;
            A212TBM23_CRT_PROG_NM = httpContext.cgiGet( edtTBM23_CRT_PROG_NM_Internalname) ;
            n212TBM23_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A212TBM23_CRT_PROG_NM", A212TBM23_CRT_PROG_NM);
            n212TBM23_CRT_PROG_NM = ((GXutil.strcmp("", A212TBM23_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM23_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TBM23_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM23_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A213TBM23_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n213TBM23_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A213TBM23_UPD_DATETIME", localUtil.ttoc( A213TBM23_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A213TBM23_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM23_UPD_DATETIME_Internalname)) ;
               n213TBM23_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A213TBM23_UPD_DATETIME", localUtil.ttoc( A213TBM23_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n213TBM23_UPD_DATETIME = (GXutil.nullDate().equals(A213TBM23_UPD_DATETIME) ? true : false) ;
            A214TBM23_UPD_USER_ID = httpContext.cgiGet( edtTBM23_UPD_USER_ID_Internalname) ;
            n214TBM23_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A214TBM23_UPD_USER_ID", A214TBM23_UPD_USER_ID);
            n214TBM23_UPD_USER_ID = ((GXutil.strcmp("", A214TBM23_UPD_USER_ID)==0) ? true : false) ;
            A215TBM23_UPD_PROG_NM = httpContext.cgiGet( edtTBM23_UPD_PROG_NM_Internalname) ;
            n215TBM23_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A215TBM23_UPD_PROG_NM", A215TBM23_UPD_PROG_NM);
            n215TBM23_UPD_PROG_NM = ((GXutil.strcmp("", A215TBM23_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM23_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM23_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM23_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM23_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A216TBM23_UPD_CNT = 0 ;
               n216TBM23_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A216TBM23_UPD_CNT", GXutil.ltrim( GXutil.str( A216TBM23_UPD_CNT, 10, 0)));
            }
            else
            {
               A216TBM23_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM23_UPD_CNT_Internalname), ".", ",") ;
               n216TBM23_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A216TBM23_UPD_CNT", GXutil.ltrim( GXutil.str( A216TBM23_UPD_CNT, 10, 0)));
            }
            n216TBM23_UPD_CNT = ((0==A216TBM23_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z207TBM23_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z207TBM23_STUDY_ID"), ".", ",") ;
            Z208TBM23_USER_ID = httpContext.cgiGet( "Z208TBM23_USER_ID") ;
            Z407TBM23_STYDY_AUTH_CD = httpContext.cgiGet( "Z407TBM23_STYDY_AUTH_CD") ;
            Z210TBM23_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z210TBM23_CRT_DATETIME"), 0) ;
            n210TBM23_CRT_DATETIME = (GXutil.nullDate().equals(A210TBM23_CRT_DATETIME) ? true : false) ;
            Z211TBM23_CRT_USER_ID = httpContext.cgiGet( "Z211TBM23_CRT_USER_ID") ;
            n211TBM23_CRT_USER_ID = ((GXutil.strcmp("", A211TBM23_CRT_USER_ID)==0) ? true : false) ;
            Z213TBM23_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z213TBM23_UPD_DATETIME"), 0) ;
            n213TBM23_UPD_DATETIME = (GXutil.nullDate().equals(A213TBM23_UPD_DATETIME) ? true : false) ;
            Z214TBM23_UPD_USER_ID = httpContext.cgiGet( "Z214TBM23_UPD_USER_ID") ;
            n214TBM23_UPD_USER_ID = ((GXutil.strcmp("", A214TBM23_UPD_USER_ID)==0) ? true : false) ;
            Z216TBM23_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z216TBM23_UPD_CNT"), ".", ",") ;
            n216TBM23_UPD_CNT = ((0==A216TBM23_UPD_CNT) ? true : false) ;
            Z209TBM23_DEL_FLG = httpContext.cgiGet( "Z209TBM23_DEL_FLG") ;
            n209TBM23_DEL_FLG = ((GXutil.strcmp("", A209TBM23_DEL_FLG)==0) ? true : false) ;
            Z212TBM23_CRT_PROG_NM = httpContext.cgiGet( "Z212TBM23_CRT_PROG_NM") ;
            n212TBM23_CRT_PROG_NM = ((GXutil.strcmp("", A212TBM23_CRT_PROG_NM)==0) ? true : false) ;
            Z215TBM23_UPD_PROG_NM = httpContext.cgiGet( "Z215TBM23_UPD_PROG_NM") ;
            n215TBM23_UPD_PROG_NM = ((GXutil.strcmp("", A215TBM23_UPD_PROG_NM)==0) ? true : false) ;
            O216TBM23_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O216TBM23_UPD_CNT"), ".", ",") ;
            n216TBM23_UPD_CNT = ((0==A216TBM23_UPD_CNT) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV9Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            standaloneNotModal( ) ;
         }
         else
         {
            standaloneNotModal( ) ;
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
            {
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               A207TBM23_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A207TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A207TBM23_STUDY_ID, 10, 0)));
               A208TBM23_USER_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A208TBM23_USER_ID", A208TBM23_USER_ID);
               A407TBM23_STYDY_AUTH_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A407TBM23_STYDY_AUTH_CD", A407TBM23_STYDY_AUTH_CD);
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
                  if ( GXutil.strcmp(sEvt, "START") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e110I2 */
                     e110I2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120I2 */
                     e120I2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
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
         /* Execute user event: e120I2 */
         e120I2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0I17( ) ;
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
      disableAttributes0I17( ) ;
   }

   public void set_caption( )
   {
      if ( ( IsConfirmed == 1 ) && ( AnyError == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "");
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "");
         }
      }
   }

   public void resetCaption0I0( )
   {
   }

   public void e110I2( )
   {
      /* Start Routine */
      AV8W_BC_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_BC_FLG", AV8W_BC_FLG);
      if ( GXutil.strcmp(AV8W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", "禁止機能") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e120I2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A207TBM23_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A208TBM23_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A407TBM23_STYDY_AUTH_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A209TBM23_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A210TBM23_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm23_study_staff_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A210TBM23_CRT_DATETIME", localUtil.ttoc( A210TBM23_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A211TBM23_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A212TBM23_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A213TBM23_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm23_study_staff_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A213TBM23_UPD_DATETIME", localUtil.ttoc( A213TBM23_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A214TBM23_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A215TBM23_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A216TBM23_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void S1164( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0I17( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z210TBM23_CRT_DATETIME = T000I3_A210TBM23_CRT_DATETIME[0] ;
            Z211TBM23_CRT_USER_ID = T000I3_A211TBM23_CRT_USER_ID[0] ;
            Z213TBM23_UPD_DATETIME = T000I3_A213TBM23_UPD_DATETIME[0] ;
            Z214TBM23_UPD_USER_ID = T000I3_A214TBM23_UPD_USER_ID[0] ;
            Z216TBM23_UPD_CNT = T000I3_A216TBM23_UPD_CNT[0] ;
            Z209TBM23_DEL_FLG = T000I3_A209TBM23_DEL_FLG[0] ;
            Z212TBM23_CRT_PROG_NM = T000I3_A212TBM23_CRT_PROG_NM[0] ;
            Z215TBM23_UPD_PROG_NM = T000I3_A215TBM23_UPD_PROG_NM[0] ;
         }
         else
         {
            Z210TBM23_CRT_DATETIME = A210TBM23_CRT_DATETIME ;
            Z211TBM23_CRT_USER_ID = A211TBM23_CRT_USER_ID ;
            Z213TBM23_UPD_DATETIME = A213TBM23_UPD_DATETIME ;
            Z214TBM23_UPD_USER_ID = A214TBM23_UPD_USER_ID ;
            Z216TBM23_UPD_CNT = A216TBM23_UPD_CNT ;
            Z209TBM23_DEL_FLG = A209TBM23_DEL_FLG ;
            Z212TBM23_CRT_PROG_NM = A212TBM23_CRT_PROG_NM ;
            Z215TBM23_UPD_PROG_NM = A215TBM23_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z407TBM23_STYDY_AUTH_CD = A407TBM23_STYDY_AUTH_CD ;
         Z210TBM23_CRT_DATETIME = A210TBM23_CRT_DATETIME ;
         Z211TBM23_CRT_USER_ID = A211TBM23_CRT_USER_ID ;
         Z213TBM23_UPD_DATETIME = A213TBM23_UPD_DATETIME ;
         Z214TBM23_UPD_USER_ID = A214TBM23_UPD_USER_ID ;
         Z216TBM23_UPD_CNT = A216TBM23_UPD_CNT ;
         Z209TBM23_DEL_FLG = A209TBM23_DEL_FLG ;
         Z212TBM23_CRT_PROG_NM = A212TBM23_CRT_PROG_NM ;
         Z215TBM23_UPD_PROG_NM = A215TBM23_UPD_PROG_NM ;
         Z207TBM23_STUDY_ID = A207TBM23_STUDY_ID ;
         Z208TBM23_USER_ID = A208TBM23_USER_ID ;
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

   public void load0I17( )
   {
      /* Using cursor T000I6 */
      pr_default.execute(4, new Object[] {new Long(A207TBM23_STUDY_ID), A208TBM23_USER_ID, A407TBM23_STYDY_AUTH_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound17 = (short)(1) ;
         A210TBM23_CRT_DATETIME = T000I6_A210TBM23_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A210TBM23_CRT_DATETIME", localUtil.ttoc( A210TBM23_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n210TBM23_CRT_DATETIME = T000I6_n210TBM23_CRT_DATETIME[0] ;
         A211TBM23_CRT_USER_ID = T000I6_A211TBM23_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A211TBM23_CRT_USER_ID", A211TBM23_CRT_USER_ID);
         n211TBM23_CRT_USER_ID = T000I6_n211TBM23_CRT_USER_ID[0] ;
         A213TBM23_UPD_DATETIME = T000I6_A213TBM23_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213TBM23_UPD_DATETIME", localUtil.ttoc( A213TBM23_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n213TBM23_UPD_DATETIME = T000I6_n213TBM23_UPD_DATETIME[0] ;
         A214TBM23_UPD_USER_ID = T000I6_A214TBM23_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A214TBM23_UPD_USER_ID", A214TBM23_UPD_USER_ID);
         n214TBM23_UPD_USER_ID = T000I6_n214TBM23_UPD_USER_ID[0] ;
         A216TBM23_UPD_CNT = T000I6_A216TBM23_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A216TBM23_UPD_CNT", GXutil.ltrim( GXutil.str( A216TBM23_UPD_CNT, 10, 0)));
         n216TBM23_UPD_CNT = T000I6_n216TBM23_UPD_CNT[0] ;
         A209TBM23_DEL_FLG = T000I6_A209TBM23_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A209TBM23_DEL_FLG", A209TBM23_DEL_FLG);
         n209TBM23_DEL_FLG = T000I6_n209TBM23_DEL_FLG[0] ;
         A212TBM23_CRT_PROG_NM = T000I6_A212TBM23_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212TBM23_CRT_PROG_NM", A212TBM23_CRT_PROG_NM);
         n212TBM23_CRT_PROG_NM = T000I6_n212TBM23_CRT_PROG_NM[0] ;
         A215TBM23_UPD_PROG_NM = T000I6_A215TBM23_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A215TBM23_UPD_PROG_NM", A215TBM23_UPD_PROG_NM);
         n215TBM23_UPD_PROG_NM = T000I6_n215TBM23_UPD_PROG_NM[0] ;
         zm0I17( -8) ;
      }
      pr_default.close(4);
      onLoadActions0I17( ) ;
   }

   public void onLoadActions0I17( )
   {
      AV9Pgmname = "TBM23_STUDY_STAFF" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0I17( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBM23_STUDY_STAFF" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      /* Using cursor T000I4 */
      pr_default.execute(2, new Object[] {new Long(A207TBM23_STUDY_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError207 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'試験参加スタッフマスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM23_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError207 == 0 )
      {
      }
      pr_default.close(2);
      /* Using cursor T000I5 */
      pr_default.execute(3, new Object[] {A208TBM23_USER_ID});
      if ( (pr_default.getStatus(3) == 101) )
      {
         AnyError208 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'試験参加スタッフマスタ・ユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBM23_USER_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM23_USER_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError208 == 0 )
      {
      }
      pr_default.close(3);
      if ( ! ( GXutil.nullDate().equals(A210TBM23_CRT_DATETIME) || (( A210TBM23_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A210TBM23_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A213TBM23_UPD_DATETIME) || (( A213TBM23_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A213TBM23_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0I17( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( long A207TBM23_STUDY_ID )
   {
      /* Using cursor T000I7 */
      pr_default.execute(5, new Object[] {new Long(A207TBM23_STUDY_ID)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         AnyError207 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'試験参加スタッフマスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM23_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError207 == 0 )
      {
      }
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(5);
   }

   public void gxload_10( String A208TBM23_USER_ID )
   {
      /* Using cursor T000I8 */
      pr_default.execute(6, new Object[] {A208TBM23_USER_ID});
      if ( (pr_default.getStatus(6) == 101) )
      {
         AnyError208 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'試験参加スタッフマスタ・ユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBM23_USER_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM23_USER_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError208 == 0 )
      {
      }
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(6);
   }

   public void getKey0I17( )
   {
      /* Using cursor T000I9 */
      pr_default.execute(7, new Object[] {new Long(A207TBM23_STUDY_ID), A208TBM23_USER_ID, A407TBM23_STYDY_AUTH_CD});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound17 = (short)(1) ;
      }
      else
      {
         RcdFound17 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000I3 */
      pr_default.execute(1, new Object[] {new Long(A207TBM23_STUDY_ID), A208TBM23_USER_ID, A407TBM23_STYDY_AUTH_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0I17( 8) ;
         RcdFound17 = (short)(1) ;
         A407TBM23_STYDY_AUTH_CD = T000I3_A407TBM23_STYDY_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407TBM23_STYDY_AUTH_CD", A407TBM23_STYDY_AUTH_CD);
         A210TBM23_CRT_DATETIME = T000I3_A210TBM23_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A210TBM23_CRT_DATETIME", localUtil.ttoc( A210TBM23_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n210TBM23_CRT_DATETIME = T000I3_n210TBM23_CRT_DATETIME[0] ;
         A211TBM23_CRT_USER_ID = T000I3_A211TBM23_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A211TBM23_CRT_USER_ID", A211TBM23_CRT_USER_ID);
         n211TBM23_CRT_USER_ID = T000I3_n211TBM23_CRT_USER_ID[0] ;
         A213TBM23_UPD_DATETIME = T000I3_A213TBM23_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213TBM23_UPD_DATETIME", localUtil.ttoc( A213TBM23_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n213TBM23_UPD_DATETIME = T000I3_n213TBM23_UPD_DATETIME[0] ;
         A214TBM23_UPD_USER_ID = T000I3_A214TBM23_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A214TBM23_UPD_USER_ID", A214TBM23_UPD_USER_ID);
         n214TBM23_UPD_USER_ID = T000I3_n214TBM23_UPD_USER_ID[0] ;
         A216TBM23_UPD_CNT = T000I3_A216TBM23_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A216TBM23_UPD_CNT", GXutil.ltrim( GXutil.str( A216TBM23_UPD_CNT, 10, 0)));
         n216TBM23_UPD_CNT = T000I3_n216TBM23_UPD_CNT[0] ;
         A209TBM23_DEL_FLG = T000I3_A209TBM23_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A209TBM23_DEL_FLG", A209TBM23_DEL_FLG);
         n209TBM23_DEL_FLG = T000I3_n209TBM23_DEL_FLG[0] ;
         A212TBM23_CRT_PROG_NM = T000I3_A212TBM23_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212TBM23_CRT_PROG_NM", A212TBM23_CRT_PROG_NM);
         n212TBM23_CRT_PROG_NM = T000I3_n212TBM23_CRT_PROG_NM[0] ;
         A215TBM23_UPD_PROG_NM = T000I3_A215TBM23_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A215TBM23_UPD_PROG_NM", A215TBM23_UPD_PROG_NM);
         n215TBM23_UPD_PROG_NM = T000I3_n215TBM23_UPD_PROG_NM[0] ;
         A207TBM23_STUDY_ID = T000I3_A207TBM23_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A207TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A207TBM23_STUDY_ID, 10, 0)));
         A208TBM23_USER_ID = T000I3_A208TBM23_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A208TBM23_USER_ID", A208TBM23_USER_ID);
         O216TBM23_UPD_CNT = A216TBM23_UPD_CNT ;
         n216TBM23_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A216TBM23_UPD_CNT", GXutil.ltrim( GXutil.str( A216TBM23_UPD_CNT, 10, 0)));
         Z207TBM23_STUDY_ID = A207TBM23_STUDY_ID ;
         Z208TBM23_USER_ID = A208TBM23_USER_ID ;
         Z407TBM23_STYDY_AUTH_CD = A407TBM23_STYDY_AUTH_CD ;
         sMode17 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0I17( ) ;
         Gx_mode = sMode17 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound17 = (short)(0) ;
         initializeNonKey0I17( ) ;
         sMode17 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode17 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0I17( ) ;
      if ( RcdFound17 == 0 )
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
      RcdFound17 = (short)(0) ;
      /* Using cursor T000I10 */
      pr_default.execute(8, new Object[] {new Long(A207TBM23_STUDY_ID), new Long(A207TBM23_STUDY_ID), A208TBM23_USER_ID, A208TBM23_USER_ID, new Long(A207TBM23_STUDY_ID), A407TBM23_STYDY_AUTH_CD});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T000I10_A207TBM23_STUDY_ID[0] < A207TBM23_STUDY_ID ) || ( T000I10_A207TBM23_STUDY_ID[0] == A207TBM23_STUDY_ID ) && ( GXutil.strcmp(T000I10_A208TBM23_USER_ID[0], A208TBM23_USER_ID) < 0 ) || ( GXutil.strcmp(T000I10_A208TBM23_USER_ID[0], A208TBM23_USER_ID) == 0 ) && ( T000I10_A207TBM23_STUDY_ID[0] == A207TBM23_STUDY_ID ) && ( GXutil.strcmp(T000I10_A407TBM23_STYDY_AUTH_CD[0], A407TBM23_STYDY_AUTH_CD) < 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T000I10_A207TBM23_STUDY_ID[0] > A207TBM23_STUDY_ID ) || ( T000I10_A207TBM23_STUDY_ID[0] == A207TBM23_STUDY_ID ) && ( GXutil.strcmp(T000I10_A208TBM23_USER_ID[0], A208TBM23_USER_ID) > 0 ) || ( GXutil.strcmp(T000I10_A208TBM23_USER_ID[0], A208TBM23_USER_ID) == 0 ) && ( T000I10_A207TBM23_STUDY_ID[0] == A207TBM23_STUDY_ID ) && ( GXutil.strcmp(T000I10_A407TBM23_STYDY_AUTH_CD[0], A407TBM23_STYDY_AUTH_CD) > 0 ) ) )
         {
            A207TBM23_STUDY_ID = T000I10_A207TBM23_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A207TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A207TBM23_STUDY_ID, 10, 0)));
            A208TBM23_USER_ID = T000I10_A208TBM23_USER_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A208TBM23_USER_ID", A208TBM23_USER_ID);
            A407TBM23_STYDY_AUTH_CD = T000I10_A407TBM23_STYDY_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A407TBM23_STYDY_AUTH_CD", A407TBM23_STYDY_AUTH_CD);
            RcdFound17 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound17 = (short)(0) ;
      /* Using cursor T000I11 */
      pr_default.execute(9, new Object[] {new Long(A207TBM23_STUDY_ID), new Long(A207TBM23_STUDY_ID), A208TBM23_USER_ID, A208TBM23_USER_ID, new Long(A207TBM23_STUDY_ID), A407TBM23_STYDY_AUTH_CD});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T000I11_A207TBM23_STUDY_ID[0] > A207TBM23_STUDY_ID ) || ( T000I11_A207TBM23_STUDY_ID[0] == A207TBM23_STUDY_ID ) && ( GXutil.strcmp(T000I11_A208TBM23_USER_ID[0], A208TBM23_USER_ID) > 0 ) || ( GXutil.strcmp(T000I11_A208TBM23_USER_ID[0], A208TBM23_USER_ID) == 0 ) && ( T000I11_A207TBM23_STUDY_ID[0] == A207TBM23_STUDY_ID ) && ( GXutil.strcmp(T000I11_A407TBM23_STYDY_AUTH_CD[0], A407TBM23_STYDY_AUTH_CD) > 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T000I11_A207TBM23_STUDY_ID[0] < A207TBM23_STUDY_ID ) || ( T000I11_A207TBM23_STUDY_ID[0] == A207TBM23_STUDY_ID ) && ( GXutil.strcmp(T000I11_A208TBM23_USER_ID[0], A208TBM23_USER_ID) < 0 ) || ( GXutil.strcmp(T000I11_A208TBM23_USER_ID[0], A208TBM23_USER_ID) == 0 ) && ( T000I11_A207TBM23_STUDY_ID[0] == A207TBM23_STUDY_ID ) && ( GXutil.strcmp(T000I11_A407TBM23_STYDY_AUTH_CD[0], A407TBM23_STYDY_AUTH_CD) < 0 ) ) )
         {
            A207TBM23_STUDY_ID = T000I11_A207TBM23_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A207TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A207TBM23_STUDY_ID, 10, 0)));
            A208TBM23_USER_ID = T000I11_A208TBM23_USER_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A208TBM23_USER_ID", A208TBM23_USER_ID);
            A407TBM23_STYDY_AUTH_CD = T000I11_A407TBM23_STYDY_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A407TBM23_STYDY_AUTH_CD", A407TBM23_STYDY_AUTH_CD);
            RcdFound17 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0I17( ) ;
      if ( RcdFound17 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBM23_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( A207TBM23_STUDY_ID != Z207TBM23_STUDY_ID ) || ( GXutil.strcmp(A208TBM23_USER_ID, Z208TBM23_USER_ID) != 0 ) || ( GXutil.strcmp(A407TBM23_STYDY_AUTH_CD, Z407TBM23_STYDY_AUTH_CD) != 0 ) )
         {
            A207TBM23_STUDY_ID = Z207TBM23_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A207TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A207TBM23_STUDY_ID, 10, 0)));
            A208TBM23_USER_ID = Z208TBM23_USER_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A208TBM23_USER_ID", A208TBM23_USER_ID);
            A407TBM23_STYDY_AUTH_CD = Z407TBM23_STYDY_AUTH_CD ;
            httpContext.ajax_rsp_assign_attri("", false, "A407TBM23_STYDY_AUTH_CD", A407TBM23_STYDY_AUTH_CD);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM23_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
            GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Update record */
            update0I17( ) ;
            GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( ( A207TBM23_STUDY_ID != Z207TBM23_STUDY_ID ) || ( GXutil.strcmp(A208TBM23_USER_ID, Z208TBM23_USER_ID) != 0 ) || ( GXutil.strcmp(A407TBM23_STYDY_AUTH_CD, Z407TBM23_STYDY_AUTH_CD) != 0 ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert0I17( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM23_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0I17( ) ;
               if ( AnyError == 1 )
               {
                  GX_FocusControl = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
         }
      }
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( ( A207TBM23_STUDY_ID != Z207TBM23_STUDY_ID ) || ( GXutil.strcmp(A208TBM23_USER_ID, Z208TBM23_USER_ID) != 0 ) || ( GXutil.strcmp(A407TBM23_STYDY_AUTH_CD, Z407TBM23_STYDY_AUTH_CD) != 0 ) )
      {
         A207TBM23_STUDY_ID = Z207TBM23_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A207TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A207TBM23_STUDY_ID, 10, 0)));
         A208TBM23_USER_ID = Z208TBM23_USER_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A208TBM23_USER_ID", A208TBM23_USER_ID);
         A407TBM23_STYDY_AUTH_CD = Z407TBM23_STYDY_AUTH_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A407TBM23_STYDY_AUTH_CD", A407TBM23_STYDY_AUTH_CD);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM23_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      getEqualNoModal( ) ;
      if ( RcdFound17 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM23_STUDY_ID");
         AnyError = (short)(1) ;
      }
      GX_FocusControl = edtTBM23_DEL_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart0I17( ) ;
      if ( RcdFound17 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM23_DEL_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0I17( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound17 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM23_DEL_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_next( ) ;
      if ( RcdFound17 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM23_DEL_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart0I17( ) ;
      if ( RcdFound17 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound17 != 0 )
         {
            scanNext0I17( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM23_DEL_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0I17( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0I17( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000I2 */
         pr_default.execute(0, new Object[] {new Long(A207TBM23_STUDY_ID), A208TBM23_USER_ID, A407TBM23_STYDY_AUTH_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM23_STUDY_STAFF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z210TBM23_CRT_DATETIME.equals( T000I2_A210TBM23_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z211TBM23_CRT_USER_ID, T000I2_A211TBM23_CRT_USER_ID[0]) != 0 ) || !( Z213TBM23_UPD_DATETIME.equals( T000I2_A213TBM23_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z214TBM23_UPD_USER_ID, T000I2_A214TBM23_UPD_USER_ID[0]) != 0 ) || ( Z216TBM23_UPD_CNT != T000I2_A216TBM23_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z209TBM23_DEL_FLG, T000I2_A209TBM23_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z212TBM23_CRT_PROG_NM, T000I2_A212TBM23_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z215TBM23_UPD_PROG_NM, T000I2_A215TBM23_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM23_STUDY_STAFF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0I17( )
   {
      beforeValidate0I17( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0I17( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0I17( 0) ;
         checkOptimisticConcurrency0I17( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0I17( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0I17( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000I12 */
                  pr_default.execute(10, new Object[] {A407TBM23_STYDY_AUTH_CD, new Boolean(n210TBM23_CRT_DATETIME), A210TBM23_CRT_DATETIME, new Boolean(n211TBM23_CRT_USER_ID), A211TBM23_CRT_USER_ID, new Boolean(n213TBM23_UPD_DATETIME), A213TBM23_UPD_DATETIME, new Boolean(n214TBM23_UPD_USER_ID), A214TBM23_UPD_USER_ID, new Boolean(n216TBM23_UPD_CNT), new Long(A216TBM23_UPD_CNT), new Boolean(n209TBM23_DEL_FLG), A209TBM23_DEL_FLG, new Boolean(n212TBM23_CRT_PROG_NM), A212TBM23_CRT_PROG_NM, new Boolean(n215TBM23_UPD_PROG_NM), A215TBM23_UPD_PROG_NM, new Long(A207TBM23_STUDY_ID), A208TBM23_USER_ID});
                  if ( (pr_default.getStatus(10) == 1) )
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
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "");
                        resetCaption0I0( ) ;
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
            load0I17( ) ;
         }
         endLevel0I17( ) ;
      }
      closeExtendedTableCursors0I17( ) ;
   }

   public void update0I17( )
   {
      beforeValidate0I17( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0I17( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0I17( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0I17( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0I17( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000I13 */
                  pr_default.execute(11, new Object[] {new Boolean(n210TBM23_CRT_DATETIME), A210TBM23_CRT_DATETIME, new Boolean(n211TBM23_CRT_USER_ID), A211TBM23_CRT_USER_ID, new Boolean(n213TBM23_UPD_DATETIME), A213TBM23_UPD_DATETIME, new Boolean(n214TBM23_UPD_USER_ID), A214TBM23_UPD_USER_ID, new Boolean(n216TBM23_UPD_CNT), new Long(A216TBM23_UPD_CNT), new Boolean(n209TBM23_DEL_FLG), A209TBM23_DEL_FLG, new Boolean(n212TBM23_CRT_PROG_NM), A212TBM23_CRT_PROG_NM, new Boolean(n215TBM23_UPD_PROG_NM), A215TBM23_UPD_PROG_NM, new Long(A207TBM23_STUDY_ID), A208TBM23_USER_ID, A407TBM23_STYDY_AUTH_CD});
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM23_STUDY_STAFF"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0I17( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                        resetCaption0I0( ) ;
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
         endLevel0I17( ) ;
      }
      closeExtendedTableCursors0I17( ) ;
   }

   public void deferredUpdate0I17( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0I17( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0I17( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0I17( ) ;
         afterConfirm0I17( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0I17( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000I14 */
               pr_default.execute(12, new Object[] {new Long(A207TBM23_STUDY_ID), A208TBM23_USER_ID, A407TBM23_STYDY_AUTH_CD});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound17 == 0 )
                     {
                        initAll0I17( ) ;
                        Gx_mode = "INS" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     else
                     {
                        getByPrimaryKey( ) ;
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), 0, "");
                     resetCaption0I0( ) ;
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
      sMode17 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0I17( ) ;
      Gx_mode = sMode17 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0I17( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM23_STUDY_STAFF" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel0I17( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0I17( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm23_study_staff");
         if ( AnyError == 0 )
         {
            confirmValues0I0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm23_study_staff");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0I17( )
   {
      /* Using cursor T000I15 */
      pr_default.execute(13);
      RcdFound17 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound17 = (short)(1) ;
         A207TBM23_STUDY_ID = T000I15_A207TBM23_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A207TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A207TBM23_STUDY_ID, 10, 0)));
         A208TBM23_USER_ID = T000I15_A208TBM23_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A208TBM23_USER_ID", A208TBM23_USER_ID);
         A407TBM23_STYDY_AUTH_CD = T000I15_A407TBM23_STYDY_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407TBM23_STYDY_AUTH_CD", A407TBM23_STYDY_AUTH_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0I17( )
   {
      pr_default.readNext(13);
      RcdFound17 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound17 = (short)(1) ;
         A207TBM23_STUDY_ID = T000I15_A207TBM23_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A207TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A207TBM23_STUDY_ID, 10, 0)));
         A208TBM23_USER_ID = T000I15_A208TBM23_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A208TBM23_USER_ID", A208TBM23_USER_ID);
         A407TBM23_STYDY_AUTH_CD = T000I15_A407TBM23_STYDY_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407TBM23_STYDY_AUTH_CD", A407TBM23_STYDY_AUTH_CD);
      }
   }

   public void scanEnd0I17( )
   {
      pr_default.close(13);
   }

   public void afterConfirm0I17( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0I17( )
   {
      /* Before Insert Rules */
      A210TBM23_CRT_DATETIME = GXutil.now( ) ;
      n210TBM23_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A210TBM23_CRT_DATETIME", localUtil.ttoc( A210TBM23_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A211TBM23_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm23_study_staff_impl.this.GXt_char3 = GXv_char4[0] ;
      A211TBM23_CRT_USER_ID = GXt_char3 ;
      n211TBM23_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A211TBM23_CRT_USER_ID", A211TBM23_CRT_USER_ID);
      A213TBM23_UPD_DATETIME = GXutil.now( ) ;
      n213TBM23_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A213TBM23_UPD_DATETIME", localUtil.ttoc( A213TBM23_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A214TBM23_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm23_study_staff_impl.this.GXt_char3 = GXv_char4[0] ;
      A214TBM23_UPD_USER_ID = GXt_char3 ;
      n214TBM23_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A214TBM23_UPD_USER_ID", A214TBM23_UPD_USER_ID);
      A216TBM23_UPD_CNT = (long)(O216TBM23_UPD_CNT+1) ;
      n216TBM23_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A216TBM23_UPD_CNT", GXutil.ltrim( GXutil.str( A216TBM23_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0I17( )
   {
      /* Before Update Rules */
      A213TBM23_UPD_DATETIME = GXutil.now( ) ;
      n213TBM23_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A213TBM23_UPD_DATETIME", localUtil.ttoc( A213TBM23_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A214TBM23_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm23_study_staff_impl.this.GXt_char3 = GXv_char4[0] ;
      A214TBM23_UPD_USER_ID = GXt_char3 ;
      n214TBM23_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A214TBM23_UPD_USER_ID", A214TBM23_UPD_USER_ID);
      A216TBM23_UPD_CNT = (long)(O216TBM23_UPD_CNT+1) ;
      n216TBM23_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A216TBM23_UPD_CNT", GXutil.ltrim( GXutil.str( A216TBM23_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0I17( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0I17( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0I17( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0I17( )
   {
      edtTBM23_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM23_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM23_STUDY_ID_Enabled, 5, 0)));
      edtTBM23_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM23_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM23_USER_ID_Enabled, 5, 0)));
      edtTBM23_STYDY_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM23_STYDY_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM23_STYDY_AUTH_CD_Enabled, 5, 0)));
      edtTBM23_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM23_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM23_DEL_FLG_Enabled, 5, 0)));
      edtTBM23_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM23_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM23_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM23_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM23_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM23_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM23_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM23_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM23_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM23_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM23_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM23_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM23_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM23_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM23_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM23_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM23_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM23_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM23_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM23_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM23_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0I0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "試験参加スタッフマスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      if ( ! httpContext.isSmartDevice( ) )
      {
         httpContext.AddJavascriptSource("gxgral.js", "?58720");
         httpContext.AddJavascriptSource("gxcfg.js", "?58720");
      }
      else
      {
         httpContext.AddJavascriptSource("gxapiSD.js", "?58720");
         httpContext.AddJavascriptSource("gxfxSD.js", "?58720");
         httpContext.AddJavascriptSource("gxtypesSD.js", "?58720");
         httpContext.AddJavascriptSource("gxpopupSD.js", "?58720");
         httpContext.AddJavascriptSource("gxfrmutlSD.js", "?58720");
         httpContext.AddJavascriptSource("gxgridSD.js", "?58720");
         httpContext.AddJavascriptSource("JavaScripTableSD.js", "?58720");
         httpContext.AddJavascriptSource("rijndaelSD.js", "?58720");
         httpContext.AddJavascriptSource("gxgralSD.js", "?58720");
         httpContext.AddJavascriptSource("gxcfg.js", "?58720");
      }
      httpContext.AddJavascriptSource("calendar.js", "?58720");
      httpContext.AddJavascriptSource("calendar-setup.js", "?58720");
      httpContext.AddJavascriptSource("calendar-ja.js", "?58720");
      httpContext.closeHtmlHeader();
      FormProcess = " onkeyup=\"gx.evt.onkeyup(event)\" onkeypress=\"gx.evt.onkeypress(event,true,false)\" onkeydown=\"gx.evt.onkeypress(null,true,false)\"" ;
      httpContext.writeText( "<body") ;
      httpContext.writeText( " "+"class=\"Form\""+" "+" style=\"-moz-opacity:0;opacity:0;") ;
      httpContext.writeText( "\""+FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbm23_study_staff") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0I17( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z207TBM23_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z207TBM23_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z208TBM23_USER_ID", GXutil.rtrim( Z208TBM23_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z407TBM23_STYDY_AUTH_CD", GXutil.rtrim( Z407TBM23_STYDY_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z210TBM23_CRT_DATETIME", localUtil.ttoc( Z210TBM23_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z211TBM23_CRT_USER_ID", GXutil.rtrim( Z211TBM23_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z213TBM23_UPD_DATETIME", localUtil.ttoc( Z213TBM23_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z214TBM23_UPD_USER_ID", GXutil.rtrim( Z214TBM23_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z216TBM23_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z216TBM23_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z209TBM23_DEL_FLG", GXutil.rtrim( Z209TBM23_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z212TBM23_CRT_PROG_NM", GXutil.rtrim( Z212TBM23_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z215TBM23_UPD_PROG_NM", GXutil.rtrim( Z215TBM23_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O216TBM23_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O216TBM23_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV9Pgmname));
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

   public void initializeNonKey0I17( )
   {
      A210TBM23_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n210TBM23_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A210TBM23_CRT_DATETIME", localUtil.ttoc( A210TBM23_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n210TBM23_CRT_DATETIME = (GXutil.nullDate().equals(A210TBM23_CRT_DATETIME) ? true : false) ;
      A211TBM23_CRT_USER_ID = "" ;
      n211TBM23_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A211TBM23_CRT_USER_ID", A211TBM23_CRT_USER_ID);
      n211TBM23_CRT_USER_ID = ((GXutil.strcmp("", A211TBM23_CRT_USER_ID)==0) ? true : false) ;
      A213TBM23_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n213TBM23_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A213TBM23_UPD_DATETIME", localUtil.ttoc( A213TBM23_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n213TBM23_UPD_DATETIME = (GXutil.nullDate().equals(A213TBM23_UPD_DATETIME) ? true : false) ;
      A214TBM23_UPD_USER_ID = "" ;
      n214TBM23_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A214TBM23_UPD_USER_ID", A214TBM23_UPD_USER_ID);
      n214TBM23_UPD_USER_ID = ((GXutil.strcmp("", A214TBM23_UPD_USER_ID)==0) ? true : false) ;
      A216TBM23_UPD_CNT = 0 ;
      n216TBM23_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A216TBM23_UPD_CNT", GXutil.ltrim( GXutil.str( A216TBM23_UPD_CNT, 10, 0)));
      n216TBM23_UPD_CNT = ((0==A216TBM23_UPD_CNT) ? true : false) ;
      A209TBM23_DEL_FLG = "" ;
      n209TBM23_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A209TBM23_DEL_FLG", A209TBM23_DEL_FLG);
      n209TBM23_DEL_FLG = ((GXutil.strcmp("", A209TBM23_DEL_FLG)==0) ? true : false) ;
      A212TBM23_CRT_PROG_NM = "" ;
      n212TBM23_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A212TBM23_CRT_PROG_NM", A212TBM23_CRT_PROG_NM);
      n212TBM23_CRT_PROG_NM = ((GXutil.strcmp("", A212TBM23_CRT_PROG_NM)==0) ? true : false) ;
      A215TBM23_UPD_PROG_NM = "" ;
      n215TBM23_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A215TBM23_UPD_PROG_NM", A215TBM23_UPD_PROG_NM);
      n215TBM23_UPD_PROG_NM = ((GXutil.strcmp("", A215TBM23_UPD_PROG_NM)==0) ? true : false) ;
      O216TBM23_UPD_CNT = A216TBM23_UPD_CNT ;
      n216TBM23_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A216TBM23_UPD_CNT", GXutil.ltrim( GXutil.str( A216TBM23_UPD_CNT, 10, 0)));
   }

   public void initAll0I17( )
   {
      A207TBM23_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A207TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A207TBM23_STUDY_ID, 10, 0)));
      A208TBM23_USER_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A208TBM23_USER_ID", A208TBM23_USER_ID);
      A407TBM23_STYDY_AUTH_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A407TBM23_STYDY_AUTH_CD", A407TBM23_STYDY_AUTH_CD);
      initializeNonKey0I17( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?225080");
      httpContext.AddThemeStyleSheetFile("", "Style2.css", "?14454892");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14543931");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbm23_study_staff.js", "?14543931");
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
      tblTabletoolbar_Internalname = "TABLETOOLBAR" ;
      lblTextblocktbm23_study_id_Internalname = "TEXTBLOCKTBM23_STUDY_ID" ;
      edtTBM23_STUDY_ID_Internalname = "TBM23_STUDY_ID" ;
      lblTextblocktbm23_user_id_Internalname = "TEXTBLOCKTBM23_USER_ID" ;
      edtTBM23_USER_ID_Internalname = "TBM23_USER_ID" ;
      lblTextblocktbm23_stydy_auth_cd_Internalname = "TEXTBLOCKTBM23_STYDY_AUTH_CD" ;
      edtTBM23_STYDY_AUTH_CD_Internalname = "TBM23_STYDY_AUTH_CD" ;
      lblTextblocktbm23_del_flg_Internalname = "TEXTBLOCKTBM23_DEL_FLG" ;
      edtTBM23_DEL_FLG_Internalname = "TBM23_DEL_FLG" ;
      lblTextblocktbm23_crt_datetime_Internalname = "TEXTBLOCKTBM23_CRT_DATETIME" ;
      edtTBM23_CRT_DATETIME_Internalname = "TBM23_CRT_DATETIME" ;
      lblTextblocktbm23_crt_user_id_Internalname = "TEXTBLOCKTBM23_CRT_USER_ID" ;
      edtTBM23_CRT_USER_ID_Internalname = "TBM23_CRT_USER_ID" ;
      lblTextblocktbm23_crt_prog_nm_Internalname = "TEXTBLOCKTBM23_CRT_PROG_NM" ;
      edtTBM23_CRT_PROG_NM_Internalname = "TBM23_CRT_PROG_NM" ;
      lblTextblocktbm23_upd_datetime_Internalname = "TEXTBLOCKTBM23_UPD_DATETIME" ;
      edtTBM23_UPD_DATETIME_Internalname = "TBM23_UPD_DATETIME" ;
      lblTextblocktbm23_upd_user_id_Internalname = "TEXTBLOCKTBM23_UPD_USER_ID" ;
      edtTBM23_UPD_USER_ID_Internalname = "TBM23_UPD_USER_ID" ;
      lblTextblocktbm23_upd_prog_nm_Internalname = "TEXTBLOCKTBM23_UPD_PROG_NM" ;
      edtTBM23_UPD_PROG_NM_Internalname = "TBM23_UPD_PROG_NM" ;
      lblTextblocktbm23_upd_cnt_Internalname = "TEXTBLOCKTBM23_UPD_CNT" ;
      edtTBM23_UPD_CNT_Internalname = "TBM23_UPD_CNT" ;
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
      edtTBM23_UPD_CNT_Jsonclick = "" ;
      edtTBM23_UPD_CNT_Enabled = 1 ;
      edtTBM23_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM23_UPD_PROG_NM_Enabled = 1 ;
      edtTBM23_UPD_USER_ID_Jsonclick = "" ;
      edtTBM23_UPD_USER_ID_Enabled = 1 ;
      edtTBM23_UPD_DATETIME_Jsonclick = "" ;
      edtTBM23_UPD_DATETIME_Enabled = 1 ;
      edtTBM23_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM23_CRT_PROG_NM_Enabled = 1 ;
      edtTBM23_CRT_USER_ID_Jsonclick = "" ;
      edtTBM23_CRT_USER_ID_Enabled = 1 ;
      edtTBM23_CRT_DATETIME_Jsonclick = "" ;
      edtTBM23_CRT_DATETIME_Enabled = 1 ;
      edtTBM23_DEL_FLG_Jsonclick = "" ;
      edtTBM23_DEL_FLG_Enabled = 1 ;
      edtTBM23_STYDY_AUTH_CD_Jsonclick = "" ;
      edtTBM23_STYDY_AUTH_CD_Enabled = 1 ;
      edtTBM23_USER_ID_Jsonclick = "" ;
      edtTBM23_USER_ID_Enabled = 1 ;
      edtTBM23_STUDY_ID_Jsonclick = "" ;
      edtTBM23_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbm23_crt_user_id0I17( String Gx_mode )
   {
      GXt_char3 = A211TBM23_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm23_study_staff_impl.this.GXt_char3 = GXv_char4[0] ;
      A211TBM23_CRT_USER_ID = GXt_char3 ;
      n211TBM23_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A211TBM23_CRT_USER_ID", A211TBM23_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A211TBM23_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbm23_upd_user_id0I17( String Gx_mode )
   {
      GXt_char3 = A214TBM23_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm23_study_staff_impl.this.GXt_char3 = GXv_char4[0] ;
      A214TBM23_UPD_USER_ID = GXt_char3 ;
      n214TBM23_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A214TBM23_UPD_USER_ID", A214TBM23_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A214TBM23_UPD_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      getEqualNoModal( ) ;
      /* Using cursor T000I16 */
      pr_default.execute(14, new Object[] {new Long(A207TBM23_STUDY_ID)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         AnyError207 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'試験参加スタッフマスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM23_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError207 == 0 )
      {
      }
      pr_default.close(14);
      /* Using cursor T000I17 */
      pr_default.execute(15, new Object[] {A208TBM23_USER_ID});
      if ( (pr_default.getStatus(15) == 101) )
      {
         AnyError208 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'試験参加スタッフマスタ・ユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBM23_USER_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM23_USER_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError208 == 0 )
      {
      }
      pr_default.close(15);
      GX_FocusControl = edtTBM23_DEL_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm23_study_id( long GX_Parm1 )
   {
      A207TBM23_STUDY_ID = GX_Parm1 ;
      /* Using cursor T000I16 */
      pr_default.execute(14, new Object[] {new Long(A207TBM23_STUDY_ID)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         AnyError207 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'試験参加スタッフマスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM23_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
      }
      if ( AnyError207 == 0 )
      {
      }
      pr_default.close(14);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbm23_user_id( String GX_Parm1 )
   {
      A208TBM23_USER_ID = GX_Parm1 ;
      /* Using cursor T000I17 */
      pr_default.execute(15, new Object[] {A208TBM23_USER_ID});
      if ( (pr_default.getStatus(15) == 101) )
      {
         AnyError208 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'試験参加スタッフマスタ・ユーザーサブタイプ'", "ForeignKeyNotFound", 1, "TBM23_USER_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM23_USER_ID_Internalname ;
      }
      if ( AnyError208 == 0 )
      {
      }
      pr_default.close(15);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbm23_stydy_auth_cd( long GX_Parm1 ,
                                          String GX_Parm2 ,
                                          String GX_Parm3 ,
                                          java.util.Date GX_Parm4 ,
                                          String GX_Parm5 ,
                                          java.util.Date GX_Parm6 ,
                                          String GX_Parm7 ,
                                          long GX_Parm8 ,
                                          String GX_Parm9 ,
                                          String GX_Parm10 ,
                                          String GX_Parm11 )
   {
      A207TBM23_STUDY_ID = GX_Parm1 ;
      A208TBM23_USER_ID = GX_Parm2 ;
      A407TBM23_STYDY_AUTH_CD = GX_Parm3 ;
      A210TBM23_CRT_DATETIME = GX_Parm4 ;
      n210TBM23_CRT_DATETIME = false ;
      A211TBM23_CRT_USER_ID = GX_Parm5 ;
      n211TBM23_CRT_USER_ID = false ;
      A213TBM23_UPD_DATETIME = GX_Parm6 ;
      n213TBM23_UPD_DATETIME = false ;
      A214TBM23_UPD_USER_ID = GX_Parm7 ;
      n214TBM23_UPD_USER_ID = false ;
      A216TBM23_UPD_CNT = GX_Parm8 ;
      n216TBM23_UPD_CNT = false ;
      A209TBM23_DEL_FLG = GX_Parm9 ;
      n209TBM23_DEL_FLG = false ;
      A212TBM23_CRT_PROG_NM = GX_Parm10 ;
      n212TBM23_CRT_PROG_NM = false ;
      A215TBM23_UPD_PROG_NM = GX_Parm11 ;
      n215TBM23_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A210TBM23_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A211TBM23_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A213TBM23_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A214TBM23_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A216TBM23_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A209TBM23_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A212TBM23_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A215TBM23_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z207TBM23_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z208TBM23_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z407TBM23_STYDY_AUTH_CD));
      isValidOutput.add(localUtil.ttoc( Z210TBM23_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z211TBM23_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z213TBM23_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z214TBM23_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z216TBM23_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z209TBM23_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z212TBM23_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z215TBM23_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O216TBM23_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(imgBtn_delete2_Enabled);
      isValidOutput.add(imgBtn_enter2_Enabled);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(14);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   /* Error handler code */
   public void handleError( )
   {
      if ( context.globals.getErr( ) != 0 )
      {
         Gx_err = context.globals.getErr( ) ;
         Gx_emsg = context.globals.getErrMsg( ) ;
         switch ( GXActiveErrHndl )
         {
               default:
                  /* Execute user subroutine: S1164 */
                  S1164 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      sPrefix = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A208TBM23_USER_ID = "" ;
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
      lblTextblocktbm23_study_id_Jsonclick = "" ;
      lblTextblocktbm23_user_id_Jsonclick = "" ;
      lblTextblocktbm23_stydy_auth_cd_Jsonclick = "" ;
      A407TBM23_STYDY_AUTH_CD = "" ;
      lblTextblocktbm23_del_flg_Jsonclick = "" ;
      A209TBM23_DEL_FLG = "" ;
      lblTextblocktbm23_crt_datetime_Jsonclick = "" ;
      A210TBM23_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm23_crt_user_id_Jsonclick = "" ;
      A211TBM23_CRT_USER_ID = "" ;
      lblTextblocktbm23_crt_prog_nm_Jsonclick = "" ;
      A212TBM23_CRT_PROG_NM = "" ;
      lblTextblocktbm23_upd_datetime_Jsonclick = "" ;
      A213TBM23_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm23_upd_user_id_Jsonclick = "" ;
      A214TBM23_UPD_USER_ID = "" ;
      lblTextblocktbm23_upd_prog_nm_Jsonclick = "" ;
      A215TBM23_UPD_PROG_NM = "" ;
      lblTextblocktbm23_upd_cnt_Jsonclick = "" ;
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
      Z208TBM23_USER_ID = "" ;
      Z407TBM23_STYDY_AUTH_CD = "" ;
      Z210TBM23_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z211TBM23_CRT_USER_ID = "" ;
      Z213TBM23_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z214TBM23_UPD_USER_ID = "" ;
      Z209TBM23_DEL_FLG = "" ;
      Z212TBM23_CRT_PROG_NM = "" ;
      Z215TBM23_UPD_PROG_NM = "" ;
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      T000I6_A407TBM23_STYDY_AUTH_CD = new String[] {""} ;
      T000I6_A210TBM23_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000I6_n210TBM23_CRT_DATETIME = new boolean[] {false} ;
      T000I6_A211TBM23_CRT_USER_ID = new String[] {""} ;
      T000I6_n211TBM23_CRT_USER_ID = new boolean[] {false} ;
      T000I6_A213TBM23_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000I6_n213TBM23_UPD_DATETIME = new boolean[] {false} ;
      T000I6_A214TBM23_UPD_USER_ID = new String[] {""} ;
      T000I6_n214TBM23_UPD_USER_ID = new boolean[] {false} ;
      T000I6_A216TBM23_UPD_CNT = new long[1] ;
      T000I6_n216TBM23_UPD_CNT = new boolean[] {false} ;
      T000I6_A209TBM23_DEL_FLG = new String[] {""} ;
      T000I6_n209TBM23_DEL_FLG = new boolean[] {false} ;
      T000I6_A212TBM23_CRT_PROG_NM = new String[] {""} ;
      T000I6_n212TBM23_CRT_PROG_NM = new boolean[] {false} ;
      T000I6_A215TBM23_UPD_PROG_NM = new String[] {""} ;
      T000I6_n215TBM23_UPD_PROG_NM = new boolean[] {false} ;
      T000I6_A207TBM23_STUDY_ID = new long[1] ;
      T000I6_A208TBM23_USER_ID = new String[] {""} ;
      T000I4_A207TBM23_STUDY_ID = new long[1] ;
      T000I5_A208TBM23_USER_ID = new String[] {""} ;
      T000I7_A207TBM23_STUDY_ID = new long[1] ;
      T000I8_A208TBM23_USER_ID = new String[] {""} ;
      T000I9_A207TBM23_STUDY_ID = new long[1] ;
      T000I9_A208TBM23_USER_ID = new String[] {""} ;
      T000I9_A407TBM23_STYDY_AUTH_CD = new String[] {""} ;
      T000I3_A407TBM23_STYDY_AUTH_CD = new String[] {""} ;
      T000I3_A210TBM23_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000I3_n210TBM23_CRT_DATETIME = new boolean[] {false} ;
      T000I3_A211TBM23_CRT_USER_ID = new String[] {""} ;
      T000I3_n211TBM23_CRT_USER_ID = new boolean[] {false} ;
      T000I3_A213TBM23_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000I3_n213TBM23_UPD_DATETIME = new boolean[] {false} ;
      T000I3_A214TBM23_UPD_USER_ID = new String[] {""} ;
      T000I3_n214TBM23_UPD_USER_ID = new boolean[] {false} ;
      T000I3_A216TBM23_UPD_CNT = new long[1] ;
      T000I3_n216TBM23_UPD_CNT = new boolean[] {false} ;
      T000I3_A209TBM23_DEL_FLG = new String[] {""} ;
      T000I3_n209TBM23_DEL_FLG = new boolean[] {false} ;
      T000I3_A212TBM23_CRT_PROG_NM = new String[] {""} ;
      T000I3_n212TBM23_CRT_PROG_NM = new boolean[] {false} ;
      T000I3_A215TBM23_UPD_PROG_NM = new String[] {""} ;
      T000I3_n215TBM23_UPD_PROG_NM = new boolean[] {false} ;
      T000I3_A207TBM23_STUDY_ID = new long[1] ;
      T000I3_A208TBM23_USER_ID = new String[] {""} ;
      sMode17 = "" ;
      T000I10_A207TBM23_STUDY_ID = new long[1] ;
      T000I10_A208TBM23_USER_ID = new String[] {""} ;
      T000I10_A407TBM23_STYDY_AUTH_CD = new String[] {""} ;
      T000I11_A207TBM23_STUDY_ID = new long[1] ;
      T000I11_A208TBM23_USER_ID = new String[] {""} ;
      T000I11_A407TBM23_STYDY_AUTH_CD = new String[] {""} ;
      T000I2_A407TBM23_STYDY_AUTH_CD = new String[] {""} ;
      T000I2_A210TBM23_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000I2_n210TBM23_CRT_DATETIME = new boolean[] {false} ;
      T000I2_A211TBM23_CRT_USER_ID = new String[] {""} ;
      T000I2_n211TBM23_CRT_USER_ID = new boolean[] {false} ;
      T000I2_A213TBM23_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000I2_n213TBM23_UPD_DATETIME = new boolean[] {false} ;
      T000I2_A214TBM23_UPD_USER_ID = new String[] {""} ;
      T000I2_n214TBM23_UPD_USER_ID = new boolean[] {false} ;
      T000I2_A216TBM23_UPD_CNT = new long[1] ;
      T000I2_n216TBM23_UPD_CNT = new boolean[] {false} ;
      T000I2_A209TBM23_DEL_FLG = new String[] {""} ;
      T000I2_n209TBM23_DEL_FLG = new boolean[] {false} ;
      T000I2_A212TBM23_CRT_PROG_NM = new String[] {""} ;
      T000I2_n212TBM23_CRT_PROG_NM = new boolean[] {false} ;
      T000I2_A215TBM23_UPD_PROG_NM = new String[] {""} ;
      T000I2_n215TBM23_UPD_PROG_NM = new boolean[] {false} ;
      T000I2_A207TBM23_STUDY_ID = new long[1] ;
      T000I2_A208TBM23_USER_ID = new String[] {""} ;
      T000I15_A207TBM23_STUDY_ID = new long[1] ;
      T000I15_A208TBM23_USER_ID = new String[] {""} ;
      T000I15_A407TBM23_STYDY_AUTH_CD = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char3 = "" ;
      T000I16_A207TBM23_STUDY_ID = new long[1] ;
      T000I17_A208TBM23_USER_ID = new String[] {""} ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm23_study_staff__default(),
         new Object[] {
             new Object[] {
            T000I2_A407TBM23_STYDY_AUTH_CD, T000I2_A210TBM23_CRT_DATETIME, T000I2_n210TBM23_CRT_DATETIME, T000I2_A211TBM23_CRT_USER_ID, T000I2_n211TBM23_CRT_USER_ID, T000I2_A213TBM23_UPD_DATETIME, T000I2_n213TBM23_UPD_DATETIME, T000I2_A214TBM23_UPD_USER_ID, T000I2_n214TBM23_UPD_USER_ID, T000I2_A216TBM23_UPD_CNT,
            T000I2_n216TBM23_UPD_CNT, T000I2_A209TBM23_DEL_FLG, T000I2_n209TBM23_DEL_FLG, T000I2_A212TBM23_CRT_PROG_NM, T000I2_n212TBM23_CRT_PROG_NM, T000I2_A215TBM23_UPD_PROG_NM, T000I2_n215TBM23_UPD_PROG_NM, T000I2_A207TBM23_STUDY_ID, T000I2_A208TBM23_USER_ID
            }
            , new Object[] {
            T000I3_A407TBM23_STYDY_AUTH_CD, T000I3_A210TBM23_CRT_DATETIME, T000I3_n210TBM23_CRT_DATETIME, T000I3_A211TBM23_CRT_USER_ID, T000I3_n211TBM23_CRT_USER_ID, T000I3_A213TBM23_UPD_DATETIME, T000I3_n213TBM23_UPD_DATETIME, T000I3_A214TBM23_UPD_USER_ID, T000I3_n214TBM23_UPD_USER_ID, T000I3_A216TBM23_UPD_CNT,
            T000I3_n216TBM23_UPD_CNT, T000I3_A209TBM23_DEL_FLG, T000I3_n209TBM23_DEL_FLG, T000I3_A212TBM23_CRT_PROG_NM, T000I3_n212TBM23_CRT_PROG_NM, T000I3_A215TBM23_UPD_PROG_NM, T000I3_n215TBM23_UPD_PROG_NM, T000I3_A207TBM23_STUDY_ID, T000I3_A208TBM23_USER_ID
            }
            , new Object[] {
            T000I4_A207TBM23_STUDY_ID
            }
            , new Object[] {
            T000I5_A208TBM23_USER_ID
            }
            , new Object[] {
            T000I6_A407TBM23_STYDY_AUTH_CD, T000I6_A210TBM23_CRT_DATETIME, T000I6_n210TBM23_CRT_DATETIME, T000I6_A211TBM23_CRT_USER_ID, T000I6_n211TBM23_CRT_USER_ID, T000I6_A213TBM23_UPD_DATETIME, T000I6_n213TBM23_UPD_DATETIME, T000I6_A214TBM23_UPD_USER_ID, T000I6_n214TBM23_UPD_USER_ID, T000I6_A216TBM23_UPD_CNT,
            T000I6_n216TBM23_UPD_CNT, T000I6_A209TBM23_DEL_FLG, T000I6_n209TBM23_DEL_FLG, T000I6_A212TBM23_CRT_PROG_NM, T000I6_n212TBM23_CRT_PROG_NM, T000I6_A215TBM23_UPD_PROG_NM, T000I6_n215TBM23_UPD_PROG_NM, T000I6_A207TBM23_STUDY_ID, T000I6_A208TBM23_USER_ID
            }
            , new Object[] {
            T000I7_A207TBM23_STUDY_ID
            }
            , new Object[] {
            T000I8_A208TBM23_USER_ID
            }
            , new Object[] {
            T000I9_A207TBM23_STUDY_ID, T000I9_A208TBM23_USER_ID, T000I9_A407TBM23_STYDY_AUTH_CD
            }
            , new Object[] {
            T000I10_A207TBM23_STUDY_ID, T000I10_A208TBM23_USER_ID, T000I10_A407TBM23_STYDY_AUTH_CD
            }
            , new Object[] {
            T000I11_A207TBM23_STUDY_ID, T000I11_A208TBM23_USER_ID, T000I11_A407TBM23_STYDY_AUTH_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000I15_A207TBM23_STUDY_ID, T000I15_A208TBM23_USER_ID, T000I15_A407TBM23_STYDY_AUTH_CD
            }
            , new Object[] {
            T000I16_A207TBM23_STUDY_ID
            }
            , new Object[] {
            T000I17_A208TBM23_USER_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM23_STUDY_STAFF" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound17 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM23_STUDY_ID_Enabled ;
   private int edtTBM23_USER_ID_Enabled ;
   private int edtTBM23_STYDY_AUTH_CD_Enabled ;
   private int edtTBM23_DEL_FLG_Enabled ;
   private int edtTBM23_CRT_DATETIME_Enabled ;
   private int edtTBM23_CRT_USER_ID_Enabled ;
   private int edtTBM23_CRT_PROG_NM_Enabled ;
   private int edtTBM23_UPD_DATETIME_Enabled ;
   private int edtTBM23_UPD_USER_ID_Enabled ;
   private int edtTBM23_UPD_PROG_NM_Enabled ;
   private int edtTBM23_UPD_CNT_Enabled ;
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
   private int AnyError207 ;
   private int AnyError208 ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long A207TBM23_STUDY_ID ;
   private long A216TBM23_UPD_CNT ;
   private long Z207TBM23_STUDY_ID ;
   private long Z216TBM23_UPD_CNT ;
   private long O216TBM23_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM23_STUDY_ID_Internalname ;
   private String sStyleString ;
   private String tblTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String grpGroupdata_Internalname ;
   private String tblTable1_Internalname ;
   private String TempTags ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String tblTable2_Internalname ;
   private String lblTextblocktbm23_study_id_Internalname ;
   private String lblTextblocktbm23_study_id_Jsonclick ;
   private String edtTBM23_STUDY_ID_Jsonclick ;
   private String lblTextblocktbm23_user_id_Internalname ;
   private String lblTextblocktbm23_user_id_Jsonclick ;
   private String edtTBM23_USER_ID_Internalname ;
   private String edtTBM23_USER_ID_Jsonclick ;
   private String lblTextblocktbm23_stydy_auth_cd_Internalname ;
   private String lblTextblocktbm23_stydy_auth_cd_Jsonclick ;
   private String edtTBM23_STYDY_AUTH_CD_Internalname ;
   private String edtTBM23_STYDY_AUTH_CD_Jsonclick ;
   private String lblTextblocktbm23_del_flg_Internalname ;
   private String lblTextblocktbm23_del_flg_Jsonclick ;
   private String edtTBM23_DEL_FLG_Internalname ;
   private String edtTBM23_DEL_FLG_Jsonclick ;
   private String lblTextblocktbm23_crt_datetime_Internalname ;
   private String lblTextblocktbm23_crt_datetime_Jsonclick ;
   private String edtTBM23_CRT_DATETIME_Internalname ;
   private String edtTBM23_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm23_crt_user_id_Internalname ;
   private String lblTextblocktbm23_crt_user_id_Jsonclick ;
   private String edtTBM23_CRT_USER_ID_Internalname ;
   private String edtTBM23_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm23_crt_prog_nm_Internalname ;
   private String lblTextblocktbm23_crt_prog_nm_Jsonclick ;
   private String edtTBM23_CRT_PROG_NM_Internalname ;
   private String edtTBM23_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm23_upd_datetime_Internalname ;
   private String lblTextblocktbm23_upd_datetime_Jsonclick ;
   private String edtTBM23_UPD_DATETIME_Internalname ;
   private String edtTBM23_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm23_upd_user_id_Internalname ;
   private String lblTextblocktbm23_upd_user_id_Jsonclick ;
   private String edtTBM23_UPD_USER_ID_Internalname ;
   private String edtTBM23_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm23_upd_prog_nm_Internalname ;
   private String lblTextblocktbm23_upd_prog_nm_Jsonclick ;
   private String edtTBM23_UPD_PROG_NM_Internalname ;
   private String edtTBM23_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm23_upd_cnt_Internalname ;
   private String lblTextblocktbm23_upd_cnt_Jsonclick ;
   private String edtTBM23_UPD_CNT_Internalname ;
   private String edtTBM23_UPD_CNT_Jsonclick ;
   private String tblTabletoolbar_Internalname ;
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
   private String AV9Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXEncryptionTmp ;
   private String sMode17 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char3 ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A210TBM23_CRT_DATETIME ;
   private java.util.Date A213TBM23_UPD_DATETIME ;
   private java.util.Date Z210TBM23_CRT_DATETIME ;
   private java.util.Date Z213TBM23_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n209TBM23_DEL_FLG ;
   private boolean n210TBM23_CRT_DATETIME ;
   private boolean n211TBM23_CRT_USER_ID ;
   private boolean n212TBM23_CRT_PROG_NM ;
   private boolean n213TBM23_UPD_DATETIME ;
   private boolean n214TBM23_UPD_USER_ID ;
   private boolean n215TBM23_UPD_PROG_NM ;
   private boolean n216TBM23_UPD_CNT ;
   private boolean Gx_longc ;
   private String A208TBM23_USER_ID ;
   private String A407TBM23_STYDY_AUTH_CD ;
   private String A209TBM23_DEL_FLG ;
   private String A211TBM23_CRT_USER_ID ;
   private String A212TBM23_CRT_PROG_NM ;
   private String A214TBM23_UPD_USER_ID ;
   private String A215TBM23_UPD_PROG_NM ;
   private String Z208TBM23_USER_ID ;
   private String Z407TBM23_STYDY_AUTH_CD ;
   private String Z211TBM23_CRT_USER_ID ;
   private String Z214TBM23_UPD_USER_ID ;
   private String Z209TBM23_DEL_FLG ;
   private String Z212TBM23_CRT_PROG_NM ;
   private String Z215TBM23_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T000I6_A407TBM23_STYDY_AUTH_CD ;
   private java.util.Date[] T000I6_A210TBM23_CRT_DATETIME ;
   private boolean[] T000I6_n210TBM23_CRT_DATETIME ;
   private String[] T000I6_A211TBM23_CRT_USER_ID ;
   private boolean[] T000I6_n211TBM23_CRT_USER_ID ;
   private java.util.Date[] T000I6_A213TBM23_UPD_DATETIME ;
   private boolean[] T000I6_n213TBM23_UPD_DATETIME ;
   private String[] T000I6_A214TBM23_UPD_USER_ID ;
   private boolean[] T000I6_n214TBM23_UPD_USER_ID ;
   private long[] T000I6_A216TBM23_UPD_CNT ;
   private boolean[] T000I6_n216TBM23_UPD_CNT ;
   private String[] T000I6_A209TBM23_DEL_FLG ;
   private boolean[] T000I6_n209TBM23_DEL_FLG ;
   private String[] T000I6_A212TBM23_CRT_PROG_NM ;
   private boolean[] T000I6_n212TBM23_CRT_PROG_NM ;
   private String[] T000I6_A215TBM23_UPD_PROG_NM ;
   private boolean[] T000I6_n215TBM23_UPD_PROG_NM ;
   private long[] T000I6_A207TBM23_STUDY_ID ;
   private String[] T000I6_A208TBM23_USER_ID ;
   private long[] T000I4_A207TBM23_STUDY_ID ;
   private String[] T000I5_A208TBM23_USER_ID ;
   private long[] T000I7_A207TBM23_STUDY_ID ;
   private String[] T000I8_A208TBM23_USER_ID ;
   private long[] T000I9_A207TBM23_STUDY_ID ;
   private String[] T000I9_A208TBM23_USER_ID ;
   private String[] T000I9_A407TBM23_STYDY_AUTH_CD ;
   private String[] T000I3_A407TBM23_STYDY_AUTH_CD ;
   private java.util.Date[] T000I3_A210TBM23_CRT_DATETIME ;
   private boolean[] T000I3_n210TBM23_CRT_DATETIME ;
   private String[] T000I3_A211TBM23_CRT_USER_ID ;
   private boolean[] T000I3_n211TBM23_CRT_USER_ID ;
   private java.util.Date[] T000I3_A213TBM23_UPD_DATETIME ;
   private boolean[] T000I3_n213TBM23_UPD_DATETIME ;
   private String[] T000I3_A214TBM23_UPD_USER_ID ;
   private boolean[] T000I3_n214TBM23_UPD_USER_ID ;
   private long[] T000I3_A216TBM23_UPD_CNT ;
   private boolean[] T000I3_n216TBM23_UPD_CNT ;
   private String[] T000I3_A209TBM23_DEL_FLG ;
   private boolean[] T000I3_n209TBM23_DEL_FLG ;
   private String[] T000I3_A212TBM23_CRT_PROG_NM ;
   private boolean[] T000I3_n212TBM23_CRT_PROG_NM ;
   private String[] T000I3_A215TBM23_UPD_PROG_NM ;
   private boolean[] T000I3_n215TBM23_UPD_PROG_NM ;
   private long[] T000I3_A207TBM23_STUDY_ID ;
   private String[] T000I3_A208TBM23_USER_ID ;
   private long[] T000I10_A207TBM23_STUDY_ID ;
   private String[] T000I10_A208TBM23_USER_ID ;
   private String[] T000I10_A407TBM23_STYDY_AUTH_CD ;
   private long[] T000I11_A207TBM23_STUDY_ID ;
   private String[] T000I11_A208TBM23_USER_ID ;
   private String[] T000I11_A407TBM23_STYDY_AUTH_CD ;
   private String[] T000I2_A407TBM23_STYDY_AUTH_CD ;
   private java.util.Date[] T000I2_A210TBM23_CRT_DATETIME ;
   private boolean[] T000I2_n210TBM23_CRT_DATETIME ;
   private String[] T000I2_A211TBM23_CRT_USER_ID ;
   private boolean[] T000I2_n211TBM23_CRT_USER_ID ;
   private java.util.Date[] T000I2_A213TBM23_UPD_DATETIME ;
   private boolean[] T000I2_n213TBM23_UPD_DATETIME ;
   private String[] T000I2_A214TBM23_UPD_USER_ID ;
   private boolean[] T000I2_n214TBM23_UPD_USER_ID ;
   private long[] T000I2_A216TBM23_UPD_CNT ;
   private boolean[] T000I2_n216TBM23_UPD_CNT ;
   private String[] T000I2_A209TBM23_DEL_FLG ;
   private boolean[] T000I2_n209TBM23_DEL_FLG ;
   private String[] T000I2_A212TBM23_CRT_PROG_NM ;
   private boolean[] T000I2_n212TBM23_CRT_PROG_NM ;
   private String[] T000I2_A215TBM23_UPD_PROG_NM ;
   private boolean[] T000I2_n215TBM23_UPD_PROG_NM ;
   private long[] T000I2_A207TBM23_STUDY_ID ;
   private String[] T000I2_A208TBM23_USER_ID ;
   private long[] T000I15_A207TBM23_STUDY_ID ;
   private String[] T000I15_A208TBM23_USER_ID ;
   private String[] T000I15_A407TBM23_STYDY_AUTH_CD ;
   private long[] T000I16_A207TBM23_STUDY_ID ;
   private String[] T000I17_A208TBM23_USER_ID ;
}

final  class tbm23_study_staff__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000I2", "SELECT `TBM23_STYDY_AUTH_CD`, `TBM23_CRT_DATETIME`, `TBM23_CRT_USER_ID`, `TBM23_UPD_DATETIME`, `TBM23_UPD_USER_ID`, `TBM23_UPD_CNT`, `TBM23_DEL_FLG`, `TBM23_CRT_PROG_NM`, `TBM23_UPD_PROG_NM`, `TBM23_STUDY_ID` AS TBM23_STUDY_ID, `TBM23_USER_ID` AS TBM23_USER_ID FROM `TBM23_STUDY_STAFF` WHERE `TBM23_STUDY_ID` = ? AND `TBM23_USER_ID` = ? AND `TBM23_STYDY_AUTH_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I3", "SELECT `TBM23_STYDY_AUTH_CD`, `TBM23_CRT_DATETIME`, `TBM23_CRT_USER_ID`, `TBM23_UPD_DATETIME`, `TBM23_UPD_USER_ID`, `TBM23_UPD_CNT`, `TBM23_DEL_FLG`, `TBM23_CRT_PROG_NM`, `TBM23_UPD_PROG_NM`, `TBM23_STUDY_ID` AS TBM23_STUDY_ID, `TBM23_USER_ID` AS TBM23_USER_ID FROM `TBM23_STUDY_STAFF` WHERE `TBM23_STUDY_ID` = ? AND `TBM23_USER_ID` = ? AND `TBM23_STYDY_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I4", "SELECT `TBM21_STUDY_ID` AS TBM23_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I5", "SELECT `TAM07_USER_ID` AS TBM23_USER_ID FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I6", "SELECT TM1.`TBM23_STYDY_AUTH_CD`, TM1.`TBM23_CRT_DATETIME`, TM1.`TBM23_CRT_USER_ID`, TM1.`TBM23_UPD_DATETIME`, TM1.`TBM23_UPD_USER_ID`, TM1.`TBM23_UPD_CNT`, TM1.`TBM23_DEL_FLG`, TM1.`TBM23_CRT_PROG_NM`, TM1.`TBM23_UPD_PROG_NM`, TM1.`TBM23_STUDY_ID` AS TBM23_STUDY_ID, TM1.`TBM23_USER_ID` AS TBM23_USER_ID FROM `TBM23_STUDY_STAFF` TM1 WHERE TM1.`TBM23_STUDY_ID` = ? and TM1.`TBM23_USER_ID` = ? and TM1.`TBM23_STYDY_AUTH_CD` = ? ORDER BY TM1.`TBM23_STUDY_ID`, TM1.`TBM23_USER_ID`, TM1.`TBM23_STYDY_AUTH_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000I7", "SELECT `TBM21_STUDY_ID` AS TBM23_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I8", "SELECT `TAM07_USER_ID` AS TBM23_USER_ID FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I9", "SELECT `TBM23_STUDY_ID` AS TBM23_STUDY_ID, `TBM23_USER_ID` AS TBM23_USER_ID, `TBM23_STYDY_AUTH_CD` FROM `TBM23_STUDY_STAFF` WHERE `TBM23_STUDY_ID` = ? AND `TBM23_USER_ID` = ? AND `TBM23_STYDY_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I10", "SELECT `TBM23_STUDY_ID` AS TBM23_STUDY_ID, `TBM23_USER_ID` AS TBM23_USER_ID, `TBM23_STYDY_AUTH_CD` FROM `TBM23_STUDY_STAFF` WHERE ( `TBM23_STUDY_ID` > ? or `TBM23_STUDY_ID` = ? and `TBM23_USER_ID` > ? or `TBM23_USER_ID` = ? and `TBM23_STUDY_ID` = ? and `TBM23_STYDY_AUTH_CD` > ?) ORDER BY `TBM23_STUDY_ID`, `TBM23_USER_ID`, `TBM23_STYDY_AUTH_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000I11", "SELECT `TBM23_STUDY_ID` AS TBM23_STUDY_ID, `TBM23_USER_ID` AS TBM23_USER_ID, `TBM23_STYDY_AUTH_CD` FROM `TBM23_STUDY_STAFF` WHERE ( `TBM23_STUDY_ID` < ? or `TBM23_STUDY_ID` = ? and `TBM23_USER_ID` < ? or `TBM23_USER_ID` = ? and `TBM23_STUDY_ID` = ? and `TBM23_STYDY_AUTH_CD` < ?) ORDER BY `TBM23_STUDY_ID` DESC, `TBM23_USER_ID` DESC, `TBM23_STYDY_AUTH_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000I12", "INSERT INTO `TBM23_STUDY_STAFF` (`TBM23_STYDY_AUTH_CD`, `TBM23_CRT_DATETIME`, `TBM23_CRT_USER_ID`, `TBM23_UPD_DATETIME`, `TBM23_UPD_USER_ID`, `TBM23_UPD_CNT`, `TBM23_DEL_FLG`, `TBM23_CRT_PROG_NM`, `TBM23_UPD_PROG_NM`, `TBM23_STUDY_ID`, `TBM23_USER_ID`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000I13", "UPDATE `TBM23_STUDY_STAFF` SET `TBM23_CRT_DATETIME`=?, `TBM23_CRT_USER_ID`=?, `TBM23_UPD_DATETIME`=?, `TBM23_UPD_USER_ID`=?, `TBM23_UPD_CNT`=?, `TBM23_DEL_FLG`=?, `TBM23_CRT_PROG_NM`=?, `TBM23_UPD_PROG_NM`=?  WHERE `TBM23_STUDY_ID` = ? AND `TBM23_USER_ID` = ? AND `TBM23_STYDY_AUTH_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T000I14", "DELETE FROM `TBM23_STUDY_STAFF`  WHERE `TBM23_STUDY_ID` = ? AND `TBM23_USER_ID` = ? AND `TBM23_STYDY_AUTH_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T000I15", "SELECT `TBM23_STUDY_ID` AS TBM23_STUDY_ID, `TBM23_USER_ID` AS TBM23_USER_ID, `TBM23_STYDY_AUTH_CD` FROM `TBM23_STUDY_STAFF` ORDER BY `TBM23_STUDY_ID`, `TBM23_USER_ID`, `TBM23_STYDY_AUTH_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000I16", "SELECT `TBM21_STUDY_ID` AS TBM23_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I17", "SELECT `TAM07_USER_ID` AS TBM23_USER_ID FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(10) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(10) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(10) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               break;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               break;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               break;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               break;
            case 13 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               break;
            case 14 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 128, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 128, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 128, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 128, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               break;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 128, false);
               stmt.setVarchar(4, (String)parms[3], 128, false);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setVarchar(6, (String)parms[5], 2, false);
               break;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 128, false);
               stmt.setVarchar(4, (String)parms[3], 128, false);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setVarchar(6, (String)parms[5], 2, false);
               break;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[2], false);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 128);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[6], false);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[8], 128);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(6, ((Number) parms[10]).longValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 40);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 40);
               }
               stmt.setLong(10, ((Number) parms[17]).longValue());
               stmt.setVarchar(11, (String)parms[18], 128, false);
               break;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 128);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 128);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(5, ((Number) parms[9]).longValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 40);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 40);
               }
               stmt.setLong(9, ((Number) parms[16]).longValue());
               stmt.setVarchar(10, (String)parms[17], 128, false);
               stmt.setVarchar(11, (String)parms[18], 2, false);
               break;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 128, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               break;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               break;
      }
   }

}

