public class Constractor {

    int tyres;
    int headLight;
    public Constractor(){
        tyres = 2;
        headLight=1;
    }
    public Constractor(int y){
//       this.tyres=tyres;
        tyres =y;
    }
    public Constractor(int x,int n){
        tyres=x;
        headLight=n;
    }

    public static void main(String[] args) {
        Constractor bike =new Constractor();
        System.out.println("bike tyres "+bike.tyres);
        System.out.println("bike headlights "+bike.headLight);
        Constractor car =new Constractor(4,2);
        System.out.println("car tyres "+car.tyres);
        System.out.println("car headlights "+car.headLight);
        Constractor tampo =new Constractor(3,1);
        System.out.println("tampo tyres "+tampo.tyres);
        System.out.println("tampo headlights "+tampo.headLight);
    }
}
