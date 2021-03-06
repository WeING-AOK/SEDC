/*
               File: GxWebStd
        Description: GeneXus Standard Web Functions
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:46:8.37
       Program type: Callable routine
          Main DBMS: mysql
*/

import com.genexus.*;
import com.genexus.internet.*;
import com.genexus.webpanels.*;

public final  class GxWebStd
{
   public static void gx_hidden_field( HttpContext httpContext ,
                                       String sCtrlName ,
                                       String sValue )
   {
      httpContext.ajax_rsp_assign_hidden(sCtrlName, sValue);
   }

   public static void gx_single_line_edit1( HttpContext httpContext ,
                                            String sCtrlName ,
                                            String sValue ,
                                            String sFormatedValue ,
                                            String sTags ,
                                            String sEventName ,
                                            String sLinkURL ,
                                            String sLinkTarget ,
                                            String sTooltipText ,
                                            String sUserOnClickCode ,
                                            int nJScriptCode ,
                                            String sClassString ,
                                            String sStyleString ,
                                            String sROClassString ,
                                            int nVisible ,
                                            int nEnabled ,
                                            int nRTEnabled ,
                                            int nWidth ,
                                            String nWidthUnit ,
                                            int nHeight ,
                                            String nHeightUnit ,
                                            int nLength ,
                                            byte nIsPassword ,
                                            short nFormat ,
                                            int nParentId ,
                                            byte bHasTheme ,
                                            byte nAutoComplete ,
                                            boolean bSendHidden ,
                                            String sCallerPgm )
   {
      gx_single_line_edit( httpContext, sCtrlName, sValue, sFormatedValue, sTags, sEventName, sLinkURL, sLinkTarget, sTooltipText, sUserOnClickCode, nJScriptCode, sClassString, sStyleString, sROClassString, nVisible, nEnabled, nRTEnabled, nWidth, nWidthUnit, nHeight, nHeightUnit, nLength, nIsPassword, nFormat, nParentId, bHasTheme, nAutoComplete, bSendHidden, "", sCallerPgm) ;
   }

   public static void gx_single_line_edit( HttpContext httpContext ,
                                           String sCtrlName ,
                                           String sValue ,
                                           String sFormatedValue ,
                                           String sTags ,
                                           String sEventName ,
                                           String sLinkURL ,
                                           String sLinkTarget ,
                                           String sTooltipText ,
                                           String sUserOnClickCode ,
                                           int nJScriptCode ,
                                           String sClassString ,
                                           String sStyleString ,
                                           String sROClassString ,
                                           int nVisible ,
                                           int nEnabled ,
                                           int nRTEnabled ,
                                           int nWidth ,
                                           String nWidthUnit ,
                                           int nHeight ,
                                           String nHeightUnit ,
                                           int nLength ,
                                           byte nIsPassword ,
                                           short nFormat ,
                                           int nParentId ,
                                           byte bHasTheme ,
                                           byte nAutoComplete ,
                                           boolean bSendHidden ,
                                           String sAlign ,
                                           String sCallerPgm )
   {
      String sOStyle ;
      String sEventJsCode ;
      String ClassHTML ;
      String sSize ;
      sEventJsCode = "" ;
      sSize = "" ;
      if ( httpContext.getWrapped( ) )
      {
         sFormatedValue = sValue ;
      }
      if ( nWidth > 0 )
      {
         if ( GXutil.strcmp(nWidthUnit, "chr") == 0 )
         {
            sSize = " size=\"" + nWidth + "\"" ;
         }
         else
         {
            sStyleString = sStyleString + ";width: " + GXutil.ltrim( GXutil.str( nWidth, 10, 0)+nWidthUnit) + ";" ;
         }
      }
      if ( ( nHeight > 0 ) && ( GXutil.strcmp(nWidthUnit, "row") != 0 ) )
      {
         sStyleString = sStyleString + ";height: " + GXutil.ltrim( GXutil.str( nHeight, 10, 0)+nHeightUnit) + ";" ;
      }
      sOStyle = sStyleString ;
      sStyleString = sStyleString + ((nVisible==0)||((nEnabled==0)&&(nRTEnabled==1)) ? ";display:none;" : "") ;
      if ( ( nRTEnabled != 0 ) || ( nEnabled != 0 ) )
      {
         /* Control allows input */
         httpContext.writeText( "<input type=") ;
         if ( nIsPassword != 0 )
         {
            httpContext.writeText( "\"password\"") ;
         }
         else
         {
            httpContext.writeText( "\"text\"") ;
         }
         httpContext.writeText( " id=\"") ;
         httpContext.writeText( sCtrlName) ;
         httpContext.writeText( "\"") ;
         httpContext.writeText( " name=\"") ;
         httpContext.writeText( sCtrlName) ;
         httpContext.writeText( "\"") ;
         httpContext.writeText( " value=\"") ;
         httpContext.writeValue( sFormatedValue) ;
         httpContext.writeText( "\"") ;
         httpContext.writeText( sSize) ;
         if ( ! (GXutil.strcmp("", sTooltipText)==0) )
         {
            httpContext.writeText( " title=\"") ;
            httpContext.writeText( sTooltipText) ;
            httpContext.writeText( "\"") ;
         }
         httpContext.writeText( " maxlength=\"") ;
         httpContext.writeText( GXutil.formatLong( nLength)) ;
         httpContext.writeText( "\"") ;
         GxWebStd.classAttribute( httpContext, sClassString);
         if ( ! (GXutil.strcmp("", sAlign)==0) )
         {
            GxWebStd.styleAttribute( httpContext, sStyleString+"text-align:"+sAlign);
         }
         else
         {
            GxWebStd.styleAttribute( httpContext, sStyleString);
         }
         httpContext.writeText( sTags) ;
         httpContext.writeText( httpContext.htmlEndTag( HTMLElement.INPUT)) ;
         if ( nAutoComplete == 0 )
         {
            GxWebStd.gx_ctrl_attribute( httpContext, sCtrlName, "autocomplete", "off", false);
         }
      }
      if ( nEnabled == 0 )
      {
         /* Control is read only */
         if ( ( nRTEnabled == 0 ) && bSendHidden )
         {
            GxWebStd.gx_hidden_field( httpContext, sCtrlName, sValue);
         }
         if ( bHasTheme == 0 )
         {
            ClassHTML = sClassString ;
         }
         else
         {
            if ( nParentId == 0 )
            {
               if ( ( GXutil.len( sClassString) != 0 ) && ( GXutil.strSearch( sClassString, "Readonly", 1) != 1 ) )
               {
                  ClassHTML = "Readonly" + sClassString ;
               }
               else
               {
                  ClassHTML = sClassString ;
               }
            }
            else
            {
               if ( ( GXutil.len( sROClassString) != 0 ) && ( GXutil.strSearch( sROClassString, "Readonly", 1) != 1 ) )
               {
                  ClassHTML = "Readonly" + sROClassString ;
               }
               else
               {
                  ClassHTML = sROClassString ;
               }
            }
         }
         if ( nFormat != 2 )
         {
            sOStyle = sOStyle + ((nVisible==0) ? ";display:none;" : "") ;
            httpContext.writeText( "<span") ;
            GxWebStd.classAttribute( httpContext, ClassHTML);
            GxWebStd.styleAttribute( httpContext, sOStyle);
            httpContext.writeText( ((GXutil.len( sTooltipText)>0) ? " title=\""+sTooltipText+"\"" : "")+" id=\"span_"+sCtrlName+"\"") ;
            httpContext.writeText( ">") ;
            /* Initialize internal JScript code according to EventNo */
            if ( nJScriptCode == 1 )
            {
               sEventJsCode = "gx.fn.closeWindow();" ;
            }
            else if ( nJScriptCode == 2 )
            {
               sEventJsCode = "ClearForm( this.form);" ;
            }
            else if ( nJScriptCode == 3 )
            {
               sEventJsCode = "gx.util.help(" + "'" + httpContext.convertURL( "Help/"+"Japanese/"+GXutil.lower( sCallerPgm)) + "');" ;
            }
            else if ( nJScriptCode == 7 )
            {
               sEventJsCode = "" + "gx.evt.execCliEvt(" + sEventName + ",this);" ;
            }
            else if ( nJScriptCode == 6 )
            {
               sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
            }
            else if ( nJScriptCode == 5 )
            {
               sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
            }
            else if ( nJScriptCode == 0 )
            {
               sEventJsCode = "" ;
            }
            else
            {
               sEventJsCode = "" ;
            }
            GxWebStd.gx_start_js_anchor( httpContext, sEventJsCode, sUserOnClickCode, sLinkURL, sLinkTarget);
         }
         if ( nIsPassword == 0 )
         {
            if ( nFormat == 0 )
            {
               /* Text */
               httpContext.writeValue( sFormatedValue) ;
            }
            else
            {
               if ( nFormat == 3 )
               {
                  /* Text with meaningful spaces */
                  httpContext.writeValueSpace( sFormatedValue) ;
               }
               else
               {
                  httpContext.writeText( sFormatedValue) ;
               }
            }
         }
         else
         {
            httpContext.writeValue( GXutil.padr( "", nLength, "*")) ;
         }
         if ( nFormat != 2 )
         {
            GxWebStd.gx_end_js_anchor( httpContext, sEventJsCode, sUserOnClickCode, sLinkURL);
            httpContext.writeText( "</span>") ;
         }
      }
   }

   public static void gx_link_start( HttpContext httpContext ,
                                     String sLinkURL ,
                                     String sTargetWnd )
   {
      if ( GXutil.strcmp("", GXutil.rtrim( sLinkURL)) != 0 )
      {
         httpContext.writeText( "<a href=\"") ;
         httpContext.writeText( GXutil.rtrim( sLinkURL)) ;
         httpContext.writeText( "\"") ;
         if ( GXutil.strcmp("", GXutil.rtrim( sTargetWnd)) != 0 )
         {
            httpContext.writeText( " target=\"") ;
            httpContext.writeText( GXutil.rtrim( sTargetWnd)) ;
            httpContext.writeText( "\"") ;
         }
         httpContext.writeText( ">") ;
      }
   }

   public static void gx_link_end( HttpContext httpContext ,
                                   String sLinkURL )
   {
      if ( GXutil.strcmp("", GXutil.rtrim( sLinkURL)) != 0 )
      {
         httpContext.writeText( "</a>") ;
      }
   }

   public static void gx_blob_field( HttpContext httpContext ,
                                     String sInternalName ,
                                     String sValue ,
                                     String sURL ,
                                     String sContenttype ,
                                     boolean bHasFiletypeatt ,
                                     String sLinktarget ,
                                     String sObjecttagparameters ,
                                     int nDisplay ,
                                     int nEnabled ,
                                     int nVisible ,
                                     String sAlternateText ,
                                     String sTooltipText ,
                                     int nBorderWidth ,
                                     int nAutoresize ,
                                     int nWidth ,
                                     String nWidthUnit ,
                                     int nHeight ,
                                     String nHeightUnit ,
                                     int nVerticalSpace ,
                                     int nHorizontalSpace ,
                                     int nJScriptCode ,
                                     String sUserOnClickCode ,
                                     String sEventName ,
                                     String sStyleString ,
                                     String sClassString ,
                                     String sTags ,
                                     String sJsDynCode ,
                                     String sCallerPgm )
   {
      String sEventJsCode ;
      String ClassHTML ;
      sEventJsCode = "" ;
      sStyleString = sStyleString + ((nVisible!=0) ? "" : ";display:none;") ;
      if ( nEnabled != 0 )
      {
         /* Initialize internal JScript code according to EventNo */
         if ( nJScriptCode == 4 )
         {
            sEventJsCode = sJsDynCode ;
         }
         else if ( nJScriptCode == 1 )
         {
            sEventJsCode = "gx.fn.closeWindow();" + "return false;" ;
         }
         else if ( nJScriptCode == 2 )
         {
            sEventJsCode = "ClearForm( this.form);" + "return false;" ;
         }
         else if ( nJScriptCode == 3 )
         {
            sEventJsCode = "gx.util.help(" + "'" + httpContext.convertURL( "Help/"+"Japanese/"+GXutil.lower( sCallerPgm)) + "');" + "return false;" ;
         }
         else if ( nJScriptCode == 7 )
         {
            sEventJsCode = "" + "gx.evt.execCliEvt(" + sEventName + ",this);" ;
         }
         else if ( nJScriptCode == 6 )
         {
            sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
         }
         else if ( nJScriptCode == 5 )
         {
            sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
         }
         else if ( nJScriptCode == 0 )
         {
            sEventJsCode = "" ;
         }
         else
         {
            sEventJsCode = "" ;
         }
      }
      httpContext.writeText( "<span ") ;
      if ( ! (0==nVerticalSpace) )
      {
         httpContext.writeText( " vspace=\"") ;
         httpContext.writeText( GXutil.ltrim( GXutil.str( nVerticalSpace, 10, 0))) ;
         httpContext.writeText( "\"") ;
      }
      if ( ! (0==nHorizontalSpace) )
      {
         httpContext.writeText( " hspace=\"") ;
         httpContext.writeText( GXutil.ltrim( GXutil.str( nHorizontalSpace, 10, 0))) ;
         httpContext.writeText( "\"") ;
      }
      if ( ! (GXutil.strcmp("", sAlternateText)==0) )
      {
         httpContext.writeText( " alt=\"") ;
         httpContext.writeText( sAlternateText) ;
         httpContext.writeText( "\"") ;
      }
      if ( ! (GXutil.strcmp("", sTooltipText)==0) )
      {
         httpContext.writeText( " title=\"") ;
         httpContext.writeText( sTooltipText) ;
         httpContext.writeText( "\"") ;
      }
      httpContext.writeText( httpContext.htmlEndTag( HTMLElement.SPAN)) ;
      httpContext.writeText( "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\"><tr><td>") ;
      if ( nDisplay == 0 )
      {
         if ( httpContext.checkContentType( "image", sContenttype, sURL) )
         {
            httpContext.writeText( "<img alt=\"\" ") ;
            httpContext.writeText( "src=\"") ;
            if ( (GXutil.strcmp("", sURL)==0) )
            {
               sURL = httpContext.convertURL( "blank.jpg") ;
            }
         }
         else
         {
            httpContext.writeText( "<object ") ;
            httpContext.writeText( "type=\"") ;
            httpContext.writeText( com.genexus.internet.HttpResponse.getContentType(sContenttype)) ;
            httpContext.writeText( "\" data=\"") ;
            if ( (GXutil.strcmp("", sURL)==0) )
            {
               sURL = "about:blank" ;
            }
         }
         httpContext.writeText( sURL) ;
         httpContext.writeText( "\" id=\"Object_") ;
         httpContext.writeText( sInternalName) ;
         httpContext.writeText( "\" style=\"display:block;") ;
         if ( ! (0==nWidth) && ( ( nAutoresize == 0 ) ) )
         {
            httpContext.writeText( " width:") ;
            httpContext.writeText( GXutil.ltrim( GXutil.str( nWidth, 10, 0))) ;
            httpContext.writeText( nWidthUnit+";") ;
         }
         if ( ! (0==nHeight) && ( ( nAutoresize == 0 ) ) )
         {
            httpContext.writeText( " height:") ;
            httpContext.writeText( GXutil.ltrim( GXutil.str( nHeight, 10, 0))) ;
            httpContext.writeText( nHeightUnit+";") ;
         }
         httpContext.writeText( sStyleString) ;
         if ( GXutil.len( sClassString) != 0 )
         {
            ClassHTML = "BlobContent" + sClassString ;
         }
         else
         {
            ClassHTML = sClassString ;
         }
         if ( ( nEnabled == 0 ) && ( GXutil.len( sClassString) != 0 ) && ( GXutil.strSearch( sClassString, "Readonly", 1) != 1 ) )
         {
            ClassHTML = "Readonly" + ClassHTML ;
         }
         httpContext.writeText( "\" ") ;
         GxWebStd.classAttribute( httpContext, ClassHTML);
         httpContext.writeText( sTags) ;
         if ( httpContext.checkContentType( "image", sContenttype, sURL) )
         {
            httpContext.writeText( httpContext.htmlEndTag( HTMLElement.IMG)) ;
         }
         else
         {
            httpContext.writeText( ">") ;
            httpContext.writeText( sObjecttagparameters) ;
            httpContext.writeText( "</object>") ;
         }
      }
      else
      {
         if ( nDisplay == 1 )
         {
            httpContext.writeText( "<a id=\"Link_") ;
            httpContext.writeText( sInternalName) ;
            httpContext.writeText( "\"") ;
            if ( GXutil.strcmp(sURL, "") != 0 )
            {
               GxWebStd.styleAttribute( httpContext, "display:block;"+sStyleString);
            }
            else
            {
               GxWebStd.styleAttribute( httpContext, "display:none;"+sStyleString);
            }
            httpContext.writeText( "href=\"") ;
            httpContext.writeText( sURL) ;
            httpContext.writeText( "\" type=\"") ;
            httpContext.writeText( sContenttype) ;
            httpContext.writeText( "\"") ;
            if ( GXutil.len( sLinktarget) > 0 )
            {
               httpContext.writeText( " target=\"") ;
               httpContext.writeText( GXutil.rtrim( sLinktarget)) ;
               httpContext.writeText( "\"") ;
            }
            httpContext.writeText( "><img border=\"0\" src=\"") ;
            httpContext.writeText( httpContext.convertURL( "download.gif")) ;
            httpContext.writeText( "\" alt=\"Download\""+httpContext.htmlEndTag( HTMLElement.IMG)) ;
            httpContext.writeText( "</a>") ;
         }
      }
      httpContext.writeText( "</td></tr><tr><td>") ;
      if ( nEnabled == 1 )
      {
         httpContext.writeText( "<script type=\"text/javascript\">document.forms[0].encoding=\"multipart/form-data\";</script>") ;
         httpContext.writeText( "<input type=\"file\" ") ;
         httpContext.writeText( " id=\"") ;
         httpContext.writeText( sInternalName) ;
         httpContext.writeText( "\"") ;
         httpContext.writeText( " name=\"") ;
         httpContext.writeText( sInternalName) ;
         httpContext.writeText( "\"") ;
         sStyleString = "" ;
         if ( nVisible == 0 )
         {
            sStyleString = "display:none;" ;
         }
         if ( ! (0==nWidth) )
         {
            sStyleString = sStyleString + " width:" + GXutil.ltrim( GXutil.str( nWidth, 10, 0)) + ";" ;
         }
         GxWebStd.styleAttribute( httpContext, sStyleString);
         httpContext.writeText( " value=\"") ;
         httpContext.writeValue( sValue) ;
         httpContext.writeText( "\" ") ;
         if ( GXutil.len( sClassString) != 0 )
         {
            ClassHTML = "BlobInput" + sClassString ;
         }
         else
         {
            ClassHTML = sClassString ;
         }
         if ( ( nEnabled == 0 ) && ( GXutil.len( sClassString) != 0 ) && ( GXutil.strSearch( sClassString, "Readonly", 1) != 1 ) )
         {
            ClassHTML = "Readonly" + ClassHTML ;
         }
         GxWebStd.classAttribute( httpContext, ClassHTML);
         httpContext.writeText( sTags) ;
         httpContext.writeText( httpContext.htmlEndTag( HTMLElement.INPUT)) ;
      }
      httpContext.writeText( "</td></tr></table>") ;
      httpContext.writeText( "</span>") ;
   }

