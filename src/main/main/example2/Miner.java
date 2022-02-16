

package example2;

public class Miner {

    private Algorithm algirithm;

//    IoC
    public Miner(Algorithm algirithm){
        this.algirithm = algirithm;
    }

    public int calculate(int i, int z){
        int x = algirithm.method(i,z);
        return x;
    }

}
