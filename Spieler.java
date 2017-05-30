public class Spieler{
  
  String spielerName;
  short spielerNummer;//key
  short spielerHafen;
  boolean begruesst; //(Indikator Spielbeginn Spieler)
  boolean bankrott;
  
  public boolean boolchk(char[] argTrue){ //Funktion zum ueberprüfen einer Wahrheitsaussage (Schleifen, Korrektureingaben etc)
  if(argTrue[0] = "Y" || argTrue[0] = "y" || argTrue[0] = "J" || argTrue[0] = "j" ){ 
    return TRUE;
  }
    return FALSE;  
    
  //Getter
  
  public String getspielerName(){
    return spielerName;
  }
  
  public String getspielerHafen(){
    return spielerHafen;
  }
  
  public String getspielerbegruesst(){
    return spielerbegruesst;
  }
  
  public String getspielerbankrott(){
    return spielerbankrott;
  }
  //Setter
  
  public void setspielerbankrott(){
    this.bankrott==true;
  }
  
  public void setspielerbegruesst(){
    this.spielerBegruesst==true;
  }
  
  public String spielerNamezuweisen() throws Spielerexception{
    private boolean thisexit == FALSE;
    private char testbuchstabe = ' ';
    private String vorname="";
    private String nachname="";
    private String spielername="";
    do{
        vorname = Stdin.readlnchar[]("Geben Sie einen Vornamen ein: ");
        nachname = Stdin.readlnchar[]("Geben Sie einen Nachnamen ein: ");
        spielername= vorname + " " + nachname;
          if(spielername.length>=21){
            throw new SpielerException("Der Spielername"+spielername+"ist zu lang, bitte maximal 20 Zeichen eingeben!");
            thisexit==FALSE;
          }
          if(spielername<21){
            testbuchstabe = Stdin.readlnchar("Moechten Sie den Spielernamen"+spielername+"anlegen (Ja/Nein)")
            thisexit=boolchk(testbuchstabe);
          }
    }(while(thisexit == FALSE)
    return spielername;
  }
  
    
  public void setspielerName(){
        this.spielerName=Spielername;
   }
  
    public void setspielerHafen(){
      this.spielerHafen=spielerHafenZuweisen();
    system.out.println("Sie wurden von dem Hafen "+spielerHafen+" als Haendler akzeptiert!"
  }
  
  /*
- Schiffliste
- Kontore mit individuellen Füllständen
- Kontostand
*/


}
