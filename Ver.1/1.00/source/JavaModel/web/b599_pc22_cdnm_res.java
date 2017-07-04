/*
               File: B599_PC22_CDNM_RES
        Description: ���ږ��̃}�X�^�擾
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:32.90
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc22_cdnm_res extends GXProcedure
{
   public b599_pc22_cdnm_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc22_cdnm_res.class ), "" );
   }

   public b599_pc22_cdnm_res( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             GxObjectCollection[] aP2 ,
                             short[] aP3 )
   {
      b599_pc22_cdnm_res.this.AV9P_DATA_KIND = aP0;
      b599_pc22_cdnm_res.this.AV10P_ITEM_CD = aP1;
      b599_pc22_cdnm_res.this.AV13W_RTN_CSV = aP2[0];
      b599_pc22_cdnm_res.this.aP4 = new String[] {""};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        GxObjectCollection[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             GxObjectCollection[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 )
   {
      b599_pc22_cdnm_res.this.AV9P_DATA_KIND = aP0;
      b599_pc22_cdnm_res.this.AV10P_ITEM_CD = aP1;
      b599_pc22_cdnm_res.this.AV13W_RTN_CSV = aP2[0];
      this.aP2 = aP2;
      b599_pc22_cdnm_res.this.aP3 = aP3;
      b599_pc22_cdnm_res.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16C_APP_ID = "B599" ;
      AV12W_RTN_CD = (short)(0) ;
      AV14W_RTN_MSG = "" ;
      AV17W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV17W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV16C_APP_ID );
      /* Execute user subroutine: S1172 */
      S1172 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV22GXLvl31 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV9P_DATA_KIND ,
                                           AV10P_ITEM_CD ,
                                           A54TAS01_DATA_KIND ,
                                           A55TAS01_ITEM_CD ,
                                           A113TAS01_DEL_FLG },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TAS01_CDNM" ;
      /* Using cursor P00462 */
      pr_default.execute(0, new Object[] {AV9P_DATA_KIND, AV10P_ITEM_CD});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A113TAS01_DEL_FLG = P00462_A113TAS01_DEL_FLG[0] ;
         n113TAS01_DEL_FLG = P00462_n113TAS01_DEL_FLG[0] ;
         A55TAS01_ITEM_CD = P00462_A55TAS01_ITEM_CD[0] ;
         A54TAS01_DATA_KIND = P00462_A54TAS01_DATA_KIND[0] ;
         A114TAS01_UPD_CNT = P00462_A114TAS01_UPD_CNT[0] ;
         n114TAS01_UPD_CNT = P00462_n114TAS01_UPD_CNT[0] ;
         A52TAS01_UPD_PROG_NM = P00462_A52TAS01_UPD_PROG_NM[0] ;
         n52TAS01_UPD_PROG_NM = P00462_n52TAS01_UPD_PROG_NM[0] ;
         A82TAS01_UPD_USER_ID = P00462_A82TAS01_UPD_USER_ID[0] ;
         n82TAS01_UPD_USER_ID = P00462_n82TAS01_UPD_USER_ID[0] ;
         A50TAS01_UPD_DATETIME = P00462_A50TAS01_UPD_DATETIME[0] ;
         n50TAS01_UPD_DATETIME = P00462_n50TAS01_UPD_DATETIME[0] ;
         A49TAS01_CRT_PROG_NM = P00462_A49TAS01_CRT_PROG_NM[0] ;
         n49TAS01_CRT_PROG_NM = P00462_n49TAS01_CRT_PROG_NM[0] ;
         A81TAS01_CRT_USER_ID = P00462_A81TAS01_CRT_USER_ID[0] ;
         n81TAS01_CRT_USER_ID = P00462_n81TAS01_CRT_USER_ID[0] ;
         A47TAS01_CRT_DATETIME = P00462_A47TAS01_CRT_DATETIME[0] ;
         n47TAS01_CRT_DATETIME = P00462_n47TAS01_CRT_DATETIME[0] ;
         A159TAS01_NUM_5 = P00462_A159TAS01_NUM_5[0] ;
         n159TAS01_NUM_5 = P00462_n159TAS01_NUM_5[0] ;
         A158TAS01_NUM_4 = P00462_A158TAS01_NUM_4[0] ;
         n158TAS01_NUM_4 = P00462_n158TAS01_NUM_4[0] ;
         A157TAS01_NUM_3 = P00462_A157TAS01_NUM_3[0] ;
         n157TAS01_NUM_3 = P00462_n157TAS01_NUM_3[0] ;
         A156TAS01_NUM_2 = P00462_A156TAS01_NUM_2[0] ;
         n156TAS01_NUM_2 = P00462_n156TAS01_NUM_2[0] ;
         A155TAS01_NUM_1 = P00462_A155TAS01_NUM_1[0] ;
         n155TAS01_NUM_1 = P00462_n155TAS01_NUM_1[0] ;
         A154TAS01_CHAR_5 = P00462_A154TAS01_CHAR_5[0] ;
         n154TAS01_CHAR_5 = P00462_n154TAS01_CHAR_5[0] ;
         A153TAS01_CHAR_4 = P00462_A153TAS01_CHAR_4[0] ;
         n153TAS01_CHAR_4 = P00462_n153TAS01_CHAR_4[0] ;
         A152TAS01_CHAR_3 = P00462_A152TAS01_CHAR_3[0] ;
         n152TAS01_CHAR_3 = P00462_n152TAS01_CHAR_3[0] ;
         A151TAS01_CHAR_2 = P00462_A151TAS01_CHAR_2[0] ;
         n151TAS01_CHAR_2 = P00462_n151TAS01_CHAR_2[0] ;
         A150TAS01_CHAR_1 = P00462_A150TAS01_CHAR_1[0] ;
         n150TAS01_CHAR_1 = P00462_n150TAS01_CHAR_1[0] ;
         A148TAS01_DATA_KIND_NM = P00462_A148TAS01_DATA_KIND_NM[0] ;
         n148TAS01_DATA_KIND_NM = P00462_n148TAS01_DATA_KIND_NM[0] ;
         A53TAS01_ITEM_RYAK = P00462_A53TAS01_ITEM_RYAK[0] ;
         n53TAS01_ITEM_RYAK = P00462_n53TAS01_ITEM_RYAK[0] ;
         A19TAS01_ITEM_NM = P00462_A19TAS01_ITEM_NM[0] ;
         n19TAS01_ITEM_NM = P00462_n19TAS01_ITEM_NM[0] ;
         A149TAS01_SORT_NO = P00462_A149TAS01_SORT_NO[0] ;
         n149TAS01_SORT_NO = P00462_n149TAS01_SORT_NO[0] ;
         AV22GXLvl31 = (byte)(1) ;
         GXt_char1 = AV15W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A54TAS01_DATA_KIND, GXv_char2) ;
         b599_pc22_cdnm_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV15W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A55TAS01_ITEM_CD, GXv_char4) ;
         b599_pc22_cdnm_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV15W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A19TAS01_ITEM_NM, GXv_char6) ;
         b599_pc22_cdnm_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV15W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A53TAS01_ITEM_RYAK, GXv_char8) ;
         b599_pc22_cdnm_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV15W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A148TAS01_DATA_KIND_NM, GXv_char10) ;
         b599_pc22_cdnm_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV15W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A150TAS01_CHAR_1, GXv_char12) ;
         b599_pc22_cdnm_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV15W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A151TAS01_CHAR_2, GXv_char14) ;
         b599_pc22_cdnm_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV15W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A152TAS01_CHAR_3, GXv_char16) ;
         b599_pc22_cdnm_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV15W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A153TAS01_CHAR_4, GXv_char18) ;
         b599_pc22_cdnm_res.this.GXt_char17 = GXv_char18[0] ;
         GXt_char19 = AV15W_STR ;
         GXv_char20[0] = GXt_char19 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A154TAS01_CHAR_5, GXv_char20) ;
         b599_pc22_cdnm_res.this.GXt_char19 = GXv_char20[0] ;
         GXt_char21 = AV15W_STR ;
         GXv_char22[0] = GXt_char21 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A47TAS01_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char22) ;
         b599_pc22_cdnm_res.this.GXt_char21 = GXv_char22[0] ;
         GXt_char23 = AV15W_STR ;
         GXv_char24[0] = GXt_char23 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A81TAS01_CRT_USER_ID, GXv_char24) ;
         b599_pc22_cdnm_res.this.GXt_char23 = GXv_char24[0] ;
         GXt_char25 = AV15W_STR ;
         GXv_char26[0] = GXt_char25 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A49TAS01_CRT_PROG_NM, GXv_char26) ;
         b599_pc22_cdnm_res.this.GXt_char25 = GXv_char26[0] ;
         GXt_char27 = AV15W_STR ;
         GXv_char28[0] = GXt_char27 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A50TAS01_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char28) ;
         b599_pc22_cdnm_res.this.GXt_char27 = GXv_char28[0] ;
         GXt_char29 = AV15W_STR ;
         GXv_char30[0] = GXt_char29 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A82TAS01_UPD_USER_ID, GXv_char30) ;
         b599_pc22_cdnm_res.this.GXt_char29 = GXv_char30[0] ;
         GXt_char31 = AV15W_STR ;
         GXv_char32[0] = GXt_char31 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A52TAS01_UPD_PROG_NM, GXv_char32) ;
         b599_pc22_cdnm_res.this.GXt_char31 = GXv_char32[0] ;
         AV15W_STR = GXt_char1 + "," + GXt_char3 + "," + GXt_char5 + "," + GXt_char7 + "," + GXt_char9 + "," + GXutil.trim( GXutil.str( A149TAS01_SORT_NO, 10, 0)) + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXt_char19 + "," + GXutil.trim( GXutil.str( A155TAS01_NUM_1, 18, 4)) + "," + GXutil.trim( GXutil.str( A156TAS01_NUM_2, 18, 4)) + "," + GXutil.trim( GXutil.str( A157TAS01_NUM_3, 18, 4)) + "," + GXutil.trim( GXutil.str( A158TAS01_NUM_4, 18, 4)) + "," + GXutil.trim( GXutil.str( A159TAS01_NUM_5, 18, 4)) + "," + A113TAS01_DEL_FLG + "," + GXt_char21 + "," + GXt_char23 + "," + GXt_char25 + "," + GXt_char27 + "," + GXt_char29 + "," + GXt_char31 + "," + GXutil.trim( GXutil.str( A114TAS01_UPD_CNT, 10, 0)) ;
         AV13W_RTN_CSV.add(AV15W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV22GXLvl31 == 0 )
      {
         AV12W_RTN_CD = (short)(1) ;
         GXt_char31 = AV14W_RTN_MSG ;
         GXv_char32[0] = GXt_char31 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char32) ;
         b599_pc22_cdnm_res.this.GXt_char31 = GXv_char32[0] ;
         AV14W_RTN_MSG = GXt_char31 ;
      }
      cleanup();
   }

   public void S1172( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV18W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_DATA_KIND" );
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_DATA_KIND );
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV18W_PARMS_ITEM, 0);
      AV18W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_ITEM_CD" );
      AV18W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_ITEM_CD );
      AV17W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV18W_PARMS_ITEM, 0);
      AV19W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO33[0] = AV17W_EXTRA_INFO;
      GXv_int34[0] = AV12W_RTN_CD ;
      GXv_char32[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV23Pgmname, (short)(1), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO33, GXv_int34, GXv_char32) ;
      AV17W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO33[0] ;
      b599_pc22_cdnm_res.this.AV12W_RTN_CD = GXv_int34[0] ;
      b599_pc22_cdnm_res.this.AV14W_RTN_MSG = GXv_char32[0] ;
   }

   public void S1296( )
   {
      /* 'SUB_ERROR' Routine */
      AV19W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO33[0] = AV17W_EXTRA_INFO;
      GXv_int34[0] = AV12W_RTN_CD ;
      GXv_char32[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV23Pgmname, (short)(0), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO33, GXv_int34, GXv_char32) ;
      AV17W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO33[0] ;
      b599_pc22_cdnm_res.this.AV12W_RTN_CD = GXv_int34[0] ;
      b599_pc22_cdnm_res.this.AV14W_RTN_MSG = GXv_char32[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b599_pc22_cdnm_res.this.AV13W_RTN_CSV;
      this.aP3[0] = b599_pc22_cdnm_res.this.AV12W_RTN_CD;
      this.aP4[0] = b599_pc22_cdnm_res.this.AV14W_RTN_MSG;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
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
               case 1 :
                  /* Execute user subroutine: S1296 */
                  S1296 ();
                  if ( returnInSub )
                  {
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  break;
         }
      }
   }

   public void initialize( )
   {
      AV14W_RTN_MSG = "" ;
      AV16C_APP_ID = "" ;
      AV17W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      scmdbuf = "" ;
      A54TAS01_DATA_KIND = "" ;
      A55TAS01_ITEM_CD = "" ;
      A113TAS01_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P00462_A113TAS01_DEL_FLG = new String[] {""} ;
      P00462_n113TAS01_DEL_FLG = new boolean[] {false} ;
      P00462_A55TAS01_ITEM_CD = new String[] {""} ;
      P00462_A54TAS01_DATA_KIND = new String[] {""} ;
      P00462_A114TAS01_UPD_CNT = new long[1] ;
      P00462_n114TAS01_UPD_CNT = new boolean[] {false} ;
      P00462_A52TAS01_UPD_PROG_NM = new String[] {""} ;
      P00462_n52TAS01_UPD_PROG_NM = new boolean[] {false} ;
      P00462_A82TAS01_UPD_USER_ID = new String[] {""} ;
      P00462_n82TAS01_UPD_USER_ID = new boolean[] {false} ;
      P00462_A50TAS01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00462_n50TAS01_UPD_DATETIME = new boolean[] {false} ;
      P00462_A49TAS01_CRT_PROG_NM = new String[] {""} ;
      P00462_n49TAS01_CRT_PROG_NM = new boolean[] {false} ;
      P00462_A81TAS01_CRT_USER_ID = new String[] {""} ;
      P00462_n81TAS01_CRT_USER_ID = new boolean[] {false} ;
      P00462_A47TAS01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00462_n47TAS01_CRT_DATETIME = new boolean[] {false} ;
      P00462_A159TAS01_NUM_5 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00462_n159TAS01_NUM_5 = new boolean[] {false} ;
      P00462_A158TAS01_NUM_4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00462_n158TAS01_NUM_4 = new boolean[] {false} ;
      P00462_A157TAS01_NUM_3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00462_n157TAS01_NUM_3 = new boolean[] {false} ;
      P00462_A156TAS01_NUM_2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00462_n156TAS01_NUM_2 = new boolean[] {false} ;
      P00462_A155TAS01_NUM_1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00462_n155TAS01_NUM_1 = new boolean[] {false} ;
      P00462_A154TAS01_CHAR_5 = new String[] {""} ;
      P00462_n154TAS01_CHAR_5 = new boolean[] {false} ;
      P00462_A153TAS01_CHAR_4 = new String[] {""} ;
      P00462_n153TAS01_CHAR_4 = new boolean[] {false} ;
      P00462_A152TAS01_CHAR_3 = new String[] {""} ;
      P00462_n152TAS01_CHAR_3 = new boolean[] {false} ;
      P00462_A151TAS01_CHAR_2 = new String[] {""} ;
      P00462_n151TAS01_CHAR_2 = new boolean[] {false} ;
      P00462_A150TAS01_CHAR_1 = new String[] {""} ;
      P00462_n150TAS01_CHAR_1 = new boolean[] {false} ;
      P00462_A148TAS01_DATA_KIND_NM = new String[] {""} ;
      P00462_n148TAS01_DATA_KIND_NM = new boolean[] {false} ;
      P00462_A53TAS01_ITEM_RYAK = new String[] {""} ;
      P00462_n53TAS01_ITEM_RYAK = new boolean[] {false} ;
      P00462_A19TAS01_ITEM_NM = new String[] {""} ;
      P00462_n19TAS01_ITEM_NM = new boolean[] {false} ;
      P00462_A149TAS01_SORT_NO = new short[1] ;
      P00462_n149TAS01_SORT_NO = new boolean[] {false} ;
      A52TAS01_UPD_PROG_NM = "" ;
      A82TAS01_UPD_USER_ID = "" ;
      A50TAS01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A49TAS01_CRT_PROG_NM = "" ;
      A81TAS01_CRT_USER_ID = "" ;
      A47TAS01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A159TAS01_NUM_5 = DecimalUtil.ZERO ;
      A158TAS01_NUM_4 = DecimalUtil.ZERO ;
      A157TAS01_NUM_3 = DecimalUtil.ZERO ;
      A156TAS01_NUM_2 = DecimalUtil.ZERO ;
      A155TAS01_NUM_1 = DecimalUtil.ZERO ;
      A154TAS01_CHAR_5 = "" ;
      A153TAS01_CHAR_4 = "" ;
      A152TAS01_CHAR_3 = "" ;
      A151TAS01_CHAR_2 = "" ;
      A150TAS01_CHAR_1 = "" ;
      A148TAS01_DATA_KIND_NM = "" ;
      A53TAS01_ITEM_RYAK = "" ;
      A19TAS01_ITEM_NM = "" ;
      AV15W_STR = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      GXt_char3 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char5 = "" ;
      GXv_char6 = new String [1] ;
      GXt_char7 = "" ;
      GXv_char8 = new String [1] ;
      GXt_char9 = "" ;
      GXv_char10 = new String [1] ;
      GXt_char11 = "" ;
      GXv_char12 = new String [1] ;
      GXt_char13 = "" ;
      GXv_char14 = new String [1] ;
      GXt_char15 = "" ;
      GXv_char16 = new String [1] ;
      GXt_char17 = "" ;
      GXv_char18 = new String [1] ;
      GXt_char19 = "" ;
      GXv_char20 = new String [1] ;
      GXt_char21 = "" ;
      GXv_char22 = new String [1] ;
      GXt_char23 = "" ;
      GXv_char24 = new String [1] ;
      GXt_char25 = "" ;
      GXv_char26 = new String [1] ;
      GXt_char27 = "" ;
      GXv_char28 = new String [1] ;
      GXt_char29 = "" ;
      GXv_char30 = new String [1] ;
      GXt_char31 = "" ;
      AV18W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_MSG = "" ;
      AV23Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO33 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int34 = new short [1] ;
      GXv_char32 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc22_cdnm_res__default(),
         new Object[] {
             new Object[] {
            P00462_A113TAS01_DEL_FLG, P00462_n113TAS01_DEL_FLG, P00462_A55TAS01_ITEM_CD, P00462_A54TAS01_DATA_KIND, P00462_A114TAS01_UPD_CNT, P00462_n114TAS01_UPD_CNT, P00462_A52TAS01_UPD_PROG_NM, P00462_n52TAS01_UPD_PROG_NM, P00462_A82TAS01_UPD_USER_ID, P00462_n82TAS01_UPD_USER_ID,
            P00462_A50TAS01_UPD_DATETIME, P00462_n50TAS01_UPD_DATETIME, P00462_A49TAS01_CRT_PROG_NM, P00462_n49TAS01_CRT_PROG_NM, P00462_A81TAS01_CRT_USER_ID, P00462_n81TAS01_CRT_USER_ID, P00462_A47TAS01_CRT_DATETIME, P00462_n47TAS01_CRT_DATETIME, P00462_A159TAS01_NUM_5, P00462_n159TAS01_NUM_5,
            P00462_A158TAS01_NUM_4, P00462_n158TAS01_NUM_4, P00462_A157TAS01_NUM_3, P00462_n157TAS01_NUM_3, P00462_A156TAS01_NUM_2, P00462_n156TAS01_NUM_2, P00462_A155TAS01_NUM_1, P00462_n155TAS01_NUM_1, P00462_A154TAS01_CHAR_5, P00462_n154TAS01_CHAR_5,
            P00462_A153TAS01_CHAR_4, P00462_n153TAS01_CHAR_4, P00462_A152TAS01_CHAR_3, P00462_n152TAS01_CHAR_3, P00462_A151TAS01_CHAR_2, P00462_n151TAS01_CHAR_2, P00462_A150TAS01_CHAR_1, P00462_n150TAS01_CHAR_1, P00462_A148TAS01_DATA_KIND_NM, P00462_n148TAS01_DATA_KIND_NM,
            P00462_A53TAS01_ITEM_RYAK, P00462_n53TAS01_ITEM_RYAK, P00462_A19TAS01_ITEM_NM, P00462_n19TAS01_ITEM_NM, P00462_A149TAS01_SORT_NO, P00462_n149TAS01_SORT_NO
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV23Pgmname = "B599_PC22_CDNM_RES" ;
      /* GeneXus formulas. */
      AV23Pgmname = "B599_PC22_CDNM_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV22GXLvl31 ;
   private short AV12W_RTN_CD ;
   private short A149TAS01_SORT_NO ;
   private short GXv_int34[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long A114TAS01_UPD_CNT ;
   private java.math.BigDecimal A159TAS01_NUM_5 ;
   private java.math.BigDecimal A158TAS01_NUM_4 ;
   private java.math.BigDecimal A157TAS01_NUM_3 ;
   private java.math.BigDecimal A156TAS01_NUM_2 ;
   private java.math.BigDecimal A155TAS01_NUM_1 ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String GXt_char5 ;
   private String GXv_char6[] ;
   private String GXt_char7 ;
   private String GXv_char8[] ;
   private String GXt_char9 ;
   private String GXv_char10[] ;
   private String GXt_char11 ;
   private String GXv_char12[] ;
   private String GXt_char13 ;
   private String GXv_char14[] ;
   private String GXt_char15 ;
   private String GXv_char16[] ;
   private String GXt_char17 ;
   private String GXv_char18[] ;
   private String GXt_char19 ;
   private String GXv_char20[] ;
   private String GXt_char21 ;
   private String GXv_char22[] ;
   private String GXt_char23 ;
   private String GXv_char24[] ;
   private String GXt_char25 ;
   private String GXv_char26[] ;
   private String GXt_char27 ;
   private String GXv_char28[] ;
   private String GXt_char29 ;
   private String GXv_char30[] ;
   private String GXt_char31 ;
   private String AV23Pgmname ;
   private String GXv_char32[] ;
   private String Gx_emsg ;
   private java.util.Date A50TAS01_UPD_DATETIME ;
   private java.util.Date A47TAS01_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n113TAS01_DEL_FLG ;
   private boolean n114TAS01_UPD_CNT ;
   private boolean n52TAS01_UPD_PROG_NM ;
   private boolean n82TAS01_UPD_USER_ID ;
   private boolean n50TAS01_UPD_DATETIME ;
   private boolean n49TAS01_CRT_PROG_NM ;
   private boolean n81TAS01_CRT_USER_ID ;
   private boolean n47TAS01_CRT_DATETIME ;
   private boolean n159TAS01_NUM_5 ;
   private boolean n158TAS01_NUM_4 ;
   private boolean n157TAS01_NUM_3 ;
   private boolean n156TAS01_NUM_2 ;
   private boolean n155TAS01_NUM_1 ;
   private boolean n154TAS01_CHAR_5 ;
   private boolean n153TAS01_CHAR_4 ;
   private boolean n152TAS01_CHAR_3 ;
   private boolean n151TAS01_CHAR_2 ;
   private boolean n150TAS01_CHAR_1 ;
   private boolean n148TAS01_DATA_KIND_NM ;
   private boolean n53TAS01_ITEM_RYAK ;
   private boolean n19TAS01_ITEM_NM ;
   private boolean n149TAS01_SORT_NO ;
   private String AV9P_DATA_KIND ;
   private String AV10P_ITEM_CD ;
   private String AV14W_RTN_MSG ;
   private String AV16C_APP_ID ;
   private String A54TAS01_DATA_KIND ;
   private String A55TAS01_ITEM_CD ;
   private String A113TAS01_DEL_FLG ;
   private String A52TAS01_UPD_PROG_NM ;
   private String A82TAS01_UPD_USER_ID ;
   private String A49TAS01_CRT_PROG_NM ;
   private String A81TAS01_CRT_USER_ID ;
   private String A154TAS01_CHAR_5 ;
   private String A153TAS01_CHAR_4 ;
   private String A152TAS01_CHAR_3 ;
   private String A151TAS01_CHAR_2 ;
   private String A150TAS01_CHAR_1 ;
   private String A148TAS01_DATA_KIND_NM ;
   private String A53TAS01_ITEM_RYAK ;
   private String A19TAS01_ITEM_NM ;
   private String AV15W_STR ;
   private String AV19W_MSG ;
   private GxObjectCollection[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00462_A113TAS01_DEL_FLG ;
   private boolean[] P00462_n113TAS01_DEL_FLG ;
   private String[] P00462_A55TAS01_ITEM_CD ;
   private String[] P00462_A54TAS01_DATA_KIND ;
   private long[] P00462_A114TAS01_UPD_CNT ;
   private boolean[] P00462_n114TAS01_UPD_CNT ;
   private String[] P00462_A52TAS01_UPD_PROG_NM ;
   private boolean[] P00462_n52TAS01_UPD_PROG_NM ;
   private String[] P00462_A82TAS01_UPD_USER_ID ;
   private boolean[] P00462_n82TAS01_UPD_USER_ID ;
   private java.util.Date[] P00462_A50TAS01_UPD_DATETIME ;
   private boolean[] P00462_n50TAS01_UPD_DATETIME ;
   private String[] P00462_A49TAS01_CRT_PROG_NM ;
   private boolean[] P00462_n49TAS01_CRT_PROG_NM ;
   private String[] P00462_A81TAS01_CRT_USER_ID ;
   private boolean[] P00462_n81TAS01_CRT_USER_ID ;
   private java.util.Date[] P00462_A47TAS01_CRT_DATETIME ;
   private boolean[] P00462_n47TAS01_CRT_DATETIME ;
   private java.math.BigDecimal[] P00462_A159TAS01_NUM_5 ;
   private boolean[] P00462_n159TAS01_NUM_5 ;
   private java.math.BigDecimal[] P00462_A158TAS01_NUM_4 ;
   private boolean[] P00462_n158TAS01_NUM_4 ;
   private java.math.BigDecimal[] P00462_A157TAS01_NUM_3 ;
   private boolean[] P00462_n157TAS01_NUM_3 ;
   private java.math.BigDecimal[] P00462_A156TAS01_NUM_2 ;
   private boolean[] P00462_n156TAS01_NUM_2 ;
   private java.math.BigDecimal[] P00462_A155TAS01_NUM_1 ;
   private boolean[] P00462_n155TAS01_NUM_1 ;
   private String[] P00462_A154TAS01_CHAR_5 ;
   private boolean[] P00462_n154TAS01_CHAR_5 ;
   private String[] P00462_A153TAS01_CHAR_4 ;
   private boolean[] P00462_n153TAS01_CHAR_4 ;
   private String[] P00462_A152TAS01_CHAR_3 ;
   private boolean[] P00462_n152TAS01_CHAR_3 ;
   private String[] P00462_A151TAS01_CHAR_2 ;
   private boolean[] P00462_n151TAS01_CHAR_2 ;
   private String[] P00462_A150TAS01_CHAR_1 ;
   private boolean[] P00462_n150TAS01_CHAR_1 ;
   private String[] P00462_A148TAS01_DATA_KIND_NM ;
   private boolean[] P00462_n148TAS01_DATA_KIND_NM ;
   private String[] P00462_A53TAS01_ITEM_RYAK ;
   private boolean[] P00462_n53TAS01_ITEM_RYAK ;
   private String[] P00462_A19TAS01_ITEM_NM ;
   private boolean[] P00462_n19TAS01_ITEM_NM ;
   private short[] P00462_A149TAS01_SORT_NO ;
   private boolean[] P00462_n149TAS01_SORT_NO ;
   private GxObjectCollection AV13W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV17W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO33[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV18W_PARMS_ITEM ;
}

final  class b599_pc22_cdnm_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00462( com.genexus.internet.HttpContext httpContext ,
                                          String AV9P_DATA_KIND ,
                                          String AV10P_ITEM_CD ,
                                          String A54TAS01_DATA_KIND ,
                                          String A55TAS01_ITEM_CD ,
                                          String A113TAS01_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int35 ;
      GXv_int35 = new byte [2] ;
      Object[] GXv_Object36 ;
      GXv_Object36 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TAS01_CDNM" ;
      scmdbuf = "SELECT `TAS01_DEL_FLG`, `TAS01_ITEM_CD`, `TAS01_DATA_KIND`, `TAS01_UPD_CNT`, `TAS01_UPD_PROG_NM`," ;
      scmdbuf = scmdbuf + " `TAS01_UPD_USER_ID`, `TAS01_UPD_DATETIME`, `TAS01_CRT_PROG_NM`, `TAS01_CRT_USER_ID`," ;
      scmdbuf = scmdbuf + " `TAS01_CRT_DATETIME`, `TAS01_NUM_5`, `TAS01_NUM_4`, `TAS01_NUM_3`, `TAS01_NUM_2`," ;
      scmdbuf = scmdbuf + " `TAS01_NUM_1`, `TAS01_CHAR_5`, `TAS01_CHAR_4`, `TAS01_CHAR_3`, `TAS01_CHAR_2`, `TAS01_CHAR_1`," ;
      scmdbuf = scmdbuf + " `TAS01_DATA_KIND_NM`, `TAS01_ITEM_RYAK`, `TAS01_ITEM_NM`, `TAS01_SORT_NO` FROM `TAS01_CDNM`" ;
      scmdbuf = scmdbuf + " WHERE (`TAS01_DEL_FLG` = '0')" ;
      if ( ! (GXutil.strcmp("", AV9P_DATA_KIND)==0) )
      {
         sWhereString = sWhereString + " and (`TAS01_DATA_KIND` = ?)" ;
      }
      else
      {
         GXv_int35[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10P_ITEM_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TAS01_ITEM_CD` = ?)" ;
      }
      else
      {
         GXv_int35[1] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TAS01_DATA_KIND`, `TAS01_SORT_NO`, `TAS01_ITEM_CD`" ;
      GXv_Object36[0] = scmdbuf ;
      GXv_Object36[1] = GXv_int35 ;
      return GXv_Object36 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P00462(httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00462", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,4) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,4) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(13,4) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(14,4) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(15,4) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(24) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               break;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx ;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[2], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 4);
               }
               break;
      }
   }

}
