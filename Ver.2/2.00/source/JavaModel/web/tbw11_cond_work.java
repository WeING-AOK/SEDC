/*
               File: TBW11_COND_WORK
        Description: TBW11_�������[�N�e�[�u��
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:27.11
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/tbw11_cond_work")
public final  class tbw11_cond_work extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbw11_cond_work_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "TBW11_�������[�N�e�[�u��";
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

