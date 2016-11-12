public class SumOperation extends BinaryOperation{
    
    public SumOperation(Expression value1, Expression value2){
        super(value1,value2);
    }
    
    protected double doCalculate(Expression expr1, Expression expr2){
        return expr1+expr2;
    }
}