
public class Calculator {
    /**
     * Результат вычисления
     * 
     */
    private double result;
    /**
     * Суммруем результаты
     * @param params Аргумеенты суммирования. 
     */
       
    public final void add(double ... params){
        for (double param : params){
            this.result += param;
        }
    }
    public final void sub(double ... params){
        for (double param : params){
            this.result -= param;
        }
    }
    
    public final void mult(final double param1, final double param2){
            this.result =  param1 *  param2;
    }
    public final void div(final double param1, final double param2){
            this.result = param1 / param2;
    }
     /**
     * Получить результат
     * @return результат вычисления
     */
    public double getResult(){
        return this.result;
    }
    /**
     * Очистить результат вычисления.
     */ 
    public void cleanResult(){
        this.result = 0;
        }
}