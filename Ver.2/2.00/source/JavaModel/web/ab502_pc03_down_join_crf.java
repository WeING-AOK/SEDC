/*
               File: B502_PC03_DOWN_JOIN_CRF
        Description: CRF�����_�E�����[�h
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:7.71
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/ab502_pc03_down_join_crf")
public final  class ab502_pc03_down_join_crf extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab502_pc03_down_join_crf_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF�����_�E�����[�h";
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

