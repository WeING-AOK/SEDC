public final  class gxdomainct_flg
{
   private static java.util.TreeMap domain = new java.util.TreeMap();
   static
   {
      domain.put(new String((String)"1"), "�t���OON");
      domain.put(new String((String)"0"), "�t���OOFF");
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

