public class PassByVal {

    int num;

    public PassByVal(){
        this.num=0;
    }
    public PassByVal(int x){
        this.num=x;
    }

    public static void updateVal(PassByVal obj){
        obj = new PassByVal();
        obj.num = 20;
    }

    public static void main(String[] args) {

        PassByVal v1 = new PassByVal(50);

        updateVal(v1);

        System.out.println(v1.num);
    }

}