   public static void gx_button_ctrl( HttpContext httpContext ,
                                      String sCtrlName ,
                                      String sJsCode ,
                                      String sCaption ,
                                      String sUserOnClickCode ,
                                      int nJScriptCode ,
                                      String sTooltipText ,
                                      String sAccesskey ,
                                      String sStyleString ,
                                      String sClassString ,
                                      int nVisible ,
                                      int nEnabled ,
                                      String sBorderStyle ,
                                      String sEventName ,
                                      String sTags ,
                                      String sJsDynCode ,
                                      int nReset ,
                                      String sCallerPgm )
   {
      String sEventJsCode ;
      String sCapAKey ;
      String sClassRoundedBtn ;
      sStyleString = sStyleString + ((nVisible!=0) ? "" : ";display:none;") ;
      sClassRoundedBtn = "BaseRBtn " + "R" + sClassString ;
      if ( GXutil.strcmp(sBorderStyle, "rounded") == 0 )
      {
         sClassString = "BtnText" ;
         httpContext.writeText( "<span onclick=\"gx.evt.doClick(") ;
         httpContext.writeText( "'") ;
         httpContext.writeText( sCtrlName) ;
         httpContext.writeText( "', event") ;
         httpContext.writeText( ")\" ") ;
         GxWebStd.styleAttribute( httpContext, sStyleString);
         GxWebStd.classAttribute( httpContext, sClassRoundedBtn);
         httpContext.writeText( "><span class=\"BtnLeft\"><span class=\"BtnRight\"><span class=\"BtnBackground\">") ;
      }
      httpContext.writeText( "<input type=") ;
      if ( nReset == 1 )
      {
         httpContext.writeText( "\"submit\"") ;
      }
      else if ( nReset == 0 )
      {
         httpContext.writeText( "\"reset\"") ;
      }
      else
      {
         httpContext.writeText( "\"button\"") ;
      }
      sCapAKey = GXutil.accessKey( sCaption) ;
      sCaption = GXutil.accessKeyCaption( sCaption) ;
      if ( (GXutil.strcmp("", sCapAKey)==0) )
      {
         sCapAKey = GXutil.accessKey( sTooltipText) ;
         sTooltipText = GXutil.accessKeyCaption( sTooltipText) ;
      }
      if ( ! (GXutil.strcmp("", sCapAKey)==0) )
      {
         sAccesskey = sCapAKey ;
      }
      httpContext.writeText( " name=\"") ;
      httpContext.writeText( sCtrlName) ;
      httpContext.writeText( "\"") ;
      httpContext.writeText( " value=\"") ;
      httpContext.writeText( sCaption) ;
      httpContext.writeText( "\"") ;
      if ( ! (GXutil.strcmp("", sTooltipText)==0) )
      {
         httpContext.writeText( " title=\"") ;
         httpContext.writeText( sTooltipText) ;
         httpContext.writeText( "\"") ;
      }
      if ( GXutil.len( sAccesskey) != 0 )
      {
         httpContext.writeText( " accesskey=\"") ;
         httpContext.writeText( sAccesskey) ;
         httpContext.writeText( "\"") ;
      }
      GxWebStd.classAttribute( httpContext, sClassString);
      GxWebStd.styleAttribute( httpContext, sStyleString);
      if ( nEnabled == 0 )
      {
         httpContext.writeText( " disabled=\"disabled\"") ;
      }
      /* Initialize internal JScript code according to EventNo */
      if ( nJScriptCode == 4 )
      {
         sEventJsCode = sJsDynCode ;
      }
      else if ( nJScriptCode == 1 )
      {
         sEventJsCode = "gx.fn.closeWindow();" + "return false;" ;
      }
      else if ( nJScriptCode == 2 )
      {
         sEventJsCode = "ClearForm( this.form);" + "return false;" ;
      }
      else if ( nJScriptCode == 3 )
      {
         sEventJsCode = "gx.util.help(" + "'" + httpContext.convertURL( "Help/"+"Japanese/"+GXutil.lower( sCallerPgm)) + "');" + "return false;" ;
      }
      else if ( nJScriptCode == 7 )
      {
         sEventJsCode = "gx.evt.checkCtrlFocus(this);" + "gx.evt.execCliEvt(" + sEventName + ",this);" ;
      }
      else if ( nJScriptCode == 6 )
      {
         sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
      }
      else if ( nJScriptCode == 5 )
      {
         sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
      }
      else if ( nJScriptCode == 0 )
      {
         sEventJsCode = "" ;
      }
      else
      {
         sEventJsCode = "" ;
      }
      sEventJsCode = sJsCode + sEventJsCode ;
      GxWebStd.gx_on_js_event( httpContext, "onclick", sEventJsCode);
      httpContext.writeText( " ") ;
      httpContext.writeText( sTags) ;
      httpContext.writeText( httpContext.htmlEndTag( HTMLElement.INPUT)) ;
      GxWebStd.gx_ctrl_attribute( httpContext, sCtrlName, "jsevent", sUserOnClickCode, false);
      if ( GXutil.strcmp(sBorderStyle, "rounded") == 0 )
      {
         httpContext.writeText( "</span></span></span></span>") ;
      }
   }

   public static void gx_on_js_event( HttpContext httpContext ,
                                      String sEventName ,
                                      String sEventJsCode )
   {
      httpContext.writeText( " ") ;
      httpContext.writeText( sEventName) ;
      httpContext.writeText( "=\"if( ") ;
      if ( ! (GXutil.strcmp("", sEventJsCode)==0) )
      {
         httpContext.writeText( "gx.evt.jsEvent(this)") ;
         httpContext.writeText( ") {") ;
         httpContext.writeText( sEventJsCode) ;
         httpContext.writeText( "} else return false;\"") ;
      }
      else
      {
         httpContext.writeText( "!(") ;
         httpContext.writeText( "gx.evt.jsEvent(this)") ;
         httpContext.writeText( ")) return false;\"") ;
      }
   }

   public static void gx_ctrl_attribute( HttpContext httpContext ,
                                         String sControlName ,
                                         String sAttName ,
                                         String sAttValue ,
                                         boolean bCustomEvent )
   {
      if ( bCustomEvent )
      {
         httpContext.writeText( "<script type=\"text/javascript\">gx.dom.setAttribute(\"") ;
         httpContext.writeText( sControlName) ;
         httpContext.writeText( "\",\"") ;
         httpContext.writeText( sAttName) ;
         httpContext.writeText( "\",\"if(") ;
         if ( ! (GXutil.strcmp("", sAttValue)==0) )
         {
            httpContext.writeText( "gx.evt.jsEvent(this)") ;
            httpContext.writeText( ") {") ;
            httpContext.writeText( sAttValue) ;
            httpContext.writeText( "} else return false;\"") ;
         }
         else
         {
            httpContext.writeText( "!(") ;
            httpContext.writeText( "gx.evt.jsEvent(this)") ;
            httpContext.writeText( ")) return false;\"") ;
         }
         httpContext.writeText( ");</script>") ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", sAttValue)==0) )
         {
            httpContext.writeText( "<script type=\"text/javascript\">gx.dom.setAttribute(\"") ;
            httpContext.writeText( sControlName) ;
            httpContext.writeText( "\",\"") ;
            httpContext.writeText( sAttName) ;
            httpContext.writeText( "\",\"") ;
            httpContext.writeText( sAttValue) ;
            httpContext.writeText( "\");</script>") ;
         }
      }
   }

   public static void gx_msg_list( HttpContext httpContext ,
                                   String sCtrlName ,
                                   int nDisplayMode ,
                                   String sStyleString ,
                                   String sClassString ,
                                   String sCmpCtx ,
                                   String sInMaster )
   {
      int i ;
      httpContext.writeText( "<div>") ;
      sClassString = sClassString + " gx_ev" ;
      if ( nDisplayMode == 1 )
      {
         sClassString = sClassString + " ErrorViewerBullet" ;
      }
      httpContext.writeText( "<span") ;
      GxWebStd.classAttribute( httpContext, sClassString);
      GxWebStd.styleAttribute( httpContext, sStyleString);
      httpContext.writeText( " id=\""+sCmpCtx+"gxErrorViewer\"") ;
      httpContext.writeText( ">") ;
      i = 1 ;
      while ( i <= httpContext.GX_msglist.getItemCount() )
      {
         httpContext.writeText( "<div>") ;
         httpContext.writeText( WebUtils.htmlEncode( httpContext.GX_msglist.getItemText((short)(i)))) ;
         httpContext.writeText( "</div>") ;
         i = (int)(i+1) ;
      }
      httpContext.writeText( "</span>") ;
      httpContext.writeText( "</div>") ;
   }

   public static void gx_combobox_ctrl( HttpContext httpContext ,
                                        com.genexus.webpanels.HTMLChoice CObjCtrl ,
                                        String sCtrlName ,
                                        String sValue ,
                                        int nRows ,
                                        String sUserOnClickCode ,
                                        int nJScriptCode ,
                                        String sEventName ,
                                        String sType ,
                                        String sTooltipText ,
                                        int nVisible ,
                                        int nEnabled ,
                                        int nRTEnabled ,
                                        short nFormat ,
                                        int nWidth ,
                                        String nWidthUnit ,
                                        int nHeight ,
                                        String nHeightUnit ,
                                        String sStyleString ,
                                        String sClassString ,
                                        String sTags ,
                                        String sFormatedValue ,
                                        String sCallerPgm )
   {
      gx_combobox_ctrl1( httpContext, CObjCtrl, sCtrlName, sValue, nRows, sUserOnClickCode, nJScriptCode, sEventName, sType, sTooltipText, nVisible, nEnabled, nRTEnabled, nFormat, nWidth, nWidthUnit, nHeight, nHeightUnit, sStyleString, sClassString, sTags, sFormatedValue, true, sCallerPgm) ;
   }

   public static void gx_combobox_ctrl1( HttpContext httpContext ,
                                         com.genexus.webpanels.HTMLChoice CObjCtrl ,
                                         String sCtrlName ,
                                         String sValue ,
                                         int nRows ,
                                         String sUserOnClickCode ,
                                         int nJScriptCode ,
                                         String sEventName ,
                                         String sType ,
                                         String sTooltipText ,
                                         int nVisible ,
                                         int nEnabled ,
                                         int nRTEnabled ,
                                         short nFormat ,
                                         int nWidth ,
                                         String nWidthUnit ,
                                         int nHeight ,
                                         String nHeightUnit ,
                                         String sStyleString ,
                                         String sClassString ,
                                         String sTags ,
                                         String sFormatedValue ,
                                         boolean bSendHidden ,
                                         String sCallerPgm )
   {
      String sOStyle ;
      String sEventJsCode ;
      int idxLst ;
      String ClassHTML ;
      idxLst = 1 ;
      if ( nWidth > 0 )
      {
         sStyleString = sStyleString + ";width: " + GXutil.ltrim( GXutil.str( nWidth, 10, 0)+nWidthUnit) ;
      }
      if ( nHeight > 0 )
      {
         sStyleString = sStyleString + ";height: " + GXutil.ltrim( GXutil.str( nHeight, 10, 0)+nHeightUnit) ;
      }
      sOStyle = sStyleString + " ;overflow:hidden;" ;
      sStyleString = sStyleString + ((nVisible==0)||(nEnabled==0)&&(nRTEnabled!=0) ? ";display:none;" : "") ;
      if ( ( nEnabled != 0 ) || ( nRTEnabled != 0 ) )
      {
         /* Initialize internal JScript code according to EventNo */
         if ( nJScriptCode == 1 )
         {
            sEventJsCode = "gx.fn.closeWindow();" + "return false;" ;
         }
         else if ( nJScriptCode == 2 )
         {
            sEventJsCode = "ClearForm( this.form);" + "return false;" ;
         }
         else if ( nJScriptCode == 3 )
         {
            sEventJsCode = "gx.util.help(" + "'" + httpContext.convertURL( "Help/"+"Japanese/"+GXutil.lower( sCallerPgm)) + "');" + "return false;" ;
         }
         else if ( nJScriptCode == 7 )
         {
            sEventJsCode = "" + "gx.evt.execCliEvt(" + sEventName + ",this);" ;
         }
         else if ( nJScriptCode == 6 )
         {
            sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
         }
         else if ( nJScriptCode == 5 )
         {
            sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
         }
         else if ( nJScriptCode == 0 )
         {
            sEventJsCode = "" ;
         }
         else
         {
            sEventJsCode = "" ;
         }
         httpContext.writeText( "<select") ;
         if ( nRows > 1 )
         {
            httpContext.writeText( " size=") ;
            httpContext.writeText( GXutil.ltrim( GXutil.formatLong( nRows))) ;
         }
         httpContext.writeText( " id=\"") ;
         httpContext.writeText( sCtrlName+"\"") ;
         httpContext.writeText( " name=\"") ;
         httpContext.writeText( sCtrlName+"\"") ;
         if ( ! (GXutil.strcmp("", sTooltipText)==0) )
         {
            httpContext.writeText( " title=\"") ;
            httpContext.writeText( sTooltipText) ;
            httpContext.writeText( "\"") ;
         }
         GxWebStd.classAttribute( httpContext, sClassString);
         GxWebStd.styleAttribute( httpContext, sStyleString);
         httpContext.writeText( sTags) ;
         httpContext.writeTextNL( ">") ;
         while ( idxLst <= CObjCtrl.getItemCount() )
         {
            if ( GXutil.strcmp(sType, "int") == 0 )
            {
               httpContext.writeText( "<option value=\""+GXutil.alltrim( CObjCtrl.getItemValue((short)(idxLst)))) ;
            }
            else
            {
               httpContext.writeText( "<option value=\""+GXutil.rtrim( CObjCtrl.getItemValue((short)(idxLst)))) ;
            }
            if ( GXutil.strcmp(GXutil.ltrim( CObjCtrl.getItemValue((short)(idxLst))), GXutil.ltrim( sValue)) == 0 )
            {
               httpContext.writeText( "\" selected=\"selected\" >") ;
            }
            else
            {
               httpContext.writeText( "\">") ;
            }
            if ( nFormat == 0 )
            {
               httpContext.writeValue( CObjCtrl.getItemText((short)(idxLst))) ;
            }
            else
            {
               if ( nFormat == 3 )
               {
                  httpContext.writeValueSpace( CObjCtrl.getItemText((short)(idxLst))) ;
               }
               else
               {
                  httpContext.writeText( CObjCtrl.getItemText((short)(idxLst))) ;
               }
            }
            httpContext.writeText( httpContext.htmlEndTag( HTMLElement.OPTION)) ;
            idxLst = (int)(idxLst+1) ;
         }
         httpContext.writeTextNL( "</select>") ;
         GxWebStd.gx_ctrl_attribute( httpContext, sCtrlName, "jsevent", sUserOnClickCode, false);
         GxWebStd.gx_ctrl_attribute( httpContext, sCtrlName, "gxoch0", sEventJsCode, true);
      }
      if ( nEnabled == 0 )
      {
         if ( ( nRTEnabled == 0 ) && bSendHidden )
         {
            GxWebStd.gx_hidden_field( httpContext, sCtrlName, sValue);
         }
         if ( ( GXutil.len( sClassString) != 0 ) && ( GXutil.strSearch( sClassString, "Readonly", 1) != 1 ) )
         {
            ClassHTML = "Readonly" + sClassString ;
         }
         else
         {
            ClassHTML = sClassString ;
         }
         sOStyle = sOStyle + ((nVisible==0) ? ";display:none;" : "") ;
         idxLst = 1 ;
         httpContext.writeText( "<span") ;
         GxWebStd.classAttribute( httpContext, ClassHTML);
         GxWebStd.styleAttribute( httpContext, sOStyle);
         httpContext.writeText( sTags+((GXutil.len( sTooltipText)>0) ? " title=\""+sTooltipText+"\"" : "")+" id=\"span_"+sCtrlName+"\"") ;
         httpContext.writeText( ">") ;
         while ( idxLst <= CObjCtrl.getItemCount() )
         {
            if ( GXutil.strcmp(GXutil.ltrim( CObjCtrl.getItemValue((short)(idxLst))), GXutil.ltrim( sValue)) == 0 )
            {
               if ( nFormat == 0 )
               {
                  httpContext.writeValue( CObjCtrl.getItemText((short)(idxLst))) ;
               }
               else
               {
                  if ( nFormat == 3 )
                  {
                     httpContext.writeValueSpace( CObjCtrl.getItemText((short)(idxLst))) ;
                  }
                  else
                  {
                     httpContext.writeText( CObjCtrl.getItemText((short)(idxLst))) ;
                  }
               }
               if (true) break;
            }
            idxLst = (int)(idxLst+1) ;
         }
         httpContext.writeText( "</span>") ;
         if ( nEnabled == 0 )
         {
            httpContext.writeText( "<script type=\"text/javascript\">gx.fn.disableCtrl(\""+sCtrlName+"\");</script>") ;
         }
      }
   }

