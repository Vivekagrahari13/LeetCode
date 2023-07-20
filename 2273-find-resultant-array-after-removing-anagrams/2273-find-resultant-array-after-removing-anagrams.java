class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list=new ArrayList<>();
        String temp="";
        for(int i=0;i<words.length;i++)
        {
            String s=words[i];
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String curr = new String(c);
            if (!curr.equals(temp))
                list.add(s);
            temp = curr;
        }
        return list;
    }
}