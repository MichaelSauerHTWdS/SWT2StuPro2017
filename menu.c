#include <stdio.h>
#include "scanflib.h"

#define ITEM_HILFE  0
#define ITEM_KOM1   1
#define ITEM_KOM2   2
#define ITEM_KOM3   3
#define ITEM_ENDE   4
#define TIWINTER    5



char * komMenu[]={"\n 0\tHilfetext\n",
                  " 1\t1.Kommando\n",
                  " 2\t2.Kommando\n",
                  " 3\t3.Kommando\n",
                  " 4\t4.Ende\n",
                  " 5\a\tTIWINTER\n"};
int steuerMenu(void);

int main(int argc, char* argv[])
  {
  return steuerMenu();
  }  
				  
int steuerMenu()
  {
  int kommando = 1;

  do{ 
    for (int i=0; i<(sizeof(komMenu)/sizeof(char *)); i++)
      {
      printf("%s",komMenu[i]);
      }
    printf("$:");
	if (readInteger(&kommando)!=NO_ERROR)
	  {
	  printf("keine Zahl");
	  }
// Hauptsache iwas gemacht! ;)
    
    switch (kommando)
      {
      case  ITEM_HILFE:  printf("%s",komMenu[ITEM_HILFE]);
                         break;
      case  ITEM_KOM1:   printf("%s",komMenu[ITEM_KOM1]);
                         break;
      case  ITEM_KOM2:   printf("%s",komMenu[ITEM_KOM2]);
                         break;
      case  ITEM_KOM3:   printf("%s",komMenu[ITEM_KOM3]);
                         break;                   
      case  ITEM_ENDE:   printf("%s",komMenu[ITEM_ENDE]);
                         break;
      case  TIWINTER:    printf("%s",komMenu[TIWINTER]);
                         break; 
      default: printf("\nkein Kommando\n");
      }
    }while(kommando!=ITEM_ENDE);
   
    return(0);
  }
