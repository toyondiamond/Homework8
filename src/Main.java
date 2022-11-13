public class Main {
    public static void main(String[] args) {
        //Массивы
        //1задача
        int [] arr = new int [3];
        arr [0] = 1;
        arr [1] = 2;
        arr [2] = 3;
        double [] weight = {1.57, 7.654, 9.986};
        int [] symbol = {45, 40};
        //2задача
        System.out.print(arr[0] + ", ");
        System.out.print(arr[1] + ", ");
        System.out.print(arr[2]);
        System.out.println();
        System.out.print(weight[0] + ", ");
        System.out.print(weight[1] + ", ");
        System.out.print(weight[2] );
        System.out.println();
        System.out.print(symbol[0] + ", ");
        System.out.print(symbol[1]);
        //3задача
        System.out.println();
        System.out.print(arr[2] + ", ");
        System.out.print(arr[1] + ", ");
        System.out.print(arr[0]);
        System.out.println();
        System.out.print(weight[2] + ", ");
        System.out.print(weight[1] + ", ");
        System.out.print(weight[0] );
        System.out.println();
        System.out.print(symbol[1] + ", ");
        System.out.print(symbol[0]);
        System.out.println();
        //4задача
        int [] home = new int [3];
        home [0] = 1;
        home [1] = 2;
        home [2] = 3;
        for (int i = 0; i < home.length; i++) {
            System.out.println(home[0]);
            System.out.println(home[1]);
            System.out.println(home[2]);
        }

    }

}