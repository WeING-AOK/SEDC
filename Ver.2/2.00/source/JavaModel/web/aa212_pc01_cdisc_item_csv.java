/*
               File: A212_PC01_CDISC_ITEM_CSV
        Description: �h���C���ϐ��}�X�^CSV�o�͏���
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:41.65
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/aa212_pc01_cdisc_item_csv")
public final  class aa212_pc01_cdisc_item_csv extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new aa212_pc01_cdisc_item_csv_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "�h���C���ϐ��}�X�^CSV�o�͏���";
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

