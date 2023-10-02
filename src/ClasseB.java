public class ClasseB{
    private int b1;
    private float b2;

    public int getB1(){
        return b1;
    }
    public void setB1(int b1){
        this.b1 = b1;
    }
    public float getB2(){
        return b2;
    }
    public void setB2(float b2){
        this.b2 = b2;
    }

    public void mb1(){
        System.out.println(this.getClass().getSimpleName());
    }
    public void mb2(){
        System.out.println(this.getClass().getSimpleName());
    }
    public void mb3(){
        System.out.println(this.getClass().getSimpleName());
    }
}
