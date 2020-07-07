package stage_1;

/*
使用静态初始化数组的时候，格式还可省略
标准格式：
数据类型 [] 数组名称 = new 数据类型 [] {元素1，元素2，...}
省略个事：
数据类型 [] 数组名称 = {元素1，元素2，...}

注意事项：
1、静态初始化没有直接指出长度，但是仍然会自动推算得到长度。
2、静态初始化标准格式可以拆分成为两个步骤
3、动态初始化也可以拆分两个步骤
4、静态初始化一旦使用省略格式，就不能拆分成为两个步骤

使用建议：
如果不确定数组当中的具体内容，用动态初始化；否则，已经确定了具体内容，则使用静态初始化
 */
public class t_Array_41 {
    public static void main(String[] args) {

        // 省略格式静态初始化
        int[] arrayA = {10, 20, 30};

        // 静态初始化可拆分为两个步骤
        int[] arrayB;
        arrayB = new int[]{11, 21, 31};

        // 动态初始化也可以拆分为两个步骤
        int[] arrayC;
        arrayC = new int[5];

        // 静态初始化的省略格式，不能拆分成为两个步骤
        // int[] arrayD;
        // arrayD = {12, 22, 32};


    }
}
