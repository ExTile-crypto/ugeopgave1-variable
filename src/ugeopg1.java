public class ugeopg1 {
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
    System.out.print(sb1);
    System.out.println(empty);

    //Opgave 6
    System.out.println("Opgave 6");
int score=(100);
    System.out.println(score);
score +=50;
    System.out.println(score);
score +=25;
    System.out.println(score);

        System.out.println(empty);

    //Opgave 7
    System.out.println("Opgave 7");

int health=(100);
    System.out.println(health);
health -=15;
    System.out.println(health);
health -=20;
    System.out.println(health);

        System.out.println(empty);

    //Opgave 8
    System.out.println("Opgave 8");


double price=(50.0);
    System.out.println(price);
price*=2;
    System.out.println(price);

        System.out.println(empty);

    //Opgave 9
    System.out.println("Opgave 9");

int counter=(10);
    System.out.println(counter);
counter ++;
    System.out.println(counter);
counter --;
    System.out.println(counter);

    System.out.println(empty);

    //Opgave 10
    System.out.println("Opgave 10");


int number=(10);
number +=5;
    System.out.println(number);
number -=3;
    System.out.println(number);
number ++;
    System.out.println(number);
number --;
    System.out.println(number);

//Opgave 11
String productName=("Laptop");
double itemCost=(7999.99);
boolean inStock=(true);
int numberInStock=(15);
double itemDiscount=(10.0);
String productCategory=("Electronics");

//Opgave 12
String studentName=("Anna");
int testPoints=(85);
int assignmentPoints=(92);
double avgGrade=((testPoints+assignmentPoints)/2);
boolean coursePassed=(true);

//Opgave 13

String guestName=("Peter Hansen");
int guestRoom=(204);
int guestStayingNights=(3);
double nightPrice=(899.00);
boolean breakfastIncluded=(true);
double guestTotalPrice=(2697.00);

//Opgave 14

int stepsToday=(8547);
int stepGoal=(10000);
double kmWalked=(6.2);
int caloriesBurned=(420);
boolean reachedGoal=(false);

//Opgave 15

String bookTitle;
String authorsName;
String bookISBN;
int pageCount;
boolean isAvailable; //if false > borrowed by. Else. True.
String borrowedBy;
String returnDate;
int lateFee;
boolean bestseller;
double bookRating;





}


}