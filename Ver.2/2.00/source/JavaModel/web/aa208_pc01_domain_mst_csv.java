/*
               File: A208_PC01_DOMAIN_MST_CSV
        Description: �h���C���}�X�^CSV�o�͏���
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:41.19
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/aa208_pc01_domain_mst_csv")
public final  class aa208_pc01_domain_mst_csv extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new aa208_pc01_domain_mst_csv_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "�h���C���}�X�^CSV�o�͏���";
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

