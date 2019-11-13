package dssc.roman;

public class RomanNumeral {
    private int decimal;

    public RomanNumeral(int decimal) {
        this.decimal = decimal;
    }



    public String onetwoThree(int decimal){
        return "I".repeat(decimal);
    }


    @Override
    public String toString() {

        int [] baseNumbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String [] baseRomans = {"M", "CM", "D", "CD", "C", "XC", "L","XL","X","IX","V","IV","I"};

        int i = 0;
        String result = new String();

        while(this.decimal != 0){
            while(this.decimal/ baseNumbers[i] != 0) {
                result += baseRomans[i];
                this.decimal -= baseNumbers[i];
            }
            i++;
        }
        /**
        if (this.decimal < 4) {
            return onetwoThree(decimal);
        } else if (this.decimal == 4){
            return "IV";
        } else if (this.decimal == 5){
            return "V";
        } else {
            return "V".concat(onetwoThree(this.decimal - 5));
        }
*/
        return result;
    }
}
