class Main{
    public static void main(String[] args){
        System.out.println("Starting project"); // 1 лаба
        // обьявление переменных
        // целочисенные
        byte variableByte; // -128 до 127, 1 байт
        short variableShort; // -32768 до 32767, 2 байта
        int variableInteger; // -2147483648 до 2147483647, 4 байта
        long variableLong; //  от -9223372036854775808 до 9223372036854775807, 8 байт

        // С плавающей точкой
        float variableFloat; // -3.4E+38 до 3.4E+38, 4 байта
        double variableDouble; // -1.7E+308 до 1.7E+308, 8 байт

        //Символьные
        char variableChar; // 0 до 65536,2 байта

        //Логические
        boolean variableBoolean; // true/false, по разному упокавывается виртуалкой(но по факту достаточно одного 1 бита)

        variableByte = 120;
        variableShort = 129;
        variableChar = 'a';
        variableInteger = 65999;
        variableLong = 4294967296L; // добавить L чтобы привести к long
        variableFloat = 0.33333334f; // добавить f чтобы привести к float
        variableDouble = 0.3333333333333333;
        variableBoolean = true;

        System.out.println("This is a byte: "+variableByte);
        System.out.println("This is a short: "+variableShort);
        System.out.println("This is a int: "+variableInteger);
        System.out.println("This is a long: "+variableLong);
        System.out.println("This is a float: "+variableFloat);
        System.out.println("This is a double: "+variableDouble);
        System.out.println("This is a char: "+variableChar);
        System.out.println("This is a boolean: "+variableBoolean);

        for (char i='a';i<='z';i++){ // цикл чтобы вывести алфавит
            System.out.println(i);
        }

        long begin = new java.util.Date().getTime(); // перед циклом
        int i = 0;
        for (int j=0;j<100000000;j++){
            i++;
        }
        long end = new java.util.Date().getTime(); //после цикла

        System.out.println(end-begin);// примерное время выполнения программы
        long integerTime = end-begin;

        begin = new java.util.Date().getTime();
        long f = 0;
        for (int j=0;j<100000000;j++){
            f++;
        }
        end = new java.util.Date().getTime();

        System.out.println(end-begin); // примерное время выполнение с лонг

        long longTime = end-begin;

        System.out.println(longTime-integerTime); // разница в выполнении лонг и инт


        int[] mas = {12,43,12,-65,778,123,32,76};
        int max = Integer.MIN_VALUE;
        for (i=0;i< mas.length;i++){
            if (mas[i]>max)
                max = mas[i];
        }

        System.out.println("Максимум из массива: " +max);

        int[][] matrix = new int[3][3];
        for (int c=0;c<matrix.length;c++){
            for (int j=0;j<matrix[c].length;j++){
                matrix [c][j] = (int)Math.round(Math.random()*10);
                System.out.print(matrix[c][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Транспорнированая");
        System.out.println();

        int[][] transpornedMatrix = new int[matrix.length][matrix[0].length];
        for (int c=0;c<transpornedMatrix.length;c++){
            for (int j=0;j<transpornedMatrix[c].length;j++){
                transpornedMatrix[j][c] = matrix[c][j];
                System.out.print(matrix[j][c] + " ");
            }
            System.out.println();
        }
    }
}