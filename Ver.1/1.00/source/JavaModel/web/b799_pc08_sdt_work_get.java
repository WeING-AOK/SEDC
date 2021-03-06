/*
               File: B799_PC08_SDT_WORK_GET
        Description: SDTワークテーブル取得処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:4.66
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b799_pc08_sdt_work_get extends GXProcedure
{
   public b799_pc08_sdt_work_get( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b799_pc08_sdt_work_get.class ), "" );
   }

   public b799_pc08_sdt_work_get( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             java.util.Date aP1 ,
                             long aP2 ,
                             int aP3 ,
                             short aP4 ,
                             short aP5 ,
                             SdtB792_SD01_CRF[] aP6 ,
                             String[] aP7 )
   {
      b799_pc08_sdt_work_get.this.AV9P_SESSION_ID = aP0;
      b799_pc08_sdt_work_get.this.AV8P_DISP_DATETIME = aP1;
      b799_pc08_sdt_work_get.this.AV12P_TBT02_STUDY_ID = aP2;
      b799_pc08_sdt_work_get.this.AV13P_TBT02_SUBJECT_ID = aP3;
      b799_pc08_sdt_work_get.this.AV10P_TBT02_CRF_ID = aP4;
      b799_pc08_sdt_work_get.this.AV11P_TBT02_CRF_LATEST_VERSION = aP5;
      b799_pc08_sdt_work_get.this.aP8 = new String[] {""};
      initialize();
      privateExecute();
      return aP8[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        long aP2 ,
                        int aP3 ,
                        short aP4 ,
                        short aP5 ,
                        SdtB792_SD01_CRF[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             long aP2 ,
                             int aP3 ,
                             short aP4 ,
                             short aP5 ,
                             SdtB792_SD01_CRF[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      b799_pc08_sdt_work_get.this.AV9P_SESSION_ID = aP0;
      b799_pc08_sdt_work_get.this.AV8P_DISP_DATETIME = aP1;
      b799_pc08_sdt_work_get.this.AV12P_TBT02_STUDY_ID = aP2;
      b799_pc08_sdt_work_get.this.AV13P_TBT02_SUBJECT_ID = aP3;
      b799_pc08_sdt_work_get.this.AV10P_TBT02_CRF_ID = aP4;
      b799_pc08_sdt_work_get.this.AV11P_TBT02_CRF_LATEST_VERSION = aP5;
      b799_pc08_sdt_work_get.this.aP6 = aP6;
      b799_pc08_sdt_work_get.this.aP7 = aP7;
      b799_pc08_sdt_work_get.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16W_RTN_CD = "0" ;
      AV15W_MSG = "" ;
      AV14SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().clear();
      GXt_char1 = AV17W_TBW01_DISP_DATETIME ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV8P_DISP_DATETIME, "YYYYMMDDHHMISS", GXv_char2) ;
      b799_pc08_sdt_work_get.this.GXt_char1 = GXv_char2[0] ;
      AV17W_TBW01_DISP_DATETIME = GXt_char1 ;
      AV20GXLvl25 = (byte)(0) ;
      /* Using cursor P005J2 */
      pr_default.execute(0, new Object[] {AV9P_SESSION_ID, AV17W_TBW01_DISP_DATETIME, new Long(AV12P_TBT02_STUDY_ID), new Integer(AV13P_TBT02_SUBJECT_ID), new Short(AV10P_TBT02_CRF_ID), new Short(AV11P_TBT02_CRF_LATEST_VERSION)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A881TBW14_CRF_LATEST_VERSION = P005J2_A881TBW14_CRF_LATEST_VERSION[0] ;
         A880TBW14_CRF_ID = P005J2_A880TBW14_CRF_ID[0] ;
         A883TBW14_SUBJECT_ID = P005J2_A883TBW14_SUBJECT_ID[0] ;
         A878TBW14_STUDY_ID = P005J2_A878TBW14_STUDY_ID[0] ;
         A876TBW14_DISP_DATETIME = P005J2_A876TBW14_DISP_DATETIME[0] ;
         A875TBW14_SESSION_ID = P005J2_A875TBW14_SESSION_ID[0] ;
         A882TBW14_SDT_SAVE = P005J2_A882TBW14_SDT_SAVE[0] ;
         n882TBW14_SDT_SAVE = P005J2_n882TBW14_SDT_SAVE[0] ;
         AV20GXLvl25 = (byte)(1) ;
         AV14SD_B792_SD01_CRF.fromxml(A882TBW14_SDT_SAVE, "");
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV20GXLvl25 == 0 )
      {
         AV16W_RTN_CD = "2" ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = b799_pc08_sdt_work_get.this.AV14SD_B792_SD01_CRF;
      this.aP7[0] = b799_pc08_sdt_work_get.this.AV16W_RTN_CD;
      this.aP8[0] = b799_pc08_sdt_work_get.this.AV15W_MSG;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14SD_B792_SD01_CRF = new SdtB792_SD01_CRF(remoteHandle, context);
      AV16W_RTN_CD = "" ;
      AV15W_MSG = "" ;
      AV17W_TBW01_DISP_DATETIME = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      scmdbuf = "" ;
      P005J2_A881TBW14_CRF_LATEST_VERSION = new short[1] ;
      P005J2_A880TBW14_CRF_ID = new short[1] ;
      P005J2_A883TBW14_SUBJECT_ID = new int[1] ;
      P005J2_A878TBW14_STUDY_ID = new long[1] ;
      P005J2_A876TBW14_DISP_DATETIME = new String[] {""} ;
      P005J2_A875TBW14_SESSION_ID = new String[] {""} ;
      P005J2_A882TBW14_SDT_SAVE = new String[] {""} ;
      P005J2_n882TBW14_SDT_SAVE = new boolean[] {false} ;
      A876TBW14_DISP_DATETIME = "" ;
      A875TBW14_SESSION_ID = "" ;
      A882TBW14_SDT_SAVE = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b799_pc08_sdt_work_get__default(),
         new Object[] {
             new Object[] {
            P005J2_A881TBW14_CRF_LATEST_VERSION, P005J2_A880TBW14_CRF_ID, P005J2_A883TBW14_SUBJECT_ID, P005J2_A878TBW14_STUDY_ID, P005J2_A876TBW14_DISP_DATETIME, P005J2_A875TBW14_SESSION_ID, P005J2_A882TBW14_SDT_SAVE, P005J2_n882TBW14_SDT_SAVE
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20GXLvl25 ;
   private short AV10P_TBT02_CRF_ID ;
   private short AV11P_TBT02_CRF_LATEST_VERSION ;
   private short A881TBW14_CRF_LATEST_VERSION ;
   private short A880TBW14_CRF_ID ;
   private short Gx_err ;
   private int AV13P_TBT02_SUBJECT_ID ;
   private int A883TBW14_SUBJECT_ID ;
   private long AV12P_TBT02_STUDY_ID ;
   private long A878TBW14_STUDY_ID ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private java.util.Date AV8P_DISP_DATETIME ;
   private boolean n882TBW14_SDT_SAVE ;
   private String A882TBW14_SDT_SAVE ;
   private String AV9P_SESSION_ID ;
   private String AV16W_RTN_CD ;
   private String AV15W_MSG ;
   private String AV17W_TBW01_DISP_DATETIME ;
   private String A876TBW14_DISP_DATETIME ;
   private String A875TBW14_SESSION_ID ;
   private SdtB792_SD01_CRF[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private short[] P005J2_A881TBW14_CRF_LATEST_VERSION ;
   private short[] P005J2_A880TBW14_CRF_ID ;
   private int[] P005J2_A883TBW14_SUBJECT_ID ;
   private long[] P005J2_A878TBW14_STUDY_ID ;
   private String[] P005J2_A876TBW14_DISP_DATETIME ;
   private String[] P005J2_A875TBW14_SESSION_ID ;
   private String[] P005J2_A882TBW14_SDT_SAVE ;
   private boolean[] P005J2_n882TBW14_SDT_SAVE ;
   private SdtB792_SD01_CRF AV14SD_B792_SD01_CRF ;
}

final  class b799_pc08_sdt_work_get__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005J2", "SELECT `TBW14_CRF_LATEST_VERSION`, `TBW14_CRF_ID`, `TBW14_SUBJECT_ID`, `TBW14_STUDY_ID`, `TBW14_DISP_DATETIME`, `TBW14_SESSION_ID`, `TBW14_SDT_SAVE` FROM `TBW14_CRF_SDT_WORK` WHERE `TBW14_SESSION_ID` = ? and `TBW14_DISP_DATETIME` = ? and `TBW14_STUDY_ID` = ? and `TBW14_SUBJECT_ID` = ? and `TBW14_CRF_ID` = ? and `TBW14_CRF_LATEST_VERSION` = ? ORDER BY `TBW14_SESSION_ID`, `TBW14_DISP_DATETIME`, `TBW14_STUDY_ID`, `TBW14_SUBJECT_ID`, `TBW14_CRF_ID`, `TBW14_CRF_LATEST_VERSION`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getLongVarchar(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 14);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
      }
   }

}