   public static void gx_listbox_ctrl( HttpContext httpContext ,
                                       com.genexus.webpanels.HTMLChoice LObjCtrl ,
                                       String sCtrlName ,
                                       String sValue ,
                                       int nRows ,
                                       String sUserOnClickCode ,
                                       int nJScriptCode ,
                                       String sEventName ,
                                       String sType ,
                                       String sTooltipText ,
                                       int nVisible ,
                                       int nEnabled ,
                                       int nRTEnabled ,
                                       short nFormat ,
                                       int nWidth ,
                                       String nWidthUnit ,
                                       int nHeight ,
                                       String nHeightUnit ,
                                       String sStyleString ,
                                       String sClassString ,
                                       String sTags ,
                                       String sFormatedValue ,
                                       String sCallerPgm )
   {
      gx_listbox_ctrl1( httpContext, LObjCtrl, sCtrlName, sValue, nRows, sUserOnClickCode, nJScriptCode, sEventName, sType, sTooltipText, nVisible, nEnabled, nRTEnabled, nFormat, nWidth, nWidthUnit, nHeight, nHeightUnit, sStyleString, sClassString, sTags, sFormatedValue, true, sCallerPgm) ;
   }

   public static void gx_listbox_ctrl1( HttpContext httpContext ,
                                        com.genexus.webpanels.HTMLChoice LObjCtrl ,
                                        String sCtrlName ,
                                        String sValue ,
                                        int nRows ,
                                        String sUserOnClickCode ,
                                        int nJScriptCode ,
                                        String sEventName ,
                                        String sType ,
                                        String sTooltipText ,
                                        int nVisible ,
                                        int nEnabled ,
                                        int nRTEnabled ,
                                        short nFormat ,
                                        int nWidth ,
                                        String nWidthUnit ,
                                        int nHeight ,
                                        String nHeightUnit ,
                                        String sStyleString ,
                                        String sClassString ,
                                        String sTags ,
                                        String sFormatedValue ,
                                        boolean bSendHidden ,
                                        String sCallerPgm )
   {
      String sOStyle ;
      String sEventJsCode ;
      int idxLst ;
      String ClassHTML ;
      idxLst = 1 ;
      if ( nWidth > 0 )
      {
         sStyleString = sStyleString + ";width: " + GXutil.ltrim( GXutil.str( nWidth, 10, 0)+nWidthUnit) ;
      }
      if ( nHeight > 0 )
      {
         sStyleString = sStyleString + ";height: " + GXutil.ltrim( GXutil.str( nHeight, 10, 0)+nHeightUnit) ;
      }
      sOStyle = sStyleString + " ;overflow:hidden;" ;
      sStyleString = sStyleString + ((nVisible==0)||(nEnabled==0)&&(nRTEnabled!=0) ? ";display:none;" : "") ;
      if ( ( nEnabled != 0 ) || ( nRTEnabled != 0 ) )
      {
         /* Initialize internal JScript code according to EventNo */
         if ( nJScriptCode == 1 )
         {
            sEventJsCode = "gx.fn.closeWindow();" + "return false;" ;
         }
         else if ( nJScriptCode == 2 )
         {
            sEventJsCode = "ClearForm( this.form);" + "return false;" ;
         }
         else if ( nJScriptCode == 3 )
         {
            sEventJsCode = "gx.util.help(" + "'" + httpContext.convertURL( "Help/"+"Japanese/"+GXutil.lower( sCallerPgm)) + "');" + "return false;" ;
         }
         else if ( nJScriptCode == 7 )
         {
            sEventJsCode = "" + "gx.evt.execCliEvt(" + sEventName + ",this);" ;
         }
         else if ( nJScriptCode == 6 )
         {
            sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
         }
         else if ( nJScriptCode == 5 )
         {
            sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
         }
         else if ( nJScriptCode == 0 )
         {
            sEventJsCode = "" ;
         }
         else
         {
            sEventJsCode = "" ;
         }
         httpContext.writeText( "<select") ;
         if ( nRows > 1 )
         {
            httpContext.writeText( " size=") ;
            httpContext.writeText( GXutil.ltrim( GXutil.formatLong( nRows))) ;
         }
         httpContext.writeText( " id=\"") ;
         httpContext.writeText( sCtrlName+"\"") ;
         httpContext.writeText( " name=\"") ;
         httpContext.writeText( sCtrlName+"\"") ;
         if ( ! (GXutil.strcmp("", sTooltipText)==0) )
         {
            httpContext.writeText( " title=\"") ;
            httpContext.writeText( sTooltipText) ;
            httpContext.writeText( "\"") ;
         }
         GxWebStd.classAttribute( httpContext, sClassString);
         GxWebStd.styleAttribute( httpContext, sStyleString);
         httpContext.writeText( sTags) ;
         httpContext.writeTextNL( ">") ;
         while ( idxLst <= LObjCtrl.getItemCount() )
         {
            if ( GXutil.strcmp(sType, "int") == 0 )
            {
               httpContext.writeText( "<option value=\""+GXutil.alltrim( LObjCtrl.getItemValue((short)(idxLst)))) ;
            }
            else
            {
               httpContext.writeText( "<option value=\""+GXutil.rtrim( LObjCtrl.getItemValue((short)(idxLst)))) ;
            }
            if ( GXutil.strcmp(GXutil.ltrim( LObjCtrl.getItemValue((short)(idxLst))), GXutil.ltrim( sValue)) == 0 )
            {
               httpContext.writeText( "\" selected=\"selected\" >") ;
            }
            else
            {
               httpContext.writeText( "\">") ;
            }
            if ( nFormat == 0 )
            {
               httpContext.writeValue( LObjCtrl.getItemText((short)(idxLst))) ;
            }
            else
            {
               if ( nFormat == 3 )
               {
                  httpContext.writeValueSpace( LObjCtrl.getItemText((short)(idxLst))) ;
               }
               else
               {
                  httpContext.writeText( LObjCtrl.getItemText((short)(idxLst))) ;
               }
            }
            httpContext.writeText( httpContext.htmlEndTag( HTMLElement.OPTION)) ;
            idxLst = (int)(idxLst+1) ;
         }
         httpContext.writeTextNL( "</select>") ;
         GxWebStd.gx_ctrl_attribute( httpContext, sCtrlName, "jsevent", sUserOnClickCode, false);
         GxWebStd.gx_ctrl_attribute( httpContext, sCtrlName, "gxoch0", sEventJsCode, true);
      }
      if ( nEnabled == 0 )
      {
         if ( ( nRTEnabled == 0 ) && bSendHidden )
         {
            GxWebStd.gx_hidden_field( httpContext, sCtrlName, sValue);
         }
         if ( ( GXutil.len( sClassString) != 0 ) && ( GXutil.strSearch( sClassString, "Readonly", 1) != 1 ) )
         {
            ClassHTML = "Readonly" + sClassString ;
         }
         else
         {
            ClassHTML = sClassString ;
         }
         sOStyle = sOStyle + ((nVisible==0) ? ";display:none;" : "") ;
         idxLst = 1 ;
         httpContext.writeText( "<span") ;
         GxWebStd.classAttribute( httpContext, ClassHTML);
         GxWebStd.styleAttribute( httpContext, sOStyle);
         httpContext.writeText( sTags+((GXutil.len( sTooltipText)>0) ? " title=\""+sTooltipText+"\"" : "")+" id=\"span_"+sCtrlName+"\"") ;
         httpContext.writeText( ">") ;
         while ( idxLst <= LObjCtrl.getItemCount() )
         {
            if ( GXutil.strcmp(GXutil.ltrim( LObjCtrl.getItemValue((short)(idxLst))), GXutil.ltrim( sValue)) == 0 )
            {
               if ( nFormat == 0 )
               {
                  httpContext.writeValue( LObjCtrl.getItemText((short)(idxLst))) ;
               }
               else
               {
                  if ( nFormat == 3 )
                  {
                     httpContext.writeValueSpace( LObjCtrl.getItemText((short)(idxLst))) ;
                  }
                  else
                  {
                     httpContext.writeText( LObjCtrl.getItemText((short)(idxLst))) ;
                  }
               }
               if (true) break;
            }
            idxLst = (int)(idxLst+1) ;
         }
         httpContext.writeText( "</span>") ;
         if ( nEnabled == 0 )
         {
            httpContext.writeText( "<script type=\"text/javascript\">gx.fn.disableCtrl(\""+sCtrlName+"\");</script>") ;
         }
      }
   }

   public static void gx_radio_ctrl( HttpContext httpContext ,
                                     com.genexus.webpanels.HTMLChoice RObjCtrl ,
                                     String sCtrlName ,
                                     String sValue ,
                                     String sTooltipText ,
                                     int nVisible ,
                                     int nEnabled ,
                                     int nRadioColumns ,
                                     int nOrientation ,
                                     String sStyleString ,
                                     String sClassString ,
                                     int nJScriptCode ,
                                     String sUserOnClickCode ,
                                     String sEventName ,
                                     String sTags ,
                                     String sCallerPgm )
   {
      String sEventJsCode ;
      int idxLst ;
      int idxCol ;
      String ClassHTML ;
      if ( ( nEnabled == 0 ) && ( GXutil.len( sClassString) != 0 ) && ( GXutil.strSearch( sClassString, "Readonly", 1) != 1 ) )
      {
         ClassHTML = "Readonly" + sClassString ;
      }
      else
      {
         ClassHTML = sClassString ;
      }
      /* Initialize internal JScript code according to EventNo */
      if ( nJScriptCode == 1 )
      {
         sEventJsCode = "gx.fn.closeWindow();" + "return false;" ;
      }
      else if ( nJScriptCode == 2 )
      {
         sEventJsCode = "ClearForm( this.form);" + "return false;" ;
      }
      else if ( nJScriptCode == 3 )
      {
         sEventJsCode = "gx.util.help(" + "'" + httpContext.convertURL( "Help/"+"Japanese/"+GXutil.lower( sCallerPgm)) + "');" + "return false;" ;
      }
      else if ( nJScriptCode == 7 )
      {
         sEventJsCode = "" + "gx.evt.execCliEvt(" + sEventName + ",this);" ;
      }
      else if ( nJScriptCode == 6 )
      {
         sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
      }
      else if ( nJScriptCode == 5 )
      {
         sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
      }
      else if ( nJScriptCode == 0 )
      {
         sEventJsCode = "" ;
      }
      else
      {
         sEventJsCode = "" ;
      }
      idxLst = 1 ;
      idxCol = 0 ;
      sStyleString = sStyleString + ((nVisible!=0) ? "" : ";display:none;") ;
      if ( nOrientation == 1 )
      {
         httpContext.writeText( "<table") ;
         GxWebStd.classAttribute( httpContext, ClassHTML);
         GxWebStd.styleAttribute( httpContext, sStyleString);
         httpContext.writeText( ">") ;
      }
      else
      {
         httpContext.writeText( "<span") ;
         GxWebStd.classAttribute( httpContext, ClassHTML);
         GxWebStd.styleAttribute( httpContext, sStyleString);
         httpContext.writeText( ">") ;
      }
      while ( idxLst <= RObjCtrl.getItemCount() )
      {
         if ( nOrientation == 1 )
         {
            if ( nRadioColumns > 1 )
            {
               idxCol = (int)(((int)(idxCol+1) % (nRadioColumns))) ;
            }
            if ( idxCol == 0 )
            {
               httpContext.writeText( "<tr>") ;
            }
            httpContext.writeText( "<td>") ;
         }
         httpContext.skipLines( 1 );
         httpContext.writeText( "<input type=radio") ;
         httpContext.writeText( " name=\"") ;
         httpContext.writeText( sCtrlName+"\"") ;
         httpContext.writeText( " value=\"") ;
         httpContext.writeText( RObjCtrl.getItemValue((short)(idxLst))) ;
         httpContext.writeText( "\"") ;
         if ( ! (GXutil.strcmp("", sTooltipText)==0) )
         {
            httpContext.writeText( " title=\"") ;
            httpContext.writeText( sTooltipText) ;
            httpContext.writeText( "\"") ;
         }
         if ( GXutil.strcmp(sValue, RObjCtrl.getItemValue((short)(idxLst))) == 0 )
         {
            httpContext.writeText( " checked=\"checked\"") ;
         }
         httpContext.writeText( sTags) ;
         httpContext.writeText( httpContext.htmlEndTag( HTMLElement.INPUT)) ;
         GxWebStd.gx_ctrl_attribute( httpContext, sCtrlName, "gxoch0", sEventJsCode, true);
         GxWebStd.gx_ctrl_attribute( httpContext, sCtrlName, "jsevent", sUserOnClickCode, false);
         if ( nEnabled == 0 )
         {
            httpContext.writeText( "<script type=\"text/javascript\">gx.fn.disableCtrl(\""+sCtrlName+"\");</script>") ;
         }
         httpContext.writeValue( RObjCtrl.getItemText((short)(idxLst))) ;
         if ( nOrientation == 1 )
         {
            httpContext.writeText( "</td>") ;
            if ( idxCol == 0 )
            {
               httpContext.writeText( "</tr>") ;
            }
         }
         httpContext.skipLines( 1 );
         idxLst = (int)(idxLst+1) ;
      }
      if ( nOrientation == 1 )
      {
         httpContext.writeTextNL( "</table>") ;
      }
      else
      {
         httpContext.writeText( "</span>") ;
      }
   }

   public static void gx_checkbox_ctrl( HttpContext httpContext ,
                                        String sCtrlName ,
                                        String sValue ,
                                        String sTooltipText ,
                                        int nVisible ,
                                        int nEnabled ,
                                        String sCheked ,
                                        String sCaption ,
                                        String sStyleString ,
                                        String sClassString ,
                                        String sTags )
   {
      String ClassHTML ;
      ClassHTML = sClassString ;
      sValue = GXutil.ltrim( sValue) ;
      sCheked = GXutil.ltrim( sCheked) ;
      if ( nEnabled == 0 )
      {
         if ( ( GXutil.len( sClassString) != 0 ) && ( GXutil.strSearch( sClassString, "Readonly", 1) != 1 ) )
         {
            ClassHTML = "Readonly" + sClassString ;
         }
      }
      sStyleString = sStyleString + ((nVisible!=0) ? "" : ";display:none;") ;
      httpContext.writeText( "<span") ;
      GxWebStd.classAttribute( httpContext, ClassHTML);
      GxWebStd.styleAttribute( httpContext, sStyleString);
      httpContext.writeText( ">") ;
      httpContext.writeText( "<input type=\"checkbox\" "+((GXutil.strcmp(sValue, sCheked)==0) ? "checked=\"checked\"" : "")) ;
      httpContext.writeText( " id=\"") ;
      httpContext.writeText( sCtrlName) ;
      httpContext.writeText( "\"") ;
      httpContext.writeText( " name=\"") ;
      httpContext.writeText( sCtrlName) ;
      httpContext.writeText( "\"") ;
      httpContext.writeText( "\" value=\""+((GXutil.strcmp(sValue, sCheked)==0) ? sCheked : "")+"\"") ;
      if ( ! (GXutil.strcmp("", sTooltipText)==0) )
      {
         httpContext.writeText( " title=\"") ;
         httpContext.writeText( sTooltipText) ;
         httpContext.writeText( "\"") ;
      }
      httpContext.writeText( sTags+httpContext.htmlEndTag( HTMLElement.INPUT)) ;
      httpContext.writeText( sCaption) ;
      httpContext.writeText( "</span>") ;
      if ( nEnabled == 0 )
      {
         httpContext.writeText( "<script type=\"text/javascript\">gx.fn.disableCtrl(\""+sCtrlName+"\");</script>") ;
      }
   }

