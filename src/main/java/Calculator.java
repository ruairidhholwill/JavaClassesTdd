public class Calculator {

    private double num1;
    private double num2;

    public Calculator(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double addNumbers(){
        return (this.num1 + this.num2);
    }

    public double minusNumbers(){
        return (this.num1 - this.num2);
    }

    public double multiplyNumbers(){
        return (this.num1 * this.num2);
    }

    public double divideNumbers(){
        return (this.num1 / this.num2);
    }

}
