package pl.coderslab.tydzień1.z6parametryzowanieTestów;

public class Numbers {
    static String checkParity(int num) {
        if (num==0) {
            return "zero";
        }
        if (num%2==0){
            return "even";
        }
return "odd";
    }
}
