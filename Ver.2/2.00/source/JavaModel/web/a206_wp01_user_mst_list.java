/*
               File: A206_WP01_USER_MST_LIST
        Description: ���[�U�[�}�X�^�����e�i���X�i�ꗗ�j
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:56.67
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/a206_wp01_user_mst_list")
public final  class a206_wp01_user_mst_list extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a206_wp01_user_mst_list_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "���[�U�[�}�X�^�����e�i���X�i�ꗗ�j";
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
