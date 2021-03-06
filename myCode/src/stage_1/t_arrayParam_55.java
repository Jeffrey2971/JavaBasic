package stage_1;

/*
数组可作为方法的参数。
当调用方法的时候，向方法的小括号进行传参，传递进去的其实是数组的地址值

 */
public class t_arrayParam_55 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println(array); // 地址值
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            printArray(array); // 传递进去的就是array当中的地址值
            System.out.println("=========AAA=========");
            printArray(array);
            System.out.println("=========BBB=========");
        }

    }

    /*
    三要素
    返回值类型：只是进行打印而已，不需要进行计算，也没有结果，用void
    方法名称：printArray
    参数列表：必须给数组才能打印数组，int [] array
     */


    public static void printArray(int[] array) {
        System.out.println("printArray收到的地址值为" + array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
