public enum Waren{
    0("Tuche"), 
    1("Stockfisch"), 
    2("Bier"),
    3("Wein"),
    4("Zinn"),
    5("Salz"),
    6("Pelze"),
    7("Kupfer");
  
    private String warenName;
    public static int warenAnzahl = Waren.values().length;
  
    Waren(int warenIndex){
        this.warenName=warenIndex;
     }
  
    public String getwarenName(){
      return warenName;
    }
  
      public int getwarenAnzahl(){
      return warenAnzahl;
    }
};