   public static void gx_bitmap( HttpContext httpContext ,
                                 String sInternalName ,
                                 String sImageURL ,
                                 String sLinkURL ,
                                 String sLinkTarget ,
                                 String sAccesskey ,
                                 String sThemeName ,
                                 int nVisible ,
                                 int nEnabled ,
                                 String sAlternateText ,
                                 String sTooltipText ,
                                 int nBorderWidth ,
                                 int nAutoresize ,
                                 int nWidth ,
                                 String nWidthUnit ,
                                 int nHeight ,
                                 String nHeightUnit ,
                                 int nVerticalSpace ,
                                 int nHorizontalSpace ,
                                 int nJScriptCode ,
                                 String sUserOnClickCode ,
                                 String sEventName ,
                                 String sStyleString ,
                                 String sClassString ,
                                 String sAlign ,
                                 String sTags ,
                                 String sUseMap ,
                                 String sJsDynCode ,
                                 String sCallerPgm )
   {
      String sEventJsCode ;
      String sCapAKey ;
      sEventJsCode = "" ;
      sCapAKey = GXutil.accessKey( sTooltipText) ;
      sTooltipText = GXutil.accessKeyCaption( sTooltipText) ;
      if ( ! (GXutil.strcmp("", sCapAKey)==0) )
      {
         sAccesskey = sCapAKey ;
      }
      sStyleString = sStyleString + ((nVisible!=0) ? "" : ";display:none;") ;
      /* Initialize internal JScript code according to EventNo */
      if ( nJScriptCode == 4 )
      {
         sEventJsCode = sJsDynCode ;
      }
      else if ( nJScriptCode == 1 )
      {
         sEventJsCode = "gx.fn.closeWindow();" + "return false;" ;
      }
      else if ( nJScriptCode == 2 )
      {
         sEventJsCode = "ClearForm( this.form);" + "return false;" ;
      }
      else if ( nJScriptCode == 3 )
      {
         sEventJsCode = "gx.util.help(" + "'" + httpContext.convertURL( "Help/"+"Japanese/"+GXutil.lower( sCallerPgm)) + "');" + "return false;" ;
      }
      else if ( nJScriptCode == 7 )
      {
         sEventJsCode = "" + "gx.evt.execCliEvt(" + sEventName + ",this);" ;
      }
      else if ( nJScriptCode == 6 )
      {
         sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
      }
      else if ( nJScriptCode == 5 )
      {
         sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
      }
      else if ( nJScriptCode == 0 )
      {
         sEventJsCode = "" ;
      }
      else
      {
         sEventJsCode = "" ;
      }
      if ( GXutil.strcmp(sEventJsCode, "") != 0 )
      {
         httpContext.writeText( "<input type=\"image\" src=\"") ;
         httpContext.writeText( httpContext.convertURL( sImageURL)) ;
         httpContext.writeText( "\" name=\"") ;
         httpContext.writeText( sInternalName) ;
         httpContext.writeText( "\"") ;
         GxWebStd.gx_on_js_event( httpContext, "onclick", sEventJsCode+"return false;");
         if ( nEnabled == 0 )
         {
            httpContext.writeText( " disabled=\"disabled\" ") ;
         }
      }
      else
      {
         if ( ( nEnabled != 0 ) && ( GXutil.strcmp(sLinkURL, "") != 0 ) )
         {
            GxWebStd.gx_start_js_anchor( httpContext, sEventJsCode, sUserOnClickCode, sLinkURL, sLinkTarget);
         }
         httpContext.writeText( "<img src=\""+httpContext.convertURL( sImageURL)+"\"") ;
      }
      if ( GXutil.len( sAccesskey) != 0 )
      {
         httpContext.writeText( " accesskey=\"") ;
         httpContext.writeText( sAccesskey) ;
         httpContext.writeText( "\"") ;
      }
      httpContext.writeText( " id=\"") ;
      httpContext.writeText( sInternalName) ;
      httpContext.writeText( "\"") ;
      if ( ! (0==nVerticalSpace) )
      {
         httpContext.writeText( " vspace=\"") ;
         httpContext.writeText( GXutil.ltrim( GXutil.str( nVerticalSpace, 10, 0))) ;
         httpContext.writeText( "\"") ;
      }
      if ( ! (0==nHorizontalSpace) )
      {
         httpContext.writeText( " hspace=\"") ;
         httpContext.writeText( GXutil.ltrim( GXutil.str( nHorizontalSpace, 10, 0))) ;
         httpContext.writeText( "\"") ;
      }
      if ( ! (GXutil.strcmp("", sAlign)==0) )
      {
         httpContext.writeText( " align=\"") ;
         httpContext.writeText( GXutil.ltrim( sAlign)) ;
         httpContext.writeText( "\"") ;
      }
      if ( nBorderWidth > 0 )
      {
         sStyleString = sStyleString + ";border-width: " + GXutil.str( nBorderWidth, 3, 0) ;
      }
      if ( (GXutil.strcmp("", sEventJsCode)==0) || ! (GXutil.strcmp("", sAlternateText)==0) )
      {
         httpContext.writeText( " alt=\"") ;
         httpContext.writeText( sAlternateText) ;
         httpContext.writeText( "\"") ;
      }
      if ( ! (GXutil.strcmp("", sTooltipText)==0) )
      {
         httpContext.writeText( " title=\"") ;
         httpContext.writeText( sTooltipText) ;
         httpContext.writeText( "\"") ;
      }
      if ( nWidth > 0 )
      {
         sStyleString = sStyleString + ";width: " + GXutil.ltrim( GXutil.str( nWidth, 10, 0)) + nWidthUnit ;
      }
      if ( nHeight > 0 )
      {
         sStyleString = sStyleString + ";height: " + GXutil.ltrim( GXutil.str( nHeight, 10, 0)) + nHeightUnit ;
      }
      GxWebStd.classAttribute( httpContext, sClassString);
      GxWebStd.styleAttribute( httpContext, sStyleString);
      httpContext.writeText( sTags) ;
      if ( ! (GXutil.strcmp("", sUseMap)==0) )
      {
         httpContext.writeText( " usemap=\"") ;
         httpContext.writeText( sUseMap) ;
         httpContext.writeText( "\"") ;
      }
      httpContext.writeText( httpContext.htmlEndTag( HTMLElement.INPUT)) ;
      if ( GXutil.strcmp(sEventJsCode, "") != 0 )
      {
         GxWebStd.gx_ctrl_attribute( httpContext, sInternalName, "jsevent", sUserOnClickCode, false);
      }
      if ( ( nEnabled != 0 ) && ( GXutil.strcmp(sLinkURL, "") != 0 ) && ( GXutil.strcmp(sEventJsCode, "") == 0 ) )
      {
         GxWebStd.gx_end_js_anchor( httpContext, sEventJsCode, sUserOnClickCode, sLinkURL);
      }
   }

