/*
               File: TBW14_CRF_SDT_WORK
        Description: CRF����SDT���[�N
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:31.32
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/tbw14_crf_sdt_work")
public final  class tbw14_crf_sdt_work extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbw14_crf_sdt_work_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF����SDT���[�N";
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

