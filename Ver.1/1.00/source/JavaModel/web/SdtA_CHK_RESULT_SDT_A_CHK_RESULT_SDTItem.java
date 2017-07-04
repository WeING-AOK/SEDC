import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem( )
   {
      this(  new ModelContext(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class));
   }

   public SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem( ModelContext context )
   {
      super( context, "SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem");
   }

   public SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem");
   }

   public SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem( StructSdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem struct )
   {
      this();
      setStruct(struct);
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1 ;
      sTagName = oReader.getName() ;
      if ( oReader.getIsSimple() == 0 )
      {
         GXSoapError = oReader.read() ;
         nOutParmCount = (short)(0) ;
         while ( ( ( GXutil.strcmp(oReader.getName(), sTagName) != 0 ) || ( oReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = (short)(0) ;
            if ( GXutil.strcmp2( oReader.getLocalName(), "ID") )
            {
               gxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FOCUS") )
            {
               gxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            nOutParmCount = (short)(nOutParmCount+1) ;
            if ( readOk == 0 )
            {
               context.globals.sSOAPErrMsg = context.globals.sSOAPErrMsg + "Error reading " + sTagName + GXutil.newLine( ) ;
               GXSoapError = (short)(nOutParmCount*-1) ;
            }
         }
      }
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "SmartEDC_SHIZUOKA" ;
      }
      oWriter.writeStartElement(sName);
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", sNameSpace);
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, GXutil.len( sNameSpace)-10) ;
      }
      oWriter.writeElement("ID", GXutil.rtrim( gxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("FOCUS", GXutil.rtrim( GXutil.booltostr( gxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("ID", gxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id);
      AddObjectProperty("FOCUS", gxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus);
   }

   public String getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( )
   {
      return gxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id ;
   }

   public void setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( String value )
   {
      gxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id = value ;
   }

   public void setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id_SetNull( )
   {
      gxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id = "" ;
   }

   public boolean getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id_IsNull( )
   {
      return false ;
   }

   public boolean getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( )
   {
      return gxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus ;
   }

   public void setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( boolean value )
   {
      gxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus = value ;
   }

   public void setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus_SetNull( )
   {
      gxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus = false ;
   }

   public boolean getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id = "" ;
      sTagName = "" ;
   }

   public SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem Clone( )
   {
      return (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)(clone()) ;
   }

   public void setStruct( StructSdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem struct )
   {
      setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id(struct.getId());
      setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus(struct.getFocus());
   }

   public StructSdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem getStruct( )
   {
      StructSdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem struct = new StructSdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem ();
      struct.setId(getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id());
      struct.setFocus(getgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean gxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus ;
   protected String gxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id ;
}
