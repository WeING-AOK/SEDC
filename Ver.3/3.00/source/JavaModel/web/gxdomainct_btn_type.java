/*
               File: CT_BTN_TYPE
        Description: CT_BTN_TYPE
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:38.76
       Program type: Callable routine
          Main DBMS: mysql
*/
public final  class gxdomainct_btn_type
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"REG"), "�V�K�E�o�^�{�^��");
      domain.put(new String((String)"UPLOAD"), "�A�b�v���[�h�{�^��");
      domain.put(new String((String)"UPD"), "�X�V�{�^��");
      domain.put(new String((String)"DLT"), "�폜�{�^��");
      domain.put(new String((String)"CPY"), "�R�s�[�{�^��");
   }

   public static String getDescription( com.genexus.internet.HttpContext httpContext ,
                                        String key )
   {
      if (domain.containsKey( key.trim() ))
      {
         return (String)domain.get( key.trim() );
      }
      else
      {
         return "";
      }
   }

   public static GxObjectCollection getValues( )
   {
      GxObjectCollection value = new GxObjectCollection(String.class, "internal", "");
      java.util.Iterator itr = domain.keySet().iterator();
      while(itr.hasNext())
      {
         value.add((String) itr.next());
      }
      return value;
   }

}