   public static void gx_label_ctrl( HttpContext httpContext ,
                                     String sInternalName ,
                                     String sCaption ,
                                     String sLinkURL ,
                                     String sLinkTarget ,
                                     String sUserOnClickCode ,
                                     String sEventName ,
                                     String sTags ,
                                     String sClassString ,
                                     int nJScriptCode ,
                                     String sTooltipText ,
                                     int nVisible ,
                                     int nEnabled ,
                                     short nFormat ,
                                     String sCallerPgm )
   {
      String sEventJsCode ;
      String sStyle ;
      sTooltipText = ((GXutil.strcmp(sTooltipText, "")==0) ? "" : " title=\""+sTooltipText+"\"") ;
      if ( nFormat == 1 )
      {
         /* HTML Format */
         sStyle = ((nVisible!=0) ? ";display:inline;" : ";display:none;") + sTags ;
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, sClassString);
         GxWebStd.styleAttribute( httpContext, sStyle);
         httpContext.writeText( " id=\""+sInternalName+"\" "+sTooltipText) ;
         httpContext.writeText( ">") ;
      }
      else if ( nFormat != 2 )
      {
         sStyle = ((nVisible!=0) ? "" : ";display:none;") + sTags ;
         httpContext.writeText( "<span") ;
         GxWebStd.classAttribute( httpContext, sClassString);
         GxWebStd.styleAttribute( httpContext, sStyle);
         httpContext.writeText( " id=\""+sInternalName+"\" "+sTooltipText) ;
         httpContext.writeText( ">") ;
      }
      if ( nEnabled != 0 )
      {
         /* Initialize internal JScript code according to EventNo */
         if ( nJScriptCode == 1 )
         {
            sEventJsCode = "gx.fn.closeWindow();" ;
         }
         else if ( nJScriptCode == 2 )
         {
            sEventJsCode = "ClearForm( this.form);" ;
         }
         else if ( nJScriptCode == 3 )
         {
            sEventJsCode = "gx.util.help(" + "'" + httpContext.convertURL( "Help/"+"Japanese/"+GXutil.lower( sCallerPgm)) + "');" ;
         }
         else if ( nJScriptCode == 7 )
         {
            sEventJsCode = "" + "gx.evt.execCliEvt(" + sEventName + ",this);" ;
         }
         else if ( nJScriptCode == 6 )
         {
            sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
         }
         else if ( nJScriptCode == 5 )
         {
            sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
         }
         else if ( nJScriptCode == 0 )
         {
            sEventJsCode = "" ;
         }
         else
         {
            sEventJsCode = "" ;
         }
         GxWebStd.gx_start_js_anchor( httpContext, sEventJsCode, sUserOnClickCode, sLinkURL, sLinkTarget);
      }
      else
      {
         sEventJsCode = "" ;
      }
      if ( nFormat == 0 )
      {
         /* Text Format */
         httpContext.writeValueEnter( sCaption) ;
      }
      else
      {
         if ( nFormat == 3 )
         {
            /* Text with meaningful spaces */
            httpContext.writeValueSpace( sCaption) ;
         }
         else if ( ( nFormat != 2 ) || ( nVisible != 0 ) )
         {
            httpContext.writeText( sCaption) ;
         }
      }
      if ( nEnabled != 0 )
      {
         GxWebStd.gx_end_js_anchor( httpContext, sEventJsCode, sUserOnClickCode, sLinkURL);
      }
      if ( nFormat == 1 )
      {
         httpContext.writeText( "</div>") ;
      }
      else if ( nFormat != 2 )
      {
         httpContext.writeText( "</span>") ;
      }
      if ( ( nFormat != 0 ) && ( nFormat != 2 ) )
      {
         GxWebStd.gx_ctrl_attribute( httpContext, sInternalName, "gxformat", GXutil.str( nFormat, 1, 0), false);
      }
      if ( ( nFormat == 1 ) && ( ! (GXutil.strcmp("", sEventJsCode)==0) || ! (GXutil.strcmp("", sUserOnClickCode)==0) || ! (GXutil.strcmp("", sLinkURL)==0) ) )
      {
         GxWebStd.gx_ctrl_attribute( httpContext, sInternalName, "gxlink", "1", false);
      }
   }

   public static void gx_start_js_anchor( HttpContext httpContext ,
                                          String sGXOnClickCode ,
                                          String sUserOnClickCode ,
                                          String sLinkURL ,
                                          String sLinkTarget )
   {
      if ( ! (GXutil.strcmp("", sUserOnClickCode)==0) )
      {
         if ( ! (GXutil.strcmp("", sGXOnClickCode)==0) )
         {
            httpContext.writeText( "<a href=\"javascript:if( ") ;
            httpContext.writeText( sUserOnClickCode) ;
            httpContext.writeText( ") {") ;
            httpContext.writeText( sGXOnClickCode) ;
            httpContext.writeText( "}\">") ;
         }
         else
         {
            httpContext.writeText( "<a href=\"javascript:") ;
            httpContext.writeText( sUserOnClickCode) ;
            httpContext.writeText( "\">") ;
         }
      }
      else
      {
         if ( ! (GXutil.strcmp("", sGXOnClickCode)==0) )
         {
            httpContext.writeText( "<a href=\"javascript:") ;
            httpContext.writeText( sGXOnClickCode) ;
            httpContext.writeText( "\">") ;
         }
         else
         {
            GxWebStd.gx_link_start( httpContext, sLinkURL, sLinkTarget);
         }
      }
   }

   public static void gx_end_js_anchor( HttpContext httpContext ,
                                        String sGXOnClickCode ,
                                        String sUserOnClickCode ,
                                        String sLinkURL )
   {
      if ( ! ( (GXutil.strcmp("", sGXOnClickCode)==0) && (GXutil.strcmp("", sUserOnClickCode)==0) ) )
      {
         httpContext.writeText( "</a>") ;
      }
      else
      {
         GxWebStd.gx_link_end( httpContext, sLinkURL);
      }
   }

   public static boolean gx_redirect( HttpContext httpContext )
   {
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.dispatchAjaxCommands();
         return true ;
      }
      else if ( httpContext.nUserReturn == 1 )
      {
         if ( httpContext.isAjaxRequest( ) )
         {
            httpContext.ajax_rsp_command_close();
            httpContext.dispatchAjaxCommands();
         }
         else
         {
            if ( (GXutil.strcmp("", httpContext.getReferer( ))==0) )
            {
               httpContext.setStream();
               httpContext.writeText( httpContext.htmlDocType( )) ;
               httpContext.writeText( "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"><title>Close window</title>") ;
               httpContext.AddJavascriptSource("gxgral.js", "?58720");
               httpContext.writeText( "</head><body><script type=\"text/javascript\">gx.evt.execLoad=false;gx.fn.closeWindow('") ;
               httpContext.writeText( httpContext.getWebReturnParmsJS( )) ;
               httpContext.writeText( "');</script></body></html>") ;
            }
            else
            {
               httpContext.redirect( httpContext.getReferer( ) );
               httpContext.windowClosed();
            }
         }
         return true ;
      }
      else
      {
         return false ;
      }
   }

   public static void gx_table_start( HttpContext httpContext ,
                                      String sCtrlName ,
                                      String sHTMLid ,
                                      String sHTMLTags ,
                                      String sClassString ,
                                      int nBorder ,
                                      String sAlign ,
                                      String sTooltiptext ,
                                      int nCellpadding ,
                                      int nCellspacing ,
                                      String sStyleString ,
                                      String sRules ,
                                      int nParentIsFreeStyle )
   {
      httpContext.writeText( "<table") ;
      if ( ! (GXutil.strcmp("", sCtrlName)==0) )
      {
         httpContext.writeText( " id=\""+sHTMLid+"\"") ;
      }
      if ( ! (GXutil.strcmp("", sHTMLTags)==0) )
      {
         httpContext.writeText( sHTMLTags) ;
      }
      if ( GXutil.strcmp(sAlign, "") != 0 )
      {
         if ( GXutil.strcmp(sAlign, "center") != 0 )
         {
            sStyleString = "float:" + sAlign + ";" + sStyleString ;
         }
         else
         {
            httpContext.writeText( " align=\"") ;
            httpContext.writeText( sAlign) ;
            httpContext.writeText( "\"") ;
         }
      }
      GxWebStd.classAttribute( httpContext, sClassString);
      if ( ! (0==nBorder) )
      {
         httpContext.writeText( " border=\"") ;
         httpContext.writeText( GXutil.str( nBorder, 3, 0)) ;
         httpContext.writeText( "\"") ;
      }
      httpContext.writeText( " cellpadding=\"") ;
      httpContext.writeText( GXutil.ltrim( GXutil.str( nCellpadding, 10, 0))) ;
      httpContext.writeText( "\"") ;
      httpContext.writeText( " cellspacing=\"") ;
      httpContext.writeText( GXutil.ltrim( GXutil.str( nCellspacing, 10, 0))) ;
      httpContext.writeText( "\"") ;
      if ( ( GXutil.strcmp(sRules, "") != 0 ) && ( GXutil.strcmp(sRules, "none") != 0 ) )
      {
         httpContext.writeText( " rules=\"") ;
         httpContext.writeText( sRules) ;
         httpContext.writeText( "\"") ;
      }
      if ( GXutil.strcmp(sTooltiptext, "") != 0 )
      {
         httpContext.writeText( " title=\"") ;
         httpContext.writeText( sTooltiptext) ;
         httpContext.writeText( "\"") ;
      }
      if ( nParentIsFreeStyle == 0 )
      {
         GxWebStd.styleAttribute( httpContext, sStyleString);
      }
      httpContext.writeText( ">") ;
   }

   public static void gx_html_headers( HttpContext httpContext ,
                                       int nContentType ,
                                       String sCacheCtrl ,
                                       String sCacheExp ,
                                       com.genexus.webpanels.HTMLChoice rMeta ,
                                       com.genexus.webpanels.HTMLChoice rMetaequiv ,
                                       String sIEMode )
   {
      byte wbTemp ;
      byte idxLst ;
      boolean addContentType ;
      GxWebStd.set_html_headers( httpContext, nContentType, sCacheCtrl, sCacheExp);
      httpContext.setStream();
      if ( nContentType == 0 )
      {
         if ( ! httpContext.isPopUpObject( ) )
         {
            httpContext.writeTextNL( httpContext.htmlDocType( )) ;
         }
         httpContext.writeTextNL( "<html>") ;
         httpContext.writeTextNL( "<head>") ;
         idxLst = (byte)(1) ;
         while ( idxLst <= rMeta.getItemCount() )
         {
            httpContext.writeText( "<meta name=\""+GXutil.rtrim( rMeta.getItemValue(idxLst))+"\" content=\"") ;
            httpContext.writeValue( GXutil.rtrim( rMeta.getItemText(idxLst))) ;
            httpContext.writeTextNL( "\""+httpContext.htmlEndTag( HTMLElement.META)) ;
            idxLst = (byte)(idxLst+1) ;
         }
         httpContext.writeTextNL( "<meta http-equiv=\"Page-Enter\" content=\"BlendTrans(Duration=0.1)\""+httpContext.htmlEndTag( HTMLElement.META)) ;
         if ( ! (GXutil.strcmp("", sIEMode)==0) && ( httpContext.getBrowserType( ) == 1 ) && ( GXutil.strcmp(GXutil.left( httpContext.getBrowserVersion( ), 1), "8") == 0 ) )
         {
            httpContext.writeTextNL( "<meta http-equiv=\"X-UA-Compatible\" content=\""+sIEMode+"\""+httpContext.htmlEndTag( HTMLElement.META)) ;
         }
         idxLst = (byte)(1) ;
         addContentType = true ;
         while ( idxLst <= rMetaequiv.getItemCount() )
         {
            if ( GXutil.strcmp(GXutil.lower( rMetaequiv.getItemValue(idxLst)), "content-type") == 0 )
            {
               addContentType = false ;
               wbTemp = httpContext.setContentType( rMetaequiv.getItemText(idxLst)) ;
            }
            idxLst = (byte)(idxLst+1) ;
         }
         if ( addContentType )
         {
            httpContext.writeTextNL( "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\""+httpContext.htmlEndTag( HTMLElement.META)) ;
         }
         idxLst = (byte)(1) ;
         while ( idxLst <= rMetaequiv.getItemCount() )
         {
            httpContext.writeText( "<meta http-equiv=\""+GXutil.rtrim( rMetaequiv.getItemValue(idxLst))+"\" content=\"") ;
            httpContext.writeValue( GXutil.rtrim( rMetaequiv.getItemText(idxLst))) ;
            httpContext.writeTextNL( "\""+httpContext.htmlEndTag( HTMLElement.META)) ;
            idxLst = (byte)(idxLst+1) ;
         }
      }
   }

   public static void set_html_headers( HttpContext httpContext ,
                                        int nContentType ,
                                        String sCacheCtrl ,
                                        String sCacheExp )
   {
      byte wbTemp ;
      if ( nContentType == 1 )
      {
         wbTemp = httpContext.setContentType( "text/vnd.wap.wml") ;
      }
      else
      {
         if ( httpContext.isAjaxRequest( ) && ! httpContext.isMultipartContent( ) )
         {
            wbTemp = httpContext.setContentType( "application/json") ;
         }
         else
         {
            wbTemp = httpContext.setContentType( "text/html") ;
         }
      }
      if ( (GXutil.strcmp("", sCacheCtrl)==0) )
      {
         wbTemp = httpContext.setHeader( "pragma", "no-cache") ;
         wbTemp = httpContext.setHeader( "Cache-Control", "no-cache, no-store") ;
      }
      else
      {
         wbTemp = httpContext.setHeader( "Cache-Control", sCacheCtrl) ;
         wbTemp = httpContext.setHeader( "Cache-Control", sCacheExp) ;
      }
   }

   public static void gx_html_textarea( HttpContext httpContext ,
                                        String sCtrlName ,
                                        String sValue ,
                                        String sLinkURL ,
                                        String sTags ,
                                        short nFormat ,
                                        int nVisible ,
                                        int nEnabled ,
                                        int nRTEnabled ,
                                        int nWidth ,
                                        String sWidthUnit ,
                                        int nHeight ,
                                        String sHeightUnit ,
                                        String sStyleString ,
                                        String sClassString ,
                                        String sLength ,
                                        int nAutoResize ,
                                        String sLinkTarget ,
                                        boolean bSendHidden ,
                                        String sCallerPgm )
   {
      sStyleString = sStyleString + ((nVisible==0)||((nEnabled==0)&&(nRTEnabled==1)) ? ";display:none;" : "") ;
      if ( ( nRTEnabled != 0 ) || ( nEnabled != 0 ) )
      {
         httpContext.writeText( "<textarea ") ;
         if ( GXutil.strcmp(sWidthUnit, "chr") == 0 )
         {
            httpContext.writeText( " cols=\""+nWidth+"\" ") ;
         }
         else
         {
            sStyleString = sStyleString + ";width:" + nWidth + sWidthUnit ;
         }
         if ( GXutil.strcmp(sHeightUnit, "row") == 0 )
         {
            httpContext.writeText( " rows=\""+nHeight+"\" ") ;
         }
         else
         {
            sStyleString = sStyleString + ";height:" + nHeight + sHeightUnit ;
         }
         httpContext.writeText( " name=\""+sCtrlName+"\""+" id=\""+sCtrlName+"\" "+sTags) ;
         GxWebStd.classAttribute( httpContext, sClassString);
         GxWebStd.styleAttribute( httpContext, sStyleString);
         httpContext.writeText( " onKeyPress=\"return gx.evt.checkMaxLength(this,"+sLength+",event);\" ") ;
         httpContext.writeTextNL( ">") ;
         httpContext.writeValue( sValue) ;
         httpContext.writeTextNL( "</textarea>") ;
         GxWebStd.gx_ctrl_attribute( httpContext, sCtrlName, "maxlength", sLength, false);
      }
      if ( nEnabled == 0 )
      {
         sStyleString = ((nVisible==0) ? ";display:none;" : "") ;
         sStyleString = sStyleString + ((nAutoResize==0) ? ";overflow:hidden;" : "") ;
         if ( ( nRTEnabled == 0 ) && bSendHidden )
         {
            GxWebStd.gx_hidden_field( httpContext, sCtrlName, sValue);
         }
         if ( ( GXutil.len( sClassString) != 0 ) && ( GXutil.strSearch( sClassString, "Readonly", 1) != 1 ) )
         {
            sClassString = "Readonly" + sClassString ;
         }
         httpContext.writeText( "<span") ;
         GxWebStd.classAttribute( httpContext, sClassString);
         GxWebStd.styleAttribute( httpContext, sStyleString);
         httpContext.writeText( " id=\"span_"+sCtrlName+"\"") ;
         httpContext.writeText( ">") ;
         GxWebStd.gx_link_start( httpContext, sLinkURL, sLinkTarget);
         if ( nFormat == 0 )
         {
            httpContext.writeValueEnter( sValue) ;
         }
         else
         {
            if ( nFormat == 3 )
            {
               httpContext.writeValueComplete( sValue) ;
            }
            else
            {
               httpContext.writeText( sValue) ;
            }
         }
         GxWebStd.gx_link_end( httpContext, sLinkURL);
         httpContext.writeText( "</span>") ;
      }
   }

   public static void styleAttribute( HttpContext httpContext ,
                                      String sStyle )
   {
      if ( ! (GXutil.strcmp("", sStyle)==0) )
      {
         httpContext.writeText( " style=\"") ;
         httpContext.writeText( sStyle) ;
         httpContext.writeText( "\" ") ;
      }
   }

   public static void classAttribute( HttpContext httpContext ,
                                      String sClass )
   {
      if ( ! (GXutil.strcmp("", sClass)==0) )
      {
         httpContext.writeText( " class=\"") ;
         httpContext.writeText( sClass) ;
         httpContext.writeText( "\" ") ;
      }
   }

   /* WML StandardFunctions */
   /*  */
   public static void gx_hidden_field_wml( HttpContext httpContext ,
                                           String sCtrlName ,
                                           String sValue )
   {
      httpContext.ajax_rsp_assign_hidden(sCtrlName, sValue);
   }

   public static void gx_single_line_edit1_wml( HttpContext httpContext ,
                                                String sCtrlName ,
                                                String sValue ,
                                                String sFormatedValue ,
                                                String sTags ,
                                                String sEventName ,
                                                String sLinkURL ,
                                                String sLinkTarget ,
                                                String sTooltipText ,
                                                String sUserOnClickCode ,
                                                int nJScriptCode ,
                                                String sClassString ,
                                                String sStyleString ,
                                                String sROClassString ,
                                                int nVisible ,
                                                int nEnabled ,
                                                int nRTEnabled ,
                                                int nWidth ,
                                                String nWidthUnit ,
                                                int nHeight ,
                                                String nHeightUnit ,
                                                int nLength ,
                                                byte nIsPassword ,
                                                short nFormat ,
                                                int nParentId ,
                                                byte bHasTheme ,
                                                byte nAutoComplete ,
                                                boolean bSendHidden ,
                                                String sCallerPgm )
   {
      gx_single_line_edit_wml( httpContext, sCtrlName, sValue, sFormatedValue, sTags, sEventName, sLinkURL, sLinkTarget, sTooltipText, sUserOnClickCode, nJScriptCode, sClassString, sStyleString, sROClassString, nVisible, nEnabled, nRTEnabled, nWidth, nWidthUnit, nHeight, nHeightUnit, nLength, nIsPassword, nFormat, nParentId, bHasTheme, nAutoComplete, bSendHidden, "", sCallerPgm) ;
   }

   public static void gx_single_line_edit_wml( HttpContext httpContext ,
                                               String sCtrlName ,
                                               String sValue ,
                                               String sFormatedValue ,
                                               String sTags ,
                                               String sEventName ,
                                               String sLinkURL ,
                                               String sLinkTarget ,
                                               String sTooltipText ,
                                               String sUserOnClickCode ,
                                               int nJScriptCode ,
                                               String sClassString ,
                                               String sStyleString ,
                                               String sROClassString ,
                                               int nVisible ,
                                               int nEnabled ,
                                               int nRTEnabled ,
                                               int nWidth ,
                                               String nWidthUnit ,
                                               int nHeight ,
                                               String nHeightUnit ,
                                               int nLength ,
                                               byte nIsPassword ,
                                               short nFormat ,
                                               int nParentId ,
                                               byte bHasTheme ,
                                               byte nAutoComplete ,
                                               boolean bSendHidden ,
                                               String sAlign ,
                                               String sCallerPgm )
   {
      String sOStyle ;
      String sEventJsCode ;
      String ClassHTML ;
      String sSize ;
      sEventJsCode = "" ;
      sSize = "" ;
      if ( httpContext.getWrapped( ) )
      {
         sFormatedValue = sValue ;
      }
      if ( nWidth > 0 )
      {
         if ( GXutil.strcmp(nWidthUnit, "chr") == 0 )
         {
            sSize = " size=\"" + nWidth + "\"" ;
         }
         else
         {
            sStyleString = sStyleString + ";width: " + GXutil.ltrim( GXutil.str( nWidth, 10, 0)+nWidthUnit) + ";" ;
         }
      }
      if ( ( nHeight > 0 ) && ( GXutil.strcmp(nWidthUnit, "row") != 0 ) )
      {
         sStyleString = sStyleString + ";height: " + GXutil.ltrim( GXutil.str( nHeight, 10, 0)+nHeightUnit) + ";" ;
      }
      sOStyle = sStyleString ;
      sStyleString = sStyleString + ((nVisible==0)||((nEnabled==0)&&(nRTEnabled==1)) ? ";display:none;" : "") ;
      if ( ( nRTEnabled != 0 ) || ( nEnabled != 0 ) )
      {
         /* Control allows input */
         httpContext.writeText( "<input type=") ;
         if ( nIsPassword != 0 )
         {
            httpContext.writeText( "\"password\"") ;
         }
         else
         {
            httpContext.writeText( "\"text\"") ;
         }
         httpContext.writeText( " id=\"") ;
         httpContext.writeText( sCtrlName) ;
         httpContext.writeText( "\"") ;
         httpContext.writeText( " name=\"") ;
         httpContext.writeText( sCtrlName) ;
         httpContext.writeText( "\"") ;
         httpContext.writeText( " value=\"") ;
         httpContext.writeValue( sFormatedValue) ;
         httpContext.writeText( "\"") ;
         httpContext.writeText( sSize) ;
         if ( ! (GXutil.strcmp("", sTooltipText)==0) )
         {
            httpContext.writeText( " title=\"") ;
            httpContext.writeText( sTooltipText) ;
            httpContext.writeText( "\"") ;
         }
         httpContext.writeText( " maxlength=\"") ;
         httpContext.writeText( GXutil.formatLong( nLength)) ;
         httpContext.writeText( "\"") ;
         if ( ! (GXutil.strcmp("", sAlign)==0) )
         {
         }
         else
         {
         }
         httpContext.writeText( sTags) ;
         httpContext.writeText( httpContext.htmlEndTag( HTMLElement.INPUT)) ;
         if ( nAutoComplete == 0 )
         {
            GxWebStd.gx_ctrl_attribute_wml( httpContext, sCtrlName, "autocomplete", "off", false);
         }
      }
      if ( nEnabled == 0 )
      {
         /* Control is read only */
         if ( ( nRTEnabled == 0 ) && bSendHidden )
         {
         }
         if ( bHasTheme == 0 )
         {
            ClassHTML = sClassString ;
         }
         else
         {
            if ( nParentId == 0 )
            {
               if ( ( GXutil.len( sClassString) != 0 ) && ( GXutil.strSearch( sClassString, "Readonly", 1) != 1 ) )
               {
                  ClassHTML = "Readonly" + sClassString ;
               }
               else
               {
                  ClassHTML = sClassString ;
               }
            }
            else
            {
               if ( ( GXutil.len( sROClassString) != 0 ) && ( GXutil.strSearch( sROClassString, "Readonly", 1) != 1 ) )
               {
                  ClassHTML = "Readonly" + sROClassString ;
               }
               else
               {
                  ClassHTML = sROClassString ;
               }
            }
         }
         if ( nFormat != 2 )
         {
            sOStyle = sOStyle + ((nVisible==0) ? ";display:none;" : "") ;
            /* Initialize internal JScript code according to EventNo */
            if ( nJScriptCode == 1 )
            {
               sEventJsCode = "gx.fn.closeWindow();" ;
            }
            else if ( nJScriptCode == 2 )
            {
               sEventJsCode = "ClearForm( this.form);" ;
            }
            else if ( nJScriptCode == 3 )
            {
               sEventJsCode = "gx.util.help(" + "'" + httpContext.convertURL( "Help/"+"Japanese/"+GXutil.lower( sCallerPgm)) + "');" ;
            }
            else if ( nJScriptCode == 7 )
            {
               sEventJsCode = "" + "gx.evt.execCliEvt(" + sEventName + ",this);" ;
            }
            else if ( nJScriptCode == 6 )
            {
               sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
            }
            else if ( nJScriptCode == 5 )
            {
               sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
            }
            else if ( nJScriptCode == 0 )
            {
               sEventJsCode = "" ;
            }
            else
            {
               sEventJsCode = "" ;
            }
            GxWebStd.gx_start_js_anchor_wml( httpContext, sEventJsCode, sUserOnClickCode, sLinkURL, sLinkTarget);
         }
         if ( nIsPassword == 0 )
         {
            if ( nFormat == 0 )
            {
               /* Text */
               httpContext.writeValue( sFormatedValue) ;
            }
            else
            {
               if ( nFormat == 3 )
               {
                  /* Text with meaningful spaces */
                  httpContext.writeValueSpace( sFormatedValue) ;
               }
               else
               {
                  httpContext.writeText( sFormatedValue) ;
               }
            }
         }
         else
         {
            httpContext.writeValue( GXutil.padr( "", nLength, "*")) ;
         }
         if ( nFormat != 2 )
         {
            GxWebStd.gx_end_js_anchor_wml( httpContext, sEventJsCode, sUserOnClickCode, sLinkURL);
         }
      }
   }

   public static void gx_link_start_wml( HttpContext httpContext ,
                                         String sLinkURL ,
                                         String sTargetWnd )
   {
      if ( GXutil.strcmp("", GXutil.rtrim( sLinkURL)) != 0 )
      {
         httpContext.writeText( "<a href=\"") ;
         httpContext.writeText( GXutil.rtrim( sLinkURL)) ;
         httpContext.writeText( "\"") ;
         if ( GXutil.strcmp("", GXutil.rtrim( sTargetWnd)) != 0 )
         {
            httpContext.writeText( " target=\"") ;
            httpContext.writeText( GXutil.rtrim( sTargetWnd)) ;
            httpContext.writeText( "\"") ;
         }
         httpContext.writeText( ">") ;
      }
   }

   public static void gx_link_end_wml( HttpContext httpContext ,
                                       String sLinkURL )
   {
      if ( GXutil.strcmp("", GXutil.rtrim( sLinkURL)) != 0 )
      {
         httpContext.writeText( "</a>") ;
      }
   }

   public static void gx_blob_field_wml( HttpContext httpContext ,
                                         String sInternalName ,
                                         String sValue ,
                                         String sURL ,
                                         String sContenttype ,
                                         boolean bHasFiletypeatt ,
                                         String sLinktarget ,
                                         String sObjecttagparameters ,
                                         int nDisplay ,
                                         int nEnabled ,
                                         int nVisible ,
                                         String sAlternateText ,
                                         String sTooltipText ,
                                         int nBorderWidth ,
                                         int nAutoresize ,
                                         int nWidth ,
                                         String nWidthUnit ,
                                         int nHeight ,
                                         String nHeightUnit ,
                                         int nVerticalSpace ,
                                         int nHorizontalSpace ,
                                         int nJScriptCode ,
                                         String sUserOnClickCode ,
                                         String sEventName ,
                                         String sStyleString ,
                                         String sClassString ,
                                         String sTags ,
                                         String sJsDynCode ,
                                         String sCallerPgm )
   {
      String sEventJsCode ;
      String ClassHTML ;
      sEventJsCode = "" ;
      sStyleString = sStyleString + ((nVisible!=0) ? "" : ";display:none;") ;
      if ( nEnabled != 0 )
      {
         /* Initialize internal JScript code according to EventNo */
         if ( nJScriptCode == 4 )
         {
            sEventJsCode = sJsDynCode ;
         }
         else if ( nJScriptCode == 1 )
         {
            sEventJsCode = "gx.fn.closeWindow();" + "return false;" ;
         }
         else if ( nJScriptCode == 2 )
         {
            sEventJsCode = "ClearForm( this.form);" + "return false;" ;
         }
         else if ( nJScriptCode == 3 )
         {
            sEventJsCode = "gx.util.help(" + "'" + httpContext.convertURL( "Help/"+"Japanese/"+GXutil.lower( sCallerPgm)) + "');" + "return false;" ;
         }
         else if ( nJScriptCode == 7 )
         {
            sEventJsCode = "" + "gx.evt.execCliEvt(" + sEventName + ",this);" ;
         }
         else if ( nJScriptCode == 6 )
         {
            sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
         }
         else if ( nJScriptCode == 5 )
         {
            sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
         }
         else if ( nJScriptCode == 0 )
         {
            sEventJsCode = "" ;
         }
         else
         {
            sEventJsCode = "" ;
         }
      }
      httpContext.writeText( "<span ") ;
      if ( ! (0==nVerticalSpace) )
      {
         httpContext.writeText( " vspace=\"") ;
         httpContext.writeText( GXutil.ltrim( GXutil.str( nVerticalSpace, 10, 0))) ;
         httpContext.writeText( "\"") ;
      }
      if ( ! (0==nHorizontalSpace) )
      {
         httpContext.writeText( " hspace=\"") ;
         httpContext.writeText( GXutil.ltrim( GXutil.str( nHorizontalSpace, 10, 0))) ;
         httpContext.writeText( "\"") ;
      }
      if ( ! (GXutil.strcmp("", sAlternateText)==0) )
      {
         httpContext.writeText( " alt=\"") ;
         httpContext.writeText( sAlternateText) ;
         httpContext.writeText( "\"") ;
      }
      if ( ! (GXutil.strcmp("", sTooltipText)==0) )
      {
         httpContext.writeText( " title=\"") ;
         httpContext.writeText( sTooltipText) ;
         httpContext.writeText( "\"") ;
      }
      httpContext.writeText( httpContext.htmlEndTag( HTMLElement.SPAN)) ;
      httpContext.writeText( "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\"><tr><td>") ;
      if ( nDisplay == 0 )
      {
         if ( httpContext.checkContentType( "image", sContenttype, sURL) )
         {
            httpContext.writeText( "<img alt=\"\" ") ;
            httpContext.writeText( "src=\"") ;
            if ( (GXutil.strcmp("", sURL)==0) )
            {
               sURL = httpContext.convertURL( "blank.jpg") ;
            }
         }
         else
         {
            httpContext.writeText( "<object ") ;
            httpContext.writeText( "type=\"") ;
            httpContext.writeText( com.genexus.internet.HttpResponse.getContentType(sContenttype)) ;
            httpContext.writeText( "\" data=\"") ;
            if ( (GXutil.strcmp("", sURL)==0) )
            {
               sURL = "about:blank" ;
            }
         }
         httpContext.writeText( sURL) ;
         httpContext.writeText( "\" id=\"Object_") ;
         httpContext.writeText( sInternalName) ;
         httpContext.writeText( "\" style=\"display:block;") ;
         if ( ! (0==nWidth) && ( ( nAutoresize == 0 ) ) )
         {
            httpContext.writeText( " width:") ;
            httpContext.writeText( GXutil.ltrim( GXutil.str( nWidth, 10, 0))) ;
            httpContext.writeText( nWidthUnit+";") ;
         }
         if ( ! (0==nHeight) && ( ( nAutoresize == 0 ) ) )
         {
            httpContext.writeText( " height:") ;
            httpContext.writeText( GXutil.ltrim( GXutil.str( nHeight, 10, 0))) ;
            httpContext.writeText( nHeightUnit+";") ;
         }
         httpContext.writeText( sStyleString) ;
         if ( GXutil.len( sClassString) != 0 )
         {
            ClassHTML = "BlobContent" + sClassString ;
         }
         else
         {
            ClassHTML = sClassString ;
         }
         if ( ( nEnabled == 0 ) && ( GXutil.len( sClassString) != 0 ) && ( GXutil.strSearch( sClassString, "Readonly", 1) != 1 ) )
         {
            ClassHTML = "Readonly" + ClassHTML ;
         }
         httpContext.writeText( "\" ") ;
         httpContext.writeText( sTags) ;
         if ( httpContext.checkContentType( "image", sContenttype, sURL) )
         {
            httpContext.writeText( httpContext.htmlEndTag( HTMLElement.IMG)) ;
         }
         else
         {
            httpContext.writeText( ">") ;
            httpContext.writeText( sObjecttagparameters) ;
            httpContext.writeText( "</object>") ;
         }
      }
      else
      {
         if ( nDisplay == 1 )
         {
            httpContext.writeText( "<a id=\"Link_") ;
            httpContext.writeText( sInternalName) ;
            httpContext.writeText( "\"") ;
            if ( GXutil.strcmp(sURL, "") != 0 )
            {
            }
            else
            {
            }
            httpContext.writeText( "href=\"") ;
            httpContext.writeText( sURL) ;
            httpContext.writeText( "\" type=\"") ;
            httpContext.writeText( sContenttype) ;
            httpContext.writeText( "\"") ;
            if ( GXutil.len( sLinktarget) > 0 )
            {
               httpContext.writeText( " target=\"") ;
               httpContext.writeText( GXutil.rtrim( sLinktarget)) ;
               httpContext.writeText( "\"") ;
            }
            httpContext.writeText( "><img border=\"0\" src=\"") ;
            httpContext.writeText( httpContext.convertURL( "download.gif")) ;
            httpContext.writeText( "\" alt=\"Download\""+httpContext.htmlEndTag( HTMLElement.IMG)) ;
            httpContext.writeText( "</a>") ;
         }
      }
      httpContext.writeText( "</td></tr><tr><td>") ;
      if ( nEnabled == 1 )
      {
         httpContext.writeText( "<script type=\"text/javascript\">document.forms[0].encoding=\"multipart/form-data\";</script>") ;
         httpContext.writeText( "<input type=\"file\" ") ;
         httpContext.writeText( " id=\"") ;
         httpContext.writeText( sInternalName) ;
         httpContext.writeText( "\"") ;
         httpContext.writeText( " name=\"") ;
         httpContext.writeText( sInternalName) ;
         httpContext.writeText( "\"") ;
         sStyleString = "" ;
         if ( nVisible == 0 )
         {
            sStyleString = "display:none;" ;
         }
         if ( ! (0==nWidth) )
         {
            sStyleString = sStyleString + " width:" + GXutil.ltrim( GXutil.str( nWidth, 10, 0)) + ";" ;
         }
         httpContext.writeText( " value=\"") ;
         httpContext.writeValue( sValue) ;
         httpContext.writeText( "\" ") ;
         if ( GXutil.len( sClassString) != 0 )
         {
            ClassHTML = "BlobInput" + sClassString ;
         }
         else
         {
            ClassHTML = sClassString ;
         }
         if ( ( nEnabled == 0 ) && ( GXutil.len( sClassString) != 0 ) && ( GXutil.strSearch( sClassString, "Readonly", 1) != 1 ) )
         {
            ClassHTML = "Readonly" + ClassHTML ;
         }
         httpContext.writeText( sTags) ;
         httpContext.writeText( httpContext.htmlEndTag( HTMLElement.INPUT)) ;
      }
      httpContext.writeText( "</td></tr></table>") ;
      httpContext.writeText( "</span>") ;
   }

   public static void gx_button_ctrl_wml( HttpContext httpContext ,
                                          String sCtrlName ,
                                          String sJsCode ,
                                          String sCaption ,
                                          String sUserOnClickCode ,
                                          int nJScriptCode ,
                                          String sTooltipText ,
                                          String sAccesskey ,
                                          String sStyleString ,
                                          String sClassString ,
                                          int nVisible ,
                                          int nEnabled ,
                                          String sBorderStyle ,
                                          String sEventName ,
                                          String sTags ,
                                          String sJsDynCode ,
                                          int nReset ,
                                          String sCallerPgm )
   {
      String sEventJsCode ;
      String sCapAKey ;
      String sClassRoundedBtn ;
      sStyleString = sStyleString + ((nVisible!=0) ? "" : ";display:none;") ;
      sClassRoundedBtn = "BaseRBtn " + "R" + sClassString ;
      if ( GXutil.strcmp(sBorderStyle, "rounded") == 0 )
      {
         sClassString = "BtnText" ;
         httpContext.writeText( "<span onclick=\"gx.evt.doClick(") ;
         httpContext.writeText( "'") ;
         httpContext.writeText( sCtrlName) ;
         httpContext.writeText( "', event") ;
         httpContext.writeText( ")\" ") ;
         httpContext.writeText( "><span class=\"BtnLeft\"><span class=\"BtnRight\"><span class=\"BtnBackground\">") ;
      }
      httpContext.writeText( "<input type=") ;
      if ( nReset == 1 )
      {
         httpContext.writeText( "\"submit\"") ;
      }
      else if ( nReset == 0 )
      {
         httpContext.writeText( "\"reset\"") ;
      }
      else
      {
         httpContext.writeText( "\"button\"") ;
      }
      sCapAKey = GXutil.accessKey( sCaption) ;
      sCaption = GXutil.accessKeyCaption( sCaption) ;
      if ( (GXutil.strcmp("", sCapAKey)==0) )
      {
         sCapAKey = GXutil.accessKey( sTooltipText) ;
         sTooltipText = GXutil.accessKeyCaption( sTooltipText) ;
      }
      if ( ! (GXutil.strcmp("", sCapAKey)==0) )
      {
         sAccesskey = sCapAKey ;
      }
      httpContext.writeText( " name=\"") ;
      httpContext.writeText( sCtrlName) ;
      httpContext.writeText( "\"") ;
      httpContext.writeText( " value=\"") ;
      httpContext.writeText( sCaption) ;
      httpContext.writeText( "\"") ;
      if ( ! (GXutil.strcmp("", sTooltipText)==0) )
      {
         httpContext.writeText( " title=\"") ;
         httpContext.writeText( sTooltipText) ;
         httpContext.writeText( "\"") ;
      }
      if ( GXutil.len( sAccesskey) != 0 )
      {
         httpContext.writeText( " accesskey=\"") ;
         httpContext.writeText( sAccesskey) ;
         httpContext.writeText( "\"") ;
      }
      if ( nEnabled == 0 )
      {
         httpContext.writeText( " disabled=\"disabled\"") ;
      }
      /* Initialize internal JScript code according to EventNo */
      if ( nJScriptCode == 4 )
      {
         sEventJsCode = sJsDynCode ;
      }
      else if ( nJScriptCode == 1 )
      {
         sEventJsCode = "gx.fn.closeWindow();" + "return false;" ;
      }
      else if ( nJScriptCode == 2 )
      {
         sEventJsCode = "ClearForm( this.form);" + "return false;" ;
      }
      else if ( nJScriptCode == 3 )
      {
         sEventJsCode = "gx.util.help(" + "'" + httpContext.convertURL( "Help/"+"Japanese/"+GXutil.lower( sCallerPgm)) + "');" + "return false;" ;
      }
      else if ( nJScriptCode == 7 )
      {
         sEventJsCode = "gx.evt.checkCtrlFocus(this);" + "gx.evt.execCliEvt(" + sEventName + ",this);" ;
      }
      else if ( nJScriptCode == 6 )
      {
         sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
      }
      else if ( nJScriptCode == 5 )
      {
         sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
      }
      else if ( nJScriptCode == 0 )
      {
         sEventJsCode = "" ;
      }
      else
      {
         sEventJsCode = "" ;
      }
      sEventJsCode = sJsCode + sEventJsCode ;
      GxWebStd.gx_on_js_event_wml( httpContext, "onclick", sEventJsCode);
      httpContext.writeText( " ") ;
      httpContext.writeText( sTags) ;
      httpContext.writeText( httpContext.htmlEndTag( HTMLElement.INPUT)) ;
      GxWebStd.gx_ctrl_attribute_wml( httpContext, sCtrlName, "jsevent", sUserOnClickCode, false);
      if ( GXutil.strcmp(sBorderStyle, "rounded") == 0 )
      {
         httpContext.writeText( "</span></span></span></span>") ;
      }
   }

   public static void gx_on_js_event_wml( HttpContext httpContext ,
                                          String sEventName ,
                                          String sEventJsCode )
   {
      httpContext.writeText( " ") ;
      httpContext.writeText( sEventName) ;
      httpContext.writeText( "=\"if( ") ;
      if ( ! (GXutil.strcmp("", sEventJsCode)==0) )
      {
         httpContext.writeText( "gx.evt.jsEvent(this)") ;
         httpContext.writeText( ") {") ;
         httpContext.writeText( sEventJsCode) ;
         httpContext.writeText( "} else return false;\"") ;
      }
      else
      {
         httpContext.writeText( "!(") ;
         httpContext.writeText( "gx.evt.jsEvent(this)") ;
         httpContext.writeText( ")) return false;\"") ;
      }
   }

   public static void gx_ctrl_attribute_wml( HttpContext httpContext ,
                                             String sControlName ,
                                             String sAttName ,
                                             String sAttValue ,
                                             boolean bCustomEvent )
   {
      if ( bCustomEvent )
      {
         httpContext.writeText( "<script type=\"text/javascript\">gx.dom.setAttribute(\"") ;
         httpContext.writeText( sControlName) ;
         httpContext.writeText( "\",\"") ;
         httpContext.writeText( sAttName) ;
         httpContext.writeText( "\",\"if(") ;
         if ( ! (GXutil.strcmp("", sAttValue)==0) )
         {
            httpContext.writeText( "gx.evt.jsEvent(this)") ;
            httpContext.writeText( ") {") ;
            httpContext.writeText( sAttValue) ;
            httpContext.writeText( "} else return false;\"") ;
         }
         else
         {
            httpContext.writeText( "!(") ;
            httpContext.writeText( "gx.evt.jsEvent(this)") ;
            httpContext.writeText( ")) return false;\"") ;
         }
         httpContext.writeText( ");</script>") ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", sAttValue)==0) )
         {
            httpContext.writeText( "<script type=\"text/javascript\">gx.dom.setAttribute(\"") ;
            httpContext.writeText( sControlName) ;
            httpContext.writeText( "\",\"") ;
            httpContext.writeText( sAttName) ;
            httpContext.writeText( "\",\"") ;
            httpContext.writeText( sAttValue) ;
            httpContext.writeText( "\");</script>") ;
         }
      }
   }

   public static void gx_msg_list_wml( HttpContext httpContext ,
                                       String sCtrlName ,
                                       int nDisplayMode ,
                                       String sStyleString ,
                                       String sClassString ,
                                       String sCmpCtx ,
                                       String sInMaster )
   {
      int i ;
      httpContext.writeText( "<div>") ;
      sClassString = sClassString + " gx_ev" ;
      if ( nDisplayMode == 1 )
      {
         sClassString = sClassString + " ErrorViewerBullet" ;
      }
      i = 1 ;
      while ( i <= httpContext.GX_msglist.getItemCount() )
      {
         httpContext.writeText( "<div>") ;
         httpContext.writeText( WebUtils.htmlEncode( httpContext.GX_msglist.getItemText((short)(i)))) ;
         httpContext.writeText( "</div>") ;
         i = (int)(i+1) ;
      }
      httpContext.writeText( "</div>") ;
   }

   public static void gx_combobox_ctrl_wml( HttpContext httpContext ,
                                            com.genexus.webpanels.HTMLChoice CObjCtrl ,
                                            String sCtrlName ,
                                            String sValue ,
                                            int nRows ,
                                            String sUserOnClickCode ,
                                            int nJScriptCode ,
                                            String sEventName ,
                                            String sType ,
                                            String sTooltipText ,
                                            int nVisible ,
                                            int nEnabled ,
                                            int nRTEnabled ,
                                            short nFormat ,
                                            int nWidth ,
                                            String nWidthUnit ,
                                            int nHeight ,
                                            String nHeightUnit ,
                                            String sStyleString ,
                                            String sClassString ,
                                            String sTags ,
                                            String sFormatedValue ,
                                            String sCallerPgm )
   {
      gx_combobox_ctrl1_wml( httpContext, CObjCtrl, sCtrlName, sValue, nRows, sUserOnClickCode, nJScriptCode, sEventName, sType, sTooltipText, nVisible, nEnabled, nRTEnabled, nFormat, nWidth, nWidthUnit, nHeight, nHeightUnit, sStyleString, sClassString, sTags, sFormatedValue, true, sCallerPgm) ;
   }

   public static void gx_combobox_ctrl1_wml( HttpContext httpContext ,
                                             com.genexus.webpanels.HTMLChoice CObjCtrl ,
                                             String sCtrlName ,
                                             String sValue ,
                                             int nRows ,
                                             String sUserOnClickCode ,
                                             int nJScriptCode ,
                                             String sEventName ,
                                             String sType ,
                                             String sTooltipText ,
                                             int nVisible ,
                                             int nEnabled ,
                                             int nRTEnabled ,
                                             short nFormat ,
                                             int nWidth ,
                                             String nWidthUnit ,
                                             int nHeight ,
                                             String nHeightUnit ,
                                             String sStyleString ,
                                             String sClassString ,
                                             String sTags ,
                                             String sFormatedValue ,
                                             boolean bSendHidden ,
                                             String sCallerPgm )
   {
      String sOStyle ;
      String sEventJsCode ;
      int idxLst ;
      String ClassHTML ;
      idxLst = 1 ;
      if ( nWidth > 0 )
      {
         sStyleString = sStyleString + ";width: " + GXutil.ltrim( GXutil.str( nWidth, 10, 0)+nWidthUnit) ;
      }
      if ( nHeight > 0 )
      {
         sStyleString = sStyleString + ";height: " + GXutil.ltrim( GXutil.str( nHeight, 10, 0)+nHeightUnit) ;
      }
      sOStyle = sStyleString + " ;overflow:hidden;" ;
      sStyleString = sStyleString + ((nVisible==0)||(nEnabled==0)&&(nRTEnabled!=0) ? ";display:none;" : "") ;
      if ( ( nEnabled != 0 ) || ( nRTEnabled != 0 ) )
      {
         /* Initialize internal JScript code according to EventNo */
         if ( nJScriptCode == 1 )
         {
            sEventJsCode = "gx.fn.closeWindow();" + "return false;" ;
         }
         else if ( nJScriptCode == 2 )
         {
            sEventJsCode = "ClearForm( this.form);" + "return false;" ;
         }
         else if ( nJScriptCode == 3 )
         {
            sEventJsCode = "gx.util.help(" + "'" + httpContext.convertURL( "Help/"+"Japanese/"+GXutil.lower( sCallerPgm)) + "');" + "return false;" ;
         }
         else if ( nJScriptCode == 7 )
         {
            sEventJsCode = "" + "gx.evt.execCliEvt(" + sEventName + ",this);" ;
         }
         else if ( nJScriptCode == 6 )
         {
            sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
         }
         else if ( nJScriptCode == 5 )
         {
            sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
         }
         else if ( nJScriptCode == 0 )
         {
            sEventJsCode = "" ;
         }
         else
         {
            sEventJsCode = "" ;
         }
         httpContext.writeText( "<select") ;
         if ( nRows > 1 )
         {
            httpContext.writeText( " size=") ;
            httpContext.writeText( GXutil.ltrim( GXutil.formatLong( nRows))) ;
         }
         httpContext.writeText( " id=\"") ;
         httpContext.writeText( sCtrlName+"\"") ;
         httpContext.writeText( " name=\"") ;
         httpContext.writeText( sCtrlName+"\"") ;
         if ( ! (GXutil.strcmp("", sTooltipText)==0) )
         {
            httpContext.writeText( " title=\"") ;
            httpContext.writeText( sTooltipText) ;
            httpContext.writeText( "\"") ;
         }
         httpContext.writeText( sTags) ;
         httpContext.writeTextNL( ">") ;
         while ( idxLst <= CObjCtrl.getItemCount() )
         {
            if ( GXutil.strcmp(sType, "int") == 0 )
            {
               httpContext.writeText( "<option value=\""+GXutil.alltrim( CObjCtrl.getItemValue((short)(idxLst)))) ;
            }
            else
            {
               httpContext.writeText( "<option value=\""+GXutil.rtrim( CObjCtrl.getItemValue((short)(idxLst)))) ;
            }
            if ( GXutil.strcmp(GXutil.ltrim( CObjCtrl.getItemValue((short)(idxLst))), GXutil.ltrim( sValue)) == 0 )
            {
               httpContext.writeText( "\" selected=\"selected\" >") ;
            }
            else
            {
               httpContext.writeText( "\">") ;
            }
            if ( nFormat == 0 )
            {
               httpContext.writeValue( CObjCtrl.getItemText((short)(idxLst))) ;
            }
            else
            {
               if ( nFormat == 3 )
               {
                  httpContext.writeValueSpace( CObjCtrl.getItemText((short)(idxLst))) ;
               }
               else
               {
                  httpContext.writeText( CObjCtrl.getItemText((short)(idxLst))) ;
               }
            }
            httpContext.writeText( httpContext.htmlEndTag( HTMLElement.OPTION)) ;
            idxLst = (int)(idxLst+1) ;
         }
         httpContext.writeTextNL( "</select>") ;
         GxWebStd.gx_ctrl_attribute_wml( httpContext, sCtrlName, "jsevent", sUserOnClickCode, false);
         GxWebStd.gx_ctrl_attribute_wml( httpContext, sCtrlName, "gxoch0", sEventJsCode, true);
      }
      if ( nEnabled == 0 )
      {
         if ( ( nRTEnabled == 0 ) && bSendHidden )
         {
         }
         if ( ( GXutil.len( sClassString) != 0 ) && ( GXutil.strSearch( sClassString, "Readonly", 1) != 1 ) )
         {
            ClassHTML = "Readonly" + sClassString ;
         }
         else
         {
            ClassHTML = sClassString ;
         }
         sOStyle = sOStyle + ((nVisible==0) ? ";display:none;" : "") ;
         idxLst = 1 ;
         while ( idxLst <= CObjCtrl.getItemCount() )
         {
            if ( GXutil.strcmp(GXutil.ltrim( CObjCtrl.getItemValue((short)(idxLst))), GXutil.ltrim( sValue)) == 0 )
            {
               if ( nFormat == 0 )
               {
                  httpContext.writeValue( CObjCtrl.getItemText((short)(idxLst))) ;
               }
               else
               {
                  if ( nFormat == 3 )
                  {
                     httpContext.writeValueSpace( CObjCtrl.getItemText((short)(idxLst))) ;
                  }
                  else
                  {
                     httpContext.writeText( CObjCtrl.getItemText((short)(idxLst))) ;
                  }
               }
               if (true) break;
            }
            idxLst = (int)(idxLst+1) ;
         }
      }
   }

   public static void gx_listbox_ctrl_wml( HttpContext httpContext ,
                                           com.genexus.webpanels.HTMLChoice LObjCtrl ,
                                           String sCtrlName ,
                                           String sValue ,
                                           int nRows ,
                                           String sUserOnClickCode ,
                                           int nJScriptCode ,
                                           String sEventName ,
                                           String sType ,
                                           String sTooltipText ,
                                           int nVisible ,
                                           int nEnabled ,
                                           int nRTEnabled ,
                                           short nFormat ,
                                           int nWidth ,
                                           String nWidthUnit ,
                                           int nHeight ,
                                           String nHeightUnit ,
                                           String sStyleString ,
                                           String sClassString ,
                                           String sTags ,
                                           String sFormatedValue ,
                                           String sCallerPgm )
   {
      gx_listbox_ctrl1_wml( httpContext, LObjCtrl, sCtrlName, sValue, nRows, sUserOnClickCode, nJScriptCode, sEventName, sType, sTooltipText, nVisible, nEnabled, nRTEnabled, nFormat, nWidth, nWidthUnit, nHeight, nHeightUnit, sStyleString, sClassString, sTags, sFormatedValue, true, sCallerPgm) ;
   }

   public static void gx_listbox_ctrl1_wml( HttpContext httpContext ,
                                            com.genexus.webpanels.HTMLChoice LObjCtrl ,
                                            String sCtrlName ,
                                            String sValue ,
                                            int nRows ,
                                            String sUserOnClickCode ,
                                            int nJScriptCode ,
                                            String sEventName ,
                                            String sType ,
                                            String sTooltipText ,
                                            int nVisible ,
                                            int nEnabled ,
                                            int nRTEnabled ,
                                            short nFormat ,
                                            int nWidth ,
                                            String nWidthUnit ,
                                            int nHeight ,
                                            String nHeightUnit ,
                                            String sStyleString ,
                                            String sClassString ,
                                            String sTags ,
                                            String sFormatedValue ,
                                            boolean bSendHidden ,
                                            String sCallerPgm )
   {
      String sOStyle ;
      String sEventJsCode ;
      int idxLst ;
      String ClassHTML ;
      idxLst = 1 ;
      if ( nWidth > 0 )
      {
         sStyleString = sStyleString + ";width: " + GXutil.ltrim( GXutil.str( nWidth, 10, 0)+nWidthUnit) ;
      }
      if ( nHeight > 0 )
      {
         sStyleString = sStyleString + ";height: " + GXutil.ltrim( GXutil.str( nHeight, 10, 0)+nHeightUnit) ;
      }
      sOStyle = sStyleString + " ;overflow:hidden;" ;
      sStyleString = sStyleString + ((nVisible==0)||(nEnabled==0)&&(nRTEnabled!=0) ? ";display:none;" : "") ;
      if ( ( nEnabled != 0 ) || ( nRTEnabled != 0 ) )
      {
         /* Initialize internal JScript code according to EventNo */
         if ( nJScriptCode == 1 )
         {
            sEventJsCode = "gx.fn.closeWindow();" + "return false;" ;
         }
         else if ( nJScriptCode == 2 )
         {
            sEventJsCode = "ClearForm( this.form);" + "return false;" ;
         }
         else if ( nJScriptCode == 3 )
         {
            sEventJsCode = "gx.util.help(" + "'" + httpContext.convertURL( "Help/"+"Japanese/"+GXutil.lower( sCallerPgm)) + "');" + "return false;" ;
         }
         else if ( nJScriptCode == 7 )
         {
            sEventJsCode = "" + "gx.evt.execCliEvt(" + sEventName + ",this);" ;
         }
         else if ( nJScriptCode == 6 )
         {
            sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
         }
         else if ( nJScriptCode == 5 )
         {
            sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
         }
         else if ( nJScriptCode == 0 )
         {
            sEventJsCode = "" ;
         }
         else
         {
            sEventJsCode = "" ;
         }
         httpContext.writeText( "<select") ;
         if ( nRows > 1 )
         {
            httpContext.writeText( " size=") ;
            httpContext.writeText( GXutil.ltrim( GXutil.formatLong( nRows))) ;
         }
         httpContext.writeText( " id=\"") ;
         httpContext.writeText( sCtrlName+"\"") ;
         httpContext.writeText( " name=\"") ;
         httpContext.writeText( sCtrlName+"\"") ;
         if ( ! (GXutil.strcmp("", sTooltipText)==0) )
         {
            httpContext.writeText( " title=\"") ;
            httpContext.writeText( sTooltipText) ;
            httpContext.writeText( "\"") ;
         }
         httpContext.writeText( sTags) ;
         httpContext.writeTextNL( ">") ;
         while ( idxLst <= LObjCtrl.getItemCount() )
         {
            if ( GXutil.strcmp(sType, "int") == 0 )
            {
               httpContext.writeText( "<option value=\""+GXutil.alltrim( LObjCtrl.getItemValue((short)(idxLst)))) ;
            }
            else
            {
               httpContext.writeText( "<option value=\""+GXutil.rtrim( LObjCtrl.getItemValue((short)(idxLst)))) ;
            }
            if ( GXutil.strcmp(GXutil.ltrim( LObjCtrl.getItemValue((short)(idxLst))), GXutil.ltrim( sValue)) == 0 )
            {
               httpContext.writeText( "\" selected=\"selected\" >") ;
            }
            else
            {
               httpContext.writeText( "\">") ;
            }
            if ( nFormat == 0 )
            {
               httpContext.writeValue( LObjCtrl.getItemText((short)(idxLst))) ;
            }
            else
            {
               if ( nFormat == 3 )
               {
                  httpContext.writeValueSpace( LObjCtrl.getItemText((short)(idxLst))) ;
               }
               else
               {
                  httpContext.writeText( LObjCtrl.getItemText((short)(idxLst))) ;
               }
            }
            httpContext.writeText( httpContext.htmlEndTag( HTMLElement.OPTION)) ;
            idxLst = (int)(idxLst+1) ;
         }
         httpContext.writeTextNL( "</select>") ;
         GxWebStd.gx_ctrl_attribute_wml( httpContext, sCtrlName, "jsevent", sUserOnClickCode, false);
         GxWebStd.gx_ctrl_attribute_wml( httpContext, sCtrlName, "gxoch0", sEventJsCode, true);
      }
      if ( nEnabled == 0 )
      {
         if ( ( nRTEnabled == 0 ) && bSendHidden )
         {
         }
         if ( ( GXutil.len( sClassString) != 0 ) && ( GXutil.strSearch( sClassString, "Readonly", 1) != 1 ) )
         {
            ClassHTML = "Readonly" + sClassString ;
         }
         else
         {
            ClassHTML = sClassString ;
         }
         sOStyle = sOStyle + ((nVisible==0) ? ";display:none;" : "") ;
         idxLst = 1 ;
         while ( idxLst <= LObjCtrl.getItemCount() )
         {
            if ( GXutil.strcmp(GXutil.ltrim( LObjCtrl.getItemValue((short)(idxLst))), GXutil.ltrim( sValue)) == 0 )
            {
               if ( nFormat == 0 )
               {
                  httpContext.writeValue( LObjCtrl.getItemText((short)(idxLst))) ;
               }
               else
               {
                  if ( nFormat == 3 )
                  {
                     httpContext.writeValueSpace( LObjCtrl.getItemText((short)(idxLst))) ;
                  }
                  else
                  {
                     httpContext.writeText( LObjCtrl.getItemText((short)(idxLst))) ;
                  }
               }
               if (true) break;
            }
            idxLst = (int)(idxLst+1) ;
         }
      }
   }

   public static void gx_radio_ctrl_wml( HttpContext httpContext ,
                                         com.genexus.webpanels.HTMLChoice RObjCtrl ,
                                         String sCtrlName ,
                                         String sValue ,
                                         String sTooltipText ,
                                         int nVisible ,
                                         int nEnabled ,
                                         int nRadioColumns ,
                                         int nOrientation ,
                                         String sStyleString ,
                                         String sClassString ,
                                         int nJScriptCode ,
                                         String sUserOnClickCode ,
                                         String sEventName ,
                                         String sTags ,
                                         String sCallerPgm )
   {
      String sEventJsCode ;
      int idxLst ;
      int idxCol ;
      String ClassHTML ;
      if ( ( nEnabled == 0 ) && ( GXutil.len( sClassString) != 0 ) && ( GXutil.strSearch( sClassString, "Readonly", 1) != 1 ) )
      {
         ClassHTML = "Readonly" + sClassString ;
      }
      else
      {
         ClassHTML = sClassString ;
      }
      /* Initialize internal JScript code according to EventNo */
      if ( nJScriptCode == 1 )
      {
         sEventJsCode = "gx.fn.closeWindow();" + "return false;" ;
      }
      else if ( nJScriptCode == 2 )
      {
         sEventJsCode = "ClearForm( this.form);" + "return false;" ;
      }
      else if ( nJScriptCode == 3 )
      {
         sEventJsCode = "gx.util.help(" + "'" + httpContext.convertURL( "Help/"+"Japanese/"+GXutil.lower( sCallerPgm)) + "');" + "return false;" ;
      }
      else if ( nJScriptCode == 7 )
      {
         sEventJsCode = "" + "gx.evt.execCliEvt(" + sEventName + ",this);" ;
      }
      else if ( nJScriptCode == 6 )
      {
         sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
      }
      else if ( nJScriptCode == 5 )
      {
         sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
      }
      else if ( nJScriptCode == 0 )
      {
         sEventJsCode = "" ;
      }
      else
      {
         sEventJsCode = "" ;
      }
      idxLst = 1 ;
      idxCol = 0 ;
      sStyleString = sStyleString + ((nVisible!=0) ? "" : ";display:none;") ;
      if ( nOrientation == 1 )
      {
         httpContext.writeText( "<table") ;
         httpContext.writeText( ">") ;
      }
      else
      {
      }
      while ( idxLst <= RObjCtrl.getItemCount() )
      {
         if ( nOrientation == 1 )
         {
            if ( nRadioColumns > 1 )
            {
               idxCol = (int)(((int)(idxCol+1) % (nRadioColumns))) ;
            }
            if ( idxCol == 0 )
            {
               httpContext.writeText( "<tr>") ;
            }
            httpContext.writeText( "<td>") ;
         }
         httpContext.skipLines( 1 );
         httpContext.writeText( "<input type=radio") ;
         httpContext.writeText( " name=\"") ;
         httpContext.writeText( sCtrlName+"\"") ;
         httpContext.writeText( " value=\"") ;
         httpContext.writeText( RObjCtrl.getItemValue((short)(idxLst))) ;
         httpContext.writeText( "\"") ;
         if ( ! (GXutil.strcmp("", sTooltipText)==0) )
         {
            httpContext.writeText( " title=\"") ;
            httpContext.writeText( sTooltipText) ;
            httpContext.writeText( "\"") ;
         }
         if ( GXutil.strcmp(sValue, RObjCtrl.getItemValue((short)(idxLst))) == 0 )
         {
            httpContext.writeText( " checked=\"checked\"") ;
         }
         httpContext.writeText( sTags) ;
         httpContext.writeText( httpContext.htmlEndTag( HTMLElement.INPUT)) ;
         GxWebStd.gx_ctrl_attribute_wml( httpContext, sCtrlName, "gxoch0", sEventJsCode, true);
         GxWebStd.gx_ctrl_attribute_wml( httpContext, sCtrlName, "jsevent", sUserOnClickCode, false);
         httpContext.writeValue( RObjCtrl.getItemText((short)(idxLst))) ;
         if ( nOrientation == 1 )
         {
            httpContext.writeText( "</td>") ;
            if ( idxCol == 0 )
            {
               httpContext.writeText( "</tr>") ;
            }
         }
         httpContext.skipLines( 1 );
         idxLst = (int)(idxLst+1) ;
      }
      if ( nOrientation == 1 )
      {
         httpContext.writeTextNL( "</table>") ;
      }
      else
      {
      }
   }

   public static void gx_checkbox_ctrl_wml( HttpContext httpContext ,
                                            String sCtrlName ,
                                            String sValue ,
                                            String sTooltipText ,
                                            int nVisible ,
                                            int nEnabled ,
                                            String sCheked ,
                                            String sCaption ,
                                            String sStyleString ,
                                            String sClassString ,
                                            String sTags )
   {
      String ClassHTML ;
      ClassHTML = sClassString ;
      sValue = GXutil.ltrim( sValue) ;
      sCheked = GXutil.ltrim( sCheked) ;
      if ( nEnabled == 0 )
      {
         if ( ( GXutil.len( sClassString) != 0 ) && ( GXutil.strSearch( sClassString, "Readonly", 1) != 1 ) )
         {
            ClassHTML = "Readonly" + sClassString ;
         }
      }
      sStyleString = sStyleString + ((nVisible!=0) ? "" : ";display:none;") ;
      httpContext.writeText( "<input type=\"checkbox\" "+((GXutil.strcmp(sValue, sCheked)==0) ? "checked=\"checked\"" : "")) ;
      httpContext.writeText( " id=\"") ;
      httpContext.writeText( sCtrlName) ;
      httpContext.writeText( "\"") ;
      httpContext.writeText( " name=\"") ;
      httpContext.writeText( sCtrlName) ;
      httpContext.writeText( "\"") ;
      httpContext.writeText( "\" value=\""+((GXutil.strcmp(sValue, sCheked)==0) ? sCheked : "")+"\"") ;
      if ( ! (GXutil.strcmp("", sTooltipText)==0) )
      {
         httpContext.writeText( " title=\"") ;
         httpContext.writeText( sTooltipText) ;
         httpContext.writeText( "\"") ;
      }
      httpContext.writeText( sTags+httpContext.htmlEndTag( HTMLElement.INPUT)) ;
      httpContext.writeText( sCaption) ;
   }

   public static void gx_bitmap_wml( HttpContext httpContext ,
                                     String sInternalName ,
                                     String sImageURL ,
                                     String sLinkURL ,
                                     String sLinkTarget ,
                                     String sAccesskey ,
                                     String sThemeName ,
                                     int nVisible ,
                                     int nEnabled ,
                                     String sAlternateText ,
                                     String sTooltipText ,
                                     int nBorderWidth ,
                                     int nAutoresize ,
                                     int nWidth ,
                                     String nWidthUnit ,
                                     int nHeight ,
                                     String nHeightUnit ,
                                     int nVerticalSpace ,
                                     int nHorizontalSpace ,
                                     int nJScriptCode ,
                                     String sUserOnClickCode ,
                                     String sEventName ,
                                     String sStyleString ,
                                     String sClassString ,
                                     String sAlign ,
                                     String sTags ,
                                     String sUseMap ,
                                     String sJsDynCode ,
                                     String sCallerPgm )
   {
      String sEventJsCode ;
      String sCapAKey ;
      sEventJsCode = "" ;
      sCapAKey = GXutil.accessKey( sTooltipText) ;
      sTooltipText = GXutil.accessKeyCaption( sTooltipText) ;
      if ( ! (GXutil.strcmp("", sCapAKey)==0) )
      {
         sAccesskey = sCapAKey ;
      }
      sStyleString = sStyleString + ((nVisible!=0) ? "" : ";display:none;") ;
      /* Initialize internal JScript code according to EventNo */
      if ( nJScriptCode == 4 )
      {
         sEventJsCode = sJsDynCode ;
      }
      else if ( nJScriptCode == 1 )
      {
         sEventJsCode = "gx.fn.closeWindow();" + "return false;" ;
      }
      else if ( nJScriptCode == 2 )
      {
         sEventJsCode = "ClearForm( this.form);" + "return false;" ;
      }
      else if ( nJScriptCode == 3 )
      {
         sEventJsCode = "gx.util.help(" + "'" + httpContext.convertURL( "Help/"+"Japanese/"+GXutil.lower( sCallerPgm)) + "');" + "return false;" ;
      }
      else if ( nJScriptCode == 7 )
      {
         sEventJsCode = "" + "gx.evt.execCliEvt(" + sEventName + ",this);" ;
      }
      else if ( nJScriptCode == 6 )
      {
         sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
      }
      else if ( nJScriptCode == 5 )
      {
         sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
      }
      else if ( nJScriptCode == 0 )
      {
         sEventJsCode = "" ;
      }
      else
      {
         sEventJsCode = "" ;
      }
      if ( GXutil.strcmp(sEventJsCode, "") != 0 )
      {
         httpContext.writeText( "<input type=\"image\" src=\"") ;
         httpContext.writeText( httpContext.convertURL( sImageURL)) ;
         httpContext.writeText( "\" name=\"") ;
         httpContext.writeText( sInternalName) ;
         httpContext.writeText( "\"") ;
         GxWebStd.gx_on_js_event_wml( httpContext, "onclick", sEventJsCode+"return false;");
         if ( nEnabled == 0 )
         {
            httpContext.writeText( " disabled=\"disabled\" ") ;
         }
      }
      else
      {
         if ( ( nEnabled != 0 ) && ( GXutil.strcmp(sLinkURL, "") != 0 ) )
         {
            GxWebStd.gx_start_js_anchor_wml( httpContext, sEventJsCode, sUserOnClickCode, sLinkURL, sLinkTarget);
         }
         httpContext.writeText( "<img src=\""+httpContext.convertURL( sImageURL)+"\"") ;
      }
      if ( GXutil.len( sAccesskey) != 0 )
      {
         httpContext.writeText( " accesskey=\"") ;
         httpContext.writeText( sAccesskey) ;
         httpContext.writeText( "\"") ;
      }
      httpContext.writeText( " id=\"") ;
      httpContext.writeText( sInternalName) ;
      httpContext.writeText( "\"") ;
      if ( ! (0==nVerticalSpace) )
      {
         httpContext.writeText( " vspace=\"") ;
         httpContext.writeText( GXutil.ltrim( GXutil.str( nVerticalSpace, 10, 0))) ;
         httpContext.writeText( "\"") ;
      }
      if ( ! (0==nHorizontalSpace) )
      {
         httpContext.writeText( " hspace=\"") ;
         httpContext.writeText( GXutil.ltrim( GXutil.str( nHorizontalSpace, 10, 0))) ;
         httpContext.writeText( "\"") ;
      }
      if ( ! (GXutil.strcmp("", sAlign)==0) )
      {
         httpContext.writeText( " align=\"") ;
         httpContext.writeText( GXutil.ltrim( sAlign)) ;
         httpContext.writeText( "\"") ;
      }
      if ( nBorderWidth > 0 )
      {
         sStyleString = sStyleString + ";border-width: " + GXutil.str( nBorderWidth, 3, 0) ;
      }
      if ( (GXutil.strcmp("", sEventJsCode)==0) || ! (GXutil.strcmp("", sAlternateText)==0) )
      {
         httpContext.writeText( " alt=\"") ;
         httpContext.writeText( sAlternateText) ;
         httpContext.writeText( "\"") ;
      }
      if ( ! (GXutil.strcmp("", sTooltipText)==0) )
      {
         httpContext.writeText( " title=\"") ;
         httpContext.writeText( sTooltipText) ;
         httpContext.writeText( "\"") ;
      }
      if ( nWidth > 0 )
      {
         sStyleString = sStyleString + ";width: " + GXutil.ltrim( GXutil.str( nWidth, 10, 0)) + nWidthUnit ;
      }
      if ( nHeight > 0 )
      {
         sStyleString = sStyleString + ";height: " + GXutil.ltrim( GXutil.str( nHeight, 10, 0)) + nHeightUnit ;
      }
      httpContext.writeText( sTags) ;
      if ( ! (GXutil.strcmp("", sUseMap)==0) )
      {
         httpContext.writeText( " usemap=\"") ;
         httpContext.writeText( sUseMap) ;
         httpContext.writeText( "\"") ;
      }
      httpContext.writeText( httpContext.htmlEndTag( HTMLElement.INPUT)) ;
      if ( GXutil.strcmp(sEventJsCode, "") != 0 )
      {
         GxWebStd.gx_ctrl_attribute_wml( httpContext, sInternalName, "jsevent", sUserOnClickCode, false);
      }
      if ( ( nEnabled != 0 ) && ( GXutil.strcmp(sLinkURL, "") != 0 ) && ( GXutil.strcmp(sEventJsCode, "") == 0 ) )
      {
         GxWebStd.gx_end_js_anchor_wml( httpContext, sEventJsCode, sUserOnClickCode, sLinkURL);
      }
   }

   public static void gx_label_ctrl_wml( HttpContext httpContext ,
                                         String sInternalName ,
                                         String sCaption ,
                                         String sLinkURL ,
                                         String sLinkTarget ,
                                         String sUserOnClickCode ,
                                         String sEventName ,
                                         String sTags ,
                                         String sClassString ,
                                         int nJScriptCode ,
                                         String sTooltipText ,
                                         int nVisible ,
                                         int nEnabled ,
                                         short nFormat ,
                                         String sCallerPgm )
   {
      String sEventJsCode ;
      String sStyle ;
      sTooltipText = ((GXutil.strcmp(sTooltipText, "")==0) ? "" : " title=\""+sTooltipText+"\"") ;
      if ( nFormat == 1 )
      {
         /* HTML Format */
         sStyle = ((nVisible!=0) ? ";display:inline;" : ";display:none;") + sTags ;
      }
      else if ( nFormat != 2 )
      {
         sStyle = ((nVisible!=0) ? "" : ";display:none;") + sTags ;
      }
      if ( nEnabled != 0 )
      {
         /* Initialize internal JScript code according to EventNo */
         if ( nJScriptCode == 1 )
         {
            sEventJsCode = "gx.fn.closeWindow();" ;
         }
         else if ( nJScriptCode == 2 )
         {
            sEventJsCode = "ClearForm( this.form);" ;
         }
         else if ( nJScriptCode == 3 )
         {
            sEventJsCode = "gx.util.help(" + "'" + httpContext.convertURL( "Help/"+"Japanese/"+GXutil.lower( sCallerPgm)) + "');" ;
         }
         else if ( nJScriptCode == 7 )
         {
            sEventJsCode = "" + "gx.evt.execCliEvt(" + sEventName + ",this);" ;
         }
         else if ( nJScriptCode == 6 )
         {
            sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
         }
         else if ( nJScriptCode == 5 )
         {
            sEventJsCode = "gx.evt.execEvt('" + sEventName + "',this);" ;
         }
         else if ( nJScriptCode == 0 )
         {
            sEventJsCode = "" ;
         }
         else
         {
            sEventJsCode = "" ;
         }
         GxWebStd.gx_start_js_anchor_wml( httpContext, sEventJsCode, sUserOnClickCode, sLinkURL, sLinkTarget);
      }
      else
      {
         sEventJsCode = "" ;
      }
      if ( nFormat == 0 )
      {
         /* Text Format */
         httpContext.writeValueEnter( sCaption) ;
      }
      else
      {
         if ( nFormat == 3 )
         {
            /* Text with meaningful spaces */
            httpContext.writeValueSpace( sCaption) ;
         }
         else if ( ( nFormat != 2 ) || ( nVisible != 0 ) )
         {
            httpContext.writeText( sCaption) ;
         }
      }
      if ( nEnabled != 0 )
      {
         GxWebStd.gx_end_js_anchor_wml( httpContext, sEventJsCode, sUserOnClickCode, sLinkURL);
      }
      if ( nFormat == 1 )
      {
      }
      else if ( nFormat != 2 )
      {
      }
      if ( ( nFormat != 0 ) && ( nFormat != 2 ) )
      {
         GxWebStd.gx_ctrl_attribute_wml( httpContext, sInternalName, "gxformat", GXutil.str( nFormat, 1, 0), false);
      }
      if ( ( nFormat == 1 ) && ( ! (GXutil.strcmp("", sEventJsCode)==0) || ! (GXutil.strcmp("", sUserOnClickCode)==0) || ! (GXutil.strcmp("", sLinkURL)==0) ) )
      {
         GxWebStd.gx_ctrl_attribute_wml( httpContext, sInternalName, "gxlink", "1", false);
      }
   }

   public static void gx_start_js_anchor_wml( HttpContext httpContext ,
                                              String sGXOnClickCode ,
                                              String sUserOnClickCode ,
                                              String sLinkURL ,
                                              String sLinkTarget )
   {
      if ( ! (GXutil.strcmp("", sUserOnClickCode)==0) )
      {
         if ( ! (GXutil.strcmp("", sGXOnClickCode)==0) )
         {
            httpContext.writeText( "<a href=\"javascript:if( ") ;
            httpContext.writeText( sUserOnClickCode) ;
            httpContext.writeText( ") {") ;
            httpContext.writeText( sGXOnClickCode) ;
            httpContext.writeText( "}\">") ;
         }
         else
         {
            httpContext.writeText( "<a href=\"javascript:") ;
            httpContext.writeText( sUserOnClickCode) ;
            httpContext.writeText( "\">") ;
         }
      }
      else
      {
         if ( ! (GXutil.strcmp("", sGXOnClickCode)==0) )
         {
            httpContext.writeText( "<a href=\"javascript:") ;
            httpContext.writeText( sGXOnClickCode) ;
            httpContext.writeText( "\">") ;
         }
         else
         {
            GxWebStd.gx_link_start_wml( httpContext, sLinkURL, sLinkTarget);
         }
      }
   }

   public static void gx_end_js_anchor_wml( HttpContext httpContext ,
                                            String sGXOnClickCode ,
                                            String sUserOnClickCode ,
                                            String sLinkURL )
   {
      if ( ! ( (GXutil.strcmp("", sGXOnClickCode)==0) && (GXutil.strcmp("", sUserOnClickCode)==0) ) )
      {
         httpContext.writeText( "</a>") ;
      }
      else
      {
         GxWebStd.gx_link_end_wml( httpContext, sLinkURL);
      }
   }

   public static boolean gx_redirect_wml( HttpContext httpContext )
   {
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.dispatchAjaxCommands();
         return true ;
      }
      else if ( httpContext.nUserReturn == 1 )
      {
         if ( httpContext.isAjaxRequest( ) )
         {
            httpContext.ajax_rsp_command_close();
            httpContext.dispatchAjaxCommands();
         }
         else
         {
            if ( (GXutil.strcmp("", httpContext.getReferer( ))==0) )
            {
               httpContext.setStream();
               httpContext.writeText( httpContext.htmlDocType( )) ;
               httpContext.writeText( "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"><title>Close window</title>") ;
               httpContext.AddJavascriptSource("gxgral.js", "?58720");
               httpContext.writeText( "</head><body><script type=\"text/javascript\">gx.evt.execLoad=false;gx.fn.closeWindow('") ;
               httpContext.writeText( httpContext.getWebReturnParmsJS( )) ;
               httpContext.writeText( "');</script></body></html>") ;
            }
            else
            {
               httpContext.redirect( httpContext.getReferer( ) );
               httpContext.windowClosed();
            }
         }
         return true ;
      }
      else
      {
         return false ;
      }
   }

   public static void gx_table_start_wml( HttpContext httpContext ,
                                          String sCtrlName ,
                                          String sHTMLid ,
                                          String sHTMLTags ,
                                          String sClassString ,
                                          int nBorder ,
                                          String sAlign ,
                                          String sTooltiptext ,
                                          int nCellpadding ,
                                          int nCellspacing ,
                                          String sStyleString ,
                                          String sRules ,
                                          int nParentIsFreeStyle )
   {
      httpContext.writeText( "<table") ;
      if ( ! (GXutil.strcmp("", sCtrlName)==0) )
      {
         httpContext.writeText( " id=\""+sHTMLid+"\"") ;
      }
      if ( ! (GXutil.strcmp("", sHTMLTags)==0) )
      {
         httpContext.writeText( sHTMLTags) ;
      }
      if ( GXutil.strcmp(sAlign, "") != 0 )
      {
         if ( GXutil.strcmp(sAlign, "center") != 0 )
         {
            sStyleString = "float:" + sAlign + ";" + sStyleString ;
         }
         else
         {
            httpContext.writeText( " align=\"") ;
            httpContext.writeText( sAlign) ;
            httpContext.writeText( "\"") ;
         }
      }
      if ( ! (0==nBorder) )
      {
         httpContext.writeText( " border=\"") ;
         httpContext.writeText( GXutil.str( nBorder, 3, 0)) ;
         httpContext.writeText( "\"") ;
      }
      httpContext.writeText( " cellpadding=\"") ;
      httpContext.writeText( GXutil.ltrim( GXutil.str( nCellpadding, 10, 0))) ;
      httpContext.writeText( "\"") ;
      httpContext.writeText( " cellspacing=\"") ;
      httpContext.writeText( GXutil.ltrim( GXutil.str( nCellspacing, 10, 0))) ;
      httpContext.writeText( "\"") ;
      if ( ( GXutil.strcmp(sRules, "") != 0 ) && ( GXutil.strcmp(sRules, "none") != 0 ) )
      {
         httpContext.writeText( " rules=\"") ;
         httpContext.writeText( sRules) ;
         httpContext.writeText( "\"") ;
      }
      if ( GXutil.strcmp(sTooltiptext, "") != 0 )
      {
         httpContext.writeText( " title=\"") ;
         httpContext.writeText( sTooltiptext) ;
         httpContext.writeText( "\"") ;
      }
      if ( nParentIsFreeStyle == 0 )
      {
      }
      httpContext.writeText( ">") ;
   }

   public static void gx_html_headers_wml( HttpContext httpContext ,
                                           int nContentType ,
                                           String sCacheCtrl ,
                                           String sCacheExp ,
                                           com.genexus.webpanels.HTMLChoice rMeta ,
                                           com.genexus.webpanels.HTMLChoice rMetaequiv ,
                                           String sIEMode )
   {
      byte wbTemp ;
      byte idxLst ;
      boolean addContentType ;
      GxWebStd.set_html_headers_wml( httpContext, nContentType, sCacheCtrl, sCacheExp);
      httpContext.setStream();
      if ( nContentType == 0 )
      {
         if ( ! httpContext.isPopUpObject( ) )
         {
            httpContext.writeTextNL( httpContext.htmlDocType( )) ;
         }
         httpContext.writeTextNL( "<html>") ;
         httpContext.writeTextNL( "<head>") ;
         idxLst = (byte)(1) ;
         while ( idxLst <= rMeta.getItemCount() )
         {
            httpContext.writeText( "<meta name=\""+GXutil.rtrim( rMeta.getItemValue(idxLst))+"\" content=\"") ;
            httpContext.writeValue( GXutil.rtrim( rMeta.getItemText(idxLst))) ;
            httpContext.writeTextNL( "\""+httpContext.htmlEndTag( HTMLElement.META)) ;
            idxLst = (byte)(idxLst+1) ;
         }
         httpContext.writeTextNL( "<meta http-equiv=\"Page-Enter\" content=\"BlendTrans(Duration=0.1)\""+httpContext.htmlEndTag( HTMLElement.META)) ;
         if ( ! (GXutil.strcmp("", sIEMode)==0) && ( httpContext.getBrowserType( ) == 1 ) && ( GXutil.strcmp(GXutil.left( httpContext.getBrowserVersion( ), 1), "8") == 0 ) )
         {
            httpContext.writeTextNL( "<meta http-equiv=\"X-UA-Compatible\" content=\""+sIEMode+"\""+httpContext.htmlEndTag( HTMLElement.META)) ;
         }
         idxLst = (byte)(1) ;
         addContentType = true ;
         while ( idxLst <= rMetaequiv.getItemCount() )
         {
            if ( GXutil.strcmp(GXutil.lower( rMetaequiv.getItemValue(idxLst)), "content-type") == 0 )
            {
               addContentType = false ;
               wbTemp = httpContext.setContentType( rMetaequiv.getItemText(idxLst)) ;
            }
            idxLst = (byte)(idxLst+1) ;
         }
         if ( addContentType )
         {
            httpContext.writeTextNL( "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\""+httpContext.htmlEndTag( HTMLElement.META)) ;
         }
         idxLst = (byte)(1) ;
         while ( idxLst <= rMetaequiv.getItemCount() )
         {
            httpContext.writeText( "<meta http-equiv=\""+GXutil.rtrim( rMetaequiv.getItemValue(idxLst))+"\" content=\"") ;
            httpContext.writeValue( GXutil.rtrim( rMetaequiv.getItemText(idxLst))) ;
            httpContext.writeTextNL( "\""+httpContext.htmlEndTag( HTMLElement.META)) ;
            idxLst = (byte)(idxLst+1) ;
         }
      }
   }

   public static void set_html_headers_wml( HttpContext httpContext ,
                                            int nContentType ,
                                            String sCacheCtrl ,
                                            String sCacheExp )
   {
      byte wbTemp ;
      if ( nContentType == 1 )
      {
         wbTemp = httpContext.setContentType( "text/vnd.wap.wml") ;
      }
      else
      {
         if ( httpContext.isAjaxRequest( ) && ! httpContext.isMultipartContent( ) )
         {
            wbTemp = httpContext.setContentType( "application/json") ;
         }
         else
         {
            wbTemp = httpContext.setContentType( "text/html") ;
         }
      }
      if ( (GXutil.strcmp("", sCacheCtrl)==0) )
      {
         wbTemp = httpContext.setHeader( "pragma", "no-cache") ;
         wbTemp = httpContext.setHeader( "Cache-Control", "no-cache, no-store") ;
      }
      else
      {
         wbTemp = httpContext.setHeader( "Cache-Control", sCacheCtrl) ;
         wbTemp = httpContext.setHeader( "Cache-Control", sCacheExp) ;
      }
   }

   public static void gx_html_textarea_wml( HttpContext httpContext ,
                                            String sCtrlName ,
                                            String sValue ,
                                            String sLinkURL ,
                                            String sTags ,
                                            short nFormat ,
                                            int nVisible ,
                                            int nEnabled ,
                                            int nRTEnabled ,
                                            int nWidth ,
                                            String sWidthUnit ,
                                            int nHeight ,
                                            String sHeightUnit ,
                                            String sStyleString ,
                                            String sClassString ,
                                            String sLength ,
                                            int nAutoResize ,
                                            String sLinkTarget ,
                                            boolean bSendHidden ,
                                            String sCallerPgm )
   {
      sStyleString = sStyleString + ((nVisible==0)||((nEnabled==0)&&(nRTEnabled==1)) ? ";display:none;" : "") ;
      if ( ( nRTEnabled != 0 ) || ( nEnabled != 0 ) )
      {
         httpContext.writeText( "<textarea ") ;
         if ( GXutil.strcmp(sWidthUnit, "chr") == 0 )
         {
            httpContext.writeText( " cols=\""+nWidth+"\" ") ;
         }
         else
         {
            sStyleString = sStyleString + ";width:" + nWidth + sWidthUnit ;
         }
         if ( GXutil.strcmp(sHeightUnit, "row") == 0 )
         {
            httpContext.writeText( " rows=\""+nHeight+"\" ") ;
         }
         else
         {
            sStyleString = sStyleString + ";height:" + nHeight + sHeightUnit ;
         }
         httpContext.writeText( " name=\""+sCtrlName+"\""+" id=\""+sCtrlName+"\" "+sTags) ;
         httpContext.writeText( " onKeyPress=\"return gx.evt.checkMaxLength(this,"+sLength+",event);\" ") ;
         httpContext.writeTextNL( ">") ;
         httpContext.writeValue( sValue) ;
         httpContext.writeTextNL( "</textarea>") ;
         GxWebStd.gx_ctrl_attribute_wml( httpContext, sCtrlName, "maxlength", sLength, false);
      }
      if ( nEnabled == 0 )
      {
         sStyleString = ((nVisible==0) ? ";display:none;" : "") ;
         sStyleString = sStyleString + ((nAutoResize==0) ? ";overflow:hidden;" : "") ;
         if ( ( nRTEnabled == 0 ) && bSendHidden )
         {
         }
         if ( ( GXutil.len( sClassString) != 0 ) && ( GXutil.strSearch( sClassString, "Readonly", 1) != 1 ) )
         {
            sClassString = "Readonly" + sClassString ;
         }
         GxWebStd.gx_link_start_wml( httpContext, sLinkURL, sLinkTarget);
         if ( nFormat == 0 )
         {
            httpContext.writeValueEnter( sValue) ;
         }
         else
         {
            if ( nFormat == 3 )
            {
               httpContext.writeValueComplete( sValue) ;
            }
            else
            {
               httpContext.writeText( sValue) ;
            }
         }
         GxWebStd.gx_link_end_wml( httpContext, sLinkURL);
      }
   }

}

