package mychatroom;

import org.junit.jupiter.api.Test;

/**
 * 功能：
 * 日期：2024/5/20 下午7:36
 */
public class uuid {
    @Test
    // 判断给定的 a, b, c 是否满足方程


    public  void ss() {
        long startTime = System.nanoTime(); // 记录开始时间

        for (int a = 0; a <= 9; ++a) {
            for (int b = 0; b <= 9; ++b) {
                int low = 0;
                int high = 9;
                while (low <= high) {
                    int mid = (low + high) / 2;
                    if (satisfiesEquation(a, b, mid)) {
                        System.out.println("a:" + a + ", b:" + b + ", c:" + mid);
                        break;
                    } else if (1081 * a - 91 * b - 101 * mid < 0) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }
        }

        long endTime = System.nanoTime(); // 记录结束时间
        long duration = (endTime - startTime) / 1000000; // 转换为毫秒
        System.out.println("Time taken: " + duration + " ms");
    }
    public static boolean satisfiesEquation(int a, int b, int c) {
        return 1081 * a - 91 * b - 101 * c == 0;
    }
}
