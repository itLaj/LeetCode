class Solution {
    public boolean isMonotonic(int[] A) {
        return increase(A)||decrease(A);
    }

    public boolean increase(int[] A){
        boolean isM = true;
        for (int i = 1; i < A.length; i++) {
            if(A[i-1] > A[i]) {
                isM = false;
                break;}
        }
        return isM;
    }
    public boolean decrease(int[] A){
        boolean isM = true;
        for (int i = 1; i < A.length; i++) {
            if(A[i-1] < A[i]) {
                isM = false;
                break;}
        }
        return isM;
    }

    public static void main(String[] args) {
        int[] A = {1,2,6,5};
        System.out.println(new Solution().isMonotonic(A));
    }
}