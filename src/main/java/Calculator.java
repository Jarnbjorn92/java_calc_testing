public class Calculator {

    private int num1;
    private int num2;
    private double newNum1;
    private double newNum2;
    private int equals;

    public Calculator(int num1, int num2, double newNum1, double newNum2){
        this.num1 = num1;
        this.num2 = num2;
        this.newNum1 = newNum1;
        this.newNum2 = newNum2;
    }

    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }


    public int getEquals() {
        return equals;
    }
    public int setEquals(int equals) {
        this.equals = equals;
        return equals;
    }

    public int add(){
        return setEquals(this.num1 + this.num2);
    }
    public int subtract() {
        return setEquals(this.num1 - this.num2);
    }
    public int multiply(){
        return setEquals(this.num1 * this.num2);
    }
    public double divide(){
        return setEquals((int) (this.newNum1 / this.newNum2));
    }

    public void setNewNum1(double newNum1) {
        this.newNum1 = newNum1;
    }

    public void setNewNum2(double newNum2) {
        this.newNum2 = newNum2;
    }
}
