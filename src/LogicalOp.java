// ex 2
 public  class LogicalOp {
// ex 3
public int checkBiggerNumber(int firstnumber, int secondnumber){

        if (firstnumber > secondnumber) {
            return firstnumber;
        } else {
            return secondnumber;
        }
    }
// ex 4
    public String textcompare(String textinput1) {

        if (textinput1.equals("FastTrackIT")) {
            return "Learning text comparison";
        }
        return "Got to try some more";
    }
// ex 5
    public String textAndNumber (String textfast, int numbesrFast){

        if(textfast.equals("FastTrackIT") && numbesrFast <=3 ){
            return textfast+numbesrFast;
        }
        else if(!textfast.equals("FastTrackIT") && numbesrFast >= 4){
            return numbesrFast+textfast;
        }
        else
            return "No condition met";
    }
// ex 6
public String forecast(int numberinches){
        if(numberinches > 8 || numberinches == 6){
            return "The amount of snow this winter was: " + numberinches+ " cm";
        }
        else{
            return "The forecast snow is: " + numberinches+ " cm";
        }

    }
// ex 7
public String greaterorNot (int greatnumber){
    if(!((greatnumber) ==4) && greatnumber >3){
        return "The number is greater than 3 and not equal to 4";
    }
    else if(greatnumber==4){
        return "The number is equal to 4";
    }
    else if(greatnumber < 3){
        return "The number is lower than 3";
    }
    else return "no alternative available";
      }
// ex 8
    public int switchNumber(int key){
        switch(key) {
            case 0:
                System.out.println("The number is:" + key);
                break;
            case 1:
                System.out.println("The number is:" + key);
                break;
            case 2:
                System.out.println("The number is:" + key);
                break;
            case 3:
                System.out.println("The number is:" + key);
                break;
            case 4:
                System.out.println("The number is:" + key);
                break;
            case 5:
                System.out.println("The number is:" + key);
                break;
            case 6:
                System.out.println("The number is:" + key);
                break;
            case 7:
                System.out.println("The number is:" + key);
                break;
            case 8:
                System.out.println("The number is:" + key);
                break;
            case 9:
                System.out.println("The number is:" + key);
                break;
            default:
                System.out.println("invalid argument");
        }

        return key;
    }
// ex 9
public boolean isNumberEven(int isEVEN) {
    if (isEVEN % 2 == 0) {
        return true;
    } else {
        return false;
    }
}
// ex 10
public boolean eligibilityToVote (int timepspentonearth){
    if (timepspentonearth >= 18) {
        return true;
    } else {
        return false;
    }
}
// ex 11
public int biggestNumber(int numone, int numtwo, int numthree) {
    if (numone > numtwo && numone > numthree) {
        return numone;
    } else if (numtwo > numone && numtwo > numthree) {
        return numtwo;
    }
    return numthree;
}






}