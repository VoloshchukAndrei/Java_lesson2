public class sqlQuery {

    public static void main(String[] args) {

        StringBuilder request = new StringBuilder("select * from students where ");
        StringBuilder jsonString = new StringBuilder("\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"");

        int parametrA = jsonString.indexOf("\"name\":\"null\"");
        if (parametrA != -1)
        {
            StringBuilder s1 = new StringBuilder("\"name\":\"null\"");
            jsonString.delete(parametrA, parametrA + s1.length());
        }

        int parametrB = jsonString.lastIndexOf(", \"country\":\"null\"");
        if (parametrB != -1)
        {
            StringBuilder s2 = new StringBuilder(", \"country\":\"null\"");
            jsonString.delete(parametrB, parametrB + s2.length());
        }

        int parametrC = jsonString.lastIndexOf(", \"city\":\"null\"");
        if (parametrC != -1)
        {
            StringBuilder s3 = new StringBuilder(", \"city\":\"null\"");
            jsonString.delete(parametrC, parametrC + s3.length());
        }

        int parametrD = jsonString.lastIndexOf(", \"age\":\"null\"");
        if (parametrD != -1)
        {
            StringBuilder s4 = new StringBuilder(", \"age\":\"null\"");
            jsonString.delete(parametrD, parametrD + s4.length());
        }

        StringBuilder union = request.replace(request.length(), request.length(), jsonString.toString());
        StringBuilder unionString = new StringBuilder(union);
        String s1 = unionString.toString();
        String s2 = s1.replace("\"", "");
        String s3 = s2.replace(":", "=");
        System.out.println(s3);

    }

}
