
package example2;

public class SHA256 implements Algorithm {


    @Override
    public int method(int x, int z) {
        System.out.println("SHA256 min" );
        return x-z;
    }
}
