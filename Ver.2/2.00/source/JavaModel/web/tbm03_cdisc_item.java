/*
               File: TBM03_CDISC_ITEM
        Description: CDISC���ڃ}�X�^
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:14:16.29
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/tbm03_cdisc_item")
public final  class tbm03_cdisc_item extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbm03_cdisc_item_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CDISC���ڃ}�X�^";
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

