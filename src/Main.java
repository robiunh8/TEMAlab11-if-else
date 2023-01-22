import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
        System.out.println("Exercitiul 1");

        Calculator calcObjName= new Calculator();

        int a=2;
        int b=5;

        float plus=calcObjName.addition(a,b);
        System.out.println(plus);
        float minus=calcObjName.subtraction(a,b);
        System.out.println(minus);
        float ori=calcObjName.multiplication(a,b);
        System.out.println(ori);
        float linie=calcObjName.division(a,b);
        System.out.println(linie);

//
        System.out.println(" ");
        System.out.println("Exercitiul 3");

        LogicalOp numbercomp= new LogicalOp();

        int firstnumber= 10;
        int secondnumber= 24;
        int biggernumber= numbercomp.checkBiggerNumber(firstnumber,secondnumber);
        System.out.println(biggernumber+" is the biggest number");
//
        System.out.println(" ");
        System.out.println("Exercitiul 4");

        LogicalOp textcompareex4= new LogicalOp();
        String textinput1= "FastTrackIT";
        System.out.println(textcompareex4.textcompare(textinput1));

//
        System.out.println(" ");
        System.out.println("Exercitiul 5");

        LogicalOp textnumberComp= new LogicalOp();
        String textfast="FastTrackIT";
        int numberfast= 3;
        System.out.println(textnumberComp.textAndNumber(textfast, numberfast));

//
        System.out.println(" ");
        System.out.println("Exercitiul 6");

        LogicalOp exForForecast= new LogicalOp();
        int numberforEX6= 1;
        System.out.println(exForForecast.forecast(numberforEX6));

//
        System.out.println(" ");
        System.out.println("Exercitiul 7");

        LogicalOp numberequalornot= new LogicalOp();
        int numberinputex7= 2;
        System.out.println(numberequalornot.greaterorNot(numberinputex7));

//
        System.out.println(" ");
        System.out.println("Exercitiul 8");

        Scanner numberentered= new Scanner(System.in);
        int key= numberentered.nextInt();
        LogicalOp numberSWITCH = new LogicalOp();
        System.out.println(numberSWITCH.switchNumber(key));

//
        System.out.println(" ");
        System.out.println("Exercitiul 9");

        LogicalOp booleanEVEN= new LogicalOp();
        int evenornotnumber= 5;
        System.out.println(booleanEVEN.isNumberEven(evenornotnumber));

//
        System.out.println(" ");
        System.out.println("Exercitiul 10");

        LogicalOp ageofvote= new LogicalOp();
        int age=19;
        System.out.println(ageofvote.eligibilityToVote(age));

//
        System.out.println(" ");
        System.out.println("Exercitiul 10");

        LogicalOp numbershowgreatest= new LogicalOp();
        int numone   = 7413;
        int numtwo   = 5151;
        int numthree = 25631;
        System.out.println(numbershowgreatest.biggestNumber(numone,numtwo,numthree));



    }















////////////////////////////////////////////////////
}
///