/*
               File: B717_WP01_REKIINFO_CRF
        Description: CRF�����ڍ׏����
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:19:45.62
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/b717_wp01_rekiinfo_crf")
public final  class b717_wp01_rekiinfo_crf extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b717_wp01_rekiinfo_crf_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF�����ڍ׏����";
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

