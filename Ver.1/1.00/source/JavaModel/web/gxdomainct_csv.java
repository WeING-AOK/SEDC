public final  class gxdomainct_csv
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"!c!"), "��؂蕶���G�X�P�[�v");
      domain.put(new String((String)"!n!"), "���s�G�X�P�[�v");
      domain.put(new String((String)","), "��؂蕶��");
   }

   public static String getDescription( String key )
   {
      return (String) domain.get(key);
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

