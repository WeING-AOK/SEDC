/*
               File: TBW13_CSV_RECORD
        Description: CSV���R�[�h���[�N
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:29.64
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/tbw13_csv_record")
public final  class tbw13_csv_record extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbw13_csv_record_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CSV���R�[�h���[�N";
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

