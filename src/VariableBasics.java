public class VariableBasics     {
String empty=("");

void main(){

    //opgave 1
    System.out.println("Opgave 1: Shopping cart");
double item0Cost=(25.50);
double item1Cost=(15.00);
double item2Cost=(30.00);

double itemsTotalCost=(item0Cost+item1Cost+item2Cost);
    System.out.println("Samlet pris "+itemsTotalCost);

double vatPercent=(25.0);
double totalCostWithVat=(itemsTotalCost*((vatPercent/100)+1));
    System.out.println("Samlet pris med moms "+totalCostWithVat);
    System.out.println(empty);

    //opgave 2
    System.out.println("Opgave 2: Split restaurant bill");


double food=(450.0);
double drink=(120.0);
double tip=(50.0);
int guests=(4);

double checkTotal=(food+drink+tip);
double totalPerGuest=(checkTotal/guests);

    System.out.println("Pris pr. person "+totalPerGuest);

    System.out.println(empty);

    //Opgave 3
    System.out.println("Opgave 3: Discount calculation");

double originalPrice=(300.0);
double discountPercent=(20.0);
    //Moms alleredet erklæret i tidligere opg.

double priceWithDiscount=(300*(1-(discountPercent/100)));
double finalPriceVat=(priceWithDiscount*((vatPercent/100)+1));
    System.out.println("Oprindelig pris: "+originalPrice);
    System.out.println("Pris med rabat: "+priceWithDiscount);
    System.out.println("Endelig pris: "+finalPriceVat);
    System.out.println(empty);

    //opgave 4

    System.out.println("Opgave 4");

int partyGuests=(15);
int cupCakes=(40);
String cupcakesForEach=("Each guest gets "+(cupCakes/partyGuests)+" cupcakes");
    System.out.println(cupcakesForEach);

int cupCakesLeftover=(cupCakes%partyGuests);
    System.out.println("Cupcakes leftover: "+cupCakesLeftover);

        System.out.println(empty);

    //Opgave 5
    System.out.println("Opgave 5");

StringBuilder sb1= new StringBuilder();

String name= "Anna";
int age=(25);
sb1.append("Hello, ");
sb1.append(name);
sb1.append("! ");
sb1.append("You are ");
sb1.append(age);
sb1.append(" years old.");
    System.out.print(sb1.toString());

    //Opgave 6
    System.out.println("Opgave 6");




}


}