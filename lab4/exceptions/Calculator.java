package lab4.exceptions;

public class Calculator {
    private int divideBy(int nr) throws CheckedException {
        if(nr == 0){
            throw new CheckedException();
        }
        return 110/nr;
    }

    public int calculate(int number){
        int result=0;
        if(number == 3) {
            throw new UncheckedException();
        }

        try {
            result = divideBy(number) * 33;
        } catch (CheckedException e) {
            e.printStackTrace();
            result = 33;
        }

        return result;
    }
}