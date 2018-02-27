package suanfa;

import java.util.Arrays;

/**
 * Created by liudap on 2018/2/5.
 */
public class SortArray {



    public static void sort(int[] array){

        int length = array.length;
        for (int i = 0; i < length-1; i++) {
            int min = i;
            for (int j = i+1; j < length; j++) {
                if(array[j]<array[min]){
                    min = j;
                }
            }
            if(i != min){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }

        }
        System.out.println(array);
    }


    public static void main(String[] args) {


        int arr[] = {19,56,4,79,2,5,100,58,1,65};
//        SortArray.mysort(arr);


         SortArray.sort(arr, 0, arr.length - 1, (int[])null, 0, 0);
        System.out.println(arr);
        String  str = "111";
        aa(str);
        System.out.println(str);

    }



    public static void aa(String str){
        str = "dasdas";
    }


    static void sort(int[] var0, int var1, int var2, int[] var3, int var4, int var5) {
        if(var2 - var1 < 286) {
            sort(var0, var1, var2, true);
        } else {
            int[] var6 = new int[68];
            int var7 = 0;
            var6[0] = var1;

            int var9;
            int var10;
            int var11;
            for(int var8 = var1; var8 < var2; var6[var7] = var8) {
                if(var0[var8] < var0[var8 + 1]) {
                    do {
                        ++var8;
                    } while(var8 <= var2 && var0[var8 - 1] <= var0[var8]);
                } else if(var0[var8] <= var0[var8 + 1]) {
                    var9 = 33;

                    while(true) {
                        ++var8;
                        if(var8 > var2 || var0[var8 - 1] != var0[var8]) {
                            break;
                        }

                        --var9;
                        if(var9 == 0) {
                            sort(var0, var1, var2, true);
                            return;
                        }
                    }
                } else {
                    do {
                        ++var8;
                    } while(var8 <= var2 && var0[var8 - 1] >= var0[var8]);

                    var9 = var6[var7] - 1;
                    var10 = var8;

                    while(true) {
                        ++var9;
                        --var10;
                        if(var9 >= var10) {
                            break;
                        }

                        var11 = var0[var9];
                        var0[var9] = var0[var10];
                        var0[var10] = var11;
                    }
                }

                ++var7;
                if(var7 == 67) {
                    sort(var0, var1, var2, true);
                    return;
                }
            }

            if(var6[var7] == var2++) {
                ++var7;
                var6[var7] = var2;
            } else if(var7 == 1) {
                return;
            }

            byte var20 = 0;

            for(var9 = 1; (var9 <<= 1) < var7; var20 = (byte)(var20 ^ 1)) {
                ;
            }

            int var12 = var2 - var1;
            if(var3 == null || var5 < var12 || var4 + var12 > var3.length) {
                var3 = new int[var12];
                var4 = 0;
            }

            int[] var21;
            if(var20 == 0) {
                System.arraycopy(var0, var1, var3, var4, var12);
                var21 = var0;
                var11 = 0;
                var0 = var3;
                var10 = var4 - var1;
            } else {
                var21 = var3;
                var10 = 0;
                var11 = var4 - var1;
            }

            while(var7 > 1) {
                int var13 = 0;

                int var14;
                int var15;
                for(var14 = 0 + 2; var14 <= var7; var14 += 2) {
                    var15 = var6[var14];
                    int var16 = var6[var14 - 1];
                    int var17 = var6[var14 - 2];
                    int var18 = var17;

                    for(int var19 = var16; var17 < var15; ++var17) {
                        if(var19 >= var15 || var18 < var16 && var0[var18 + var10] <= var0[var19 + var10]) {
                            var21[var17 + var11] = var0[var18++ + var10];
                        } else {
                            var21[var17 + var11] = var0[var19++ + var10];
                        }
                    }

                    ++var13;
                    var6[var13] = var15;
                }

                if((var7 & 1) != 0) {
                    var14 = var2;
                    var15 = var6[var7 - 1];

                    while(true) {
                        --var14;
                        if(var14 < var15) {
                            ++var13;
                            var6[var13] = var2;
                            break;
                        }

                        var21[var14 + var11] = var0[var14 + var10];
                    }
                }

                int[] var22 = var0;
                var0 = var21;
                var21 = var22;
                var15 = var10;
                var10 = var11;
                var11 = var15;
                var7 = var13;
            }

        }
    }

