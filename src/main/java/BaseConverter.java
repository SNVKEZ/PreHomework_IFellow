public class BaseConverter {

    int i;
    double grad;


    BaseConverter(int i, double grad){
        this.i=i;
        this.grad=grad;
    }

    public void convert(){
        switch (i){
            case 1:
                System.out.println((grad*9/5 + 32)); //++
                break;
            case 2:
                System.out.println(grad+ 273.15);//++
                break;
            case 3:
                System.out.println(grad*9/5 + 491.67);//--
                break;
            case 4:
                System.out.println((100-grad)*3/2);//--
                break;
            case 5:
                System.out.println(0.33*grad);//
                break;
            case 6:
                System.out.println(grad*4/5);//
                break;
            case 7:
                System.out.println(grad*21/40+7.5);//
                break;

        }
    }
}
