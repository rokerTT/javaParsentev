
public class Calculator {
    /**
     * ��������� ����������
     * 
     */
    private double result;
    /**
     * �������� ����������
     * @param params ���������� ������������. 
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
     * �������� ���������
     * @return ��������� ����������
     */
    public double getResult(){
        return this.result;
    }
    /**
     * �������� ��������� ����������.
     */ 
    public void cleanResult(){
        this.result = 0;
        }
}