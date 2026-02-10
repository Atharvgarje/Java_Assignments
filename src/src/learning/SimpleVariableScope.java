package src.learning;

public class SimpleVariableScope {

   
    int number = 10;

    public void showLocalVariable() {
        int number = 5;
        System.out.println("Local variable = " + number);
    }

    public void showInstanceVariable() {
        System.out.println("Instance variable = " + this.number);
    }

    public static void main(String[] args) {
        SimpleVariableScope obj = new SimpleVariableScope();

        obj.showLocalVariable();    
        obj.showInstanceVariable();
    }
}
