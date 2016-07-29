
public class Calculator {
    /**
     * Результат вычисления
     * 
     */
    private int result;
    /**
     * Суммруем результаты
     * @param params Аргумеенты суммирования. 
     */    
    public void add(int ... params){
        for (Integer param : params){
            this.result += param;
        }
    }
    public void sub(int ... params){
        for (Integer param : params){
            this.result -= param;
        }
    }
    public void mult(int ... params){
        for (Integer param : params){
            this.result *= param;
        }
    }
    public void div(int ... params){
        for (Integer param : params){
            this.result /= param;
        }
    }
    
    
    
    
     /**
     * Получить результат
     @return результат вычисления
     */
    public int getResult(){
        return this.result;
        }
    /**
     * Очистить результат вычисления.
     */ 
    public void cleanResult(){
        this.result = 0;
        }
}
/**System.out.println("Calculate...");
        Double first = Double.valueOf(arg[0]);
        Double second = Double.valueOf(arg[1]);
        Double summ = first + second;
        Double sub = first - second;
        Double div = first / second;
        Double mult = first * second;
        Double pow = Math.pow(first, second);
        System.out.println("Summ = "+summ);
        System.out.println("Subscription = "+sub);
        System.out.println("div = "+div);
        System.out.println("Mult = "+mult);
        System.out.println("Rait = "+pow);
*/