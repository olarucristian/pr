import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.random.CorrelatedRandomVectorGenerator;
import org.apache.commons.math3.random.GaussianRandomGenerator;
import org.apache.commons.rng.UniformRandomProvider;
import org.apache.commons.rng.simple.RandomSource;



public class main {

    public static void main(String[] args) {

        Complex op1 = new Complex(2.0, 5.0);
        Complex op2 = new Complex(3.0, 1.0);

        Complex answer1 = op1.add(op2); //sum 2 complex nr.
        Complex answer2 = op2.subtract(op1); //sub 2 nr.

        Complex answer3 = op2.conjugate(); //conjugate

        System.out.printf("First nr. >> " + op1);
        System.out.println("Second nr. >> " + op2);
        System.out.println("Sum of the nr. are >> " + answer1);
        System.out.println("Substract >> " + answer2);
        System.out.println("Conjugate >> " + answer3);



    }
}
