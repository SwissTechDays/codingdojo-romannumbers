public class RomanNumbers {

    public enum RomanNumber {
        M(1000), CM(900), D(500), CD(400), C(100), XC(90), L(50), XL(40), X(10), IX(9), V(5), IV(4), I(1);

        public final int value;

        private RomanNumber(int value) {
            this.value = value;
        }

        public static RomanNumber getByValue(int value) {
            for (RomanNumber romanNumber : RomanNumber.values()) {
                if (romanNumber.value == value) {
                    return romanNumber;
                }
            }
            return null;
        }
    }

    public static String convert(int num) {
        String res = "";
        int reste = num;
        int nbRec;

        for (RomanNumber current : RomanNumber.values()) {
            nbRec = reste / current.value;
            reste = reste % current.value;
            for (int i = 0; i < nbRec; i++) {
                res += current.name();
            }
        }

        return res;
    }

}
