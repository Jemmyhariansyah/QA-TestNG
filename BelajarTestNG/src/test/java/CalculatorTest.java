import app.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test(priority = 0)
    public void TestPenjumlahan(){
       float hasil = calculator.Penjumlahan(10, 5 );
        System.out.println(hasil);
        Assert.assertEquals(hasil,15);
    }
    @Test(priority = 1)
    public void TestPengurangan(){
        float hasil = calculator.Pengurangan(10, 5 );
        System.out.println(hasil);
        Assert.assertEquals(hasil,5);
    }
    @Test(priority = 2)
    public void TestPerkalian(){
        float hasil = calculator.Perkalian(10, 5 );
        System.out.println(hasil);
        Assert.assertEquals(hasil,50);
    }
    @Test(priority = 3)
    public void TestPembagian(){
        float hasil = calculator.Pembagian(10, 5 );
        System.out.println(hasil);
        Assert.assertEquals(hasil,2);
    }
}
