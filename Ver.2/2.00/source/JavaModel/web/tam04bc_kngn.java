/*
               File: TAM04BC_KNGN
        Description: �����p�^�[���}�X�^�i�r�W�l�X�R���|�[�l���g�j
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:14:7.12
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/tam04bc_kngn")
public final  class tam04bc_kngn extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tam04bc_kngn_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "�����p�^�[���}�X�^�i�r�W�l�X�R���|�[�l���g�j";
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

