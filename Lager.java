//Spieleprojekt-Kontor-2017
//enum Waren nun eigene Klasse


public class Lager{
  private int lager; 
  //private int const anzahlWaren=8;//sizeof enum?
  // Ein bisschen Starthilfe: Das Schlüsselwort const ist reserviert, wird aber
  // von Java nicht benutzt. In Java heißt das final!
  private final int anzahlWaren = Waren.values().length;
  // s.o. + bei Konstanten muss eine Definition enthalten sein!        
  private final int lagerMengeMin=0;
  //Min= Sperrbestand bei dem z.B. beim Kontor wieder waren dazugebucht werden muessen 
  //(Vorgabe Kontor unendlich Waren eines Typs)
  
  /** Max= maximale kapazitaet eines Lagers.
  * nach deren ueberschreiten werden entweder 
  * keine Waren mehr akzeptiert oder nicht mehr verbucht
  */
  private final int lagerMengeMax=100;

  /* Ab hier sollte der Autor dann doch selber mal die Vorlesungsunterlagen, die
  Sekundärliteratur und die API bemühen!
  */
  private int bestand[anzahlWaren];
  //Aktueller Bestand eines Lagers in Form eines Arrays.
  //bestand [i][j] var i=> enum(Warennamen) var j=Bestand der jeweiligen Ware
  
  public int getlagerMengeMin(){
    return lagerMengeMin;
  }
  
  
  public int getlagerMengeMax(){
    return lagerMengeMax;
  }
  
  public int getBestand(){
    return lagerMengeMin;
  }
  
  /** kann die pruefeFunkition, oder Teile davon ausgelagert werden? -> Modularer?
   * 
   * @param zugang
   * @param warenIndex
   * @param warenMenge
   * @throws LagerException 
   */
  public void pruefeMenge(short zugang,short warenIndex,int warenMenge) throws LagerException{
  int referenz = 0;
    if (warenMenge < 0){
        throw new LagerExecption("Fehler: Zu buchende Warenmenge negativ!");
      }
    
    if (warenMenge < 0 || warenMenge > anzahlWaren){
        throw new LagerExecption("Fehler: Warenindex falsch gewaehlt!");
      }
    
    if (zugang = 1) {
      referenz = bestand[warenIndex];
      refrerenz + = warenmenge;
      if(referenz > lagerMengeMax) {
        throw new LagerExecption("Der Lagerbestand an "+Waren.warenIndex+ "ist voll!");
      }
    }
    
    if (zugang = 0) {
      referenz = bestand[warenIndex];
      refrerenz -= warenmenge;
      if(referenz < lagerMengeMin) {
        throw new LagerExecption("Nicht genug "+Waren.warenIndex+ " vorraetig!");
      }
    else {
      throw new LagerException("Keine Buchung moeglich, pruefe versagt bei Identifikation.");
    }
  }
  
  public int bucheBestand(short zugang, short warenIndex, int warenMenge) throws LagerException{
    //Short Zugang=1 -> Zubuchen
    if (zugang = 1){ 
      pruefeMenge( zugang,  warenindex,  warenMenge);
      bestand[warenIndex] += warenMenge;
    }
    //Short Zugang=0 -> Abbuchen
    if (zugang = 0){ 
      pruefeMenge(zugang,  warenindex, intwarenMenge);
      bestand[warenIndex] -= warenMenge;
    }
    else {
      throw new LagerException("Keine Buchung moeglich, pruefe versagt bei bucheBestand.");
    } 
}
    //Lagerexception anlegen
