import org.junit.Assert;
import org.junit.Test;

public class RomanNumbersTest {

    // I
    // II
    // III
    // IV
    // V
    // IX
    // X
    // L
    // C
    // D
    // M
    // MMXIV

    @Test
    public void convertir1() {
        String result = RomanNumbers.convert(1);
        Assert.assertEquals("I", result);
    }

    @Test
    public void convertir2() {
        String result = RomanNumbers.convert(2);
        Assert.assertEquals("II", result);
    }

    @Test
    public void convertir4() {
        String result = RomanNumbers.convert(4);
        Assert.assertEquals("IV", result);
    }

    @Test
    public void convertir5() {
        String result = RomanNumbers.convert(5);
        Assert.assertEquals("V", result);
    }

    @Test
    public void convertir6() {
        String result = RomanNumbers.convert(6);
        Assert.assertEquals("VI", result);
    }

    @Test
    public void convertir9() {
        String result = RomanNumbers.convert(9);
        Assert.assertEquals("IX", result);
    }

    @Test
    public void convertir10() {
        String result = RomanNumbers.convert(10);
        Assert.assertEquals("X", result);
    }

    @Test
    public void convertir40() {
        String result = RomanNumbers.convert(40);
        Assert.assertEquals("XL", result);
    }

    @Test
    public void convertir48() {
        String result = RomanNumbers.convert(48);
        Assert.assertEquals("XLVIII", result);
    }

    @Test
    public void convertir2008() {
        String result = RomanNumbers.convert(2008);
        Assert.assertEquals("MMVIII", result);
    }

    @Test
    public void convertir1259() {
        String result = RomanNumbers.convert(1259);
        Assert.assertEquals("MCCLIX", result);
    }

    @Test
    public void convertir3999() {
        String result = RomanNumbers.convert(3999);
        Assert.assertEquals("MMMCMXCIX", result);
    }

    @Test
    public void getRomanWhenValue1() {
        RomanNumbers.RomanNumber result = RomanNumbers.RomanNumber.getByValue(1);
        Assert.assertEquals("I", result.name());
    }

}
