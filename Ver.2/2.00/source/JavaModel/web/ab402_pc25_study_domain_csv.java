/*
               File: B402_PC25_STUDY_DOMAIN_CSV
        Description: �����ʃh���C���}�X�^CSV�o�͏���
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:42.19
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/ab402_pc25_study_domain_csv")
public final  class ab402_pc25_study_domain_csv extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab402_pc25_study_domain_csv_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "�����ʃh���C���}�X�^CSV�o�͏���";
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

