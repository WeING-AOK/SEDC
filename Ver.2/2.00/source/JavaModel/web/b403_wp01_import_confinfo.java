/*
               File: B403_WP01_IMPORT_CONFINFO
        Description: ���ҁE�K�i���m�F���捞
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:18:6.38
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/b403_wp01_import_confinfo")
public final  class b403_wp01_import_confinfo extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b403_wp01_import_confinfo_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "���ҁE�K�i���m�F���捞";
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
