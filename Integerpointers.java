public class Integerpointers 
{

    public static void main(String[] args)
    {
        PInteger myNum = new PInteger(5);
        PInteger newNum = myNum;
        
        System.out.println(myNum.getValue() + " " + newNum.getValue());
        
        modifyNum(newNum);
        
        System.out.println(myNum.getValue() + " " + newNum.getValue());
    }

    public static void modifyNum(PInteger num)
    {
        num.setValue(6);
    }
}