    private static void sort(int[] var0, int var1, int var2, boolean var3) {
        int var4 = var2 - var1 + 1;
        int var5;
        int var6;
        int var7;
        if(var4 < 47) {
            if(var3) {
                var5 = var1;

                for(var6 = var1; var5 < var2; var6 = var5) {
                    var7 = var0[var5 + 1];
                    System.out.println(Arrays.toString(var0));
                    while(var7 < var0[var6]) {
                        var0[var6 + 1] = var0[var6];
                        if(var6-- == var1) {
                            break;
                        }
                    }

                    var0[var6 + 1] = var7;
                    ++var5;
                }

            } else {
                do {
                    if(var1 >= var2) {
                        return;
                    }

                    ++var1;
                } while(var0[var1] >= var0[var1 - 1]);

                var5 = var1;

                label140:
                while(true) {
                    ++var1;
                    if(var1 > var2) {
                        var5 = var0[var2];

                        while(true) {
                            --var2;
                            if(var5 >= var0[var2]) {
                                var0[var2 + 1] = var5;
                                return;
                            }

                            var0[var2 + 1] = var0[var2];
                        }
                    }

                    var6 = var0[var5];
                    var7 = var0[var1];
                    if(var6 < var7) {
                        var7 = var6;
                        var6 = var0[var1];
                    }

                    while(true) {
                        --var5;
                        if(var6 >= var0[var5]) {
                            ++var5;
                            var0[var5 + 1] = var6;

                            while(true) {
                                --var5;
                                if(var7 >= var0[var5]) {
                                    var0[var5 + 1] = var7;
                                    ++var1;
                                    var5 = var1;
                                    continue label140;
                                }

                                var0[var5 + 1] = var0[var5];
                            }
                        }

                        var0[var5 + 2] = var0[var5];
                    }
                }
            }
        } else {
            var5 = (var4 >> 3) + (var4 >> 6) + 1;
            var6 = var1 + var2 >>> 1;
            var7 = var6 - var5;
            int var8 = var7 - var5;
            int var9 = var6 + var5;
            int var10 = var9 + var5;
            int var11;
            if(var0[var7] < var0[var8]) {
                var11 = var0[var7];
                var0[var7] = var0[var8];
                var0[var8] = var11;
            }

            if(var0[var6] < var0[var7]) {
                var11 = var0[var6];
                var0[var6] = var0[var7];
                var0[var7] = var11;
                if(var11 < var0[var8]) {
                    var0[var7] = var0[var8];
                    var0[var8] = var11;
                }
            }

            if(var0[var9] < var0[var6]) {
                var11 = var0[var9];
                var0[var9] = var0[var6];
                var0[var6] = var11;
                if(var11 < var0[var7]) {
                    var0[var6] = var0[var7];
                    var0[var7] = var11;
                    if(var11 < var0[var8]) {
                        var0[var7] = var0[var8];
                        var0[var8] = var11;
                    }
                }
            }

            if(var0[var10] < var0[var9]) {
                var11 = var0[var10];
                var0[var10] = var0[var9];
                var0[var9] = var11;
                if(var11 < var0[var6]) {
                    var0[var9] = var0[var6];
                    var0[var6] = var11;
                    if(var11 < var0[var7]) {
                        var0[var6] = var0[var7];
                        var0[var7] = var11;
                        if(var11 < var0[var8]) {
                            var0[var7] = var0[var8];
                            var0[var8] = var11;
                        }
                    }
                }
            }

            var11 = var1;
            int var12 = var2;
            int var13;
            int var14;
            int var15;
            if(var0[var8] != var0[var7] && var0[var7] != var0[var6] && var0[var6] != var0[var9] && var0[var9] != var0[var10]) {
                var13 = var0[var7];
                var14 = var0[var9];
                var0[var7] = var0[var1];
                var0[var9] = var0[var2];

                while(true) {
                    ++var11;
                    if(var0[var11] >= var13) {
                        do {
                            --var12;
                        } while(var0[var12] > var14);

                        var15 = var11 - 1;

                        int var16;
                        label229:
                        while(true) {
                            while(true) {
                                ++var15;
                                if(var15 > var12) {
                                    break label229;
                                }

                                var16 = var0[var15];
                                if(var16 < var13) {
                                    var0[var15] = var0[var11];
                                    var0[var11] = var16;
                                    ++var11;
                                } else if(var16 > var14) {
                                    while(var0[var12] > var14) {
                                        if(var12-- == var15) {
                                            break label229;
                                        }
                                    }

                                    if(var0[var12] < var13) {
                                        var0[var15] = var0[var11];
                                        var0[var11] = var0[var12];
                                        ++var11;
                                    } else {
                                        var0[var15] = var0[var12];
                                    }

                                    var0[var12] = var16;
                                    --var12;
                                }
                            }
                        }

                        var0[var1] = var0[var11 - 1];
                        var0[var11 - 1] = var13;
                        var0[var2] = var0[var12 + 1];
                        var0[var12 + 1] = var14;
                        sort(var0, var1, var11 - 2, var3);
                        sort(var0, var12 + 2, var2, false);
                        if(var11 < var8 && var10 < var12) {
                            while(var0[var11] == var13) {
                                ++var11;
                            }

                            while(var0[var12] == var14) {
                                --var12;
                            }

                            var15 = var11 - 1;

                            label199:
                            while(true) {
                                while(true) {
                                    ++var15;
                                    if(var15 > var12) {
                                        break label199;
                                    }

                                    var16 = var0[var15];
                                    if(var16 == var13) {
                                        var0[var15] = var0[var11];
                                        var0[var11] = var16;
                                        ++var11;
                                    } else if(var16 == var14) {
                                        while(var0[var12] == var14) {
                                            if(var12-- == var15) {
                                                break label199;
                                            }
                                        }

                                        if(var0[var12] == var13) {
                                            var0[var15] = var0[var11];
                                            var0[var11] = var13;
                                            ++var11;
                                        } else {
                                            var0[var15] = var0[var12];
                                        }

                                        var0[var12] = var16;
                                        --var12;
                                    }
                                }
                            }
                        }

                        sort(var0, var11, var12, false);
                        break;
                    }
                }
            } else {
                var13 = var0[var6];

                for(var14 = var1; var14 <= var12; ++var14) {
                    if(var0[var14] != var13) {
                        var15 = var0[var14];
                        if(var15 < var13) {
                            var0[var14] = var0[var11];
                            var0[var11] = var15;
                            ++var11;
                        } else {
                            while(var0[var12] > var13) {
                                --var12;
                            }

                            if(var0[var12] < var13) {
                                var0[var14] = var0[var11];
                                var0[var11] = var0[var12];
                                ++var11;
                            } else {
                                var0[var14] = var13;
                            }

                            var0[var12] = var15;
                            --var12;
                        }
                    }
                }

                sort(var0, var1, var11 - 1, var3);
                sort(var0, var12 + 1, var2, false);
            }

        }
    }




    public static void mysort(int[] array){
        int length = array.length;
        for (int i = 0; i < length-1; i++) {
            int min = i;
            for (int j = i+1; j <length ; j++) {
                if(array[j] < array[min])
                    min = j;
            }
            if(i != min){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        System.out.println(array);
    }




}
