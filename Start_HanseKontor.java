public class HanseKontor{

  private boolean exit== FALSE;
  public static void main (Atring args[]) throws GameException {
  
  spielerAnlegen();
  spielerBegruessen();
  
  do{
    rundenbeginn();    
    zufallsgenerator();
    rundenAktionen();// Je Runde werden die Aktionenn gesammelt und auf einmal gebucht um Ressourcen zu sparen und allen Mitspielern gleiche Priese bieten zu können
  }(while exit!=TRUE);
  
  spielBeenden();// Variablen löschen, Speicher freigeben etc.
  
  }
}
  
  /*Aktionen die Stattfinden und sich wiederholen(*) 
  --- Trennlinie 
  . Unterpunkt
  
  
  * Spieler Anlegen 1-n
  . Schleife der Spielerabfrage
  .. Hafenzuweisung
  ---
  * Spielerbegrüssung
  . Tutorial?!?
  rundenbeginn() abhängig von bool begrüsst
  . Zufallsgenerator mit indivudueller Aktion (z.B. Unwetter)
  .. Nachrichtenhandler
  * Startmenue (wichtige Sprungmarke)
  . kaufen verkaufen handeln in allen Kontoren und Lagern beladen und entladen von Schiffen
  . Rundenende bis exit=true oder alle Spieler ausser einem Spieler bankrott
  ---
  Spielererfolge Auswertung()
  
  
  */
  

/* eigene Klasse Spieler
- String Spieler[fortlaufendeNummer, gleichzeitig Reihenfolge]
- String Spielerhafen [Starthafen, ggf. Hauptkontor]
- boolean Begrüsst (Indikator Spielbeginn Spieler)
- boolean bankrott
- Schiffliste
- Kontore mit individuellen Füllständen
- Kontostand
*/
