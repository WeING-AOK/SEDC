/*
               File: B502_PC02_UP_CRF
        Description: CRFアップロード
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:52.37
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/ab502_pc02_up_crf")
public final  class ab502_pc02_up_crf extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab502_pc02_up_crf_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRFアップロード";
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

}

