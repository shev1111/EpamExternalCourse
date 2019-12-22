package task1.task12.controller;

public class PerfectNumbersGenerator {

    public static String getPerfectNumbers(long value){
        StringBuilder perfectNumbers = new StringBuilder();
        if(value>0)perfectNumbers.append("1");
        for (long perfectCandidate=1;perfectCandidate<=value;perfectCandidate++){

            long sum = 0;
            for(long index = 1 ; index < perfectCandidate ; index++) {
                if(perfectCandidate % index == 0)  {
                    sum = sum + index;
                }
            }
            if (sum == perfectCandidate) {
                perfectNumbers.append("; ");
                perfectNumbers.append(perfectCandidate);
            }
        }
        return perfectNumbers.toString();

    }
}
