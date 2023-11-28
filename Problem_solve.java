class Number_exception extends Exception{
    public String toString(){
        return "invalid input";
    }
}
class Divide_zero extends Exception{
    public String toString(){
        return "sorry you can divided by zero...!!!";
    }
}
class Max_input extends Exception{
    public String toString(){
        return "you can enter maximum values ..!!!";
    }
}class Multiplier extends Exception{
    public String toString(){
        return "you can enter wrong number..!!!";
    }
}
class numberAri{
    public int sum(int a,int b)throws Number_exception{
        if (a == 8 || b==9){
            throw new Number_exception();
        }
        return a+b;
    }public int sub(int a,int b)throws Max_input{
        if (a>10000 && b>10000){
            throw new Max_input();
        }
        return a-b;
    }public int mul(int a,int b)throws Multiplier{
        if (a>7000 && b>7000){
            throw  new Multiplier();
        }
        return a*b;
    }public int div(int a,int b)throws Divide_zero {
        if (b == 0){
            throw new Divide_zero();
        }
        return a/b;
    }
}
public class Problem_solve {
//    public static void main(String[] args)throws Number_exception,Divide_zero,Max_input,Multiplier{
    /*two tricks to show the custom exception first all exception defined in main function
    and second is declare in separately in which catch blocks
    */
    public static void main(String[] args){
        try {
            numberAri a1 = new numberAri();
            a1.sum(45, 65);
            a1.div(4, 0);
            a1.sub(54, 30);
            a1.mul(20, 30);
            /*
            there are two types to declare in catch
            catch(Number_exception | Divide_zero | Max_input | Multiplier e)
             */
        }catch(Number_exception e){
            System.out.println(e);
        }catch (Divide_zero e){
            System.out.println(e);
        }catch (Max_input e){
            System.out.println(e);
        }catch (Multiplier e){
            System.out.println(e);
        }
    }
}
