/*
               File: A104_WP01_HEADER
        Description: �w�b�_�[
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:38.48
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/a104_wp01_header")
public final  class a104_wp01_header extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a104_wp01_header_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "�w�b�_�[";
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
