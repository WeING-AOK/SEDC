/*
               File: TAT01_SEL
        Description: ���m�点���e�[�u�������v�����v�g
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:47.65
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/tat01_sel")
public final  class tat01_sel extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tat01_sel_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "���m�点���e�[�u�������v�����v�g";
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

