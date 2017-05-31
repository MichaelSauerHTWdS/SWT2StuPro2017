public enum Waren{
    Tuche, 
    Stockfisch, 
    Bier,
    Wein,
    Zinn,
    Salz,
    Pelze,
    Kupfer;
  
    /* Warum braucht man das, das ist doch schon im enum drin?
    private String warenName;
    */
    
    /* könnte man auch so aufrufen, wenn man es benötigt
    public static int warenAnzahl = Waren.values().length;
    */
  
    /* Warum braucht man das, das ist doch schon im enum drin?
    Waren(int warenIndex){
        this.warenName=warenIndex;
     }*/
  
    /* s.o.
    public String getwarenName(){
      return warenName;
    }*/
  
      
    /* Das mit der Anzahl macht m. E. so keinen Sinn, denn man bracht ja
    sicher mehrere Lager von Waren und die können dann ja nicht alle die
    gleiche Anzahl haben.
    public int getwarenAnzahl()
    {
        return warenAnzahl;
    }
    */
};
