package main.entity;

public class Operation {

    public int id;
    public int num1;
    public int num2;
    public String operation;
    public String result;

    public Operation(int num1, int num2, String operation, String result) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
        this.result = result;
    }

    public Operation(int num1, int num2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", num1=" + num1 +
                ", num2=" + num2 +
                ", operation='" + operation + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
