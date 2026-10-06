class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int max=0;
        int curr=-1;

        for (int i=0;i<=heights.length;i++){
            if (i==heights.length) curr=0;
            else curr=heights[i];

            while (!st.isEmpty() && curr<heights[st.peek()]){
                int len=heights[st.pop()];
                int width;
                if (!st.isEmpty()){
                    width=i-st.peek()-1;
                }else{
                    width=i;
                }

                int area=len*width;
                max=Math.max(max,area);
            }

            st.push(i);
        }

        return max;
    }
}