package String_SkillAssessment;
//Write a java program that demonstrates the performance difference between String concatenation, StringBuilder, and StringBuffer for multiple string operations.
//input: 1000 iterations
//output: String: 150ms, StringBuilder: 5ms, StringBuffer: 8ms
public class StringBuilder_StringBuffer {
    public static void main(String[] args) {
        int iterations = 1000;


        long startTime = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < iterations; i++) {
            s = s + "abc";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String: " + (endTime - startTime) + "ms");


        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("abc");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (endTime - startTime) + "ms");


        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append("abc");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (endTime - startTime) + "ms");
    }
}
