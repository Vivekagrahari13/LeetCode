class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double av=0.0;
        for(int i=1;i<salary.length-1;i++)
        {
            av+=salary[i];
        }
        return av/(salary.length-2);
    }
}