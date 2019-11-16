package problem;

/**
 * @author linda
 * @create 2019-11-16-16:26
 **/
class Q11 {

    /**
     * 最佳题解：
     * https://www.cnblogs.com/Xieyang-blog/p/8232749.html
     * 从两边的木板向中间同时移动，取两条木板面积，与一个temp值相比较，比temp大则temp等于这个体积
     * 精髓在于：假设已知一木板X已经比对面的木板Y要长，那么根据短板效应（底面积不变大时，容器盛水容量取决于短板长度），
     * 不管怎么继续往前移动（缩小底面积）此X木板，得到的结果也不会比刚才X与Y组合的结果更大。
     * 因此，从两边取两条木板时，只需要移动相对短的直线的那一边的指针即可达到寻找最大面积的效果
     */
    int maxArea(int[] height) {
        int maxArea = 0;
        int l = 0, r = height.length - 1;
        while (l < r) {
            maxArea = Math.max(maxArea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }

    /**
     * My
     * O(n^2)
     * a[i][j] = (j-i) * min(a[i],a[j])
     */
    int maxArea1(int[] height) {
        int result = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int high = (j - i) * Math.min(height[i], height[j]);
                result = Math.max(result, high);
            }
        }
        return result;
    }
}
